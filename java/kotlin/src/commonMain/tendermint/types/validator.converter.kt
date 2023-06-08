// Transform from tendermint/types/validator.proto
@file:GeneratorVersion(version = "0.2.2")

package tendermint.types

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object ValidatorSetConverter : ProtobufConverter<ValidatorSet>

public expect object ValidatorConverter : ProtobufConverter<Validator>

public expect object SimpleValidatorConverter : ProtobufConverter<SimpleValidator>
