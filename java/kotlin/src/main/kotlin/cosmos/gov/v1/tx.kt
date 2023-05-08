// Transform from cosmos/gov/v1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.gov.v1

import cosmos.base.v1beta1.Coin
import google.protobuf.Any
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

@Serializable(with = MsgSubmitProposal.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.MsgSubmitProposal")
public data class MsgSubmitProposal(
  @ProtobufIndex(index = 1)
  public val messages: List<Any>,
  @ProtobufIndex(index = 2)
  public val initialDeposit: List<Coin>,
  @ProtobufIndex(index = 3)
  public val proposer: String,
  @ProtobufIndex(index = 4)
  public val metadata: String,
  @ProtobufIndex(index = 5)
  public val title: String,
  @ProtobufIndex(index = 6)
  public val summary: String,
) {
  public object KotlinxSerializer : KSerializer<MsgSubmitProposal> {
    private val delegator: KSerializer<MsgSubmitProposal> = MsgSubmitProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSubmitProposal): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgSubmitProposalMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSubmitProposal {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSubmitProposalMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSubmitProposalResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.MsgSubmitProposalResponse")
public data class MsgSubmitProposalResponse(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) {
  public object KotlinxSerializer : KSerializer<MsgSubmitProposalResponse> {
    private val delegator: KSerializer<MsgSubmitProposalResponse> =
        MsgSubmitProposalResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSubmitProposalResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgSubmitProposalResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSubmitProposalResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSubmitProposalResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExecLegacyContent.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.MsgExecLegacyContent")
public data class MsgExecLegacyContent(
  @ProtobufIndex(index = 1)
  public val content: Any,
  @ProtobufIndex(index = 2)
  public val authority: String,
) {
  public object KotlinxSerializer : KSerializer<MsgExecLegacyContent> {
    private val delegator: KSerializer<MsgExecLegacyContent> = MsgExecLegacyContent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExecLegacyContent): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgExecLegacyContentMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExecLegacyContent {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExecLegacyContentMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExecLegacyContentResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.MsgExecLegacyContentResponse")
public class MsgExecLegacyContentResponse() {
  public object KotlinxSerializer : KSerializer<MsgExecLegacyContentResponse> {
    private val delegator: KSerializer<MsgExecLegacyContentResponse> =
        MsgExecLegacyContentResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExecLegacyContentResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgExecLegacyContentResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExecLegacyContentResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExecLegacyContentResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgVote.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.MsgVote")
public data class MsgVote(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val voter: String,
  @ProtobufIndex(index = 3)
  public val option: VoteOption,
  @ProtobufIndex(index = 4)
  public val metadata: String,
) {
  public object KotlinxSerializer : KSerializer<MsgVote> {
    private val delegator: KSerializer<MsgVote> = MsgVote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVote): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgVoteMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVote {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVoteMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgVoteResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.MsgVoteResponse")
public class MsgVoteResponse() {
  public object KotlinxSerializer : KSerializer<MsgVoteResponse> {
    private val delegator: KSerializer<MsgVoteResponse> = MsgVoteResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVoteResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgVoteResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVoteResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVoteResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgVoteWeighted.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.MsgVoteWeighted")
public data class MsgVoteWeighted(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val voter: String,
  @ProtobufIndex(index = 3)
  public val options: List<WeightedVoteOption>,
  @ProtobufIndex(index = 4)
  public val metadata: String,
) {
  public object KotlinxSerializer : KSerializer<MsgVoteWeighted> {
    private val delegator: KSerializer<MsgVoteWeighted> = MsgVoteWeighted.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVoteWeighted): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgVoteWeightedMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVoteWeighted {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVoteWeightedMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgVoteWeightedResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.MsgVoteWeightedResponse")
public class MsgVoteWeightedResponse() {
  public object KotlinxSerializer : KSerializer<MsgVoteWeightedResponse> {
    private val delegator: KSerializer<MsgVoteWeightedResponse> =
        MsgVoteWeightedResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVoteWeightedResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgVoteWeightedResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVoteWeightedResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVoteWeightedResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDeposit.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.MsgDeposit")
public data class MsgDeposit(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val depositor: String,
  @ProtobufIndex(index = 3)
  public val amount: List<Coin>,
) {
  public object KotlinxSerializer : KSerializer<MsgDeposit> {
    private val delegator: KSerializer<MsgDeposit> = MsgDeposit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDeposit): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgDepositMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDeposit {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDepositMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDepositResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.MsgDepositResponse")
public class MsgDepositResponse() {
  public object KotlinxSerializer : KSerializer<MsgDepositResponse> {
    private val delegator: KSerializer<MsgDepositResponse> = MsgDepositResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDepositResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgDepositResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDepositResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDepositResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.MsgUpdateParams")
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
@SerialName(value = "cosmos.gov.v1.MsgUpdateParamsResponse")
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
