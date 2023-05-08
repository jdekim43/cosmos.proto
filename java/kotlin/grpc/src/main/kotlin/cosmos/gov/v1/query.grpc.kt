// Transform from cosmos/gov/v1/query.proto
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

public object QueryService {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val proposalDescriptor:
      MethodDescriptor<QueryOuterClass.QueryProposalRequest, QueryOuterClass.QueryProposalResponse>
      = QueryGrpc.getProposalMethod()!!

  private val proposalsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryProposalsRequest, QueryOuterClass.QueryProposalsResponse>
      = QueryGrpc.getProposalsMethod()!!

  private val voteDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVoteRequest, QueryOuterClass.QueryVoteResponse> =
      QueryGrpc.getVoteMethod()!!

  private val votesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVotesRequest, QueryOuterClass.QueryVotesResponse> =
      QueryGrpc.getVotesMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val depositDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDepositRequest, QueryOuterClass.QueryDepositResponse> =
      QueryGrpc.getDepositMethod()!!

  private val depositsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDepositsRequest, QueryOuterClass.QueryDepositsResponse>
      = QueryGrpc.getDepositsMethod()!!

  private val tallyResultDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTallyResultRequest, QueryOuterClass.QueryTallyResultResponse>
      = QueryGrpc.getTallyResultMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun proposal(request: QueryProposalRequest): QueryProposalResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Proposal is unimplemented"))

    public open suspend fun proposals(request: QueryProposalsRequest): QueryProposalsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Proposals is unimplemented"))

    public open suspend fun vote(request: QueryVoteRequest): QueryVoteResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Vote is unimplemented"))

    public open suspend fun votes(request: QueryVotesRequest): QueryVotesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Votes is unimplemented"))

    public open suspend fun params(request: QueryParamsRequest): QueryParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Params is unimplemented"))

    public open suspend fun deposit(request: QueryDepositRequest): QueryDepositResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Deposit is unimplemented"))

    public open suspend fun deposits(request: QueryDepositsRequest): QueryDepositsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Deposits is unimplemented"))

    public open suspend fun tallyResult(request: QueryTallyResultRequest): QueryTallyResultResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.TallyResult is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
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
    				descriptor = proposalsDescriptor,
    				implementation = {
        QueryProposalsResponseMapper.convert(proposals(QueryProposalsRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = voteDescriptor,
    				implementation = { QueryVoteResponseMapper.convert(vote(QueryVoteRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = votesDescriptor,
    				implementation = {
        QueryVotesResponseMapper.convert(votes(QueryVotesRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = paramsDescriptor,
    				implementation = {
        QueryParamsResponseMapper.convert(params(QueryParamsRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = depositDescriptor,
    				implementation = {
        QueryDepositResponseMapper.convert(deposit(QueryDepositRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = depositsDescriptor,
    				implementation = {
        QueryDepositsResponseMapper.convert(deposits(QueryDepositsRequestMapper.convert(it))) },
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
    		.build()
  }

  public class Client(
    channel: Channel,
    callOptions: CallOptions = CallOptions.DEFAULT,
  ) : AbstractCoroutineStub<Client>(channel = channel, callOptions = callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions): Client = Client(channel,
        callOptions)

    public suspend fun proposal(request: QueryProposalRequest, metadata: Metadata = Metadata()):
        QueryProposalResponse = QueryProposalResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, proposalDescriptor,
    			QueryProposalRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun proposals(request: QueryProposalsRequest, metadata: Metadata = Metadata()):
        QueryProposalsResponse = QueryProposalsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, proposalsDescriptor,
    			QueryProposalsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun vote(request: QueryVoteRequest, metadata: Metadata = Metadata()):
        QueryVoteResponse = QueryVoteResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, voteDescriptor,
    			QueryVoteRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun votes(request: QueryVotesRequest, metadata: Metadata = Metadata()):
        QueryVotesResponse = QueryVotesResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, votesDescriptor,
    			QueryVotesRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun params(request: QueryParamsRequest, metadata: Metadata = Metadata()):
        QueryParamsResponse = QueryParamsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, paramsDescriptor,
    			QueryParamsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun deposit(request: QueryDepositRequest, metadata: Metadata = Metadata()):
        QueryDepositResponse = QueryDepositResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, depositDescriptor,
    			QueryDepositRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun deposits(request: QueryDepositsRequest, metadata: Metadata = Metadata()):
        QueryDepositsResponse = QueryDepositsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, depositsDescriptor,
    			QueryDepositsRequestMapper.convert(request),
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
  }
}
