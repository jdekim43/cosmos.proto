// Transform from cosmos/mint/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.mint.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter
