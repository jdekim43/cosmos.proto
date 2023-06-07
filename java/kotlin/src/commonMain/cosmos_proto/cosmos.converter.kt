// Transform from cosmos_proto/cosmos.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos_proto

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object InterfaceDescriptorConverter : ProtobufConverter<InterfaceDescriptor>

public expect object ScalarDescriptorConverter : ProtobufConverter<ScalarDescriptor>
