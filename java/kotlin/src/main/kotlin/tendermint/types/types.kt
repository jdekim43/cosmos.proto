// Transform from tendermint/types/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package tendermint.types

import google.protobuf.Timestamp
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
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
import tendermint.crypto.Proof
import tendermint.version.Consensus

@Serializable
@SerialName(value = "tendermint.types.BlockIDFlag")
public enum class BlockIDFlag(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  BLOCK_ID_FLAG_UNKNOWN(0),
  @ProtobufIndex(index = 1)
  BLOCK_ID_FLAG_ABSENT(1),
  @ProtobufIndex(index = 2)
  BLOCK_ID_FLAG_COMMIT(2),
  @ProtobufIndex(index = 3)
  BLOCK_ID_FLAG_NIL(3),
  ;

  public companion object {
    public fun forNumber(number: Int): BlockIDFlag = BlockIDFlag.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "tendermint.types.SignedMsgType")
public enum class SignedMsgType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  SIGNED_MSG_TYPE_UNKNOWN(0),
  @ProtobufIndex(index = 1)
  SIGNED_MSG_TYPE_PREVOTE(1),
  @ProtobufIndex(index = 2)
  SIGNED_MSG_TYPE_PRECOMMIT(2),
  @ProtobufIndex(index = 32)
  SIGNED_MSG_TYPE_PROPOSAL(32),
  ;

  public companion object {
    public fun forNumber(number: Int): SignedMsgType = SignedMsgType.values()
    	.first { it.number == number }
  }
}

@Serializable(with = PartSetHeader.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.PartSetHeader")
public data class PartSetHeader(
  @ProtobufIndex(index = 1)
  public val total: UInt,
  @ProtobufIndex(index = 2)
  public val hash: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<PartSetHeader> {
    private val delegator: KSerializer<PartSetHeader> = PartSetHeader.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PartSetHeader): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(PartSetHeaderMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PartSetHeader {
      if (decoder is ProtobufMapperDecoder) {
        return PartSetHeaderMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Part.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.Part")
public data class Part(
  @ProtobufIndex(index = 1)
  public val index: UInt,
  @ProtobufIndex(index = 2)
  public val bytes: ByteArray,
  @ProtobufIndex(index = 3)
  public val proof: Proof,
) {
  public object KotlinxSerializer : KSerializer<Part> {
    private val delegator: KSerializer<Part> = Part.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Part): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(PartMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Part {
      if (decoder is ProtobufMapperDecoder) {
        return PartMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BlockID.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.BlockID")
public data class BlockID(
  @ProtobufIndex(index = 1)
  public val hash: ByteArray,
  @ProtobufIndex(index = 2)
  public val partSetHeader: PartSetHeader,
) {
  public object KotlinxSerializer : KSerializer<BlockID> {
    private val delegator: KSerializer<BlockID> = BlockID.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlockID): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(BlockIDMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlockID {
      if (decoder is ProtobufMapperDecoder) {
        return BlockIDMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Header.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.Header")
public data class Header(
  @ProtobufIndex(index = 1)
  public val version: Consensus,
  @ProtobufIndex(index = 2)
  public val chainId: String,
  @ProtobufIndex(index = 3)
  public val height: Long,
  @ProtobufIndex(index = 4)
  public val time: Timestamp,
  @ProtobufIndex(index = 5)
  public val lastBlockId: BlockID,
  @ProtobufIndex(index = 6)
  public val lastCommitHash: ByteArray,
  @ProtobufIndex(index = 7)
  public val dataHash: ByteArray,
  @ProtobufIndex(index = 8)
  public val validatorsHash: ByteArray,
  @ProtobufIndex(index = 9)
  public val nextValidatorsHash: ByteArray,
  @ProtobufIndex(index = 10)
  public val consensusHash: ByteArray,
  @ProtobufIndex(index = 11)
  public val appHash: ByteArray,
  @ProtobufIndex(index = 12)
  public val lastResultsHash: ByteArray,
  @ProtobufIndex(index = 13)
  public val evidenceHash: ByteArray,
  @ProtobufIndex(index = 14)
  public val proposerAddress: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<Header> {
    private val delegator: KSerializer<Header> = Header.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Header): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(HeaderMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Header {
      if (decoder is ProtobufMapperDecoder) {
        return HeaderMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Data.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.Data")
public data class Data(
  @ProtobufIndex(index = 1)
  public val txs: List<ByteArray>,
) {
  public object KotlinxSerializer : KSerializer<Data> {
    private val delegator: KSerializer<Data> = Data.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Data): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DataMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Data {
      if (decoder is ProtobufMapperDecoder) {
        return DataMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Vote.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.Vote")
public data class Vote(
  @ProtobufIndex(index = 1)
  public val type: SignedMsgType,
  @ProtobufIndex(index = 2)
  public val height: Long,
  @ProtobufIndex(index = 3)
  public val round: Int,
  @ProtobufIndex(index = 4)
  public val blockId: BlockID,
  @ProtobufIndex(index = 5)
  public val timestamp: Timestamp,
  @ProtobufIndex(index = 6)
  public val validatorAddress: ByteArray,
  @ProtobufIndex(index = 7)
  public val validatorIndex: Int,
  @ProtobufIndex(index = 8)
  public val signature: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<Vote> {
    private val delegator: KSerializer<Vote> = Vote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Vote): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(VoteMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Vote {
      if (decoder is ProtobufMapperDecoder) {
        return VoteMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Commit.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.Commit")
public data class Commit(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val round: Int,
  @ProtobufIndex(index = 3)
  public val blockId: BlockID,
  @ProtobufIndex(index = 4)
  public val signatures: List<CommitSig>,
) {
  public object KotlinxSerializer : KSerializer<Commit> {
    private val delegator: KSerializer<Commit> = Commit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Commit): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(CommitMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Commit {
      if (decoder is ProtobufMapperDecoder) {
        return CommitMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CommitSig.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.CommitSig")
public data class CommitSig(
  @ProtobufIndex(index = 1)
  public val blockIdFlag: BlockIDFlag,
  @ProtobufIndex(index = 2)
  public val validatorAddress: ByteArray,
  @ProtobufIndex(index = 3)
  public val timestamp: Timestamp,
  @ProtobufIndex(index = 4)
  public val signature: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<CommitSig> {
    private val delegator: KSerializer<CommitSig> = CommitSig.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CommitSig): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(CommitSigMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CommitSig {
      if (decoder is ProtobufMapperDecoder) {
        return CommitSigMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Proposal.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.Proposal")
public data class Proposal(
  @ProtobufIndex(index = 1)
  public val type: SignedMsgType,
  @ProtobufIndex(index = 2)
  public val height: Long,
  @ProtobufIndex(index = 3)
  public val round: Int,
  @ProtobufIndex(index = 4)
  public val polRound: Int,
  @ProtobufIndex(index = 5)
  public val blockId: BlockID,
  @ProtobufIndex(index = 6)
  public val timestamp: Timestamp,
  @ProtobufIndex(index = 7)
  public val signature: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<Proposal> {
    private val delegator: KSerializer<Proposal> = Proposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Proposal): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ProposalMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Proposal {
      if (decoder is ProtobufMapperDecoder) {
        return ProposalMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SignedHeader.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.SignedHeader")
public data class SignedHeader(
  @ProtobufIndex(index = 1)
  public val `header`: Header,
  @ProtobufIndex(index = 2)
  public val commit: Commit,
) {
  public object KotlinxSerializer : KSerializer<SignedHeader> {
    private val delegator: KSerializer<SignedHeader> = SignedHeader.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SignedHeader): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(SignedHeaderMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SignedHeader {
      if (decoder is ProtobufMapperDecoder) {
        return SignedHeaderMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = LightBlock.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.LightBlock")
public data class LightBlock(
  @ProtobufIndex(index = 1)
  public val signedHeader: SignedHeader,
  @ProtobufIndex(index = 2)
  public val validatorSet: ValidatorSet,
) {
  public object KotlinxSerializer : KSerializer<LightBlock> {
    private val delegator: KSerializer<LightBlock> = LightBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: LightBlock): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(LightBlockMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): LightBlock {
      if (decoder is ProtobufMapperDecoder) {
        return LightBlockMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BlockMeta.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.BlockMeta")
public data class BlockMeta(
  @ProtobufIndex(index = 1)
  public val blockId: BlockID,
  @ProtobufIndex(index = 2)
  public val blockSize: Long,
  @ProtobufIndex(index = 3)
  public val `header`: Header,
  @ProtobufIndex(index = 4)
  public val numTxs: Long,
) {
  public object KotlinxSerializer : KSerializer<BlockMeta> {
    private val delegator: KSerializer<BlockMeta> = BlockMeta.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlockMeta): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(BlockMetaMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlockMeta {
      if (decoder is ProtobufMapperDecoder) {
        return BlockMetaMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxProof.KotlinxSerializer::class)
@SerialName(value = "tendermint.types.TxProof")
public data class TxProof(
  @ProtobufIndex(index = 1)
  public val rootHash: ByteArray,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 3)
  public val proof: Proof,
) {
  public object KotlinxSerializer : KSerializer<TxProof> {
    private val delegator: KSerializer<TxProof> = TxProof.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxProof): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(TxProofMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxProof {
      if (decoder is ProtobufMapperDecoder) {
        return TxProofMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}