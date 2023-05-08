// Transform from cosmos/slashing/v1beta1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.slashing.v1beta1

import kotlin.Boolean
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
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperEncoder

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.GenesisState")
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val params: Params,
  @ProtobufIndex(index = 2)
  public val signingInfos: List<SigningInfo>,
  @ProtobufIndex(index = 3)
  public val missedBlocks: List<ValidatorMissedBlocks>,
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

@Serializable(with = SigningInfo.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.SigningInfo")
public data class SigningInfo(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val validatorSigningInfo: ValidatorSigningInfo,
) {
  public object KotlinxSerializer : KSerializer<SigningInfo> {
    private val delegator: KSerializer<SigningInfo> = SigningInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SigningInfo): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(SigningInfoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SigningInfo {
      if (decoder is ProtobufMapperDecoder) {
        return SigningInfoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorMissedBlocks.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.ValidatorMissedBlocks")
public data class ValidatorMissedBlocks(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val missedBlocks: List<MissedBlock>,
) {
  public object KotlinxSerializer : KSerializer<ValidatorMissedBlocks> {
    private val delegator: KSerializer<ValidatorMissedBlocks> = ValidatorMissedBlocks.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorMissedBlocks): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorMissedBlocksMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorMissedBlocks {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorMissedBlocksMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MissedBlock.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.MissedBlock")
public data class MissedBlock(
  @ProtobufIndex(index = 1)
  public val index: Long,
  @ProtobufIndex(index = 2)
  public val missed: Boolean,
) {
  public object KotlinxSerializer : KSerializer<MissedBlock> {
    private val delegator: KSerializer<MissedBlock> = MissedBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MissedBlock): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MissedBlockMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MissedBlock {
      if (decoder is ProtobufMapperDecoder) {
        return MissedBlockMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
