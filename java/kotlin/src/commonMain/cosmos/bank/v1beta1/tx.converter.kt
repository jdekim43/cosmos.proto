// Transform from cosmos/bank/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.bank.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MsgSendConverter : ProtobufConverter<MsgSend>

public expect object MsgSendResponseConverter : ProtobufConverter<MsgSendResponse>

public expect object MsgMultiSendConverter : ProtobufConverter<MsgMultiSend>

public expect object MsgMultiSendResponseConverter : ProtobufConverter<MsgMultiSendResponse>

public expect object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams>

public expect object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>

public expect object MsgSetSendEnabledConverter : ProtobufConverter<MsgSetSendEnabled>

public expect object MsgSetSendEnabledResponseConverter :
    ProtobufConverter<MsgSetSendEnabledResponse>
