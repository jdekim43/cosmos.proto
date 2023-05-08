// Transform from cosmos/authz/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.authz.v1beta1

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

  private val grantDescriptor: MethodDescriptor<Tx.MsgGrant, Tx.MsgGrantResponse> =
      MsgGrpc.getGrantMethod()!!

  private val execDescriptor: MethodDescriptor<Tx.MsgExec, Tx.MsgExecResponse> =
      MsgGrpc.getExecMethod()!!

  private val revokeDescriptor: MethodDescriptor<Tx.MsgRevoke, Tx.MsgRevokeResponse> =
      MsgGrpc.getRevokeMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun grant(request: MsgGrant): MsgGrantResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.authz.v1beta1.Msg.Grant is unimplemented"))

    public open suspend fun exec(request: MsgExec): MsgExecResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.authz.v1beta1.Msg.Exec is unimplemented"))

    public open suspend fun revoke(request: MsgRevoke): MsgRevokeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.authz.v1beta1.Msg.Revoke is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = grantDescriptor,
    				implementation = { MsgGrantResponseMapper.convert(grant(MsgGrantMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = execDescriptor,
    				implementation = { MsgExecResponseMapper.convert(exec(MsgExecMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = revokeDescriptor,
    				implementation = { MsgRevokeResponseMapper.convert(revoke(MsgRevokeMapper.convert(it))) },
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

    public suspend fun grant(request: MsgGrant, metadata: Metadata = Metadata()): MsgGrantResponse =
        MsgGrantResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, grantDescriptor,
    			MsgGrantMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun exec(request: MsgExec, metadata: Metadata = Metadata()): MsgExecResponse =
        MsgExecResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, execDescriptor,
    			MsgExecMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun revoke(request: MsgRevoke, metadata: Metadata = Metadata()):
        MsgRevokeResponse = MsgRevokeResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, revokeDescriptor,
    			MsgRevokeMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
