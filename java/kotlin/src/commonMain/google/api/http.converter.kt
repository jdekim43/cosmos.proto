// Transform from google/api/http.proto
@file:GeneratorVersion(version = "0.2.1")

package google.api

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object HttpConverter : ProtobufConverter<Http>

public expect object HttpRuleConverter : ProtobufConverter<HttpRule>

public expect object CustomHttpPatternConverter : ProtobufConverter<CustomHttpPattern>
