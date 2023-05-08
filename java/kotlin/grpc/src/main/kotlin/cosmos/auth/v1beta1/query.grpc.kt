// Transform from cosmos/auth/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.auth.v1beta1

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

  private val accountsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAccountsRequest, QueryOuterClass.QueryAccountsResponse>
      = QueryGrpc.getAccountsMethod()!!

  private val accountDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAccountRequest, QueryOuterClass.QueryAccountResponse> =
      QueryGrpc.getAccountMethod()!!

  private val accountAddressByIDDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAccountAddressByIDRequest, QueryOuterClass.QueryAccountAddressByIDResponse>
      = QueryGrpc.getAccountAddressByIDMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val moduleAccountsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleAccountsRequest, QueryOuterClass.QueryModuleAccountsResponse>
      = QueryGrpc.getModuleAccountsMethod()!!

  private val moduleAccountByNameDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleAccountByNameRequest, QueryOuterClass.QueryModuleAccountByNameResponse>
      = QueryGrpc.getModuleAccountByNameMethod()!!

  private val bech32PrefixDescriptor:
      MethodDescriptor<QueryOuterClass.Bech32PrefixRequest, QueryOuterClass.Bech32PrefixResponse> =
      QueryGrpc.getBech32PrefixMethod()!!

  private val addressBytesToStringDescriptor:
      MethodDescriptor<QueryOuterClass.AddressBytesToStringRequest, QueryOuterClass.AddressBytesToStringResponse>
      = QueryGrpc.getAddressBytesToStringMethod()!!

  private val addressStringToBytesDescriptor:
      MethodDescriptor<QueryOuterClass.AddressStringToBytesRequest, QueryOuterClass.AddressStringToBytesResponse>
      = QueryGrpc.getAddressStringToBytesMethod()!!

  private val accountInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAccountInfoRequest, QueryOuterClass.QueryAccountInfoResponse>
      = QueryGrpc.getAccountInfoMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun accounts(request: QueryAccountsRequest): QueryAccountsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.Accounts is unimplemented"))

    public open suspend fun account(request: QueryAccountRequest): QueryAccountResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.Account is unimplemented"))

    public open suspend fun accountAddressByID(request: QueryAccountAddressByIDRequest):
        QueryAccountAddressByIDResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.AccountAddressByID is unimplemented"))

    public open suspend fun params(request: QueryParamsRequest): QueryParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.Params is unimplemented"))

    public open suspend fun moduleAccounts(request: QueryModuleAccountsRequest):
        QueryModuleAccountsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.ModuleAccounts is unimplemented"))

    public open suspend fun moduleAccountByName(request: QueryModuleAccountByNameRequest):
        QueryModuleAccountByNameResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.ModuleAccountByName is unimplemented"))

    public open suspend fun bech32Prefix(request: Bech32PrefixRequest): Bech32PrefixResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.Bech32Prefix is unimplemented"))

    public open suspend fun addressBytesToString(request: AddressBytesToStringRequest):
        AddressBytesToStringResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.AddressBytesToString is unimplemented"))

    public open suspend fun addressStringToBytes(request: AddressStringToBytesRequest):
        AddressStringToBytesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.AddressStringToBytes is unimplemented"))

    public open suspend fun accountInfo(request: QueryAccountInfoRequest): QueryAccountInfoResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.auth.v1beta1.Query.AccountInfo is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = accountsDescriptor,
    				implementation = {
        QueryAccountsResponseMapper.convert(accounts(QueryAccountsRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = accountDescriptor,
    				implementation = {
        QueryAccountResponseMapper.convert(account(QueryAccountRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = accountAddressByIDDescriptor,
    				implementation = {
        QueryAccountAddressByIDResponseMapper.convert(accountAddressByID(QueryAccountAddressByIDRequestMapper.convert(it)))
        },
    			)
    		)
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
    				descriptor = moduleAccountsDescriptor,
    				implementation = {
        QueryModuleAccountsResponseMapper.convert(moduleAccounts(QueryModuleAccountsRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = moduleAccountByNameDescriptor,
    				implementation = {
        QueryModuleAccountByNameResponseMapper.convert(moduleAccountByName(QueryModuleAccountByNameRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = bech32PrefixDescriptor,
    				implementation = {
        Bech32PrefixResponseMapper.convert(bech32Prefix(Bech32PrefixRequestMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = addressBytesToStringDescriptor,
    				implementation = {
        AddressBytesToStringResponseMapper.convert(addressBytesToString(AddressBytesToStringRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = addressStringToBytesDescriptor,
    				implementation = {
        AddressStringToBytesResponseMapper.convert(addressStringToBytes(AddressStringToBytesRequestMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = accountInfoDescriptor,
    				implementation = {
        QueryAccountInfoResponseMapper.convert(accountInfo(QueryAccountInfoRequestMapper.convert(it)))
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

    public suspend fun accounts(request: QueryAccountsRequest, metadata: Metadata = Metadata()):
        QueryAccountsResponse = QueryAccountsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, accountsDescriptor,
    			QueryAccountsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun account(request: QueryAccountRequest, metadata: Metadata = Metadata()):
        QueryAccountResponse = QueryAccountResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, accountDescriptor,
    			QueryAccountRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun accountAddressByID(request: QueryAccountAddressByIDRequest,
        metadata: Metadata = Metadata()): QueryAccountAddressByIDResponse =
        QueryAccountAddressByIDResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, accountAddressByIDDescriptor,
    			QueryAccountAddressByIDRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun params(request: QueryParamsRequest, metadata: Metadata = Metadata()):
        QueryParamsResponse = QueryParamsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, paramsDescriptor,
    			QueryParamsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun moduleAccounts(request: QueryModuleAccountsRequest, metadata: Metadata =
        Metadata()): QueryModuleAccountsResponse = QueryModuleAccountsResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, moduleAccountsDescriptor,
    			QueryModuleAccountsRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun moduleAccountByName(request: QueryModuleAccountByNameRequest,
        metadata: Metadata = Metadata()): QueryModuleAccountByNameResponse =
        QueryModuleAccountByNameResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, moduleAccountByNameDescriptor,
    			QueryModuleAccountByNameRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun bech32Prefix(request: Bech32PrefixRequest, metadata: Metadata = Metadata()):
        Bech32PrefixResponse = Bech32PrefixResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, bech32PrefixDescriptor,
    			Bech32PrefixRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun addressBytesToString(request: AddressBytesToStringRequest, metadata: Metadata
        = Metadata()): AddressBytesToStringResponse = AddressBytesToStringResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, addressBytesToStringDescriptor,
    			AddressBytesToStringRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun addressStringToBytes(request: AddressStringToBytesRequest, metadata: Metadata
        = Metadata()): AddressStringToBytesResponse = AddressStringToBytesResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, addressStringToBytesDescriptor,
    			AddressStringToBytesRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun accountInfo(request: QueryAccountInfoRequest, metadata: Metadata =
        Metadata()): QueryAccountInfoResponse = QueryAccountInfoResponseMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, accountInfoDescriptor,
    			QueryAccountInfoRequestMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
