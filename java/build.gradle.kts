plugins {
    id("java-library")
    id("signing")
    id("maven-publish")
    kotlin("jvm") version "1.8.20" apply false
    id("com.google.protobuf") version "0.9.2"
}

allprojects {
    apply {
        plugin("java-library")
        plugin("com.google.protobuf")
        plugin("signing")
        plugin("maven-publish")
    }

    group = "kr.jadekim"
    version = "0.47.1"

    sourceSets {
        main {
            proto {
                val dependenciesDir = "${rootProject.rootDir.parent}/dependencies"
                srcDir("$dependenciesDir/google")
                srcDir("$dependenciesDir/gogoproto")
                srcDir("$dependenciesDir/cosmos-proto/proto")
                srcDir("$dependenciesDir/cosmos-sdk/proto")
            }
        }
    }

    repositories {
        mavenCentral()
    }

    dependencies {
        compileOnly("javax.annotation:javax.annotation-api:1.3.2")
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8

        withSourcesJar()
        withJavadocJar()
    }

    gradle.taskGraph.whenReady {
        allTasks.filter { it.name.contains("proto", true) }
            .forEach { it.outputs.upToDateWhen { false } }
    }

    publishing {
        publications {
            create<MavenPublication>("lib") {
                groupId = project.group.toString()
                artifactId = project.name
                version = project.version.toString()

                from(components["java"])

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
        sign(publishing.publications["lib"])
    }
}

dependencies {
    val protobufVersion: String by project

    api("com.google.protobuf:protobuf-java:$protobufVersion")
    api("com.google.protobuf:protobuf-java-util:$protobufVersion")
}

tasks.create("cleanProto") {
    group = "other"

    doLast {
        delete("${project.projectDir.absolutePath}/src/main/java")
    }

    finalizedBy(tasks.getByName("clean"))
}