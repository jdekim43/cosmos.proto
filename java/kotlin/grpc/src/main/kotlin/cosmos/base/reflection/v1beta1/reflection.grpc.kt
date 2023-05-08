// Transform from cosmos/base/reflection/v1beta1/reflection.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.base.reflection.v1beta1

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

public object ReflectionServiceService {
  private val descriptor: ServiceDescriptor = ReflectionServiceGrpc.getServiceDescriptor()!!

  private val listAllInterfacesDescriptor:
      MethodDescriptor<Reflection.ListAllInterfacesRequest, Reflection.ListAllInterfacesResponse> =
      ReflectionServiceGrpc.getListAllInterfacesMethod()!!

  private val listImplementationsDescriptor:
      MethodDescriptor<Reflection.ListImplementationsRequest, Reflection.ListImplementationsResponse>
      = ReflectionServiceGrpc.getListImplementationsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun listAllInterfaces(request: ListAllInterfacesRequest):
        ListAllInterfacesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v1beta1.ReflectionService.ListAllInterfaces is unimplemented"))

    public open suspend fun listImplementations(request: ListImplementationsRequest):
        ListImplementationsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v1beta1.ReflectionService.ListImplementations is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = listAllInterfacesDescriptor,
    				implementation = {
        ListAllInterfacesResponseMapper.convert(listAllInterfaces(ListAllInterfacesRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = listImplementationsDescriptor,
    				implementation = {
        ListImplementationsResponseMapper.convert(listImplementations(ListImplementationsRequestMapper.convert(it)))
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

    public suspend fun listAllInterfaces(request: ListAllInterfacesRequest, metadata: Metadata =
        Metadata()): ListAllInterfacesResponse = ListAllInterfacesResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, listAllInterfacesDescriptor,
    			ListAllInterfacesRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun listImplementations(request: ListImplementationsRequest, metadata: Metadata =
        Metadata()): ListImplementationsResponse = ListImplementationsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, listImplementationsDescriptor,
    			ListImplementationsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
