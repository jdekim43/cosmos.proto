// Transform from cosmos/feegrant/v1beta1/query.proto
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

public object QueryService {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val allowanceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllowanceRequest, QueryOuterClass.QueryAllowanceResponse>
      = QueryGrpc.getAllowanceMethod()!!

  private val allowancesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllowancesRequest, QueryOuterClass.QueryAllowancesResponse>
      = QueryGrpc.getAllowancesMethod()!!

  private val allowancesByGranterDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllowancesByGranterRequest, QueryOuterClass.QueryAllowancesByGranterResponse>
      = QueryGrpc.getAllowancesByGranterMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun allowance(request: QueryAllowanceRequest): QueryAllowanceResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.feegrant.v1beta1.Query.Allowance is unimplemented"))

    public open suspend fun allowances(request: QueryAllowancesRequest): QueryAllowancesResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.feegrant.v1beta1.Query.Allowances is unimplemented"))

    public open suspend fun allowancesByGranter(request: QueryAllowancesByGranterRequest):
        QueryAllowancesByGranterResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.feegrant.v1beta1.Query.AllowancesByGranter is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allowanceDescriptor,
    				implementation = {
        QueryAllowanceResponseMapper.convert(allowance(QueryAllowanceRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allowancesDescriptor,
    				implementation = {
        QueryAllowancesResponseMapper.convert(allowances(QueryAllowancesRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allowancesByGranterDescriptor,
    				implementation = {
        QueryAllowancesByGranterResponseMapper.convert(allowancesByGranter(QueryAllowancesByGranterRequestMapper.convert(it)))
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

    public suspend fun allowance(request: QueryAllowanceRequest, metadata: Metadata = Metadata()):
        QueryAllowanceResponse = QueryAllowanceResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, allowanceDescriptor,
    			QueryAllowanceRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun allowances(request: QueryAllowancesRequest, metadata: Metadata = Metadata()):
        QueryAllowancesResponse = QueryAllowancesResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, allowancesDescriptor,
    			QueryAllowancesRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun allowancesByGranter(request: QueryAllowancesByGranterRequest,
        metadata: Metadata = Metadata()): QueryAllowancesByGranterResponse =
        QueryAllowancesByGranterResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, allowancesByGranterDescriptor,
    			QueryAllowancesByGranterRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
