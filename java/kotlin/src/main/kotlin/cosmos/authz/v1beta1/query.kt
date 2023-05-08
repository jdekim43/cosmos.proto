// Transform from cosmos/authz/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.authz.v1beta1

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

@Serializable(with = QueryGrantsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.QueryGrantsRequest")
public data class QueryGrantsRequest(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
  @ProtobufIndex(index = 3)
  public val msgTypeUrl: String,
  @ProtobufIndex(index = 4)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryGrantsRequest> {
    private val delegator: KSerializer<QueryGrantsRequest> = QueryGrantsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGrantsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGrantsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGrantsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGrantsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGrantsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.QueryGrantsResponse")
public data class QueryGrantsResponse(
  @ProtobufIndex(index = 1)
  public val grants: List<Grant>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryGrantsResponse> {
    private val delegator: KSerializer<QueryGrantsResponse> = QueryGrantsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGrantsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGrantsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGrantsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGrantsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGranterGrantsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.QueryGranterGrantsRequest")
public data class QueryGranterGrantsRequest(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryGranterGrantsRequest> {
    private val delegator: KSerializer<QueryGranterGrantsRequest> =
        QueryGranterGrantsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGranterGrantsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGranterGrantsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGranterGrantsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGranterGrantsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGranterGrantsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.QueryGranterGrantsResponse")
public data class QueryGranterGrantsResponse(
  @ProtobufIndex(index = 1)
  public val grants: List<GrantAuthorization>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryGranterGrantsResponse> {
    private val delegator: KSerializer<QueryGranterGrantsResponse> =
        QueryGranterGrantsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGranterGrantsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGranterGrantsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGranterGrantsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGranterGrantsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGranteeGrantsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.QueryGranteeGrantsRequest")
public data class QueryGranteeGrantsRequest(
  @ProtobufIndex(index = 1)
  public val grantee: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryGranteeGrantsRequest> {
    private val delegator: KSerializer<QueryGranteeGrantsRequest> =
        QueryGranteeGrantsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGranteeGrantsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGranteeGrantsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGranteeGrantsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGranteeGrantsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGranteeGrantsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.QueryGranteeGrantsResponse")
public data class QueryGranteeGrantsResponse(
  @ProtobufIndex(index = 1)
  public val grants: List<GrantAuthorization>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryGranteeGrantsResponse> {
    private val delegator: KSerializer<QueryGranteeGrantsResponse> =
        QueryGranteeGrantsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGranteeGrantsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGranteeGrantsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGranteeGrantsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGranteeGrantsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
