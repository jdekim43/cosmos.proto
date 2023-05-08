// Transform from cosmos/nft/v1beta1/event.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.nft.v1beta1

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperEncoder

@Serializable(with = EventSend.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.EventSend")
public data class EventSend(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val id: String,
  @ProtobufIndex(index = 3)
  public val sender: String,
  @ProtobufIndex(index = 4)
  public val `receiver`: String,
) {
  public object KotlinxSerializer : KSerializer<EventSend> {
    private val delegator: KSerializer<EventSend> = EventSend.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSend): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventSendMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSend {
      if (decoder is ProtobufMapperDecoder) {
        return EventSendMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventMint.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.EventMint")
public data class EventMint(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val id: String,
  @ProtobufIndex(index = 3)
  public val owner: String,
) {
  public object KotlinxSerializer : KSerializer<EventMint> {
    private val delegator: KSerializer<EventMint> = EventMint.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventMint): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventMintMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventMint {
      if (decoder is ProtobufMapperDecoder) {
        return EventMintMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventBurn.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.EventBurn")
public data class EventBurn(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val id: String,
  @ProtobufIndex(index = 3)
  public val owner: String,
) {
  public object KotlinxSerializer : KSerializer<EventBurn> {
    private val delegator: KSerializer<EventBurn> = EventBurn.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBurn): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventBurnMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBurn {
      if (decoder is ProtobufMapperDecoder) {
        return EventBurnMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}