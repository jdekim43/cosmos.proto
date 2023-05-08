// Transform from tendermint/types/block.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package tendermint.types

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

@Serializable(with = Block.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.Block")
public data class Block(
  @ProtobufIndex(index = 1)
  public val `header`: Header,
  @ProtobufIndex(index = 2)
  public val `data`: Data,
  @ProtobufIndex(index = 3)
  public val evidence: EvidenceList,
  @ProtobufIndex(index = 4)
  public val lastCommit: Commit,
) {
  public object KotlinxSerializer : KSerializer<Block> {
    private val delegator: KSerializer<Block> = Block.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Block): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(BlockMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Block {
      if (decoder is ProtobufMapperDecoder) {
        return BlockMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
