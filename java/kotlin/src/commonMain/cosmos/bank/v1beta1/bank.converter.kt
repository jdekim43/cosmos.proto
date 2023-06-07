// Transform from cosmos/bank/v1beta1/bank.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.bank.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object ParamsConverter : ProtobufConverter<Params>

public expect object SendEnabledConverter : ProtobufConverter<SendEnabled>

public expect object InputConverter : ProtobufConverter<Input>

public expect object OutputConverter : ProtobufConverter<Output>

public expect object SupplyConverter : ProtobufConverter<Supply>

public expect object DenomUnitConverter : ProtobufConverter<DenomUnit>

public expect object MetadataConverter : ProtobufConverter<Metadata>
