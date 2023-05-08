// Transform from cosmos/nft/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.nft.v1beta1

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

  private val balanceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBalanceRequest, QueryOuterClass.QueryBalanceResponse> =
      QueryGrpc.getBalanceMethod()!!

  private val ownerDescriptor:
      MethodDescriptor<QueryOuterClass.QueryOwnerRequest, QueryOuterClass.QueryOwnerResponse> =
      QueryGrpc.getOwnerMethod()!!

  private val supplyDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySupplyRequest, QueryOuterClass.QuerySupplyResponse> =
      QueryGrpc.getSupplyMethod()!!

  private val nFTsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryNFTsRequest, QueryOuterClass.QueryNFTsResponse> =
      QueryGrpc.getNFTsMethod()!!

  private val nFTDescriptor:
      MethodDescriptor<QueryOuterClass.QueryNFTRequest, QueryOuterClass.QueryNFTResponse> =
      QueryGrpc.getNFTMethod()!!

  private val classDescriptor:
      MethodDescriptor<QueryOuterClass.QueryClassRequest, QueryOuterClass.QueryClassResponse> =
      QueryGrpc.getClassMethod()!!

  private val classesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryClassesRequest, QueryOuterClass.QueryClassesResponse> =
      QueryGrpc.getClassesMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun balance(request: QueryBalanceRequest): QueryBalanceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.Balance is unimplemented"))

    public open suspend fun owner(request: QueryOwnerRequest): QueryOwnerResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.Owner is unimplemented"))

    public open suspend fun supply(request: QuerySupplyRequest): QuerySupplyResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.Supply is unimplemented"))

    public open suspend fun nFTs(request: QueryNFTsRequest): QueryNFTsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.NFTs is unimplemented"))

    public open suspend fun nFT(request: QueryNFTRequest): QueryNFTResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.NFT is unimplemented"))

    public open suspend fun `class`(request: QueryClassRequest): QueryClassResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.Class is unimplemented"))

    public open suspend fun classes(request: QueryClassesRequest): QueryClassesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.Classes is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = balanceDescriptor,
    				implementation = {
        QueryBalanceResponseMapper.convert(balance(QueryBalanceRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = ownerDescriptor,
    				implementation = {
        QueryOwnerResponseMapper.convert(owner(QueryOwnerRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = supplyDescriptor,
    				implementation = {
        QuerySupplyResponseMapper.convert(supply(QuerySupplyRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = nFTsDescriptor,
    				implementation = { QueryNFTsResponseMapper.convert(nFTs(QueryNFTsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = nFTDescriptor,
    				implementation = { QueryNFTResponseMapper.convert(nFT(QueryNFTRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = classDescriptor,
    				implementation = {
        QueryClassResponseMapper.convert(`class`(QueryClassRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = classesDescriptor,
    				implementation = {
        QueryClassesResponseMapper.convert(classes(QueryClassesRequestMapper.convert(it))) },
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

    public suspend fun balance(request: QueryBalanceRequest, metadata: Metadata = Metadata()):
        QueryBalanceResponse = QueryBalanceResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, balanceDescriptor,
    			QueryBalanceRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun owner(request: QueryOwnerRequest, metadata: Metadata = Metadata()):
        QueryOwnerResponse = QueryOwnerResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, ownerDescriptor,
    			QueryOwnerRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun supply(request: QuerySupplyRequest, metadata: Metadata = Metadata()):
        QuerySupplyResponse = QuerySupplyResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, supplyDescriptor,
    			QuerySupplyRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun nFTs(request: QueryNFTsRequest, metadata: Metadata = Metadata()):
        QueryNFTsResponse = QueryNFTsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, nFTsDescriptor,
    			QueryNFTsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun nFT(request: QueryNFTRequest, metadata: Metadata = Metadata()):
        QueryNFTResponse = QueryNFTResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, nFTDescriptor,
    			QueryNFTRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun `class`(request: QueryClassRequest, metadata: Metadata = Metadata()):
        QueryClassResponse = QueryClassResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, classDescriptor,
    			QueryClassRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun classes(request: QueryClassesRequest, metadata: Metadata = Metadata()):
        QueryClassesResponse = QueryClassesResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, classesDescriptor,
    			QueryClassesRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
