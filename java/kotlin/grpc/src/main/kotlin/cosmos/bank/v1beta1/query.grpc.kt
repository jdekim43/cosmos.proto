// Transform from cosmos/bank/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.bank.v1beta1

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

  private val balanceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBalanceRequest, QueryOuterClass.QueryBalanceResponse> =
      QueryGrpc.getBalanceMethod()!!

  private val allBalancesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllBalancesRequest, QueryOuterClass.QueryAllBalancesResponse>
      = QueryGrpc.getAllBalancesMethod()!!

  private val spendableBalancesDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySpendableBalancesRequest, QueryOuterClass.QuerySpendableBalancesResponse>
      = QueryGrpc.getSpendableBalancesMethod()!!

  private val spendableBalanceByDenomDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySpendableBalanceByDenomRequest, QueryOuterClass.QuerySpendableBalanceByDenomResponse>
      = QueryGrpc.getSpendableBalanceByDenomMethod()!!

  private val totalSupplyDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTotalSupplyRequest, QueryOuterClass.QueryTotalSupplyResponse>
      = QueryGrpc.getTotalSupplyMethod()!!

  private val supplyOfDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySupplyOfRequest, QueryOuterClass.QuerySupplyOfResponse>
      = QueryGrpc.getSupplyOfMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val denomMetadataDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDenomMetadataRequest, QueryOuterClass.QueryDenomMetadataResponse>
      = QueryGrpc.getDenomMetadataMethod()!!

  private val denomsMetadataDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDenomsMetadataRequest, QueryOuterClass.QueryDenomsMetadataResponse>
      = QueryGrpc.getDenomsMetadataMethod()!!

  private val denomOwnersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDenomOwnersRequest, QueryOuterClass.QueryDenomOwnersResponse>
      = QueryGrpc.getDenomOwnersMethod()!!

  private val sendEnabledDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySendEnabledRequest, QueryOuterClass.QuerySendEnabledResponse>
      = QueryGrpc.getSendEnabledMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun balance(request: QueryBalanceRequest): QueryBalanceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.Balance is unimplemented"))

    public open suspend fun allBalances(request: QueryAllBalancesRequest): QueryAllBalancesResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.AllBalances is unimplemented"))

    public open suspend fun spendableBalances(request: QuerySpendableBalancesRequest):
        QuerySpendableBalancesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.SpendableBalances is unimplemented"))

    public open suspend fun spendableBalanceByDenom(request: QuerySpendableBalanceByDenomRequest):
        QuerySpendableBalanceByDenomResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.SpendableBalanceByDenom is unimplemented"))

    public open suspend fun totalSupply(request: QueryTotalSupplyRequest): QueryTotalSupplyResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.TotalSupply is unimplemented"))

    public open suspend fun supplyOf(request: QuerySupplyOfRequest): QuerySupplyOfResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.SupplyOf is unimplemented"))

    public open suspend fun params(request: QueryParamsRequest): QueryParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.Params is unimplemented"))

    public open suspend fun denomMetadata(request: QueryDenomMetadataRequest):
        QueryDenomMetadataResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.DenomMetadata is unimplemented"))

    public open suspend fun denomsMetadata(request: QueryDenomsMetadataRequest):
        QueryDenomsMetadataResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.DenomsMetadata is unimplemented"))

    public open suspend fun denomOwners(request: QueryDenomOwnersRequest): QueryDenomOwnersResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.DenomOwners is unimplemented"))

    public open suspend fun sendEnabled(request: QuerySendEnabledRequest): QuerySendEnabledResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.SendEnabled is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = balanceDescriptor,
    				implementation = {
        QueryBalanceResponseMapper.convert(balance(QueryBalanceRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allBalancesDescriptor,
    				implementation = {
        QueryAllBalancesResponseMapper.convert(allBalances(QueryAllBalancesRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = spendableBalancesDescriptor,
    				implementation = {
        QuerySpendableBalancesResponseMapper.convert(spendableBalances(QuerySpendableBalancesRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = spendableBalanceByDenomDescriptor,
    				implementation = {
        QuerySpendableBalanceByDenomResponseMapper.convert(spendableBalanceByDenom(QuerySpendableBalanceByDenomRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = totalSupplyDescriptor,
    				implementation = {
        QueryTotalSupplyResponseMapper.convert(totalSupply(QueryTotalSupplyRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = supplyOfDescriptor,
    				implementation = {
        QuerySupplyOfResponseMapper.convert(supplyOf(QuerySupplyOfRequestMapper.convert(it))) },
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
    				descriptor = denomMetadataDescriptor,
    				implementation = {
        QueryDenomMetadataResponseMapper.convert(denomMetadata(QueryDenomMetadataRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = denomsMetadataDescriptor,
    				implementation = {
        QueryDenomsMetadataResponseMapper.convert(denomsMetadata(QueryDenomsMetadataRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = denomOwnersDescriptor,
    				implementation = {
        QueryDenomOwnersResponseMapper.convert(denomOwners(QueryDenomOwnersRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = sendEnabledDescriptor,
    				implementation = {
        QuerySendEnabledResponseMapper.convert(sendEnabled(QuerySendEnabledRequestMapper.convert(it)))
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

    public suspend fun balance(request: QueryBalanceRequest, metadata: Metadata = Metadata()):
        QueryBalanceResponse = QueryBalanceResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, balanceDescriptor,
    			QueryBalanceRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun allBalances(request: QueryAllBalancesRequest, metadata: Metadata =
        Metadata()): QueryAllBalancesResponse = QueryAllBalancesResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, allBalancesDescriptor,
    			QueryAllBalancesRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun spendableBalances(request: QuerySpendableBalancesRequest, metadata: Metadata
        = Metadata()): QuerySpendableBalancesResponse =
        QuerySpendableBalancesResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, spendableBalancesDescriptor,
    			QuerySpendableBalancesRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun spendableBalanceByDenom(request: QuerySpendableBalanceByDenomRequest,
        metadata: Metadata = Metadata()): QuerySpendableBalanceByDenomResponse =
        QuerySpendableBalanceByDenomResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, spendableBalanceByDenomDescriptor,
    			QuerySpendableBalanceByDenomRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun totalSupply(request: QueryTotalSupplyRequest, metadata: Metadata =
        Metadata()): QueryTotalSupplyResponse = QueryTotalSupplyResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, totalSupplyDescriptor,
    			QueryTotalSupplyRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun supplyOf(request: QuerySupplyOfRequest, metadata: Metadata = Metadata()):
        QuerySupplyOfResponse = QuerySupplyOfResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, supplyOfDescriptor,
    			QuerySupplyOfRequestMapper.convert(request),
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

    public suspend fun denomMetadata(request: QueryDenomMetadataRequest, metadata: Metadata =
        Metadata()): QueryDenomMetadataResponse = QueryDenomMetadataResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, denomMetadataDescriptor,
    			QueryDenomMetadataRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun denomsMetadata(request: QueryDenomsMetadataRequest, metadata: Metadata =
        Metadata()): QueryDenomsMetadataResponse = QueryDenomsMetadataResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, denomsMetadataDescriptor,
    			QueryDenomsMetadataRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun denomOwners(request: QueryDenomOwnersRequest, metadata: Metadata =
        Metadata()): QueryDenomOwnersResponse = QueryDenomOwnersResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, denomOwnersDescriptor,
    			QueryDenomOwnersRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun sendEnabled(request: QuerySendEnabledRequest, metadata: Metadata =
        Metadata()): QuerySendEnabledResponse = QuerySendEnabledResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, sendEnabledDescriptor,
    			QuerySendEnabledRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
