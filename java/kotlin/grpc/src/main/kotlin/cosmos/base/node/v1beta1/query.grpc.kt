// Transform from cosmos/base/node/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.base.node.v1beta1

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

  private val configDescriptor: MethodDescriptor<Query.ConfigRequest, Query.ConfigResponse> =
      ServiceGrpc.getConfigMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun config(request: ConfigRequest): ConfigResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.node.v1beta1.Service.Config is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = configDescriptor,
    				implementation = { ConfigResponseMapper.convert(config(ConfigRequestMapper.convert(it))) },
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

    public suspend fun config(request: ConfigRequest, metadata: Metadata = Metadata()):
        ConfigResponse = ConfigResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, configDescriptor,
    			ConfigRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
