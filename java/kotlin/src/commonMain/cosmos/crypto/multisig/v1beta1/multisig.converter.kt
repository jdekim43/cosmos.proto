// Transform from cosmos/crypto/multisig/v1beta1/multisig.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.crypto.multisig.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MultiSignatureConverter : ProtobufConverter<MultiSignature>

public expect object CompactBitArrayConverter : ProtobufConverter<CompactBitArray>
