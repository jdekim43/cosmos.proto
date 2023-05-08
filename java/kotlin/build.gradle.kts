import com.google.protobuf.gradle.*

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization") version "1.8.20"
}

//kotlin {
//    sourceSets {
//        all {
//            languageSettings {
//                optIn("kotlin.RequiresOptIn")
//            }
//        }
//    }
//}

protobuf {
    plugins {
        val kotlinProtobufVersion: String by project

        id("kotlin-kotlinx") {
            artifact = "kr.jadekim:kotlin-protobuf-generator-kotlinx:$kotlinProtobufVersion:jdk8@jar"
        }
    }

    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                remove(id = "java")
            }
            task.plugins {
                id("kotlin-kotlinx") {
                    outputSubDir = "kotlin"
                }
            }
        }
    }
}

dependencies {
    val kotlinProtobufVersion: String by project
    val kotlinxSerializationVersion: String by project

    api(project(":"))

    api("kr.jadekim:kotlin-protobuf:$kotlinProtobufVersion")
    api("kr.jadekim:kotlin-protobuf-kotlinx:$kotlinProtobufVersion")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$kotlinxSerializationVersion")
}

tasks.create("cleanProto") {
    group = "other"

    doLast {
        delete("${project.projectDir.absolutePath}/src/main/kotlin")
    }

    finalizedBy(tasks.getByName("clean"))
}
