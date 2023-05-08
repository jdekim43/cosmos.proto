// Transform from cosmos/reflection/v1/reflection.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.reflection.v1

import google.protobuf.FileDescriptorProto
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

@Serializable(with = FileDescriptorsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.reflection.v1.FileDescriptorsRequest")
public class FileDescriptorsRequest() {
  public object KotlinxSerializer : KSerializer<FileDescriptorsRequest> {
    private val delegator: KSerializer<FileDescriptorsRequest> = FileDescriptorsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FileDescriptorsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(FileDescriptorsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FileDescriptorsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return FileDescriptorsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FileDescriptorsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.reflection.v1.FileDescriptorsResponse")
public data class FileDescriptorsResponse(
  @ProtobufIndex(index = 1)
  public val files: List<FileDescriptorProto>,
) {
  public object KotlinxSerializer : KSerializer<FileDescriptorsResponse> {
    private val delegator: KSerializer<FileDescriptorsResponse> =
        FileDescriptorsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FileDescriptorsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(FileDescriptorsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FileDescriptorsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return FileDescriptorsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
