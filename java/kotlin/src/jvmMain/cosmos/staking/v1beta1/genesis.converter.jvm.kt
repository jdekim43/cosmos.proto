// Transform from cosmos/staking/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.staking.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.params),
  	lastTotalPower = obj.lastTotalPower.toByteArray(),
  	lastValidatorPowers = obj.lastValidatorPowersList.map {
      LastValidatorPowerJvmConverter.convert(it) },
  	validators = obj.validatorsList.map { ValidatorJvmConverter.convert(it) },
  	delegations = obj.delegationsList.map { DelegationJvmConverter.convert(it) },
  	unbondingDelegations = obj.unbondingDelegationsList.map {
      UnbondingDelegationJvmConverter.convert(it) },
  	redelegations = obj.redelegationsList.map { RedelegationJvmConverter.convert(it) },
  	exported = obj.exported,
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.setLastTotalPower(ByteString.copyFrom(obj.lastTotalPower))
    builder.addAllLastValidatorPowers(obj.lastValidatorPowers.map {
        LastValidatorPowerJvmConverter.convert(it) })
    builder.addAllValidators(obj.validators.map { ValidatorJvmConverter.convert(it) })
    builder.addAllDelegations(obj.delegations.map { DelegationJvmConverter.convert(it) })
    builder.addAllUnbondingDelegations(obj.unbondingDelegations.map {
        UnbondingDelegationJvmConverter.convert(it) })
    builder.addAllRedelegations(obj.redelegations.map { RedelegationJvmConverter.convert(it) })
    builder.setExported(obj.exported)
    return builder.build()
  }
}

public object LastValidatorPowerJvmConverter :
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
