// Transform from cosmos/evidence/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.evidence.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public actual object Query {
  public actual interface Interface {
    public actual suspend fun evidence(request: QueryEvidenceRequest): QueryEvidenceResponse

    public actual suspend fun allEvidence(request: QueryAllEvidenceRequest):
        QueryAllEvidenceResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
