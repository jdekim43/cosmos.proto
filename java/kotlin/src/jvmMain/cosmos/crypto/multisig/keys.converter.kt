// Transform from cosmos/crypto/multisig/keys.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.crypto.multisig

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object LegacyAminoPubKeyConverter : ProtobufConverter<LegacyAminoPubKey> by
    LegacyAminoPubKeyJvmConverter
