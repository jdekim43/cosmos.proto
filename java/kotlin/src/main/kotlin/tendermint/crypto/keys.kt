// Transform from tendermint/crypto/keys.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package tendermint.crypto

import kotlin.ByteArray
import kotlin.Unit
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

@Serializable(with = PublicKey.KotlinxSerializer::class)
@SerialName(value = "tendermint.crypto.PublicKey")
public data class PublicKey(
  public val sum: SumOneOf,
) {
  @Serializable
  public sealed interface SumOneOf {
    @JvmInline
    public value class Ed25519(
      @ProtobufIndex(index = 1)
      public val `value`: ByteArray,
    ) : SumOneOf

    @JvmInline
    public value class Secp256K1(
      @ProtobufIndex(index = 2)
      public val `value`: ByteArray,
    ) : SumOneOf
  }

  public object KotlinxSerializer : KSerializer<PublicKey> {
    private val delegator: KSerializer<PublicKey> = PublicKey.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PublicKey): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(PublicKeyMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PublicKey {
      if (decoder is ProtobufMapperDecoder) {
        return PublicKeyMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
