// Transform from tendermint/version/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package tendermint.version

import kotlin.String
import kotlin.ULong
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

@Serializable(with = App.KotlinxSerializer::class)
@SerialName(value = "tendermint.version.App")
public data class App(
  @ProtobufIndex(index = 1)
  public val protocol: ULong,
  @ProtobufIndex(index = 2)
  public val software: String,
) {
  public object KotlinxSerializer : KSerializer<App> {
    private val delegator: KSerializer<App> = App.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: App): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(AppMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): App {
      if (decoder is ProtobufMapperDecoder) {
        return AppMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Consensus.KotlinxSerializer::class)
@SerialName(value = "tendermint.version.Consensus")
public data class Consensus(
  @ProtobufIndex(index = 1)
  public val block: ULong,
  @ProtobufIndex(index = 2)
  public val app: ULong,
) {
  public object KotlinxSerializer : KSerializer<Consensus> {
    private val delegator: KSerializer<Consensus> = Consensus.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Consensus): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ConsensusMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Consensus {
      if (decoder is ProtobufMapperDecoder) {
        return ConsensusMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
