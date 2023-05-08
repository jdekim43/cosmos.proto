// Transform from tendermint/types/params.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package tendermint.types

import google.protobuf.Duration
import kotlin.Long
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

@Serializable(with = ConsensusParams.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.ConsensusParams")
public data class ConsensusParams(
  @ProtobufIndex(index = 1)
  public val block: BlockParams,
  @ProtobufIndex(index = 2)
  public val evidence: EvidenceParams,
  @ProtobufIndex(index = 3)
  public val validator: ValidatorParams,
  @ProtobufIndex(index = 4)
  public val version: VersionParams,
) {
  public object KotlinxSerializer : KSerializer<ConsensusParams> {
    private val delegator: KSerializer<ConsensusParams> = ConsensusParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ConsensusParams): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ConsensusParamsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ConsensusParams {
      if (decoder is ProtobufMapperDecoder) {
        return ConsensusParamsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BlockParams.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.BlockParams")
public data class BlockParams(
  @ProtobufIndex(index = 1)
  public val maxBytes: Long,
  @ProtobufIndex(index = 2)
  public val maxGas: Long,
) {
  public object KotlinxSerializer : KSerializer<BlockParams> {
    private val delegator: KSerializer<BlockParams> = BlockParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlockParams): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(BlockParamsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlockParams {
      if (decoder is ProtobufMapperDecoder) {
        return BlockParamsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EvidenceParams.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.EvidenceParams")
public data class EvidenceParams(
  @ProtobufIndex(index = 1)
  public val maxAgeNumBlocks: Long,
  @ProtobufIndex(index = 2)
  public val maxAgeDuration: Duration,
  @ProtobufIndex(index = 3)
  public val maxBytes: Long,
) {
  public object KotlinxSerializer : KSerializer<EvidenceParams> {
    private val delegator: KSerializer<EvidenceParams> = EvidenceParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EvidenceParams): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EvidenceParamsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EvidenceParams {
      if (decoder is ProtobufMapperDecoder) {
        return EvidenceParamsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorParams.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.ValidatorParams")
public data class ValidatorParams(
  @ProtobufIndex(index = 1)
  public val pubKeyTypes: List<String>,
) {
  public object KotlinxSerializer : KSerializer<ValidatorParams> {
    private val delegator: KSerializer<ValidatorParams> = ValidatorParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorParams): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorParamsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorParams {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorParamsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = VersionParams.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.VersionParams")
public data class VersionParams(
  @ProtobufIndex(index = 1)
  public val app: ULong,
) {
  public object KotlinxSerializer : KSerializer<VersionParams> {
    private val delegator: KSerializer<VersionParams> = VersionParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: VersionParams): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(VersionParamsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): VersionParams {
      if (decoder is ProtobufMapperDecoder) {
        return VersionParamsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = HashedParams.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.HashedParams")
public data class HashedParams(
  @ProtobufIndex(index = 1)
  public val blockMaxBytes: Long,
  @ProtobufIndex(index = 2)
  public val blockMaxGas: Long,
) {
  public object KotlinxSerializer : KSerializer<HashedParams> {
    private val delegator: KSerializer<HashedParams> = HashedParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: HashedParams): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(HashedParamsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): HashedParams {
      if (decoder is ProtobufMapperDecoder) {
        return HashedParamsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
