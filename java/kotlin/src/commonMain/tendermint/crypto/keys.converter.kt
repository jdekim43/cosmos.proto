// Transform from tendermint/crypto/keys.proto
@file:GeneratorVersion(version = "0.2.2")

package tendermint.crypto

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object PublicKeyConverter : ProtobufConverter<PublicKey>
