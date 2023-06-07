// Transform from cosmos/nft/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.nft.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MsgSendConverter : ProtobufConverter<MsgSend>

public expect object MsgSendResponseConverter : ProtobufConverter<MsgSendResponse>
