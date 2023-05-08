// Transform from cosmos/auth/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.auth.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import google.protobuf.Any
import kotlin.ByteArray
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Long
import kotlin.ReplaceWith
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

@Serializable(with = QueryAccountsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryAccountsRequest")
public data class QueryAccountsRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryAccountsRequest> {
    private val delegator: KSerializer<QueryAccountsRequest> = QueryAccountsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAccountsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryAccountsResponse")
public data class QueryAccountsResponse(
  @ProtobufIndex(index = 1)
  public val accounts: List<Any>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryAccountsResponse> {
    private val delegator: KSerializer<QueryAccountsResponse> = QueryAccountsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAccountsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryAccountRequest")
public data class QueryAccountRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
) {
  public object KotlinxSerializer : KSerializer<QueryAccountRequest> {
    private val delegator: KSerializer<QueryAccountRequest> = QueryAccountRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAccountRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryAccountResponse")
public data class QueryAccountResponse(
  @ProtobufIndex(index = 1)
  public val account: Any,
) {
  public object KotlinxSerializer : KSerializer<QueryAccountResponse> {
    private val delegator: KSerializer<QueryAccountResponse> = QueryAccountResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAccountResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryParamsRequest")
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
@SerialName(value = "cosmos.auth.v1beta1.QueryParamsResponse")
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

@Serializable(with = QueryModuleAccountsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryModuleAccountsRequest")
public class QueryModuleAccountsRequest() {
  public object KotlinxSerializer : KSerializer<QueryModuleAccountsRequest> {
    private val delegator: KSerializer<QueryModuleAccountsRequest> =
        QueryModuleAccountsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleAccountsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryModuleAccountsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleAccountsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleAccountsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleAccountsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryModuleAccountsResponse")
public data class QueryModuleAccountsResponse(
  @ProtobufIndex(index = 1)
  public val accounts: List<Any>,
) {
  public object KotlinxSerializer : KSerializer<QueryModuleAccountsResponse> {
    private val delegator: KSerializer<QueryModuleAccountsResponse> =
        QueryModuleAccountsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleAccountsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryModuleAccountsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleAccountsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleAccountsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleAccountByNameRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryModuleAccountByNameRequest")
public data class QueryModuleAccountByNameRequest(
  @ProtobufIndex(index = 1)
  public val name: String,
) {
  public object KotlinxSerializer : KSerializer<QueryModuleAccountByNameRequest> {
    private val delegator: KSerializer<QueryModuleAccountByNameRequest> =
        QueryModuleAccountByNameRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleAccountByNameRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryModuleAccountByNameRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleAccountByNameRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleAccountByNameRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleAccountByNameResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryModuleAccountByNameResponse")
public data class QueryModuleAccountByNameResponse(
  @ProtobufIndex(index = 1)
  public val account: Any,
) {
  public object KotlinxSerializer : KSerializer<QueryModuleAccountByNameResponse> {
    private val delegator: KSerializer<QueryModuleAccountByNameResponse> =
        QueryModuleAccountByNameResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleAccountByNameResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryModuleAccountByNameResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleAccountByNameResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleAccountByNameResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Bech32PrefixRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.Bech32PrefixRequest")
public class Bech32PrefixRequest() {
  public object KotlinxSerializer : KSerializer<Bech32PrefixRequest> {
    private val delegator: KSerializer<Bech32PrefixRequest> = Bech32PrefixRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Bech32PrefixRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(Bech32PrefixRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Bech32PrefixRequest {
      if (decoder is ProtobufMapperDecoder) {
        return Bech32PrefixRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Bech32PrefixResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.Bech32PrefixResponse")
public data class Bech32PrefixResponse(
  @ProtobufIndex(index = 1)
  public val bech32Prefix: String,
) {
  public object KotlinxSerializer : KSerializer<Bech32PrefixResponse> {
    private val delegator: KSerializer<Bech32PrefixResponse> = Bech32PrefixResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Bech32PrefixResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(Bech32PrefixResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Bech32PrefixResponse {
      if (decoder is ProtobufMapperDecoder) {
        return Bech32PrefixResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AddressBytesToStringRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.AddressBytesToStringRequest")
public data class AddressBytesToStringRequest(
  @ProtobufIndex(index = 1)
  public val addressBytes: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<AddressBytesToStringRequest> {
    private val delegator: KSerializer<AddressBytesToStringRequest> =
        AddressBytesToStringRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AddressBytesToStringRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(AddressBytesToStringRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AddressBytesToStringRequest {
      if (decoder is ProtobufMapperDecoder) {
        return AddressBytesToStringRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AddressBytesToStringResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.AddressBytesToStringResponse")
public data class AddressBytesToStringResponse(
  @ProtobufIndex(index = 1)
  public val addressString: String,
) {
  public object KotlinxSerializer : KSerializer<AddressBytesToStringResponse> {
    private val delegator: KSerializer<AddressBytesToStringResponse> =
        AddressBytesToStringResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AddressBytesToStringResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(AddressBytesToStringResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AddressBytesToStringResponse {
      if (decoder is ProtobufMapperDecoder) {
        return AddressBytesToStringResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AddressStringToBytesRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.AddressStringToBytesRequest")
public data class AddressStringToBytesRequest(
  @ProtobufIndex(index = 1)
  public val addressString: String,
) {
  public object KotlinxSerializer : KSerializer<AddressStringToBytesRequest> {
    private val delegator: KSerializer<AddressStringToBytesRequest> =
        AddressStringToBytesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AddressStringToBytesRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(AddressStringToBytesRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AddressStringToBytesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return AddressStringToBytesRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AddressStringToBytesResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.AddressStringToBytesResponse")
public data class AddressStringToBytesResponse(
  @ProtobufIndex(index = 1)
  public val addressBytes: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<AddressStringToBytesResponse> {
    private val delegator: KSerializer<AddressStringToBytesResponse> =
        AddressStringToBytesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AddressStringToBytesResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(AddressStringToBytesResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AddressStringToBytesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return AddressStringToBytesResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountAddressByIDRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryAccountAddressByIDRequest")
public data class QueryAccountAddressByIDRequest(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val id: Long,
  @ProtobufIndex(index = 2)
  public val accountId: ULong,
) {
  public object KotlinxSerializer : KSerializer<QueryAccountAddressByIDRequest> {
    private val delegator: KSerializer<QueryAccountAddressByIDRequest> =
        QueryAccountAddressByIDRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountAddressByIDRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAccountAddressByIDRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountAddressByIDRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountAddressByIDRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountAddressByIDResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryAccountAddressByIDResponse")
public data class QueryAccountAddressByIDResponse(
  @ProtobufIndex(index = 1)
  public val accountAddress: String,
) {
  public object KotlinxSerializer : KSerializer<QueryAccountAddressByIDResponse> {
    private val delegator: KSerializer<QueryAccountAddressByIDResponse> =
        QueryAccountAddressByIDResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountAddressByIDResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAccountAddressByIDResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountAddressByIDResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountAddressByIDResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountInfoRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryAccountInfoRequest")
public data class QueryAccountInfoRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
) {
  public object KotlinxSerializer : KSerializer<QueryAccountInfoRequest> {
    private val delegator: KSerializer<QueryAccountInfoRequest> =
        QueryAccountInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountInfoRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAccountInfoRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountInfoRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountInfoResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.v1beta1.QueryAccountInfoResponse")
public data class QueryAccountInfoResponse(
  @ProtobufIndex(index = 1)
  public val info: BaseAccount,
) {
  public object KotlinxSerializer : KSerializer<QueryAccountInfoResponse> {
    private val delegator: KSerializer<QueryAccountInfoResponse> =
        QueryAccountInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountInfoResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryAccountInfoResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountInfoResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
