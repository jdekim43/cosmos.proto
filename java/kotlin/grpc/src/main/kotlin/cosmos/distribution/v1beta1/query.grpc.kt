// Transform from cosmos/distribution/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.distribution.v1beta1

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

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val validatorDistributionInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorDistributionInfoRequest, QueryOuterClass.QueryValidatorDistributionInfoResponse>
      = QueryGrpc.getValidatorDistributionInfoMethod()!!

  private val validatorOutstandingRewardsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorOutstandingRewardsRequest, QueryOuterClass.QueryValidatorOutstandingRewardsResponse>
      = QueryGrpc.getValidatorOutstandingRewardsMethod()!!

  private val validatorCommissionDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorCommissionRequest, QueryOuterClass.QueryValidatorCommissionResponse>
      = QueryGrpc.getValidatorCommissionMethod()!!

  private val validatorSlashesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValidatorSlashesRequest, QueryOuterClass.QueryValidatorSlashesResponse>
      = QueryGrpc.getValidatorSlashesMethod()!!

  private val delegationRewardsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegationRewardsRequest, QueryOuterClass.QueryDelegationRewardsResponse>
      = QueryGrpc.getDelegationRewardsMethod()!!

  private val delegationTotalRewardsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegationTotalRewardsRequest, QueryOuterClass.QueryDelegationTotalRewardsResponse>
      = QueryGrpc.getDelegationTotalRewardsMethod()!!

  private val delegatorValidatorsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegatorValidatorsRequest, QueryOuterClass.QueryDelegatorValidatorsResponse>
      = QueryGrpc.getDelegatorValidatorsMethod()!!

  private val delegatorWithdrawAddressDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegatorWithdrawAddressRequest, QueryOuterClass.QueryDelegatorWithdrawAddressResponse>
      = QueryGrpc.getDelegatorWithdrawAddressMethod()!!

  private val communityPoolDescriptor:
      MethodDescriptor<QueryOuterClass.QueryCommunityPoolRequest, QueryOuterClass.QueryCommunityPoolResponse>
      = QueryGrpc.getCommunityPoolMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun params(request: QueryParamsRequest): QueryParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.Params is unimplemented"))

    public open suspend
        fun validatorDistributionInfo(request: QueryValidatorDistributionInfoRequest):
        QueryValidatorDistributionInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.ValidatorDistributionInfo is unimplemented"))

    public open suspend
        fun validatorOutstandingRewards(request: QueryValidatorOutstandingRewardsRequest):
        QueryValidatorOutstandingRewardsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.ValidatorOutstandingRewards is unimplemented"))

    public open suspend fun validatorCommission(request: QueryValidatorCommissionRequest):
        QueryValidatorCommissionResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.ValidatorCommission is unimplemented"))

    public open suspend fun validatorSlashes(request: QueryValidatorSlashesRequest):
        QueryValidatorSlashesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.ValidatorSlashes is unimplemented"))

    public open suspend fun delegationRewards(request: QueryDelegationRewardsRequest):
        QueryDelegationRewardsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.DelegationRewards is unimplemented"))

    public open suspend fun delegationTotalRewards(request: QueryDelegationTotalRewardsRequest):
        QueryDelegationTotalRewardsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.DelegationTotalRewards is unimplemented"))

    public open suspend fun delegatorValidators(request: QueryDelegatorValidatorsRequest):
        QueryDelegatorValidatorsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.DelegatorValidators is unimplemented"))

    public open suspend fun delegatorWithdrawAddress(request: QueryDelegatorWithdrawAddressRequest):
        QueryDelegatorWithdrawAddressResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.DelegatorWithdrawAddress is unimplemented"))

    public open suspend fun communityPool(request: QueryCommunityPoolRequest):
        QueryCommunityPoolResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Query.CommunityPool is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
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
    				descriptor = validatorDistributionInfoDescriptor,
    				implementation = {
        QueryValidatorDistributionInfoResponseMapper.convert(validatorDistributionInfo(QueryValidatorDistributionInfoRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorOutstandingRewardsDescriptor,
    				implementation = {
        QueryValidatorOutstandingRewardsResponseMapper.convert(validatorOutstandingRewards(QueryValidatorOutstandingRewardsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorCommissionDescriptor,
    				implementation = {
        QueryValidatorCommissionResponseMapper.convert(validatorCommission(QueryValidatorCommissionRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = validatorSlashesDescriptor,
    				implementation = {
        QueryValidatorSlashesResponseMapper.convert(validatorSlashes(QueryValidatorSlashesRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegationRewardsDescriptor,
    				implementation = {
        QueryDelegationRewardsResponseMapper.convert(delegationRewards(QueryDelegationRewardsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegationTotalRewardsDescriptor,
    				implementation = {
        QueryDelegationTotalRewardsResponseMapper.convert(delegationTotalRewards(QueryDelegationTotalRewardsRequestMapper.convert(it)))
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
    				descriptor = delegatorWithdrawAddressDescriptor,
    				implementation = {
        QueryDelegatorWithdrawAddressResponseMapper.convert(delegatorWithdrawAddress(QueryDelegatorWithdrawAddressRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = communityPoolDescriptor,
    				implementation = {
        QueryCommunityPoolResponseMapper.convert(communityPool(QueryCommunityPoolRequestMapper.convert(it)))
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

    public suspend fun params(request: QueryParamsRequest, metadata: Metadata = Metadata()):
        QueryParamsResponse = QueryParamsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, paramsDescriptor,
    			QueryParamsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun validatorDistributionInfo(request: QueryValidatorDistributionInfoRequest,
        metadata: Metadata = Metadata()): QueryValidatorDistributionInfoResponse =
        QueryValidatorDistributionInfoResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, validatorDistributionInfoDescriptor,
    			QueryValidatorDistributionInfoRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun validatorOutstandingRewards(request: QueryValidatorOutstandingRewardsRequest,
        metadata: Metadata = Metadata()): QueryValidatorOutstandingRewardsResponse =
        QueryValidatorOutstandingRewardsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, validatorOutstandingRewardsDescriptor,
    			QueryValidatorOutstandingRewardsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun validatorCommission(request: QueryValidatorCommissionRequest,
        metadata: Metadata = Metadata()): QueryValidatorCommissionResponse =
        QueryValidatorCommissionResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, validatorCommissionDescriptor,
    			QueryValidatorCommissionRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun validatorSlashes(request: QueryValidatorSlashesRequest, metadata: Metadata =
        Metadata()): QueryValidatorSlashesResponse = QueryValidatorSlashesResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, validatorSlashesDescriptor,
    			QueryValidatorSlashesRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun delegationRewards(request: QueryDelegationRewardsRequest, metadata: Metadata
        = Metadata()): QueryDelegationRewardsResponse =
        QueryDelegationRewardsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, delegationRewardsDescriptor,
    			QueryDelegationRewardsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun delegationTotalRewards(request: QueryDelegationTotalRewardsRequest,
        metadata: Metadata = Metadata()): QueryDelegationTotalRewardsResponse =
        QueryDelegationTotalRewardsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, delegationTotalRewardsDescriptor,
    			QueryDelegationTotalRewardsRequestMapper.convert(request),
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

    public suspend fun delegatorWithdrawAddress(request: QueryDelegatorWithdrawAddressRequest,
        metadata: Metadata = Metadata()): QueryDelegatorWithdrawAddressResponse =
        QueryDelegatorWithdrawAddressResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, delegatorWithdrawAddressDescriptor,
    			QueryDelegatorWithdrawAddressRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun communityPool(request: QueryCommunityPoolRequest, metadata: Metadata =
        Metadata()): QueryCommunityPoolResponse = QueryCommunityPoolResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, communityPoolDescriptor,
    			QueryCommunityPoolRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
