rootProject.name = "cosmos-proto-java"

include(
    "grpc",
    "kotlin",
    "kotlin:grpc"
)

project(":grpc").name = "cosmos-grpc-java"
project(":kotlin").name = "cosmos-proto-kotlin"
project(":kotlin:grpc").name = "cosmos-grpc-kotlin"
