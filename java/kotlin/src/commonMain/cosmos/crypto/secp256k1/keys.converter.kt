// Transform from cosmos/crypto/secp256k1/keys.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.crypto.secp256k1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object PubKeyConverter : ProtobufConverter<PubKey>

public expect object PrivKeyConverter : ProtobufConverter<PrivKey>
