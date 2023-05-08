// Transform from cosmos/orm/query/v1alpha1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.orm.query.v1alpha1

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

  private val getDescriptor:
      MethodDescriptor<QueryOuterClass.GetRequest, QueryOuterClass.GetResponse> =
      QueryGrpc.getGetMethod()!!

  private val listDescriptor:
      MethodDescriptor<QueryOuterClass.ListRequest, QueryOuterClass.ListResponse> =
      QueryGrpc.getListMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun `get`(request: GetRequest): GetResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.orm.query.v1alpha1.Query.Get is unimplemented"))

    public open suspend fun list(request: ListRequest): ListResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.orm.query.v1alpha1.Query.List is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getDescriptor,
    				implementation = { GetResponseMapper.convert(`get`(GetRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = listDescriptor,
    				implementation = { ListResponseMapper.convert(list(ListRequestMapper.convert(it))) },
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

    public suspend fun `get`(request: GetRequest, metadata: Metadata = Metadata()): GetResponse =
        GetResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, getDescriptor,
    			GetRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun list(request: ListRequest, metadata: Metadata = Metadata()): ListResponse =
        ListResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, listDescriptor,
    			ListRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
