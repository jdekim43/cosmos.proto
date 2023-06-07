// Transform from cosmos/tx/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.tx.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object TxConverter : ProtobufConverter<Tx>

public expect object TxRawConverter : ProtobufConverter<TxRaw>

public expect object SignDocConverter : ProtobufConverter<SignDoc>

public expect object SignDocDirectAuxConverter : ProtobufConverter<SignDocDirectAux>

public expect object TxBodyConverter : ProtobufConverter<TxBody>

public expect object AuthInfoConverter : ProtobufConverter<AuthInfo>

public expect object SignerInfoConverter : ProtobufConverter<SignerInfo>

public expect object ModeInfoConverter : ProtobufConverter<ModeInfo> {
  public expect object SingleConverter : ProtobufConverter<ModeInfo.Single>

  public expect object MultiConverter : ProtobufConverter<ModeInfo.Multi>
}

public expect object FeeConverter : ProtobufConverter<Fee>

public expect object TipConverter : ProtobufConverter<Tip>

public expect object AuxSignerDataConverter : ProtobufConverter<AuxSignerData>
