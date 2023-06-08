// Transform from cosmos/base/tendermint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.base.tendermint.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public actual object Service {
  public actual interface Interface {
    public actual suspend fun getNodeInfo(request: GetNodeInfoRequest): GetNodeInfoResponse

    public actual suspend fun getSyncing(request: GetSyncingRequest): GetSyncingResponse

    public actual suspend fun getLatestBlock(request: GetLatestBlockRequest): GetLatestBlockResponse

    public actual suspend fun getBlockByHeight(request: GetBlockByHeightRequest):
        GetBlockByHeightResponse

    public actual suspend fun getLatestValidatorSet(request: GetLatestValidatorSetRequest):
        GetLatestValidatorSetResponse

    public actual suspend fun getValidatorSetByHeight(request: GetValidatorSetByHeightRequest):
        GetValidatorSetByHeightResponse

    public actual suspend fun aBCIQuery(request: ABCIQueryRequest): ABCIQueryResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : ServiceJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : ServiceJvm.Client(option), Interface
}
