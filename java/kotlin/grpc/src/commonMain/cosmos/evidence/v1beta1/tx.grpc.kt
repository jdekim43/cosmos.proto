// Transform from cosmos/evidence/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.evidence.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public expect object Msg {
  public interface Interface {
    public suspend fun submitEvidence(request: MsgSubmitEvidence): MsgSubmitEvidenceResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
