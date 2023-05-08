// Transform from cosmos/crypto/ed25519/keys.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.crypto.ed25519

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

@Serializable(with = PubKey.KotlinxSerializer::class)
@SerialName(value = "cosmos.crypto.ed25519.PubKey")
public data class PubKey(
  @ProtobufIndex(index = 1)
  public val key: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<PubKey> {
    private val delegator: KSerializer<PubKey> = PubKey.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PubKey): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(PubKeyMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PubKey {
      if (decoder is ProtobufMapperDecoder) {
        return PubKeyMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PrivKey.KotlinxSerializer::class)
@SerialName(value = "cosmos.crypto.ed25519.PrivKey")
public data class PrivKey(
  @ProtobufIndex(index = 1)
  public val key: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<PrivKey> {
    private val delegator: KSerializer<PrivKey> = PrivKey.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PrivKey): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(PrivKeyMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PrivKey {
      if (decoder is ProtobufMapperDecoder) {
        return PrivKeyMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
