// Transform from cosmos/nft/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.nft.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public expect object Query {
  public interface Interface {
    public suspend fun balance(request: QueryBalanceRequest): QueryBalanceResponse

    public suspend fun owner(request: QueryOwnerRequest): QueryOwnerResponse

    public suspend fun supply(request: QuerySupplyRequest): QuerySupplyResponse

    public suspend fun nFTs(request: QueryNFTsRequest): QueryNFTsResponse

    public suspend fun nFT(request: QueryNFTRequest): QueryNFTResponse

    public suspend fun `class`(request: QueryClassRequest): QueryClassResponse

    public suspend fun classes(request: QueryClassesRequest): QueryClassesResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
