// Transform from cosmos/mint/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.mint.v1beta1

import kotlin.ByteArray
import kotlin.Unit
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
@SerialName(value = "cosmos.mint.v1beta1.QueryParamsRequest")
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
@SerialName(value = "cosmos.mint.v1beta1.QueryParamsResponse")
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

@Serializable(with = QueryInflationRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.mint.v1beta1.QueryInflationRequest")
public class QueryInflationRequest() {
  public object KotlinxSerializer : KSerializer<QueryInflationRequest> {
    private val delegator: KSerializer<QueryInflationRequest> = QueryInflationRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryInflationRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryInflationRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryInflationRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryInflationRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryInflationResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.mint.v1beta1.QueryInflationResponse")
public data class QueryInflationResponse(
  @ProtobufIndex(index = 1)
  public val inflation: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<QueryInflationResponse> {
    private val delegator: KSerializer<QueryInflationResponse> = QueryInflationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryInflationResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryInflationResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryInflationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryInflationResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAnnualProvisionsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.mint.v1beta1.QueryAnnualProvisionsRequest")
public class QueryAnnualProvisionsRequest() {
  public object KotlinxSerializer : KSerializer<QueryAnnualProvisionsRequest> {
    private val delegator: KSerializer<QueryAnnualProvisionsRequest> =
        QueryAnnualProvisionsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAnnualProvisionsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAnnualProvisionsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAnnualProvisionsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAnnualProvisionsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAnnualProvisionsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.mint.v1beta1.QueryAnnualProvisionsResponse")
public data class QueryAnnualProvisionsResponse(
  @ProtobufIndex(index = 1)
  public val annualProvisions: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<QueryAnnualProvisionsResponse> {
    private val delegator: KSerializer<QueryAnnualProvisionsResponse> =
        QueryAnnualProvisionsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAnnualProvisionsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAnnualProvisionsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAnnualProvisionsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAnnualProvisionsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
