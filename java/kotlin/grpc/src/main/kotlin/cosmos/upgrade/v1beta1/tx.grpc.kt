// Transform from cosmos/upgrade/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.upgrade.v1beta1

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

  private val softwareUpgradeDescriptor:
      MethodDescriptor<Tx.MsgSoftwareUpgrade, Tx.MsgSoftwareUpgradeResponse> =
      MsgGrpc.getSoftwareUpgradeMethod()!!

  private val cancelUpgradeDescriptor:
      MethodDescriptor<Tx.MsgCancelUpgrade, Tx.MsgCancelUpgradeResponse> =
      MsgGrpc.getCancelUpgradeMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun softwareUpgrade(request: MsgSoftwareUpgrade): MsgSoftwareUpgradeResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Msg.SoftwareUpgrade is unimplemented"))

    public open suspend fun cancelUpgrade(request: MsgCancelUpgrade): MsgCancelUpgradeResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Msg.CancelUpgrade is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = softwareUpgradeDescriptor,
    				implementation = {
        MsgSoftwareUpgradeResponseMapper.convert(softwareUpgrade(MsgSoftwareUpgradeMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = cancelUpgradeDescriptor,
    				implementation = {
        MsgCancelUpgradeResponseMapper.convert(cancelUpgrade(MsgCancelUpgradeMapper.convert(it))) },
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

    public suspend fun softwareUpgrade(request: MsgSoftwareUpgrade, metadata: Metadata =
        Metadata()): MsgSoftwareUpgradeResponse = MsgSoftwareUpgradeResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, softwareUpgradeDescriptor,
    			MsgSoftwareUpgradeMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun cancelUpgrade(request: MsgCancelUpgrade, metadata: Metadata = Metadata()):
        MsgCancelUpgradeResponse = MsgCancelUpgradeResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, cancelUpgradeDescriptor,
    			MsgCancelUpgradeMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
