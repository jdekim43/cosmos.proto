// Transform from cosmos/distribution/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.distribution.v1beta1

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

@Serializable(with = MsgSetWithdrawAddress.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.MsgSetWithdrawAddress")
public data class MsgSetWithdrawAddress(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val withdrawAddress: String,
) {
  public object KotlinxSerializer : KSerializer<MsgSetWithdrawAddress> {
    private val delegator: KSerializer<MsgSetWithdrawAddress> = MsgSetWithdrawAddress.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSetWithdrawAddress): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgSetWithdrawAddressMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSetWithdrawAddress {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSetWithdrawAddressMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSetWithdrawAddressResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse")
public class MsgSetWithdrawAddressResponse() {
  public object KotlinxSerializer : KSerializer<MsgSetWithdrawAddressResponse> {
    private val delegator: KSerializer<MsgSetWithdrawAddressResponse> =
        MsgSetWithdrawAddressResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSetWithdrawAddressResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgSetWithdrawAddressResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSetWithdrawAddressResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSetWithdrawAddressResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawDelegatorReward.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward")
public data class MsgWithdrawDelegatorReward(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
) {
  public object KotlinxSerializer : KSerializer<MsgWithdrawDelegatorReward> {
    private val delegator: KSerializer<MsgWithdrawDelegatorReward> =
        MsgWithdrawDelegatorReward.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawDelegatorReward): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgWithdrawDelegatorRewardMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawDelegatorReward {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawDelegatorRewardMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawDelegatorRewardResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse")
public data class MsgWithdrawDelegatorRewardResponse(
  @ProtobufIndex(index = 1)
  public val amount: List<Coin>,
) {
  public object KotlinxSerializer : KSerializer<MsgWithdrawDelegatorRewardResponse> {
    private val delegator: KSerializer<MsgWithdrawDelegatorRewardResponse> =
        MsgWithdrawDelegatorRewardResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawDelegatorRewardResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgWithdrawDelegatorRewardResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawDelegatorRewardResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawDelegatorRewardResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawValidatorCommission.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission")
public data class MsgWithdrawValidatorCommission(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
) {
  public object KotlinxSerializer : KSerializer<MsgWithdrawValidatorCommission> {
    private val delegator: KSerializer<MsgWithdrawValidatorCommission> =
        MsgWithdrawValidatorCommission.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawValidatorCommission): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgWithdrawValidatorCommissionMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawValidatorCommission {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawValidatorCommissionMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawValidatorCommissionResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse")
public data class MsgWithdrawValidatorCommissionResponse(
  @ProtobufIndex(index = 1)
  public val amount: List<Coin>,
) {
  public object KotlinxSerializer : KSerializer<MsgWithdrawValidatorCommissionResponse> {
    private val delegator: KSerializer<MsgWithdrawValidatorCommissionResponse> =
        MsgWithdrawValidatorCommissionResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgWithdrawValidatorCommissionResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgWithdrawValidatorCommissionResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawValidatorCommissionResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawValidatorCommissionResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgFundCommunityPool.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.MsgFundCommunityPool")
public data class MsgFundCommunityPool(
  @ProtobufIndex(index = 1)
  public val amount: List<Coin>,
  @ProtobufIndex(index = 2)
  public val depositor: String,
) {
  public object KotlinxSerializer : KSerializer<MsgFundCommunityPool> {
    private val delegator: KSerializer<MsgFundCommunityPool> = MsgFundCommunityPool.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgFundCommunityPool): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgFundCommunityPoolMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgFundCommunityPool {
      if (decoder is ProtobufMapperDecoder) {
        return MsgFundCommunityPoolMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgFundCommunityPoolResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse")
public class MsgFundCommunityPoolResponse() {
  public object KotlinxSerializer : KSerializer<MsgFundCommunityPoolResponse> {
    private val delegator: KSerializer<MsgFundCommunityPoolResponse> =
        MsgFundCommunityPoolResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgFundCommunityPoolResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgFundCommunityPoolResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgFundCommunityPoolResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgFundCommunityPoolResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.MsgUpdateParams")
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
@SerialName(value = "cosmos.distribution.v1beta1.MsgUpdateParamsResponse")
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

@Serializable(with = MsgCommunityPoolSpend.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.MsgCommunityPoolSpend")
public data class MsgCommunityPoolSpend(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val recipient: String,
  @ProtobufIndex(index = 3)
  public val amount: List<Coin>,
) {
  public object KotlinxSerializer : KSerializer<MsgCommunityPoolSpend> {
    private val delegator: KSerializer<MsgCommunityPoolSpend> = MsgCommunityPoolSpend.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCommunityPoolSpend): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgCommunityPoolSpendMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCommunityPoolSpend {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCommunityPoolSpendMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCommunityPoolSpendResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.MsgCommunityPoolSpendResponse")
public class MsgCommunityPoolSpendResponse() {
  public object KotlinxSerializer : KSerializer<MsgCommunityPoolSpendResponse> {
    private val delegator: KSerializer<MsgCommunityPoolSpendResponse> =
        MsgCommunityPoolSpendResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCommunityPoolSpendResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgCommunityPoolSpendResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCommunityPoolSpendResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCommunityPoolSpendResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
