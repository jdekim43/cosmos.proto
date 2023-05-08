// Transform from cosmos/staking/v1beta1/staking.proto
package cosmos.staking.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinMapper
import google.protobuf.AnyMapper
import google.protobuf.DurationMapper
import google.protobuf.TimestampMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType
import tendermint.abci.ValidatorUpdateMapper
import tendermint.types.HeaderMapper

public object HistoricalInfoMapper : ProtobufTypeMapper<HistoricalInfo, Staking.HistoricalInfo> {
  public override val descriptor: Descriptors.Descriptor = Staking.HistoricalInfo.getDescriptor()

  public override val parser: Parser<Staking.HistoricalInfo> = Staking.HistoricalInfo.parser()

  public override fun convert(obj: Staking.HistoricalInfo): HistoricalInfo = HistoricalInfo(
  	`header` = HeaderMapper.convert(obj.`header`),
  	valset = obj.valsetList.map { ValidatorMapper.convert(it) },
  )

  public override fun convert(obj: HistoricalInfo): Staking.HistoricalInfo {
    val builder = Staking.HistoricalInfo.newBuilder()
    builder.setHeader(HeaderMapper.convert(obj.`header`))
    builder.addAllValset(obj.valset.map { ValidatorMapper.convert(it) })
    return builder.build()
  }
}

public object CommissionRatesMapper : ProtobufTypeMapper<CommissionRates, Staking.CommissionRates> {
  public override val descriptor: Descriptors.Descriptor = Staking.CommissionRates.getDescriptor()

  public override val parser: Parser<Staking.CommissionRates> = Staking.CommissionRates.parser()

  public override fun convert(obj: Staking.CommissionRates): CommissionRates = CommissionRates(
  	rate = obj.rate,
  	maxRate = obj.maxRate,
  	maxChangeRate = obj.maxChangeRate,
  )

  public override fun convert(obj: CommissionRates): Staking.CommissionRates {
    val builder = Staking.CommissionRates.newBuilder()
    builder.setRate(obj.rate)
    builder.setMaxRate(obj.maxRate)
    builder.setMaxChangeRate(obj.maxChangeRate)
    return builder.build()
  }
}

public object CommissionMapper : ProtobufTypeMapper<Commission, Staking.Commission> {
  public override val descriptor: Descriptors.Descriptor = Staking.Commission.getDescriptor()

  public override val parser: Parser<Staking.Commission> = Staking.Commission.parser()

  public override fun convert(obj: Staking.Commission): Commission = Commission(
  	commissionRates = CommissionRatesMapper.convert(obj.commissionRates),
  	updateTime = TimestampMapper.convert(obj.updateTime),
  )

  public override fun convert(obj: Commission): Staking.Commission {
    val builder = Staking.Commission.newBuilder()
    builder.setCommissionRates(CommissionRatesMapper.convert(obj.commissionRates))
    builder.setUpdateTime(TimestampMapper.convert(obj.updateTime))
    return builder.build()
  }
}

public object DescriptionMapper : ProtobufTypeMapper<Description, Staking.Description> {
  public override val descriptor: Descriptors.Descriptor = Staking.Description.getDescriptor()

  public override val parser: Parser<Staking.Description> = Staking.Description.parser()

  public override fun convert(obj: Staking.Description): Description = Description(
  	moniker = obj.moniker,
  	identity = obj.identity,
  	website = obj.website,
  	securityContact = obj.securityContact,
  	details = obj.details,
  )

  public override fun convert(obj: Description): Staking.Description {
    val builder = Staking.Description.newBuilder()
    builder.setMoniker(obj.moniker)
    builder.setIdentity(obj.identity)
    builder.setWebsite(obj.website)
    builder.setSecurityContact(obj.securityContact)
    builder.setDetails(obj.details)
    return builder.build()
  }
}

public object ValidatorMapper : ProtobufTypeMapper<Validator, Staking.Validator> {
  public override val descriptor: Descriptors.Descriptor = Staking.Validator.getDescriptor()

  public override val parser: Parser<Staking.Validator> = Staking.Validator.parser()

  public override fun convert(obj: Staking.Validator): Validator = Validator(
  	operatorAddress = obj.operatorAddress,
  	consensusPubkey = AnyMapper.convert(obj.consensusPubkey),
  	jailed = obj.jailed,
  	status = BondStatus.forNumber(obj.status.number),
  	tokens = obj.tokens,
  	delegatorShares = obj.delegatorShares,
  	description = DescriptionMapper.convert(obj.description),
  	unbondingHeight = obj.unbondingHeight,
  	unbondingTime = TimestampMapper.convert(obj.unbondingTime),
  	commission = CommissionMapper.convert(obj.commission),
  	minSelfDelegation = obj.minSelfDelegation,
  	unbondingOnHoldRefCount = obj.unbondingOnHoldRefCount,
  	unbondingIds = obj.unbondingIdsList.map { it.asKotlinType },
  )

  public override fun convert(obj: Validator): Staking.Validator {
    val builder = Staking.Validator.newBuilder()
    builder.setOperatorAddress(obj.operatorAddress)
    builder.setConsensusPubkey(AnyMapper.convert(obj.consensusPubkey))
    builder.setJailed(obj.jailed)
    builder.setStatus(Staking.BondStatus.forNumber(obj.status.number))
    builder.setTokens(obj.tokens)
    builder.setDelegatorShares(obj.delegatorShares)
    builder.setDescription(DescriptionMapper.convert(obj.description))
    builder.setUnbondingHeight(obj.unbondingHeight)
    builder.setUnbondingTime(TimestampMapper.convert(obj.unbondingTime))
    builder.setCommission(CommissionMapper.convert(obj.commission))
    builder.setMinSelfDelegation(obj.minSelfDelegation)
    builder.setUnbondingOnHoldRefCount(obj.unbondingOnHoldRefCount)
    builder.addAllUnbondingIds(obj.unbondingIds.map { it.asJavaType })
    return builder.build()
  }
}

public object ValAddressesMapper : ProtobufTypeMapper<ValAddresses, Staking.ValAddresses> {
  public override val descriptor: Descriptors.Descriptor = Staking.ValAddresses.getDescriptor()

  public override val parser: Parser<Staking.ValAddresses> = Staking.ValAddresses.parser()

  public override fun convert(obj: Staking.ValAddresses): ValAddresses = ValAddresses(
  	addresses = obj.addressesList.map { it },
  )

  public override fun convert(obj: ValAddresses): Staking.ValAddresses {
    val builder = Staking.ValAddresses.newBuilder()
    builder.addAllAddresses(obj.addresses.map { it })
    return builder.build()
  }
}

public object DVPairMapper : ProtobufTypeMapper<DVPair, Staking.DVPair> {
  public override val descriptor: Descriptors.Descriptor = Staking.DVPair.getDescriptor()

  public override val parser: Parser<Staking.DVPair> = Staking.DVPair.parser()

  public override fun convert(obj: Staking.DVPair): DVPair = DVPair(
  	delegatorAddress = obj.delegatorAddress,
  	validatorAddress = obj.validatorAddress,
  )

  public override fun convert(obj: DVPair): Staking.DVPair {
    val builder = Staking.DVPair.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    return builder.build()
  }
}

public object DVPairsMapper : ProtobufTypeMapper<DVPairs, Staking.DVPairs> {
  public override val descriptor: Descriptors.Descriptor = Staking.DVPairs.getDescriptor()

  public override val parser: Parser<Staking.DVPairs> = Staking.DVPairs.parser()

  public override fun convert(obj: Staking.DVPairs): DVPairs = DVPairs(
  	pairs = obj.pairsList.map { DVPairMapper.convert(it) },
  )

  public override fun convert(obj: DVPairs): Staking.DVPairs {
    val builder = Staking.DVPairs.newBuilder()
    builder.addAllPairs(obj.pairs.map { DVPairMapper.convert(it) })
    return builder.build()
  }
}

public object DVVTripletMapper : ProtobufTypeMapper<DVVTriplet, Staking.DVVTriplet> {
  public override val descriptor: Descriptors.Descriptor = Staking.DVVTriplet.getDescriptor()

  public override val parser: Parser<Staking.DVVTriplet> = Staking.DVVTriplet.parser()

  public override fun convert(obj: Staking.DVVTriplet): DVVTriplet = DVVTriplet(
  	delegatorAddress = obj.delegatorAddress,
  	validatorSrcAddress = obj.validatorSrcAddress,
  	validatorDstAddress = obj.validatorDstAddress,
  )

  public override fun convert(obj: DVVTriplet): Staking.DVVTriplet {
    val builder = Staking.DVVTriplet.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorSrcAddress(obj.validatorSrcAddress)
    builder.setValidatorDstAddress(obj.validatorDstAddress)
    return builder.build()
  }
}

public object DVVTripletsMapper : ProtobufTypeMapper<DVVTriplets, Staking.DVVTriplets> {
  public override val descriptor: Descriptors.Descriptor = Staking.DVVTriplets.getDescriptor()

  public override val parser: Parser<Staking.DVVTriplets> = Staking.DVVTriplets.parser()

  public override fun convert(obj: Staking.DVVTriplets): DVVTriplets = DVVTriplets(
  	triplets = obj.tripletsList.map { DVVTripletMapper.convert(it) },
  )

  public override fun convert(obj: DVVTriplets): Staking.DVVTriplets {
    val builder = Staking.DVVTriplets.newBuilder()
    builder.addAllTriplets(obj.triplets.map { DVVTripletMapper.convert(it) })
    return builder.build()
  }
}

public object DelegationMapper : ProtobufTypeMapper<Delegation, Staking.Delegation> {
  public override val descriptor: Descriptors.Descriptor = Staking.Delegation.getDescriptor()

  public override val parser: Parser<Staking.Delegation> = Staking.Delegation.parser()

  public override fun convert(obj: Staking.Delegation): Delegation = Delegation(
  	delegatorAddress = obj.delegatorAddress,
  	validatorAddress = obj.validatorAddress,
  	shares = obj.shares,
  )

  public override fun convert(obj: Delegation): Staking.Delegation {
    val builder = Staking.Delegation.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setShares(obj.shares)
    return builder.build()
  }
}

public object UnbondingDelegationMapper :
    ProtobufTypeMapper<UnbondingDelegation, Staking.UnbondingDelegation> {
  public override val descriptor: Descriptors.Descriptor =
      Staking.UnbondingDelegation.getDescriptor()

  public override val parser: Parser<Staking.UnbondingDelegation> =
      Staking.UnbondingDelegation.parser()

  public override fun convert(obj: Staking.UnbondingDelegation): UnbondingDelegation =
      UnbondingDelegation(
  	delegatorAddress = obj.delegatorAddress,
  	validatorAddress = obj.validatorAddress,
  	entries = obj.entriesList.map { UnbondingDelegationEntryMapper.convert(it) },
  )

  public override fun convert(obj: UnbondingDelegation): Staking.UnbondingDelegation {
    val builder = Staking.UnbondingDelegation.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.addAllEntries(obj.entries.map { UnbondingDelegationEntryMapper.convert(it) })
    return builder.build()
  }
}

public object UnbondingDelegationEntryMapper :
    ProtobufTypeMapper<UnbondingDelegationEntry, Staking.UnbondingDelegationEntry> {
  public override val descriptor: Descriptors.Descriptor =
      Staking.UnbondingDelegationEntry.getDescriptor()

  public override val parser: Parser<Staking.UnbondingDelegationEntry> =
      Staking.UnbondingDelegationEntry.parser()

  public override fun convert(obj: Staking.UnbondingDelegationEntry): UnbondingDelegationEntry =
      UnbondingDelegationEntry(
  	creationHeight = obj.creationHeight,
  	completionTime = TimestampMapper.convert(obj.completionTime),
  	initialBalance = obj.initialBalance,
  	balance = obj.balance,
  	unbondingId = obj.unbondingId.asKotlinType,
  	unbondingOnHoldRefCount = obj.unbondingOnHoldRefCount,
  )

  public override fun convert(obj: UnbondingDelegationEntry): Staking.UnbondingDelegationEntry {
    val builder = Staking.UnbondingDelegationEntry.newBuilder()
    builder.setCreationHeight(obj.creationHeight)
    builder.setCompletionTime(TimestampMapper.convert(obj.completionTime))
    builder.setInitialBalance(obj.initialBalance)
    builder.setBalance(obj.balance)
    builder.setUnbondingId(obj.unbondingId.asJavaType)
    builder.setUnbondingOnHoldRefCount(obj.unbondingOnHoldRefCount)
    return builder.build()
  }
}

public object RedelegationEntryMapper :
    ProtobufTypeMapper<RedelegationEntry, Staking.RedelegationEntry> {
  public override val descriptor: Descriptors.Descriptor = Staking.RedelegationEntry.getDescriptor()

  public override val parser: Parser<Staking.RedelegationEntry> = Staking.RedelegationEntry.parser()

  public override fun convert(obj: Staking.RedelegationEntry): RedelegationEntry =
      RedelegationEntry(
  	creationHeight = obj.creationHeight,
  	completionTime = TimestampMapper.convert(obj.completionTime),
  	initialBalance = obj.initialBalance,
  	sharesDst = obj.sharesDst,
  	unbondingId = obj.unbondingId.asKotlinType,
  	unbondingOnHoldRefCount = obj.unbondingOnHoldRefCount,
  )

  public override fun convert(obj: RedelegationEntry): Staking.RedelegationEntry {
    val builder = Staking.RedelegationEntry.newBuilder()
    builder.setCreationHeight(obj.creationHeight)
    builder.setCompletionTime(TimestampMapper.convert(obj.completionTime))
    builder.setInitialBalance(obj.initialBalance)
    builder.setSharesDst(obj.sharesDst)
    builder.setUnbondingId(obj.unbondingId.asJavaType)
    builder.setUnbondingOnHoldRefCount(obj.unbondingOnHoldRefCount)
    return builder.build()
  }
}

public object RedelegationMapper : ProtobufTypeMapper<Redelegation, Staking.Redelegation> {
  public override val descriptor: Descriptors.Descriptor = Staking.Redelegation.getDescriptor()

  public override val parser: Parser<Staking.Redelegation> = Staking.Redelegation.parser()

  public override fun convert(obj: Staking.Redelegation): Redelegation = Redelegation(
  	delegatorAddress = obj.delegatorAddress,
  	validatorSrcAddress = obj.validatorSrcAddress,
  	validatorDstAddress = obj.validatorDstAddress,
  	entries = obj.entriesList.map { RedelegationEntryMapper.convert(it) },
  )

  public override fun convert(obj: Redelegation): Staking.Redelegation {
    val builder = Staking.Redelegation.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorSrcAddress(obj.validatorSrcAddress)
    builder.setValidatorDstAddress(obj.validatorDstAddress)
    builder.addAllEntries(obj.entries.map { RedelegationEntryMapper.convert(it) })
    return builder.build()
  }
}

public object ParamsMapper : ProtobufTypeMapper<Params, Staking.Params> {
  public override val descriptor: Descriptors.Descriptor = Staking.Params.getDescriptor()

  public override val parser: Parser<Staking.Params> = Staking.Params.parser()

  public override fun convert(obj: Staking.Params): Params = Params(
  	unbondingTime = DurationMapper.convert(obj.unbondingTime),
  	maxValidators = obj.maxValidators.asKotlinType,
  	maxEntries = obj.maxEntries.asKotlinType,
  	historicalEntries = obj.historicalEntries.asKotlinType,
  	bondDenom = obj.bondDenom,
  	minCommissionRate = obj.minCommissionRate,
  )

  public override fun convert(obj: Params): Staking.Params {
    val builder = Staking.Params.newBuilder()
    builder.setUnbondingTime(DurationMapper.convert(obj.unbondingTime))
    builder.setMaxValidators(obj.maxValidators.asJavaType)
    builder.setMaxEntries(obj.maxEntries.asJavaType)
    builder.setHistoricalEntries(obj.historicalEntries.asJavaType)
    builder.setBondDenom(obj.bondDenom)
    builder.setMinCommissionRate(obj.minCommissionRate)
    return builder.build()
  }
}

public object DelegationResponseMapper :
    ProtobufTypeMapper<DelegationResponse, Staking.DelegationResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Staking.DelegationResponse.getDescriptor()

  public override val parser: Parser<Staking.DelegationResponse> =
      Staking.DelegationResponse.parser()

  public override fun convert(obj: Staking.DelegationResponse): DelegationResponse =
      DelegationResponse(
  	delegation = DelegationMapper.convert(obj.delegation),
  	balance = CoinMapper.convert(obj.balance),
  )

  public override fun convert(obj: DelegationResponse): Staking.DelegationResponse {
    val builder = Staking.DelegationResponse.newBuilder()
    builder.setDelegation(DelegationMapper.convert(obj.delegation))
    builder.setBalance(CoinMapper.convert(obj.balance))
    return builder.build()
  }
}

public object RedelegationEntryResponseMapper :
    ProtobufTypeMapper<RedelegationEntryResponse, Staking.RedelegationEntryResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Staking.RedelegationEntryResponse.getDescriptor()

  public override val parser: Parser<Staking.RedelegationEntryResponse> =
      Staking.RedelegationEntryResponse.parser()

  public override fun convert(obj: Staking.RedelegationEntryResponse): RedelegationEntryResponse =
      RedelegationEntryResponse(
  	redelegationEntry = RedelegationEntryMapper.convert(obj.redelegationEntry),
  	balance = obj.balance,
  )

  public override fun convert(obj: RedelegationEntryResponse): Staking.RedelegationEntryResponse {
    val builder = Staking.RedelegationEntryResponse.newBuilder()
    builder.setRedelegationEntry(RedelegationEntryMapper.convert(obj.redelegationEntry))
    builder.setBalance(obj.balance)
    return builder.build()
  }
}

public object RedelegationResponseMapper :
    ProtobufTypeMapper<RedelegationResponse, Staking.RedelegationResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Staking.RedelegationResponse.getDescriptor()

  public override val parser: Parser<Staking.RedelegationResponse> =
      Staking.RedelegationResponse.parser()

  public override fun convert(obj: Staking.RedelegationResponse): RedelegationResponse =
      RedelegationResponse(
  	redelegation = RedelegationMapper.convert(obj.redelegation),
  	entries = obj.entriesList.map { RedelegationEntryResponseMapper.convert(it) },
  )

  public override fun convert(obj: RedelegationResponse): Staking.RedelegationResponse {
    val builder = Staking.RedelegationResponse.newBuilder()
    builder.setRedelegation(RedelegationMapper.convert(obj.redelegation))
    builder.addAllEntries(obj.entries.map { RedelegationEntryResponseMapper.convert(it) })
    return builder.build()
  }
}

public object PoolMapper : ProtobufTypeMapper<Pool, Staking.Pool> {
  public override val descriptor: Descriptors.Descriptor = Staking.Pool.getDescriptor()

  public override val parser: Parser<Staking.Pool> = Staking.Pool.parser()

  public override fun convert(obj: Staking.Pool): Pool = Pool(
  	notBondedTokens = obj.notBondedTokens,
  	bondedTokens = obj.bondedTokens,
  )

  public override fun convert(obj: Pool): Staking.Pool {
    val builder = Staking.Pool.newBuilder()
    builder.setNotBondedTokens(obj.notBondedTokens)
    builder.setBondedTokens(obj.bondedTokens)
    return builder.build()
  }
}

public object ValidatorUpdatesMapper :
    ProtobufTypeMapper<ValidatorUpdates, Staking.ValidatorUpdates> {
  public override val descriptor: Descriptors.Descriptor = Staking.ValidatorUpdates.getDescriptor()

  public override val parser: Parser<Staking.ValidatorUpdates> = Staking.ValidatorUpdates.parser()

  public override fun convert(obj: Staking.ValidatorUpdates): ValidatorUpdates = ValidatorUpdates(
  	updates = obj.updatesList.map { ValidatorUpdateMapper.convert(it) },
  )

  public override fun convert(obj: ValidatorUpdates): Staking.ValidatorUpdates {
    val builder = Staking.ValidatorUpdates.newBuilder()
    builder.addAllUpdates(obj.updates.map { ValidatorUpdateMapper.convert(it) })
    return builder.build()
  }
}
