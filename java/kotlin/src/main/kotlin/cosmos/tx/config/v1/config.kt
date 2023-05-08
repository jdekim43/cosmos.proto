// Transform from cosmos/tx/config/v1/config.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.tx.config.v1

import kotlin.Boolean
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

@Serializable(with = Config.KotlinxSerializer::class)
@SerialName(value = "cosmos.tx.config.v1.Config")
public data class Config(
  @ProtobufIndex(index = 1)
  public val skipAnteHandler: Boolean,
  @ProtobufIndex(index = 2)
  public val skipPostHandler: Boolean,
) {
  public object KotlinxSerializer : KSerializer<Config> {
    private val delegator: KSerializer<Config> = Config.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Config): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ConfigMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Config {
      if (decoder is ProtobufMapperDecoder) {
        return ConfigMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
