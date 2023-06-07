// Transform from cosmos/slashing/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.slashing.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object GenesisStateConverter : ProtobufConverter<GenesisState>

public expect object SigningInfoConverter : ProtobufConverter<SigningInfo>

public expect object ValidatorMissedBlocksConverter : ProtobufConverter<ValidatorMissedBlocks>

public expect object MissedBlockConverter : ProtobufConverter<MissedBlock>
