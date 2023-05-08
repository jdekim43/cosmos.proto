// Transform from tendermint/types/validator.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package tendermint.types

import kotlin.ByteArray
import kotlin.Long
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
import tendermint.crypto.PublicKey

@Serializable(with = ValidatorSet.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.ValidatorSet")
public data class ValidatorSet(
  @ProtobufIndex(index = 1)
  public val validators: List<Validator>,
  @ProtobufIndex(index = 2)
  public val proposer: Validator,
  @ProtobufIndex(index = 3)
  public val totalVotingPower: Long,
) {
  public object KotlinxSerializer : KSerializer<ValidatorSet> {
    private val delegator: KSerializer<ValidatorSet> = ValidatorSet.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorSet): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorSetMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorSet {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorSetMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Validator.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.Validator")
public data class Validator(
  @ProtobufIndex(index = 1)
  public val address: ByteArray,
  @ProtobufIndex(index = 2)
  public val pubKey: PublicKey,
  @ProtobufIndex(index = 3)
  public val votingPower: Long,
  @ProtobufIndex(index = 4)
  public val proposerPriority: Long,
) {
  public object KotlinxSerializer : KSerializer<Validator> {
    private val delegator: KSerializer<Validator> = Validator.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Validator): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Validator {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SimpleValidator.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.SimpleValidator")
public data class SimpleValidator(
  @ProtobufIndex(index = 1)
  public val pubKey: PublicKey,
  @ProtobufIndex(index = 2)
  public val votingPower: Long,
) {
  public object KotlinxSerializer : KSerializer<SimpleValidator> {
    private val delegator: KSerializer<SimpleValidator> = SimpleValidator.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SimpleValidator): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(SimpleValidatorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SimpleValidator {
      if (decoder is ProtobufMapperDecoder) {
        return SimpleValidatorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
