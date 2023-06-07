import java.io.BufferedReader
import java.io.InputStreamReader

plugins {
    id("java-library")
    id("signing")
    id("maven-publish")
    id("com.google.protobuf") version "0.9.3"
}

dependencies {
    val protobufVersion: String by project

    api("com.google.protobuf:protobuf-java:$protobufVersion")
    api("com.google.protobuf:protobuf-java-util:$protobufVersion")
}

fun resolveCosmosSdkVersion(): String {
    val directory = File(rootProject.projectDir.parentFile, "/dependencies/cosmos-sdk")
    val process = ProcessBuilder("git", "describe", "--tags")
        .directory(directory)
        .start()
    val input = BufferedReader(InputStreamReader(process.inputStream))
    val noTimeout = process.waitFor(5, TimeUnit.SECONDS)
    if (!noTimeout || process.exitValue() != 0) {
        throw IllegalStateException("timeout or illegal exit value ${process.exitValue()}")
    }

    return input.use { it.readLine() }.removePrefix("v")
        .also { println("Resolved cosmos-sdk version : $it") }
}

allprojects {
    apply {
        plugin("java-library")
        plugin("com.google.protobuf")
        plugin("signing")
        plugin("maven-publish")
    }

    group = "kr.jadekim"
    version = resolveCosmosSdkVersion() + ".1"

    sourceSets {
        main {
            proto {
                val dependenciesDir = "${rootProject.rootDir.parent}/dependencies"
                srcDir("$dependenciesDir/google")
                srcDir("$dependenciesDir/gogoproto")
                srcDir("$dependenciesDir/cosmos-proto/proto")
                srcDir("$dependenciesDir/cosmos-sdk/proto")
            }

            java {
                setSrcDirs(srcDirs.filterNot { it.absolutePath.startsWith(buildDir.absolutePath + "/generated/source/proto") })
            }
        }
    }

    val copyTask = tasks.register<Copy>("moveProtoResults") {
        val generatedPath: String = project.findProperty("artifacts.generated")?.toString() ?: "generated/source/proto/main"
        val sourcePath: String = project.findProperty("artifacts.src")?.toString() ?: "src/main"

        from(File(buildDir, generatedPath))
        into(File(projectDir, sourcePath))
    }

    val cleanProtoTask = tasks.create("cleanProto") {
        val sourcePath: String = project.findProperty("artifacts.src")?.toString() ?: "src/main"

        group = "other"

        doLast {
            delete(File(projectDir, sourcePath))
        }
    }

    val cleanTask = tasks.getByName("clean") {
        finalizedBy(cleanProtoTask)
    }

    tasks.getByName("generateProto") {
        dependsOn(cleanTask)
        finalizedBy(copyTask)
    }

    repositories {
        mavenCentral()
        mavenLocal()
    }

    dependencies {
        compileOnly("javax.annotation:javax.annotation-api:1.3.2")
    }

    gradle.taskGraph.whenReady {
        allTasks.filter { it.name.contains("proto", true) }
            .forEach { it.outputs.upToDateWhen { false } }
    }

    publishing {
        repositories {
            val ossrhUsername: String by project
            val ossrhPassword: String by project

            if (version.toString().endsWith("-SNAPSHOT", true)) {
                maven {
                    name = "mavenCentralSnapshot"
                    setUrl("https://s01.oss.sonatype.org/content/repositories/snapshots/")
                    credentials {
                        username = ossrhUsername
                        password = ossrhPassword
                    }
                }
            } else {
                maven {
                    name = "mavenCentral"
                    setUrl("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
                    credentials {
                        username = ossrhUsername
                        password = ossrhPassword
                    }
                }
            }
        }
    }

    signing {
        sign(publishing.publications)
    }
}

configure(allprojects.filterNot { it.name.contains("kotlin") }) {
    java {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8

        withSourcesJar()
        withJavadocJar()
    }

    publishing {
        publications {
            create<MavenPublication>("artifacts") {
                groupId = project.group.toString()
                artifactId = project.name
                version = project.version.toString()

                from(components["java"])
            }
        }
    }
}

allprojects {
    publishing {
        publications.withType<MavenPublication> {
            pom {
                name.set(project.name)
                description.set("Cosmos Protobuf Builds")
                url.set("https://github.com/jdekim43/cosmos.proto")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("jdekim43")
                        name.set("Jade Kim")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/jdekim43/cosmos.proto.git")
                    developerConnection.set("scm:git:git://github.com/jdekim43/cosmos.proto.git")
                    url.set("https://github.com/jdekim43/cosmos.proto")
                }
            }
        }
    }
}
