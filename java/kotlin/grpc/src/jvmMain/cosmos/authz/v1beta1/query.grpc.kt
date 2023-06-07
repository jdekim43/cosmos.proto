// Transform from cosmos/authz/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.authz.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public actual object Query {
  public actual interface Interface {
    public actual suspend fun grants(request: QueryGrantsRequest): QueryGrantsResponse

    public actual suspend fun granterGrants(request: QueryGranterGrantsRequest):
        QueryGranterGrantsResponse

    public actual suspend fun granteeGrants(request: QueryGranteeGrantsRequest):
        QueryGranteeGrantsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
