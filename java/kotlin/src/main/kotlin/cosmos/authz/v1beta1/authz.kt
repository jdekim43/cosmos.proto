// Transform from cosmos/authz/v1beta1/authz.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.authz.v1beta1

import google.protobuf.Any
import google.protobuf.Timestamp
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

@Serializable(with = GenericAuthorization.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.GenericAuthorization")
public data class GenericAuthorization(
  @ProtobufIndex(index = 1)
  public val msg: String,
) {
  public object KotlinxSerializer : KSerializer<GenericAuthorization> {
    private val delegator: KSerializer<GenericAuthorization> = GenericAuthorization.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GenericAuthorization): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GenericAuthorizationMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GenericAuthorization {
      if (decoder is ProtobufMapperDecoder) {
        return GenericAuthorizationMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Grant.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.Grant")
public data class Grant(
  @ProtobufIndex(index = 1)
  public val authorization: Any,
  @ProtobufIndex(index = 2)
  public val expiration: Timestamp,
) {
  public object KotlinxSerializer : KSerializer<Grant> {
    private val delegator: KSerializer<Grant> = Grant.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Grant): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GrantMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Grant {
      if (decoder is ProtobufMapperDecoder) {
        return GrantMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GrantAuthorization.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.GrantAuthorization")
public data class GrantAuthorization(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
  @ProtobufIndex(index = 3)
  public val authorization: Any,
  @ProtobufIndex(index = 4)
  public val expiration: Timestamp,
) {
  public object KotlinxSerializer : KSerializer<GrantAuthorization> {
    private val delegator: KSerializer<GrantAuthorization> = GrantAuthorization.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GrantAuthorization): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GrantAuthorizationMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GrantAuthorization {
      if (decoder is ProtobufMapperDecoder) {
        return GrantAuthorizationMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GrantQueueItem.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.GrantQueueItem")
public data class GrantQueueItem(
  @ProtobufIndex(index = 1)
  public val msgTypeUrls: List<String>,
) {
  public object KotlinxSerializer : KSerializer<GrantQueueItem> {
    private val delegator: KSerializer<GrantQueueItem> = GrantQueueItem.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GrantQueueItem): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GrantQueueItemMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GrantQueueItem {
      if (decoder is ProtobufMapperDecoder) {
        return GrantQueueItemMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
