// Transform from cosmos/app/v1alpha1/config.proto
package cosmos.app.v1alpha1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ConfigMapper : ProtobufTypeMapper<Config, ConfigOuterClass.Config> {
  public override val descriptor: Descriptors.Descriptor = ConfigOuterClass.Config.getDescriptor()

  public override val parser: Parser<ConfigOuterClass.Config> = ConfigOuterClass.Config.parser()

  public override fun convert(obj: ConfigOuterClass.Config): Config = Config(
  	modules = obj.modulesList.map { ModuleConfigMapper.convert(it) },
  	golangBindings = obj.golangBindingsList.map { GolangBindingMapper.convert(it) },
  )

  public override fun convert(obj: Config): ConfigOuterClass.Config {
    val builder = ConfigOuterClass.Config.newBuilder()
    builder.addAllModules(obj.modules.map { ModuleConfigMapper.convert(it) })
    builder.addAllGolangBindings(obj.golangBindings.map { GolangBindingMapper.convert(it) })
    return builder.build()
  }
}

public object ModuleConfigMapper : ProtobufTypeMapper<ModuleConfig, ConfigOuterClass.ModuleConfig> {
  public override val descriptor: Descriptors.Descriptor =
      ConfigOuterClass.ModuleConfig.getDescriptor()

  public override val parser: Parser<ConfigOuterClass.ModuleConfig> =
      ConfigOuterClass.ModuleConfig.parser()

  public override fun convert(obj: ConfigOuterClass.ModuleConfig): ModuleConfig = ModuleConfig(
  	name = obj.name,
  	config = AnyMapper.convert(obj.config),
  	golangBindings = obj.golangBindingsList.map { GolangBindingMapper.convert(it) },
  )

  public override fun convert(obj: ModuleConfig): ConfigOuterClass.ModuleConfig {
    val builder = ConfigOuterClass.ModuleConfig.newBuilder()
    builder.setName(obj.name)
    builder.setConfig(AnyMapper.convert(obj.config))
    builder.addAllGolangBindings(obj.golangBindings.map { GolangBindingMapper.convert(it) })
    return builder.build()
  }
}

public object GolangBindingMapper :
    ProtobufTypeMapper<GolangBinding, ConfigOuterClass.GolangBinding> {
  public override val descriptor: Descriptors.Descriptor =
      ConfigOuterClass.GolangBinding.getDescriptor()

  public override val parser: Parser<ConfigOuterClass.GolangBinding> =
      ConfigOuterClass.GolangBinding.parser()

  public override fun convert(obj: ConfigOuterClass.GolangBinding): GolangBinding = GolangBinding(
  	interfaceType = obj.interfaceType,
  	implementation = obj.implementation,
  )

  public override fun convert(obj: GolangBinding): ConfigOuterClass.GolangBinding {
    val builder = ConfigOuterClass.GolangBinding.newBuilder()
    builder.setInterfaceType(obj.interfaceType)
    builder.setImplementation(obj.implementation)
    return builder.build()
  }
}
