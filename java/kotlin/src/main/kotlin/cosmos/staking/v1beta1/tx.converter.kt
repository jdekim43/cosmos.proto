// Transform from cosmos/staking/v1beta1/tx.proto
package cosmos.staking.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinMapper
import google.protobuf.AnyMapper
import google.protobuf.TimestampMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgCreateValidatorMapper :
    ProtobufTypeMapper<MsgCreateValidator, Tx.MsgCreateValidator> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCreateValidator.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateValidator> = Tx.MsgCreateValidator.parser()

  public override fun convert(obj: Tx.MsgCreateValidator): MsgCreateValidator = MsgCreateValidator(
  	description = DescriptionMapper.convert(obj.description),
  	commission = CommissionRatesMapper.convert(obj.commission),
  	minSelfDelegation = obj.minSelfDelegation,
  	delegatorAddress = obj.delegatorAddress,
  	validatorAddress = obj.validatorAddress,
  	pubkey = AnyMapper.convert(obj.pubkey),
  	`value` = CoinMapper.convert(obj.`value`),
  )

  public override fun convert(obj: MsgCreateValidator): Tx.MsgCreateValidator {
    val builder = Tx.MsgCreateValidator.newBuilder()
    builder.setDescription(DescriptionMapper.convert(obj.description))
    builder.setCommission(CommissionRatesMapper.convert(obj.commission))
    builder.setMinSelfDelegation(obj.minSelfDelegation)
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setPubkey(AnyMapper.convert(obj.pubkey))
    builder.setValue(CoinMapper.convert(obj.`value`))
    return builder.build()
  }
}

public object MsgCreateValidatorResponseMapper :
    ProtobufTypeMapper<MsgCreateValidatorResponse, Tx.MsgCreateValidatorResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateValidatorResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateValidatorResponse> =
      Tx.MsgCreateValidatorResponse.parser()

  public override fun convert(obj: Tx.MsgCreateValidatorResponse): MsgCreateValidatorResponse =
      MsgCreateValidatorResponse(
  )

  public override fun convert(obj: MsgCreateValidatorResponse): Tx.MsgCreateValidatorResponse {
    val builder = Tx.MsgCreateValidatorResponse.newBuilder()
    return builder.build()
  }
}

public object MsgEditValidatorMapper : ProtobufTypeMapper<MsgEditValidator, Tx.MsgEditValidator> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgEditValidator.getDescriptor()

  public override val parser: Parser<Tx.MsgEditValidator> = Tx.MsgEditValidator.parser()

  public override fun convert(obj: Tx.MsgEditValidator): MsgEditValidator = MsgEditValidator(
  	description = DescriptionMapper.convert(obj.description),
  	validatorAddress = obj.validatorAddress,
  	commissionRate = obj.commissionRate,
  	minSelfDelegation = obj.minSelfDelegation,
  )

  public override fun convert(obj: MsgEditValidator): Tx.MsgEditValidator {
    val builder = Tx.MsgEditValidator.newBuilder()
    builder.setDescription(DescriptionMapper.convert(obj.description))
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setCommissionRate(obj.commissionRate)
    builder.setMinSelfDelegation(obj.minSelfDelegation)
    return builder.build()
  }
}

public object MsgEditValidatorResponseMapper :
    ProtobufTypeMapper<MsgEditValidatorResponse, Tx.MsgEditValidatorResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgEditValidatorResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgEditValidatorResponse> =
      Tx.MsgEditValidatorResponse.parser()

  public override fun convert(obj: Tx.MsgEditValidatorResponse): MsgEditValidatorResponse =
      MsgEditValidatorResponse(
  )

  public override fun convert(obj: MsgEditValidatorResponse): Tx.MsgEditValidatorResponse {
    val builder = Tx.MsgEditValidatorResponse.newBuilder()
    return builder.build()
  }
}

public object MsgDelegateMapper : ProtobufTypeMapper<MsgDelegate, Tx.MsgDelegate> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgDelegate.getDescriptor()

  public override val parser: Parser<Tx.MsgDelegate> = Tx.MsgDelegate.parser()

  public override fun convert(obj: Tx.MsgDelegate): MsgDelegate = MsgDelegate(
  	delegatorAddress = obj.delegatorAddress,
  	validatorAddress = obj.validatorAddress,
  	amount = CoinMapper.convert(obj.amount),
  )

  public override fun convert(obj: MsgDelegate): Tx.MsgDelegate {
    val builder = Tx.MsgDelegate.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setAmount(CoinMapper.convert(obj.amount))
    return builder.build()
  }
}

public object MsgDelegateResponseMapper :
    ProtobufTypeMapper<MsgDelegateResponse, Tx.MsgDelegateResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgDelegateResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgDelegateResponse> = Tx.MsgDelegateResponse.parser()

  public override fun convert(obj: Tx.MsgDelegateResponse): MsgDelegateResponse =
      MsgDelegateResponse(
  )

  public override fun convert(obj: MsgDelegateResponse): Tx.MsgDelegateResponse {
    val builder = Tx.MsgDelegateResponse.newBuilder()
    return builder.build()
  }
}

public object MsgBeginRedelegateMapper :
    ProtobufTypeMapper<MsgBeginRedelegate, Tx.MsgBeginRedelegate> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgBeginRedelegate.getDescriptor()

  public override val parser: Parser<Tx.MsgBeginRedelegate> = Tx.MsgBeginRedelegate.parser()

  public override fun convert(obj: Tx.MsgBeginRedelegate): MsgBeginRedelegate = MsgBeginRedelegate(
  	delegatorAddress = obj.delegatorAddress,
  	validatorSrcAddress = obj.validatorSrcAddress,
  	validatorDstAddress = obj.validatorDstAddress,
  	amount = CoinMapper.convert(obj.amount),
  )

  public override fun convert(obj: MsgBeginRedelegate): Tx.MsgBeginRedelegate {
    val builder = Tx.MsgBeginRedelegate.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorSrcAddress(obj.validatorSrcAddress)
    builder.setValidatorDstAddress(obj.validatorDstAddress)
    builder.setAmount(CoinMapper.convert(obj.amount))
    return builder.build()
  }
}

public object MsgBeginRedelegateResponseMapper :
    ProtobufTypeMapper<MsgBeginRedelegateResponse, Tx.MsgBeginRedelegateResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgBeginRedelegateResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgBeginRedelegateResponse> =
      Tx.MsgBeginRedelegateResponse.parser()

  public override fun convert(obj: Tx.MsgBeginRedelegateResponse): MsgBeginRedelegateResponse =
      MsgBeginRedelegateResponse(
  	completionTime = TimestampMapper.convert(obj.completionTime),
  )

  public override fun convert(obj: MsgBeginRedelegateResponse): Tx.MsgBeginRedelegateResponse {
    val builder = Tx.MsgBeginRedelegateResponse.newBuilder()
    builder.setCompletionTime(TimestampMapper.convert(obj.completionTime))
    return builder.build()
  }
}

public object MsgUndelegateMapper : ProtobufTypeMapper<MsgUndelegate, Tx.MsgUndelegate> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUndelegate.getDescriptor()

  public override val parser: Parser<Tx.MsgUndelegate> = Tx.MsgUndelegate.parser()

  public override fun convert(obj: Tx.MsgUndelegate): MsgUndelegate = MsgUndelegate(
  	delegatorAddress = obj.delegatorAddress,
  	validatorAddress = obj.validatorAddress,
  	amount = CoinMapper.convert(obj.amount),
  )

  public override fun convert(obj: MsgUndelegate): Tx.MsgUndelegate {
    val builder = Tx.MsgUndelegate.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setAmount(CoinMapper.convert(obj.amount))
    return builder.build()
  }
}

public object MsgUndelegateResponseMapper :
    ProtobufTypeMapper<MsgUndelegateResponse, Tx.MsgUndelegateResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUndelegateResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUndelegateResponse> = Tx.MsgUndelegateResponse.parser()

  public override fun convert(obj: Tx.MsgUndelegateResponse): MsgUndelegateResponse =
      MsgUndelegateResponse(
  	completionTime = TimestampMapper.convert(obj.completionTime),
  )

  public override fun convert(obj: MsgUndelegateResponse): Tx.MsgUndelegateResponse {
    val builder = Tx.MsgUndelegateResponse.newBuilder()
    builder.setCompletionTime(TimestampMapper.convert(obj.completionTime))
    return builder.build()
  }
}

public object MsgCancelUnbondingDelegationMapper :
    ProtobufTypeMapper<MsgCancelUnbondingDelegation, Tx.MsgCancelUnbondingDelegation> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCancelUnbondingDelegation.getDescriptor()

  public override val parser: Parser<Tx.MsgCancelUnbondingDelegation> =
      Tx.MsgCancelUnbondingDelegation.parser()

  public override fun convert(obj: Tx.MsgCancelUnbondingDelegation): MsgCancelUnbondingDelegation =
      MsgCancelUnbondingDelegation(
  	delegatorAddress = obj.delegatorAddress,
  	validatorAddress = obj.validatorAddress,
  	amount = CoinMapper.convert(obj.amount),
  	creationHeight = obj.creationHeight,
  )

  public override fun convert(obj: MsgCancelUnbondingDelegation): Tx.MsgCancelUnbondingDelegation {
    val builder = Tx.MsgCancelUnbondingDelegation.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setAmount(CoinMapper.convert(obj.amount))
    builder.setCreationHeight(obj.creationHeight)
    return builder.build()
  }
}

public object MsgCancelUnbondingDelegationResponseMapper :
    ProtobufTypeMapper<MsgCancelUnbondingDelegationResponse, Tx.MsgCancelUnbondingDelegationResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCancelUnbondingDelegationResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCancelUnbondingDelegationResponse> =
      Tx.MsgCancelUnbondingDelegationResponse.parser()

  public override fun convert(obj: Tx.MsgCancelUnbondingDelegationResponse):
      MsgCancelUnbondingDelegationResponse = MsgCancelUnbondingDelegationResponse(
  )

  public override fun convert(obj: MsgCancelUnbondingDelegationResponse):
      Tx.MsgCancelUnbondingDelegationResponse {
    val builder = Tx.MsgCancelUnbondingDelegationResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateParamsMapper : ProtobufTypeMapper<MsgUpdateParams, Tx.MsgUpdateParams> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParams> = Tx.MsgUpdateParams.parser()

  public override fun convert(obj: Tx.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.authority,
  	params = ParamsMapper.convert(obj.params),
  )

  public override fun convert(obj: MsgUpdateParams): Tx.MsgUpdateParams {
    val builder = Tx.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setParams(ParamsMapper.convert(obj.params))
    return builder.build()
  }
}

public object MsgUpdateParamsResponseMapper :
    ProtobufTypeMapper<MsgUpdateParamsResponse, Tx.MsgUpdateParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateParamsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParamsResponse> =
      Tx.MsgUpdateParamsResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateParamsResponse): MsgUpdateParamsResponse =
      MsgUpdateParamsResponse(
  )

  public override fun convert(obj: MsgUpdateParamsResponse): Tx.MsgUpdateParamsResponse {
    val builder = Tx.MsgUpdateParamsResponse.newBuilder()
    return builder.build()
  }
}
