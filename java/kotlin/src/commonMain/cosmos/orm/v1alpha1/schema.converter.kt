// Transform from cosmos/orm/v1alpha1/schema.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.orm.v1alpha1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object ModuleSchemaDescriptorConverter : ProtobufConverter<ModuleSchemaDescriptor> {
  public expect object FileEntryConverter : ProtobufConverter<ModuleSchemaDescriptor.FileEntry>
}