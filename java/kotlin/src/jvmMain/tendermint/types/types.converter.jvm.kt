// Transform from tendermint/types/types.proto
@file:GeneratorVersion(version = "0.2.2")

package tendermint.types

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType
import tendermint.crypto.ProofJvmConverter
import tendermint.version.ConsensusJvmConverter

public object PartSetHeaderJvmConverter : ProtobufTypeMapper<PartSetHeader, Types.PartSetHeader> {
  public override val descriptor: Descriptors.Descriptor = Types.PartSetHeader.getDescriptor()

  public override val parser: Parser<Types.PartSetHeader> = Types.PartSetHeader.parser()

  public override fun convert(obj: Types.PartSetHeader): PartSetHeader = PartSetHeader(
  	total = obj.total.asKotlinType,
  	hash = obj.hash.toByteArray(),
  )

  public override fun convert(obj: PartSetHeader): Types.PartSetHeader {
    val builder = Types.PartSetHeader.newBuilder()
    builder.setTotal(obj.total.asJavaType)
    builder.setHash(ByteString.copyFrom(obj.hash))
    return builder.build()
  }
}

public object PartJvmConverter : ProtobufTypeMapper<Part, Types.Part> {
  public override val descriptor: Descriptors.Descriptor = Types.Part.getDescriptor()

  public override val parser: Parser<Types.Part> = Types.Part.parser()

  public override fun convert(obj: Types.Part): Part = Part(
  	index = obj.index.asKotlinType,
  	bytes = obj.bytes.toByteArray(),
  	proof = ProofJvmConverter.convert(obj.proof),
  )

  public override fun convert(obj: Part): Types.Part {
    val builder = Types.Part.newBuilder()
    builder.setIndex(obj.index.asJavaType)
    builder.setBytes(ByteString.copyFrom(obj.bytes))
    builder.setProof(ProofJvmConverter.convert(obj.proof))
    return builder.build()
  }
}

public object BlockIDJvmConverter : ProtobufTypeMapper<BlockID, Types.BlockID> {
  public override val descriptor: Descriptors.Descriptor = Types.BlockID.getDescriptor()

  public override val parser: Parser<Types.BlockID> = Types.BlockID.parser()

  public override fun convert(obj: Types.BlockID): BlockID = BlockID(
  	hash = obj.hash.toByteArray(),
  	partSetHeader = PartSetHeaderJvmConverter.convert(obj.partSetHeader),
  )

  public override fun convert(obj: BlockID): Types.BlockID {
    val builder = Types.BlockID.newBuilder()
    builder.setHash(ByteString.copyFrom(obj.hash))
    builder.setPartSetHeader(PartSetHeaderJvmConverter.convert(obj.partSetHeader))
    return builder.build()
  }
}

public object HeaderJvmConverter : ProtobufTypeMapper<Header, Types.Header> {
  public override val descriptor: Descriptors.Descriptor = Types.Header.getDescriptor()

  public override val parser: Parser<Types.Header> = Types.Header.parser()

  public override fun convert(obj: Types.Header): Header = Header(
  	version = ConsensusJvmConverter.convert(obj.version),
  	chainId = obj.chainId,
  	height = obj.height,
  	time = TimestampJvmConverter.convert(obj.time),
  	lastBlockId = BlockIDJvmConverter.convert(obj.lastBlockId),
  	lastCommitHash = obj.lastCommitHash.toByteArray(),
  	dataHash = obj.dataHash.toByteArray(),
  	validatorsHash = obj.validatorsHash.toByteArray(),
  	nextValidatorsHash = obj.nextValidatorsHash.toByteArray(),
  	consensusHash = obj.consensusHash.toByteArray(),
  	appHash = obj.appHash.toByteArray(),
  	lastResultsHash = obj.lastResultsHash.toByteArray(),
  	evidenceHash = obj.evidenceHash.toByteArray(),
  	proposerAddress = obj.proposerAddress.toByteArray(),
  )

  public override fun convert(obj: Header): Types.Header {
    val builder = Types.Header.newBuilder()
    builder.setVersion(ConsensusJvmConverter.convert(obj.version))
    builder.setChainId(obj.chainId)
    builder.setHeight(obj.height)
    builder.setTime(TimestampJvmConverter.convert(obj.time))
    builder.setLastBlockId(BlockIDJvmConverter.convert(obj.lastBlockId))
    builder.setLastCommitHash(ByteString.copyFrom(obj.lastCommitHash))
    builder.setDataHash(ByteString.copyFrom(obj.dataHash))
    builder.setValidatorsHash(ByteString.copyFrom(obj.validatorsHash))
    builder.setNextValidatorsHash(ByteString.copyFrom(obj.nextValidatorsHash))
    builder.setConsensusHash(ByteString.copyFrom(obj.consensusHash))
    builder.setAppHash(ByteString.copyFrom(obj.appHash))
    builder.setLastResultsHash(ByteString.copyFrom(obj.lastResultsHash))
    builder.setEvidenceHash(ByteString.copyFrom(obj.evidenceHash))
    builder.setProposerAddress(ByteString.copyFrom(obj.proposerAddress))
    return builder.build()
  }
}

public object DataJvmConverter : ProtobufTypeMapper<Data, Types.Data> {
  public override val descriptor: Descriptors.Descriptor = Types.Data.getDescriptor()

  public override val parser: Parser<Types.Data> = Types.Data.parser()

  public override fun convert(obj: Types.Data): Data = Data(
  	txs = obj.txsList.map { it.toByteArray() },
  )

  public override fun convert(obj: Data): Types.Data {
    val builder = Types.Data.newBuilder()
    builder.addAllTxs(obj.txs.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object VoteJvmConverter : ProtobufTypeMapper<Vote, Types.Vote> {
  public override val descriptor: Descriptors.Descriptor = Types.Vote.getDescriptor()

  public override val parser: Parser<Types.Vote> = Types.Vote.parser()

  public override fun convert(obj: Types.Vote): Vote = Vote(
  	type = SignedMsgType.forNumber(obj.type.number),
  	height = obj.height,
  	round = obj.round,
  	blockId = BlockIDJvmConverter.convert(obj.blockId),
  	timestamp = TimestampJvmConverter.convert(obj.timestamp),
  	validatorAddress = obj.validatorAddress.toByteArray(),
  	validatorIndex = obj.validatorIndex,
  	signature = obj.signature.toByteArray(),
  )

  public override fun convert(obj: Vote): Types.Vote {
    val builder = Types.Vote.newBuilder()
    builder.setType(Types.SignedMsgType.forNumber(obj.type.number))
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setBlockId(BlockIDJvmConverter.convert(obj.blockId))
    builder.setTimestamp(TimestampJvmConverter.convert(obj.timestamp))
    builder.setValidatorAddress(ByteString.copyFrom(obj.validatorAddress))
    builder.setValidatorIndex(obj.validatorIndex)
    builder.setSignature(ByteString.copyFrom(obj.signature))
    return builder.build()
  }
}

public object CommitJvmConverter : ProtobufTypeMapper<Commit, Types.Commit> {
  public override val descriptor: Descriptors.Descriptor = Types.Commit.getDescriptor()

  public override val parser: Parser<Types.Commit> = Types.Commit.parser()

  public override fun convert(obj: Types.Commit): Commit = Commit(
  	height = obj.height,
  	round = obj.round,
  	blockId = BlockIDJvmConverter.convert(obj.blockId),
  	signatures = obj.signaturesList.map { CommitSigJvmConverter.convert(it) },
  )

  public override fun convert(obj: Commit): Types.Commit {
    val builder = Types.Commit.newBuilder()
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setBlockId(BlockIDJvmConverter.convert(obj.blockId))
    builder.addAllSignatures(obj.signatures.map { CommitSigJvmConverter.convert(it) })
    return builder.build()
  }
}

public object CommitSigJvmConverter : ProtobufTypeMapper<CommitSig, Types.CommitSig> {
  public override val descriptor: Descriptors.Descriptor = Types.CommitSig.getDescriptor()

  public override val parser: Parser<Types.CommitSig> = Types.CommitSig.parser()

  public override fun convert(obj: Types.CommitSig): CommitSig = CommitSig(
  	blockIdFlag = BlockIDFlag.forNumber(obj.blockIdFlag.number),
  	validatorAddress = obj.validatorAddress.toByteArray(),
  	timestamp = TimestampJvmConverter.convert(obj.timestamp),
  	signature = obj.signature.toByteArray(),
  )

  public override fun convert(obj: CommitSig): Types.CommitSig {
    val builder = Types.CommitSig.newBuilder()
    builder.setBlockIdFlag(Types.BlockIDFlag.forNumber(obj.blockIdFlag.number))
    builder.setValidatorAddress(ByteString.copyFrom(obj.validatorAddress))
    builder.setTimestamp(TimestampJvmConverter.convert(obj.timestamp))
    builder.setSignature(ByteString.copyFrom(obj.signature))
    return builder.build()
  }
}

public object ProposalJvmConverter : ProtobufTypeMapper<Proposal, Types.Proposal> {
  public override val descriptor: Descriptors.Descriptor = Types.Proposal.getDescriptor()

  public override val parser: Parser<Types.Proposal> = Types.Proposal.parser()

  public override fun convert(obj: Types.Proposal): Proposal = Proposal(
  	type = SignedMsgType.forNumber(obj.type.number),
  	height = obj.height,
  	round = obj.round,
  	polRound = obj.polRound,
  	blockId = BlockIDJvmConverter.convert(obj.blockId),
  	timestamp = TimestampJvmConverter.convert(obj.timestamp),
  	signature = obj.signature.toByteArray(),
  )

  public override fun convert(obj: Proposal): Types.Proposal {
    val builder = Types.Proposal.newBuilder()
    builder.setType(Types.SignedMsgType.forNumber(obj.type.number))
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setPolRound(obj.polRound)
    builder.setBlockId(BlockIDJvmConverter.convert(obj.blockId))
    builder.setTimestamp(TimestampJvmConverter.convert(obj.timestamp))
    builder.setSignature(ByteString.copyFrom(obj.signature))
    return builder.build()
  }
}

public object SignedHeaderJvmConverter : ProtobufTypeMapper<SignedHeader, Types.SignedHeader> {
  public override val descriptor: Descriptors.Descriptor = Types.SignedHeader.getDescriptor()

  public override val parser: Parser<Types.SignedHeader> = Types.SignedHeader.parser()

  public override fun convert(obj: Types.SignedHeader): SignedHeader = SignedHeader(
  	`header` = HeaderJvmConverter.convert(obj.`header`),
  	commit = CommitJvmConverter.convert(obj.commit),
  )

  public override fun convert(obj: SignedHeader): Types.SignedHeader {
    val builder = Types.SignedHeader.newBuilder()
    builder.setHeader(HeaderJvmConverter.convert(obj.`header`))
    builder.setCommit(CommitJvmConverter.convert(obj.commit))
    return builder.build()
  }
}

public object LightBlockJvmConverter : ProtobufTypeMapper<LightBlock, Types.LightBlock> {
  public override val descriptor: Descriptors.Descriptor = Types.LightBlock.getDescriptor()

  public override val parser: Parser<Types.LightBlock> = Types.LightBlock.parser()

  public override fun convert(obj: Types.LightBlock): LightBlock = LightBlock(
  	signedHeader = SignedHeaderJvmConverter.convert(obj.signedHeader),
  	validatorSet = ValidatorSetJvmConverter.convert(obj.validatorSet),
  )

  public override fun convert(obj: LightBlock): Types.LightBlock {
    val builder = Types.LightBlock.newBuilder()
    builder.setSignedHeader(SignedHeaderJvmConverter.convert(obj.signedHeader))
    builder.setValidatorSet(ValidatorSetJvmConverter.convert(obj.validatorSet))
    return builder.build()
  }
}

public object BlockMetaJvmConverter : ProtobufTypeMapper<BlockMeta, Types.BlockMeta> {
  public override val descriptor: Descriptors.Descriptor = Types.BlockMeta.getDescriptor()

  public override val parser: Parser<Types.BlockMeta> = Types.BlockMeta.parser()

  public override fun convert(obj: Types.BlockMeta): BlockMeta = BlockMeta(
  	blockId = BlockIDJvmConverter.convert(obj.blockId),
  	blockSize = obj.blockSize,
  	`header` = HeaderJvmConverter.convert(obj.`header`),
  	numTxs = obj.numTxs,
  )

  public override fun convert(obj: BlockMeta): Types.BlockMeta {
    val builder = Types.BlockMeta.newBuilder()
    builder.setBlockId(BlockIDJvmConverter.convert(obj.blockId))
    builder.setBlockSize(obj.blockSize)
    builder.setHeader(HeaderJvmConverter.convert(obj.`header`))
    builder.setNumTxs(obj.numTxs)
    return builder.build()
  }
}

public object TxProofJvmConverter : ProtobufTypeMapper<TxProof, Types.TxProof> {
  public override val descriptor: Descriptors.Descriptor = Types.TxProof.getDescriptor()

  public override val parser: Parser<Types.TxProof> = Types.TxProof.parser()

  public override fun convert(obj: Types.TxProof): TxProof = TxProof(
  	rootHash = obj.rootHash.toByteArray(),
  	`data` = obj.`data`.toByteArray(),
  	proof = ProofJvmConverter.convert(obj.proof),
  )

  public override fun convert(obj: TxProof): Types.TxProof {
    val builder = Types.TxProof.newBuilder()
    builder.setRootHash(ByteString.copyFrom(obj.rootHash))
    builder.setData(ByteString.copyFrom(obj.`data`))
    builder.setProof(ProofJvmConverter.convert(obj.proof))
    return builder.build()
  }
}
