// Transform from cosmos/upgrade/v1beta1/upgrade.proto
package cosmos.upgrade.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyMapper
import google.protobuf.TimestampMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object PlanMapper : ProtobufTypeMapper<Plan, Upgrade.Plan> {
  public override val descriptor: Descriptors.Descriptor = Upgrade.Plan.getDescriptor()

  public override val parser: Parser<Upgrade.Plan> = Upgrade.Plan.parser()

  public override fun convert(obj: Upgrade.Plan): Plan = Plan(
  	name = obj.name,
  	time = TimestampMapper.convert(obj.time),
  	height = obj.height,
  	info = obj.info,
  	upgradedClientState = AnyMapper.convert(obj.upgradedClientState),
  )

  public override fun convert(obj: Plan): Upgrade.Plan {
    val builder = Upgrade.Plan.newBuilder()
    builder.setName(obj.name)
    builder.setTime(TimestampMapper.convert(obj.time))
    builder.setHeight(obj.height)
    builder.setInfo(obj.info)
    builder.setUpgradedClientState(AnyMapper.convert(obj.upgradedClientState))
    return builder.build()
  }
}

public object SoftwareUpgradeProposalMapper :
    ProtobufTypeMapper<SoftwareUpgradeProposal, Upgrade.SoftwareUpgradeProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Upgrade.SoftwareUpgradeProposal.getDescriptor()

  public override val parser: Parser<Upgrade.SoftwareUpgradeProposal> =
      Upgrade.SoftwareUpgradeProposal.parser()

  public override fun convert(obj: Upgrade.SoftwareUpgradeProposal): SoftwareUpgradeProposal =
      SoftwareUpgradeProposal(
  	title = obj.title,
  	description = obj.description,
  	plan = PlanMapper.convert(obj.plan),
  )

  public override fun convert(obj: SoftwareUpgradeProposal): Upgrade.SoftwareUpgradeProposal {
    val builder = Upgrade.SoftwareUpgradeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setPlan(PlanMapper.convert(obj.plan))
    return builder.build()
  }
}

public object CancelSoftwareUpgradeProposalMapper :
    ProtobufTypeMapper<CancelSoftwareUpgradeProposal, Upgrade.CancelSoftwareUpgradeProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Upgrade.CancelSoftwareUpgradeProposal.getDescriptor()

  public override val parser: Parser<Upgrade.CancelSoftwareUpgradeProposal> =
      Upgrade.CancelSoftwareUpgradeProposal.parser()

  public override fun convert(obj: Upgrade.CancelSoftwareUpgradeProposal):
      CancelSoftwareUpgradeProposal = CancelSoftwareUpgradeProposal(
  	title = obj.title,
  	description = obj.description,
  )

  public override fun convert(obj: CancelSoftwareUpgradeProposal):
      Upgrade.CancelSoftwareUpgradeProposal {
    val builder = Upgrade.CancelSoftwareUpgradeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    return builder.build()
  }
}

public object ModuleVersionMapper : ProtobufTypeMapper<ModuleVersion, Upgrade.ModuleVersion> {
  public override val descriptor: Descriptors.Descriptor = Upgrade.ModuleVersion.getDescriptor()

  public override val parser: Parser<Upgrade.ModuleVersion> = Upgrade.ModuleVersion.parser()

  public override fun convert(obj: Upgrade.ModuleVersion): ModuleVersion = ModuleVersion(
  	name = obj.name,
  	version = obj.version.asKotlinType,
  )

  public override fun convert(obj: ModuleVersion): Upgrade.ModuleVersion {
    val builder = Upgrade.ModuleVersion.newBuilder()
    builder.setName(obj.name)
    builder.setVersion(obj.version.asJavaType)
    return builder.build()
  }
}
