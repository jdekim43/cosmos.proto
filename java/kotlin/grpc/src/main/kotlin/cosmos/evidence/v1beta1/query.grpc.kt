// Transform from cosmos/evidence/v1beta1/query.proto
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

public object QueryService {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val evidenceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryEvidenceRequest, QueryOuterClass.QueryEvidenceResponse>
      = QueryGrpc.getEvidenceMethod()!!

  private val allEvidenceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllEvidenceRequest, QueryOuterClass.QueryAllEvidenceResponse>
      = QueryGrpc.getAllEvidenceMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun evidence(request: QueryEvidenceRequest): QueryEvidenceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.evidence.v1beta1.Query.Evidence is unimplemented"))

    public open suspend fun allEvidence(request: QueryAllEvidenceRequest): QueryAllEvidenceResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.evidence.v1beta1.Query.AllEvidence is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = evidenceDescriptor,
    				implementation = {
        QueryEvidenceResponseMapper.convert(evidence(QueryEvidenceRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allEvidenceDescriptor,
    				implementation = {
        QueryAllEvidenceResponseMapper.convert(allEvidence(QueryAllEvidenceRequestMapper.convert(it)))
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

    public suspend fun evidence(request: QueryEvidenceRequest, metadata: Metadata = Metadata()):
        QueryEvidenceResponse = QueryEvidenceResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, evidenceDescriptor,
    			QueryEvidenceRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun allEvidence(request: QueryAllEvidenceRequest, metadata: Metadata =
        Metadata()): QueryAllEvidenceResponse = QueryAllEvidenceResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, allEvidenceDescriptor,
    			QueryAllEvidenceRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
