// Transform from cosmos/upgrade/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun softwareUpgrade(request: MsgSoftwareUpgrade): MsgSoftwareUpgradeResponse

    public suspend fun cancelUpgrade(request: MsgCancelUpgrade): MsgCancelUpgradeResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
