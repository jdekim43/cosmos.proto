// Transform from tendermint/crypto/proof.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package tendermint.crypto

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
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperEncoder

@Serializable(with = Proof.KotlinxSerializer::class)
@SerialName(value = "tendermint.crypto.Proof")
public data class Proof(
  @ProtobufIndex(index = 1)
  public val total: Long,
  @ProtobufIndex(index = 2)
  public val index: Long,
  @ProtobufIndex(index = 3)
  public val leafHash: ByteArray,
  @ProtobufIndex(index = 4)
  public val aunts: List<ByteArray>,
) {
  public object KotlinxSerializer : KSerializer<Proof> {
    private val delegator: KSerializer<Proof> = Proof.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Proof): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ProofMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Proof {
      if (decoder is ProtobufMapperDecoder) {
        return ProofMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValueOp.KotlinxSerializer::class)
@SerialName(value = "tendermint.crypto.ValueOp")
public data class ValueOp(
  @ProtobufIndex(index = 1)
  public val key: ByteArray,
  @ProtobufIndex(index = 2)
  public val proof: Proof,
) {
  public object KotlinxSerializer : KSerializer<ValueOp> {
    private val delegator: KSerializer<ValueOp> = ValueOp.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValueOp): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValueOpMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValueOp {
      if (decoder is ProtobufMapperDecoder) {
        return ValueOpMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DominoOp.KotlinxSerializer::class)
@SerialName(value = "tendermint.crypto.DominoOp")
public data class DominoOp(
  @ProtobufIndex(index = 1)
  public val key: String,
  @ProtobufIndex(index = 2)
  public val input: String,
  @ProtobufIndex(index = 3)
  public val output: String,
) {
  public object KotlinxSerializer : KSerializer<DominoOp> {
    private val delegator: KSerializer<DominoOp> = DominoOp.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DominoOp): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DominoOpMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DominoOp {
      if (decoder is ProtobufMapperDecoder) {
        return DominoOpMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ProofOp.KotlinxSerializer::class)
@SerialName(value = "tendermint.crypto.ProofOp")
public data class ProofOp(
  @ProtobufIndex(index = 1)
  public val type: String,
  @ProtobufIndex(index = 2)
  public val key: ByteArray,
  @ProtobufIndex(index = 3)
  public val `data`: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<ProofOp> {
    private val delegator: KSerializer<ProofOp> = ProofOp.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ProofOp): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ProofOpMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ProofOp {
      if (decoder is ProtobufMapperDecoder) {
        return ProofOpMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ProofOps.KotlinxSerializer::class)
@SerialName(value = "tendermint.crypto.ProofOps")
public data class ProofOps(
  @ProtobufIndex(index = 1)
  public val ops: List<ProofOp>,
) {
  public object KotlinxSerializer : KSerializer<ProofOps> {
    private val delegator: KSerializer<ProofOps> = ProofOps.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ProofOps): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ProofOpsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ProofOps {
      if (decoder is ProtobufMapperDecoder) {
        return ProofOpsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}