// Transform from cosmos/capability/v1beta1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.capability.v1beta1

import kotlin.ULong
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

@Serializable(with = GenesisOwners.KotlinxSerializer::class)
@SerialName(value = "cosmos.capability.v1beta1.GenesisOwners")
public data class GenesisOwners(
  @ProtobufIndex(index = 1)
  public val index: ULong,
  @ProtobufIndex(index = 2)
  public val indexOwners: CapabilityOwners,
) {
  public object KotlinxSerializer : KSerializer<GenesisOwners> {
    private val delegator: KSerializer<GenesisOwners> = GenesisOwners.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GenesisOwners): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GenesisOwnersMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GenesisOwners {
      if (decoder is ProtobufMapperDecoder) {
        return GenesisOwnersMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = "cosmos.capability.v1beta1.GenesisState")
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val index: ULong,
  @ProtobufIndex(index = 2)
  public val owners: List<GenesisOwners>,
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
