// Transform from cosmos/staking/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.staking.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import kotlin.Long
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

@Serializable(with = QueryValidatorsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryValidatorsRequest")
public data class QueryValidatorsRequest(
  @ProtobufIndex(index = 1)
  public val status: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryValidatorsRequest> {
    private val delegator: KSerializer<QueryValidatorsRequest> = QueryValidatorsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValidatorsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryValidatorsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryValidatorsResponse")
public data class QueryValidatorsResponse(
  @ProtobufIndex(index = 1)
  public val validators: List<Validator>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryValidatorsResponse> {
    private val delegator: KSerializer<QueryValidatorsResponse> =
        QueryValidatorsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValidatorsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryValidatorsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryValidatorRequest")
public data class QueryValidatorRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddr: String,
) {
  public object KotlinxSerializer : KSerializer<QueryValidatorRequest> {
    private val delegator: KSerializer<QueryValidatorRequest> = QueryValidatorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValidatorRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryValidatorRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryValidatorResponse")
public data class QueryValidatorResponse(
  @ProtobufIndex(index = 1)
  public val validator: Validator,
) {
  public object KotlinxSerializer : KSerializer<QueryValidatorResponse> {
    private val delegator: KSerializer<QueryValidatorResponse> = QueryValidatorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValidatorResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryValidatorResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorDelegationsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryValidatorDelegationsRequest")
public data class QueryValidatorDelegationsRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddr: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryValidatorDelegationsRequest> {
    private val delegator: KSerializer<QueryValidatorDelegationsRequest> =
        QueryValidatorDelegationsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValidatorDelegationsRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryValidatorDelegationsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorDelegationsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorDelegationsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorDelegationsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryValidatorDelegationsResponse")
public data class QueryValidatorDelegationsResponse(
  @ProtobufIndex(index = 1)
  public val delegationResponses: List<DelegationResponse>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryValidatorDelegationsResponse> {
    private val delegator: KSerializer<QueryValidatorDelegationsResponse> =
        QueryValidatorDelegationsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValidatorDelegationsResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryValidatorDelegationsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorDelegationsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorDelegationsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorUnbondingDelegationsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsRequest")
public data class QueryValidatorUnbondingDelegationsRequest(
  @ProtobufIndex(index = 1)
  public val validatorAddr: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryValidatorUnbondingDelegationsRequest> {
    private val delegator: KSerializer<QueryValidatorUnbondingDelegationsRequest> =
        QueryValidatorUnbondingDelegationsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryValidatorUnbondingDelegationsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryValidatorUnbondingDelegationsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorUnbondingDelegationsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorUnbondingDelegationsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValidatorUnbondingDelegationsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryValidatorUnbondingDelegationsResponse")
public data class QueryValidatorUnbondingDelegationsResponse(
  @ProtobufIndex(index = 1)
  public val unbondingResponses: List<UnbondingDelegation>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryValidatorUnbondingDelegationsResponse> {
    private val delegator: KSerializer<QueryValidatorUnbondingDelegationsResponse> =
        QueryValidatorUnbondingDelegationsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryValidatorUnbondingDelegationsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryValidatorUnbondingDelegationsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValidatorUnbondingDelegationsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValidatorUnbondingDelegationsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegationRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryDelegationRequest")
public data class QueryDelegationRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val validatorAddr: String,
) {
  public object KotlinxSerializer : KSerializer<QueryDelegationRequest> {
    private val delegator: KSerializer<QueryDelegationRequest> = QueryDelegationRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegationRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDelegationRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegationRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegationRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegationResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryDelegationResponse")
public data class QueryDelegationResponse(
  @ProtobufIndex(index = 1)
  public val delegationResponse: DelegationResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryDelegationResponse> {
    private val delegator: KSerializer<QueryDelegationResponse> =
        QueryDelegationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegationResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDelegationResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegationResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryUnbondingDelegationRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryUnbondingDelegationRequest")
public data class QueryUnbondingDelegationRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val validatorAddr: String,
) {
  public object KotlinxSerializer : KSerializer<QueryUnbondingDelegationRequest> {
    private val delegator: KSerializer<QueryUnbondingDelegationRequest> =
        QueryUnbondingDelegationRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryUnbondingDelegationRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryUnbondingDelegationRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryUnbondingDelegationRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryUnbondingDelegationRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryUnbondingDelegationResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryUnbondingDelegationResponse")
public data class QueryUnbondingDelegationResponse(
  @ProtobufIndex(index = 1)
  public val unbond: UnbondingDelegation,
) {
  public object KotlinxSerializer : KSerializer<QueryUnbondingDelegationResponse> {
    private val delegator: KSerializer<QueryUnbondingDelegationResponse> =
        QueryUnbondingDelegationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryUnbondingDelegationResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryUnbondingDelegationResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryUnbondingDelegationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryUnbondingDelegationResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegatorDelegationsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryDelegatorDelegationsRequest")
public data class QueryDelegatorDelegationsRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryDelegatorDelegationsRequest> {
    private val delegator: KSerializer<QueryDelegatorDelegationsRequest> =
        QueryDelegatorDelegationsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegatorDelegationsRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDelegatorDelegationsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegatorDelegationsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegatorDelegationsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegatorDelegationsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse")
public data class QueryDelegatorDelegationsResponse(
  @ProtobufIndex(index = 1)
  public val delegationResponses: List<DelegationResponse>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryDelegatorDelegationsResponse> {
    private val delegator: KSerializer<QueryDelegatorDelegationsResponse> =
        QueryDelegatorDelegationsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegatorDelegationsResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDelegatorDelegationsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegatorDelegationsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegatorDelegationsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegatorUnbondingDelegationsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsRequest")
public data class QueryDelegatorUnbondingDelegationsRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryDelegatorUnbondingDelegationsRequest> {
    private val delegator: KSerializer<QueryDelegatorUnbondingDelegationsRequest> =
        QueryDelegatorUnbondingDelegationsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryDelegatorUnbondingDelegationsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDelegatorUnbondingDelegationsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegatorUnbondingDelegationsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegatorUnbondingDelegationsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegatorUnbondingDelegationsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryDelegatorUnbondingDelegationsResponse")
public data class QueryDelegatorUnbondingDelegationsResponse(
  @ProtobufIndex(index = 1)
  public val unbondingResponses: List<UnbondingDelegation>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryDelegatorUnbondingDelegationsResponse> {
    private val delegator: KSerializer<QueryDelegatorUnbondingDelegationsResponse> =
        QueryDelegatorUnbondingDelegationsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryDelegatorUnbondingDelegationsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDelegatorUnbondingDelegationsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegatorUnbondingDelegationsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegatorUnbondingDelegationsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryRedelegationsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryRedelegationsRequest")
public data class QueryRedelegationsRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val srcValidatorAddr: String,
  @ProtobufIndex(index = 3)
  public val dstValidatorAddr: String,
  @ProtobufIndex(index = 4)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryRedelegationsRequest> {
    private val delegator: KSerializer<QueryRedelegationsRequest> =
        QueryRedelegationsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryRedelegationsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryRedelegationsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryRedelegationsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryRedelegationsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryRedelegationsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryRedelegationsResponse")
public data class QueryRedelegationsResponse(
  @ProtobufIndex(index = 1)
  public val redelegationResponses: List<RedelegationResponse>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryRedelegationsResponse> {
    private val delegator: KSerializer<QueryRedelegationsResponse> =
        QueryRedelegationsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryRedelegationsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryRedelegationsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryRedelegationsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryRedelegationsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegatorValidatorsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryDelegatorValidatorsRequest")
public data class QueryDelegatorValidatorsRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryDelegatorValidatorsRequest> {
    private val delegator: KSerializer<QueryDelegatorValidatorsRequest> =
        QueryDelegatorValidatorsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegatorValidatorsRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDelegatorValidatorsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegatorValidatorsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegatorValidatorsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegatorValidatorsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryDelegatorValidatorsResponse")
public data class QueryDelegatorValidatorsResponse(
  @ProtobufIndex(index = 1)
  public val validators: List<Validator>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryDelegatorValidatorsResponse> {
    private val delegator: KSerializer<QueryDelegatorValidatorsResponse> =
        QueryDelegatorValidatorsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegatorValidatorsResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDelegatorValidatorsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegatorValidatorsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegatorValidatorsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegatorValidatorRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryDelegatorValidatorRequest")
public data class QueryDelegatorValidatorRequest(
  @ProtobufIndex(index = 1)
  public val delegatorAddr: String,
  @ProtobufIndex(index = 2)
  public val validatorAddr: String,
) {
  public object KotlinxSerializer : KSerializer<QueryDelegatorValidatorRequest> {
    private val delegator: KSerializer<QueryDelegatorValidatorRequest> =
        QueryDelegatorValidatorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegatorValidatorRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDelegatorValidatorRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegatorValidatorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegatorValidatorRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegatorValidatorResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryDelegatorValidatorResponse")
public data class QueryDelegatorValidatorResponse(
  @ProtobufIndex(index = 1)
  public val validator: Validator,
) {
  public object KotlinxSerializer : KSerializer<QueryDelegatorValidatorResponse> {
    private val delegator: KSerializer<QueryDelegatorValidatorResponse> =
        QueryDelegatorValidatorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegatorValidatorResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDelegatorValidatorResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegatorValidatorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegatorValidatorResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryHistoricalInfoRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryHistoricalInfoRequest")
public data class QueryHistoricalInfoRequest(
  @ProtobufIndex(index = 1)
  public val height: Long,
) {
  public object KotlinxSerializer : KSerializer<QueryHistoricalInfoRequest> {
    private val delegator: KSerializer<QueryHistoricalInfoRequest> =
        QueryHistoricalInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryHistoricalInfoRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryHistoricalInfoRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryHistoricalInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryHistoricalInfoRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryHistoricalInfoResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryHistoricalInfoResponse")
public data class QueryHistoricalInfoResponse(
  @ProtobufIndex(index = 1)
  public val hist: HistoricalInfo,
) {
  public object KotlinxSerializer : KSerializer<QueryHistoricalInfoResponse> {
    private val delegator: KSerializer<QueryHistoricalInfoResponse> =
        QueryHistoricalInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryHistoricalInfoResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryHistoricalInfoResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryHistoricalInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryHistoricalInfoResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPoolRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryPoolRequest")
public class QueryPoolRequest() {
  public object KotlinxSerializer : KSerializer<QueryPoolRequest> {
    private val delegator: KSerializer<QueryPoolRequest> = QueryPoolRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPoolRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryPoolRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPoolRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPoolRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPoolResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryPoolResponse")
public data class QueryPoolResponse(
  @ProtobufIndex(index = 1)
  public val pool: Pool,
) {
  public object KotlinxSerializer : KSerializer<QueryPoolResponse> {
    private val delegator: KSerializer<QueryPoolResponse> = QueryPoolResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPoolResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryPoolResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPoolResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPoolResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.QueryParamsRequest")
public class QueryParamsRequest() {
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
@SerialName(value = "cosmos.staking.v1beta1.QueryParamsResponse")
public data class QueryParamsResponse(
  @ProtobufIndex(index = 1)
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