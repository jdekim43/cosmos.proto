// Transform from cosmos/feegrant/v1beta1/feegrant.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.feegrant.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import google.protobuf.AnyJvmConverter
import google.protobuf.DurationJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object BasicAllowanceJvmConverter :
    ProtobufTypeMapper<BasicAllowance, Feegrant.BasicAllowance> {
  public override val descriptor: Descriptors.Descriptor = Feegrant.BasicAllowance.getDescriptor()

  public override val parser: Parser<Feegrant.BasicAllowance> = Feegrant.BasicAllowance.parser()

  public override fun convert(obj: Feegrant.BasicAllowance): BasicAllowance = BasicAllowance(
  	spendLimit = obj.spendLimitList.map { CoinJvmConverter.convert(it) },
  	expiration = TimestampJvmConverter.convert(obj.expiration),
  )

  public override fun convert(obj: BasicAllowance): Feegrant.BasicAllowance {
    val builder = Feegrant.BasicAllowance.newBuilder()
    builder.addAllSpendLimit(obj.spendLimit.map { CoinJvmConverter.convert(it) })
    builder.setExpiration(TimestampJvmConverter.convert(obj.expiration))
    return builder.build()
  }
}

public object PeriodicAllowanceJvmConverter :
    ProtobufTypeMapper<PeriodicAllowance, Feegrant.PeriodicAllowance> {
  public override val descriptor: Descriptors.Descriptor =
      Feegrant.PeriodicAllowance.getDescriptor()

  public override val parser: Parser<Feegrant.PeriodicAllowance> =
      Feegrant.PeriodicAllowance.parser()

  public override fun convert(obj: Feegrant.PeriodicAllowance): PeriodicAllowance =
      PeriodicAllowance(
  	basic = BasicAllowanceJvmConverter.convert(obj.basic),
  	period = DurationJvmConverter.convert(obj.period),
  	periodSpendLimit = obj.periodSpendLimitList.map { CoinJvmConverter.convert(it) },
  	periodCanSpend = obj.periodCanSpendList.map { CoinJvmConverter.convert(it) },
  	periodReset = TimestampJvmConverter.convert(obj.periodReset),
  )

  public override fun convert(obj: PeriodicAllowance): Feegrant.PeriodicAllowance {
    val builder = Feegrant.PeriodicAllowance.newBuilder()
    builder.setBasic(BasicAllowanceJvmConverter.convert(obj.basic))
    builder.setPeriod(DurationJvmConverter.convert(obj.period))
    builder.addAllPeriodSpendLimit(obj.periodSpendLimit.map { CoinJvmConverter.convert(it) })
    builder.addAllPeriodCanSpend(obj.periodCanSpend.map { CoinJvmConverter.convert(it) })
    builder.setPeriodReset(TimestampJvmConverter.convert(obj.periodReset))
    return builder.build()
  }
}

public object AllowedMsgAllowanceJvmConverter :
    ProtobufTypeMapper<AllowedMsgAllowance, Feegrant.AllowedMsgAllowance> {
  public override val descriptor: Descriptors.Descriptor =
      Feegrant.AllowedMsgAllowance.getDescriptor()

  public override val parser: Parser<Feegrant.AllowedMsgAllowance> =
      Feegrant.AllowedMsgAllowance.parser()

  public override fun convert(obj: Feegrant.AllowedMsgAllowance): AllowedMsgAllowance =
      AllowedMsgAllowance(
  	allowance = AnyJvmConverter.convert(obj.allowance),
  	allowedMessages = obj.allowedMessagesList.map { it },
  )

  public override fun convert(obj: AllowedMsgAllowance): Feegrant.AllowedMsgAllowance {
    val builder = Feegrant.AllowedMsgAllowance.newBuilder()
    builder.setAllowance(AnyJvmConverter.convert(obj.allowance))
    builder.addAllAllowedMessages(obj.allowedMessages.map { it })
    return builder.build()
  }
}

public object GrantJvmConverter : ProtobufTypeMapper<Grant, Feegrant.Grant> {
  public override val descriptor: Descriptors.Descriptor = Feegrant.Grant.getDescriptor()

  public override val parser: Parser<Feegrant.Grant> = Feegrant.Grant.parser()

  public override fun convert(obj: Feegrant.Grant): Grant = Grant(
  	granter = obj.granter,
  	grantee = obj.grantee,
  	allowance = AnyJvmConverter.convert(obj.allowance),
  )

  public override fun convert(obj: Grant): Feegrant.Grant {
    val builder = Feegrant.Grant.newBuilder()
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    builder.setAllowance(AnyJvmConverter.convert(obj.allowance))
    return builder.build()
  }
}
