// Transform from google/protobuf/any.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.2.2")

package google.protobuf

import kotlin.ByteArray
import kotlin.String
import kotlin.Unit
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

@Serializable(with = Any.KotlinxSerializer::class)
@SerialName(value = "google.protobuf.Any")
public data class Any(
  @ProtobufIndex(index = 1)
  public val typeUrl: String,
  @ProtobufIndex(index = 2)
  public val `value`: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<Any> {
    private val delegator: KSerializer<Any> = Any.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Any): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AnyConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Any {
      if (decoder is ProtobufMapperDecoder) {
        return AnyConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
