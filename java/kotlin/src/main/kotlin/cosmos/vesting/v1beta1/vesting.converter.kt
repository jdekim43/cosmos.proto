// Transform from cosmos/vesting/v1beta1/vesting.proto
package cosmos.vesting.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.auth.v1beta1.BaseAccountMapper
import cosmos.base.v1beta1.CoinMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object BaseVestingAccountMapper :
    ProtobufTypeMapper<BaseVestingAccount, Vesting.BaseVestingAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Vesting.BaseVestingAccount.getDescriptor()

  public override val parser: Parser<Vesting.BaseVestingAccount> =
      Vesting.BaseVestingAccount.parser()

  public override fun convert(obj: Vesting.BaseVestingAccount): BaseVestingAccount =
      BaseVestingAccount(
  	baseAccount = BaseAccountMapper.convert(obj.baseAccount),
  	originalVesting = obj.originalVestingList.map { CoinMapper.convert(it) },
  	delegatedFree = obj.delegatedFreeList.map { CoinMapper.convert(it) },
  	delegatedVesting = obj.delegatedVestingList.map { CoinMapper.convert(it) },
  	endTime = obj.endTime,
  )

  public override fun convert(obj: BaseVestingAccount): Vesting.BaseVestingAccount {
    val builder = Vesting.BaseVestingAccount.newBuilder()
    builder.setBaseAccount(BaseAccountMapper.convert(obj.baseAccount))
    builder.addAllOriginalVesting(obj.originalVesting.map { CoinMapper.convert(it) })
    builder.addAllDelegatedFree(obj.delegatedFree.map { CoinMapper.convert(it) })
    builder.addAllDelegatedVesting(obj.delegatedVesting.map { CoinMapper.convert(it) })
    builder.setEndTime(obj.endTime)
    return builder.build()
  }
}

public object ContinuousVestingAccountMapper :
    ProtobufTypeMapper<ContinuousVestingAccount, Vesting.ContinuousVestingAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Vesting.ContinuousVestingAccount.getDescriptor()

  public override val parser: Parser<Vesting.ContinuousVestingAccount> =
      Vesting.ContinuousVestingAccount.parser()

  public override fun convert(obj: Vesting.ContinuousVestingAccount): ContinuousVestingAccount =
      ContinuousVestingAccount(
  	baseVestingAccount = BaseVestingAccountMapper.convert(obj.baseVestingAccount),
  	startTime = obj.startTime,
  )

  public override fun convert(obj: ContinuousVestingAccount): Vesting.ContinuousVestingAccount {
    val builder = Vesting.ContinuousVestingAccount.newBuilder()
    builder.setBaseVestingAccount(BaseVestingAccountMapper.convert(obj.baseVestingAccount))
    builder.setStartTime(obj.startTime)
    return builder.build()
  }
}

public object DelayedVestingAccountMapper :
    ProtobufTypeMapper<DelayedVestingAccount, Vesting.DelayedVestingAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Vesting.DelayedVestingAccount.getDescriptor()

  public override val parser: Parser<Vesting.DelayedVestingAccount> =
      Vesting.DelayedVestingAccount.parser()

  public override fun convert(obj: Vesting.DelayedVestingAccount): DelayedVestingAccount =
      DelayedVestingAccount(
  	baseVestingAccount = BaseVestingAccountMapper.convert(obj.baseVestingAccount),
  )

  public override fun convert(obj: DelayedVestingAccount): Vesting.DelayedVestingAccount {
    val builder = Vesting.DelayedVestingAccount.newBuilder()
    builder.setBaseVestingAccount(BaseVestingAccountMapper.convert(obj.baseVestingAccount))
    return builder.build()
  }
}

public object PeriodMapper : ProtobufTypeMapper<Period, Vesting.Period> {
  public override val descriptor: Descriptors.Descriptor = Vesting.Period.getDescriptor()

  public override val parser: Parser<Vesting.Period> = Vesting.Period.parser()

  public override fun convert(obj: Vesting.Period): Period = Period(
  	length = obj.length,
  	amount = obj.amountList.map { CoinMapper.convert(it) },
  )

  public override fun convert(obj: Period): Vesting.Period {
    val builder = Vesting.Period.newBuilder()
    builder.setLength(obj.length)
    builder.addAllAmount(obj.amount.map { CoinMapper.convert(it) })
    return builder.build()
  }
}

public object PeriodicVestingAccountMapper :
    ProtobufTypeMapper<PeriodicVestingAccount, Vesting.PeriodicVestingAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Vesting.PeriodicVestingAccount.getDescriptor()

  public override val parser: Parser<Vesting.PeriodicVestingAccount> =
      Vesting.PeriodicVestingAccount.parser()

  public override fun convert(obj: Vesting.PeriodicVestingAccount): PeriodicVestingAccount =
      PeriodicVestingAccount(
  	baseVestingAccount = BaseVestingAccountMapper.convert(obj.baseVestingAccount),
  	startTime = obj.startTime,
  	vestingPeriods = obj.vestingPeriodsList.map { PeriodMapper.convert(it) },
  )

  public override fun convert(obj: PeriodicVestingAccount): Vesting.PeriodicVestingAccount {
    val builder = Vesting.PeriodicVestingAccount.newBuilder()
    builder.setBaseVestingAccount(BaseVestingAccountMapper.convert(obj.baseVestingAccount))
    builder.setStartTime(obj.startTime)
    builder.addAllVestingPeriods(obj.vestingPeriods.map { PeriodMapper.convert(it) })
    return builder.build()
  }
}

public object PermanentLockedAccountMapper :
    ProtobufTypeMapper<PermanentLockedAccount, Vesting.PermanentLockedAccount> {
  public override val descriptor: Descriptors.Descriptor =
      Vesting.PermanentLockedAccount.getDescriptor()

  public override val parser: Parser<Vesting.PermanentLockedAccount> =
      Vesting.PermanentLockedAccount.parser()

  public override fun convert(obj: Vesting.PermanentLockedAccount): PermanentLockedAccount =
      PermanentLockedAccount(
  	baseVestingAccount = BaseVestingAccountMapper.convert(obj.baseVestingAccount),
  )

  public override fun convert(obj: PermanentLockedAccount): Vesting.PermanentLockedAccount {
    val builder = Vesting.PermanentLockedAccount.newBuilder()
    builder.setBaseVestingAccount(BaseVestingAccountMapper.convert(obj.baseVestingAccount))
    return builder.build()
  }
}
