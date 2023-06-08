// Transform from cosmos/feegrant/v1beta1/feegrant.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.feegrant.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object BasicAllowanceConverter : ProtobufConverter<BasicAllowance>

public expect object PeriodicAllowanceConverter : ProtobufConverter<PeriodicAllowance>

public expect object AllowedMsgAllowanceConverter : ProtobufConverter<AllowedMsgAllowance>

public expect object GrantConverter : ProtobufConverter<Grant>
