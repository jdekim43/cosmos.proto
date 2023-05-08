// Transform from cosmos/feegrant/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.feegrant.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
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

@Serializable(with = QueryAllowanceRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.feegrant.v1beta1.QueryAllowanceRequest")
public data class QueryAllowanceRequest(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
) {
  public object KotlinxSerializer : KSerializer<QueryAllowanceRequest> {
    private val delegator: KSerializer<QueryAllowanceRequest> = QueryAllowanceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllowanceRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAllowanceRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllowanceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllowanceRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllowanceResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.feegrant.v1beta1.QueryAllowanceResponse")
public data class QueryAllowanceResponse(
  @ProtobufIndex(index = 1)
  public val allowance: Grant,
) {
  public object KotlinxSerializer : KSerializer<QueryAllowanceResponse> {
    private val delegator: KSerializer<QueryAllowanceResponse> = QueryAllowanceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllowanceResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAllowanceResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllowanceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllowanceResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllowancesRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.feegrant.v1beta1.QueryAllowancesRequest")
public data class QueryAllowancesRequest(
  @ProtobufIndex(index = 1)
  public val grantee: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryAllowancesRequest> {
    private val delegator: KSerializer<QueryAllowancesRequest> = QueryAllowancesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllowancesRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAllowancesRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllowancesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllowancesRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllowancesResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.feegrant.v1beta1.QueryAllowancesResponse")
public data class QueryAllowancesResponse(
  @ProtobufIndex(index = 1)
  public val allowances: List<Grant>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryAllowancesResponse> {
    private val delegator: KSerializer<QueryAllowancesResponse> =
        QueryAllowancesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllowancesResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAllowancesResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllowancesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllowancesResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllowancesByGranterRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.feegrant.v1beta1.QueryAllowancesByGranterRequest")
public data class QueryAllowancesByGranterRequest(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryAllowancesByGranterRequest> {
    private val delegator: KSerializer<QueryAllowancesByGranterRequest> =
        QueryAllowancesByGranterRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllowancesByGranterRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAllowancesByGranterRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllowancesByGranterRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllowancesByGranterRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllowancesByGranterResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.feegrant.v1beta1.QueryAllowancesByGranterResponse")
public data class QueryAllowancesByGranterResponse(
  @ProtobufIndex(index = 1)
  public val allowances: List<Grant>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryAllowancesByGranterResponse> {
    private val delegator: KSerializer<QueryAllowancesByGranterResponse> =
        QueryAllowancesByGranterResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllowancesByGranterResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAllowancesByGranterResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllowancesByGranterResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllowancesByGranterResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
