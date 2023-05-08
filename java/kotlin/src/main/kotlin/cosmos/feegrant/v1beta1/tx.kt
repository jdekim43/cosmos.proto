// Transform from cosmos/feegrant/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.feegrant.v1beta1

import google.protobuf.Any
import kotlin.String
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

@Serializable(with = MsgGrantAllowance.KotlinxSerializer::class)
@SerialName(value = "cosmos.feegrant.v1beta1.MsgGrantAllowance")
public data class MsgGrantAllowance(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
  @ProtobufIndex(index = 3)
  public val allowance: Any,
) {
  public object KotlinxSerializer : KSerializer<MsgGrantAllowance> {
    private val delegator: KSerializer<MsgGrantAllowance> = MsgGrantAllowance.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgGrantAllowance): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgGrantAllowanceMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgGrantAllowance {
      if (decoder is ProtobufMapperDecoder) {
        return MsgGrantAllowanceMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgGrantAllowanceResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.feegrant.v1beta1.MsgGrantAllowanceResponse")
public class MsgGrantAllowanceResponse() {
  public object KotlinxSerializer : KSerializer<MsgGrantAllowanceResponse> {
    private val delegator: KSerializer<MsgGrantAllowanceResponse> =
        MsgGrantAllowanceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgGrantAllowanceResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgGrantAllowanceResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgGrantAllowanceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgGrantAllowanceResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRevokeAllowance.KotlinxSerializer::class)
@SerialName(value = "cosmos.feegrant.v1beta1.MsgRevokeAllowance")
public data class MsgRevokeAllowance(
  @ProtobufIndex(index = 1)
  public val granter: String,
  @ProtobufIndex(index = 2)
  public val grantee: String,
) {
  public object KotlinxSerializer : KSerializer<MsgRevokeAllowance> {
    private val delegator: KSerializer<MsgRevokeAllowance> = MsgRevokeAllowance.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRevokeAllowance): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgRevokeAllowanceMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRevokeAllowance {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRevokeAllowanceMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRevokeAllowanceResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.feegrant.v1beta1.MsgRevokeAllowanceResponse")
public class MsgRevokeAllowanceResponse() {
  public object KotlinxSerializer : KSerializer<MsgRevokeAllowanceResponse> {
    private val delegator: KSerializer<MsgRevokeAllowanceResponse> =
        MsgRevokeAllowanceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRevokeAllowanceResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgRevokeAllowanceResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRevokeAllowanceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRevokeAllowanceResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
