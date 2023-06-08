// Transform from cosmos/crypto/keyring/v1/record.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.crypto.keyring.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object RecordConverter : ProtobufConverter<Record> {
  public object LocalConverter : ProtobufConverter<Record.Local>

  public object LedgerConverter : ProtobufConverter<Record.Ledger>

  public object MultiConverter : ProtobufConverter<Record.Multi>

  public object OfflineConverter : ProtobufConverter<Record.Offline>
}
