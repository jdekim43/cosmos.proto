// Transform from cosmos/base/node/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.base.node.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public actual object Service {
  public actual interface Interface {
    public actual suspend fun config(request: ConfigRequest): ConfigResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : ServiceJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : ServiceJvm.Client(option), Interface
}
