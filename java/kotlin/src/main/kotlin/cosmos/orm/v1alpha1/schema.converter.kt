// Transform from cosmos/orm/v1alpha1/schema.proto
package cosmos.orm.v1alpha1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ModuleSchemaDescriptorMapper :
    ProtobufTypeMapper<ModuleSchemaDescriptor, Schema.ModuleSchemaDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Schema.ModuleSchemaDescriptor.getDescriptor()

  public override val parser: Parser<Schema.ModuleSchemaDescriptor> =
      Schema.ModuleSchemaDescriptor.parser()

  public override fun convert(obj: Schema.ModuleSchemaDescriptor): ModuleSchemaDescriptor =
      ModuleSchemaDescriptor(
  	schemaFile = obj.schemaFileList.map { FileEntryMapper.convert(it) },
  	prefix = obj.prefix.toByteArray(),
  )

  public override fun convert(obj: ModuleSchemaDescriptor): Schema.ModuleSchemaDescriptor {
    val builder = Schema.ModuleSchemaDescriptor.newBuilder()
    builder.addAllSchemaFile(obj.schemaFile.map { FileEntryMapper.convert(it) })
    builder.setPrefix(ByteString.copyFrom(obj.prefix))
    return builder.build()
  }

  public object FileEntryMapper :
      ProtobufTypeMapper<ModuleSchemaDescriptor.FileEntry, Schema.ModuleSchemaDescriptor.FileEntry>
      {
    public override val descriptor: Descriptors.Descriptor =
        Schema.ModuleSchemaDescriptor.FileEntry.getDescriptor()

    public override val parser: Parser<Schema.ModuleSchemaDescriptor.FileEntry> =
        Schema.ModuleSchemaDescriptor.FileEntry.parser()

    public override fun convert(obj: Schema.ModuleSchemaDescriptor.FileEntry):
        ModuleSchemaDescriptor.FileEntry = ModuleSchemaDescriptor.FileEntry(
    	id = obj.id.asKotlinType,
    	protoFileName = obj.protoFileName,
    	storageType = StorageType.forNumber(obj.storageType.number),
    )

    public override fun convert(obj: ModuleSchemaDescriptor.FileEntry):
        Schema.ModuleSchemaDescriptor.FileEntry {
      val builder = Schema.ModuleSchemaDescriptor.FileEntry.newBuilder()
      builder.setId(obj.id.asJavaType)
      builder.setProtoFileName(obj.protoFileName)
      builder.setStorageType(Schema.StorageType.forNumber(obj.storageType.number))
      return builder.build()
    }
  }
}
