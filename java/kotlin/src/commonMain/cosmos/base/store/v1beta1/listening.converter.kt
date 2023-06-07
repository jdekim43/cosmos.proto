// Transform from cosmos/base/store/v1beta1/listening.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.base.store.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object StoreKVPairConverter : ProtobufConverter<StoreKVPair>

public expect object BlockMetadataConverter : ProtobufConverter<BlockMetadata> {
  public expect object DeliverTxConverter : ProtobufConverter<BlockMetadata.DeliverTx>
}
