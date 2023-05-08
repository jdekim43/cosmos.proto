// Transform from cosmos/tx/config/v1/config.proto
package cosmos.tx.config.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ConfigMapper : ProtobufTypeMapper<Config, ConfigOuterClass.Config> {
  public override val descriptor: Descriptors.Descriptor = ConfigOuterClass.Config.getDescriptor()

  public override val parser: Parser<ConfigOuterClass.Config> = ConfigOuterClass.Config.parser()

  public override fun convert(obj: ConfigOuterClass.Config): Config = Config(
  	skipAnteHandler = obj.skipAnteHandler,
  	skipPostHandler = obj.skipPostHandler,
  )

  public override fun convert(obj: Config): ConfigOuterClass.Config {
    val builder = ConfigOuterClass.Config.newBuilder()
    builder.setSkipAnteHandler(obj.skipAnteHandler)
    builder.setSkipPostHandler(obj.skipPostHandler)
    return builder.build()
  }
}
