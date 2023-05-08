// Transform from cosmos/base/snapshots/v1beta1/snapshot.proto
package cosmos.base.snapshots.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object SnapshotMapper : ProtobufTypeMapper<Snapshot, SnapshotOuterClass.Snapshot> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.Snapshot.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.Snapshot> =
      SnapshotOuterClass.Snapshot.parser()

  public override fun convert(obj: SnapshotOuterClass.Snapshot): Snapshot = Snapshot(
  	height = obj.height.asKotlinType,
  	format = obj.format.asKotlinType,
  	chunks = obj.chunks.asKotlinType,
  	hash = obj.hash.toByteArray(),
  	metadata = MetadataMapper.convert(obj.metadata),
  )

  public override fun convert(obj: Snapshot): SnapshotOuterClass.Snapshot {
    val builder = SnapshotOuterClass.Snapshot.newBuilder()
    builder.setHeight(obj.height.asJavaType)
    builder.setFormat(obj.format.asJavaType)
    builder.setChunks(obj.chunks.asJavaType)
    builder.setHash(ByteString.copyFrom(obj.hash))
    builder.setMetadata(MetadataMapper.convert(obj.metadata))
    return builder.build()
  }
}

public object MetadataMapper : ProtobufTypeMapper<Metadata, SnapshotOuterClass.Metadata> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.Metadata.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.Metadata> =
      SnapshotOuterClass.Metadata.parser()

  public override fun convert(obj: SnapshotOuterClass.Metadata): Metadata = Metadata(
  	chunkHashes = obj.chunkHashesList.map { it.toByteArray() },
  )

  public override fun convert(obj: Metadata): SnapshotOuterClass.Metadata {
    val builder = SnapshotOuterClass.Metadata.newBuilder()
    builder.addAllChunkHashes(obj.chunkHashes.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object SnapshotItemMapper : ProtobufTypeMapper<SnapshotItem, SnapshotOuterClass.SnapshotItem>
    {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotItem.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotItem> =
      SnapshotOuterClass.SnapshotItem.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotItem): SnapshotItem = SnapshotItem(
  	item = mapOf(
  1 to { SnapshotItem.ItemOneOf.Store(SnapshotStoreItemMapper.convert(obj.store)) },
  2 to { SnapshotItem.ItemOneOf.Iavl(SnapshotIAVLItemMapper.convert(obj.iavl)) },
  3 to { SnapshotItem.ItemOneOf.Extension(SnapshotExtensionMetaMapper.convert(obj.extension)) },
  4 to {
      SnapshotItem.ItemOneOf.ExtensionPayload(SnapshotExtensionPayloadMapper.convert(obj.extensionPayload))
      },
  5 to { SnapshotItem.ItemOneOf.Kv(SnapshotKVItemMapper.convert(obj.kv)) },
  6 to { SnapshotItem.ItemOneOf.Schema(SnapshotSchemaMapper.convert(obj.schema)) },
  ).getValue(obj.itemCase.number)(),
  )

  public override fun convert(obj: SnapshotItem): SnapshotOuterClass.SnapshotItem {
    val builder = SnapshotOuterClass.SnapshotItem.newBuilder()
    when (obj.item) {
      is SnapshotItem.ItemOneOf.Store ->
          builder.setStore(SnapshotStoreItemMapper.convert(obj.item.value))
      is SnapshotItem.ItemOneOf.Iavl ->
          builder.setIavl(SnapshotIAVLItemMapper.convert(obj.item.value))
      is SnapshotItem.ItemOneOf.Extension ->
          builder.setExtension(SnapshotExtensionMetaMapper.convert(obj.item.value))
      is SnapshotItem.ItemOneOf.ExtensionPayload ->
          builder.setExtensionPayload(SnapshotExtensionPayloadMapper.convert(obj.item.value))
      is SnapshotItem.ItemOneOf.Kv -> builder.setKv(SnapshotKVItemMapper.convert(obj.item.value))
      is SnapshotItem.ItemOneOf.Schema ->
          builder.setSchema(SnapshotSchemaMapper.convert(obj.item.value))
    }
    return builder.build()
  }
}

public object SnapshotStoreItemMapper :
    ProtobufTypeMapper<SnapshotStoreItem, SnapshotOuterClass.SnapshotStoreItem> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotStoreItem.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotStoreItem> =
      SnapshotOuterClass.SnapshotStoreItem.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotStoreItem): SnapshotStoreItem =
      SnapshotStoreItem(
  	name = obj.name,
  )

  public override fun convert(obj: SnapshotStoreItem): SnapshotOuterClass.SnapshotStoreItem {
    val builder = SnapshotOuterClass.SnapshotStoreItem.newBuilder()
    builder.setName(obj.name)
    return builder.build()
  }
}

public object SnapshotIAVLItemMapper :
    ProtobufTypeMapper<SnapshotIAVLItem, SnapshotOuterClass.SnapshotIAVLItem> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotIAVLItem.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotIAVLItem> =
      SnapshotOuterClass.SnapshotIAVLItem.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotIAVLItem): SnapshotIAVLItem =
      SnapshotIAVLItem(
  	key = obj.key.toByteArray(),
  	`value` = obj.`value`.toByteArray(),
  	version = obj.version,
  	height = obj.height,
  )

  public override fun convert(obj: SnapshotIAVLItem): SnapshotOuterClass.SnapshotIAVLItem {
    val builder = SnapshotOuterClass.SnapshotIAVLItem.newBuilder()
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    builder.setVersion(obj.version)
    builder.setHeight(obj.height)
    return builder.build()
  }
}

public object SnapshotExtensionMetaMapper :
    ProtobufTypeMapper<SnapshotExtensionMeta, SnapshotOuterClass.SnapshotExtensionMeta> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotExtensionMeta.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotExtensionMeta> =
      SnapshotOuterClass.SnapshotExtensionMeta.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotExtensionMeta): SnapshotExtensionMeta
      = SnapshotExtensionMeta(
  	name = obj.name,
  	format = obj.format.asKotlinType,
  )

  public override fun convert(obj: SnapshotExtensionMeta):
      SnapshotOuterClass.SnapshotExtensionMeta {
    val builder = SnapshotOuterClass.SnapshotExtensionMeta.newBuilder()
    builder.setName(obj.name)
    builder.setFormat(obj.format.asJavaType)
    return builder.build()
  }
}

public object SnapshotExtensionPayloadMapper :
    ProtobufTypeMapper<SnapshotExtensionPayload, SnapshotOuterClass.SnapshotExtensionPayload> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotExtensionPayload.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotExtensionPayload> =
      SnapshotOuterClass.SnapshotExtensionPayload.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotExtensionPayload):
      SnapshotExtensionPayload = SnapshotExtensionPayload(
  	payload = obj.payload.toByteArray(),
  )

  public override fun convert(obj: SnapshotExtensionPayload):
      SnapshotOuterClass.SnapshotExtensionPayload {
    val builder = SnapshotOuterClass.SnapshotExtensionPayload.newBuilder()
    builder.setPayload(ByteString.copyFrom(obj.payload))
    return builder.build()
  }
}

public object SnapshotKVItemMapper :
    ProtobufTypeMapper<SnapshotKVItem, SnapshotOuterClass.SnapshotKVItem> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotKVItem.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotKVItem> =
      SnapshotOuterClass.SnapshotKVItem.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotKVItem): SnapshotKVItem =
      SnapshotKVItem(
  	key = obj.key.toByteArray(),
  	`value` = obj.`value`.toByteArray(),
  )

  public override fun convert(obj: SnapshotKVItem): SnapshotOuterClass.SnapshotKVItem {
    val builder = SnapshotOuterClass.SnapshotKVItem.newBuilder()
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    return builder.build()
  }
}

public object SnapshotSchemaMapper :
    ProtobufTypeMapper<SnapshotSchema, SnapshotOuterClass.SnapshotSchema> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotSchema.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotSchema> =
      SnapshotOuterClass.SnapshotSchema.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotSchema): SnapshotSchema =
      SnapshotSchema(
  	keys = obj.keysList.map { it.toByteArray() },
  )

  public override fun convert(obj: SnapshotSchema): SnapshotOuterClass.SnapshotSchema {
    val builder = SnapshotOuterClass.SnapshotSchema.newBuilder()
    builder.addAllKeys(obj.keys.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}
