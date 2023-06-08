// Transform from cosmos/authz/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.authz.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object GenericAuthorizationConverter : ProtobufConverter<GenericAuthorization>

public expect object GrantConverter : ProtobufConverter<Grant>

public expect object GrantAuthorizationConverter : ProtobufConverter<GrantAuthorization>

public expect object GrantQueueItemConverter : ProtobufConverter<GrantQueueItem>
