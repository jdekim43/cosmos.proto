// Transform from tendermint/crypto/proof.proto
@file:GeneratorVersion(version = "0.2.1")

package tendermint.crypto

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object ProofConverter : ProtobufConverter<Proof>

public expect object ValueOpConverter : ProtobufConverter<ValueOp>

public expect object DominoOpConverter : ProtobufConverter<DominoOp>

public expect object ProofOpConverter : ProtobufConverter<ProofOp>

public expect object ProofOpsConverter : ProtobufConverter<ProofOps>
