// Transform from cosmos/params/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.params.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public expect object QuerySubspacesRequestConverter : ProtobufConverter<QuerySubspacesRequest>

public expect object QuerySubspacesResponseConverter : ProtobufConverter<QuerySubspacesResponse>

public expect object SubspaceConverter : ProtobufConverter<Subspace>
