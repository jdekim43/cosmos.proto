// Transform from cosmos/auth/v1beta1/query.proto
package cosmos.auth.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestMapper
import cosmos.base.query.v1beta1.PageResponseMapper
import google.protobuf.AnyMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object QueryAccountsRequestMapper :
    ProtobufTypeMapper<QueryAccountsRequest, QueryOuterClass.QueryAccountsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAccountsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAccountsRequest> =
      QueryOuterClass.QueryAccountsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAccountsRequest): QueryAccountsRequest =
      QueryAccountsRequest(
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryAccountsRequest): QueryOuterClass.QueryAccountsRequest {
    val builder = QueryOuterClass.QueryAccountsRequest.newBuilder()
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAccountsResponseMapper :
    ProtobufTypeMapper<QueryAccountsResponse, QueryOuterClass.QueryAccountsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAccountsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAccountsResponse> =
      QueryOuterClass.QueryAccountsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAccountsResponse): QueryAccountsResponse =
      QueryAccountsResponse(
  	accounts = obj.accountsList.map { AnyMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryAccountsResponse): QueryOuterClass.QueryAccountsResponse {
    val builder = QueryOuterClass.QueryAccountsResponse.newBuilder()
    builder.addAllAccounts(obj.accounts.map { AnyMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAccountRequestMapper :
    ProtobufTypeMapper<QueryAccountRequest, QueryOuterClass.QueryAccountRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAccountRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAccountRequest> =
      QueryOuterClass.QueryAccountRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAccountRequest): QueryAccountRequest =
      QueryAccountRequest(
  	address = obj.address,
  )

  public override fun convert(obj: QueryAccountRequest): QueryOuterClass.QueryAccountRequest {
    val builder = QueryOuterClass.QueryAccountRequest.newBuilder()
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object QueryAccountResponseMapper :
    ProtobufTypeMapper<QueryAccountResponse, QueryOuterClass.QueryAccountResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAccountResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAccountResponse> =
      QueryOuterClass.QueryAccountResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAccountResponse): QueryAccountResponse =
      QueryAccountResponse(
  	account = AnyMapper.convert(obj.account),
  )

  public override fun convert(obj: QueryAccountResponse): QueryOuterClass.QueryAccountResponse {
    val builder = QueryOuterClass.QueryAccountResponse.newBuilder()
    builder.setAccount(AnyMapper.convert(obj.account))
    return builder.build()
  }
}

public object QueryParamsRequestMapper :
    ProtobufTypeMapper<QueryParamsRequest, QueryOuterClass.QueryParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsRequest> =
      QueryOuterClass.QueryParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsRequest): QueryParamsRequest =
      QueryParamsRequest(
  )

  public override fun convert(obj: QueryParamsRequest): QueryOuterClass.QueryParamsRequest {
    val builder = QueryOuterClass.QueryParamsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryParamsResponseMapper :
    ProtobufTypeMapper<QueryParamsResponse, QueryOuterClass.QueryParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsResponse> =
      QueryOuterClass.QueryParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsResponse): QueryParamsResponse =
      QueryParamsResponse(
  	params = ParamsMapper.convert(obj.params),
  )

  public override fun convert(obj: QueryParamsResponse): QueryOuterClass.QueryParamsResponse {
    val builder = QueryOuterClass.QueryParamsResponse.newBuilder()
    builder.setParams(ParamsMapper.convert(obj.params))
    return builder.build()
  }
}

public object QueryModuleAccountsRequestMapper :
    ProtobufTypeMapper<QueryModuleAccountsRequest, QueryOuterClass.QueryModuleAccountsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleAccountsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleAccountsRequest> =
      QueryOuterClass.QueryModuleAccountsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleAccountsRequest):
      QueryModuleAccountsRequest = QueryModuleAccountsRequest(
  )

  public override fun convert(obj: QueryModuleAccountsRequest):
      QueryOuterClass.QueryModuleAccountsRequest {
    val builder = QueryOuterClass.QueryModuleAccountsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryModuleAccountsResponseMapper :
    ProtobufTypeMapper<QueryModuleAccountsResponse, QueryOuterClass.QueryModuleAccountsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleAccountsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleAccountsResponse> =
      QueryOuterClass.QueryModuleAccountsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleAccountsResponse):
      QueryModuleAccountsResponse = QueryModuleAccountsResponse(
  	accounts = obj.accountsList.map { AnyMapper.convert(it) },
  )

  public override fun convert(obj: QueryModuleAccountsResponse):
      QueryOuterClass.QueryModuleAccountsResponse {
    val builder = QueryOuterClass.QueryModuleAccountsResponse.newBuilder()
    builder.addAllAccounts(obj.accounts.map { AnyMapper.convert(it) })
    return builder.build()
  }
}

public object QueryModuleAccountByNameRequestMapper :
    ProtobufTypeMapper<QueryModuleAccountByNameRequest, QueryOuterClass.QueryModuleAccountByNameRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleAccountByNameRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleAccountByNameRequest> =
      QueryOuterClass.QueryModuleAccountByNameRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleAccountByNameRequest):
      QueryModuleAccountByNameRequest = QueryModuleAccountByNameRequest(
  	name = obj.name,
  )

  public override fun convert(obj: QueryModuleAccountByNameRequest):
      QueryOuterClass.QueryModuleAccountByNameRequest {
    val builder = QueryOuterClass.QueryModuleAccountByNameRequest.newBuilder()
    builder.setName(obj.name)
    return builder.build()
  }
}

public object QueryModuleAccountByNameResponseMapper :
    ProtobufTypeMapper<QueryModuleAccountByNameResponse, QueryOuterClass.QueryModuleAccountByNameResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleAccountByNameResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleAccountByNameResponse> =
      QueryOuterClass.QueryModuleAccountByNameResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleAccountByNameResponse):
      QueryModuleAccountByNameResponse = QueryModuleAccountByNameResponse(
  	account = AnyMapper.convert(obj.account),
  )

  public override fun convert(obj: QueryModuleAccountByNameResponse):
      QueryOuterClass.QueryModuleAccountByNameResponse {
    val builder = QueryOuterClass.QueryModuleAccountByNameResponse.newBuilder()
    builder.setAccount(AnyMapper.convert(obj.account))
    return builder.build()
  }
}

public object Bech32PrefixRequestMapper :
    ProtobufTypeMapper<Bech32PrefixRequest, QueryOuterClass.Bech32PrefixRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.Bech32PrefixRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.Bech32PrefixRequest> =
      QueryOuterClass.Bech32PrefixRequest.parser()

  public override fun convert(obj: QueryOuterClass.Bech32PrefixRequest): Bech32PrefixRequest =
      Bech32PrefixRequest(
  )

  public override fun convert(obj: Bech32PrefixRequest): QueryOuterClass.Bech32PrefixRequest {
    val builder = QueryOuterClass.Bech32PrefixRequest.newBuilder()
    return builder.build()
  }
}

public object Bech32PrefixResponseMapper :
    ProtobufTypeMapper<Bech32PrefixResponse, QueryOuterClass.Bech32PrefixResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.Bech32PrefixResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.Bech32PrefixResponse> =
      QueryOuterClass.Bech32PrefixResponse.parser()

  public override fun convert(obj: QueryOuterClass.Bech32PrefixResponse): Bech32PrefixResponse =
      Bech32PrefixResponse(
  	bech32Prefix = obj.bech32Prefix,
  )

  public override fun convert(obj: Bech32PrefixResponse): QueryOuterClass.Bech32PrefixResponse {
    val builder = QueryOuterClass.Bech32PrefixResponse.newBuilder()
    builder.setBech32Prefix(obj.bech32Prefix)
    return builder.build()
  }
}

public object AddressBytesToStringRequestMapper :
    ProtobufTypeMapper<AddressBytesToStringRequest, QueryOuterClass.AddressBytesToStringRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.AddressBytesToStringRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.AddressBytesToStringRequest> =
      QueryOuterClass.AddressBytesToStringRequest.parser()

  public override fun convert(obj: QueryOuterClass.AddressBytesToStringRequest):
      AddressBytesToStringRequest = AddressBytesToStringRequest(
  	addressBytes = obj.addressBytes.toByteArray(),
  )

  public override fun convert(obj: AddressBytesToStringRequest):
      QueryOuterClass.AddressBytesToStringRequest {
    val builder = QueryOuterClass.AddressBytesToStringRequest.newBuilder()
    builder.setAddressBytes(ByteString.copyFrom(obj.addressBytes))
    return builder.build()
  }
}

public object AddressBytesToStringResponseMapper :
    ProtobufTypeMapper<AddressBytesToStringResponse, QueryOuterClass.AddressBytesToStringResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.AddressBytesToStringResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.AddressBytesToStringResponse> =
      QueryOuterClass.AddressBytesToStringResponse.parser()

  public override fun convert(obj: QueryOuterClass.AddressBytesToStringResponse):
      AddressBytesToStringResponse = AddressBytesToStringResponse(
  	addressString = obj.addressString,
  )

  public override fun convert(obj: AddressBytesToStringResponse):
      QueryOuterClass.AddressBytesToStringResponse {
    val builder = QueryOuterClass.AddressBytesToStringResponse.newBuilder()
    builder.setAddressString(obj.addressString)
    return builder.build()
  }
}

public object AddressStringToBytesRequestMapper :
    ProtobufTypeMapper<AddressStringToBytesRequest, QueryOuterClass.AddressStringToBytesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.AddressStringToBytesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.AddressStringToBytesRequest> =
      QueryOuterClass.AddressStringToBytesRequest.parser()

  public override fun convert(obj: QueryOuterClass.AddressStringToBytesRequest):
      AddressStringToBytesRequest = AddressStringToBytesRequest(
  	addressString = obj.addressString,
  )

  public override fun convert(obj: AddressStringToBytesRequest):
      QueryOuterClass.AddressStringToBytesRequest {
    val builder = QueryOuterClass.AddressStringToBytesRequest.newBuilder()
    builder.setAddressString(obj.addressString)
    return builder.build()
  }
}

public object AddressStringToBytesResponseMapper :
    ProtobufTypeMapper<AddressStringToBytesResponse, QueryOuterClass.AddressStringToBytesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.AddressStringToBytesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.AddressStringToBytesResponse> =
      QueryOuterClass.AddressStringToBytesResponse.parser()

  public override fun convert(obj: QueryOuterClass.AddressStringToBytesResponse):
      AddressStringToBytesResponse = AddressStringToBytesResponse(
  	addressBytes = obj.addressBytes.toByteArray(),
  )

  public override fun convert(obj: AddressStringToBytesResponse):
      QueryOuterClass.AddressStringToBytesResponse {
    val builder = QueryOuterClass.AddressStringToBytesResponse.newBuilder()
    builder.setAddressBytes(ByteString.copyFrom(obj.addressBytes))
    return builder.build()
  }
}

public object QueryAccountAddressByIDRequestMapper :
    ProtobufTypeMapper<QueryAccountAddressByIDRequest, QueryOuterClass.QueryAccountAddressByIDRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAccountAddressByIDRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAccountAddressByIDRequest> =
      QueryOuterClass.QueryAccountAddressByIDRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAccountAddressByIDRequest):
      QueryAccountAddressByIDRequest = QueryAccountAddressByIDRequest(
  	id = obj.id,
  	accountId = obj.accountId.asKotlinType,
  )

  public override fun convert(obj: QueryAccountAddressByIDRequest):
      QueryOuterClass.QueryAccountAddressByIDRequest {
    val builder = QueryOuterClass.QueryAccountAddressByIDRequest.newBuilder()
    builder.setId(obj.id)
    builder.setAccountId(obj.accountId.asJavaType)
    return builder.build()
  }
}

public object QueryAccountAddressByIDResponseMapper :
    ProtobufTypeMapper<QueryAccountAddressByIDResponse, QueryOuterClass.QueryAccountAddressByIDResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAccountAddressByIDResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAccountAddressByIDResponse> =
      QueryOuterClass.QueryAccountAddressByIDResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAccountAddressByIDResponse):
      QueryAccountAddressByIDResponse = QueryAccountAddressByIDResponse(
  	accountAddress = obj.accountAddress,
  )

  public override fun convert(obj: QueryAccountAddressByIDResponse):
      QueryOuterClass.QueryAccountAddressByIDResponse {
    val builder = QueryOuterClass.QueryAccountAddressByIDResponse.newBuilder()
    builder.setAccountAddress(obj.accountAddress)
    return builder.build()
  }
}

public object QueryAccountInfoRequestMapper :
    ProtobufTypeMapper<QueryAccountInfoRequest, QueryOuterClass.QueryAccountInfoRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAccountInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAccountInfoRequest> =
      QueryOuterClass.QueryAccountInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAccountInfoRequest): QueryAccountInfoRequest
      = QueryAccountInfoRequest(
  	address = obj.address,
  )

  public override fun convert(obj: QueryAccountInfoRequest):
      QueryOuterClass.QueryAccountInfoRequest {
    val builder = QueryOuterClass.QueryAccountInfoRequest.newBuilder()
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object QueryAccountInfoResponseMapper :
    ProtobufTypeMapper<QueryAccountInfoResponse, QueryOuterClass.QueryAccountInfoResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAccountInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAccountInfoResponse> =
      QueryOuterClass.QueryAccountInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAccountInfoResponse):
      QueryAccountInfoResponse = QueryAccountInfoResponse(
  	info = BaseAccountMapper.convert(obj.info),
  )

  public override fun convert(obj: QueryAccountInfoResponse):
      QueryOuterClass.QueryAccountInfoResponse {
    val builder = QueryOuterClass.QueryAccountInfoResponse.newBuilder()
    builder.setInfo(BaseAccountMapper.convert(obj.info))
    return builder.build()
  }
}
