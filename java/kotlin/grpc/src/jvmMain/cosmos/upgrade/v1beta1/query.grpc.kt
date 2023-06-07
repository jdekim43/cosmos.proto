// Transform from cosmos/upgrade/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.upgrade.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public actual object Query {
  public actual interface Interface {
    public actual suspend fun currentPlan(request: QueryCurrentPlanRequest):
        QueryCurrentPlanResponse

    public actual suspend fun appliedPlan(request: QueryAppliedPlanRequest):
        QueryAppliedPlanResponse

    public actual suspend fun upgradedConsensusState(request: QueryUpgradedConsensusStateRequest):
        QueryUpgradedConsensusStateResponse

    public actual suspend fun moduleVersions(request: QueryModuleVersionsRequest):
        QueryModuleVersionsResponse

    public actual suspend fun authority(request: QueryAuthorityRequest): QueryAuthorityResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
