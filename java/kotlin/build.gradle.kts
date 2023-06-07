import com.google.protobuf.gradle.*

plugins {
    kotlin("multiplatform") version "1.8.20"
    kotlin("plugin.serialization") version "1.8.20"
    id("org.jetbrains.dokka") version "1.8.10" apply false
}

kotlin {
    jvm {
        jvmToolchain(8)
    }

    sourceSets {
        val commonMain by getting {
//            kotlin.srcDir(File(buildDir, "generated/source/proto/main/kotlin-kotlinx"))
//            kotlin.srcDir(File(buildDir, "generated/source/proto/main/kotlin-converter-multiplatform"))

            dependencies {
                val kotlinProtobufVersion: String by project
                val kotlinxSerializationVersion: String by project

                api("kr.jadekim:kotlin-protobuf:$kotlinProtobufVersion")
                api("kr.jadekim:kotlin-protobuf-kotlinx:$kotlinProtobufVersion")

                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$kotlinxSerializationVersion")
            }
        }

        val jvmMain by getting {
//            kotlin.srcDir(File(buildDir, "generated/source/proto/main/kotlin-converter-multiplatform-jvm"))

            dependencies {
                api(project(":"))
            }
        }
    }
}

protobuf {
    plugins {
        val kotlinProtobufVersion: String by project

        id("kotlin-kotlinx") {
            artifact = "kr.jadekim:kotlin-protobuf-generator-kotlinx:$kotlinProtobufVersion:jdk8@jar"
        }

        id("kotlin-converter-multiplatform") {
            artifact = "kr.jadekim:kotlin-protobuf-generator-converter-multiplatform:$kotlinProtobufVersion:jdk8@jar"
        }

        id("kotlin-converter-multiplatform-jvm") {
            artifact = "kr.jadekim:kotlin-protobuf-generator-converter-multiplatform-jvm:$kotlinProtobufVersion:jdk8@jar"
        }
    }

    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                remove(id = "java")
            }
            task.plugins {
                id("kotlin-kotlinx") {
                    outputSubDir = "commonMain"
                }
                id("kotlin-converter-multiplatform") {
                    outputSubDir = "commonMain"
                }
                id("kotlin-converter-multiplatform-jvm") {
                    outputSubDir = "jvmMain"
                }
            }
        }
    }
}

allprojects {
    apply {
        plugin("org.jetbrains.dokka")
    }

    val dokkaHtml by tasks.getting(org.jetbrains.dokka.gradle.DokkaTask::class)
    val javadocJar: TaskProvider<Jar> by tasks.registering(Jar::class) {
        dependsOn(dokkaHtml)
        archiveClassifier.set("javadoc")
        from(dokkaHtml.outputDirectory)
    }

    publishing {
        publications.withType<MavenPublication> {
            artifact(javadocJar)
        }
    }
}
