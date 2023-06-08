// Transform from cosmos/nft/v1beta1/event.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.nft.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object EventSendConverter : ProtobufConverter<EventSend>

public expect object EventMintConverter : ProtobufConverter<EventMint>

public expect object EventBurnConverter : ProtobufConverter<EventBurn>
