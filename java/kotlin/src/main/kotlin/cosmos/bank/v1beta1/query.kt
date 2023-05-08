// Transform from cosmos/bank/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.bank.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
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

@Serializable(with = QueryBalanceRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryBalanceRequest")
public data class QueryBalanceRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
) {
  public object KotlinxSerializer : KSerializer<QueryBalanceRequest> {
    private val delegator: KSerializer<QueryBalanceRequest> = QueryBalanceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBalanceRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryBalanceRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBalanceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBalanceRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBalanceResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryBalanceResponse")
public data class QueryBalanceResponse(
  @ProtobufIndex(index = 1)
  public val balance: Coin,
) {
  public object KotlinxSerializer : KSerializer<QueryBalanceResponse> {
    private val delegator: KSerializer<QueryBalanceResponse> = QueryBalanceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBalanceResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryBalanceResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBalanceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBalanceResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllBalancesRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryAllBalancesRequest")
public data class QueryAllBalancesRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryAllBalancesRequest> {
    private val delegator: KSerializer<QueryAllBalancesRequest> =
        QueryAllBalancesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllBalancesRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAllBalancesRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllBalancesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllBalancesRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllBalancesResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryAllBalancesResponse")
public data class QueryAllBalancesResponse(
  @ProtobufIndex(index = 1)
  public val balances: List<Coin>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryAllBalancesResponse> {
    private val delegator: KSerializer<QueryAllBalancesResponse> =
        QueryAllBalancesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllBalancesResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAllBalancesResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllBalancesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllBalancesResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpendableBalancesRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QuerySpendableBalancesRequest")
public data class QuerySpendableBalancesRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QuerySpendableBalancesRequest> {
    private val delegator: KSerializer<QuerySpendableBalancesRequest> =
        QuerySpendableBalancesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpendableBalancesRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySpendableBalancesRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpendableBalancesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpendableBalancesRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpendableBalancesResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QuerySpendableBalancesResponse")
public data class QuerySpendableBalancesResponse(
  @ProtobufIndex(index = 1)
  public val balances: List<Coin>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QuerySpendableBalancesResponse> {
    private val delegator: KSerializer<QuerySpendableBalancesResponse> =
        QuerySpendableBalancesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpendableBalancesResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySpendableBalancesResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpendableBalancesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpendableBalancesResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpendableBalanceByDenomRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QuerySpendableBalanceByDenomRequest")
public data class QuerySpendableBalanceByDenomRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
) {
  public object KotlinxSerializer : KSerializer<QuerySpendableBalanceByDenomRequest> {
    private val delegator: KSerializer<QuerySpendableBalanceByDenomRequest> =
        QuerySpendableBalanceByDenomRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpendableBalanceByDenomRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySpendableBalanceByDenomRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpendableBalanceByDenomRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpendableBalanceByDenomRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpendableBalanceByDenomResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse")
public data class QuerySpendableBalanceByDenomResponse(
  @ProtobufIndex(index = 1)
  public val balance: Coin,
) {
  public object KotlinxSerializer : KSerializer<QuerySpendableBalanceByDenomResponse> {
    private val delegator: KSerializer<QuerySpendableBalanceByDenomResponse> =
        QuerySpendableBalanceByDenomResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpendableBalanceByDenomResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySpendableBalanceByDenomResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpendableBalanceByDenomResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpendableBalanceByDenomResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTotalSupplyRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryTotalSupplyRequest")
public data class QueryTotalSupplyRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryTotalSupplyRequest> {
    private val delegator: KSerializer<QueryTotalSupplyRequest> =
        QueryTotalSupplyRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTotalSupplyRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryTotalSupplyRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTotalSupplyRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTotalSupplyRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTotalSupplyResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryTotalSupplyResponse")
public data class QueryTotalSupplyResponse(
  @ProtobufIndex(index = 1)
  public val supply: List<Coin>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryTotalSupplyResponse> {
    private val delegator: KSerializer<QueryTotalSupplyResponse> =
        QueryTotalSupplyResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTotalSupplyResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryTotalSupplyResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTotalSupplyResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTotalSupplyResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySupplyOfRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QuerySupplyOfRequest")
public data class QuerySupplyOfRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
) {
  public object KotlinxSerializer : KSerializer<QuerySupplyOfRequest> {
    private val delegator: KSerializer<QuerySupplyOfRequest> = QuerySupplyOfRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySupplyOfRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySupplyOfRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySupplyOfRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySupplyOfRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySupplyOfResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QuerySupplyOfResponse")
public data class QuerySupplyOfResponse(
  @ProtobufIndex(index = 1)
  public val amount: Coin,
) {
  public object KotlinxSerializer : KSerializer<QuerySupplyOfResponse> {
    private val delegator: KSerializer<QuerySupplyOfResponse> = QuerySupplyOfResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySupplyOfResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySupplyOfResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySupplyOfResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySupplyOfResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryParamsRequest")
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
@SerialName(value = "cosmos.bank.v1beta1.QueryParamsResponse")
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

@Serializable(with = QueryDenomsMetadataRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryDenomsMetadataRequest")
public data class QueryDenomsMetadataRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryDenomsMetadataRequest> {
    private val delegator: KSerializer<QueryDenomsMetadataRequest> =
        QueryDenomsMetadataRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomsMetadataRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDenomsMetadataRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomsMetadataRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomsMetadataRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomsMetadataResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryDenomsMetadataResponse")
public data class QueryDenomsMetadataResponse(
  @ProtobufIndex(index = 1)
  public val metadatas: List<Metadata>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryDenomsMetadataResponse> {
    private val delegator: KSerializer<QueryDenomsMetadataResponse> =
        QueryDenomsMetadataResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomsMetadataResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDenomsMetadataResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomsMetadataResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomsMetadataResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomMetadataRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryDenomMetadataRequest")
public data class QueryDenomMetadataRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
) {
  public object KotlinxSerializer : KSerializer<QueryDenomMetadataRequest> {
    private val delegator: KSerializer<QueryDenomMetadataRequest> =
        QueryDenomMetadataRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomMetadataRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDenomMetadataRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomMetadataRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomMetadataRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomMetadataResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryDenomMetadataResponse")
public data class QueryDenomMetadataResponse(
  @ProtobufIndex(index = 1)
  public val metadata: Metadata,
) {
  public object KotlinxSerializer : KSerializer<QueryDenomMetadataResponse> {
    private val delegator: KSerializer<QueryDenomMetadataResponse> =
        QueryDenomMetadataResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomMetadataResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDenomMetadataResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomMetadataResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomMetadataResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomOwnersRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryDenomOwnersRequest")
public data class QueryDenomOwnersRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryDenomOwnersRequest> {
    private val delegator: KSerializer<QueryDenomOwnersRequest> =
        QueryDenomOwnersRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomOwnersRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDenomOwnersRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomOwnersRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomOwnersRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DenomOwner.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.DenomOwner")
public data class DenomOwner(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val balance: Coin,
) {
  public object KotlinxSerializer : KSerializer<DenomOwner> {
    private val delegator: KSerializer<DenomOwner> = DenomOwner.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DenomOwner): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DenomOwnerMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DenomOwner {
      if (decoder is ProtobufMapperDecoder) {
        return DenomOwnerMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomOwnersResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QueryDenomOwnersResponse")
public data class QueryDenomOwnersResponse(
  @ProtobufIndex(index = 1)
  public val denomOwners: List<DenomOwner>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryDenomOwnersResponse> {
    private val delegator: KSerializer<QueryDenomOwnersResponse> =
        QueryDenomOwnersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomOwnersResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryDenomOwnersResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomOwnersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomOwnersResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySendEnabledRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QuerySendEnabledRequest")
public data class QuerySendEnabledRequest(
  @ProtobufIndex(index = 1)
  public val denoms: List<String>,
  @ProtobufIndex(index = 99)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QuerySendEnabledRequest> {
    private val delegator: KSerializer<QuerySendEnabledRequest> =
        QuerySendEnabledRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySendEnabledRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySendEnabledRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySendEnabledRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySendEnabledRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySendEnabledResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.QuerySendEnabledResponse")
public data class QuerySendEnabledResponse(
  @ProtobufIndex(index = 1)
  public val sendEnabled: List<SendEnabled>,
  @ProtobufIndex(index = 99)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QuerySendEnabledResponse> {
    private val delegator: KSerializer<QuerySendEnabledResponse> =
        QuerySendEnabledResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySendEnabledResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySendEnabledResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySendEnabledResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySendEnabledResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
