// Transform from cosmos/vesting/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.vesting.v1beta1

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

  private val createVestingAccountDescriptor:
      MethodDescriptor<Tx.MsgCreateVestingAccount, Tx.MsgCreateVestingAccountResponse> =
      MsgGrpc.getCreateVestingAccountMethod()!!

  private val createPermanentLockedAccountDescriptor:
      MethodDescriptor<Tx.MsgCreatePermanentLockedAccount, Tx.MsgCreatePermanentLockedAccountResponse>
      = MsgGrpc.getCreatePermanentLockedAccountMethod()!!

  private val createPeriodicVestingAccountDescriptor:
      MethodDescriptor<Tx.MsgCreatePeriodicVestingAccount, Tx.MsgCreatePeriodicVestingAccountResponse>
      = MsgGrpc.getCreatePeriodicVestingAccountMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun createVestingAccount(request: MsgCreateVestingAccount):
        MsgCreateVestingAccountResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.vesting.v1beta1.Msg.CreateVestingAccount is unimplemented"))

    public open suspend fun createPermanentLockedAccount(request: MsgCreatePermanentLockedAccount):
        MsgCreatePermanentLockedAccountResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.vesting.v1beta1.Msg.CreatePermanentLockedAccount is unimplemented"))

    public open suspend fun createPeriodicVestingAccount(request: MsgCreatePeriodicVestingAccount):
        MsgCreatePeriodicVestingAccountResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.vesting.v1beta1.Msg.CreatePeriodicVestingAccount is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createVestingAccountDescriptor,
    				implementation = {
        MsgCreateVestingAccountResponseMapper.convert(createVestingAccount(MsgCreateVestingAccountMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createPermanentLockedAccountDescriptor,
    				implementation = {
        MsgCreatePermanentLockedAccountResponseMapper.convert(createPermanentLockedAccount(MsgCreatePermanentLockedAccountMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createPeriodicVestingAccountDescriptor,
    				implementation = {
        MsgCreatePeriodicVestingAccountResponseMapper.convert(createPeriodicVestingAccount(MsgCreatePeriodicVestingAccountMapper.convert(it)))
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

    public suspend fun createVestingAccount(request: MsgCreateVestingAccount, metadata: Metadata =
        Metadata()): MsgCreateVestingAccountResponse =
        MsgCreateVestingAccountResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, createVestingAccountDescriptor,
    			MsgCreateVestingAccountMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun createPermanentLockedAccount(request: MsgCreatePermanentLockedAccount,
        metadata: Metadata = Metadata()): MsgCreatePermanentLockedAccountResponse =
        MsgCreatePermanentLockedAccountResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, createPermanentLockedAccountDescriptor,
    			MsgCreatePermanentLockedAccountMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun createPeriodicVestingAccount(request: MsgCreatePeriodicVestingAccount,
        metadata: Metadata = Metadata()): MsgCreatePeriodicVestingAccountResponse =
        MsgCreatePeriodicVestingAccountResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, createPeriodicVestingAccountDescriptor,
    			MsgCreatePeriodicVestingAccountMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
