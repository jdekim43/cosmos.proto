// Transform from cosmos/staking/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.staking.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object StakeAuthorizationConverter : ProtobufConverter<StakeAuthorization> {
  public object ValidatorsConverter : ProtobufConverter<StakeAuthorization.Validators>
}
