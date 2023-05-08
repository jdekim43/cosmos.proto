// Transform from cosmos/nft/v1beta1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.nft.v1beta1

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

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.GenesisState")
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val classes: List<Class>,
  @ProtobufIndex(index = 2)
  public val entries: List<Entry>,
) {
  public object KotlinxSerializer : KSerializer<GenesisState> {
    private val delegator: KSerializer<GenesisState> = GenesisState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GenesisState): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GenesisStateMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GenesisState {
      if (decoder is ProtobufMapperDecoder) {
        return GenesisStateMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Entry.KotlinxSerializer::class)
@SerialName(value = "cosmos.nft.v1beta1.Entry")
public data class Entry(
  @ProtobufIndex(index = 1)
  public val owner: String,
  @ProtobufIndex(index = 2)
  public val nfts: List<NFT>,
) {
  public object KotlinxSerializer : KSerializer<Entry> {
    private val delegator: KSerializer<Entry> = Entry.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Entry): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EntryMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Entry {
      if (decoder is ProtobufMapperDecoder) {
        return EntryMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
