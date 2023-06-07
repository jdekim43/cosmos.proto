// Transform from cosmos/gov/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.gov.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption

public actual object Msg {
  public actual interface Interface {
    public actual suspend fun submitProposal(request: MsgSubmitProposal): MsgSubmitProposalResponse

    public actual suspend fun vote(request: MsgVote): MsgVoteResponse

    public actual suspend fun voteWeighted(request: MsgVoteWeighted): MsgVoteWeightedResponse

    public actual suspend fun deposit(request: MsgDeposit): MsgDepositResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
