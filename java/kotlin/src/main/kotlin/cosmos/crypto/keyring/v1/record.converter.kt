// Transform from cosmos/crypto/keyring/v1/record.proto
package cosmos.crypto.keyring.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.crypto.hd.v1.BIP44ParamsMapper
import google.protobuf.AnyMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object RecordMapper : ProtobufTypeMapper<Record, RecordOuterClass.Record> {
  public override val descriptor: Descriptors.Descriptor = RecordOuterClass.Record.getDescriptor()

  public override val parser: Parser<RecordOuterClass.Record> = RecordOuterClass.Record.parser()

  public override fun convert(obj: RecordOuterClass.Record): Record = Record(
  	name = obj.name,
  	pubKey = AnyMapper.convert(obj.pubKey),
  	item = mapOf(
  3 to { Record.ItemOneOf.Local(LocalMapper.convert(obj.local)) },
  4 to { Record.ItemOneOf.Ledger(LedgerMapper.convert(obj.ledger)) },
  5 to { Record.ItemOneOf.Multi(MultiMapper.convert(obj.multi)) },
  6 to { Record.ItemOneOf.Offline(OfflineMapper.convert(obj.offline)) },
  ).getValue(obj.itemCase.number)(),
  )

  public override fun convert(obj: Record): RecordOuterClass.Record {
    val builder = RecordOuterClass.Record.newBuilder()
    builder.setName(obj.name)
    builder.setPubKey(AnyMapper.convert(obj.pubKey))
    when (obj.item) {
      is Record.ItemOneOf.Local -> builder.setLocal(LocalMapper.convert(obj.item.value))
      is Record.ItemOneOf.Ledger -> builder.setLedger(LedgerMapper.convert(obj.item.value))
      is Record.ItemOneOf.Multi -> builder.setMulti(MultiMapper.convert(obj.item.value))
      is Record.ItemOneOf.Offline -> builder.setOffline(OfflineMapper.convert(obj.item.value))
    }
    return builder.build()
  }

  public object LocalMapper : ProtobufTypeMapper<Record.Local, RecordOuterClass.Record.Local> {
    public override val descriptor: Descriptors.Descriptor =
        RecordOuterClass.Record.Local.getDescriptor()

    public override val parser: Parser<RecordOuterClass.Record.Local> =
        RecordOuterClass.Record.Local.parser()

    public override fun convert(obj: RecordOuterClass.Record.Local): Record.Local = Record.Local(
    	privKey = AnyMapper.convert(obj.privKey),
    )

    public override fun convert(obj: Record.Local): RecordOuterClass.Record.Local {
      val builder = RecordOuterClass.Record.Local.newBuilder()
      builder.setPrivKey(AnyMapper.convert(obj.privKey))
      return builder.build()
    }
  }

  public object LedgerMapper : ProtobufTypeMapper<Record.Ledger, RecordOuterClass.Record.Ledger> {
    public override val descriptor: Descriptors.Descriptor =
        RecordOuterClass.Record.Ledger.getDescriptor()

    public override val parser: Parser<RecordOuterClass.Record.Ledger> =
        RecordOuterClass.Record.Ledger.parser()

    public override fun convert(obj: RecordOuterClass.Record.Ledger): Record.Ledger = Record.Ledger(
    	path = BIP44ParamsMapper.convert(obj.path),
    )

    public override fun convert(obj: Record.Ledger): RecordOuterClass.Record.Ledger {
      val builder = RecordOuterClass.Record.Ledger.newBuilder()
      builder.setPath(BIP44ParamsMapper.convert(obj.path))
      return builder.build()
    }
  }

  public object MultiMapper : ProtobufTypeMapper<Record.Multi, RecordOuterClass.Record.Multi> {
    public override val descriptor: Descriptors.Descriptor =
        RecordOuterClass.Record.Multi.getDescriptor()

    public override val parser: Parser<RecordOuterClass.Record.Multi> =
        RecordOuterClass.Record.Multi.parser()

    public override fun convert(obj: RecordOuterClass.Record.Multi): Record.Multi = Record.Multi(
    )

    public override fun convert(obj: Record.Multi): RecordOuterClass.Record.Multi {
      val builder = RecordOuterClass.Record.Multi.newBuilder()
      return builder.build()
    }
  }

  public object OfflineMapper : ProtobufTypeMapper<Record.Offline, RecordOuterClass.Record.Offline>
      {
    public override val descriptor: Descriptors.Descriptor =
        RecordOuterClass.Record.Offline.getDescriptor()

    public override val parser: Parser<RecordOuterClass.Record.Offline> =
        RecordOuterClass.Record.Offline.parser()

    public override fun convert(obj: RecordOuterClass.Record.Offline): Record.Offline =
        Record.Offline(
    )

    public override fun convert(obj: Record.Offline): RecordOuterClass.Record.Offline {
      val builder = RecordOuterClass.Record.Offline.newBuilder()
      return builder.build()
    }
  }
}
