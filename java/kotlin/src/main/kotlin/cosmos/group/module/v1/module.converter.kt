// Transform from cosmos/group/module/v1/module.proto
package cosmos.group.module.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.DurationMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ModuleMapper : ProtobufTypeMapper<Module, ModuleOuterClass.Module> {
  public override val descriptor: Descriptors.Descriptor = ModuleOuterClass.Module.getDescriptor()

  public override val parser: Parser<ModuleOuterClass.Module> = ModuleOuterClass.Module.parser()

  public override fun convert(obj: ModuleOuterClass.Module): Module = Module(
  	maxExecutionPeriod = DurationMapper.convert(obj.maxExecutionPeriod),
  	maxMetadataLen = obj.maxMetadataLen.asKotlinType,
  )

  public override fun convert(obj: Module): ModuleOuterClass.Module {
    val builder = ModuleOuterClass.Module.newBuilder()
    builder.setMaxExecutionPeriod(DurationMapper.convert(obj.maxExecutionPeriod))
    builder.setMaxMetadataLen(obj.maxMetadataLen.asJavaType)
    return builder.build()
  }
}
