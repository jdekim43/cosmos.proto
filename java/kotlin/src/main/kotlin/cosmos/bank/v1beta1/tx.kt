// Transform from cosmos/bank/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.bank.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
@SerialName(value = "cosmos.bank.v1beta1.MsgSend")
public data class MsgSend(
  @ProtobufIndex(index = 1)
  public val fromAddress: String,
  @ProtobufIndex(index = 2)
  public val toAddress: String,
  @ProtobufIndex(index = 3)
  public val amount: List<Coin>,
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
@SerialName(value = "cosmos.bank.v1beta1.MsgSendResponse")
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

@Serializable(with = MsgMultiSend.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.MsgMultiSend")
public data class MsgMultiSend(
  @ProtobufIndex(index = 1)
  public val inputs: List<Input>,
  @ProtobufIndex(index = 2)
  public val outputs: List<Output>,
) {
  public object KotlinxSerializer : KSerializer<MsgMultiSend> {
    private val delegator: KSerializer<MsgMultiSend> = MsgMultiSend.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgMultiSend): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgMultiSendMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgMultiSend {
      if (decoder is ProtobufMapperDecoder) {
        return MsgMultiSendMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgMultiSendResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.MsgMultiSendResponse")
public class MsgMultiSendResponse() {
  public object KotlinxSerializer : KSerializer<MsgMultiSendResponse> {
    private val delegator: KSerializer<MsgMultiSendResponse> = MsgMultiSendResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgMultiSendResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgMultiSendResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgMultiSendResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgMultiSendResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.MsgUpdateParams")
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
@SerialName(value = "cosmos.bank.v1beta1.MsgUpdateParamsResponse")
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

@Serializable(with = MsgSetSendEnabled.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.MsgSetSendEnabled")
public data class MsgSetSendEnabled(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val sendEnabled: List<SendEnabled>,
  @ProtobufIndex(index = 3)
  public val useDefaultFor: List<String>,
) {
  public object KotlinxSerializer : KSerializer<MsgSetSendEnabled> {
    private val delegator: KSerializer<MsgSetSendEnabled> = MsgSetSendEnabled.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSetSendEnabled): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgSetSendEnabledMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSetSendEnabled {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSetSendEnabledMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSetSendEnabledResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.MsgSetSendEnabledResponse")
public class MsgSetSendEnabledResponse() {
  public object KotlinxSerializer : KSerializer<MsgSetSendEnabledResponse> {
    private val delegator: KSerializer<MsgSetSendEnabledResponse> =
        MsgSetSendEnabledResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSetSendEnabledResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgSetSendEnabledResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSetSendEnabledResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSetSendEnabledResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
