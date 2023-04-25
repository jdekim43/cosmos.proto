import com.google.protobuf.gradle.*

plugins {
    kotlin("jvm")
}

protobuf {
    plugins {
        val grpcKotlinVersion: String by project

        id("grpcKotlin") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:$grpcKotlinVersion:jdk8@jar"
        }
    }

    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                remove(id = "java")
            }

            task.plugins {
                id("grpcKotlin") {
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
