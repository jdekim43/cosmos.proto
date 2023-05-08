// Transform from cosmos/bank/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.bank.v1beta1

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

  private val sendDescriptor: MethodDescriptor<Tx.MsgSend, Tx.MsgSendResponse> =
      MsgGrpc.getSendMethod()!!

  private val multiSendDescriptor: MethodDescriptor<Tx.MsgMultiSend, Tx.MsgMultiSendResponse> =
      MsgGrpc.getMultiSendMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  private val setSendEnabledDescriptor:
      MethodDescriptor<Tx.MsgSetSendEnabled, Tx.MsgSetSendEnabledResponse> =
      MsgGrpc.getSetSendEnabledMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun send(request: MsgSend): MsgSendResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Msg.Send is unimplemented"))

    public open suspend fun multiSend(request: MsgMultiSend): MsgMultiSendResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Msg.MultiSend is unimplemented"))

    public open suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Msg.UpdateParams is unimplemented"))

    public open suspend fun setSendEnabled(request: MsgSetSendEnabled): MsgSetSendEnabledResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Msg.SetSendEnabled is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = sendDescriptor,
    				implementation = { MsgSendResponseMapper.convert(send(MsgSendMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = multiSendDescriptor,
    				implementation = {
        MsgMultiSendResponseMapper.convert(multiSend(MsgMultiSendMapper.convert(it))) },
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
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = setSendEnabledDescriptor,
    				implementation = {
        MsgSetSendEnabledResponseMapper.convert(setSendEnabled(MsgSetSendEnabledMapper.convert(it)))
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

    public suspend fun send(request: MsgSend, metadata: Metadata = Metadata()): MsgSendResponse =
        MsgSendResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, sendDescriptor,
    			MsgSendMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun multiSend(request: MsgMultiSend, metadata: Metadata = Metadata()):
        MsgMultiSendResponse = MsgMultiSendResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, multiSendDescriptor,
    			MsgMultiSendMapper.convert(request),
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

    public suspend fun setSendEnabled(request: MsgSetSendEnabled, metadata: Metadata = Metadata()):
        MsgSetSendEnabledResponse = MsgSetSendEnabledResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, setSendEnabledDescriptor,
    			MsgSetSendEnabledMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
