// Transform from cosmos/crisis/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.2.1")

package cosmos.crisis.v1beta1

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
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.grpc.ClientOption

public object MsgJvm {
  private val descriptor: ServiceDescriptor = MsgGrpc.getServiceDescriptor()!!

  private val verifyInvariantDescriptor:
      MethodDescriptor<Tx.MsgVerifyInvariant, Tx.MsgVerifyInvariantResponse> =
      MsgGrpc.getVerifyInvariantMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun verifyInvariant(request: MsgVerifyInvariant):
        MsgVerifyInvariantResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.crisis.v1beta1.Msg.VerifyInvariant is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.crisis.v1beta1.Msg.UpdateParams is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = verifyInvariantDescriptor,
    				implementation = {
        MsgVerifyInvariantResponseJvmConverter.convert(verifyInvariant(MsgVerifyInvariantJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateParamsDescriptor,
    				implementation = {
        MsgUpdateParamsResponseJvmConverter.convert(updateParams(MsgUpdateParamsJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    option: ClientOption,
  ) : AbstractCoroutineStub<Msg.Client>(channel = option.channel, callOptions = option.callOptions),
      Msg.Interface {
    public val channel: Channel = option.channel

    public val callOptions: CallOptions = option.callOptions

    public override fun build(channel: Channel, callOptions: CallOptions): Msg.Client =
        Msg.Client(ClientOption(channel, callOptions))

    public override suspend fun verifyInvariant(request: MsgVerifyInvariant):
        MsgVerifyInvariantResponse = verifyInvariant(request, Metadata())

    public suspend fun verifyInvariant(request: MsgVerifyInvariant, metadata: Metadata):
        MsgVerifyInvariantResponse = MsgVerifyInvariantResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			channel, verifyInvariantDescriptor,
    			MsgVerifyInvariantJvmConverter.convert(request),
    			callOptions, metadata,
    		),
    	)

    public override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse =
        updateParams(request, Metadata())

    public suspend fun updateParams(request: MsgUpdateParams, metadata: Metadata):
        MsgUpdateParamsResponse = MsgUpdateParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			channel, updateParamsDescriptor,
    			MsgUpdateParamsJvmConverter.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}