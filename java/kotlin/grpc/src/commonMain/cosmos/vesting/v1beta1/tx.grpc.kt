// Transform from cosmos/vesting/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.vesting.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public expect object Msg {
  public interface Interface {
    public suspend fun createVestingAccount(request: MsgCreateVestingAccount):
        MsgCreateVestingAccountResponse

    public suspend fun createPermanentLockedAccount(request: MsgCreatePermanentLockedAccount):
        MsgCreatePermanentLockedAccountResponse

    public suspend fun createPeriodicVestingAccount(request: MsgCreatePeriodicVestingAccount):
        MsgCreatePeriodicVestingAccountResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
