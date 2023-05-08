// Transform from cosmos/authz/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.authz.v1beta1

import google.protobuf.Any
import kotlin.ByteArray
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

@Serializable(with = MsgGrant.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.MsgGrant")
public data class MsgGrant(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
  @ProtobufIndex(index = 3)
  public val grant: Grant,
) {
  public object KotlinxSerializer : KSerializer<MsgGrant> {
    private val delegator: KSerializer<MsgGrant> = MsgGrant.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgGrant): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgGrantMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgGrant {
      if (decoder is ProtobufMapperDecoder) {
        return MsgGrantMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExecResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.MsgExecResponse")
public data class MsgExecResponse(
  @ProtobufIndex(index = 1)
  public val results: List<ByteArray>,
) {
  public object KotlinxSerializer : KSerializer<MsgExecResponse> {
    private val delegator: KSerializer<MsgExecResponse> = MsgExecResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExecResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgExecResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExecResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExecResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExec.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.MsgExec")
public data class MsgExec(
  @ProtobufIndex(index = 1)
  public val grantee: String,
  @ProtobufIndex(index = 2)
  public val msgs: List<Any>,
) {
  public object KotlinxSerializer : KSerializer<MsgExec> {
    private val delegator: KSerializer<MsgExec> = MsgExec.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExec): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgExecMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExec {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExecMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgGrantResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.MsgGrantResponse")
public class MsgGrantResponse() {
  public object KotlinxSerializer : KSerializer<MsgGrantResponse> {
    private val delegator: KSerializer<MsgGrantResponse> = MsgGrantResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgGrantResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgGrantResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgGrantResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgGrantResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRevoke.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.MsgRevoke")
public data class MsgRevoke(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
  @ProtobufIndex(index = 3)
  public val msgTypeUrl: String,
) {
  public object KotlinxSerializer : KSerializer<MsgRevoke> {
    private val delegator: KSerializer<MsgRevoke> = MsgRevoke.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRevoke): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgRevokeMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRevoke {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRevokeMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRevokeResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.authz.v1beta1.MsgRevokeResponse")
public class MsgRevokeResponse() {
  public object KotlinxSerializer : KSerializer<MsgRevokeResponse> {
    private val delegator: KSerializer<MsgRevokeResponse> = MsgRevokeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRevokeResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgRevokeResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRevokeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRevokeResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
