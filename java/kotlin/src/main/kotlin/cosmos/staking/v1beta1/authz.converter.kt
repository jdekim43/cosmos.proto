// Transform from cosmos/staking/v1beta1/authz.proto
package cosmos.staking.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object StakeAuthorizationMapper :
    ProtobufTypeMapper<StakeAuthorization, Authz.StakeAuthorization> {
  public override val descriptor: Descriptors.Descriptor = Authz.StakeAuthorization.getDescriptor()

  public override val parser: Parser<Authz.StakeAuthorization> = Authz.StakeAuthorization.parser()

  public override fun convert(obj: Authz.StakeAuthorization): StakeAuthorization =
      StakeAuthorization(
  	maxTokens = CoinMapper.convert(obj.maxTokens),
  	authorizationType = AuthorizationType.forNumber(obj.authorizationType.number),
  	validators = mapOf(
  2 to { StakeAuthorization.ValidatorsOneOf.AllowList(ValidatorsMapper.convert(obj.allowList)) },
  3 to { StakeAuthorization.ValidatorsOneOf.DenyList(ValidatorsMapper.convert(obj.denyList)) },
  ).getValue(obj.validatorsCase.number)(),
  )

  public override fun convert(obj: StakeAuthorization): Authz.StakeAuthorization {
    val builder = Authz.StakeAuthorization.newBuilder()
    builder.setMaxTokens(CoinMapper.convert(obj.maxTokens))
    builder.setAuthorizationType(Authz.AuthorizationType.forNumber(obj.authorizationType.number))
    when (obj.validators) {
      is StakeAuthorization.ValidatorsOneOf.AllowList ->
          builder.setAllowList(ValidatorsMapper.convert(obj.validators.value))
      is StakeAuthorization.ValidatorsOneOf.DenyList ->
          builder.setDenyList(ValidatorsMapper.convert(obj.validators.value))
    }
    return builder.build()
  }

  public object ValidatorsMapper :
      ProtobufTypeMapper<StakeAuthorization.Validators, Authz.StakeAuthorization.Validators> {
    public override val descriptor: Descriptors.Descriptor =
        Authz.StakeAuthorization.Validators.getDescriptor()

    public override val parser: Parser<Authz.StakeAuthorization.Validators> =
        Authz.StakeAuthorization.Validators.parser()

    public override fun convert(obj: Authz.StakeAuthorization.Validators):
        StakeAuthorization.Validators = StakeAuthorization.Validators(
    	address = obj.addressList.map { it },
    )

    public override fun convert(obj: StakeAuthorization.Validators):
        Authz.StakeAuthorization.Validators {
      val builder = Authz.StakeAuthorization.Validators.newBuilder()
      builder.addAllAddress(obj.address.map { it })
      return builder.build()
    }
  }
}
