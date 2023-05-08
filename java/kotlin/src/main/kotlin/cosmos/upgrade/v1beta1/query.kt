// Transform from cosmos/upgrade/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.upgrade.v1beta1

import kotlin.ByteArray
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

@Serializable(with = QueryCurrentPlanRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.QueryCurrentPlanRequest")
public class QueryCurrentPlanRequest() {
  public object KotlinxSerializer : KSerializer<QueryCurrentPlanRequest> {
    private val delegator: KSerializer<QueryCurrentPlanRequest> =
        QueryCurrentPlanRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCurrentPlanRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryCurrentPlanRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCurrentPlanRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCurrentPlanRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCurrentPlanResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.QueryCurrentPlanResponse")
public data class QueryCurrentPlanResponse(
  @ProtobufIndex(index = 1)
  public val plan: Plan,
) {
  public object KotlinxSerializer : KSerializer<QueryCurrentPlanResponse> {
    private val delegator: KSerializer<QueryCurrentPlanResponse> =
        QueryCurrentPlanResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCurrentPlanResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryCurrentPlanResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCurrentPlanResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCurrentPlanResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAppliedPlanRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.QueryAppliedPlanRequest")
public data class QueryAppliedPlanRequest(
  @ProtobufIndex(index = 1)
  public val name: String,
) {
  public object KotlinxSerializer : KSerializer<QueryAppliedPlanRequest> {
    private val delegator: KSerializer<QueryAppliedPlanRequest> =
        QueryAppliedPlanRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAppliedPlanRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAppliedPlanRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAppliedPlanRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAppliedPlanRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAppliedPlanResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.QueryAppliedPlanResponse")
public data class QueryAppliedPlanResponse(
  @ProtobufIndex(index = 1)
  public val height: Long,
) {
  public object KotlinxSerializer : KSerializer<QueryAppliedPlanResponse> {
    private val delegator: KSerializer<QueryAppliedPlanResponse> =
        QueryAppliedPlanResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAppliedPlanResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAppliedPlanResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAppliedPlanResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAppliedPlanResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryUpgradedConsensusStateRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.QueryUpgradedConsensusStateRequest")
public data class QueryUpgradedConsensusStateRequest(
  @ProtobufIndex(index = 1)
  public val lastHeight: Long,
) {
  public object KotlinxSerializer : KSerializer<QueryUpgradedConsensusStateRequest> {
    private val delegator: KSerializer<QueryUpgradedConsensusStateRequest> =
        QueryUpgradedConsensusStateRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryUpgradedConsensusStateRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryUpgradedConsensusStateRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryUpgradedConsensusStateRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryUpgradedConsensusStateRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryUpgradedConsensusStateResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.QueryUpgradedConsensusStateResponse")
public data class QueryUpgradedConsensusStateResponse(
  @ProtobufIndex(index = 2)
  public val upgradedConsensusState: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<QueryUpgradedConsensusStateResponse> {
    private val delegator: KSerializer<QueryUpgradedConsensusStateResponse> =
        QueryUpgradedConsensusStateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryUpgradedConsensusStateResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryUpgradedConsensusStateResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryUpgradedConsensusStateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryUpgradedConsensusStateResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleVersionsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.QueryModuleVersionsRequest")
public data class QueryModuleVersionsRequest(
  @ProtobufIndex(index = 1)
  public val moduleName: String,
) {
  public object KotlinxSerializer : KSerializer<QueryModuleVersionsRequest> {
    private val delegator: KSerializer<QueryModuleVersionsRequest> =
        QueryModuleVersionsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleVersionsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryModuleVersionsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleVersionsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleVersionsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleVersionsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.QueryModuleVersionsResponse")
public data class QueryModuleVersionsResponse(
  @ProtobufIndex(index = 1)
  public val moduleVersions: List<ModuleVersion>,
) {
  public object KotlinxSerializer : KSerializer<QueryModuleVersionsResponse> {
    private val delegator: KSerializer<QueryModuleVersionsResponse> =
        QueryModuleVersionsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleVersionsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryModuleVersionsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleVersionsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleVersionsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAuthorityRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.QueryAuthorityRequest")
public class QueryAuthorityRequest() {
  public object KotlinxSerializer : KSerializer<QueryAuthorityRequest> {
    private val delegator: KSerializer<QueryAuthorityRequest> = QueryAuthorityRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAuthorityRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAuthorityRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAuthorityRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAuthorityRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAuthorityResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.QueryAuthorityResponse")
public data class QueryAuthorityResponse(
  @ProtobufIndex(index = 1)
  public val address: String,
) {
  public object KotlinxSerializer : KSerializer<QueryAuthorityResponse> {
    private val delegator: KSerializer<QueryAuthorityResponse> = QueryAuthorityResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAuthorityResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAuthorityResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAuthorityResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAuthorityResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
