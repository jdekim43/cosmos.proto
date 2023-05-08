// Transform from cosmos/params/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.params.v1beta1

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
@SerialName(value = "cosmos.params.v1beta1.QueryParamsRequest")
public data class QueryParamsRequest(
  @ProtobufIndex(index = 1)
  public val subspace: String,
  @ProtobufIndex(index = 2)
  public val key: String,
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
@SerialName(value = "cosmos.params.v1beta1.QueryParamsResponse")
public data class QueryParamsResponse(
  @ProtobufIndex(index = 1)
  public val `param`: ParamChange,
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

@Serializable(with = QuerySubspacesRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.params.v1beta1.QuerySubspacesRequest")
public class QuerySubspacesRequest() {
  public object KotlinxSerializer : KSerializer<QuerySubspacesRequest> {
    private val delegator: KSerializer<QuerySubspacesRequest> = QuerySubspacesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubspacesRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySubspacesRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubspacesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubspacesRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubspacesResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.params.v1beta1.QuerySubspacesResponse")
public data class QuerySubspacesResponse(
  @ProtobufIndex(index = 1)
  public val subspaces: List<Subspace>,
) {
  public object KotlinxSerializer : KSerializer<QuerySubspacesResponse> {
    private val delegator: KSerializer<QuerySubspacesResponse> = QuerySubspacesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubspacesResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySubspacesResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubspacesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubspacesResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Subspace.KotlinxSerializer::class)
@SerialName(value = "cosmos.params.v1beta1.Subspace")
public data class Subspace(
  @ProtobufIndex(index = 1)
  public val subspace: String,
  @ProtobufIndex(index = 2)
  public val keys: List<String>,
) {
  public object KotlinxSerializer : KSerializer<Subspace> {
    private val delegator: KSerializer<Subspace> = Subspace.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Subspace): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(SubspaceMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Subspace {
      if (decoder is ProtobufMapperDecoder) {
        return SubspaceMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
