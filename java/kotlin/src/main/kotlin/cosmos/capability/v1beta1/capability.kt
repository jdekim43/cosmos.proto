// Transform from cosmos/capability/v1beta1/capability.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.capability.v1beta1

import kotlin.String
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

@Serializable(with = Capability.KotlinxSerializer::class)
@SerialName(value = "cosmos.capability.v1beta1.Capability")
public data class Capability(
  @ProtobufIndex(index = 1)
  public val index: ULong,
) {
  public object KotlinxSerializer : KSerializer<Capability> {
    private val delegator: KSerializer<Capability> = Capability.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Capability): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(CapabilityMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Capability {
      if (decoder is ProtobufMapperDecoder) {
        return CapabilityMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Owner.KotlinxSerializer::class)
@SerialName(value = "cosmos.capability.v1beta1.Owner")
public data class Owner(
  @ProtobufIndex(index = 1)
  public val module: String,
  @ProtobufIndex(index = 2)
  public val name: String,
) {
  public object KotlinxSerializer : KSerializer<Owner> {
    private val delegator: KSerializer<Owner> = Owner.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Owner): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(OwnerMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Owner {
      if (decoder is ProtobufMapperDecoder) {
        return OwnerMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CapabilityOwners.KotlinxSerializer::class)
@SerialName(value = "cosmos.capability.v1beta1.CapabilityOwners")
public data class CapabilityOwners(
  @ProtobufIndex(index = 1)
  public val owners: List<Owner>,
) {
  public object KotlinxSerializer : KSerializer<CapabilityOwners> {
    private val delegator: KSerializer<CapabilityOwners> = CapabilityOwners.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CapabilityOwners): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(CapabilityOwnersMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CapabilityOwners {
      if (decoder is ProtobufMapperDecoder) {
        return CapabilityOwnersMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
