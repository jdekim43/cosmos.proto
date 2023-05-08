// Transform from cosmos/orm/query/v1alpha1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.orm.query.v1alpha1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import google.protobuf.Any
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Long
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmInline
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

@Serializable(with = GetRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.orm.query.v1alpha1.GetRequest")
public data class GetRequest(
  @ProtobufIndex(index = 1)
  public val messageName: String,
  @ProtobufIndex(index = 2)
  public val index: String,
  @ProtobufIndex(index = 3)
  public val values: List<IndexValue>,
) {
  public object KotlinxSerializer : KSerializer<GetRequest> {
    private val delegator: KSerializer<GetRequest> = GetRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.orm.query.v1alpha1.GetResponse")
public data class GetResponse(
  @ProtobufIndex(index = 1)
  public val result: Any,
) {
  public object KotlinxSerializer : KSerializer<GetResponse> {
    private val delegator: KSerializer<GetResponse> = GetResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ListRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.orm.query.v1alpha1.ListRequest")
public data class ListRequest(
  @ProtobufIndex(index = 1)
  public val messageName: String,
  @ProtobufIndex(index = 2)
  public val index: String,
  @ProtobufIndex(index = 5)
  public val pagination: PageRequest,
  public val query: QueryOneOf,
) {
  @Serializable
  public sealed interface QueryOneOf {
    @JvmInline
    public value class Prefix(
      @ProtobufIndex(index = 3)
      public val `value`: ListRequest.Prefix,
    ) : QueryOneOf

    @JvmInline
    public value class Range(
      @ProtobufIndex(index = 4)
      public val `value`: ListRequest.Range,
    ) : QueryOneOf
  }

  @Serializable(with = Prefix.KotlinxSerializer::class)
  @SerialName(value = "cosmos.orm.query.v1alpha1.ListRequest.Prefix")
  public data class Prefix(
    @ProtobufIndex(index = 1)
    public val values: List<IndexValue>,
  ) {
    public object KotlinxSerializer : KSerializer<Prefix> {
      private val delegator: KSerializer<Prefix> = Prefix.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: Prefix): Unit {
        if (encoder is ProtobufMapperEncoder) {
          encoder.encodeValue(ListRequestMapper.PrefixMapper.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): Prefix {
        if (decoder is ProtobufMapperDecoder) {
          return ListRequestMapper.PrefixMapper.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  @Serializable(with = Range.KotlinxSerializer::class)
  @SerialName(value = "cosmos.orm.query.v1alpha1.ListRequest.Range")
  public data class Range(
    @ProtobufIndex(index = 1)
    public val start: List<IndexValue>,
    @ProtobufIndex(index = 2)
    public val end: List<IndexValue>,
  ) {
    public object KotlinxSerializer : KSerializer<Range> {
      private val delegator: KSerializer<Range> = Range.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: Range): Unit {
        if (encoder is ProtobufMapperEncoder) {
          encoder.encodeValue(ListRequestMapper.RangeMapper.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): Range {
        if (decoder is ProtobufMapperDecoder) {
          return ListRequestMapper.RangeMapper.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<ListRequest> {
    private val delegator: KSerializer<ListRequest> = ListRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ListRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ListRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ListRequest {
      if (decoder is ProtobufMapperDecoder) {
        return ListRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ListResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.orm.query.v1alpha1.ListResponse")
public data class ListResponse(
  @ProtobufIndex(index = 1)
  public val results: List<Any>,
  @ProtobufIndex(index = 5)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<ListResponse> {
    private val delegator: KSerializer<ListResponse> = ListResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ListResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ListResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ListResponse {
      if (decoder is ProtobufMapperDecoder) {
        return ListResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = IndexValue.KotlinxSerializer::class)
@SerialName(value = "cosmos.orm.query.v1alpha1.IndexValue")
public data class IndexValue(
  public val `value`: ValueOneOf,
) {
  @Serializable
  public sealed interface ValueOneOf {
    @JvmInline
    public value class Uint(
      @ProtobufIndex(index = 1)
      public val `value`: ULong,
    ) : ValueOneOf

    @JvmInline
    public value class Int(
      @ProtobufIndex(index = 2)
      public val `value`: Long,
    ) : ValueOneOf

    @JvmInline
    public value class Str(
      @ProtobufIndex(index = 3)
      public val `value`: String,
    ) : ValueOneOf

    @JvmInline
    public value class Bytes(
      @ProtobufIndex(index = 4)
      public val `value`: ByteArray,
    ) : ValueOneOf

    @JvmInline
    public value class Enum(
      @ProtobufIndex(index = 5)
      public val `value`: String,
    ) : ValueOneOf

    @JvmInline
    public value class Bool(
      @ProtobufIndex(index = 6)
      public val `value`: Boolean,
    ) : ValueOneOf

    @JvmInline
    public value class Timestamp(
      @ProtobufIndex(index = 7)
      public val `value`: google.protobuf.Timestamp,
    ) : ValueOneOf

    @JvmInline
    public value class Duration(
      @ProtobufIndex(index = 8)
      public val `value`: google.protobuf.Duration,
    ) : ValueOneOf
  }

  public object KotlinxSerializer : KSerializer<IndexValue> {
    private val delegator: KSerializer<IndexValue> = IndexValue.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: IndexValue): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(IndexValueMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): IndexValue {
      if (decoder is ProtobufMapperDecoder) {
        return IndexValueMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
