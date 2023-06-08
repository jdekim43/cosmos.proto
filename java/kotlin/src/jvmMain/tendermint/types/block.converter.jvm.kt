// Transform from tendermint/types/block.proto
@file:GeneratorVersion(version = "0.2.2")

package tendermint.types

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object BlockJvmConverter : ProtobufTypeMapper<Block, BlockOuterClass.Block> {
  public override val descriptor: Descriptors.Descriptor = BlockOuterClass.Block.getDescriptor()

  public override val parser: Parser<BlockOuterClass.Block> = BlockOuterClass.Block.parser()

  public override fun convert(obj: BlockOuterClass.Block): Block = Block(
  	`header` = HeaderJvmConverter.convert(obj.`header`),
  	`data` = DataJvmConverter.convert(obj.`data`),
  	evidence = EvidenceListJvmConverter.convert(obj.evidence),
  	lastCommit = CommitJvmConverter.convert(obj.lastCommit),
  )

  public override fun convert(obj: Block): BlockOuterClass.Block {
    val builder = BlockOuterClass.Block.newBuilder()
    builder.setHeader(HeaderJvmConverter.convert(obj.`header`))
    builder.setData(DataJvmConverter.convert(obj.`data`))
    builder.setEvidence(EvidenceListJvmConverter.convert(obj.evidence))
    builder.setLastCommit(CommitJvmConverter.convert(obj.lastCommit))
    return builder.build()
  }
}
