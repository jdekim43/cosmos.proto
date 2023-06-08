import com.google.protobuf.gradle.*

kotlin {
    sourceSets {
        val commonMain by getting {
//            kotlin.srcDir(File(buildDir, "generated/source/proto/main/kotlin-grpc-multiplatform"))

            dependencies {
                val kotlinProtobufVersion: String by project

                api(project(":cosmos-proto-kotlin"))

                api("kr.jadekim:kotlin-protobuf:$kotlinProtobufVersion")
                api("kr.jadekim:kotlin-protobuf-grpc:$kotlinProtobufVersion")
            }
        }

        val jvmMain by getting {
//            kotlin.srcDir(File(buildDir, "generated/source/proto/main/kotlin-converter-multiplatform-jvm"))

            dependencies {
                val grpcKotlinVersion: String by project

                implementation(project(":"))
                implementation(project(":cosmos-grpc-java"))

                api("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")
            }
        }
    }
}

protobuf {
    plugins {
        val kotlinProtobufVersion: String by project

        id("kotlin-grpc-multiplatform") {
            artifact = "kr.jadekim:kotlin-protobuf-generator-grpc-multiplatform:$kotlinProtobufVersion:jdk8@jar"
        }

        id("kotlin-grpc-multiplatform-jvm") {
            artifact = "kr.jadekim:kotlin-protobuf-generator-grpc-multiplatform-jvm:$kotlinProtobufVersion:jdk8@jar"
        }
    }

    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                remove(id = "java")
            }

            task.plugins {
                id("kotlin-grpc-multiplatform") {
                    outputSubDir = "commonMain"
                }
                id("kotlin-grpc-multiplatform-jvm") {
                    outputSubDir = "jvmMain"
                }
            }
        }
    }
}
