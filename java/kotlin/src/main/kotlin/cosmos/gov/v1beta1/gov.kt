// Transform from cosmos/gov/v1beta1/gov.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.gov.v1beta1

import cosmos.base.v1beta1.Coin
import google.protobuf.Any
import google.protobuf.Duration
import google.protobuf.Timestamp
import kotlin.ByteArray
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.ReplaceWith
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

@Serializable
@SerialName(value = "cosmos.gov.v1beta1.VoteOption")
public enum class VoteOption(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  VOTE_OPTION_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  VOTE_OPTION_YES(1),
  @ProtobufIndex(index = 2)
  VOTE_OPTION_ABSTAIN(2),
  @ProtobufIndex(index = 3)
  VOTE_OPTION_NO(3),
  @ProtobufIndex(index = 4)
  VOTE_OPTION_NO_WITH_VETO(4),
  ;

  public companion object {
    public fun forNumber(number: Int): VoteOption = VoteOption.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "cosmos.gov.v1beta1.ProposalStatus")
public enum class ProposalStatus(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  PROPOSAL_STATUS_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  PROPOSAL_STATUS_DEPOSIT_PERIOD(1),
  @ProtobufIndex(index = 2)
  PROPOSAL_STATUS_VOTING_PERIOD(2),
  @ProtobufIndex(index = 3)
  PROPOSAL_STATUS_PASSED(3),
  @ProtobufIndex(index = 4)
  PROPOSAL_STATUS_REJECTED(4),
  @ProtobufIndex(index = 5)
  PROPOSAL_STATUS_FAILED(5),
  ;

  public companion object {
    public fun forNumber(number: Int): ProposalStatus = ProposalStatus.values()
    	.first { it.number == number }
  }
}

@Serializable(with = WeightedVoteOption.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1beta1.WeightedVoteOption")
public data class WeightedVoteOption(
  @ProtobufIndex(index = 1)
  public val option: VoteOption,
  @ProtobufIndex(index = 2)
  public val weight: String,
) {
  public object KotlinxSerializer : KSerializer<WeightedVoteOption> {
    private val delegator: KSerializer<WeightedVoteOption> = WeightedVoteOption.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: WeightedVoteOption): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(WeightedVoteOptionMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): WeightedVoteOption {
      if (decoder is ProtobufMapperDecoder) {
        return WeightedVoteOptionMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TextProposal.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1beta1.TextProposal")
public data class TextProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
) {
  public object KotlinxSerializer : KSerializer<TextProposal> {
    private val delegator: KSerializer<TextProposal> = TextProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TextProposal): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(TextProposalMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TextProposal {
      if (decoder is ProtobufMapperDecoder) {
        return TextProposalMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Deposit.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1beta1.Deposit")
public data class Deposit(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val depositor: String,
  @ProtobufIndex(index = 3)
  public val amount: List<Coin>,
) {
  public object KotlinxSerializer : KSerializer<Deposit> {
    private val delegator: KSerializer<Deposit> = Deposit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Deposit): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DepositMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Deposit {
      if (decoder is ProtobufMapperDecoder) {
        return DepositMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Proposal.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1beta1.Proposal")
public data class Proposal(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val content: Any,
  @ProtobufIndex(index = 3)
  public val status: ProposalStatus,
  @ProtobufIndex(index = 4)
  public val finalTallyResult: TallyResult,
  @ProtobufIndex(index = 5)
  public val submitTime: Timestamp,
  @ProtobufIndex(index = 6)
  public val depositEndTime: Timestamp,
  @ProtobufIndex(index = 7)
  public val totalDeposit: List<Coin>,
  @ProtobufIndex(index = 8)
  public val votingStartTime: Timestamp,
  @ProtobufIndex(index = 9)
  public val votingEndTime: Timestamp,
) {
  public object KotlinxSerializer : KSerializer<Proposal> {
    private val delegator: KSerializer<Proposal> = Proposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Proposal): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ProposalMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Proposal {
      if (decoder is ProtobufMapperDecoder) {
        return ProposalMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TallyResult.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1beta1.TallyResult")
public data class TallyResult(
  @ProtobufIndex(index = 1)
  public val yes: String,
  @ProtobufIndex(index = 2)
  public val abstain: String,
  @ProtobufIndex(index = 3)
  public val no: String,
  @ProtobufIndex(index = 4)
  public val noWithVeto: String,
) {
  public object KotlinxSerializer : KSerializer<TallyResult> {
    private val delegator: KSerializer<TallyResult> = TallyResult.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TallyResult): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(TallyResultMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TallyResult {
      if (decoder is ProtobufMapperDecoder) {
        return TallyResultMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Vote.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1beta1.Vote")
public data class Vote(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val voter: String,
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 3)
  public val option: VoteOption,
  @ProtobufIndex(index = 4)
  public val options: List<WeightedVoteOption>,
) {
  public object KotlinxSerializer : KSerializer<Vote> {
    private val delegator: KSerializer<Vote> = Vote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Vote): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(VoteMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Vote {
      if (decoder is ProtobufMapperDecoder) {
        return VoteMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DepositParams.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1beta1.DepositParams")
public data class DepositParams(
  @ProtobufIndex(index = 1)
  public val minDeposit: List<Coin>,
  @ProtobufIndex(index = 2)
  public val maxDepositPeriod: Duration,
) {
  public object KotlinxSerializer : KSerializer<DepositParams> {
    private val delegator: KSerializer<DepositParams> = DepositParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DepositParams): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DepositParamsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DepositParams {
      if (decoder is ProtobufMapperDecoder) {
        return DepositParamsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = VotingParams.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1beta1.VotingParams")
public data class VotingParams(
  @ProtobufIndex(index = 1)
  public val votingPeriod: Duration,
) {
  public object KotlinxSerializer : KSerializer<VotingParams> {
    private val delegator: KSerializer<VotingParams> = VotingParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: VotingParams): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(VotingParamsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): VotingParams {
      if (decoder is ProtobufMapperDecoder) {
        return VotingParamsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TallyParams.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1beta1.TallyParams")
public data class TallyParams(
  @ProtobufIndex(index = 1)
  public val quorum: ByteArray,
  @ProtobufIndex(index = 2)
  public val threshold: ByteArray,
  @ProtobufIndex(index = 3)
  public val vetoThreshold: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<TallyParams> {
    private val delegator: KSerializer<TallyParams> = TallyParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TallyParams): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(TallyParamsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TallyParams {
      if (decoder is ProtobufMapperDecoder) {
        return TallyParamsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
