// Transform from cosmos/base/abci/v1beta1/abci.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.base.abci.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object TxResponseConverter : ProtobufConverter<TxResponse>

public expect object ABCIMessageLogConverter : ProtobufConverter<ABCIMessageLog>

public expect object StringEventConverter : ProtobufConverter<StringEvent>

public expect object AttributeConverter : ProtobufConverter<Attribute>

public expect object GasInfoConverter : ProtobufConverter<GasInfo>

public expect object ResultConverter : ProtobufConverter<Result>

public expect object SimulationResponseConverter : ProtobufConverter<SimulationResponse>

public expect object MsgDataConverter : ProtobufConverter<MsgData>

public expect object TxMsgDataConverter : ProtobufConverter<TxMsgData>

public expect object SearchTxsResultConverter : ProtobufConverter<SearchTxsResult>
