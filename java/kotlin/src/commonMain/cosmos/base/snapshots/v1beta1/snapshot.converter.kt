// Transform from cosmos/base/snapshots/v1beta1/snapshot.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.base.snapshots.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object SnapshotConverter : ProtobufConverter<Snapshot>

public expect object MetadataConverter : ProtobufConverter<Metadata>

public expect object SnapshotItemConverter : ProtobufConverter<SnapshotItem>

public expect object SnapshotStoreItemConverter : ProtobufConverter<SnapshotStoreItem>

public expect object SnapshotIAVLItemConverter : ProtobufConverter<SnapshotIAVLItem>

public expect object SnapshotExtensionMetaConverter : ProtobufConverter<SnapshotExtensionMeta>

public expect object SnapshotExtensionPayloadConverter : ProtobufConverter<SnapshotExtensionPayload>

public expect object SnapshotKVItemConverter : ProtobufConverter<SnapshotKVItem>

public expect object SnapshotSchemaConverter : ProtobufConverter<SnapshotSchema>
