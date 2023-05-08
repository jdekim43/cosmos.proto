// Transform from cosmos/feegrant/v1beta1/feegrant.proto
package cosmos.feegrant.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinMapper
import google.protobuf.AnyMapper
import google.protobuf.DurationMapper
import google.protobuf.TimestampMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object BasicAllowanceMapper : ProtobufTypeMapper<BasicAllowance, Feegrant.BasicAllowance> {
  public override val descriptor: Descriptors.Descriptor = Feegrant.BasicAllowance.getDescriptor()

  public override val parser: Parser<Feegrant.BasicAllowance> = Feegrant.BasicAllowance.parser()

  public override fun convert(obj: Feegrant.BasicAllowance): BasicAllowance = BasicAllowance(
  	spendLimit = obj.spendLimitList.map { CoinMapper.convert(it) },
  	expiration = TimestampMapper.convert(obj.expiration),
  )

  public override fun convert(obj: BasicAllowance): Feegrant.BasicAllowance {
    val builder = Feegrant.BasicAllowance.newBuilder()
    builder.addAllSpendLimit(obj.spendLimit.map { CoinMapper.convert(it) })
    builder.setExpiration(TimestampMapper.convert(obj.expiration))
    return builder.build()
  }
}

public object PeriodicAllowanceMapper :
    ProtobufTypeMapper<PeriodicAllowance, Feegrant.PeriodicAllowance> {
  public override val descriptor: Descriptors.Descriptor =
      Feegrant.PeriodicAllowance.getDescriptor()

  public override val parser: Parser<Feegrant.PeriodicAllowance> =
      Feegrant.PeriodicAllowance.parser()

  public override fun convert(obj: Feegrant.PeriodicAllowance): PeriodicAllowance =
      PeriodicAllowance(
  	basic = BasicAllowanceMapper.convert(obj.basic),
  	period = DurationMapper.convert(obj.period),
  	periodSpendLimit = obj.periodSpendLimitList.map { CoinMapper.convert(it) },
  	periodCanSpend = obj.periodCanSpendList.map { CoinMapper.convert(it) },
  	periodReset = TimestampMapper.convert(obj.periodReset),
  )

  public override fun convert(obj: PeriodicAllowance): Feegrant.PeriodicAllowance {
    val builder = Feegrant.PeriodicAllowance.newBuilder()
    builder.setBasic(BasicAllowanceMapper.convert(obj.basic))
    builder.setPeriod(DurationMapper.convert(obj.period))
    builder.addAllPeriodSpendLimit(obj.periodSpendLimit.map { CoinMapper.convert(it) })
    builder.addAllPeriodCanSpend(obj.periodCanSpend.map { CoinMapper.convert(it) })
    builder.setPeriodReset(TimestampMapper.convert(obj.periodReset))
    return builder.build()
  }
}

public object AllowedMsgAllowanceMapper :
    ProtobufTypeMapper<AllowedMsgAllowance, Feegrant.AllowedMsgAllowance> {
  public override val descriptor: Descriptors.Descriptor =
      Feegrant.AllowedMsgAllowance.getDescriptor()

  public override val parser: Parser<Feegrant.AllowedMsgAllowance> =
      Feegrant.AllowedMsgAllowance.parser()

  public override fun convert(obj: Feegrant.AllowedMsgAllowance): AllowedMsgAllowance =
      AllowedMsgAllowance(
  	allowance = AnyMapper.convert(obj.allowance),
  	allowedMessages = obj.allowedMessagesList.map { it },
  )

  public override fun convert(obj: AllowedMsgAllowance): Feegrant.AllowedMsgAllowance {
    val builder = Feegrant.AllowedMsgAllowance.newBuilder()
    builder.setAllowance(AnyMapper.convert(obj.allowance))
    builder.addAllAllowedMessages(obj.allowedMessages.map { it })
    return builder.build()
  }
}

public object GrantMapper : ProtobufTypeMapper<Grant, Feegrant.Grant> {
  public override val descriptor: Descriptors.Descriptor = Feegrant.Grant.getDescriptor()

  public override val parser: Parser<Feegrant.Grant> = Feegrant.Grant.parser()

  public override fun convert(obj: Feegrant.Grant): Grant = Grant(
  	granter = obj.granter,
  	grantee = obj.grantee,
  	allowance = AnyMapper.convert(obj.allowance),
  )

  public override fun convert(obj: Grant): Feegrant.Grant {
    val builder = Feegrant.Grant.newBuilder()
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    builder.setAllowance(AnyMapper.convert(obj.allowance))
    return builder.build()
  }
}
