// Transform from cosmos/slashing/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.slashing.v1beta1

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

@Serializable(with = MsgUnjail.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.MsgUnjail")
public data class MsgUnjail(
  @ProtobufIndex(index = 1)
  public val validatorAddr: String,
) {
  public object KotlinxSerializer : KSerializer<MsgUnjail> {
    private val delegator: KSerializer<MsgUnjail> = MsgUnjail.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUnjail): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUnjailMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUnjail {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUnjailMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUnjailResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.MsgUnjailResponse")
public class MsgUnjailResponse() {
  public object KotlinxSerializer : KSerializer<MsgUnjailResponse> {
    private val delegator: KSerializer<MsgUnjailResponse> = MsgUnjailResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUnjailResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUnjailResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUnjailResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUnjailResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.MsgUpdateParams")
public data class MsgUpdateParams(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val params: Params,
) {
  public object KotlinxSerializer : KSerializer<MsgUpdateParams> {
    private val delegator: KSerializer<MsgUpdateParams> = MsgUpdateParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateParams): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateParamsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateParams {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateParamsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParamsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.MsgUpdateParamsResponse")
public class MsgUpdateParamsResponse() {
  public object KotlinxSerializer : KSerializer<MsgUpdateParamsResponse> {
    private val delegator: KSerializer<MsgUpdateParamsResponse> =
        MsgUpdateParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateParamsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateParamsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateParamsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
