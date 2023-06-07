// Transform from cosmos/upgrade/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.upgrade.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public actual object Msg {
  public actual interface Interface {
    public actual suspend fun softwareUpgrade(request: MsgSoftwareUpgrade):
        MsgSoftwareUpgradeResponse

    public actual suspend fun cancelUpgrade(request: MsgCancelUpgrade): MsgCancelUpgradeResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
