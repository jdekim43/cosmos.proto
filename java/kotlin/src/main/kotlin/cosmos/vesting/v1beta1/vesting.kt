// Transform from cosmos/vesting/v1beta1/vesting.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.vesting.v1beta1

import cosmos.auth.v1beta1.BaseAccount
import cosmos.base.v1beta1.Coin
import kotlin.Long
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

@Serializable(with = BaseVestingAccount.KotlinxSerializer::class)
@SerialName(value = "cosmos.vesting.v1beta1.BaseVestingAccount")
public data class BaseVestingAccount(
  @ProtobufIndex(index = 1)
  public val baseAccount: BaseAccount,
  @ProtobufIndex(index = 2)
  public val originalVesting: List<Coin>,
  @ProtobufIndex(index = 3)
  public val delegatedFree: List<Coin>,
  @ProtobufIndex(index = 4)
  public val delegatedVesting: List<Coin>,
  @ProtobufIndex(index = 5)
  public val endTime: Long,
) {
  public object KotlinxSerializer : KSerializer<BaseVestingAccount> {
    private val delegator: KSerializer<BaseVestingAccount> = BaseVestingAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BaseVestingAccount): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(BaseVestingAccountMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BaseVestingAccount {
      if (decoder is ProtobufMapperDecoder) {
        return BaseVestingAccountMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ContinuousVestingAccount.KotlinxSerializer::class)
@SerialName(value = "cosmos.vesting.v1beta1.ContinuousVestingAccount")
public data class ContinuousVestingAccount(
  @ProtobufIndex(index = 1)
  public val baseVestingAccount: BaseVestingAccount,
  @ProtobufIndex(index = 2)
  public val startTime: Long,
) {
  public object KotlinxSerializer : KSerializer<ContinuousVestingAccount> {
    private val delegator: KSerializer<ContinuousVestingAccount> =
        ContinuousVestingAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContinuousVestingAccount): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ContinuousVestingAccountMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContinuousVestingAccount {
      if (decoder is ProtobufMapperDecoder) {
        return ContinuousVestingAccountMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DelayedVestingAccount.KotlinxSerializer::class)
@SerialName(value = "cosmos.vesting.v1beta1.DelayedVestingAccount")
public data class DelayedVestingAccount(
  @ProtobufIndex(index = 1)
  public val baseVestingAccount: BaseVestingAccount,
) {
  public object KotlinxSerializer : KSerializer<DelayedVestingAccount> {
    private val delegator: KSerializer<DelayedVestingAccount> = DelayedVestingAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DelayedVestingAccount): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DelayedVestingAccountMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DelayedVestingAccount {
      if (decoder is ProtobufMapperDecoder) {
        return DelayedVestingAccountMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Period.KotlinxSerializer::class)
@SerialName(value = "cosmos.vesting.v1beta1.Period")
public data class Period(
  @ProtobufIndex(index = 1)
  public val length: Long,
  @ProtobufIndex(index = 2)
  public val amount: List<Coin>,
) {
  public object KotlinxSerializer : KSerializer<Period> {
    private val delegator: KSerializer<Period> = Period.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Period): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(PeriodMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Period {
      if (decoder is ProtobufMapperDecoder) {
        return PeriodMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PeriodicVestingAccount.KotlinxSerializer::class)
@SerialName(value = "cosmos.vesting.v1beta1.PeriodicVestingAccount")
public data class PeriodicVestingAccount(
  @ProtobufIndex(index = 1)
  public val baseVestingAccount: BaseVestingAccount,
  @ProtobufIndex(index = 2)
  public val startTime: Long,
  @ProtobufIndex(index = 3)
  public val vestingPeriods: List<Period>,
) {
  public object KotlinxSerializer : KSerializer<PeriodicVestingAccount> {
    private val delegator: KSerializer<PeriodicVestingAccount> = PeriodicVestingAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PeriodicVestingAccount): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(PeriodicVestingAccountMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PeriodicVestingAccount {
      if (decoder is ProtobufMapperDecoder) {
        return PeriodicVestingAccountMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PermanentLockedAccount.KotlinxSerializer::class)
@SerialName(value = "cosmos.vesting.v1beta1.PermanentLockedAccount")
public data class PermanentLockedAccount(
  @ProtobufIndex(index = 1)
  public val baseVestingAccount: BaseVestingAccount,
) {
  public object KotlinxSerializer : KSerializer<PermanentLockedAccount> {
    private val delegator: KSerializer<PermanentLockedAccount> = PermanentLockedAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PermanentLockedAccount): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(PermanentLockedAccountMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PermanentLockedAccount {
      if (decoder is ProtobufMapperDecoder) {
        return PermanentLockedAccountMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
