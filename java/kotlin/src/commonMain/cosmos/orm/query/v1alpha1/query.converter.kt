// Transform from cosmos/orm/query/v1alpha1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.orm.query.v1alpha1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object GetRequestConverter : ProtobufConverter<GetRequest>

public expect object GetResponseConverter : ProtobufConverter<GetResponse>

public expect object ListRequestConverter : ProtobufConverter<ListRequest> {
  public expect object PrefixConverter : ProtobufConverter<ListRequest.Prefix>

  public expect object RangeConverter : ProtobufConverter<ListRequest.Range>
}

public expect object ListResponseConverter : ProtobufConverter<ListResponse>

public expect object IndexValueConverter : ProtobufConverter<IndexValue>
