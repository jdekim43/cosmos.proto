// Transform from cosmos/bank/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.bank.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object GenesisStateConverter : ProtobufConverter<GenesisState>

public expect object BalanceConverter : ProtobufConverter<Balance>