// Transform from cosmos/upgrade/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.upgrade.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MsgSoftwareUpgradeConverter : ProtobufConverter<MsgSoftwareUpgrade>

public expect object MsgSoftwareUpgradeResponseConverter :
    ProtobufConverter<MsgSoftwareUpgradeResponse>

public expect object MsgCancelUpgradeConverter : ProtobufConverter<MsgCancelUpgrade>

public expect object MsgCancelUpgradeResponseConverter : ProtobufConverter<MsgCancelUpgradeResponse>
