// Transform from cosmos/app/runtime/v1alpha1/module.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.app.runtime.v1alpha1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ModuleJvmConverter : ProtobufTypeMapper<Module, ModuleOuterClass.Module> {
  public override val descriptor: Descriptors.Descriptor = ModuleOuterClass.Module.getDescriptor()

  public override val parser: Parser<ModuleOuterClass.Module> = ModuleOuterClass.Module.parser()

  public override fun convert(obj: ModuleOuterClass.Module): Module = Module(
  	appName = obj.appName,
  	beginBlockers = obj.beginBlockersList.map { it },
  	endBlockers = obj.endBlockersList.map { it },
  	initGenesis = obj.initGenesisList.map { it },
  	exportGenesis = obj.exportGenesisList.map { it },
  	overrideStoreKeys = obj.overrideStoreKeysList.map { StoreKeyConfigJvmConverter.convert(it) },
  )

  public override fun convert(obj: Module): ModuleOuterClass.Module {
    val builder = ModuleOuterClass.Module.newBuilder()
    builder.setAppName(obj.appName)
    builder.addAllBeginBlockers(obj.beginBlockers.map { it })
    builder.addAllEndBlockers(obj.endBlockers.map { it })
    builder.addAllInitGenesis(obj.initGenesis.map { it })
    builder.addAllExportGenesis(obj.exportGenesis.map { it })
    builder.addAllOverrideStoreKeys(obj.overrideStoreKeys.map {
        StoreKeyConfigJvmConverter.convert(it) })
    return builder.build()
  }
}

public object StoreKeyConfigJvmConverter :
    ProtobufTypeMapper<StoreKeyConfig, ModuleOuterClass.StoreKeyConfig> {
  public override val descriptor: Descriptors.Descriptor =
      ModuleOuterClass.StoreKeyConfig.getDescriptor()

  public override val parser: Parser<ModuleOuterClass.StoreKeyConfig> =
      ModuleOuterClass.StoreKeyConfig.parser()

  public override fun convert(obj: ModuleOuterClass.StoreKeyConfig): StoreKeyConfig =
      StoreKeyConfig(
  	moduleName = obj.moduleName,
  	kvStoreKey = obj.kvStoreKey,
  )

  public override fun convert(obj: StoreKeyConfig): ModuleOuterClass.StoreKeyConfig {
    val builder = ModuleOuterClass.StoreKeyConfig.newBuilder()
    builder.setModuleName(obj.moduleName)
    builder.setKvStoreKey(obj.kvStoreKey)
    return builder.build()
  }
}
