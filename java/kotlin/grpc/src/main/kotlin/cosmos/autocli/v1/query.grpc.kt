// Transform from cosmos/autocli/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.autocli.v1

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

  private val appOptionsDescriptor:
      MethodDescriptor<QueryOuterClass.AppOptionsRequest, QueryOuterClass.AppOptionsResponse> =
      QueryGrpc.getAppOptionsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun appOptions(request: AppOptionsRequest): AppOptionsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.autocli.v1.Query.AppOptions is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = appOptionsDescriptor,
    				implementation = {
        AppOptionsResponseMapper.convert(appOptions(AppOptionsRequestMapper.convert(it))) },
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

    public suspend fun appOptions(request: AppOptionsRequest, metadata: Metadata = Metadata()):
        AppOptionsResponse = AppOptionsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, appOptionsDescriptor,
    			AppOptionsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
