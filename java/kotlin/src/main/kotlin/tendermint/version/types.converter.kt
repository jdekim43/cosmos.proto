// Transform from tendermint/version/types.proto
package tendermint.version

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object AppMapper : ProtobufTypeMapper<App, Types.App> {
  public override val descriptor: Descriptors.Descriptor = Types.App.getDescriptor()

  public override val parser: Parser<Types.App> = Types.App.parser()

  public override fun convert(obj: Types.App): App = App(
  	protocol = obj.protocol.asKotlinType,
  	software = obj.software,
  )

  public override fun convert(obj: App): Types.App {
    val builder = Types.App.newBuilder()
    builder.setProtocol(obj.protocol.asJavaType)
    builder.setSoftware(obj.software)
    return builder.build()
  }
}

public object ConsensusMapper : ProtobufTypeMapper<Consensus, Types.Consensus> {
  public override val descriptor: Descriptors.Descriptor = Types.Consensus.getDescriptor()

  public override val parser: Parser<Types.Consensus> = Types.Consensus.parser()

  public override fun convert(obj: Types.Consensus): Consensus = Consensus(
  	block = obj.block.asKotlinType,
  	app = obj.app.asKotlinType,
  )

  public override fun convert(obj: Consensus): Types.Consensus {
    val builder = Types.Consensus.newBuilder()
    builder.setBlock(obj.block.asJavaType)
    builder.setApp(obj.app.asJavaType)
    return builder.build()
  }
}