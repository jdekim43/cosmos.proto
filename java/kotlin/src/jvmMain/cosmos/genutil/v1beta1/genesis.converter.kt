// Transform from cosmos/genutil/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.genutil.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter
