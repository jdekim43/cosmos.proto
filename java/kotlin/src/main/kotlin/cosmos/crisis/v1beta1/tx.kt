// Transform from cosmos/crisis/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.crisis.v1beta1

import cosmos.base.v1beta1.Coin
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

@Serializable(with = MsgVerifyInvariant.KotlinxSerializer::class)
@SerialName(value = "cosmos.crisis.v1beta1.MsgVerifyInvariant")
public data class MsgVerifyInvariant(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val invariantModuleName: String,
  @ProtobufIndex(index = 3)
  public val invariantRoute: String,
) {
  public object KotlinxSerializer : KSerializer<MsgVerifyInvariant> {
    private val delegator: KSerializer<MsgVerifyInvariant> = MsgVerifyInvariant.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVerifyInvariant): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgVerifyInvariantMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVerifyInvariant {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVerifyInvariantMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgVerifyInvariantResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.crisis.v1beta1.MsgVerifyInvariantResponse")
public class MsgVerifyInvariantResponse() {
  public object KotlinxSerializer : KSerializer<MsgVerifyInvariantResponse> {
    private val delegator: KSerializer<MsgVerifyInvariantResponse> =
        MsgVerifyInvariantResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVerifyInvariantResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgVerifyInvariantResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVerifyInvariantResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVerifyInvariantResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = "cosmos.crisis.v1beta1.MsgUpdateParams")
public data class MsgUpdateParams(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val constantFee: Coin,
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
@SerialName(value = "cosmos.crisis.v1beta1.MsgUpdateParamsResponse")
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
