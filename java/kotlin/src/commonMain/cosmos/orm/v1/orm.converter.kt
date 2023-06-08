// Transform from cosmos/orm/v1/orm.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.orm.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object TableDescriptorConverter : ProtobufConverter<TableDescriptor>

public expect object PrimaryKeyDescriptorConverter : ProtobufConverter<PrimaryKeyDescriptor>

public expect object SecondaryIndexDescriptorConverter : ProtobufConverter<SecondaryIndexDescriptor>

public expect object SingletonDescriptorConverter : ProtobufConverter<SingletonDescriptor>
