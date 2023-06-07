// Transform from cosmos/bank/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.bank.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object QueryBalanceRequestConverter : ProtobufConverter<QueryBalanceRequest>

public expect object QueryBalanceResponseConverter : ProtobufConverter<QueryBalanceResponse>

public expect object QueryAllBalancesRequestConverter : ProtobufConverter<QueryAllBalancesRequest>

public expect object QueryAllBalancesResponseConverter : ProtobufConverter<QueryAllBalancesResponse>

public expect object QuerySpendableBalancesRequestConverter :
    ProtobufConverter<QuerySpendableBalancesRequest>

public expect object QuerySpendableBalancesResponseConverter :
    ProtobufConverter<QuerySpendableBalancesResponse>

public expect object QuerySpendableBalanceByDenomRequestConverter :
    ProtobufConverter<QuerySpendableBalanceByDenomRequest>

public expect object QuerySpendableBalanceByDenomResponseConverter :
    ProtobufConverter<QuerySpendableBalanceByDenomResponse>

public expect object QueryTotalSupplyRequestConverter : ProtobufConverter<QueryTotalSupplyRequest>

public expect object QueryTotalSupplyResponseConverter : ProtobufConverter<QueryTotalSupplyResponse>

public expect object QuerySupplyOfRequestConverter : ProtobufConverter<QuerySupplyOfRequest>

public expect object QuerySupplyOfResponseConverter : ProtobufConverter<QuerySupplyOfResponse>

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public expect object QueryDenomsMetadataRequestConverter :
    ProtobufConverter<QueryDenomsMetadataRequest>

public expect object QueryDenomsMetadataResponseConverter :
    ProtobufConverter<QueryDenomsMetadataResponse>

public expect object QueryDenomMetadataRequestConverter :
    ProtobufConverter<QueryDenomMetadataRequest>

public expect object QueryDenomMetadataResponseConverter :
    ProtobufConverter<QueryDenomMetadataResponse>

public expect object QueryDenomOwnersRequestConverter : ProtobufConverter<QueryDenomOwnersRequest>

public expect object DenomOwnerConverter : ProtobufConverter<DenomOwner>

public expect object QueryDenomOwnersResponseConverter : ProtobufConverter<QueryDenomOwnersResponse>

public expect object QuerySendEnabledRequestConverter : ProtobufConverter<QuerySendEnabledRequest>

public expect object QuerySendEnabledResponseConverter : ProtobufConverter<QuerySendEnabledResponse>
