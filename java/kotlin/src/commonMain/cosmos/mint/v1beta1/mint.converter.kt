// Transform from cosmos/mint/v1beta1/mint.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.mint.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MinterConverter : ProtobufConverter<Minter>

public expect object ParamsConverter : ProtobufConverter<Params>
