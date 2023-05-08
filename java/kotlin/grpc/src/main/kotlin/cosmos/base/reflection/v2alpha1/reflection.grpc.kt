// Transform from cosmos/base/reflection/v2alpha1/reflection.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.base.reflection.v2alpha1

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

  private val getAuthnDescriptorDescriptor:
      MethodDescriptor<Reflection.GetAuthnDescriptorRequest, Reflection.GetAuthnDescriptorResponse>
      = ReflectionServiceGrpc.getGetAuthnDescriptorMethod()!!

  private val getChainDescriptorDescriptor:
      MethodDescriptor<Reflection.GetChainDescriptorRequest, Reflection.GetChainDescriptorResponse>
      = ReflectionServiceGrpc.getGetChainDescriptorMethod()!!

  private val getCodecDescriptorDescriptor:
      MethodDescriptor<Reflection.GetCodecDescriptorRequest, Reflection.GetCodecDescriptorResponse>
      = ReflectionServiceGrpc.getGetCodecDescriptorMethod()!!

  private val getConfigurationDescriptorDescriptor:
      MethodDescriptor<Reflection.GetConfigurationDescriptorRequest, Reflection.GetConfigurationDescriptorResponse>
      = ReflectionServiceGrpc.getGetConfigurationDescriptorMethod()!!

  private val getQueryServicesDescriptorDescriptor:
      MethodDescriptor<Reflection.GetQueryServicesDescriptorRequest, Reflection.GetQueryServicesDescriptorResponse>
      = ReflectionServiceGrpc.getGetQueryServicesDescriptorMethod()!!

  private val getTxDescriptorDescriptor:
      MethodDescriptor<Reflection.GetTxDescriptorRequest, Reflection.GetTxDescriptorResponse> =
      ReflectionServiceGrpc.getGetTxDescriptorMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun getAuthnDescriptor(request: GetAuthnDescriptorRequest):
        GetAuthnDescriptorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v2alpha1.ReflectionService.GetAuthnDescriptor is unimplemented"))

    public open suspend fun getChainDescriptor(request: GetChainDescriptorRequest):
        GetChainDescriptorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v2alpha1.ReflectionService.GetChainDescriptor is unimplemented"))

    public open suspend fun getCodecDescriptor(request: GetCodecDescriptorRequest):
        GetCodecDescriptorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v2alpha1.ReflectionService.GetCodecDescriptor is unimplemented"))

    public open suspend fun getConfigurationDescriptor(request: GetConfigurationDescriptorRequest):
        GetConfigurationDescriptorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v2alpha1.ReflectionService.GetConfigurationDescriptor is unimplemented"))

    public open suspend fun getQueryServicesDescriptor(request: GetQueryServicesDescriptorRequest):
        GetQueryServicesDescriptorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v2alpha1.ReflectionService.GetQueryServicesDescriptor is unimplemented"))

    public open suspend fun getTxDescriptor(request: GetTxDescriptorRequest):
        GetTxDescriptorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.base.reflection.v2alpha1.ReflectionService.GetTxDescriptor is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getAuthnDescriptorDescriptor,
    				implementation = {
        GetAuthnDescriptorResponseMapper.convert(getAuthnDescriptor(GetAuthnDescriptorRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getChainDescriptorDescriptor,
    				implementation = {
        GetChainDescriptorResponseMapper.convert(getChainDescriptor(GetChainDescriptorRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getCodecDescriptorDescriptor,
    				implementation = {
        GetCodecDescriptorResponseMapper.convert(getCodecDescriptor(GetCodecDescriptorRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getConfigurationDescriptorDescriptor,
    				implementation = {
        GetConfigurationDescriptorResponseMapper.convert(getConfigurationDescriptor(GetConfigurationDescriptorRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getQueryServicesDescriptorDescriptor,
    				implementation = {
        GetQueryServicesDescriptorResponseMapper.convert(getQueryServicesDescriptor(GetQueryServicesDescriptorRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getTxDescriptorDescriptor,
    				implementation = {
        GetTxDescriptorResponseMapper.convert(getTxDescriptor(GetTxDescriptorRequestMapper.convert(it)))
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

    public suspend fun getAuthnDescriptor(request: GetAuthnDescriptorRequest, metadata: Metadata =
        Metadata()): GetAuthnDescriptorResponse = GetAuthnDescriptorResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getAuthnDescriptorDescriptor,
    			GetAuthnDescriptorRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getChainDescriptor(request: GetChainDescriptorRequest, metadata: Metadata =
        Metadata()): GetChainDescriptorResponse = GetChainDescriptorResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getChainDescriptorDescriptor,
    			GetChainDescriptorRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getCodecDescriptor(request: GetCodecDescriptorRequest, metadata: Metadata =
        Metadata()): GetCodecDescriptorResponse = GetCodecDescriptorResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getCodecDescriptorDescriptor,
    			GetCodecDescriptorRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getConfigurationDescriptor(request: GetConfigurationDescriptorRequest,
        metadata: Metadata = Metadata()): GetConfigurationDescriptorResponse =
        GetConfigurationDescriptorResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getConfigurationDescriptorDescriptor,
    			GetConfigurationDescriptorRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getQueryServicesDescriptor(request: GetQueryServicesDescriptorRequest,
        metadata: Metadata = Metadata()): GetQueryServicesDescriptorResponse =
        GetQueryServicesDescriptorResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getQueryServicesDescriptorDescriptor,
    			GetQueryServicesDescriptorRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getTxDescriptor(request: GetTxDescriptorRequest, metadata: Metadata =
        Metadata()): GetTxDescriptorResponse = GetTxDescriptorResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getTxDescriptorDescriptor,
    			GetTxDescriptorRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
