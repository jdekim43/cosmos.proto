// Transform from cosmos/authz/module/v1/module.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.authz.module.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ModuleConverter : ProtobufConverter<Module> by ModuleJvmConverter
