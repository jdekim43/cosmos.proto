// Transform from cosmos/reflection/v1/reflection.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.reflection.v1

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

  private val fileDescriptorsDescriptor:
      MethodDescriptor<Reflection.FileDescriptorsRequest, Reflection.FileDescriptorsResponse> =
      ReflectionServiceGrpc.getFileDescriptorsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun fileDescriptors(request: FileDescriptorsRequest):
        FileDescriptorsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.reflection.v1.ReflectionService.FileDescriptors is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = fileDescriptorsDescriptor,
    				implementation = {
        FileDescriptorsResponseMapper.convert(fileDescriptors(FileDescriptorsRequestMapper.convert(it)))
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

    public suspend fun fileDescriptors(request: FileDescriptorsRequest, metadata: Metadata =
        Metadata()): FileDescriptorsResponse = FileDescriptorsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, fileDescriptorsDescriptor,
    			FileDescriptorsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
