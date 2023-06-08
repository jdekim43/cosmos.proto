// Transform from cosmos/nft/v1beta1/event.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.nft.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object EventSendJvmConverter : ProtobufTypeMapper<EventSend, Event.EventSend> {
  public override val descriptor: Descriptors.Descriptor = Event.EventSend.getDescriptor()

  public override val parser: Parser<Event.EventSend> = Event.EventSend.parser()

  public override fun convert(obj: Event.EventSend): EventSend = EventSend(
  	classId = obj.classId,
  	id = obj.id,
  	sender = obj.sender,
  	`receiver` = obj.`receiver`,
  )

  public override fun convert(obj: EventSend): Event.EventSend {
    val builder = Event.EventSend.newBuilder()
    builder.setClassId(obj.classId)
    builder.setId(obj.id)
    builder.setSender(obj.sender)
    builder.setReceiver(obj.`receiver`)
    return builder.build()
  }
}

public object EventMintJvmConverter : ProtobufTypeMapper<EventMint, Event.EventMint> {
  public override val descriptor: Descriptors.Descriptor = Event.EventMint.getDescriptor()

  public override val parser: Parser<Event.EventMint> = Event.EventMint.parser()

  public override fun convert(obj: Event.EventMint): EventMint = EventMint(
  	classId = obj.classId,
  	id = obj.id,
  	owner = obj.owner,
  )

  public override fun convert(obj: EventMint): Event.EventMint {
    val builder = Event.EventMint.newBuilder()
    builder.setClassId(obj.classId)
    builder.setId(obj.id)
    builder.setOwner(obj.owner)
    return builder.build()
  }
}

public object EventBurnJvmConverter : ProtobufTypeMapper<EventBurn, Event.EventBurn> {
  public override val descriptor: Descriptors.Descriptor = Event.EventBurn.getDescriptor()

  public override val parser: Parser<Event.EventBurn> = Event.EventBurn.parser()

  public override fun convert(obj: Event.EventBurn): EventBurn = EventBurn(
  	classId = obj.classId,
  	id = obj.id,
  	owner = obj.owner,
  )

  public override fun convert(obj: EventBurn): Event.EventBurn {
    val builder = Event.EventBurn.newBuilder()
    builder.setClassId(obj.classId)
    builder.setId(obj.id)
    builder.setOwner(obj.owner)
    return builder.build()
  }
}
