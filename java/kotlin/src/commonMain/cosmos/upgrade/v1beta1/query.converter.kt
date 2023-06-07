// Transform from cosmos/upgrade/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.upgrade.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object QueryCurrentPlanRequestConverter : ProtobufConverter<QueryCurrentPlanRequest>

public expect object QueryCurrentPlanResponseConverter : ProtobufConverter<QueryCurrentPlanResponse>

public expect object QueryAppliedPlanRequestConverter : ProtobufConverter<QueryAppliedPlanRequest>

public expect object QueryAppliedPlanResponseConverter : ProtobufConverter<QueryAppliedPlanResponse>

public expect object QueryUpgradedConsensusStateRequestConverter :
    ProtobufConverter<QueryUpgradedConsensusStateRequest>

public expect object QueryUpgradedConsensusStateResponseConverter :
    ProtobufConverter<QueryUpgradedConsensusStateResponse>

public expect object QueryModuleVersionsRequestConverter :
    ProtobufConverter<QueryModuleVersionsRequest>

public expect object QueryModuleVersionsResponseConverter :
    ProtobufConverter<QueryModuleVersionsResponse>

public expect object QueryAuthorityRequestConverter : ProtobufConverter<QueryAuthorityRequest>

public expect object QueryAuthorityResponseConverter : ProtobufConverter<QueryAuthorityResponse>
