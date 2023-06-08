// Transform from cosmos/feegrant/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.feegrant.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MsgGrantAllowanceConverter : ProtobufConverter<MsgGrantAllowance>

public expect object MsgGrantAllowanceResponseConverter :
    ProtobufConverter<MsgGrantAllowanceResponse>

public expect object MsgRevokeAllowanceConverter : ProtobufConverter<MsgRevokeAllowance>

public expect object MsgRevokeAllowanceResponseConverter :
    ProtobufConverter<MsgRevokeAllowanceResponse>
