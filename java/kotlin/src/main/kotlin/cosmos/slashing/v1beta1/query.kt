// Transform from cosmos/slashing/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.slashing.v1beta1

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

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.QueryParamsRequest")
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
@SerialName(value = "cosmos.slashing.v1beta1.QueryParamsResponse")
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

@Serializable(with = QuerySigningInfoRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.QuerySigningInfoRequest")
public data class QuerySigningInfoRequest(
  @ProtobufIndex(index = 1)
  public val consAddress: String,
) {
  public object KotlinxSerializer : KSerializer<QuerySigningInfoRequest> {
    private val delegator: KSerializer<QuerySigningInfoRequest> =
        QuerySigningInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySigningInfoRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySigningInfoRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySigningInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySigningInfoRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySigningInfoResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.QuerySigningInfoResponse")
public data class QuerySigningInfoResponse(
  @ProtobufIndex(index = 1)
  public val valSigningInfo: ValidatorSigningInfo,
) {
  public object KotlinxSerializer : KSerializer<QuerySigningInfoResponse> {
    private val delegator: KSerializer<QuerySigningInfoResponse> =
        QuerySigningInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySigningInfoResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySigningInfoResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySigningInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySigningInfoResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySigningInfosRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.QuerySigningInfosRequest")
public data class QuerySigningInfosRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QuerySigningInfosRequest> {
    private val delegator: KSerializer<QuerySigningInfosRequest> =
        QuerySigningInfosRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySigningInfosRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySigningInfosRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySigningInfosRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySigningInfosRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySigningInfosResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.QuerySigningInfosResponse")
public data class QuerySigningInfosResponse(
  @ProtobufIndex(index = 1)
  public val info: List<ValidatorSigningInfo>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QuerySigningInfosResponse> {
    private val delegator: KSerializer<QuerySigningInfosResponse> =
        QuerySigningInfosResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySigningInfosResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySigningInfosResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySigningInfosResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySigningInfosResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
