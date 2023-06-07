// Transform from cosmos/gov/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.gov.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public expect object Msg {
  public interface Interface {
    public suspend fun submitProposal(request: MsgSubmitProposal): MsgSubmitProposalResponse

    public suspend fun vote(request: MsgVote): MsgVoteResponse

    public suspend fun voteWeighted(request: MsgVoteWeighted): MsgVoteWeightedResponse

    public suspend fun deposit(request: MsgDeposit): MsgDepositResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
