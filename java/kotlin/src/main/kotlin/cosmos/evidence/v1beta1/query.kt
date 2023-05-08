// Transform from cosmos/evidence/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.evidence.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import google.protobuf.Any
import kotlin.ByteArray
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.ReplaceWith
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

@Serializable(with = QueryEvidenceRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.evidence.v1beta1.QueryEvidenceRequest")
public data class QueryEvidenceRequest(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val evidenceHash: ByteArray,
  @ProtobufIndex(index = 2)
  public val hash: String,
) {
  public object KotlinxSerializer : KSerializer<QueryEvidenceRequest> {
    private val delegator: KSerializer<QueryEvidenceRequest> = QueryEvidenceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryEvidenceRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryEvidenceRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryEvidenceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryEvidenceRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryEvidenceResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.evidence.v1beta1.QueryEvidenceResponse")
public data class QueryEvidenceResponse(
  @ProtobufIndex(index = 1)
  public val evidence: Any,
) {
  public object KotlinxSerializer : KSerializer<QueryEvidenceResponse> {
    private val delegator: KSerializer<QueryEvidenceResponse> = QueryEvidenceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryEvidenceResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryEvidenceResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryEvidenceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryEvidenceResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllEvidenceRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.evidence.v1beta1.QueryAllEvidenceRequest")
public data class QueryAllEvidenceRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryAllEvidenceRequest> {
    private val delegator: KSerializer<QueryAllEvidenceRequest> =
        QueryAllEvidenceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllEvidenceRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAllEvidenceRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllEvidenceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllEvidenceRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllEvidenceResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.evidence.v1beta1.QueryAllEvidenceResponse")
public data class QueryAllEvidenceResponse(
  @ProtobufIndex(index = 1)
  public val evidence: List<Any>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryAllEvidenceResponse> {
    private val delegator: KSerializer<QueryAllEvidenceResponse> =
        QueryAllEvidenceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllEvidenceResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAllEvidenceResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllEvidenceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllEvidenceResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
