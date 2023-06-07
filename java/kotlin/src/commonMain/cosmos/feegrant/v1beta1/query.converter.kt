// Transform from cosmos/feegrant/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.feegrant.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object QueryAllowanceRequestConverter : ProtobufConverter<QueryAllowanceRequest>

public expect object QueryAllowanceResponseConverter : ProtobufConverter<QueryAllowanceResponse>

public expect object QueryAllowancesRequestConverter : ProtobufConverter<QueryAllowancesRequest>

public expect object QueryAllowancesResponseConverter : ProtobufConverter<QueryAllowancesResponse>

public expect object QueryAllowancesByGranterRequestConverter :
    ProtobufConverter<QueryAllowancesByGranterRequest>

public expect object QueryAllowancesByGranterResponseConverter :
    ProtobufConverter<QueryAllowancesByGranterResponse>
