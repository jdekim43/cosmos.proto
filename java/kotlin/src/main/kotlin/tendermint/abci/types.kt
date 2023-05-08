// Transform from tendermint/abci/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package tendermint.abci

import google.protobuf.Timestamp
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.ULong
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
import tendermint.crypto.ProofOps
import tendermint.crypto.PublicKey
import tendermint.types.ConsensusParams
import tendermint.types.Header

@Serializable
@SerialName(value = "tendermint.abci.CheckTxType")
public enum class CheckTxType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  NEW(0),
  @ProtobufIndex(index = 1)
  RECHECK(1),
  ;

  public companion object {
    public fun forNumber(number: Int): CheckTxType = CheckTxType.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "tendermint.abci.MisbehaviorType")
public enum class MisbehaviorType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  UNKNOWN(0),
  @ProtobufIndex(index = 1)
  DUPLICATE_VOTE(1),
  @ProtobufIndex(index = 2)
  LIGHT_CLIENT_ATTACK(2),
  ;

  public companion object {
    public fun forNumber(number: Int): MisbehaviorType = MisbehaviorType.values()
    	.first { it.number == number }
  }
}

@Serializable(with = Request.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.Request")
public data class Request(
  public val `value`: ValueOneOf,
) {
  @Serializable
  public sealed interface ValueOneOf {
    @JvmInline
    public value class Echo(
      @ProtobufIndex(index = 1)
      public val `value`: RequestEcho,
    ) : ValueOneOf

    @JvmInline
    public value class Flush(
      @ProtobufIndex(index = 2)
      public val `value`: RequestFlush,
    ) : ValueOneOf

    @JvmInline
    public value class Info(
      @ProtobufIndex(index = 3)
      public val `value`: RequestInfo,
    ) : ValueOneOf

    @JvmInline
    public value class InitChain(
      @ProtobufIndex(index = 5)
      public val `value`: RequestInitChain,
    ) : ValueOneOf

    @JvmInline
    public value class Query(
      @ProtobufIndex(index = 6)
      public val `value`: RequestQuery,
    ) : ValueOneOf

    @JvmInline
    public value class BeginBlock(
      @ProtobufIndex(index = 7)
      public val `value`: RequestBeginBlock,
    ) : ValueOneOf

    @JvmInline
    public value class CheckTx(
      @ProtobufIndex(index = 8)
      public val `value`: RequestCheckTx,
    ) : ValueOneOf

    @JvmInline
    public value class DeliverTx(
      @ProtobufIndex(index = 9)
      public val `value`: RequestDeliverTx,
    ) : ValueOneOf

    @JvmInline
    public value class EndBlock(
      @ProtobufIndex(index = 10)
      public val `value`: RequestEndBlock,
    ) : ValueOneOf

    @JvmInline
    public value class Commit(
      @ProtobufIndex(index = 11)
      public val `value`: RequestCommit,
    ) : ValueOneOf

    @JvmInline
    public value class ListSnapshots(
      @ProtobufIndex(index = 12)
      public val `value`: RequestListSnapshots,
    ) : ValueOneOf

    @JvmInline
    public value class OfferSnapshot(
      @ProtobufIndex(index = 13)
      public val `value`: RequestOfferSnapshot,
    ) : ValueOneOf

    @JvmInline
    public value class LoadSnapshotChunk(
      @ProtobufIndex(index = 14)
      public val `value`: RequestLoadSnapshotChunk,
    ) : ValueOneOf

    @JvmInline
    public value class ApplySnapshotChunk(
      @ProtobufIndex(index = 15)
      public val `value`: RequestApplySnapshotChunk,
    ) : ValueOneOf

    @JvmInline
    public value class PrepareProposal(
      @ProtobufIndex(index = 16)
      public val `value`: RequestPrepareProposal,
    ) : ValueOneOf

    @JvmInline
    public value class ProcessProposal(
      @ProtobufIndex(index = 17)
      public val `value`: RequestProcessProposal,
    ) : ValueOneOf
  }

  public object KotlinxSerializer : KSerializer<Request> {
    private val delegator: KSerializer<Request> = Request.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Request): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Request {
      if (decoder is ProtobufMapperDecoder) {
        return RequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestEcho.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestEcho")
public data class RequestEcho(
  @ProtobufIndex(index = 1)
  public val message: String,
) {
  public object KotlinxSerializer : KSerializer<RequestEcho> {
    private val delegator: KSerializer<RequestEcho> = RequestEcho.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestEcho): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestEchoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestEcho {
      if (decoder is ProtobufMapperDecoder) {
        return RequestEchoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestFlush.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestFlush")
public class RequestFlush() {
  public object KotlinxSerializer : KSerializer<RequestFlush> {
    private val delegator: KSerializer<RequestFlush> = RequestFlush.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestFlush): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestFlushMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestFlush {
      if (decoder is ProtobufMapperDecoder) {
        return RequestFlushMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestInfo.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestInfo")
public data class RequestInfo(
  @ProtobufIndex(index = 1)
  public val version: String,
  @ProtobufIndex(index = 2)
  public val blockVersion: ULong,
  @ProtobufIndex(index = 3)
  public val p2PVersion: ULong,
  @ProtobufIndex(index = 4)
  public val abciVersion: String,
) {
  public object KotlinxSerializer : KSerializer<RequestInfo> {
    private val delegator: KSerializer<RequestInfo> = RequestInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestInfo): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestInfoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestInfo {
      if (decoder is ProtobufMapperDecoder) {
        return RequestInfoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestInitChain.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestInitChain")
public data class RequestInitChain(
  @ProtobufIndex(index = 1)
  public val time: Timestamp,
  @ProtobufIndex(index = 2)
  public val chainId: String,
  @ProtobufIndex(index = 3)
  public val consensusParams: ConsensusParams,
  @ProtobufIndex(index = 4)
  public val validators: List<ValidatorUpdate>,
  @ProtobufIndex(index = 5)
  public val appStateBytes: ByteArray,
  @ProtobufIndex(index = 6)
  public val initialHeight: Long,
) {
  public object KotlinxSerializer : KSerializer<RequestInitChain> {
    private val delegator: KSerializer<RequestInitChain> = RequestInitChain.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestInitChain): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestInitChainMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestInitChain {
      if (decoder is ProtobufMapperDecoder) {
        return RequestInitChainMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestQuery.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestQuery")
public data class RequestQuery(
  @ProtobufIndex(index = 1)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 2)
  public val path: String,
  @ProtobufIndex(index = 3)
  public val height: Long,
  @ProtobufIndex(index = 4)
  public val prove: Boolean,
) {
  public object KotlinxSerializer : KSerializer<RequestQuery> {
    private val delegator: KSerializer<RequestQuery> = RequestQuery.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestQuery): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestQueryMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestQuery {
      if (decoder is ProtobufMapperDecoder) {
        return RequestQueryMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestBeginBlock.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestBeginBlock")
public data class RequestBeginBlock(
  @ProtobufIndex(index = 1)
  public val hash: ByteArray,
  @ProtobufIndex(index = 2)
  public val `header`: Header,
  @ProtobufIndex(index = 3)
  public val lastCommitInfo: CommitInfo,
  @ProtobufIndex(index = 4)
  public val byzantineValidators: List<Misbehavior>,
) {
  public object KotlinxSerializer : KSerializer<RequestBeginBlock> {
    private val delegator: KSerializer<RequestBeginBlock> = RequestBeginBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestBeginBlock): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestBeginBlockMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestBeginBlock {
      if (decoder is ProtobufMapperDecoder) {
        return RequestBeginBlockMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestCheckTx.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestCheckTx")
public data class RequestCheckTx(
  @ProtobufIndex(index = 1)
  public val tx: ByteArray,
  @ProtobufIndex(index = 2)
  public val type: CheckTxType,
) {
  public object KotlinxSerializer : KSerializer<RequestCheckTx> {
    private val delegator: KSerializer<RequestCheckTx> = RequestCheckTx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestCheckTx): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestCheckTxMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestCheckTx {
      if (decoder is ProtobufMapperDecoder) {
        return RequestCheckTxMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestDeliverTx.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestDeliverTx")
public data class RequestDeliverTx(
  @ProtobufIndex(index = 1)
  public val tx: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<RequestDeliverTx> {
    private val delegator: KSerializer<RequestDeliverTx> = RequestDeliverTx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestDeliverTx): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestDeliverTxMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestDeliverTx {
      if (decoder is ProtobufMapperDecoder) {
        return RequestDeliverTxMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestEndBlock.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestEndBlock")
public data class RequestEndBlock(
  @ProtobufIndex(index = 1)
  public val height: Long,
) {
  public object KotlinxSerializer : KSerializer<RequestEndBlock> {
    private val delegator: KSerializer<RequestEndBlock> = RequestEndBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestEndBlock): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestEndBlockMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestEndBlock {
      if (decoder is ProtobufMapperDecoder) {
        return RequestEndBlockMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestCommit.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestCommit")
public class RequestCommit() {
  public object KotlinxSerializer : KSerializer<RequestCommit> {
    private val delegator: KSerializer<RequestCommit> = RequestCommit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestCommit): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestCommitMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestCommit {
      if (decoder is ProtobufMapperDecoder) {
        return RequestCommitMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestListSnapshots.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestListSnapshots")
public class RequestListSnapshots() {
  public object KotlinxSerializer : KSerializer<RequestListSnapshots> {
    private val delegator: KSerializer<RequestListSnapshots> = RequestListSnapshots.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestListSnapshots): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestListSnapshotsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestListSnapshots {
      if (decoder is ProtobufMapperDecoder) {
        return RequestListSnapshotsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestOfferSnapshot.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestOfferSnapshot")
public data class RequestOfferSnapshot(
  @ProtobufIndex(index = 1)
  public val snapshot: Snapshot,
  @ProtobufIndex(index = 2)
  public val appHash: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<RequestOfferSnapshot> {
    private val delegator: KSerializer<RequestOfferSnapshot> = RequestOfferSnapshot.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestOfferSnapshot): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestOfferSnapshotMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestOfferSnapshot {
      if (decoder is ProtobufMapperDecoder) {
        return RequestOfferSnapshotMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestLoadSnapshotChunk.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestLoadSnapshotChunk")
public data class RequestLoadSnapshotChunk(
  @ProtobufIndex(index = 1)
  public val height: ULong,
  @ProtobufIndex(index = 2)
  public val format: UInt,
  @ProtobufIndex(index = 3)
  public val chunk: UInt,
) {
  public object KotlinxSerializer : KSerializer<RequestLoadSnapshotChunk> {
    private val delegator: KSerializer<RequestLoadSnapshotChunk> =
        RequestLoadSnapshotChunk.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestLoadSnapshotChunk): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestLoadSnapshotChunkMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestLoadSnapshotChunk {
      if (decoder is ProtobufMapperDecoder) {
        return RequestLoadSnapshotChunkMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestApplySnapshotChunk.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestApplySnapshotChunk")
public data class RequestApplySnapshotChunk(
  @ProtobufIndex(index = 1)
  public val index: UInt,
  @ProtobufIndex(index = 2)
  public val chunk: ByteArray,
  @ProtobufIndex(index = 3)
  public val sender: String,
) {
  public object KotlinxSerializer : KSerializer<RequestApplySnapshotChunk> {
    private val delegator: KSerializer<RequestApplySnapshotChunk> =
        RequestApplySnapshotChunk.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestApplySnapshotChunk): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestApplySnapshotChunkMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestApplySnapshotChunk {
      if (decoder is ProtobufMapperDecoder) {
        return RequestApplySnapshotChunkMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestPrepareProposal.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestPrepareProposal")
public data class RequestPrepareProposal(
  @ProtobufIndex(index = 1)
  public val maxTxBytes: Long,
  @ProtobufIndex(index = 2)
  public val txs: List<ByteArray>,
  @ProtobufIndex(index = 3)
  public val localLastCommit: ExtendedCommitInfo,
  @ProtobufIndex(index = 4)
  public val misbehavior: List<Misbehavior>,
  @ProtobufIndex(index = 5)
  public val height: Long,
  @ProtobufIndex(index = 6)
  public val time: Timestamp,
  @ProtobufIndex(index = 7)
  public val nextValidatorsHash: ByteArray,
  @ProtobufIndex(index = 8)
  public val proposerAddress: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<RequestPrepareProposal> {
    private val delegator: KSerializer<RequestPrepareProposal> = RequestPrepareProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestPrepareProposal): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestPrepareProposalMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestPrepareProposal {
      if (decoder is ProtobufMapperDecoder) {
        return RequestPrepareProposalMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestProcessProposal.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.RequestProcessProposal")
public data class RequestProcessProposal(
  @ProtobufIndex(index = 1)
  public val txs: List<ByteArray>,
  @ProtobufIndex(index = 2)
  public val proposedLastCommit: CommitInfo,
  @ProtobufIndex(index = 3)
  public val misbehavior: List<Misbehavior>,
  @ProtobufIndex(index = 4)
  public val hash: ByteArray,
  @ProtobufIndex(index = 5)
  public val height: Long,
  @ProtobufIndex(index = 6)
  public val time: Timestamp,
  @ProtobufIndex(index = 7)
  public val nextValidatorsHash: ByteArray,
  @ProtobufIndex(index = 8)
  public val proposerAddress: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<RequestProcessProposal> {
    private val delegator: KSerializer<RequestProcessProposal> = RequestProcessProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestProcessProposal): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RequestProcessProposalMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestProcessProposal {
      if (decoder is ProtobufMapperDecoder) {
        return RequestProcessProposalMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Response.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.Response")
public data class Response(
  public val `value`: ValueOneOf,
) {
  @Serializable
  public sealed interface ValueOneOf {
    @JvmInline
    public value class Exception(
      @ProtobufIndex(index = 1)
      public val `value`: ResponseException,
    ) : ValueOneOf

    @JvmInline
    public value class Echo(
      @ProtobufIndex(index = 2)
      public val `value`: ResponseEcho,
    ) : ValueOneOf

    @JvmInline
    public value class Flush(
      @ProtobufIndex(index = 3)
      public val `value`: ResponseFlush,
    ) : ValueOneOf

    @JvmInline
    public value class Info(
      @ProtobufIndex(index = 4)
      public val `value`: ResponseInfo,
    ) : ValueOneOf

    @JvmInline
    public value class InitChain(
      @ProtobufIndex(index = 6)
      public val `value`: ResponseInitChain,
    ) : ValueOneOf

    @JvmInline
    public value class Query(
      @ProtobufIndex(index = 7)
      public val `value`: ResponseQuery,
    ) : ValueOneOf

    @JvmInline
    public value class BeginBlock(
      @ProtobufIndex(index = 8)
      public val `value`: ResponseBeginBlock,
    ) : ValueOneOf

    @JvmInline
    public value class CheckTx(
      @ProtobufIndex(index = 9)
      public val `value`: ResponseCheckTx,
    ) : ValueOneOf

    @JvmInline
    public value class DeliverTx(
      @ProtobufIndex(index = 10)
      public val `value`: ResponseDeliverTx,
    ) : ValueOneOf

    @JvmInline
    public value class EndBlock(
      @ProtobufIndex(index = 11)
      public val `value`: ResponseEndBlock,
    ) : ValueOneOf

    @JvmInline
    public value class Commit(
      @ProtobufIndex(index = 12)
      public val `value`: ResponseCommit,
    ) : ValueOneOf

    @JvmInline
    public value class ListSnapshots(
      @ProtobufIndex(index = 13)
      public val `value`: ResponseListSnapshots,
    ) : ValueOneOf

    @JvmInline
    public value class OfferSnapshot(
      @ProtobufIndex(index = 14)
      public val `value`: ResponseOfferSnapshot,
    ) : ValueOneOf

    @JvmInline
    public value class LoadSnapshotChunk(
      @ProtobufIndex(index = 15)
      public val `value`: ResponseLoadSnapshotChunk,
    ) : ValueOneOf

    @JvmInline
    public value class ApplySnapshotChunk(
      @ProtobufIndex(index = 16)
      public val `value`: ResponseApplySnapshotChunk,
    ) : ValueOneOf

    @JvmInline
    public value class PrepareProposal(
      @ProtobufIndex(index = 17)
      public val `value`: ResponsePrepareProposal,
    ) : ValueOneOf

    @JvmInline
    public value class ProcessProposal(
      @ProtobufIndex(index = 18)
      public val `value`: ResponseProcessProposal,
    ) : ValueOneOf
  }

  public object KotlinxSerializer : KSerializer<Response> {
    private val delegator: KSerializer<Response> = Response.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Response): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Response {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseException.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseException")
public data class ResponseException(
  @ProtobufIndex(index = 1)
  public val error: String,
) {
  public object KotlinxSerializer : KSerializer<ResponseException> {
    private val delegator: KSerializer<ResponseException> = ResponseException.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseException): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseExceptionMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseException {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseExceptionMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseEcho.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseEcho")
public data class ResponseEcho(
  @ProtobufIndex(index = 1)
  public val message: String,
) {
  public object KotlinxSerializer : KSerializer<ResponseEcho> {
    private val delegator: KSerializer<ResponseEcho> = ResponseEcho.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseEcho): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseEchoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseEcho {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseEchoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseFlush.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseFlush")
public class ResponseFlush() {
  public object KotlinxSerializer : KSerializer<ResponseFlush> {
    private val delegator: KSerializer<ResponseFlush> = ResponseFlush.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseFlush): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseFlushMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseFlush {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseFlushMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseInfo.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseInfo")
public data class ResponseInfo(
  @ProtobufIndex(index = 1)
  public val `data`: String,
  @ProtobufIndex(index = 2)
  public val version: String,
  @ProtobufIndex(index = 3)
  public val appVersion: ULong,
  @ProtobufIndex(index = 4)
  public val lastBlockHeight: Long,
  @ProtobufIndex(index = 5)
  public val lastBlockAppHash: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<ResponseInfo> {
    private val delegator: KSerializer<ResponseInfo> = ResponseInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseInfo): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseInfoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseInfoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseInitChain.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseInitChain")
public data class ResponseInitChain(
  @ProtobufIndex(index = 1)
  public val consensusParams: ConsensusParams,
  @ProtobufIndex(index = 2)
  public val validators: List<ValidatorUpdate>,
  @ProtobufIndex(index = 3)
  public val appHash: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<ResponseInitChain> {
    private val delegator: KSerializer<ResponseInitChain> = ResponseInitChain.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseInitChain): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseInitChainMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseInitChain {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseInitChainMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseQuery.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseQuery")
public data class ResponseQuery(
  @ProtobufIndex(index = 1)
  public val code: UInt,
  @ProtobufIndex(index = 3)
  public val log: String,
  @ProtobufIndex(index = 4)
  public val info: String,
  @ProtobufIndex(index = 5)
  public val index: Long,
  @ProtobufIndex(index = 6)
  public val key: ByteArray,
  @ProtobufIndex(index = 7)
  public val `value`: ByteArray,
  @ProtobufIndex(index = 8)
  public val proofOps: ProofOps,
  @ProtobufIndex(index = 9)
  public val height: Long,
  @ProtobufIndex(index = 10)
  public val codespace: String,
) {
  public object KotlinxSerializer : KSerializer<ResponseQuery> {
    private val delegator: KSerializer<ResponseQuery> = ResponseQuery.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseQuery): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseQueryMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseQuery {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseQueryMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseBeginBlock.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseBeginBlock")
public data class ResponseBeginBlock(
  @ProtobufIndex(index = 1)
  public val events: List<Event>,
) {
  public object KotlinxSerializer : KSerializer<ResponseBeginBlock> {
    private val delegator: KSerializer<ResponseBeginBlock> = ResponseBeginBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseBeginBlock): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseBeginBlockMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseBeginBlock {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseBeginBlockMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseCheckTx.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseCheckTx")
public data class ResponseCheckTx(
  @ProtobufIndex(index = 1)
  public val code: UInt,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 3)
  public val log: String,
  @ProtobufIndex(index = 4)
  public val info: String,
  @ProtobufIndex(index = 5)
  public val gasWanted: Long,
  @ProtobufIndex(index = 6)
  public val gasUsed: Long,
  @ProtobufIndex(index = 7)
  public val events: List<Event>,
  @ProtobufIndex(index = 8)
  public val codespace: String,
  @ProtobufIndex(index = 9)
  public val sender: String,
  @ProtobufIndex(index = 10)
  public val priority: Long,
  @ProtobufIndex(index = 11)
  public val mempoolError: String,
) {
  public object KotlinxSerializer : KSerializer<ResponseCheckTx> {
    private val delegator: KSerializer<ResponseCheckTx> = ResponseCheckTx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseCheckTx): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseCheckTxMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseCheckTx {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseCheckTxMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseDeliverTx.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseDeliverTx")
public data class ResponseDeliverTx(
  @ProtobufIndex(index = 1)
  public val code: UInt,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 3)
  public val log: String,
  @ProtobufIndex(index = 4)
  public val info: String,
  @ProtobufIndex(index = 5)
  public val gasWanted: Long,
  @ProtobufIndex(index = 6)
  public val gasUsed: Long,
  @ProtobufIndex(index = 7)
  public val events: List<Event>,
  @ProtobufIndex(index = 8)
  public val codespace: String,
) {
  public object KotlinxSerializer : KSerializer<ResponseDeliverTx> {
    private val delegator: KSerializer<ResponseDeliverTx> = ResponseDeliverTx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseDeliverTx): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseDeliverTxMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseDeliverTx {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseDeliverTxMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseEndBlock.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseEndBlock")
public data class ResponseEndBlock(
  @ProtobufIndex(index = 1)
  public val validatorUpdates: List<ValidatorUpdate>,
  @ProtobufIndex(index = 2)
  public val consensusParamUpdates: ConsensusParams,
  @ProtobufIndex(index = 3)
  public val events: List<Event>,
) {
  public object KotlinxSerializer : KSerializer<ResponseEndBlock> {
    private val delegator: KSerializer<ResponseEndBlock> = ResponseEndBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseEndBlock): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseEndBlockMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseEndBlock {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseEndBlockMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseCommit.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseCommit")
public data class ResponseCommit(
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 3)
  public val retainHeight: Long,
) {
  public object KotlinxSerializer : KSerializer<ResponseCommit> {
    private val delegator: KSerializer<ResponseCommit> = ResponseCommit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseCommit): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseCommitMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseCommit {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseCommitMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseListSnapshots.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseListSnapshots")
public data class ResponseListSnapshots(
  @ProtobufIndex(index = 1)
  public val snapshots: List<Snapshot>,
) {
  public object KotlinxSerializer : KSerializer<ResponseListSnapshots> {
    private val delegator: KSerializer<ResponseListSnapshots> = ResponseListSnapshots.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseListSnapshots): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseListSnapshotsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseListSnapshots {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseListSnapshotsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseOfferSnapshot.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseOfferSnapshot")
public data class ResponseOfferSnapshot(
  @ProtobufIndex(index = 1)
  public val result: Result,
) {
  @Serializable
  @SerialName(value = "tendermint.abci.ResponseOfferSnapshot.Result")
  public enum class Result(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 0)
    UNKNOWN(0),
    @ProtobufIndex(index = 1)
    ACCEPT(1),
    @ProtobufIndex(index = 2)
    ABORT(2),
    @ProtobufIndex(index = 3)
    REJECT(3),
    @ProtobufIndex(index = 4)
    REJECT_FORMAT(4),
    @ProtobufIndex(index = 5)
    REJECT_SENDER(5),
    ;

    public companion object {
      public fun forNumber(number: Int): Result = Result.values()
      	.first { it.number == number }
    }
  }

  public object KotlinxSerializer : KSerializer<ResponseOfferSnapshot> {
    private val delegator: KSerializer<ResponseOfferSnapshot> = ResponseOfferSnapshot.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseOfferSnapshot): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseOfferSnapshotMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseOfferSnapshot {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseOfferSnapshotMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseLoadSnapshotChunk.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseLoadSnapshotChunk")
public data class ResponseLoadSnapshotChunk(
  @ProtobufIndex(index = 1)
  public val chunk: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<ResponseLoadSnapshotChunk> {
    private val delegator: KSerializer<ResponseLoadSnapshotChunk> =
        ResponseLoadSnapshotChunk.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseLoadSnapshotChunk): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseLoadSnapshotChunkMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseLoadSnapshotChunk {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseLoadSnapshotChunkMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseApplySnapshotChunk.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseApplySnapshotChunk")
public data class ResponseApplySnapshotChunk(
  @ProtobufIndex(index = 1)
  public val result: Result,
  @ProtobufIndex(index = 2)
  public val refetchChunks: List<UInt>,
  @ProtobufIndex(index = 3)
  public val rejectSenders: List<String>,
) {
  @Serializable
  @SerialName(value = "tendermint.abci.ResponseApplySnapshotChunk.Result")
  public enum class Result(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 0)
    UNKNOWN(0),
    @ProtobufIndex(index = 1)
    ACCEPT(1),
    @ProtobufIndex(index = 2)
    ABORT(2),
    @ProtobufIndex(index = 3)
    RETRY(3),
    @ProtobufIndex(index = 4)
    RETRY_SNAPSHOT(4),
    @ProtobufIndex(index = 5)
    REJECT_SNAPSHOT(5),
    ;

    public companion object {
      public fun forNumber(number: Int): Result = Result.values()
      	.first { it.number == number }
    }
  }

  public object KotlinxSerializer : KSerializer<ResponseApplySnapshotChunk> {
    private val delegator: KSerializer<ResponseApplySnapshotChunk> =
        ResponseApplySnapshotChunk.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseApplySnapshotChunk): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseApplySnapshotChunkMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseApplySnapshotChunk {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseApplySnapshotChunkMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponsePrepareProposal.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponsePrepareProposal")
public data class ResponsePrepareProposal(
  @ProtobufIndex(index = 1)
  public val txs: List<ByteArray>,
) {
  public object KotlinxSerializer : KSerializer<ResponsePrepareProposal> {
    private val delegator: KSerializer<ResponsePrepareProposal> =
        ResponsePrepareProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponsePrepareProposal): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponsePrepareProposalMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponsePrepareProposal {
      if (decoder is ProtobufMapperDecoder) {
        return ResponsePrepareProposalMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseProcessProposal.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ResponseProcessProposal")
public data class ResponseProcessProposal(
  @ProtobufIndex(index = 1)
  public val status: ProposalStatus,
) {
  @Serializable
  @SerialName(value = "tendermint.abci.ResponseProcessProposal.ProposalStatus")
  public enum class ProposalStatus(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 0)
    UNKNOWN(0),
    @ProtobufIndex(index = 1)
    ACCEPT(1),
    @ProtobufIndex(index = 2)
    REJECT(2),
    ;

    public companion object {
      public fun forNumber(number: Int): ProposalStatus = ProposalStatus.values()
      	.first { it.number == number }
    }
  }

  public object KotlinxSerializer : KSerializer<ResponseProcessProposal> {
    private val delegator: KSerializer<ResponseProcessProposal> =
        ResponseProcessProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseProcessProposal): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResponseProcessProposalMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseProcessProposal {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseProcessProposalMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CommitInfo.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.CommitInfo")
public data class CommitInfo(
  @ProtobufIndex(index = 1)
  public val round: Int,
  @ProtobufIndex(index = 2)
  public val votes: List<VoteInfo>,
) {
  public object KotlinxSerializer : KSerializer<CommitInfo> {
    private val delegator: KSerializer<CommitInfo> = CommitInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CommitInfo): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(CommitInfoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CommitInfo {
      if (decoder is ProtobufMapperDecoder) {
        return CommitInfoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ExtendedCommitInfo.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ExtendedCommitInfo")
public data class ExtendedCommitInfo(
  @ProtobufIndex(index = 1)
  public val round: Int,
  @ProtobufIndex(index = 2)
  public val votes: List<ExtendedVoteInfo>,
) {
  public object KotlinxSerializer : KSerializer<ExtendedCommitInfo> {
    private val delegator: KSerializer<ExtendedCommitInfo> = ExtendedCommitInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ExtendedCommitInfo): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ExtendedCommitInfoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ExtendedCommitInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ExtendedCommitInfoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Event.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.Event")
public data class Event(
  @ProtobufIndex(index = 1)
  public val type: String,
  @ProtobufIndex(index = 2)
  public val attributes: List<EventAttribute>,
) {
  public object KotlinxSerializer : KSerializer<Event> {
    private val delegator: KSerializer<Event> = Event.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Event): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Event {
      if (decoder is ProtobufMapperDecoder) {
        return EventMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventAttribute.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.EventAttribute")
public data class EventAttribute(
  @ProtobufIndex(index = 1)
  public val key: String,
  @ProtobufIndex(index = 2)
  public val `value`: String,
  @ProtobufIndex(index = 3)
  public val index: Boolean,
) {
  public object KotlinxSerializer : KSerializer<EventAttribute> {
    private val delegator: KSerializer<EventAttribute> = EventAttribute.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventAttribute): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventAttributeMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventAttribute {
      if (decoder is ProtobufMapperDecoder) {
        return EventAttributeMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxResult.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.TxResult")
public data class TxResult(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val index: UInt,
  @ProtobufIndex(index = 3)
  public val tx: ByteArray,
  @ProtobufIndex(index = 4)
  public val result: ResponseDeliverTx,
) {
  public object KotlinxSerializer : KSerializer<TxResult> {
    private val delegator: KSerializer<TxResult> = TxResult.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxResult): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(TxResultMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxResult {
      if (decoder is ProtobufMapperDecoder) {
        return TxResultMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Validator.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.Validator")
public data class Validator(
  @ProtobufIndex(index = 1)
  public val address: ByteArray,
  @ProtobufIndex(index = 3)
  public val power: Long,
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

@Serializable(with = ValidatorUpdate.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ValidatorUpdate")
public data class ValidatorUpdate(
  @ProtobufIndex(index = 1)
  public val pubKey: PublicKey,
  @ProtobufIndex(index = 2)
  public val power: Long,
) {
  public object KotlinxSerializer : KSerializer<ValidatorUpdate> {
    private val delegator: KSerializer<ValidatorUpdate> = ValidatorUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorUpdate): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorUpdateMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorUpdateMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = VoteInfo.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.VoteInfo")
public data class VoteInfo(
  @ProtobufIndex(index = 1)
  public val validator: Validator,
  @ProtobufIndex(index = 2)
  public val signedLastBlock: Boolean,
) {
  public object KotlinxSerializer : KSerializer<VoteInfo> {
    private val delegator: KSerializer<VoteInfo> = VoteInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: VoteInfo): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(VoteInfoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): VoteInfo {
      if (decoder is ProtobufMapperDecoder) {
        return VoteInfoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ExtendedVoteInfo.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.ExtendedVoteInfo")
public data class ExtendedVoteInfo(
  @ProtobufIndex(index = 1)
  public val validator: Validator,
  @ProtobufIndex(index = 2)
  public val signedLastBlock: Boolean,
  @ProtobufIndex(index = 3)
  public val voteExtension: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<ExtendedVoteInfo> {
    private val delegator: KSerializer<ExtendedVoteInfo> = ExtendedVoteInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ExtendedVoteInfo): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ExtendedVoteInfoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ExtendedVoteInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ExtendedVoteInfoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Misbehavior.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.Misbehavior")
public data class Misbehavior(
  @ProtobufIndex(index = 1)
  public val type: MisbehaviorType,
  @ProtobufIndex(index = 2)
  public val validator: Validator,
  @ProtobufIndex(index = 3)
  public val height: Long,
  @ProtobufIndex(index = 4)
  public val time: Timestamp,
  @ProtobufIndex(index = 5)
  public val totalVotingPower: Long,
) {
  public object KotlinxSerializer : KSerializer<Misbehavior> {
    private val delegator: KSerializer<Misbehavior> = Misbehavior.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Misbehavior): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MisbehaviorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Misbehavior {
      if (decoder is ProtobufMapperDecoder) {
        return MisbehaviorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Snapshot.KotlinxSerializer::class)
@SerialName(value = "tendermint.abci.Snapshot")
public data class Snapshot(
  @ProtobufIndex(index = 1)
  public val height: ULong,
  @ProtobufIndex(index = 2)
  public val format: UInt,
  @ProtobufIndex(index = 3)
  public val chunks: UInt,
  @ProtobufIndex(index = 4)
  public val hash: ByteArray,
  @ProtobufIndex(index = 5)
  public val metadata: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<Snapshot> {
    private val delegator: KSerializer<Snapshot> = Snapshot.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Snapshot): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(SnapshotMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Snapshot {
      if (decoder is ProtobufMapperDecoder) {
        return SnapshotMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
