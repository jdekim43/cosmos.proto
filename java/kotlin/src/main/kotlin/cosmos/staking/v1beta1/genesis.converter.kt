// Transform from cosmos/staking/v1beta1/genesis.proto
package cosmos.staking.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateMapper : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsMapper.convert(obj.params),
  	lastTotalPower = obj.lastTotalPower.toByteArray(),
  	lastValidatorPowers = obj.lastValidatorPowersList.map { LastValidatorPowerMapper.convert(it) },
  	validators = obj.validatorsList.map { ValidatorMapper.convert(it) },
  	delegations = obj.delegationsList.map { DelegationMapper.convert(it) },
  	unbondingDelegations = obj.unbondingDelegationsList.map { UnbondingDelegationMapper.convert(it)
      },
  	redelegations = obj.redelegationsList.map { RedelegationMapper.convert(it) },
  	exported = obj.exported,
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsMapper.convert(obj.params))
    builder.setLastTotalPower(ByteString.copyFrom(obj.lastTotalPower))
    builder.addAllLastValidatorPowers(obj.lastValidatorPowers.map {
        LastValidatorPowerMapper.convert(it) })
    builder.addAllValidators(obj.validators.map { ValidatorMapper.convert(it) })
    builder.addAllDelegations(obj.delegations.map { DelegationMapper.convert(it) })
    builder.addAllUnbondingDelegations(obj.unbondingDelegations.map {
        UnbondingDelegationMapper.convert(it) })
    builder.addAllRedelegations(obj.redelegations.map { RedelegationMapper.convert(it) })
    builder.setExported(obj.exported)
    return builder.build()
  }
}

public object LastValidatorPowerMapper :
    ProtobufTypeMapper<LastValidatorPower, Genesis.LastValidatorPower> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.LastValidatorPower.getDescriptor()

  public override val parser: Parser<Genesis.LastValidatorPower> =
      Genesis.LastValidatorPower.parser()

  public override fun convert(obj: Genesis.LastValidatorPower): LastValidatorPower =
      LastValidatorPower(
  	address = obj.address,
  	power = obj.power,
  )

  public override fun convert(obj: LastValidatorPower): Genesis.LastValidatorPower {
    val builder = Genesis.LastValidatorPower.newBuilder()
    builder.setAddress(obj.address)
    builder.setPower(obj.power)
    return builder.build()
  }
}
