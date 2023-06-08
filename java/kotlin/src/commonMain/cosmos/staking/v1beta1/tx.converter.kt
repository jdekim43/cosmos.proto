// Transform from cosmos/staking/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.staking.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MsgCreateValidatorConverter : ProtobufConverter<MsgCreateValidator>

public expect object MsgCreateValidatorResponseConverter :
    ProtobufConverter<MsgCreateValidatorResponse>

public expect object MsgEditValidatorConverter : ProtobufConverter<MsgEditValidator>

public expect object MsgEditValidatorResponseConverter : ProtobufConverter<MsgEditValidatorResponse>

public expect object MsgDelegateConverter : ProtobufConverter<MsgDelegate>

public expect object MsgDelegateResponseConverter : ProtobufConverter<MsgDelegateResponse>

public expect object MsgBeginRedelegateConverter : ProtobufConverter<MsgBeginRedelegate>

public expect object MsgBeginRedelegateResponseConverter :
    ProtobufConverter<MsgBeginRedelegateResponse>

public expect object MsgUndelegateConverter : ProtobufConverter<MsgUndelegate>

public expect object MsgUndelegateResponseConverter : ProtobufConverter<MsgUndelegateResponse>

public expect object MsgCancelUnbondingDelegationConverter :
    ProtobufConverter<MsgCancelUnbondingDelegation>

public expect object MsgCancelUnbondingDelegationResponseConverter :
    ProtobufConverter<MsgCancelUnbondingDelegationResponse>

public expect object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams>

public expect object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
