// Transform from cosmos/gov/v1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.gov.v1

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ServerCalls
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax

public object MsgService {
  private val descriptor: ServiceDescriptor = MsgGrpc.getServiceDescriptor()!!

  private val submitProposalDescriptor:
      MethodDescriptor<Tx.MsgSubmitProposal, Tx.MsgSubmitProposalResponse> =
      MsgGrpc.getSubmitProposalMethod()!!

  private val execLegacyContentDescriptor:
      MethodDescriptor<Tx.MsgExecLegacyContent, Tx.MsgExecLegacyContentResponse> =
      MsgGrpc.getExecLegacyContentMethod()!!

  private val voteDescriptor: MethodDescriptor<Tx.MsgVote, Tx.MsgVoteResponse> =
      MsgGrpc.getVoteMethod()!!

  private val voteWeightedDescriptor:
      MethodDescriptor<Tx.MsgVoteWeighted, Tx.MsgVoteWeightedResponse> =
      MsgGrpc.getVoteWeightedMethod()!!

  private val depositDescriptor: MethodDescriptor<Tx.MsgDeposit, Tx.MsgDepositResponse> =
      MsgGrpc.getDepositMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun submitProposal(request: MsgSubmitProposal): MsgSubmitProposalResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Msg.SubmitProposal is unimplemented"))

    public open suspend fun execLegacyContent(request: MsgExecLegacyContent):
        MsgExecLegacyContentResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Msg.ExecLegacyContent is unimplemented"))

    public open suspend fun vote(request: MsgVote): MsgVoteResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Msg.Vote is unimplemented"))

    public open suspend fun voteWeighted(request: MsgVoteWeighted): MsgVoteWeightedResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Msg.VoteWeighted is unimplemented"))

    public open suspend fun deposit(request: MsgDeposit): MsgDepositResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Msg.Deposit is unimplemented"))

    public open suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Msg.UpdateParams is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = submitProposalDescriptor,
    				implementation = {
        MsgSubmitProposalResponseMapper.convert(submitProposal(MsgSubmitProposalMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = execLegacyContentDescriptor,
    				implementation = {
        MsgExecLegacyContentResponseMapper.convert(execLegacyContent(MsgExecLegacyContentMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = voteDescriptor,
    				implementation = { MsgVoteResponseMapper.convert(vote(MsgVoteMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = voteWeightedDescriptor,
    				implementation = {
        MsgVoteWeightedResponseMapper.convert(voteWeighted(MsgVoteWeightedMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = depositDescriptor,
    				implementation = { MsgDepositResponseMapper.convert(deposit(MsgDepositMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateParamsDescriptor,
    				implementation = {
        MsgUpdateParamsResponseMapper.convert(updateParams(MsgUpdateParamsMapper.convert(it))) },
    			)
    		)
    		.build()
  }

  public class Client(
    channel: Channel,
    callOptions: CallOptions = CallOptions.DEFAULT,
  ) : AbstractCoroutineStub<Client>(channel = channel, callOptions = callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions): Client = Client(channel,
        callOptions)

    public suspend fun submitProposal(request: MsgSubmitProposal, metadata: Metadata = Metadata()):
        MsgSubmitProposalResponse = MsgSubmitProposalResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, submitProposalDescriptor,
    			MsgSubmitProposalMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun execLegacyContent(request: MsgExecLegacyContent, metadata: Metadata =
        Metadata()): MsgExecLegacyContentResponse = MsgExecLegacyContentResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, execLegacyContentDescriptor,
    			MsgExecLegacyContentMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun vote(request: MsgVote, metadata: Metadata = Metadata()): MsgVoteResponse =
        MsgVoteResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, voteDescriptor,
    			MsgVoteMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun voteWeighted(request: MsgVoteWeighted, metadata: Metadata = Metadata()):
        MsgVoteWeightedResponse = MsgVoteWeightedResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, voteWeightedDescriptor,
    			MsgVoteWeightedMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun deposit(request: MsgDeposit, metadata: Metadata = Metadata()):
        MsgDepositResponse = MsgDepositResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, depositDescriptor,
    			MsgDepositMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun updateParams(request: MsgUpdateParams, metadata: Metadata = Metadata()):
        MsgUpdateParamsResponse = MsgUpdateParamsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, updateParamsDescriptor,
    			MsgUpdateParamsMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
