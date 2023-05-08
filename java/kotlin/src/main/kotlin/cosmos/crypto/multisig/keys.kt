// Transform from cosmos/crypto/multisig/keys.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.crypto.multisig

import google.protobuf.Any
import kotlin.UInt
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

@Serializable(with = LegacyAminoPubKey.KotlinxSerializer::class)
@SerialName(value = "cosmos.crypto.multisig.LegacyAminoPubKey")
public data class LegacyAminoPubKey(
  @ProtobufIndex(index = 1)
  public val threshold: UInt,
  @ProtobufIndex(index = 2)
  public val publicKeys: List<Any>,
) {
  public object KotlinxSerializer : KSerializer<LegacyAminoPubKey> {
    private val delegator: KSerializer<LegacyAminoPubKey> = LegacyAminoPubKey.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: LegacyAminoPubKey): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(LegacyAminoPubKeyMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): LegacyAminoPubKey {
      if (decoder is ProtobufMapperDecoder) {
        return LegacyAminoPubKeyMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
