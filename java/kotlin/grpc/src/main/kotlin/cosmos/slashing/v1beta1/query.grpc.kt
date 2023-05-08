// Transform from cosmos/slashing/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.slashing.v1beta1

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

  private val signingInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySigningInfoRequest, QueryOuterClass.QuerySigningInfoResponse>
      = QueryGrpc.getSigningInfoMethod()!!

  private val signingInfosDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySigningInfosRequest, QueryOuterClass.QuerySigningInfosResponse>
      = QueryGrpc.getSigningInfosMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun params(request: QueryParamsRequest): QueryParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.slashing.v1beta1.Query.Params is unimplemented"))

    public open suspend fun signingInfo(request: QuerySigningInfoRequest): QuerySigningInfoResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.slashing.v1beta1.Query.SigningInfo is unimplemented"))

    public open suspend fun signingInfos(request: QuerySigningInfosRequest):
        QuerySigningInfosResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.slashing.v1beta1.Query.SigningInfos is unimplemented"))

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
    				descriptor = signingInfoDescriptor,
    				implementation = {
        QuerySigningInfoResponseMapper.convert(signingInfo(QuerySigningInfoRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = signingInfosDescriptor,
    				implementation = {
        QuerySigningInfosResponseMapper.convert(signingInfos(QuerySigningInfosRequestMapper.convert(it)))
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

    public suspend fun signingInfo(request: QuerySigningInfoRequest, metadata: Metadata =
        Metadata()): QuerySigningInfoResponse = QuerySigningInfoResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, signingInfoDescriptor,
    			QuerySigningInfoRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun signingInfos(request: QuerySigningInfosRequest, metadata: Metadata =
        Metadata()): QuerySigningInfosResponse = QuerySigningInfosResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, signingInfosDescriptor,
    			QuerySigningInfosRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
