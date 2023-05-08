// Transform from tendermint/libs/bits/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package tendermint.libs.bits

import kotlin.Long
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

@Serializable(with = BitArray.KotlinxSerializer::class)
@SerialName(value = "tendermint.libs.bits.BitArray")
public data class BitArray(
  @ProtobufIndex(index = 1)
  public val bits: Long,
  @ProtobufIndex(index = 2)
  public val elems: List<ULong>,
) {
  public object KotlinxSerializer : KSerializer<BitArray> {
    private val delegator: KSerializer<BitArray> = BitArray.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BitArray): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(BitArrayMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BitArray {
      if (decoder is ProtobufMapperDecoder) {
        return BitArrayMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
