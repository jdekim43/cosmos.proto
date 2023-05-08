// Transform from cosmos/base/reflection/v1beta1/reflection.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.base.reflection.v1beta1

import kotlin.String
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

@Serializable(with = ListAllInterfacesRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v1beta1.ListAllInterfacesRequest")
public class ListAllInterfacesRequest() {
  public object KotlinxSerializer : KSerializer<ListAllInterfacesRequest> {
    private val delegator: KSerializer<ListAllInterfacesRequest> =
        ListAllInterfacesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ListAllInterfacesRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ListAllInterfacesRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ListAllInterfacesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return ListAllInterfacesRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ListAllInterfacesResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v1beta1.ListAllInterfacesResponse")
public data class ListAllInterfacesResponse(
  @ProtobufIndex(index = 1)
  public val interfaceNames: List<String>,
) {
  public object KotlinxSerializer : KSerializer<ListAllInterfacesResponse> {
    private val delegator: KSerializer<ListAllInterfacesResponse> =
        ListAllInterfacesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ListAllInterfacesResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ListAllInterfacesResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ListAllInterfacesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return ListAllInterfacesResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ListImplementationsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v1beta1.ListImplementationsRequest")
public data class ListImplementationsRequest(
  @ProtobufIndex(index = 1)
  public val interfaceName: String,
) {
  public object KotlinxSerializer : KSerializer<ListImplementationsRequest> {
    private val delegator: KSerializer<ListImplementationsRequest> =
        ListImplementationsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ListImplementationsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ListImplementationsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ListImplementationsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return ListImplementationsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ListImplementationsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v1beta1.ListImplementationsResponse")
public data class ListImplementationsResponse(
  @ProtobufIndex(index = 1)
  public val implementationMessageNames: List<String>,
) {
  public object KotlinxSerializer : KSerializer<ListImplementationsResponse> {
    private val delegator: KSerializer<ListImplementationsResponse> =
        ListImplementationsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ListImplementationsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ListImplementationsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ListImplementationsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return ListImplementationsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
