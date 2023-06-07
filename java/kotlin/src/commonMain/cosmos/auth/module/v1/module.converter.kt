// Transform from cosmos/auth/module/v1/module.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.auth.module.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object ModuleConverter : ProtobufConverter<Module>

public expect object ModuleAccountPermissionConverter : ProtobufConverter<ModuleAccountPermission>
