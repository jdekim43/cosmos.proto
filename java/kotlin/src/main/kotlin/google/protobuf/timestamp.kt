// Transform from google/protobuf/timestamp.proto
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

@Serializable(with = Timestamp.KotlinxSerializer::class)
@SerialName(value = "google.protobuf.Timestamp")
public data class Timestamp(
  @ProtobufIndex(index = 1)
  public val seconds: Long,
  @ProtobufIndex(index = 2)
  public val nanos: Int,
) {
  public object KotlinxSerializer : KSerializer<Timestamp> {
    private val delegator: KSerializer<Timestamp> = Timestamp.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Timestamp): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(TimestampMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Timestamp {
      if (decoder is ProtobufMapperDecoder) {
        return TimestampMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
