// Transform from cosmos/staking/v1beta1/staking.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.staking.v1beta1

import cosmos.base.v1beta1.Coin
import google.protobuf.Any
import google.protobuf.Duration
import google.protobuf.Timestamp
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
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
import tendermint.abci.ValidatorUpdate
import tendermint.types.Header

@Serializable
@SerialName(value = "cosmos.staking.v1beta1.BondStatus")
public enum class BondStatus(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  BOND_STATUS_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  BOND_STATUS_UNBONDED(1),
  @ProtobufIndex(index = 2)
  BOND_STATUS_UNBONDING(2),
  @ProtobufIndex(index = 3)
  BOND_STATUS_BONDED(3),
  ;

  public companion object {
    public fun forNumber(number: Int): BondStatus = BondStatus.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "cosmos.staking.v1beta1.Infraction")
public enum class Infraction(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  INFRACTION_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  INFRACTION_DOUBLE_SIGN(1),
  @ProtobufIndex(index = 2)
  INFRACTION_DOWNTIME(2),
  ;

  public companion object {
    public fun forNumber(number: Int): Infraction = Infraction.values()
    	.first { it.number == number }
  }
}

@Serializable(with = HistoricalInfo.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.HistoricalInfo")
public data class HistoricalInfo(
  @ProtobufIndex(index = 1)
  public val `header`: Header,
  @ProtobufIndex(index = 2)
  public val valset: List<Validator>,
) {
  public object KotlinxSerializer : KSerializer<HistoricalInfo> {
    private val delegator: KSerializer<HistoricalInfo> = HistoricalInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: HistoricalInfo): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(HistoricalInfoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): HistoricalInfo {
      if (decoder is ProtobufMapperDecoder) {
        return HistoricalInfoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CommissionRates.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.CommissionRates")
public data class CommissionRates(
  @ProtobufIndex(index = 1)
  public val rate: String,
  @ProtobufIndex(index = 2)
  public val maxRate: String,
  @ProtobufIndex(index = 3)
  public val maxChangeRate: String,
) {
  public object KotlinxSerializer : KSerializer<CommissionRates> {
    private val delegator: KSerializer<CommissionRates> = CommissionRates.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CommissionRates): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(CommissionRatesMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CommissionRates {
      if (decoder is ProtobufMapperDecoder) {
        return CommissionRatesMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Commission.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.Commission")
public data class Commission(
  @ProtobufIndex(index = 1)
  public val commissionRates: CommissionRates,
  @ProtobufIndex(index = 2)
  public val updateTime: Timestamp,
) {
  public object KotlinxSerializer : KSerializer<Commission> {
    private val delegator: KSerializer<Commission> = Commission.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Commission): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(CommissionMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Commission {
      if (decoder is ProtobufMapperDecoder) {
        return CommissionMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Description.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.Description")
public data class Description(
  @ProtobufIndex(index = 1)
  public val moniker: String,
  @ProtobufIndex(index = 2)
  public val identity: String,
  @ProtobufIndex(index = 3)
  public val website: String,
  @ProtobufIndex(index = 4)
  public val securityContact: String,
  @ProtobufIndex(index = 5)
  public val details: String,
) {
  public object KotlinxSerializer : KSerializer<Description> {
    private val delegator: KSerializer<Description> = Description.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Description): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DescriptionMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Description {
      if (decoder is ProtobufMapperDecoder) {
        return DescriptionMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Validator.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.Validator")
public data class Validator(
  @ProtobufIndex(index = 1)
  public val operatorAddress: String,
  @ProtobufIndex(index = 2)
  public val consensusPubkey: Any,
  @ProtobufIndex(index = 3)
  public val jailed: Boolean,
  @ProtobufIndex(index = 4)
  public val status: BondStatus,
  @ProtobufIndex(index = 5)
  public val tokens: String,
  @ProtobufIndex(index = 6)
  public val delegatorShares: String,
  @ProtobufIndex(index = 7)
  public val description: Description,
  @ProtobufIndex(index = 8)
  public val unbondingHeight: Long,
  @ProtobufIndex(index = 9)
  public val unbondingTime: Timestamp,
  @ProtobufIndex(index = 10)
  public val commission: Commission,
  @ProtobufIndex(index = 11)
  public val minSelfDelegation: String,
  @ProtobufIndex(index = 12)
  public val unbondingOnHoldRefCount: Long,
  @ProtobufIndex(index = 13)
  public val unbondingIds: List<ULong>,
) {
  public object KotlinxSerializer : KSerializer<Validator> {
    private val delegator: KSerializer<Validator> = Validator.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Validator): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Validator {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValAddresses.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.ValAddresses")
public data class ValAddresses(
  @ProtobufIndex(index = 1)
  public val addresses: List<String>,
) {
  public object KotlinxSerializer : KSerializer<ValAddresses> {
    private val delegator: KSerializer<ValAddresses> = ValAddresses.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValAddresses): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValAddressesMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValAddresses {
      if (decoder is ProtobufMapperDecoder) {
        return ValAddressesMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DVPair.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.DVPair")
public data class DVPair(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
) {
  public object KotlinxSerializer : KSerializer<DVPair> {
    private val delegator: KSerializer<DVPair> = DVPair.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DVPair): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DVPairMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DVPair {
      if (decoder is ProtobufMapperDecoder) {
        return DVPairMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DVPairs.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.DVPairs")
public data class DVPairs(
  @ProtobufIndex(index = 1)
  public val pairs: List<DVPair>,
) {
  public object KotlinxSerializer : KSerializer<DVPairs> {
    private val delegator: KSerializer<DVPairs> = DVPairs.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DVPairs): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DVPairsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DVPairs {
      if (decoder is ProtobufMapperDecoder) {
        return DVPairsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DVVTriplet.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.DVVTriplet")
public data class DVVTriplet(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorSrcAddress: String,
  @ProtobufIndex(index = 3)
  public val validatorDstAddress: String,
) {
  public object KotlinxSerializer : KSerializer<DVVTriplet> {
    private val delegator: KSerializer<DVVTriplet> = DVVTriplet.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DVVTriplet): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DVVTripletMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DVVTriplet {
      if (decoder is ProtobufMapperDecoder) {
        return DVVTripletMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DVVTriplets.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.DVVTriplets")
public data class DVVTriplets(
  @ProtobufIndex(index = 1)
  public val triplets: List<DVVTriplet>,
) {
  public object KotlinxSerializer : KSerializer<DVVTriplets> {
    private val delegator: KSerializer<DVVTriplets> = DVVTriplets.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DVVTriplets): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DVVTripletsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DVVTriplets {
      if (decoder is ProtobufMapperDecoder) {
        return DVVTripletsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Delegation.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.Delegation")
public data class Delegation(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val shares: String,
) {
  public object KotlinxSerializer : KSerializer<Delegation> {
    private val delegator: KSerializer<Delegation> = Delegation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Delegation): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DelegationMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Delegation {
      if (decoder is ProtobufMapperDecoder) {
        return DelegationMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = UnbondingDelegation.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.UnbondingDelegation")
public data class UnbondingDelegation(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val entries: List<UnbondingDelegationEntry>,
) {
  public object KotlinxSerializer : KSerializer<UnbondingDelegation> {
    private val delegator: KSerializer<UnbondingDelegation> = UnbondingDelegation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UnbondingDelegation): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(UnbondingDelegationMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UnbondingDelegation {
      if (decoder is ProtobufMapperDecoder) {
        return UnbondingDelegationMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = UnbondingDelegationEntry.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.UnbondingDelegationEntry")
public data class UnbondingDelegationEntry(
  @ProtobufIndex(index = 1)
  public val creationHeight: Long,
  @ProtobufIndex(index = 2)
  public val completionTime: Timestamp,
  @ProtobufIndex(index = 3)
  public val initialBalance: String,
  @ProtobufIndex(index = 4)
  public val balance: String,
  @ProtobufIndex(index = 5)
  public val unbondingId: ULong,
  @ProtobufIndex(index = 6)
  public val unbondingOnHoldRefCount: Long,
) {
  public object KotlinxSerializer : KSerializer<UnbondingDelegationEntry> {
    private val delegator: KSerializer<UnbondingDelegationEntry> =
        UnbondingDelegationEntry.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UnbondingDelegationEntry): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(UnbondingDelegationEntryMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UnbondingDelegationEntry {
      if (decoder is ProtobufMapperDecoder) {
        return UnbondingDelegationEntryMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RedelegationEntry.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.RedelegationEntry")
public data class RedelegationEntry(
  @ProtobufIndex(index = 1)
  public val creationHeight: Long,
  @ProtobufIndex(index = 2)
  public val completionTime: Timestamp,
  @ProtobufIndex(index = 3)
  public val initialBalance: String,
  @ProtobufIndex(index = 4)
  public val sharesDst: String,
  @ProtobufIndex(index = 5)
  public val unbondingId: ULong,
  @ProtobufIndex(index = 6)
  public val unbondingOnHoldRefCount: Long,
) {
  public object KotlinxSerializer : KSerializer<RedelegationEntry> {
    private val delegator: KSerializer<RedelegationEntry> = RedelegationEntry.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RedelegationEntry): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RedelegationEntryMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RedelegationEntry {
      if (decoder is ProtobufMapperDecoder) {
        return RedelegationEntryMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Redelegation.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.Redelegation")
public data class Redelegation(
  @ProtobufIndex(index = 1)
  public val delegatorAddress: String,
  @ProtobufIndex(index = 2)
  public val validatorSrcAddress: String,
  @ProtobufIndex(index = 3)
  public val validatorDstAddress: String,
  @ProtobufIndex(index = 4)
  public val entries: List<RedelegationEntry>,
) {
  public object KotlinxSerializer : KSerializer<Redelegation> {
    private val delegator: KSerializer<Redelegation> = Redelegation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Redelegation): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RedelegationMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Redelegation {
      if (decoder is ProtobufMapperDecoder) {
        return RedelegationMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.Params")
public data class Params(
  @ProtobufIndex(index = 1)
  public val unbondingTime: Duration,
  @ProtobufIndex(index = 2)
  public val maxValidators: UInt,
  @ProtobufIndex(index = 3)
  public val maxEntries: UInt,
  @ProtobufIndex(index = 4)
  public val historicalEntries: UInt,
  @ProtobufIndex(index = 5)
  public val bondDenom: String,
  @ProtobufIndex(index = 6)
  public val minCommissionRate: String,
) {
  public object KotlinxSerializer : KSerializer<Params> {
    private val delegator: KSerializer<Params> = Params.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Params): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ParamsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Params {
      if (decoder is ProtobufMapperDecoder) {
        return ParamsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DelegationResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.DelegationResponse")
public data class DelegationResponse(
  @ProtobufIndex(index = 1)
  public val delegation: Delegation,
  @ProtobufIndex(index = 2)
  public val balance: Coin,
) {
  public object KotlinxSerializer : KSerializer<DelegationResponse> {
    private val delegator: KSerializer<DelegationResponse> = DelegationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DelegationResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DelegationResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DelegationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return DelegationResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RedelegationEntryResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.RedelegationEntryResponse")
public data class RedelegationEntryResponse(
  @ProtobufIndex(index = 1)
  public val redelegationEntry: RedelegationEntry,
  @ProtobufIndex(index = 4)
  public val balance: String,
) {
  public object KotlinxSerializer : KSerializer<RedelegationEntryResponse> {
    private val delegator: KSerializer<RedelegationEntryResponse> =
        RedelegationEntryResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RedelegationEntryResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RedelegationEntryResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RedelegationEntryResponse {
      if (decoder is ProtobufMapperDecoder) {
        return RedelegationEntryResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RedelegationResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.RedelegationResponse")
public data class RedelegationResponse(
  @ProtobufIndex(index = 1)
  public val redelegation: Redelegation,
  @ProtobufIndex(index = 2)
  public val entries: List<RedelegationEntryResponse>,
) {
  public object KotlinxSerializer : KSerializer<RedelegationResponse> {
    private val delegator: KSerializer<RedelegationResponse> = RedelegationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RedelegationResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RedelegationResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RedelegationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return RedelegationResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Pool.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.Pool")
public data class Pool(
  @ProtobufIndex(index = 1)
  public val notBondedTokens: String,
  @ProtobufIndex(index = 2)
  public val bondedTokens: String,
) {
  public object KotlinxSerializer : KSerializer<Pool> {
    private val delegator: KSerializer<Pool> = Pool.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Pool): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(PoolMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Pool {
      if (decoder is ProtobufMapperDecoder) {
        return PoolMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorUpdates.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.ValidatorUpdates")
public data class ValidatorUpdates(
  @ProtobufIndex(index = 1)
  public val updates: List<ValidatorUpdate>,
) {
  public object KotlinxSerializer : KSerializer<ValidatorUpdates> {
    private val delegator: KSerializer<ValidatorUpdates> = ValidatorUpdates.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorUpdates): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorUpdatesMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorUpdates {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorUpdatesMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
