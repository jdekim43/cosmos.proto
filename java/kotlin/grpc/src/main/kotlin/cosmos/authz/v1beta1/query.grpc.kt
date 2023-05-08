// Transform from cosmos/authz/v1beta1/query.proto
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

public object QueryService {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val grantsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGrantsRequest, QueryOuterClass.QueryGrantsResponse> =
      QueryGrpc.getGrantsMethod()!!

  private val granterGrantsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGranterGrantsRequest, QueryOuterClass.QueryGranterGrantsResponse>
      = QueryGrpc.getGranterGrantsMethod()!!

  private val granteeGrantsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGranteeGrantsRequest, QueryOuterClass.QueryGranteeGrantsResponse>
      = QueryGrpc.getGranteeGrantsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun grants(request: QueryGrantsRequest): QueryGrantsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.authz.v1beta1.Query.Grants is unimplemented"))

    public open suspend fun granterGrants(request: QueryGranterGrantsRequest):
        QueryGranterGrantsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.authz.v1beta1.Query.GranterGrants is unimplemented"))

    public open suspend fun granteeGrants(request: QueryGranteeGrantsRequest):
        QueryGranteeGrantsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.authz.v1beta1.Query.GranteeGrants is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = grantsDescriptor,
    				implementation = {
        QueryGrantsResponseMapper.convert(grants(QueryGrantsRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = granterGrantsDescriptor,
    				implementation = {
        QueryGranterGrantsResponseMapper.convert(granterGrants(QueryGranterGrantsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = granteeGrantsDescriptor,
    				implementation = {
        QueryGranteeGrantsResponseMapper.convert(granteeGrants(QueryGranteeGrantsRequestMapper.convert(it)))
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

    public suspend fun grants(request: QueryGrantsRequest, metadata: Metadata = Metadata()):
        QueryGrantsResponse = QueryGrantsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, grantsDescriptor,
    			QueryGrantsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun granterGrants(request: QueryGranterGrantsRequest, metadata: Metadata =
        Metadata()): QueryGranterGrantsResponse = QueryGranterGrantsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, granterGrantsDescriptor,
    			QueryGranterGrantsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun granteeGrants(request: QueryGranteeGrantsRequest, metadata: Metadata =
        Metadata()): QueryGranteeGrantsResponse = QueryGranteeGrantsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, granteeGrantsDescriptor,
    			QueryGranteeGrantsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
