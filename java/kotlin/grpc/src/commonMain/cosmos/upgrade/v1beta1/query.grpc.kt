// Transform from cosmos/upgrade/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.upgrade.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public expect object Query {
  public interface Interface {
    public suspend fun currentPlan(request: QueryCurrentPlanRequest): QueryCurrentPlanResponse

    public suspend fun appliedPlan(request: QueryAppliedPlanRequest): QueryAppliedPlanResponse

    public suspend fun upgradedConsensusState(request: QueryUpgradedConsensusStateRequest):
        QueryUpgradedConsensusStateResponse

    public suspend fun moduleVersions(request: QueryModuleVersionsRequest):
        QueryModuleVersionsResponse

    public suspend fun authority(request: QueryAuthorityRequest): QueryAuthorityResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}