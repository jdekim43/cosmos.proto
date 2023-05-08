// Transform from cosmos/base/node/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.base.node.v1beta1

import kotlin.String
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

@Serializable(with = ConfigRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.node.v1beta1.ConfigRequest")
public class ConfigRequest() {
  public object KotlinxSerializer : KSerializer<ConfigRequest> {
    private val delegator: KSerializer<ConfigRequest> = ConfigRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ConfigRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ConfigRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ConfigRequest {
      if (decoder is ProtobufMapperDecoder) {
        return ConfigRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ConfigResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.node.v1beta1.ConfigResponse")
public data class ConfigResponse(
  @ProtobufIndex(index = 1)
  public val minimumGasPrice: String,
) {
  public object KotlinxSerializer : KSerializer<ConfigResponse> {
    private val delegator: KSerializer<ConfigResponse> = ConfigResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ConfigResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ConfigResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ConfigResponse {
      if (decoder is ProtobufMapperDecoder) {
        return ConfigResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}