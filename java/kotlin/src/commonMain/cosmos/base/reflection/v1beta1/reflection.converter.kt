// Transform from cosmos/base/reflection/v1beta1/reflection.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.base.reflection.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object ListAllInterfacesRequestConverter : ProtobufConverter<ListAllInterfacesRequest>

public expect object ListAllInterfacesResponseConverter :
    ProtobufConverter<ListAllInterfacesResponse>

public expect object ListImplementationsRequestConverter :
    ProtobufConverter<ListImplementationsRequest>

public expect object ListImplementationsResponseConverter :
    ProtobufConverter<ListImplementationsResponse>
