// Transform from cosmos/distribution/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.distribution.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MsgSetWithdrawAddressConverter : ProtobufConverter<MsgSetWithdrawAddress>

public expect object MsgSetWithdrawAddressResponseConverter :
    ProtobufConverter<MsgSetWithdrawAddressResponse>

public expect object MsgWithdrawDelegatorRewardConverter :
    ProtobufConverter<MsgWithdrawDelegatorReward>

public expect object MsgWithdrawDelegatorRewardResponseConverter :
    ProtobufConverter<MsgWithdrawDelegatorRewardResponse>

public expect object MsgWithdrawValidatorCommissionConverter :
    ProtobufConverter<MsgWithdrawValidatorCommission>

public expect object MsgWithdrawValidatorCommissionResponseConverter :
    ProtobufConverter<MsgWithdrawValidatorCommissionResponse>

public expect object MsgFundCommunityPoolConverter : ProtobufConverter<MsgFundCommunityPool>

public expect object MsgFundCommunityPoolResponseConverter :
    ProtobufConverter<MsgFundCommunityPoolResponse>

public expect object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams>

public expect object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>

public expect object MsgCommunityPoolSpendConverter : ProtobufConverter<MsgCommunityPoolSpend>

public expect object MsgCommunityPoolSpendResponseConverter :
    ProtobufConverter<MsgCommunityPoolSpendResponse>
