// Transform from cosmos/base/tendermint/v1beta1/types.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.base.tendermint.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object BlockConverter : ProtobufConverter<Block>

public expect object HeaderConverter : ProtobufConverter<Header>
