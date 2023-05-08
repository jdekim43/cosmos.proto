// Transform from cosmos/feegrant/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.feegrant.v1beta1

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

  private val grantAllowanceDescriptor:
      MethodDescriptor<Tx.MsgGrantAllowance, Tx.MsgGrantAllowanceResponse> =
      MsgGrpc.getGrantAllowanceMethod()!!

  private val revokeAllowanceDescriptor:
      MethodDescriptor<Tx.MsgRevokeAllowance, Tx.MsgRevokeAllowanceResponse> =
      MsgGrpc.getRevokeAllowanceMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun grantAllowance(request: MsgGrantAllowance): MsgGrantAllowanceResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.feegrant.v1beta1.Msg.GrantAllowance is unimplemented"))

    public open suspend fun revokeAllowance(request: MsgRevokeAllowance): MsgRevokeAllowanceResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.feegrant.v1beta1.Msg.RevokeAllowance is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = grantAllowanceDescriptor,
    				implementation = {
        MsgGrantAllowanceResponseMapper.convert(grantAllowance(MsgGrantAllowanceMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = revokeAllowanceDescriptor,
    				implementation = {
        MsgRevokeAllowanceResponseMapper.convert(revokeAllowance(MsgRevokeAllowanceMapper.convert(it)))
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

    public suspend fun grantAllowance(request: MsgGrantAllowance, metadata: Metadata = Metadata()):
        MsgGrantAllowanceResponse = MsgGrantAllowanceResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, grantAllowanceDescriptor,
    			MsgGrantAllowanceMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun revokeAllowance(request: MsgRevokeAllowance, metadata: Metadata =
        Metadata()): MsgRevokeAllowanceResponse = MsgRevokeAllowanceResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, revokeAllowanceDescriptor,
    			MsgRevokeAllowanceMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
