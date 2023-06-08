// Transform from cosmos/staking/v1beta1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.2.2")

package cosmos.staking.v1beta1

import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufConverterEncoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.GenesisState")
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val params: Params,
  @ProtobufIndex(index = 2)
  public val lastTotalPower: ByteArray,
  @ProtobufIndex(index = 3)
  public val lastValidatorPowers: List<LastValidatorPower>,
  @ProtobufIndex(index = 4)
  public val validators: List<Validator>,
  @ProtobufIndex(index = 5)
  public val delegations: List<Delegation>,
  @ProtobufIndex(index = 6)
  public val unbondingDelegations: List<UnbondingDelegation>,
  @ProtobufIndex(index = 7)
  public val redelegations: List<Redelegation>,
  @ProtobufIndex(index = 8)
  public val exported: Boolean,
) {
  public object KotlinxSerializer : KSerializer<GenesisState> {
    private val delegator: KSerializer<GenesisState> = GenesisState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GenesisState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GenesisStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GenesisState {
      if (decoder is ProtobufMapperDecoder) {
        return GenesisStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = LastValidatorPower.KotlinxSerializer::class)
@SerialName(value = "cosmos.staking.v1beta1.LastValidatorPower")
public data class LastValidatorPower(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val power: Long,
) {
  public object KotlinxSerializer : KSerializer<LastValidatorPower> {
    private val delegator: KSerializer<LastValidatorPower> = LastValidatorPower.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: LastValidatorPower): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(LastValidatorPowerConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): LastValidatorPower {
      if (decoder is ProtobufMapperDecoder) {
        return LastValidatorPowerConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
