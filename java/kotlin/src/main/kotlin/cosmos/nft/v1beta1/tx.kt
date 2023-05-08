// Transform from cosmos/nft/v1beta1/tx.proto
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

@Serializable(with = MsgSend.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.MsgSend")
public data class MsgSend(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val id: String,
  @ProtobufIndex(index = 3)
  public val sender: String,
  @ProtobufIndex(index = 4)
  public val `receiver`: String,
) {
  public object KotlinxSerializer : KSerializer<MsgSend> {
    private val delegator: KSerializer<MsgSend> = MsgSend.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSend): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgSendMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSend {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSendMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSendResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.MsgSendResponse")
public class MsgSendResponse() {
  public object KotlinxSerializer : KSerializer<MsgSendResponse> {
    private val delegator: KSerializer<MsgSendResponse> = MsgSendResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSendResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgSendResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSendResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSendResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
