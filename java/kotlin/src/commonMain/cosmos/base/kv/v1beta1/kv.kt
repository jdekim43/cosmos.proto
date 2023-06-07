// Transform from cosmos/base/kv/v1beta1/kv.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.2.1")

package cosmos.base.kv.v1beta1

import kotlin.ByteArray
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufConverterEncoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder

@Serializable(with = Pairs.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.kv.v1beta1.Pairs")
public data class Pairs(
  @ProtobufIndex(index = 1)
  public val pairs: List<Pair>,
) {
  public object KotlinxSerializer : KSerializer<Pairs> {
    private val delegator: KSerializer<Pairs> = Pairs.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Pairs): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PairsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Pairs {
      if (decoder is ProtobufMapperDecoder) {
        return PairsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Pair.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.kv.v1beta1.Pair")
public data class Pair(
  @ProtobufIndex(index = 1)
  public val key: ByteArray,
  @ProtobufIndex(index = 2)
  public val `value`: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<Pair> {
    private val delegator: KSerializer<Pair> = Pair.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Pair): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PairConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Pair {
      if (decoder is ProtobufMapperDecoder) {
        return PairConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}