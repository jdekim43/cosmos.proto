// Transform from cosmos/evidence/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.evidence.v1beta1

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

  private val submitEvidenceDescriptor:
      MethodDescriptor<Tx.MsgSubmitEvidence, Tx.MsgSubmitEvidenceResponse> =
      MsgGrpc.getSubmitEvidenceMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun submitEvidence(request: MsgSubmitEvidence): MsgSubmitEvidenceResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.evidence.v1beta1.Msg.SubmitEvidence is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = submitEvidenceDescriptor,
    				implementation = {
        MsgSubmitEvidenceResponseMapper.convert(submitEvidence(MsgSubmitEvidenceMapper.convert(it)))
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

    public suspend fun submitEvidence(request: MsgSubmitEvidence, metadata: Metadata = Metadata()):
        MsgSubmitEvidenceResponse = MsgSubmitEvidenceResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, submitEvidenceDescriptor,
    			MsgSubmitEvidenceMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
