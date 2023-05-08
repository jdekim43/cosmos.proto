// Transform from cosmos/mint/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.mint.v1beta1

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

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val inflationDescriptor:
      MethodDescriptor<QueryOuterClass.QueryInflationRequest, QueryOuterClass.QueryInflationResponse>
      = QueryGrpc.getInflationMethod()!!

  private val annualProvisionsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAnnualProvisionsRequest, QueryOuterClass.QueryAnnualProvisionsResponse>
      = QueryGrpc.getAnnualProvisionsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun params(request: QueryParamsRequest): QueryParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.mint.v1beta1.Query.Params is unimplemented"))

    public open suspend fun inflation(request: QueryInflationRequest): QueryInflationResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.mint.v1beta1.Query.Inflation is unimplemented"))

    public open suspend fun annualProvisions(request: QueryAnnualProvisionsRequest):
        QueryAnnualProvisionsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.mint.v1beta1.Query.AnnualProvisions is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = paramsDescriptor,
    				implementation = {
        QueryParamsResponseMapper.convert(params(QueryParamsRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = inflationDescriptor,
    				implementation = {
        QueryInflationResponseMapper.convert(inflation(QueryInflationRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = annualProvisionsDescriptor,
    				implementation = {
        QueryAnnualProvisionsResponseMapper.convert(annualProvisions(QueryAnnualProvisionsRequestMapper.convert(it)))
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

    public suspend fun params(request: QueryParamsRequest, metadata: Metadata = Metadata()):
        QueryParamsResponse = QueryParamsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, paramsDescriptor,
    			QueryParamsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun inflation(request: QueryInflationRequest, metadata: Metadata = Metadata()):
        QueryInflationResponse = QueryInflationResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, inflationDescriptor,
    			QueryInflationRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun annualProvisions(request: QueryAnnualProvisionsRequest, metadata: Metadata =
        Metadata()): QueryAnnualProvisionsResponse = QueryAnnualProvisionsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, annualProvisionsDescriptor,
    			QueryAnnualProvisionsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
