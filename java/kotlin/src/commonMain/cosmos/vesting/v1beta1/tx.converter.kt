// Transform from cosmos/vesting/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.vesting.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MsgCreateVestingAccountConverter : ProtobufConverter<MsgCreateVestingAccount>

public expect object MsgCreateVestingAccountResponseConverter :
    ProtobufConverter<MsgCreateVestingAccountResponse>

public expect object MsgCreatePermanentLockedAccountConverter :
    ProtobufConverter<MsgCreatePermanentLockedAccount>

public expect object MsgCreatePermanentLockedAccountResponseConverter :
    ProtobufConverter<MsgCreatePermanentLockedAccountResponse>

public expect object MsgCreatePeriodicVestingAccountConverter :
    ProtobufConverter<MsgCreatePeriodicVestingAccount>

public expect object MsgCreatePeriodicVestingAccountResponseConverter :
    ProtobufConverter<MsgCreatePeriodicVestingAccountResponse>
