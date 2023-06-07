// Transform from cosmos/slashing/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.slashing.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public expect object QuerySigningInfoRequestConverter : ProtobufConverter<QuerySigningInfoRequest>

public expect object QuerySigningInfoResponseConverter : ProtobufConverter<QuerySigningInfoResponse>

public expect object QuerySigningInfosRequestConverter : ProtobufConverter<QuerySigningInfosRequest>

public expect object QuerySigningInfosResponseConverter :
    ProtobufConverter<QuerySigningInfosResponse>
