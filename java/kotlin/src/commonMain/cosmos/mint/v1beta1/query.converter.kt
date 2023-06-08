// Transform from cosmos/mint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.mint.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public expect object QueryInflationRequestConverter : ProtobufConverter<QueryInflationRequest>

public expect object QueryInflationResponseConverter : ProtobufConverter<QueryInflationResponse>

public expect object QueryAnnualProvisionsRequestConverter :
    ProtobufConverter<QueryAnnualProvisionsRequest>

public expect object QueryAnnualProvisionsResponseConverter :
    ProtobufConverter<QueryAnnualProvisionsResponse>
