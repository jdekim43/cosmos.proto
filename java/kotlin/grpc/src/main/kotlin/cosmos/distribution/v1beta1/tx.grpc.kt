// Transform from cosmos/distribution/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.distribution.v1beta1

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

  private val setWithdrawAddressDescriptor:
      MethodDescriptor<Tx.MsgSetWithdrawAddress, Tx.MsgSetWithdrawAddressResponse> =
      MsgGrpc.getSetWithdrawAddressMethod()!!

  private val withdrawDelegatorRewardDescriptor:
      MethodDescriptor<Tx.MsgWithdrawDelegatorReward, Tx.MsgWithdrawDelegatorRewardResponse> =
      MsgGrpc.getWithdrawDelegatorRewardMethod()!!

  private val withdrawValidatorCommissionDescriptor:
      MethodDescriptor<Tx.MsgWithdrawValidatorCommission, Tx.MsgWithdrawValidatorCommissionResponse>
      = MsgGrpc.getWithdrawValidatorCommissionMethod()!!

  private val fundCommunityPoolDescriptor:
      MethodDescriptor<Tx.MsgFundCommunityPool, Tx.MsgFundCommunityPoolResponse> =
      MsgGrpc.getFundCommunityPoolMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  private val communityPoolSpendDescriptor:
      MethodDescriptor<Tx.MsgCommunityPoolSpend, Tx.MsgCommunityPoolSpendResponse> =
      MsgGrpc.getCommunityPoolSpendMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun setWithdrawAddress(request: MsgSetWithdrawAddress):
        MsgSetWithdrawAddressResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Msg.SetWithdrawAddress is unimplemented"))

    public open suspend fun withdrawDelegatorReward(request: MsgWithdrawDelegatorReward):
        MsgWithdrawDelegatorRewardResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Msg.WithdrawDelegatorReward is unimplemented"))

    public open suspend fun withdrawValidatorCommission(request: MsgWithdrawValidatorCommission):
        MsgWithdrawValidatorCommissionResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Msg.WithdrawValidatorCommission is unimplemented"))

    public open suspend fun fundCommunityPool(request: MsgFundCommunityPool):
        MsgFundCommunityPoolResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Msg.FundCommunityPool is unimplemented"))

    public open suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Msg.UpdateParams is unimplemented"))

    public open suspend fun communityPoolSpend(request: MsgCommunityPoolSpend):
        MsgCommunityPoolSpendResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Msg.CommunityPoolSpend is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = setWithdrawAddressDescriptor,
    				implementation = {
        MsgSetWithdrawAddressResponseMapper.convert(setWithdrawAddress(MsgSetWithdrawAddressMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = withdrawDelegatorRewardDescriptor,
    				implementation = {
        MsgWithdrawDelegatorRewardResponseMapper.convert(withdrawDelegatorReward(MsgWithdrawDelegatorRewardMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = withdrawValidatorCommissionDescriptor,
    				implementation = {
        MsgWithdrawValidatorCommissionResponseMapper.convert(withdrawValidatorCommission(MsgWithdrawValidatorCommissionMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = fundCommunityPoolDescriptor,
    				implementation = {
        MsgFundCommunityPoolResponseMapper.convert(fundCommunityPool(MsgFundCommunityPoolMapper.convert(it)))
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
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = communityPoolSpendDescriptor,
    				implementation = {
        MsgCommunityPoolSpendResponseMapper.convert(communityPoolSpend(MsgCommunityPoolSpendMapper.convert(it)))
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

    public suspend fun setWithdrawAddress(request: MsgSetWithdrawAddress, metadata: Metadata =
        Metadata()): MsgSetWithdrawAddressResponse = MsgSetWithdrawAddressResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, setWithdrawAddressDescriptor,
    			MsgSetWithdrawAddressMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun withdrawDelegatorReward(request: MsgWithdrawDelegatorReward,
        metadata: Metadata = Metadata()): MsgWithdrawDelegatorRewardResponse =
        MsgWithdrawDelegatorRewardResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, withdrawDelegatorRewardDescriptor,
    			MsgWithdrawDelegatorRewardMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun withdrawValidatorCommission(request: MsgWithdrawValidatorCommission,
        metadata: Metadata = Metadata()): MsgWithdrawValidatorCommissionResponse =
        MsgWithdrawValidatorCommissionResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, withdrawValidatorCommissionDescriptor,
    			MsgWithdrawValidatorCommissionMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun fundCommunityPool(request: MsgFundCommunityPool, metadata: Metadata =
        Metadata()): MsgFundCommunityPoolResponse = MsgFundCommunityPoolResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, fundCommunityPoolDescriptor,
    			MsgFundCommunityPoolMapper.convert(request),
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

    public suspend fun communityPoolSpend(request: MsgCommunityPoolSpend, metadata: Metadata =
        Metadata()): MsgCommunityPoolSpendResponse = MsgCommunityPoolSpendResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, communityPoolSpendDescriptor,
    			MsgCommunityPoolSpendMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
