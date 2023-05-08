// Transform from cosmos/bank/module/v1/module.proto
package cosmos.bank.module.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ModuleMapper : ProtobufTypeMapper<Module, ModuleOuterClass.Module> {
  public override val descriptor: Descriptors.Descriptor = ModuleOuterClass.Module.getDescriptor()

  public override val parser: Parser<ModuleOuterClass.Module> = ModuleOuterClass.Module.parser()

  public override fun convert(obj: ModuleOuterClass.Module): Module = Module(
  	blockedModuleAccountsOverride = obj.blockedModuleAccountsOverrideList.map { it },
  	authority = obj.authority,
  )

  public override fun convert(obj: Module): ModuleOuterClass.Module {
    val builder = ModuleOuterClass.Module.newBuilder()
    builder.addAllBlockedModuleAccountsOverride(obj.blockedModuleAccountsOverride.map { it })
    builder.setAuthority(obj.authority)
    return builder.build()
  }
}
