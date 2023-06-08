// Transform from cosmos/vesting/v1beta1/vesting.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.vesting.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object BaseVestingAccountConverter : ProtobufConverter<BaseVestingAccount>

public expect object ContinuousVestingAccountConverter : ProtobufConverter<ContinuousVestingAccount>

public expect object DelayedVestingAccountConverter : ProtobufConverter<DelayedVestingAccount>

public expect object PeriodConverter : ProtobufConverter<Period>

public expect object PeriodicVestingAccountConverter : ProtobufConverter<PeriodicVestingAccount>

public expect object PermanentLockedAccountConverter : ProtobufConverter<PermanentLockedAccount>
