// Transform from cosmos/app/v1alpha1/config.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.app.v1alpha1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object ConfigConverter : ProtobufConverter<Config>

public expect object ModuleConfigConverter : ProtobufConverter<ModuleConfig>

public expect object GolangBindingConverter : ProtobufConverter<GolangBinding>
