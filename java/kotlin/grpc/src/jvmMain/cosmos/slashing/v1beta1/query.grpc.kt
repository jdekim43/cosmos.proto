// Transform from cosmos/slashing/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.slashing.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public actual object Query {
  public actual interface Interface {
    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public actual suspend fun signingInfo(request: QuerySigningInfoRequest):
        QuerySigningInfoResponse

    public actual suspend fun signingInfos(request: QuerySigningInfosRequest):
        QuerySigningInfosResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}