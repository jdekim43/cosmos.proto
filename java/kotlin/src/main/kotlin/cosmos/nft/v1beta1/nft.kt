// Transform from cosmos/nft/v1beta1/nft.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.nft.v1beta1

import google.protobuf.Any
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

@Serializable(with = Class.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.Class")
public data class Class(
  @ProtobufIndex(index = 1)
  public val id: String,
  @ProtobufIndex(index = 2)
  public val name: String,
  @ProtobufIndex(index = 3)
  public val symbol: String,
  @ProtobufIndex(index = 4)
  public val description: String,
  @ProtobufIndex(index = 5)
  public val uri: String,
  @ProtobufIndex(index = 6)
  public val uriHash: String,
  @ProtobufIndex(index = 7)
  public val `data`: Any,
) {
  public object KotlinxSerializer : KSerializer<Class> {
    private val delegator: KSerializer<Class> = Class.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Class): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ClassMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Class {
      if (decoder is ProtobufMapperDecoder) {
        return ClassMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = NFT.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.NFT")
public data class NFT(
  @ProtobufIndex(index = 1)
  public val classId: String,
  @ProtobufIndex(index = 2)
  public val id: String,
  @ProtobufIndex(index = 3)
  public val uri: String,
  @ProtobufIndex(index = 4)
  public val uriHash: String,
  @ProtobufIndex(index = 10)
  public val `data`: Any,
) {
  public object KotlinxSerializer : KSerializer<NFT> {
    private val delegator: KSerializer<NFT> = NFT.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: NFT): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(NFTMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): NFT {
      if (decoder is ProtobufMapperDecoder) {
        return NFTMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
