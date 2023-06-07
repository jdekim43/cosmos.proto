// Transform from cosmos/authz/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.authz.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MsgGrantConverter : ProtobufConverter<MsgGrant>

public expect object MsgExecResponseConverter : ProtobufConverter<MsgExecResponse>

public expect object MsgExecConverter : ProtobufConverter<MsgExec>

public expect object MsgGrantResponseConverter : ProtobufConverter<MsgGrantResponse>

public expect object MsgRevokeConverter : ProtobufConverter<MsgRevoke>

public expect object MsgRevokeResponseConverter : ProtobufConverter<MsgRevokeResponse>
