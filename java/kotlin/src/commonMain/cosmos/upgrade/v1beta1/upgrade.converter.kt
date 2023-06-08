// Transform from cosmos/upgrade/v1beta1/upgrade.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.upgrade.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object PlanConverter : ProtobufConverter<Plan>

public expect object SoftwareUpgradeProposalConverter : ProtobufConverter<SoftwareUpgradeProposal>

public expect object CancelSoftwareUpgradeProposalConverter :
    ProtobufConverter<CancelSoftwareUpgradeProposal>

public expect object ModuleVersionConverter : ProtobufConverter<ModuleVersion>
