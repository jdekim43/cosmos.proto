// Transform from cosmos/autocli/v1/options.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.autocli.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object ModuleOptionsConverter : ProtobufConverter<ModuleOptions>

public expect object ServiceCommandDescriptorConverter : ProtobufConverter<ServiceCommandDescriptor>

public expect object RpcCommandOptionsConverter : ProtobufConverter<RpcCommandOptions>

public expect object FlagOptionsConverter : ProtobufConverter<FlagOptions>

public expect object PositionalArgDescriptorConverter : ProtobufConverter<PositionalArgDescriptor>
