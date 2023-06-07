import com.google.protobuf.gradle.*

plugins {
    id("java-library")
}

protobuf {
    plugins {
        val grpcVersion: String by project

        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:$grpcVersion"
        }
    }

    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                remove(id = "java")
            }
            task.plugins {
                id("grpc") {
                    outputSubDir = "java"
                }
            }
        }
    }
}

dependencies {
    val grpcVersion: String by project

    api(project(":"))

    api("io.grpc:grpc-protobuf:$grpcVersion")
    api("io.grpc:grpc-stub:$grpcVersion")
}
