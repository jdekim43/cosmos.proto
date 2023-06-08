// Transform from cosmos/nft/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.nft.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public actual object Query {
  public actual interface Interface {
    public actual suspend fun balance(request: QueryBalanceRequest): QueryBalanceResponse

    public actual suspend fun owner(request: QueryOwnerRequest): QueryOwnerResponse

    public actual suspend fun supply(request: QuerySupplyRequest): QuerySupplyResponse

    public actual suspend fun nFTs(request: QueryNFTsRequest): QueryNFTsResponse

    public actual suspend fun nFT(request: QueryNFTRequest): QueryNFTResponse

    public actual suspend fun `class`(request: QueryClassRequest): QueryClassResponse

    public actual suspend fun classes(request: QueryClassesRequest): QueryClassesResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
