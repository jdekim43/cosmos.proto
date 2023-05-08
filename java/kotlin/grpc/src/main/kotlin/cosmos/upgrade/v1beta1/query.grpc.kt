// Transform from cosmos/upgrade/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.upgrade.v1beta1

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

  private val currentPlanDescriptor:
      MethodDescriptor<QueryOuterClass.QueryCurrentPlanRequest, QueryOuterClass.QueryCurrentPlanResponse>
      = QueryGrpc.getCurrentPlanMethod()!!

  private val appliedPlanDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAppliedPlanRequest, QueryOuterClass.QueryAppliedPlanResponse>
      = QueryGrpc.getAppliedPlanMethod()!!

  private val upgradedConsensusStateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryUpgradedConsensusStateRequest, QueryOuterClass.QueryUpgradedConsensusStateResponse>
      = QueryGrpc.getUpgradedConsensusStateMethod()!!

  private val moduleVersionsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleVersionsRequest, QueryOuterClass.QueryModuleVersionsResponse>
      = QueryGrpc.getModuleVersionsMethod()!!

  private val authorityDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAuthorityRequest, QueryOuterClass.QueryAuthorityResponse>
      = QueryGrpc.getAuthorityMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun currentPlan(request: QueryCurrentPlanRequest): QueryCurrentPlanResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Query.CurrentPlan is unimplemented"))

    public open suspend fun appliedPlan(request: QueryAppliedPlanRequest): QueryAppliedPlanResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Query.AppliedPlan is unimplemented"))

    public open suspend fun upgradedConsensusState(request: QueryUpgradedConsensusStateRequest):
        QueryUpgradedConsensusStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Query.UpgradedConsensusState is unimplemented"))

    public open suspend fun moduleVersions(request: QueryModuleVersionsRequest):
        QueryModuleVersionsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Query.ModuleVersions is unimplemented"))

    public open suspend fun authority(request: QueryAuthorityRequest): QueryAuthorityResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Query.Authority is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = currentPlanDescriptor,
    				implementation = {
        QueryCurrentPlanResponseMapper.convert(currentPlan(QueryCurrentPlanRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = appliedPlanDescriptor,
    				implementation = {
        QueryAppliedPlanResponseMapper.convert(appliedPlan(QueryAppliedPlanRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = upgradedConsensusStateDescriptor,
    				implementation = {
        QueryUpgradedConsensusStateResponseMapper.convert(upgradedConsensusState(QueryUpgradedConsensusStateRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = moduleVersionsDescriptor,
    				implementation = {
        QueryModuleVersionsResponseMapper.convert(moduleVersions(QueryModuleVersionsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = authorityDescriptor,
    				implementation = {
        QueryAuthorityResponseMapper.convert(authority(QueryAuthorityRequestMapper.convert(it))) },
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

    public suspend fun currentPlan(request: QueryCurrentPlanRequest, metadata: Metadata =
        Metadata()): QueryCurrentPlanResponse = QueryCurrentPlanResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, currentPlanDescriptor,
    			QueryCurrentPlanRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun appliedPlan(request: QueryAppliedPlanRequest, metadata: Metadata =
        Metadata()): QueryAppliedPlanResponse = QueryAppliedPlanResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, appliedPlanDescriptor,
    			QueryAppliedPlanRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun upgradedConsensusState(request: QueryUpgradedConsensusStateRequest,
        metadata: Metadata = Metadata()): QueryUpgradedConsensusStateResponse =
        QueryUpgradedConsensusStateResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, upgradedConsensusStateDescriptor,
    			QueryUpgradedConsensusStateRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun moduleVersions(request: QueryModuleVersionsRequest, metadata: Metadata =
        Metadata()): QueryModuleVersionsResponse = QueryModuleVersionsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, moduleVersionsDescriptor,
    			QueryModuleVersionsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun authority(request: QueryAuthorityRequest, metadata: Metadata = Metadata()):
        QueryAuthorityResponse = QueryAuthorityResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, authorityDescriptor,
    			QueryAuthorityRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
