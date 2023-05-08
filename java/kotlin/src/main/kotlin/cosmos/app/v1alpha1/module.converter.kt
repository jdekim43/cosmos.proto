// Transform from cosmos/app/v1alpha1/module.proto
package cosmos.app.v1alpha1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ModuleDescriptorMapper : ProtobufTypeMapper<ModuleDescriptor, Module.ModuleDescriptor>
    {
  public override val descriptor: Descriptors.Descriptor = Module.ModuleDescriptor.getDescriptor()

  public override val parser: Parser<Module.ModuleDescriptor> = Module.ModuleDescriptor.parser()

  public override fun convert(obj: Module.ModuleDescriptor): ModuleDescriptor = ModuleDescriptor(
  	goImport = obj.goImport,
  	usePackage = obj.usePackageList.map { PackageReferenceMapper.convert(it) },
  	canMigrateFrom = obj.canMigrateFromList.map { MigrateFromInfoMapper.convert(it) },
  )

  public override fun convert(obj: ModuleDescriptor): Module.ModuleDescriptor {
    val builder = Module.ModuleDescriptor.newBuilder()
    builder.setGoImport(obj.goImport)
    builder.addAllUsePackage(obj.usePackage.map { PackageReferenceMapper.convert(it) })
    builder.addAllCanMigrateFrom(obj.canMigrateFrom.map { MigrateFromInfoMapper.convert(it) })
    return builder.build()
  }
}

public object PackageReferenceMapper : ProtobufTypeMapper<PackageReference, Module.PackageReference>
    {
  public override val descriptor: Descriptors.Descriptor = Module.PackageReference.getDescriptor()

  public override val parser: Parser<Module.PackageReference> = Module.PackageReference.parser()

  public override fun convert(obj: Module.PackageReference): PackageReference = PackageReference(
  	name = obj.name,
  	revision = obj.revision.asKotlinType,
  )

  public override fun convert(obj: PackageReference): Module.PackageReference {
    val builder = Module.PackageReference.newBuilder()
    builder.setName(obj.name)
    builder.setRevision(obj.revision.asJavaType)
    return builder.build()
  }
}

public object MigrateFromInfoMapper : ProtobufTypeMapper<MigrateFromInfo, Module.MigrateFromInfo> {
  public override val descriptor: Descriptors.Descriptor = Module.MigrateFromInfo.getDescriptor()

  public override val parser: Parser<Module.MigrateFromInfo> = Module.MigrateFromInfo.parser()

  public override fun convert(obj: Module.MigrateFromInfo): MigrateFromInfo = MigrateFromInfo(
  	module = obj.module,
  )

  public override fun convert(obj: MigrateFromInfo): Module.MigrateFromInfo {
    val builder = Module.MigrateFromInfo.newBuilder()
    builder.setModule(obj.module)
    return builder.build()
  }
}
