// Transform from cosmos/group/v1/query.proto
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

public object QueryService {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val groupInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupInfoRequest, QueryOuterClass.QueryGroupInfoResponse>
      = QueryGrpc.getGroupInfoMethod()!!

  private val groupPolicyInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupPolicyInfoRequest, QueryOuterClass.QueryGroupPolicyInfoResponse>
      = QueryGrpc.getGroupPolicyInfoMethod()!!

  private val groupMembersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupMembersRequest, QueryOuterClass.QueryGroupMembersResponse>
      = QueryGrpc.getGroupMembersMethod()!!

  private val groupsByAdminDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupsByAdminRequest, QueryOuterClass.QueryGroupsByAdminResponse>
      = QueryGrpc.getGroupsByAdminMethod()!!

  private val groupPoliciesByGroupDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupPoliciesByGroupRequest, QueryOuterClass.QueryGroupPoliciesByGroupResponse>
      = QueryGrpc.getGroupPoliciesByGroupMethod()!!

  private val groupPoliciesByAdminDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupPoliciesByAdminRequest, QueryOuterClass.QueryGroupPoliciesByAdminResponse>
      = QueryGrpc.getGroupPoliciesByAdminMethod()!!

  private val proposalDescriptor:
      MethodDescriptor<QueryOuterClass.QueryProposalRequest, QueryOuterClass.QueryProposalResponse>
      = QueryGrpc.getProposalMethod()!!

  private val proposalsByGroupPolicyDescriptor:
      MethodDescriptor<QueryOuterClass.QueryProposalsByGroupPolicyRequest, QueryOuterClass.QueryProposalsByGroupPolicyResponse>
      = QueryGrpc.getProposalsByGroupPolicyMethod()!!

  private val voteByProposalVoterDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVoteByProposalVoterRequest, QueryOuterClass.QueryVoteByProposalVoterResponse>
      = QueryGrpc.getVoteByProposalVoterMethod()!!

  private val votesByProposalDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVotesByProposalRequest, QueryOuterClass.QueryVotesByProposalResponse>
      = QueryGrpc.getVotesByProposalMethod()!!

  private val votesByVoterDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVotesByVoterRequest, QueryOuterClass.QueryVotesByVoterResponse>
      = QueryGrpc.getVotesByVoterMethod()!!

  private val groupsByMemberDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupsByMemberRequest, QueryOuterClass.QueryGroupsByMemberResponse>
      = QueryGrpc.getGroupsByMemberMethod()!!

  private val tallyResultDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTallyResultRequest, QueryOuterClass.QueryTallyResultResponse>
      = QueryGrpc.getTallyResultMethod()!!

  private val groupsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupsRequest, QueryOuterClass.QueryGroupsResponse> =
      QueryGrpc.getGroupsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun groupInfo(request: QueryGroupInfoRequest): QueryGroupInfoResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupInfo is unimplemented"))

    public open suspend fun groupPolicyInfo(request: QueryGroupPolicyInfoRequest):
        QueryGroupPolicyInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupPolicyInfo is unimplemented"))

    public open suspend fun groupMembers(request: QueryGroupMembersRequest):
        QueryGroupMembersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupMembers is unimplemented"))

    public open suspend fun groupsByAdmin(request: QueryGroupsByAdminRequest):
        QueryGroupsByAdminResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupsByAdmin is unimplemented"))

    public open suspend fun groupPoliciesByGroup(request: QueryGroupPoliciesByGroupRequest):
        QueryGroupPoliciesByGroupResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupPoliciesByGroup is unimplemented"))

    public open suspend fun groupPoliciesByAdmin(request: QueryGroupPoliciesByAdminRequest):
        QueryGroupPoliciesByAdminResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupPoliciesByAdmin is unimplemented"))

    public open suspend fun proposal(request: QueryProposalRequest): QueryProposalResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.Proposal is unimplemented"))

    public open suspend fun proposalsByGroupPolicy(request: QueryProposalsByGroupPolicyRequest):
        QueryProposalsByGroupPolicyResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.ProposalsByGroupPolicy is unimplemented"))

    public open suspend fun voteByProposalVoter(request: QueryVoteByProposalVoterRequest):
        QueryVoteByProposalVoterResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.VoteByProposalVoter is unimplemented"))

    public open suspend fun votesByProposal(request: QueryVotesByProposalRequest):
        QueryVotesByProposalResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.VotesByProposal is unimplemented"))

    public open suspend fun votesByVoter(request: QueryVotesByVoterRequest):
        QueryVotesByVoterResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.VotesByVoter is unimplemented"))

    public open suspend fun groupsByMember(request: QueryGroupsByMemberRequest):
        QueryGroupsByMemberResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupsByMember is unimplemented"))

    public open suspend fun tallyResult(request: QueryTallyResultRequest): QueryTallyResultResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.TallyResult is unimplemented"))

    public open suspend fun groups(request: QueryGroupsRequest): QueryGroupsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.Groups is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupInfoDescriptor,
    				implementation = {
        QueryGroupInfoResponseMapper.convert(groupInfo(QueryGroupInfoRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupPolicyInfoDescriptor,
    				implementation = {
        QueryGroupPolicyInfoResponseMapper.convert(groupPolicyInfo(QueryGroupPolicyInfoRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupMembersDescriptor,
    				implementation = {
        QueryGroupMembersResponseMapper.convert(groupMembers(QueryGroupMembersRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupsByAdminDescriptor,
    				implementation = {
        QueryGroupsByAdminResponseMapper.convert(groupsByAdmin(QueryGroupsByAdminRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupPoliciesByGroupDescriptor,
    				implementation = {
        QueryGroupPoliciesByGroupResponseMapper.convert(groupPoliciesByGroup(QueryGroupPoliciesByGroupRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupPoliciesByAdminDescriptor,
    				implementation = {
        QueryGroupPoliciesByAdminResponseMapper.convert(groupPoliciesByAdmin(QueryGroupPoliciesByAdminRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = proposalDescriptor,
    				implementation = {
        QueryProposalResponseMapper.convert(proposal(QueryProposalRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = proposalsByGroupPolicyDescriptor,
    				implementation = {
        QueryProposalsByGroupPolicyResponseMapper.convert(proposalsByGroupPolicy(QueryProposalsByGroupPolicyRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = voteByProposalVoterDescriptor,
    				implementation = {
        QueryVoteByProposalVoterResponseMapper.convert(voteByProposalVoter(QueryVoteByProposalVoterRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = votesByProposalDescriptor,
    				implementation = {
        QueryVotesByProposalResponseMapper.convert(votesByProposal(QueryVotesByProposalRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = votesByVoterDescriptor,
    				implementation = {
        QueryVotesByVoterResponseMapper.convert(votesByVoter(QueryVotesByVoterRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupsByMemberDescriptor,
    				implementation = {
        QueryGroupsByMemberResponseMapper.convert(groupsByMember(QueryGroupsByMemberRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = tallyResultDescriptor,
    				implementation = {
        QueryTallyResultResponseMapper.convert(tallyResult(QueryTallyResultRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupsDescriptor,
    				implementation = {
        QueryGroupsResponseMapper.convert(groups(QueryGroupsRequestMapper.convert(it))) },
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

    public suspend fun groupInfo(request: QueryGroupInfoRequest, metadata: Metadata = Metadata()):
        QueryGroupInfoResponse = QueryGroupInfoResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, groupInfoDescriptor,
    			QueryGroupInfoRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun groupPolicyInfo(request: QueryGroupPolicyInfoRequest, metadata: Metadata =
        Metadata()): QueryGroupPolicyInfoResponse = QueryGroupPolicyInfoResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, groupPolicyInfoDescriptor,
    			QueryGroupPolicyInfoRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun groupMembers(request: QueryGroupMembersRequest, metadata: Metadata =
        Metadata()): QueryGroupMembersResponse = QueryGroupMembersResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, groupMembersDescriptor,
    			QueryGroupMembersRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun groupsByAdmin(request: QueryGroupsByAdminRequest, metadata: Metadata =
        Metadata()): QueryGroupsByAdminResponse = QueryGroupsByAdminResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, groupsByAdminDescriptor,
    			QueryGroupsByAdminRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun groupPoliciesByGroup(request: QueryGroupPoliciesByGroupRequest,
        metadata: Metadata = Metadata()): QueryGroupPoliciesByGroupResponse =
        QueryGroupPoliciesByGroupResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, groupPoliciesByGroupDescriptor,
    			QueryGroupPoliciesByGroupRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun groupPoliciesByAdmin(request: QueryGroupPoliciesByAdminRequest,
        metadata: Metadata = Metadata()): QueryGroupPoliciesByAdminResponse =
        QueryGroupPoliciesByAdminResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, groupPoliciesByAdminDescriptor,
    			QueryGroupPoliciesByAdminRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun proposal(request: QueryProposalRequest, metadata: Metadata = Metadata()):
        QueryProposalResponse = QueryProposalResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, proposalDescriptor,
    			QueryProposalRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun proposalsByGroupPolicy(request: QueryProposalsByGroupPolicyRequest,
        metadata: Metadata = Metadata()): QueryProposalsByGroupPolicyResponse =
        QueryProposalsByGroupPolicyResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, proposalsByGroupPolicyDescriptor,
    			QueryProposalsByGroupPolicyRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun voteByProposalVoter(request: QueryVoteByProposalVoterRequest,
        metadata: Metadata = Metadata()): QueryVoteByProposalVoterResponse =
        QueryVoteByProposalVoterResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, voteByProposalVoterDescriptor,
    			QueryVoteByProposalVoterRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun votesByProposal(request: QueryVotesByProposalRequest, metadata: Metadata =
        Metadata()): QueryVotesByProposalResponse = QueryVotesByProposalResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, votesByProposalDescriptor,
    			QueryVotesByProposalRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun votesByVoter(request: QueryVotesByVoterRequest, metadata: Metadata =
        Metadata()): QueryVotesByVoterResponse = QueryVotesByVoterResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, votesByVoterDescriptor,
    			QueryVotesByVoterRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun groupsByMember(request: QueryGroupsByMemberRequest, metadata: Metadata =
        Metadata()): QueryGroupsByMemberResponse = QueryGroupsByMemberResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, groupsByMemberDescriptor,
    			QueryGroupsByMemberRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun tallyResult(request: QueryTallyResultRequest, metadata: Metadata =
        Metadata()): QueryTallyResultResponse = QueryTallyResultResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, tallyResultDescriptor,
    			QueryTallyResultRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun groups(request: QueryGroupsRequest, metadata: Metadata = Metadata()):
        QueryGroupsResponse = QueryGroupsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, groupsDescriptor,
    			QueryGroupsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
