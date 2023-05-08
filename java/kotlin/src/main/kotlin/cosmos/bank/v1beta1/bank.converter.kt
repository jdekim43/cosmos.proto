// Transform from cosmos/bank/v1beta1/bank.proto
package cosmos.bank.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsMapper : ProtobufTypeMapper<Params, Bank.Params> {
  public override val descriptor: Descriptors.Descriptor = Bank.Params.getDescriptor()

  public override val parser: Parser<Bank.Params> = Bank.Params.parser()

  public override fun convert(obj: Bank.Params): Params = Params(
  	sendEnabled = obj.sendEnabledList.map { SendEnabledMapper.convert(it) },
  	defaultSendEnabled = obj.defaultSendEnabled,
  )

  public override fun convert(obj: Params): Bank.Params {
    val builder = Bank.Params.newBuilder()
    builder.addAllSendEnabled(obj.sendEnabled.map { SendEnabledMapper.convert(it) })
    builder.setDefaultSendEnabled(obj.defaultSendEnabled)
    return builder.build()
  }
}

public object SendEnabledMapper : ProtobufTypeMapper<SendEnabled, Bank.SendEnabled> {
  public override val descriptor: Descriptors.Descriptor = Bank.SendEnabled.getDescriptor()

  public override val parser: Parser<Bank.SendEnabled> = Bank.SendEnabled.parser()

  public override fun convert(obj: Bank.SendEnabled): SendEnabled = SendEnabled(
  	denom = obj.denom,
  	enabled = obj.enabled,
  )

  public override fun convert(obj: SendEnabled): Bank.SendEnabled {
    val builder = Bank.SendEnabled.newBuilder()
    builder.setDenom(obj.denom)
    builder.setEnabled(obj.enabled)
    return builder.build()
  }
}

public object InputMapper : ProtobufTypeMapper<Input, Bank.Input> {
  public override val descriptor: Descriptors.Descriptor = Bank.Input.getDescriptor()

  public override val parser: Parser<Bank.Input> = Bank.Input.parser()

  public override fun convert(obj: Bank.Input): Input = Input(
  	address = obj.address,
  	coins = obj.coinsList.map { CoinMapper.convert(it) },
  )

  public override fun convert(obj: Input): Bank.Input {
    val builder = Bank.Input.newBuilder()
    builder.setAddress(obj.address)
    builder.addAllCoins(obj.coins.map { CoinMapper.convert(it) })
    return builder.build()
  }
}

public object OutputMapper : ProtobufTypeMapper<Output, Bank.Output> {
  public override val descriptor: Descriptors.Descriptor = Bank.Output.getDescriptor()

  public override val parser: Parser<Bank.Output> = Bank.Output.parser()

  public override fun convert(obj: Bank.Output): Output = Output(
  	address = obj.address,
  	coins = obj.coinsList.map { CoinMapper.convert(it) },
  )

  public override fun convert(obj: Output): Bank.Output {
    val builder = Bank.Output.newBuilder()
    builder.setAddress(obj.address)
    builder.addAllCoins(obj.coins.map { CoinMapper.convert(it) })
    return builder.build()
  }
}

public object SupplyMapper : ProtobufTypeMapper<Supply, Bank.Supply> {
  public override val descriptor: Descriptors.Descriptor = Bank.Supply.getDescriptor()

  public override val parser: Parser<Bank.Supply> = Bank.Supply.parser()

  public override fun convert(obj: Bank.Supply): Supply = Supply(
  	total = obj.totalList.map { CoinMapper.convert(it) },
  )

  public override fun convert(obj: Supply): Bank.Supply {
    val builder = Bank.Supply.newBuilder()
    builder.addAllTotal(obj.total.map { CoinMapper.convert(it) })
    return builder.build()
  }
}

public object DenomUnitMapper : ProtobufTypeMapper<DenomUnit, Bank.DenomUnit> {
  public override val descriptor: Descriptors.Descriptor = Bank.DenomUnit.getDescriptor()

  public override val parser: Parser<Bank.DenomUnit> = Bank.DenomUnit.parser()

  public override fun convert(obj: Bank.DenomUnit): DenomUnit = DenomUnit(
  	denom = obj.denom,
  	exponent = obj.exponent.asKotlinType,
  	aliases = obj.aliasesList.map { it },
  )

  public override fun convert(obj: DenomUnit): Bank.DenomUnit {
    val builder = Bank.DenomUnit.newBuilder()
    builder.setDenom(obj.denom)
    builder.setExponent(obj.exponent.asJavaType)
    builder.addAllAliases(obj.aliases.map { it })
    return builder.build()
  }
}

public object MetadataMapper : ProtobufTypeMapper<Metadata, Bank.Metadata> {
  public override val descriptor: Descriptors.Descriptor = Bank.Metadata.getDescriptor()

  public override val parser: Parser<Bank.Metadata> = Bank.Metadata.parser()

  public override fun convert(obj: Bank.Metadata): Metadata = Metadata(
  	description = obj.description,
  	denomUnits = obj.denomUnitsList.map { DenomUnitMapper.convert(it) },
  	base = obj.base,
  	display = obj.display,
  	name = obj.name,
  	symbol = obj.symbol,
  	uri = obj.uri,
  	uriHash = obj.uriHash,
  )

  public override fun convert(obj: Metadata): Bank.Metadata {
    val builder = Bank.Metadata.newBuilder()
    builder.setDescription(obj.description)
    builder.addAllDenomUnits(obj.denomUnits.map { DenomUnitMapper.convert(it) })
    builder.setBase(obj.base)
    builder.setDisplay(obj.display)
    builder.setName(obj.name)
    builder.setSymbol(obj.symbol)
    builder.setUri(obj.uri)
    builder.setUriHash(obj.uriHash)
    return builder.build()
  }
}