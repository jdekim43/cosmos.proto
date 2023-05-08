// Transform from cosmos/app/v1alpha1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.app.v1alpha1

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

@Serializable(with = QueryConfigRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.app.v1alpha1.QueryConfigRequest")
public class QueryConfigRequest() {
  public object KotlinxSerializer : KSerializer<QueryConfigRequest> {
    private val delegator: KSerializer<QueryConfigRequest> = QueryConfigRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryConfigRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryConfigRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryConfigRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryConfigRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryConfigResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.app.v1alpha1.QueryConfigResponse")
public data class QueryConfigResponse(
  @ProtobufIndex(index = 1)
  public val config: Config,
) {
  public object KotlinxSerializer : KSerializer<QueryConfigResponse> {
    private val delegator: KSerializer<QueryConfigResponse> = QueryConfigResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryConfigResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryConfigResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryConfigResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryConfigResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
