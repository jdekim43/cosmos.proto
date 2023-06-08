// Transform from tendermint/version/types.proto
@file:GeneratorVersion(version = "0.2.2")

package tendermint.version

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object AppConverter : ProtobufConverter<App>

public expect object ConsensusConverter : ProtobufConverter<Consensus>
