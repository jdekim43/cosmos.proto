// Transform from tendermint/types/evidence.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package tendermint.types

import google.protobuf.Timestamp
import kotlin.Long
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmInline
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

@Serializable(with = Evidence.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.Evidence")
public data class Evidence(
  public val sum: SumOneOf,
) {
  @Serializable
  public sealed interface SumOneOf {
    @JvmInline
    public value class DuplicateVoteEvidence(
      @ProtobufIndex(index = 1)
      public val `value`: tendermint.types.DuplicateVoteEvidence,
    ) : SumOneOf

    @JvmInline
    public value class LightClientAttackEvidence(
      @ProtobufIndex(index = 2)
      public val `value`: tendermint.types.LightClientAttackEvidence,
    ) : SumOneOf
  }

  public object KotlinxSerializer : KSerializer<Evidence> {
    private val delegator: KSerializer<Evidence> = Evidence.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Evidence): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EvidenceMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Evidence {
      if (decoder is ProtobufMapperDecoder) {
        return EvidenceMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DuplicateVoteEvidence.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.DuplicateVoteEvidence")
public data class DuplicateVoteEvidence(
  @ProtobufIndex(index = 1)
  public val voteA: Vote,
  @ProtobufIndex(index = 2)
  public val voteB: Vote,
  @ProtobufIndex(index = 3)
  public val totalVotingPower: Long,
  @ProtobufIndex(index = 4)
  public val validatorPower: Long,
  @ProtobufIndex(index = 5)
  public val timestamp: Timestamp,
) {
  public object KotlinxSerializer : KSerializer<DuplicateVoteEvidence> {
    private val delegator: KSerializer<DuplicateVoteEvidence> = DuplicateVoteEvidence.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DuplicateVoteEvidence): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DuplicateVoteEvidenceMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DuplicateVoteEvidence {
      if (decoder is ProtobufMapperDecoder) {
        return DuplicateVoteEvidenceMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = LightClientAttackEvidence.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.LightClientAttackEvidence")
public data class LightClientAttackEvidence(
  @ProtobufIndex(index = 1)
  public val conflictingBlock: LightBlock,
  @ProtobufIndex(index = 2)
  public val commonHeight: Long,
  @ProtobufIndex(index = 3)
  public val byzantineValidators: List<Validator>,
  @ProtobufIndex(index = 4)
  public val totalVotingPower: Long,
  @ProtobufIndex(index = 5)
  public val timestamp: Timestamp,
) {
  public object KotlinxSerializer : KSerializer<LightClientAttackEvidence> {
    private val delegator: KSerializer<LightClientAttackEvidence> =
        LightClientAttackEvidence.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: LightClientAttackEvidence): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(LightClientAttackEvidenceMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): LightClientAttackEvidence {
      if (decoder is ProtobufMapperDecoder) {
        return LightClientAttackEvidenceMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EvidenceList.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.EvidenceList")
public data class EvidenceList(
  @ProtobufIndex(index = 1)
  public val evidence: List<Evidence>,
) {
  public object KotlinxSerializer : KSerializer<EvidenceList> {
    private val delegator: KSerializer<EvidenceList> = EvidenceList.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EvidenceList): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EvidenceListMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EvidenceList {
      if (decoder is ProtobufMapperDecoder) {
        return EvidenceListMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
