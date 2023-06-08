// Transform from cosmos/gov/v1/query.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.gov.v1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public expect object Query {
  public interface Interface {
    public suspend fun proposal(request: QueryProposalRequest): QueryProposalResponse

    public suspend fun proposals(request: QueryProposalsRequest): QueryProposalsResponse

    public suspend fun vote(request: QueryVoteRequest): QueryVoteResponse

    public suspend fun votes(request: QueryVotesRequest): QueryVotesResponse

    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public suspend fun deposit(request: QueryDepositRequest): QueryDepositResponse

    public suspend fun deposits(request: QueryDepositsRequest): QueryDepositsResponse

    public suspend fun tallyResult(request: QueryTallyResultRequest): QueryTallyResultResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
