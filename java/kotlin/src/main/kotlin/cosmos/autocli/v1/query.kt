// Transform from cosmos/autocli/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.autocli.v1

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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

@Serializable(with = AppOptionsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.autocli.v1.AppOptionsRequest")
public class AppOptionsRequest() {
  public object KotlinxSerializer : KSerializer<AppOptionsRequest> {
    private val delegator: KSerializer<AppOptionsRequest> = AppOptionsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AppOptionsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(AppOptionsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AppOptionsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return AppOptionsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AppOptionsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.autocli.v1.AppOptionsResponse")
public data class AppOptionsResponse(
  @ProtobufIndex(index = 1)
  public val moduleOptions: Map<String, ModuleOptions>,
) {
  public object KotlinxSerializer : KSerializer<AppOptionsResponse> {
    private val delegator: KSerializer<AppOptionsResponse> = AppOptionsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AppOptionsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(AppOptionsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AppOptionsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return AppOptionsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
