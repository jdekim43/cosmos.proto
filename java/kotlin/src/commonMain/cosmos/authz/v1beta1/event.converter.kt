// Transform from cosmos/authz/v1beta1/event.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.authz.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object EventGrantConverter : ProtobufConverter<EventGrant>

public expect object EventRevokeConverter : ProtobufConverter<EventRevoke>
