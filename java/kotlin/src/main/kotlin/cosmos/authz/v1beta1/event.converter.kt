// Transform from cosmos/authz/v1beta1/event.proto
package cosmos.authz.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object EventGrantMapper : ProtobufTypeMapper<EventGrant, Event.EventGrant> {
  public override val descriptor: Descriptors.Descriptor = Event.EventGrant.getDescriptor()

  public override val parser: Parser<Event.EventGrant> = Event.EventGrant.parser()

  public override fun convert(obj: Event.EventGrant): EventGrant = EventGrant(
  	msgTypeUrl = obj.msgTypeUrl,
  	granter = obj.granter,
  	grantee = obj.grantee,
  )

  public override fun convert(obj: EventGrant): Event.EventGrant {
    val builder = Event.EventGrant.newBuilder()
    builder.setMsgTypeUrl(obj.msgTypeUrl)
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    return builder.build()
  }
}

public object EventRevokeMapper : ProtobufTypeMapper<EventRevoke, Event.EventRevoke> {
  public override val descriptor: Descriptors.Descriptor = Event.EventRevoke.getDescriptor()

  public override val parser: Parser<Event.EventRevoke> = Event.EventRevoke.parser()

  public override fun convert(obj: Event.EventRevoke): EventRevoke = EventRevoke(
  	msgTypeUrl = obj.msgTypeUrl,
  	granter = obj.granter,
  	grantee = obj.grantee,
  )

  public override fun convert(obj: EventRevoke): Event.EventRevoke {
    val builder = Event.EventRevoke.newBuilder()
    builder.setMsgTypeUrl(obj.msgTypeUrl)
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    return builder.build()
  }
}
