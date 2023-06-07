// Transform from tendermint/types/params.proto
@file:GeneratorVersion(version = "0.2.1")

package tendermint.types

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object ConsensusParamsConverter : ProtobufConverter<ConsensusParams>

public expect object BlockParamsConverter : ProtobufConverter<BlockParams>

public expect object EvidenceParamsConverter : ProtobufConverter<EvidenceParams>

public expect object ValidatorParamsConverter : ProtobufConverter<ValidatorParams>

public expect object VersionParamsConverter : ProtobufConverter<VersionParams>

public expect object HashedParamsConverter : ProtobufConverter<HashedParams>
