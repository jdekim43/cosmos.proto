// Transform from cosmos/base/tendermint/v1beta1/types.proto
package cosmos.base.tendermint.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import tendermint.types.BlockIDMapper
import tendermint.types.CommitMapper
import tendermint.types.DataMapper
import tendermint.types.EvidenceListMapper
import tendermint.version.ConsensusMapper

public object BlockMapper : ProtobufTypeMapper<Block, Types.Block> {
  public override val descriptor: Descriptors.Descriptor = Types.Block.getDescriptor()

  public override val parser: Parser<Types.Block> = Types.Block.parser()

  public override fun convert(obj: Types.Block): Block = Block(
  	`header` = HeaderMapper.convert(obj.`header`),
  	`data` = DataMapper.convert(obj.`data`),
  	evidence = EvidenceListMapper.convert(obj.evidence),
  	lastCommit = CommitMapper.convert(obj.lastCommit),
  )

  public override fun convert(obj: Block): Types.Block {
    val builder = Types.Block.newBuilder()
    builder.setHeader(HeaderMapper.convert(obj.`header`))
    builder.setData(DataMapper.convert(obj.`data`))
    builder.setEvidence(EvidenceListMapper.convert(obj.evidence))
    builder.setLastCommit(CommitMapper.convert(obj.lastCommit))
    return builder.build()
  }
}

public object HeaderMapper : ProtobufTypeMapper<Header, Types.Header> {
  public override val descriptor: Descriptors.Descriptor = Types.Header.getDescriptor()

  public override val parser: Parser<Types.Header> = Types.Header.parser()

  public override fun convert(obj: Types.Header): Header = Header(
  	version = ConsensusMapper.convert(obj.version),
  	chainId = obj.chainId,
  	height = obj.height,
  	time = TimestampMapper.convert(obj.time),
  	lastBlockId = BlockIDMapper.convert(obj.lastBlockId),
  	lastCommitHash = obj.lastCommitHash.toByteArray(),
  	dataHash = obj.dataHash.toByteArray(),
  	validatorsHash = obj.validatorsHash.toByteArray(),
  	nextValidatorsHash = obj.nextValidatorsHash.toByteArray(),
  	consensusHash = obj.consensusHash.toByteArray(),
  	appHash = obj.appHash.toByteArray(),
  	lastResultsHash = obj.lastResultsHash.toByteArray(),
  	evidenceHash = obj.evidenceHash.toByteArray(),
  	proposerAddress = obj.proposerAddress,
  )

  public override fun convert(obj: Header): Types.Header {
    val builder = Types.Header.newBuilder()
    builder.setVersion(ConsensusMapper.convert(obj.version))
    builder.setChainId(obj.chainId)
    builder.setHeight(obj.height)
    builder.setTime(TimestampMapper.convert(obj.time))
    builder.setLastBlockId(BlockIDMapper.convert(obj.lastBlockId))
    builder.setLastCommitHash(ByteString.copyFrom(obj.lastCommitHash))
    builder.setDataHash(ByteString.copyFrom(obj.dataHash))
    builder.setValidatorsHash(ByteString.copyFrom(obj.validatorsHash))
    builder.setNextValidatorsHash(ByteString.copyFrom(obj.nextValidatorsHash))
    builder.setConsensusHash(ByteString.copyFrom(obj.consensusHash))
    builder.setAppHash(ByteString.copyFrom(obj.appHash))
    builder.setLastResultsHash(ByteString.copyFrom(obj.lastResultsHash))
    builder.setEvidenceHash(ByteString.copyFrom(obj.evidenceHash))
    builder.setProposerAddress(obj.proposerAddress)
    return builder.build()
  }
}
