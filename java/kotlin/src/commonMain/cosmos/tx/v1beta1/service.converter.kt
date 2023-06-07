// Transform from cosmos/tx/v1beta1/service.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.tx.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object GetTxsEventRequestConverter : ProtobufConverter<GetTxsEventRequest>

public expect object GetTxsEventResponseConverter : ProtobufConverter<GetTxsEventResponse>

public expect object BroadcastTxRequestConverter : ProtobufConverter<BroadcastTxRequest>

public expect object BroadcastTxResponseConverter : ProtobufConverter<BroadcastTxResponse>

public expect object SimulateRequestConverter : ProtobufConverter<SimulateRequest>

public expect object SimulateResponseConverter : ProtobufConverter<SimulateResponse>

public expect object GetTxRequestConverter : ProtobufConverter<GetTxRequest>

public expect object GetTxResponseConverter : ProtobufConverter<GetTxResponse>

public expect object GetBlockWithTxsRequestConverter : ProtobufConverter<GetBlockWithTxsRequest>

public expect object GetBlockWithTxsResponseConverter : ProtobufConverter<GetBlockWithTxsResponse>

public expect object TxDecodeRequestConverter : ProtobufConverter<TxDecodeRequest>

public expect object TxDecodeResponseConverter : ProtobufConverter<TxDecodeResponse>

public expect object TxEncodeRequestConverter : ProtobufConverter<TxEncodeRequest>

public expect object TxEncodeResponseConverter : ProtobufConverter<TxEncodeResponse>

public expect object TxEncodeAminoRequestConverter : ProtobufConverter<TxEncodeAminoRequest>

public expect object TxEncodeAminoResponseConverter : ProtobufConverter<TxEncodeAminoResponse>

public expect object TxDecodeAminoRequestConverter : ProtobufConverter<TxDecodeAminoRequest>

public expect object TxDecodeAminoResponseConverter : ProtobufConverter<TxDecodeAminoResponse>
