// Transform from cosmos/reflection/v1/reflection.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.reflection.v1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public actual object ReflectionService {
  public actual interface Interface {
    public actual suspend fun fileDescriptors(request: FileDescriptorsRequest):
        FileDescriptorsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : ReflectionServiceJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : ReflectionServiceJvm.Client(option), Interface
}
