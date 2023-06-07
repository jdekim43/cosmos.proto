// Transform from cosmos/crypto/keyring/v1/record.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.crypto.keyring.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object RecordConverter : ProtobufConverter<Record> {
  public expect object LocalConverter : ProtobufConverter<Record.Local>

  public expect object LedgerConverter : ProtobufConverter<Record.Ledger>

  public expect object MultiConverter : ProtobufConverter<Record.Multi>

  public expect object OfflineConverter : ProtobufConverter<Record.Offline>
}
