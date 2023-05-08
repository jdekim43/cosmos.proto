// Transform from tendermint/types/block.proto
package tendermint.types

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object BlockMapper : ProtobufTypeMapper<Block, BlockOuterClass.Block> {
  public override val descriptor: Descriptors.Descriptor = BlockOuterClass.Block.getDescriptor()

  public override val parser: Parser<BlockOuterClass.Block> = BlockOuterClass.Block.parser()

  public override fun convert(obj: BlockOuterClass.Block): Block = Block(
  	`header` = HeaderMapper.convert(obj.`header`),
  	`data` = DataMapper.convert(obj.`data`),
  	evidence = EvidenceListMapper.convert(obj.evidence),
  	lastCommit = CommitMapper.convert(obj.lastCommit),
  )

  public override fun convert(obj: Block): BlockOuterClass.Block {
    val builder = BlockOuterClass.Block.newBuilder()
    builder.setHeader(HeaderMapper.convert(obj.`header`))
    builder.setData(DataMapper.convert(obj.`data`))
    builder.setEvidence(EvidenceListMapper.convert(obj.evidence))
    builder.setLastCommit(CommitMapper.convert(obj.lastCommit))
    return builder.build()
  }
}
