// Transform from cosmos/distribution/v1beta1/genesis.proto
package cosmos.distribution.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.DecCoinMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object DelegatorWithdrawInfoMapper :
    ProtobufTypeMapper<DelegatorWithdrawInfo, Genesis.DelegatorWithdrawInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.DelegatorWithdrawInfo.getDescriptor()

  public override val parser: Parser<Genesis.DelegatorWithdrawInfo> =
      Genesis.DelegatorWithdrawInfo.parser()

  public override fun convert(obj: Genesis.DelegatorWithdrawInfo): DelegatorWithdrawInfo =
      DelegatorWithdrawInfo(
  	delegatorAddress = obj.delegatorAddress,
  	withdrawAddress = obj.withdrawAddress,
  )

  public override fun convert(obj: DelegatorWithdrawInfo): Genesis.DelegatorWithdrawInfo {
    val builder = Genesis.DelegatorWithdrawInfo.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setWithdrawAddress(obj.withdrawAddress)
    return builder.build()
  }
}

public object ValidatorOutstandingRewardsRecordMapper :
    ProtobufTypeMapper<ValidatorOutstandingRewardsRecord, Genesis.ValidatorOutstandingRewardsRecord>
    {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorOutstandingRewardsRecord.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorOutstandingRewardsRecord> =
      Genesis.ValidatorOutstandingRewardsRecord.parser()

  public override fun convert(obj: Genesis.ValidatorOutstandingRewardsRecord):
      ValidatorOutstandingRewardsRecord = ValidatorOutstandingRewardsRecord(
  	validatorAddress = obj.validatorAddress,
  	outstandingRewards = obj.outstandingRewardsList.map { DecCoinMapper.convert(it) },
  )

  public override fun convert(obj: ValidatorOutstandingRewardsRecord):
      Genesis.ValidatorOutstandingRewardsRecord {
    val builder = Genesis.ValidatorOutstandingRewardsRecord.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.addAllOutstandingRewards(obj.outstandingRewards.map { DecCoinMapper.convert(it) })
    return builder.build()
  }
}

public object ValidatorAccumulatedCommissionRecordMapper :
    ProtobufTypeMapper<ValidatorAccumulatedCommissionRecord, Genesis.ValidatorAccumulatedCommissionRecord>
    {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorAccumulatedCommissionRecord.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorAccumulatedCommissionRecord> =
      Genesis.ValidatorAccumulatedCommissionRecord.parser()

  public override fun convert(obj: Genesis.ValidatorAccumulatedCommissionRecord):
      ValidatorAccumulatedCommissionRecord = ValidatorAccumulatedCommissionRecord(
  	validatorAddress = obj.validatorAddress,
  	accumulated = ValidatorAccumulatedCommissionMapper.convert(obj.accumulated),
  )

  public override fun convert(obj: ValidatorAccumulatedCommissionRecord):
      Genesis.ValidatorAccumulatedCommissionRecord {
    val builder = Genesis.ValidatorAccumulatedCommissionRecord.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setAccumulated(ValidatorAccumulatedCommissionMapper.convert(obj.accumulated))
    return builder.build()
  }
}

public object ValidatorHistoricalRewardsRecordMapper :
    ProtobufTypeMapper<ValidatorHistoricalRewardsRecord, Genesis.ValidatorHistoricalRewardsRecord> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorHistoricalRewardsRecord.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorHistoricalRewardsRecord> =
      Genesis.ValidatorHistoricalRewardsRecord.parser()

  public override fun convert(obj: Genesis.ValidatorHistoricalRewardsRecord):
      ValidatorHistoricalRewardsRecord = ValidatorHistoricalRewardsRecord(
  	validatorAddress = obj.validatorAddress,
  	period = obj.period.asKotlinType,
  	rewards = ValidatorHistoricalRewardsMapper.convert(obj.rewards),
  )

  public override fun convert(obj: ValidatorHistoricalRewardsRecord):
      Genesis.ValidatorHistoricalRewardsRecord {
    val builder = Genesis.ValidatorHistoricalRewardsRecord.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setPeriod(obj.period.asJavaType)
    builder.setRewards(ValidatorHistoricalRewardsMapper.convert(obj.rewards))
    return builder.build()
  }
}

public object ValidatorCurrentRewardsRecordMapper :
    ProtobufTypeMapper<ValidatorCurrentRewardsRecord, Genesis.ValidatorCurrentRewardsRecord> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorCurrentRewardsRecord.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorCurrentRewardsRecord> =
      Genesis.ValidatorCurrentRewardsRecord.parser()

  public override fun convert(obj: Genesis.ValidatorCurrentRewardsRecord):
      ValidatorCurrentRewardsRecord = ValidatorCurrentRewardsRecord(
  	validatorAddress = obj.validatorAddress,
  	rewards = ValidatorCurrentRewardsMapper.convert(obj.rewards),
  )

  public override fun convert(obj: ValidatorCurrentRewardsRecord):
      Genesis.ValidatorCurrentRewardsRecord {
    val builder = Genesis.ValidatorCurrentRewardsRecord.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setRewards(ValidatorCurrentRewardsMapper.convert(obj.rewards))
    return builder.build()
  }
}

public object DelegatorStartingInfoRecordMapper :
    ProtobufTypeMapper<DelegatorStartingInfoRecord, Genesis.DelegatorStartingInfoRecord> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.DelegatorStartingInfoRecord.getDescriptor()

  public override val parser: Parser<Genesis.DelegatorStartingInfoRecord> =
      Genesis.DelegatorStartingInfoRecord.parser()

  public override fun convert(obj: Genesis.DelegatorStartingInfoRecord): DelegatorStartingInfoRecord
      = DelegatorStartingInfoRecord(
  	delegatorAddress = obj.delegatorAddress,
  	validatorAddress = obj.validatorAddress,
  	startingInfo = DelegatorStartingInfoMapper.convert(obj.startingInfo),
  )

  public override fun convert(obj: DelegatorStartingInfoRecord):
      Genesis.DelegatorStartingInfoRecord {
    val builder = Genesis.DelegatorStartingInfoRecord.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setStartingInfo(DelegatorStartingInfoMapper.convert(obj.startingInfo))
    return builder.build()
  }
}

public object ValidatorSlashEventRecordMapper :
    ProtobufTypeMapper<ValidatorSlashEventRecord, Genesis.ValidatorSlashEventRecord> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorSlashEventRecord.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorSlashEventRecord> =
      Genesis.ValidatorSlashEventRecord.parser()

  public override fun convert(obj: Genesis.ValidatorSlashEventRecord): ValidatorSlashEventRecord =
      ValidatorSlashEventRecord(
  	validatorAddress = obj.validatorAddress,
  	height = obj.height.asKotlinType,
  	period = obj.period.asKotlinType,
  	validatorSlashEvent = ValidatorSlashEventMapper.convert(obj.validatorSlashEvent),
  )

  public override fun convert(obj: ValidatorSlashEventRecord): Genesis.ValidatorSlashEventRecord {
    val builder = Genesis.ValidatorSlashEventRecord.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setHeight(obj.height.asJavaType)
    builder.setPeriod(obj.period.asJavaType)
    builder.setValidatorSlashEvent(ValidatorSlashEventMapper.convert(obj.validatorSlashEvent))
    return builder.build()
  }
}

public object GenesisStateMapper : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsMapper.convert(obj.params),
  	feePool = FeePoolMapper.convert(obj.feePool),
  	delegatorWithdrawInfos = obj.delegatorWithdrawInfosList.map {
      DelegatorWithdrawInfoMapper.convert(it) },
  	previousProposer = obj.previousProposer,
  	outstandingRewards = obj.outstandingRewardsList.map {
      ValidatorOutstandingRewardsRecordMapper.convert(it) },
  	validatorAccumulatedCommissions = obj.validatorAccumulatedCommissionsList.map {
      ValidatorAccumulatedCommissionRecordMapper.convert(it) },
  	validatorHistoricalRewards = obj.validatorHistoricalRewardsList.map {
      ValidatorHistoricalRewardsRecordMapper.convert(it) },
  	validatorCurrentRewards = obj.validatorCurrentRewardsList.map {
      ValidatorCurrentRewardsRecordMapper.convert(it) },
  	delegatorStartingInfos = obj.delegatorStartingInfosList.map {
      DelegatorStartingInfoRecordMapper.convert(it) },
  	validatorSlashEvents = obj.validatorSlashEventsList.map {
      ValidatorSlashEventRecordMapper.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsMapper.convert(obj.params))
    builder.setFeePool(FeePoolMapper.convert(obj.feePool))
    builder.addAllDelegatorWithdrawInfos(obj.delegatorWithdrawInfos.map {
        DelegatorWithdrawInfoMapper.convert(it) })
    builder.setPreviousProposer(obj.previousProposer)
    builder.addAllOutstandingRewards(obj.outstandingRewards.map {
        ValidatorOutstandingRewardsRecordMapper.convert(it) })
    builder.addAllValidatorAccumulatedCommissions(obj.validatorAccumulatedCommissions.map {
        ValidatorAccumulatedCommissionRecordMapper.convert(it) })
    builder.addAllValidatorHistoricalRewards(obj.validatorHistoricalRewards.map {
        ValidatorHistoricalRewardsRecordMapper.convert(it) })
    builder.addAllValidatorCurrentRewards(obj.validatorCurrentRewards.map {
        ValidatorCurrentRewardsRecordMapper.convert(it) })
    builder.addAllDelegatorStartingInfos(obj.delegatorStartingInfos.map {
        DelegatorStartingInfoRecordMapper.convert(it) })
    builder.addAllValidatorSlashEvents(obj.validatorSlashEvents.map {
        ValidatorSlashEventRecordMapper.convert(it) })
    return builder.build()
  }
}
