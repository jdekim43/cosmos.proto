// Transform from cosmos/nft/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.nft.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
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

@Serializable(with = QueryBalanceRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QueryBalanceRequest")
public data class QueryBalanceRequest(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val owner: String,
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
@SerialName(value = "cosmos.nft.v1beta1.QueryBalanceResponse")
public data class QueryBalanceResponse(
  @ProtobufIndex(index = 1)
  public val amount: ULong,
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

@Serializable(with = QueryOwnerRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QueryOwnerRequest")
public data class QueryOwnerRequest(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val id: String,
) {
  public object KotlinxSerializer : KSerializer<QueryOwnerRequest> {
    private val delegator: KSerializer<QueryOwnerRequest> = QueryOwnerRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOwnerRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryOwnerRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOwnerRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOwnerRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOwnerResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QueryOwnerResponse")
public data class QueryOwnerResponse(
  @ProtobufIndex(index = 1)
  public val owner: String,
) {
  public object KotlinxSerializer : KSerializer<QueryOwnerResponse> {
    private val delegator: KSerializer<QueryOwnerResponse> = QueryOwnerResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOwnerResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryOwnerResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOwnerResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOwnerResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySupplyRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QuerySupplyRequest")
public data class QuerySupplyRequest(
  @ProtobufIndex(index = 1)
  public val classId: String,
) {
  public object KotlinxSerializer : KSerializer<QuerySupplyRequest> {
    private val delegator: KSerializer<QuerySupplyRequest> = QuerySupplyRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySupplyRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySupplyRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySupplyRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySupplyRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySupplyResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QuerySupplyResponse")
public data class QuerySupplyResponse(
  @ProtobufIndex(index = 1)
  public val amount: ULong,
) {
  public object KotlinxSerializer : KSerializer<QuerySupplyResponse> {
    private val delegator: KSerializer<QuerySupplyResponse> = QuerySupplyResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySupplyResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QuerySupplyResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySupplyResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySupplyResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryNFTsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QueryNFTsRequest")
public data class QueryNFTsRequest(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val owner: String,
  @ProtobufIndex(index = 3)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryNFTsRequest> {
    private val delegator: KSerializer<QueryNFTsRequest> = QueryNFTsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryNFTsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryNFTsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryNFTsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryNFTsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryNFTsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QueryNFTsResponse")
public data class QueryNFTsResponse(
  @ProtobufIndex(index = 1)
  public val nfts: List<NFT>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryNFTsResponse> {
    private val delegator: KSerializer<QueryNFTsResponse> = QueryNFTsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryNFTsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryNFTsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryNFTsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryNFTsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryNFTRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QueryNFTRequest")
public data class QueryNFTRequest(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val id: String,
) {
  public object KotlinxSerializer : KSerializer<QueryNFTRequest> {
    private val delegator: KSerializer<QueryNFTRequest> = QueryNFTRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryNFTRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryNFTRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryNFTRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryNFTRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryNFTResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QueryNFTResponse")
public data class QueryNFTResponse(
  @ProtobufIndex(index = 1)
  public val nft: NFT,
) {
  public object KotlinxSerializer : KSerializer<QueryNFTResponse> {
    private val delegator: KSerializer<QueryNFTResponse> = QueryNFTResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryNFTResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryNFTResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryNFTResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryNFTResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryClassRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QueryClassRequest")
public data class QueryClassRequest(
  @ProtobufIndex(index = 1)
  public val classId: String,
) {
  public object KotlinxSerializer : KSerializer<QueryClassRequest> {
    private val delegator: KSerializer<QueryClassRequest> = QueryClassRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryClassRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryClassRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryClassRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryClassRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryClassResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QueryClassResponse")
public data class QueryClassResponse(
  @ProtobufIndex(index = 1)
  public val `class`: Class,
) {
  public object KotlinxSerializer : KSerializer<QueryClassResponse> {
    private val delegator: KSerializer<QueryClassResponse> = QueryClassResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryClassResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryClassResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryClassResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryClassResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryClassesRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QueryClassesRequest")
public data class QueryClassesRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryClassesRequest> {
    private val delegator: KSerializer<QueryClassesRequest> = QueryClassesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryClassesRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryClassesRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryClassesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryClassesRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryClassesResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.QueryClassesResponse")
public data class QueryClassesResponse(
  @ProtobufIndex(index = 1)
  public val classes: List<Class>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryClassesResponse> {
    private val delegator: KSerializer<QueryClassesResponse> = QueryClassesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryClassesResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryClassesResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryClassesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryClassesResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
