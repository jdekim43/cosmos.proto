// Transform from cosmos/capability/v1beta1/capability.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.capability.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object CapabilityConverter : ProtobufConverter<Capability>

public expect object OwnerConverter : ProtobufConverter<Owner>

public expect object CapabilityOwnersConverter : ProtobufConverter<CapabilityOwners>
