import com.google.protobuf.gradle.*

plugins {
    kotlin("jvm")
}

protobuf {
    plugins {
        val kotlinProtobufVersion: String by project

        id("kotlin-grpc") {
            artifact = "kr.jadekim:kotlin-protobuf-generator-grpc:$kotlinProtobufVersion:jdk8@jar"
        }
    }

    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                remove(id = "java")
            }

            task.plugins {
                id("kotlin-grpc") {
                    outputSubDir = "kotlin"
                }
            }
        }
    }
}

dependencies {
    val grpcKotlinVersion: String by project

    api(project(":"))
    api(project(":cosmos-proto-kotlin"))

    api(project(":cosmos-grpc-java"))
    api("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")
}

tasks.create("cleanProto") {
    group = "other"

    doLast {
        delete("${project.projectDir.absolutePath}/src/main/kotlin")
    }

    finalizedBy(tasks.getByName("clean"))
}
