// Transform from cosmos/staking/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.staking.v1beta1

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

  private val createValidatorDescriptor:
      MethodDescriptor<Tx.MsgCreateValidator, Tx.MsgCreateValidatorResponse> =
      MsgGrpc.getCreateValidatorMethod()!!

  private val editValidatorDescriptor:
      MethodDescriptor<Tx.MsgEditValidator, Tx.MsgEditValidatorResponse> =
      MsgGrpc.getEditValidatorMethod()!!

  private val delegateDescriptor: MethodDescriptor<Tx.MsgDelegate, Tx.MsgDelegateResponse> =
      MsgGrpc.getDelegateMethod()!!

  private val beginRedelegateDescriptor:
      MethodDescriptor<Tx.MsgBeginRedelegate, Tx.MsgBeginRedelegateResponse> =
      MsgGrpc.getBeginRedelegateMethod()!!

  private val undelegateDescriptor: MethodDescriptor<Tx.MsgUndelegate, Tx.MsgUndelegateResponse> =
      MsgGrpc.getUndelegateMethod()!!

  private val cancelUnbondingDelegationDescriptor:
      MethodDescriptor<Tx.MsgCancelUnbondingDelegation, Tx.MsgCancelUnbondingDelegationResponse> =
      MsgGrpc.getCancelUnbondingDelegationMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun createValidator(request: MsgCreateValidator): MsgCreateValidatorResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.CreateValidator is unimplemented"))

    public open suspend fun editValidator(request: MsgEditValidator): MsgEditValidatorResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.EditValidator is unimplemented"))

    public open suspend fun `delegate`(request: MsgDelegate): MsgDelegateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.Delegate is unimplemented"))

    public open suspend fun beginRedelegate(request: MsgBeginRedelegate): MsgBeginRedelegateResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.BeginRedelegate is unimplemented"))

    public open suspend fun undelegate(request: MsgUndelegate): MsgUndelegateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.Undelegate is unimplemented"))

    public open suspend fun cancelUnbondingDelegation(request: MsgCancelUnbondingDelegation):
        MsgCancelUnbondingDelegationResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.CancelUnbondingDelegation is unimplemented"))

    public open suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.UpdateParams is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createValidatorDescriptor,
    				implementation = {
        MsgCreateValidatorResponseMapper.convert(createValidator(MsgCreateValidatorMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = editValidatorDescriptor,
    				implementation = {
        MsgEditValidatorResponseMapper.convert(editValidator(MsgEditValidatorMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegateDescriptor,
    				implementation = {
        MsgDelegateResponseMapper.convert(`delegate`(MsgDelegateMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = beginRedelegateDescriptor,
    				implementation = {
        MsgBeginRedelegateResponseMapper.convert(beginRedelegate(MsgBeginRedelegateMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = undelegateDescriptor,
    				implementation = {
        MsgUndelegateResponseMapper.convert(undelegate(MsgUndelegateMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = cancelUnbondingDelegationDescriptor,
    				implementation = {
        MsgCancelUnbondingDelegationResponseMapper.convert(cancelUnbondingDelegation(MsgCancelUnbondingDelegationMapper.convert(it)))
        },
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

    public suspend fun createValidator(request: MsgCreateValidator, metadata: Metadata =
        Metadata()): MsgCreateValidatorResponse = MsgCreateValidatorResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, createValidatorDescriptor,
    			MsgCreateValidatorMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun editValidator(request: MsgEditValidator, metadata: Metadata = Metadata()):
        MsgEditValidatorResponse = MsgEditValidatorResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, editValidatorDescriptor,
    			MsgEditValidatorMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun `delegate`(request: MsgDelegate, metadata: Metadata = Metadata()):
        MsgDelegateResponse = MsgDelegateResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, delegateDescriptor,
    			MsgDelegateMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun beginRedelegate(request: MsgBeginRedelegate, metadata: Metadata =
        Metadata()): MsgBeginRedelegateResponse = MsgBeginRedelegateResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, beginRedelegateDescriptor,
    			MsgBeginRedelegateMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun undelegate(request: MsgUndelegate, metadata: Metadata = Metadata()):
        MsgUndelegateResponse = MsgUndelegateResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, undelegateDescriptor,
    			MsgUndelegateMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun cancelUnbondingDelegation(request: MsgCancelUnbondingDelegation,
        metadata: Metadata = Metadata()): MsgCancelUnbondingDelegationResponse =
        MsgCancelUnbondingDelegationResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, cancelUnbondingDelegationDescriptor,
    			MsgCancelUnbondingDelegationMapper.convert(request),
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
