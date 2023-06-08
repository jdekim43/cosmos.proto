// Transform from cosmos/base/query/v1beta1/pagination.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.base.query.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object PageRequestConverter : ProtobufConverter<PageRequest>

public expect object PageResponseConverter : ProtobufConverter<PageResponse>
