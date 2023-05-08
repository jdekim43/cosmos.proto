// Transform from cosmos/distribution/v1beta1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.distribution.v1beta1

import cosmos.base.v1beta1.DecCoin
import kotlin.String
import kotlin.ULong
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

@Serializable(with = DelegatorWithdrawInfo.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.DelegatorWithdrawInfo")
public data class DelegatorWithdrawInfo(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val withdrawAddress: String,
) {
  public object KotlinxSerializer : KSerializer<DelegatorWithdrawInfo> {
    private val delegator: KSerializer<DelegatorWithdrawInfo> = DelegatorWithdrawInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DelegatorWithdrawInfo): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DelegatorWithdrawInfoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DelegatorWithdrawInfo {
      if (decoder is ProtobufMapperDecoder) {
        return DelegatorWithdrawInfoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorOutstandingRewardsRecord.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord")
public data class ValidatorOutstandingRewardsRecord(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val outstandingRewards: List<DecCoin>,
) {
  public object KotlinxSerializer : KSerializer<ValidatorOutstandingRewardsRecord> {
    private val delegator: KSerializer<ValidatorOutstandingRewardsRecord> =
        ValidatorOutstandingRewardsRecord.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorOutstandingRewardsRecord):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorOutstandingRewardsRecordMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorOutstandingRewardsRecord {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorOutstandingRewardsRecordMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorAccumulatedCommissionRecord.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord")
public data class ValidatorAccumulatedCommissionRecord(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val accumulated: ValidatorAccumulatedCommission,
) {
  public object KotlinxSerializer : KSerializer<ValidatorAccumulatedCommissionRecord> {
    private val delegator: KSerializer<ValidatorAccumulatedCommissionRecord> =
        ValidatorAccumulatedCommissionRecord.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorAccumulatedCommissionRecord):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorAccumulatedCommissionRecordMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorAccumulatedCommissionRecord {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorAccumulatedCommissionRecordMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorHistoricalRewardsRecord.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord")
public data class ValidatorHistoricalRewardsRecord(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val period: ULong,
  @ProtobufIndex(index = 3)
  public val rewards: ValidatorHistoricalRewards,
) {
  public object KotlinxSerializer : KSerializer<ValidatorHistoricalRewardsRecord> {
    private val delegator: KSerializer<ValidatorHistoricalRewardsRecord> =
        ValidatorHistoricalRewardsRecord.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorHistoricalRewardsRecord):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorHistoricalRewardsRecordMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorHistoricalRewardsRecord {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorHistoricalRewardsRecordMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorCurrentRewardsRecord.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord")
public data class ValidatorCurrentRewardsRecord(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val rewards: ValidatorCurrentRewards,
) {
  public object KotlinxSerializer : KSerializer<ValidatorCurrentRewardsRecord> {
    private val delegator: KSerializer<ValidatorCurrentRewardsRecord> =
        ValidatorCurrentRewardsRecord.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorCurrentRewardsRecord): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorCurrentRewardsRecordMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorCurrentRewardsRecord {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorCurrentRewardsRecordMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DelegatorStartingInfoRecord.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.DelegatorStartingInfoRecord")
public data class DelegatorStartingInfoRecord(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val startingInfo: DelegatorStartingInfo,
) {
  public object KotlinxSerializer : KSerializer<DelegatorStartingInfoRecord> {
    private val delegator: KSerializer<DelegatorStartingInfoRecord> =
        DelegatorStartingInfoRecord.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DelegatorStartingInfoRecord): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DelegatorStartingInfoRecordMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DelegatorStartingInfoRecord {
      if (decoder is ProtobufMapperDecoder) {
        return DelegatorStartingInfoRecordMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorSlashEventRecord.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.ValidatorSlashEventRecord")
public data class ValidatorSlashEventRecord(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val height: ULong,
  @ProtobufIndex(index = 3)
  public val period: ULong,
  @ProtobufIndex(index = 4)
  public val validatorSlashEvent: ValidatorSlashEvent,
) {
  public object KotlinxSerializer : KSerializer<ValidatorSlashEventRecord> {
    private val delegator: KSerializer<ValidatorSlashEventRecord> =
        ValidatorSlashEventRecord.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorSlashEventRecord): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorSlashEventRecordMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorSlashEventRecord {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorSlashEventRecordMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = "cosmos.distribution.v1beta1.GenesisState")
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val params: Params,
  @ProtobufIndex(index = 2)
  public val feePool: FeePool,
  @ProtobufIndex(index = 3)
  public val delegatorWithdrawInfos: List<DelegatorWithdrawInfo>,
  @ProtobufIndex(index = 4)
  public val previousProposer: String,
  @ProtobufIndex(index = 5)
  public val outstandingRewards: List<ValidatorOutstandingRewardsRecord>,
  @ProtobufIndex(index = 6)
  public val validatorAccumulatedCommissions: List<ValidatorAccumulatedCommissionRecord>,
  @ProtobufIndex(index = 7)
  public val validatorHistoricalRewards: List<ValidatorHistoricalRewardsRecord>,
  @ProtobufIndex(index = 8)
  public val validatorCurrentRewards: List<ValidatorCurrentRewardsRecord>,
  @ProtobufIndex(index = 9)
  public val delegatorStartingInfos: List<DelegatorStartingInfoRecord>,
  @ProtobufIndex(index = 10)
  public val validatorSlashEvents: List<ValidatorSlashEventRecord>,
) {
  public object KotlinxSerializer : KSerializer<GenesisState> {
    private val delegator: KSerializer<GenesisState> = GenesisState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GenesisState): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GenesisStateMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GenesisState {
      if (decoder is ProtobufMapperDecoder) {
        return GenesisStateMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}