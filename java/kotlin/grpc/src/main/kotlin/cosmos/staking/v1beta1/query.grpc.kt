// Transform from cosmos/staking/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.staking.v1beta1

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

  private val validatorsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorsRequest, QueryOuterClass.QueryValidatorsResponse>
      = QueryGrpc.getValidatorsMethod()!!

  private val validatorDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorRequest, QueryOuterClass.QueryValidatorResponse>
      = QueryGrpc.getValidatorMethod()!!

  private val validatorDelegationsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorDelegationsRequest, QueryOuterClass.QueryValidatorDelegationsResponse>
      = QueryGrpc.getValidatorDelegationsMethod()!!

  private val validatorUnbondingDelegationsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorUnbondingDelegationsRequest, QueryOuterClass.QueryValidatorUnbondingDelegationsResponse>
      = QueryGrpc.getValidatorUnbondingDelegationsMethod()!!

  private val delegationDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegationRequest, QueryOuterClass.QueryDelegationResponse>
      = QueryGrpc.getDelegationMethod()!!

  private val unbondingDelegationDescriptor:
      MethodDescriptor<QueryOuterClass.QueryUnbondingDelegationRequest, QueryOuterClass.QueryUnbondingDelegationResponse>
      = QueryGrpc.getUnbondingDelegationMethod()!!

  private val delegatorDelegationsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegatorDelegationsRequest, QueryOuterClass.QueryDelegatorDelegationsResponse>
      = QueryGrpc.getDelegatorDelegationsMethod()!!

  private val delegatorUnbondingDelegationsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegatorUnbondingDelegationsRequest, QueryOuterClass.QueryDelegatorUnbondingDelegationsResponse>
      = QueryGrpc.getDelegatorUnbondingDelegationsMethod()!!

  private val redelegationsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryRedelegationsRequest, QueryOuterClass.QueryRedelegationsResponse>
      = QueryGrpc.getRedelegationsMethod()!!

  private val delegatorValidatorsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegatorValidatorsRequest, QueryOuterClass.QueryDelegatorValidatorsResponse>
      = QueryGrpc.getDelegatorValidatorsMethod()!!

  private val delegatorValidatorDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegatorValidatorRequest, QueryOuterClass.QueryDelegatorValidatorResponse>
      = QueryGrpc.getDelegatorValidatorMethod()!!

  private val historicalInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryHistoricalInfoRequest, QueryOuterClass.QueryHistoricalInfoResponse>
      = QueryGrpc.getHistoricalInfoMethod()!!

  private val poolDescriptor:
      MethodDescriptor<QueryOuterClass.QueryPoolRequest, QueryOuterClass.QueryPoolResponse> =
      QueryGrpc.getPoolMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun validators(request: QueryValidatorsRequest): QueryValidatorsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.Validators is unimplemented"))

    public open suspend fun validator(request: QueryValidatorRequest): QueryValidatorResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.Validator is unimplemented"))

    public open suspend fun validatorDelegations(request: QueryValidatorDelegationsRequest):
        QueryValidatorDelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.ValidatorDelegations is unimplemented"))

    public open suspend
        fun validatorUnbondingDelegations(request: QueryValidatorUnbondingDelegationsRequest):
        QueryValidatorUnbondingDelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.ValidatorUnbondingDelegations is unimplemented"))

    public open suspend fun delegation(request: QueryDelegationRequest): QueryDelegationResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.Delegation is unimplemented"))

    public open suspend fun unbondingDelegation(request: QueryUnbondingDelegationRequest):
        QueryUnbondingDelegationResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.UnbondingDelegation is unimplemented"))

    public open suspend fun delegatorDelegations(request: QueryDelegatorDelegationsRequest):
        QueryDelegatorDelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.DelegatorDelegations is unimplemented"))

    public open suspend
        fun delegatorUnbondingDelegations(request: QueryDelegatorUnbondingDelegationsRequest):
        QueryDelegatorUnbondingDelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.DelegatorUnbondingDelegations is unimplemented"))

    public open suspend fun redelegations(request: QueryRedelegationsRequest):
        QueryRedelegationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.Redelegations is unimplemented"))

    public open suspend fun delegatorValidators(request: QueryDelegatorValidatorsRequest):
        QueryDelegatorValidatorsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.DelegatorValidators is unimplemented"))

    public open suspend fun delegatorValidator(request: QueryDelegatorValidatorRequest):
        QueryDelegatorValidatorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.DelegatorValidator is unimplemented"))

    public open suspend fun historicalInfo(request: QueryHistoricalInfoRequest):
        QueryHistoricalInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.HistoricalInfo is unimplemented"))

    public open suspend fun pool(request: QueryPoolRequest): QueryPoolResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.Pool is unimplemented"))

    public open suspend fun params(request: QueryParamsRequest): QueryParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Query.Params is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorsDescriptor,
    				implementation = {
        QueryValidatorsResponseMapper.convert(validators(QueryValidatorsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorDescriptor,
    				implementation = {
        QueryValidatorResponseMapper.convert(validator(QueryValidatorRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorDelegationsDescriptor,
    				implementation = {
        QueryValidatorDelegationsResponseMapper.convert(validatorDelegations(QueryValidatorDelegationsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorUnbondingDelegationsDescriptor,
    				implementation = {
        QueryValidatorUnbondingDelegationsResponseMapper.convert(validatorUnbondingDelegations(QueryValidatorUnbondingDelegationsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegationDescriptor,
    				implementation = {
        QueryDelegationResponseMapper.convert(delegation(QueryDelegationRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = unbondingDelegationDescriptor,
    				implementation = {
        QueryUnbondingDelegationResponseMapper.convert(unbondingDelegation(QueryUnbondingDelegationRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegatorDelegationsDescriptor,
    				implementation = {
        QueryDelegatorDelegationsResponseMapper.convert(delegatorDelegations(QueryDelegatorDelegationsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegatorUnbondingDelegationsDescriptor,
    				implementation = {
        QueryDelegatorUnbondingDelegationsResponseMapper.convert(delegatorUnbondingDelegations(QueryDelegatorUnbondingDelegationsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = redelegationsDescriptor,
    				implementation = {
        QueryRedelegationsResponseMapper.convert(redelegations(QueryRedelegationsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegatorValidatorsDescriptor,
    				implementation = {
        QueryDelegatorValidatorsResponseMapper.convert(delegatorValidators(QueryDelegatorValidatorsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegatorValidatorDescriptor,
    				implementation = {
        QueryDelegatorValidatorResponseMapper.convert(delegatorValidator(QueryDelegatorValidatorRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = historicalInfoDescriptor,
    				implementation = {
        QueryHistoricalInfoResponseMapper.convert(historicalInfo(QueryHistoricalInfoRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = poolDescriptor,
    				implementation = { QueryPoolResponseMapper.convert(pool(QueryPoolRequestMapper.convert(it)))
        },
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
    		.build()
  }

  public class Client(
    channel: Channel,
    callOptions: CallOptions = CallOptions.DEFAULT,
  ) : AbstractCoroutineStub<Client>(channel = channel, callOptions = callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions): Client = Client(channel,
        callOptions)

    public suspend fun validators(request: QueryValidatorsRequest, metadata: Metadata = Metadata()):
        QueryValidatorsResponse = QueryValidatorsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, validatorsDescriptor,
    			QueryValidatorsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun validator(request: QueryValidatorRequest, metadata: Metadata = Metadata()):
        QueryValidatorResponse = QueryValidatorResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, validatorDescriptor,
    			QueryValidatorRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun validatorDelegations(request: QueryValidatorDelegationsRequest,
        metadata: Metadata = Metadata()): QueryValidatorDelegationsResponse =
        QueryValidatorDelegationsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, validatorDelegationsDescriptor,
    			QueryValidatorDelegationsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend
        fun validatorUnbondingDelegations(request: QueryValidatorUnbondingDelegationsRequest,
        metadata: Metadata = Metadata()): QueryValidatorUnbondingDelegationsResponse =
        QueryValidatorUnbondingDelegationsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, validatorUnbondingDelegationsDescriptor,
    			QueryValidatorUnbondingDelegationsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun delegation(request: QueryDelegationRequest, metadata: Metadata = Metadata()):
        QueryDelegationResponse = QueryDelegationResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, delegationDescriptor,
    			QueryDelegationRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun unbondingDelegation(request: QueryUnbondingDelegationRequest,
        metadata: Metadata = Metadata()): QueryUnbondingDelegationResponse =
        QueryUnbondingDelegationResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, unbondingDelegationDescriptor,
    			QueryUnbondingDelegationRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun delegatorDelegations(request: QueryDelegatorDelegationsRequest,
        metadata: Metadata = Metadata()): QueryDelegatorDelegationsResponse =
        QueryDelegatorDelegationsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, delegatorDelegationsDescriptor,
    			QueryDelegatorDelegationsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend
        fun delegatorUnbondingDelegations(request: QueryDelegatorUnbondingDelegationsRequest,
        metadata: Metadata = Metadata()): QueryDelegatorUnbondingDelegationsResponse =
        QueryDelegatorUnbondingDelegationsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, delegatorUnbondingDelegationsDescriptor,
    			QueryDelegatorUnbondingDelegationsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun redelegations(request: QueryRedelegationsRequest, metadata: Metadata =
        Metadata()): QueryRedelegationsResponse = QueryRedelegationsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, redelegationsDescriptor,
    			QueryRedelegationsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun delegatorValidators(request: QueryDelegatorValidatorsRequest,
        metadata: Metadata = Metadata()): QueryDelegatorValidatorsResponse =
        QueryDelegatorValidatorsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, delegatorValidatorsDescriptor,
    			QueryDelegatorValidatorsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun delegatorValidator(request: QueryDelegatorValidatorRequest,
        metadata: Metadata = Metadata()): QueryDelegatorValidatorResponse =
        QueryDelegatorValidatorResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, delegatorValidatorDescriptor,
    			QueryDelegatorValidatorRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun historicalInfo(request: QueryHistoricalInfoRequest, metadata: Metadata =
        Metadata()): QueryHistoricalInfoResponse = QueryHistoricalInfoResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, historicalInfoDescriptor,
    			QueryHistoricalInfoRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun pool(request: QueryPoolRequest, metadata: Metadata = Metadata()):
        QueryPoolResponse = QueryPoolResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, poolDescriptor,
    			QueryPoolRequestMapper.convert(request),
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
  }
}
