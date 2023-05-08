// Transform from cosmos/authz/v1beta1/tx.proto
package cosmos.authz.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgGrantMapper : ProtobufTypeMapper<MsgGrant, Tx.MsgGrant> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgGrant.getDescriptor()

  public override val parser: Parser<Tx.MsgGrant> = Tx.MsgGrant.parser()

  public override fun convert(obj: Tx.MsgGrant): MsgGrant = MsgGrant(
  	granter = obj.granter,
  	grantee = obj.grantee,
  	grant = GrantMapper.convert(obj.grant),
  )

  public override fun convert(obj: MsgGrant): Tx.MsgGrant {
    val builder = Tx.MsgGrant.newBuilder()
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    builder.setGrant(GrantMapper.convert(obj.grant))
    return builder.build()
  }
}

public object MsgExecResponseMapper : ProtobufTypeMapper<MsgExecResponse, Tx.MsgExecResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgExecResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgExecResponse> = Tx.MsgExecResponse.parser()

  public override fun convert(obj: Tx.MsgExecResponse): MsgExecResponse = MsgExecResponse(
  	results = obj.resultsList.map { it.toByteArray() },
  )

  public override fun convert(obj: MsgExecResponse): Tx.MsgExecResponse {
    val builder = Tx.MsgExecResponse.newBuilder()
    builder.addAllResults(obj.results.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object MsgExecMapper : ProtobufTypeMapper<MsgExec, Tx.MsgExec> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgExec.getDescriptor()

  public override val parser: Parser<Tx.MsgExec> = Tx.MsgExec.parser()

  public override fun convert(obj: Tx.MsgExec): MsgExec = MsgExec(
  	grantee = obj.grantee,
  	msgs = obj.msgsList.map { AnyMapper.convert(it) },
  )

  public override fun convert(obj: MsgExec): Tx.MsgExec {
    val builder = Tx.MsgExec.newBuilder()
    builder.setGrantee(obj.grantee)
    builder.addAllMsgs(obj.msgs.map { AnyMapper.convert(it) })
    return builder.build()
  }
}

public object MsgGrantResponseMapper : ProtobufTypeMapper<MsgGrantResponse, Tx.MsgGrantResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgGrantResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgGrantResponse> = Tx.MsgGrantResponse.parser()

  public override fun convert(obj: Tx.MsgGrantResponse): MsgGrantResponse = MsgGrantResponse(
  )

  public override fun convert(obj: MsgGrantResponse): Tx.MsgGrantResponse {
    val builder = Tx.MsgGrantResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRevokeMapper : ProtobufTypeMapper<MsgRevoke, Tx.MsgRevoke> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRevoke.getDescriptor()

  public override val parser: Parser<Tx.MsgRevoke> = Tx.MsgRevoke.parser()

  public override fun convert(obj: Tx.MsgRevoke): MsgRevoke = MsgRevoke(
  	granter = obj.granter,
  	grantee = obj.grantee,
  	msgTypeUrl = obj.msgTypeUrl,
  )

  public override fun convert(obj: MsgRevoke): Tx.MsgRevoke {
    val builder = Tx.MsgRevoke.newBuilder()
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    builder.setMsgTypeUrl(obj.msgTypeUrl)
    return builder.build()
  }
}

public object MsgRevokeResponseMapper : ProtobufTypeMapper<MsgRevokeResponse, Tx.MsgRevokeResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRevokeResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRevokeResponse> = Tx.MsgRevokeResponse.parser()

  public override fun convert(obj: Tx.MsgRevokeResponse): MsgRevokeResponse = MsgRevokeResponse(
  )

  public override fun convert(obj: MsgRevokeResponse): Tx.MsgRevokeResponse {
    val builder = Tx.MsgRevokeResponse.newBuilder()
    return builder.build()
  }
}
