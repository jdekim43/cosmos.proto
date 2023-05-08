// Transform from cosmos/authz/v1beta1/authz.proto
package cosmos.authz.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyMapper
import google.protobuf.TimestampMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenericAuthorizationMapper :
    ProtobufTypeMapper<GenericAuthorization, Authz.GenericAuthorization> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.GenericAuthorization.getDescriptor()

  public override val parser: Parser<Authz.GenericAuthorization> =
      Authz.GenericAuthorization.parser()

  public override fun convert(obj: Authz.GenericAuthorization): GenericAuthorization =
      GenericAuthorization(
  	msg = obj.msg,
  )

  public override fun convert(obj: GenericAuthorization): Authz.GenericAuthorization {
    val builder = Authz.GenericAuthorization.newBuilder()
    builder.setMsg(obj.msg)
    return builder.build()
  }
}

public object GrantMapper : ProtobufTypeMapper<Grant, Authz.Grant> {
  public override val descriptor: Descriptors.Descriptor = Authz.Grant.getDescriptor()

  public override val parser: Parser<Authz.Grant> = Authz.Grant.parser()

  public override fun convert(obj: Authz.Grant): Grant = Grant(
  	authorization = AnyMapper.convert(obj.authorization),
  	expiration = TimestampMapper.convert(obj.expiration),
  )

  public override fun convert(obj: Grant): Authz.Grant {
    val builder = Authz.Grant.newBuilder()
    builder.setAuthorization(AnyMapper.convert(obj.authorization))
    builder.setExpiration(TimestampMapper.convert(obj.expiration))
    return builder.build()
  }
}

public object GrantAuthorizationMapper :
    ProtobufTypeMapper<GrantAuthorization, Authz.GrantAuthorization> {
  public override val descriptor: Descriptors.Descriptor = Authz.GrantAuthorization.getDescriptor()

  public override val parser: Parser<Authz.GrantAuthorization> = Authz.GrantAuthorization.parser()

  public override fun convert(obj: Authz.GrantAuthorization): GrantAuthorization =
      GrantAuthorization(
  	granter = obj.granter,
  	grantee = obj.grantee,
  	authorization = AnyMapper.convert(obj.authorization),
  	expiration = TimestampMapper.convert(obj.expiration),
  )

  public override fun convert(obj: GrantAuthorization): Authz.GrantAuthorization {
    val builder = Authz.GrantAuthorization.newBuilder()
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    builder.setAuthorization(AnyMapper.convert(obj.authorization))
    builder.setExpiration(TimestampMapper.convert(obj.expiration))
    return builder.build()
  }
}

public object GrantQueueItemMapper : ProtobufTypeMapper<GrantQueueItem, Authz.GrantQueueItem> {
  public override val descriptor: Descriptors.Descriptor = Authz.GrantQueueItem.getDescriptor()

  public override val parser: Parser<Authz.GrantQueueItem> = Authz.GrantQueueItem.parser()

  public override fun convert(obj: Authz.GrantQueueItem): GrantQueueItem = GrantQueueItem(
  	msgTypeUrls = obj.msgTypeUrlsList.map { it },
  )

  public override fun convert(obj: GrantQueueItem): Authz.GrantQueueItem {
    val builder = Authz.GrantQueueItem.newBuilder()
    builder.addAllMsgTypeUrls(obj.msgTypeUrls.map { it })
    return builder.build()
  }
}
