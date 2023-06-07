// Transform from tendermint/p2p/types.proto
@file:GeneratorVersion(version = "0.2.1")

package tendermint.p2p

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object NetAddressConverter : ProtobufConverter<NetAddress>

public expect object ProtocolVersionConverter : ProtobufConverter<ProtocolVersion>

public expect object DefaultNodeInfoConverter : ProtobufConverter<DefaultNodeInfo>

public expect object DefaultNodeInfoOtherConverter : ProtobufConverter<DefaultNodeInfoOther>
