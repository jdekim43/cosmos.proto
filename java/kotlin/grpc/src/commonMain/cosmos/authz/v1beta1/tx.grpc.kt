// Transform from cosmos/authz/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.authz.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public expect object Msg {
  public interface Interface {
    public suspend fun grant(request: MsgGrant): MsgGrantResponse

    public suspend fun exec(request: MsgExec): MsgExecResponse

    public suspend fun revoke(request: MsgRevoke): MsgRevokeResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
