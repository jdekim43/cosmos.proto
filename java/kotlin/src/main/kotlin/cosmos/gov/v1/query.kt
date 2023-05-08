// Transform from cosmos/gov/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.gov.v1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import kotlin.Deprecated
import kotlin.DeprecationLevel
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

@Serializable(with = QueryProposalRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryProposalRequest")
public data class QueryProposalRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) {
  public object KotlinxSerializer : KSerializer<QueryProposalRequest> {
    private val delegator: KSerializer<QueryProposalRequest> = QueryProposalRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryProposalRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProposalResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryProposalResponse")
public data class QueryProposalResponse(
  @ProtobufIndex(index = 1)
  public val proposal: Proposal,
) {
  public object KotlinxSerializer : KSerializer<QueryProposalResponse> {
    private val delegator: KSerializer<QueryProposalResponse> = QueryProposalResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryProposalResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProposalsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryProposalsRequest")
public data class QueryProposalsRequest(
  @ProtobufIndex(index = 1)
  public val proposalStatus: ProposalStatus,
  @ProtobufIndex(index = 2)
  public val voter: String,
  @ProtobufIndex(index = 3)
  public val depositor: String,
  @ProtobufIndex(index = 4)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryProposalsRequest> {
    private val delegator: KSerializer<QueryProposalsRequest> = QueryProposalsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryProposalsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProposalsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryProposalsResponse")
public data class QueryProposalsResponse(
  @ProtobufIndex(index = 1)
  public val proposals: List<Proposal>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryProposalsResponse> {
    private val delegator: KSerializer<QueryProposalsResponse> = QueryProposalsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryProposalsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVoteRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryVoteRequest")
public data class QueryVoteRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val voter: String,
) {
  public object KotlinxSerializer : KSerializer<QueryVoteRequest> {
    private val delegator: KSerializer<QueryVoteRequest> = QueryVoteRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVoteRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryVoteRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVoteRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVoteRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVoteResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryVoteResponse")
public data class QueryVoteResponse(
  @ProtobufIndex(index = 1)
  public val vote: Vote,
) {
  public object KotlinxSerializer : KSerializer<QueryVoteResponse> {
    private val delegator: KSerializer<QueryVoteResponse> = QueryVoteResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVoteResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryVoteResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVoteResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVoteResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotesRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryVotesRequest")
public data class QueryVotesRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryVotesRequest> {
    private val delegator: KSerializer<QueryVotesRequest> = QueryVotesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotesRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryVotesRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotesRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotesResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryVotesResponse")
public data class QueryVotesResponse(
  @ProtobufIndex(index = 1)
  public val votes: List<Vote>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryVotesResponse> {
    private val delegator: KSerializer<QueryVotesResponse> = QueryVotesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotesResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryVotesResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotesResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryParamsRequest")
public data class QueryParamsRequest(
  @ProtobufIndex(index = 1)
  public val paramsType: String,
) {
  public object KotlinxSerializer : KSerializer<QueryParamsRequest> {
    private val delegator: KSerializer<QueryParamsRequest> = QueryParamsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryParamsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryParamsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryParamsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryParamsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryParamsResponse")
public data class QueryParamsResponse(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val votingParams: VotingParams,
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 2)
  public val depositParams: DepositParams,
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 3)
  public val tallyParams: TallyParams,
  @ProtobufIndex(index = 4)
  public val params: Params,
) {
  public object KotlinxSerializer : KSerializer<QueryParamsResponse> {
    private val delegator: KSerializer<QueryParamsResponse> = QueryParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryParamsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryParamsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryParamsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDepositRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryDepositRequest")
public data class QueryDepositRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val depositor: String,
) {
  public object KotlinxSerializer : KSerializer<QueryDepositRequest> {
    private val delegator: KSerializer<QueryDepositRequest> = QueryDepositRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDepositRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDepositRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDepositRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDepositRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDepositResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryDepositResponse")
public data class QueryDepositResponse(
  @ProtobufIndex(index = 1)
  public val deposit: Deposit,
) {
  public object KotlinxSerializer : KSerializer<QueryDepositResponse> {
    private val delegator: KSerializer<QueryDepositResponse> = QueryDepositResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDepositResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDepositResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDepositResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDepositResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDepositsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryDepositsRequest")
public data class QueryDepositsRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryDepositsRequest> {
    private val delegator: KSerializer<QueryDepositsRequest> = QueryDepositsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDepositsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDepositsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDepositsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDepositsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDepositsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryDepositsResponse")
public data class QueryDepositsResponse(
  @ProtobufIndex(index = 1)
  public val deposits: List<Deposit>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryDepositsResponse> {
    private val delegator: KSerializer<QueryDepositsResponse> = QueryDepositsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDepositsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDepositsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDepositsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDepositsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTallyResultRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryTallyResultRequest")
public data class QueryTallyResultRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) {
  public object KotlinxSerializer : KSerializer<QueryTallyResultRequest> {
    private val delegator: KSerializer<QueryTallyResultRequest> =
        QueryTallyResultRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTallyResultRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryTallyResultRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTallyResultRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTallyResultRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTallyResultResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.gov.v1.QueryTallyResultResponse")
public data class QueryTallyResultResponse(
  @ProtobufIndex(index = 1)
  public val tally: TallyResult,
) {
  public object KotlinxSerializer : KSerializer<QueryTallyResultResponse> {
    private val delegator: KSerializer<QueryTallyResultResponse> =
        QueryTallyResultResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTallyResultResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryTallyResultResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTallyResultResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTallyResultResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
