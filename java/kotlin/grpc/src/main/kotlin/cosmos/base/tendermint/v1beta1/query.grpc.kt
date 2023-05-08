// Transform from cosmos/base/tendermint/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.base.tendermint.v1beta1

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

public object ServiceService {
  private val descriptor: ServiceDescriptor = ServiceGrpc.getServiceDescriptor()!!

  private val getNodeInfoDescriptor:
      MethodDescriptor<Query.GetNodeInfoRequest, Query.GetNodeInfoResponse> =
      ServiceGrpc.getGetNodeInfoMethod()!!

  private val getSyncingDescriptor:
      MethodDescriptor<Query.GetSyncingRequest, Query.GetSyncingResponse> =
      ServiceGrpc.getGetSyncingMethod()!!

  private val getLatestBlockDescriptor:
      MethodDescriptor<Query.GetLatestBlockRequest, Query.GetLatestBlockResponse> =
      ServiceGrpc.getGetLatestBlockMethod()!!

  private val getBlockByHeightDescriptor:
      MethodDescriptor<Query.GetBlockByHeightRequest, Query.GetBlockByHeightResponse> =
      ServiceGrpc.getGetBlockByHeightMethod()!!

  private val getLatestValidatorSetDescriptor:
      MethodDescriptor<Query.GetLatestValidatorSetRequest, Query.GetLatestValidatorSetResponse> =
      ServiceGrpc.getGetLatestValidatorSetMethod()!!

  private val getValidatorSetByHeightDescriptor:
      MethodDescriptor<Query.GetValidatorSetByHeightRequest, Query.GetValidatorSetByHeightResponse>
      = ServiceGrpc.getGetValidatorSetByHeightMethod()!!

  private val aBCIQueryDescriptor: MethodDescriptor<Query.ABCIQueryRequest, Query.ABCIQueryResponse>
      = ServiceGrpc.getABCIQueryMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun getNodeInfo(request: GetNodeInfoRequest): GetNodeInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.GetNodeInfo is unimplemented"))

    public open suspend fun getSyncing(request: GetSyncingRequest): GetSyncingResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.GetSyncing is unimplemented"))

    public open suspend fun getLatestBlock(request: GetLatestBlockRequest): GetLatestBlockResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.GetLatestBlock is unimplemented"))

    public open suspend fun getBlockByHeight(request: GetBlockByHeightRequest):
        GetBlockByHeightResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.GetBlockByHeight is unimplemented"))

    public open suspend fun getLatestValidatorSet(request: GetLatestValidatorSetRequest):
        GetLatestValidatorSetResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.GetLatestValidatorSet is unimplemented"))

    public open suspend fun getValidatorSetByHeight(request: GetValidatorSetByHeightRequest):
        GetValidatorSetByHeightResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.GetValidatorSetByHeight is unimplemented"))

    public open suspend fun aBCIQuery(request: ABCIQueryRequest): ABCIQueryResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.tendermint.v1beta1.Service.ABCIQuery is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getNodeInfoDescriptor,
    				implementation = {
        GetNodeInfoResponseMapper.convert(getNodeInfo(GetNodeInfoRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getSyncingDescriptor,
    				implementation = {
        GetSyncingResponseMapper.convert(getSyncing(GetSyncingRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getLatestBlockDescriptor,
    				implementation = {
        GetLatestBlockResponseMapper.convert(getLatestBlock(GetLatestBlockRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getBlockByHeightDescriptor,
    				implementation = {
        GetBlockByHeightResponseMapper.convert(getBlockByHeight(GetBlockByHeightRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getLatestValidatorSetDescriptor,
    				implementation = {
        GetLatestValidatorSetResponseMapper.convert(getLatestValidatorSet(GetLatestValidatorSetRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getValidatorSetByHeightDescriptor,
    				implementation = {
        GetValidatorSetByHeightResponseMapper.convert(getValidatorSetByHeight(GetValidatorSetByHeightRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = aBCIQueryDescriptor,
    				implementation = {
        ABCIQueryResponseMapper.convert(aBCIQuery(ABCIQueryRequestMapper.convert(it))) },
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

    public suspend fun getNodeInfo(request: GetNodeInfoRequest, metadata: Metadata = Metadata()):
        GetNodeInfoResponse = GetNodeInfoResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getNodeInfoDescriptor,
    			GetNodeInfoRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getSyncing(request: GetSyncingRequest, metadata: Metadata = Metadata()):
        GetSyncingResponse = GetSyncingResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getSyncingDescriptor,
    			GetSyncingRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getLatestBlock(request: GetLatestBlockRequest, metadata: Metadata =
        Metadata()): GetLatestBlockResponse = GetLatestBlockResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getLatestBlockDescriptor,
    			GetLatestBlockRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getBlockByHeight(request: GetBlockByHeightRequest, metadata: Metadata =
        Metadata()): GetBlockByHeightResponse = GetBlockByHeightResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getBlockByHeightDescriptor,
    			GetBlockByHeightRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getLatestValidatorSet(request: GetLatestValidatorSetRequest,
        metadata: Metadata = Metadata()): GetLatestValidatorSetResponse =
        GetLatestValidatorSetResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getLatestValidatorSetDescriptor,
    			GetLatestValidatorSetRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getValidatorSetByHeight(request: GetValidatorSetByHeightRequest,
        metadata: Metadata = Metadata()): GetValidatorSetByHeightResponse =
        GetValidatorSetByHeightResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getValidatorSetByHeightDescriptor,
    			GetValidatorSetByHeightRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun aBCIQuery(request: ABCIQueryRequest, metadata: Metadata = Metadata()):
        ABCIQueryResponse = ABCIQueryResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, aBCIQueryDescriptor,
    			ABCIQueryRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
