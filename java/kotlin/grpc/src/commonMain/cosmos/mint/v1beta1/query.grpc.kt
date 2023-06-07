// Transform from cosmos/mint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.mint.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public expect object Query {
  public interface Interface {
    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public suspend fun inflation(request: QueryInflationRequest): QueryInflationResponse

    public suspend fun annualProvisions(request: QueryAnnualProvisionsRequest):
        QueryAnnualProvisionsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
