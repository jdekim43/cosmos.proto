// Transform from cosmos/authz/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.authz.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object QueryGrantsRequestConverter : ProtobufConverter<QueryGrantsRequest>

public expect object QueryGrantsResponseConverter : ProtobufConverter<QueryGrantsResponse>

public expect object QueryGranterGrantsRequestConverter :
    ProtobufConverter<QueryGranterGrantsRequest>

public expect object QueryGranterGrantsResponseConverter :
    ProtobufConverter<QueryGranterGrantsResponse>

public expect object QueryGranteeGrantsRequestConverter :
    ProtobufConverter<QueryGranteeGrantsRequest>

public expect object QueryGranteeGrantsResponseConverter :
    ProtobufConverter<QueryGranteeGrantsResponse>
