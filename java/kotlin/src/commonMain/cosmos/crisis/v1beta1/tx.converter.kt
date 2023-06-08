// Transform from cosmos/crisis/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.crisis.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MsgVerifyInvariantConverter : ProtobufConverter<MsgVerifyInvariant>

public expect object MsgVerifyInvariantResponseConverter :
    ProtobufConverter<MsgVerifyInvariantResponse>

public expect object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams>

public expect object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
