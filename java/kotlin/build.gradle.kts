import com.google.protobuf.gradle.*

plugins {
    kotlin("jvm")
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
    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                id("kotlin")

                remove(id = "java")
            }
        }
    }
}

dependencies {
    val protobufVersion: String by project

    api(project(":"))
    api("com.google.protobuf:protobuf-kotlin:$protobufVersion")
}

tasks.create("cleanProto") {
    group = "other"

    doLast {
        delete("${project.projectDir.absolutePath}/src/main/kotlin")
    }

    finalizedBy(tasks.getByName("clean"))
}
