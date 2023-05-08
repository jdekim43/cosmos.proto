// Transform from cosmos/slashing/v1beta1/tx.proto
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

public object MsgService {
  private val descriptor: ServiceDescriptor = MsgGrpc.getServiceDescriptor()!!

  private val unjailDescriptor: MethodDescriptor<Tx.MsgUnjail, Tx.MsgUnjailResponse> =
      MsgGrpc.getUnjailMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun unjail(request: MsgUnjail): MsgUnjailResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.slashing.v1beta1.Msg.Unjail is unimplemented"))

    public open suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.slashing.v1beta1.Msg.UpdateParams is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = unjailDescriptor,
    				implementation = { MsgUnjailResponseMapper.convert(unjail(MsgUnjailMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateParamsDescriptor,
    				implementation = {
        MsgUpdateParamsResponseMapper.convert(updateParams(MsgUpdateParamsMapper.convert(it))) },
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

    public suspend fun unjail(request: MsgUnjail, metadata: Metadata = Metadata()):
        MsgUnjailResponse = MsgUnjailResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, unjailDescriptor,
    			MsgUnjailMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun updateParams(request: MsgUpdateParams, metadata: Metadata = Metadata()):
        MsgUpdateParamsResponse = MsgUpdateParamsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, updateParamsDescriptor,
    			MsgUpdateParamsMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}