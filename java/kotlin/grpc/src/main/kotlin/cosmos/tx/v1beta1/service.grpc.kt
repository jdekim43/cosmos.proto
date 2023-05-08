// Transform from cosmos/tx/v1beta1/service.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.tx.v1beta1

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

  private val simulateDescriptor:
      MethodDescriptor<ServiceOuterClass.SimulateRequest, ServiceOuterClass.SimulateResponse> =
      ServiceGrpc.getSimulateMethod()!!

  private val getTxDescriptor:
      MethodDescriptor<ServiceOuterClass.GetTxRequest, ServiceOuterClass.GetTxResponse> =
      ServiceGrpc.getGetTxMethod()!!

  private val broadcastTxDescriptor:
      MethodDescriptor<ServiceOuterClass.BroadcastTxRequest, ServiceOuterClass.BroadcastTxResponse>
      = ServiceGrpc.getBroadcastTxMethod()!!

  private val getTxsEventDescriptor:
      MethodDescriptor<ServiceOuterClass.GetTxsEventRequest, ServiceOuterClass.GetTxsEventResponse>
      = ServiceGrpc.getGetTxsEventMethod()!!

  private val getBlockWithTxsDescriptor:
      MethodDescriptor<ServiceOuterClass.GetBlockWithTxsRequest, ServiceOuterClass.GetBlockWithTxsResponse>
      = ServiceGrpc.getGetBlockWithTxsMethod()!!

  private val txDecodeDescriptor:
      MethodDescriptor<ServiceOuterClass.TxDecodeRequest, ServiceOuterClass.TxDecodeResponse> =
      ServiceGrpc.getTxDecodeMethod()!!

  private val txEncodeDescriptor:
      MethodDescriptor<ServiceOuterClass.TxEncodeRequest, ServiceOuterClass.TxEncodeResponse> =
      ServiceGrpc.getTxEncodeMethod()!!

  private val txEncodeAminoDescriptor:
      MethodDescriptor<ServiceOuterClass.TxEncodeAminoRequest, ServiceOuterClass.TxEncodeAminoResponse>
      = ServiceGrpc.getTxEncodeAminoMethod()!!

  private val txDecodeAminoDescriptor:
      MethodDescriptor<ServiceOuterClass.TxDecodeAminoRequest, ServiceOuterClass.TxDecodeAminoResponse>
      = ServiceGrpc.getTxDecodeAminoMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun simulate(request: SimulateRequest): SimulateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.Simulate is unimplemented"))

    public open suspend fun getTx(request: GetTxRequest): GetTxResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.GetTx is unimplemented"))

    public open suspend fun broadcastTx(request: BroadcastTxRequest): BroadcastTxResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.BroadcastTx is unimplemented"))

    public open suspend fun getTxsEvent(request: GetTxsEventRequest): GetTxsEventResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.GetTxsEvent is unimplemented"))

    public open suspend fun getBlockWithTxs(request: GetBlockWithTxsRequest):
        GetBlockWithTxsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.GetBlockWithTxs is unimplemented"))

    public open suspend fun txDecode(request: TxDecodeRequest): TxDecodeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.TxDecode is unimplemented"))

    public open suspend fun txEncode(request: TxEncodeRequest): TxEncodeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.TxEncode is unimplemented"))

    public open suspend fun txEncodeAmino(request: TxEncodeAminoRequest): TxEncodeAminoResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.TxEncodeAmino is unimplemented"))

    public open suspend fun txDecodeAmino(request: TxDecodeAminoRequest): TxDecodeAminoResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.tx.v1beta1.Service.TxDecodeAmino is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = simulateDescriptor,
    				implementation = {
        SimulateResponseMapper.convert(simulate(SimulateRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getTxDescriptor,
    				implementation = { GetTxResponseMapper.convert(getTx(GetTxRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = broadcastTxDescriptor,
    				implementation = {
        BroadcastTxResponseMapper.convert(broadcastTx(BroadcastTxRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getTxsEventDescriptor,
    				implementation = {
        GetTxsEventResponseMapper.convert(getTxsEvent(GetTxsEventRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getBlockWithTxsDescriptor,
    				implementation = {
        GetBlockWithTxsResponseMapper.convert(getBlockWithTxs(GetBlockWithTxsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = txDecodeDescriptor,
    				implementation = {
        TxDecodeResponseMapper.convert(txDecode(TxDecodeRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = txEncodeDescriptor,
    				implementation = {
        TxEncodeResponseMapper.convert(txEncode(TxEncodeRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = txEncodeAminoDescriptor,
    				implementation = {
        TxEncodeAminoResponseMapper.convert(txEncodeAmino(TxEncodeAminoRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = txDecodeAminoDescriptor,
    				implementation = {
        TxDecodeAminoResponseMapper.convert(txDecodeAmino(TxDecodeAminoRequestMapper.convert(it)))
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

    public suspend fun simulate(request: SimulateRequest, metadata: Metadata = Metadata()):
        SimulateResponse = SimulateResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, simulateDescriptor,
    			SimulateRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getTx(request: GetTxRequest, metadata: Metadata = Metadata()): GetTxResponse
        = GetTxResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getTxDescriptor,
    			GetTxRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun broadcastTx(request: BroadcastTxRequest, metadata: Metadata = Metadata()):
        BroadcastTxResponse = BroadcastTxResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, broadcastTxDescriptor,
    			BroadcastTxRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getTxsEvent(request: GetTxsEventRequest, metadata: Metadata = Metadata()):
        GetTxsEventResponse = GetTxsEventResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getTxsEventDescriptor,
    			GetTxsEventRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun getBlockWithTxs(request: GetBlockWithTxsRequest, metadata: Metadata =
        Metadata()): GetBlockWithTxsResponse = GetBlockWithTxsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getBlockWithTxsDescriptor,
    			GetBlockWithTxsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun txDecode(request: TxDecodeRequest, metadata: Metadata = Metadata()):
        TxDecodeResponse = TxDecodeResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, txDecodeDescriptor,
    			TxDecodeRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun txEncode(request: TxEncodeRequest, metadata: Metadata = Metadata()):
        TxEncodeResponse = TxEncodeResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, txEncodeDescriptor,
    			TxEncodeRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun txEncodeAmino(request: TxEncodeAminoRequest, metadata: Metadata =
        Metadata()): TxEncodeAminoResponse = TxEncodeAminoResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, txEncodeAminoDescriptor,
    			TxEncodeAminoRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun txDecodeAmino(request: TxDecodeAminoRequest, metadata: Metadata =
        Metadata()): TxDecodeAminoResponse = TxDecodeAminoResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, txDecodeAminoDescriptor,
    			TxDecodeAminoRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
