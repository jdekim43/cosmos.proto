// Transform from cosmos/base/node/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.base.node.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public expect object Service {
  public interface Interface {
    public suspend fun config(request: ConfigRequest): ConfigResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
