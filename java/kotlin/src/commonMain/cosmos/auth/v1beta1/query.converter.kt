// Transform from cosmos/auth/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.auth.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object QueryAccountsRequestConverter : ProtobufConverter<QueryAccountsRequest>

public expect object QueryAccountsResponseConverter : ProtobufConverter<QueryAccountsResponse>

public expect object QueryAccountRequestConverter : ProtobufConverter<QueryAccountRequest>

public expect object QueryAccountResponseConverter : ProtobufConverter<QueryAccountResponse>

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public expect object QueryModuleAccountsRequestConverter :
    ProtobufConverter<QueryModuleAccountsRequest>

public expect object QueryModuleAccountsResponseConverter :
    ProtobufConverter<QueryModuleAccountsResponse>

public expect object QueryModuleAccountByNameRequestConverter :
    ProtobufConverter<QueryModuleAccountByNameRequest>

public expect object QueryModuleAccountByNameResponseConverter :
    ProtobufConverter<QueryModuleAccountByNameResponse>

public expect object Bech32PrefixRequestConverter : ProtobufConverter<Bech32PrefixRequest>

public expect object Bech32PrefixResponseConverter : ProtobufConverter<Bech32PrefixResponse>

public expect object AddressBytesToStringRequestConverter :
    ProtobufConverter<AddressBytesToStringRequest>

public expect object AddressBytesToStringResponseConverter :
    ProtobufConverter<AddressBytesToStringResponse>

public expect object AddressStringToBytesRequestConverter :
    ProtobufConverter<AddressStringToBytesRequest>

public expect object AddressStringToBytesResponseConverter :
    ProtobufConverter<AddressStringToBytesResponse>

public expect object QueryAccountAddressByIDRequestConverter :
    ProtobufConverter<QueryAccountAddressByIDRequest>

public expect object QueryAccountAddressByIDResponseConverter :
    ProtobufConverter<QueryAccountAddressByIDResponse>

public expect object QueryAccountInfoRequestConverter : ProtobufConverter<QueryAccountInfoRequest>

public expect object QueryAccountInfoResponseConverter : ProtobufConverter<QueryAccountInfoResponse>
