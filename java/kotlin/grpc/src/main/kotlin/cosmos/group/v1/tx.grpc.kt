// Transform from cosmos/group/v1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.group.v1

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

  private val createGroupDescriptor: MethodDescriptor<Tx.MsgCreateGroup, Tx.MsgCreateGroupResponse>
      = MsgGrpc.getCreateGroupMethod()!!

  private val updateGroupMembersDescriptor:
      MethodDescriptor<Tx.MsgUpdateGroupMembers, Tx.MsgUpdateGroupMembersResponse> =
      MsgGrpc.getUpdateGroupMembersMethod()!!

  private val updateGroupAdminDescriptor:
      MethodDescriptor<Tx.MsgUpdateGroupAdmin, Tx.MsgUpdateGroupAdminResponse> =
      MsgGrpc.getUpdateGroupAdminMethod()!!

  private val updateGroupMetadataDescriptor:
      MethodDescriptor<Tx.MsgUpdateGroupMetadata, Tx.MsgUpdateGroupMetadataResponse> =
      MsgGrpc.getUpdateGroupMetadataMethod()!!

  private val createGroupPolicyDescriptor:
      MethodDescriptor<Tx.MsgCreateGroupPolicy, Tx.MsgCreateGroupPolicyResponse> =
      MsgGrpc.getCreateGroupPolicyMethod()!!

  private val createGroupWithPolicyDescriptor:
      MethodDescriptor<Tx.MsgCreateGroupWithPolicy, Tx.MsgCreateGroupWithPolicyResponse> =
      MsgGrpc.getCreateGroupWithPolicyMethod()!!

  private val updateGroupPolicyAdminDescriptor:
      MethodDescriptor<Tx.MsgUpdateGroupPolicyAdmin, Tx.MsgUpdateGroupPolicyAdminResponse> =
      MsgGrpc.getUpdateGroupPolicyAdminMethod()!!

  private val updateGroupPolicyDecisionPolicyDescriptor:
      MethodDescriptor<Tx.MsgUpdateGroupPolicyDecisionPolicy, Tx.MsgUpdateGroupPolicyDecisionPolicyResponse>
      = MsgGrpc.getUpdateGroupPolicyDecisionPolicyMethod()!!

  private val updateGroupPolicyMetadataDescriptor:
      MethodDescriptor<Tx.MsgUpdateGroupPolicyMetadata, Tx.MsgUpdateGroupPolicyMetadataResponse> =
      MsgGrpc.getUpdateGroupPolicyMetadataMethod()!!

  private val submitProposalDescriptor:
      MethodDescriptor<Tx.MsgSubmitProposal, Tx.MsgSubmitProposalResponse> =
      MsgGrpc.getSubmitProposalMethod()!!

  private val withdrawProposalDescriptor:
      MethodDescriptor<Tx.MsgWithdrawProposal, Tx.MsgWithdrawProposalResponse> =
      MsgGrpc.getWithdrawProposalMethod()!!

  private val voteDescriptor: MethodDescriptor<Tx.MsgVote, Tx.MsgVoteResponse> =
      MsgGrpc.getVoteMethod()!!

  private val execDescriptor: MethodDescriptor<Tx.MsgExec, Tx.MsgExecResponse> =
      MsgGrpc.getExecMethod()!!

  private val leaveGroupDescriptor: MethodDescriptor<Tx.MsgLeaveGroup, Tx.MsgLeaveGroupResponse> =
      MsgGrpc.getLeaveGroupMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun createGroup(request: MsgCreateGroup): MsgCreateGroupResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.CreateGroup is unimplemented"))

    public open suspend fun updateGroupMembers(request: MsgUpdateGroupMembers):
        MsgUpdateGroupMembersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.UpdateGroupMembers is unimplemented"))

    public open suspend fun updateGroupAdmin(request: MsgUpdateGroupAdmin):
        MsgUpdateGroupAdminResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.UpdateGroupAdmin is unimplemented"))

    public open suspend fun updateGroupMetadata(request: MsgUpdateGroupMetadata):
        MsgUpdateGroupMetadataResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.UpdateGroupMetadata is unimplemented"))

    public open suspend fun createGroupPolicy(request: MsgCreateGroupPolicy):
        MsgCreateGroupPolicyResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.CreateGroupPolicy is unimplemented"))

    public open suspend fun createGroupWithPolicy(request: MsgCreateGroupWithPolicy):
        MsgCreateGroupWithPolicyResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.CreateGroupWithPolicy is unimplemented"))

    public open suspend fun updateGroupPolicyAdmin(request: MsgUpdateGroupPolicyAdmin):
        MsgUpdateGroupPolicyAdminResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.UpdateGroupPolicyAdmin is unimplemented"))

    public open suspend
        fun updateGroupPolicyDecisionPolicy(request: MsgUpdateGroupPolicyDecisionPolicy):
        MsgUpdateGroupPolicyDecisionPolicyResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.UpdateGroupPolicyDecisionPolicy is unimplemented"))

    public open suspend fun updateGroupPolicyMetadata(request: MsgUpdateGroupPolicyMetadata):
        MsgUpdateGroupPolicyMetadataResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.UpdateGroupPolicyMetadata is unimplemented"))

    public open suspend fun submitProposal(request: MsgSubmitProposal): MsgSubmitProposalResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.SubmitProposal is unimplemented"))

    public open suspend fun withdrawProposal(request: MsgWithdrawProposal):
        MsgWithdrawProposalResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.WithdrawProposal is unimplemented"))

    public open suspend fun vote(request: MsgVote): MsgVoteResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.Vote is unimplemented"))

    public open suspend fun exec(request: MsgExec): MsgExecResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.Exec is unimplemented"))

    public open suspend fun leaveGroup(request: MsgLeaveGroup): MsgLeaveGroupResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.LeaveGroup is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createGroupDescriptor,
    				implementation = {
        MsgCreateGroupResponseMapper.convert(createGroup(MsgCreateGroupMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateGroupMembersDescriptor,
    				implementation = {
        MsgUpdateGroupMembersResponseMapper.convert(updateGroupMembers(MsgUpdateGroupMembersMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateGroupAdminDescriptor,
    				implementation = {
        MsgUpdateGroupAdminResponseMapper.convert(updateGroupAdmin(MsgUpdateGroupAdminMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateGroupMetadataDescriptor,
    				implementation = {
        MsgUpdateGroupMetadataResponseMapper.convert(updateGroupMetadata(MsgUpdateGroupMetadataMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createGroupPolicyDescriptor,
    				implementation = {
        MsgCreateGroupPolicyResponseMapper.convert(createGroupPolicy(MsgCreateGroupPolicyMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createGroupWithPolicyDescriptor,
    				implementation = {
        MsgCreateGroupWithPolicyResponseMapper.convert(createGroupWithPolicy(MsgCreateGroupWithPolicyMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateGroupPolicyAdminDescriptor,
    				implementation = {
        MsgUpdateGroupPolicyAdminResponseMapper.convert(updateGroupPolicyAdmin(MsgUpdateGroupPolicyAdminMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateGroupPolicyDecisionPolicyDescriptor,
    				implementation = {
        MsgUpdateGroupPolicyDecisionPolicyResponseMapper.convert(updateGroupPolicyDecisionPolicy(MsgUpdateGroupPolicyDecisionPolicyMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateGroupPolicyMetadataDescriptor,
    				implementation = {
        MsgUpdateGroupPolicyMetadataResponseMapper.convert(updateGroupPolicyMetadata(MsgUpdateGroupPolicyMetadataMapper.convert(it)))
        },
    			)
    		)
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
    				descriptor = withdrawProposalDescriptor,
    				implementation = {
        MsgWithdrawProposalResponseMapper.convert(withdrawProposal(MsgWithdrawProposalMapper.convert(it)))
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
    				descriptor = execDescriptor,
    				implementation = { MsgExecResponseMapper.convert(exec(MsgExecMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = leaveGroupDescriptor,
    				implementation = {
        MsgLeaveGroupResponseMapper.convert(leaveGroup(MsgLeaveGroupMapper.convert(it))) },
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

    public suspend fun createGroup(request: MsgCreateGroup, metadata: Metadata = Metadata()):
        MsgCreateGroupResponse = MsgCreateGroupResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, createGroupDescriptor,
    			MsgCreateGroupMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun updateGroupMembers(request: MsgUpdateGroupMembers, metadata: Metadata =
        Metadata()): MsgUpdateGroupMembersResponse = MsgUpdateGroupMembersResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, updateGroupMembersDescriptor,
    			MsgUpdateGroupMembersMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun updateGroupAdmin(request: MsgUpdateGroupAdmin, metadata: Metadata =
        Metadata()): MsgUpdateGroupAdminResponse = MsgUpdateGroupAdminResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, updateGroupAdminDescriptor,
    			MsgUpdateGroupAdminMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun updateGroupMetadata(request: MsgUpdateGroupMetadata, metadata: Metadata =
        Metadata()): MsgUpdateGroupMetadataResponse = MsgUpdateGroupMetadataResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, updateGroupMetadataDescriptor,
    			MsgUpdateGroupMetadataMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun createGroupPolicy(request: MsgCreateGroupPolicy, metadata: Metadata =
        Metadata()): MsgCreateGroupPolicyResponse = MsgCreateGroupPolicyResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, createGroupPolicyDescriptor,
    			MsgCreateGroupPolicyMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun createGroupWithPolicy(request: MsgCreateGroupWithPolicy, metadata: Metadata =
        Metadata()): MsgCreateGroupWithPolicyResponse =
        MsgCreateGroupWithPolicyResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, createGroupWithPolicyDescriptor,
    			MsgCreateGroupWithPolicyMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun updateGroupPolicyAdmin(request: MsgUpdateGroupPolicyAdmin, metadata: Metadata
        = Metadata()): MsgUpdateGroupPolicyAdminResponse =
        MsgUpdateGroupPolicyAdminResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, updateGroupPolicyAdminDescriptor,
    			MsgUpdateGroupPolicyAdminMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun updateGroupPolicyDecisionPolicy(request: MsgUpdateGroupPolicyDecisionPolicy,
        metadata: Metadata = Metadata()): MsgUpdateGroupPolicyDecisionPolicyResponse =
        MsgUpdateGroupPolicyDecisionPolicyResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, updateGroupPolicyDecisionPolicyDescriptor,
    			MsgUpdateGroupPolicyDecisionPolicyMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun updateGroupPolicyMetadata(request: MsgUpdateGroupPolicyMetadata,
        metadata: Metadata = Metadata()): MsgUpdateGroupPolicyMetadataResponse =
        MsgUpdateGroupPolicyMetadataResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, updateGroupPolicyMetadataDescriptor,
    			MsgUpdateGroupPolicyMetadataMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun submitProposal(request: MsgSubmitProposal, metadata: Metadata = Metadata()):
        MsgSubmitProposalResponse = MsgSubmitProposalResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, submitProposalDescriptor,
    			MsgSubmitProposalMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun withdrawProposal(request: MsgWithdrawProposal, metadata: Metadata =
        Metadata()): MsgWithdrawProposalResponse = MsgWithdrawProposalResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, withdrawProposalDescriptor,
    			MsgWithdrawProposalMapper.convert(request),
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

    public suspend fun exec(request: MsgExec, metadata: Metadata = Metadata()): MsgExecResponse =
        MsgExecResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, execDescriptor,
    			MsgExecMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun leaveGroup(request: MsgLeaveGroup, metadata: Metadata = Metadata()):
        MsgLeaveGroupResponse = MsgLeaveGroupResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, leaveGroupDescriptor,
    			MsgLeaveGroupMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
