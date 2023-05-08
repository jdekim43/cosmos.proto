// Transform from google/protobuf/duration.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package google.protobuf

import kotlin.Int
import kotlin.Long
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

@Serializable(with = Duration.KotlinxSerializer::class)
@SerialName(value = "google.protobuf.Duration")
public data class Duration(
  @ProtobufIndex(index = 1)
  public val seconds: Long,
  @ProtobufIndex(index = 2)
  public val nanos: Int,
) {
  public object KotlinxSerializer : KSerializer<Duration> {
    private val delegator: KSerializer<Duration> = Duration.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Duration): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DurationMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Duration {
      if (decoder is ProtobufMapperDecoder) {
        return DurationMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
