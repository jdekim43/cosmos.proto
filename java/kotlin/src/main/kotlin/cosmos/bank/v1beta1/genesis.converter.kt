// Transform from cosmos/bank/v1beta1/genesis.proto
package cosmos.bank.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateMapper : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsMapper.convert(obj.params),
  	balances = obj.balancesList.map { BalanceMapper.convert(it) },
  	supply = obj.supplyList.map { CoinMapper.convert(it) },
  	denomMetadata = obj.denomMetadataList.map { MetadataMapper.convert(it) },
  	sendEnabled = obj.sendEnabledList.map { SendEnabledMapper.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsMapper.convert(obj.params))
    builder.addAllBalances(obj.balances.map { BalanceMapper.convert(it) })
    builder.addAllSupply(obj.supply.map { CoinMapper.convert(it) })
    builder.addAllDenomMetadata(obj.denomMetadata.map { MetadataMapper.convert(it) })
    builder.addAllSendEnabled(obj.sendEnabled.map { SendEnabledMapper.convert(it) })
    return builder.build()
  }
}

public object BalanceMapper : ProtobufTypeMapper<Balance, Genesis.Balance> {
  public override val descriptor: Descriptors.Descriptor = Genesis.Balance.getDescriptor()

  public override val parser: Parser<Genesis.Balance> = Genesis.Balance.parser()

  public override fun convert(obj: Genesis.Balance): Balance = Balance(
  	address = obj.address,
  	coins = obj.coinsList.map { CoinMapper.convert(it) },
  )

  public override fun convert(obj: Balance): Genesis.Balance {
    val builder = Genesis.Balance.newBuilder()
    builder.setAddress(obj.address)
    builder.addAllCoins(obj.coins.map { CoinMapper.convert(it) })
    return builder.build()
  }
}
