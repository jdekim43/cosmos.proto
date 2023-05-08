// Transform from cosmos/authz/v1beta1/event.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.authz.v1beta1

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

@Serializable(with = EventGrant.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.EventGrant")
public data class EventGrant(
  @ProtobufIndex(index = 2)
  public val msgTypeUrl: String,
  @ProtobufIndex(index = 3)
  public val granter: String,
  @ProtobufIndex(index = 4)
  public val grantee: String,
) {
  public object KotlinxSerializer : KSerializer<EventGrant> {
    private val delegator: KSerializer<EventGrant> = EventGrant.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventGrant): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventGrantMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventGrant {
      if (decoder is ProtobufMapperDecoder) {
        return EventGrantMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventRevoke.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.EventRevoke")
public data class EventRevoke(
  @ProtobufIndex(index = 2)
  public val msgTypeUrl: String,
  @ProtobufIndex(index = 3)
  public val granter: String,
  @ProtobufIndex(index = 4)
  public val grantee: String,
) {
  public object KotlinxSerializer : KSerializer<EventRevoke> {
    private val delegator: KSerializer<EventRevoke> = EventRevoke.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventRevoke): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventRevokeMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventRevoke {
      if (decoder is ProtobufMapperDecoder) {
        return EventRevokeMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
