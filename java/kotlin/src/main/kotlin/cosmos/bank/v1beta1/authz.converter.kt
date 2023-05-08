// Transform from cosmos/bank/v1beta1/authz.proto
package cosmos.bank.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object SendAuthorizationMapper :
    ProtobufTypeMapper<SendAuthorization, Authz.SendAuthorization> {
  public override val descriptor: Descriptors.Descriptor = Authz.SendAuthorization.getDescriptor()

  public override val parser: Parser<Authz.SendAuthorization> = Authz.SendAuthorization.parser()

  public override fun convert(obj: Authz.SendAuthorization): SendAuthorization = SendAuthorization(
  	spendLimit = obj.spendLimitList.map { CoinMapper.convert(it) },
  	allowList = obj.allowListList.map { it },
  )

  public override fun convert(obj: SendAuthorization): Authz.SendAuthorization {
    val builder = Authz.SendAuthorization.newBuilder()
    builder.addAllSpendLimit(obj.spendLimit.map { CoinMapper.convert(it) })
    builder.addAllAllowList(obj.allowList.map { it })
    return builder.build()
  }
}
