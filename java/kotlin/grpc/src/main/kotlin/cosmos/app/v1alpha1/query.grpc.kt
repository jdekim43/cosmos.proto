// Transform from cosmos/app/v1alpha1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.app.v1alpha1

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

  private val configDescriptor:
      MethodDescriptor<QueryOuterClass.QueryConfigRequest, QueryOuterClass.QueryConfigResponse> =
      QueryGrpc.getConfigMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun config(request: QueryConfigRequest): QueryConfigResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.app.v1alpha1.Query.Config is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = configDescriptor,
    				implementation = {
        QueryConfigResponseMapper.convert(config(QueryConfigRequestMapper.convert(it))) },
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

    public suspend fun config(request: QueryConfigRequest, metadata: Metadata = Metadata()):
        QueryConfigResponse = QueryConfigResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, configDescriptor,
    			QueryConfigRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
