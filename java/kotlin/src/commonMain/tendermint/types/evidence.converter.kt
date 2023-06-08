// Transform from tendermint/types/evidence.proto
@file:GeneratorVersion(version = "0.2.2")

package tendermint.types

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object EvidenceConverter : ProtobufConverter<Evidence>

public expect object DuplicateVoteEvidenceConverter : ProtobufConverter<DuplicateVoteEvidence>

public expect object LightClientAttackEvidenceConverter :
    ProtobufConverter<LightClientAttackEvidence>

public expect object EvidenceListConverter : ProtobufConverter<EvidenceList>
