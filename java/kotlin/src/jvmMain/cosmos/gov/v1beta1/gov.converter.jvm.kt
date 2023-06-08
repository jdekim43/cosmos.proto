// Transform from cosmos/gov/v1beta1/gov.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.gov.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import google.protobuf.AnyJvmConverter
import google.protobuf.DurationJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object WeightedVoteOptionJvmConverter :
    ProtobufTypeMapper<WeightedVoteOption, Gov.WeightedVoteOption> {
  public override val descriptor: Descriptors.Descriptor = Gov.WeightedVoteOption.getDescriptor()

  public override val parser: Parser<Gov.WeightedVoteOption> = Gov.WeightedVoteOption.parser()

  public override fun convert(obj: Gov.WeightedVoteOption): WeightedVoteOption = WeightedVoteOption(
  	option = VoteOption.forNumber(obj.option.number),
  	weight = obj.weight,
  )

  public override fun convert(obj: WeightedVoteOption): Gov.WeightedVoteOption {
    val builder = Gov.WeightedVoteOption.newBuilder()
    builder.setOption(Gov.VoteOption.forNumber(obj.option.number))
    builder.setWeight(obj.weight)
    return builder.build()
  }
}

public object TextProposalJvmConverter : ProtobufTypeMapper<TextProposal, Gov.TextProposal> {
  public override val descriptor: Descriptors.Descriptor = Gov.TextProposal.getDescriptor()

  public override val parser: Parser<Gov.TextProposal> = Gov.TextProposal.parser()

  public override fun convert(obj: Gov.TextProposal): TextProposal = TextProposal(
  	title = obj.title,
  	description = obj.description,
  )

  public override fun convert(obj: TextProposal): Gov.TextProposal {
    val builder = Gov.TextProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    return builder.build()
  }
}

public object DepositJvmConverter : ProtobufTypeMapper<Deposit, Gov.Deposit> {
  public override val descriptor: Descriptors.Descriptor = Gov.Deposit.getDescriptor()

  public override val parser: Parser<Gov.Deposit> = Gov.Deposit.parser()

  public override fun convert(obj: Gov.Deposit): Deposit = Deposit(
  	proposalId = obj.proposalId.asKotlinType,
  	depositor = obj.depositor,
  	amount = obj.amountList.map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: Deposit): Gov.Deposit {
    val builder = Gov.Deposit.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setDepositor(obj.depositor)
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ProposalJvmConverter : ProtobufTypeMapper<Proposal, Gov.Proposal> {
  public override val descriptor: Descriptors.Descriptor = Gov.Proposal.getDescriptor()

  public override val parser: Parser<Gov.Proposal> = Gov.Proposal.parser()

  public override fun convert(obj: Gov.Proposal): Proposal = Proposal(
  	proposalId = obj.proposalId.asKotlinType,
  	content = AnyJvmConverter.convert(obj.content),
  	status = ProposalStatus.forNumber(obj.status.number),
  	finalTallyResult = TallyResultJvmConverter.convert(obj.finalTallyResult),
  	submitTime = TimestampJvmConverter.convert(obj.submitTime),
  	depositEndTime = TimestampJvmConverter.convert(obj.depositEndTime),
  	totalDeposit = obj.totalDepositList.map { CoinJvmConverter.convert(it) },
  	votingStartTime = TimestampJvmConverter.convert(obj.votingStartTime),
  	votingEndTime = TimestampJvmConverter.convert(obj.votingEndTime),
  )

  public override fun convert(obj: Proposal): Gov.Proposal {
    val builder = Gov.Proposal.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setContent(AnyJvmConverter.convert(obj.content))
    builder.setStatus(Gov.ProposalStatus.forNumber(obj.status.number))
    builder.setFinalTallyResult(TallyResultJvmConverter.convert(obj.finalTallyResult))
    builder.setSubmitTime(TimestampJvmConverter.convert(obj.submitTime))
    builder.setDepositEndTime(TimestampJvmConverter.convert(obj.depositEndTime))
    builder.addAllTotalDeposit(obj.totalDeposit.map { CoinJvmConverter.convert(it) })
    builder.setVotingStartTime(TimestampJvmConverter.convert(obj.votingStartTime))
    builder.setVotingEndTime(TimestampJvmConverter.convert(obj.votingEndTime))
    return builder.build()
  }
}

public object TallyResultJvmConverter : ProtobufTypeMapper<TallyResult, Gov.TallyResult> {
  public override val descriptor: Descriptors.Descriptor = Gov.TallyResult.getDescriptor()

  public override val parser: Parser<Gov.TallyResult> = Gov.TallyResult.parser()

  public override fun convert(obj: Gov.TallyResult): TallyResult = TallyResult(
  	yes = obj.yes,
  	abstain = obj.abstain,
  	no = obj.no,
  	noWithVeto = obj.noWithVeto,
  )

  public override fun convert(obj: TallyResult): Gov.TallyResult {
    val builder = Gov.TallyResult.newBuilder()
    builder.setYes(obj.yes)
    builder.setAbstain(obj.abstain)
    builder.setNo(obj.no)
    builder.setNoWithVeto(obj.noWithVeto)
    return builder.build()
  }
}

public object VoteJvmConverter : ProtobufTypeMapper<Vote, Gov.Vote> {
  public override val descriptor: Descriptors.Descriptor = Gov.Vote.getDescriptor()

  public override val parser: Parser<Gov.Vote> = Gov.Vote.parser()

  public override fun convert(obj: Gov.Vote): Vote = Vote(
  	proposalId = obj.proposalId.asKotlinType,
  	voter = obj.voter,
  	option = VoteOption.forNumber(obj.option.number),
  	options = obj.optionsList.map { WeightedVoteOptionJvmConverter.convert(it) },
  )

  public override fun convert(obj: Vote): Gov.Vote {
    val builder = Gov.Vote.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setVoter(obj.voter)
    builder.setOption(Gov.VoteOption.forNumber(obj.option.number))
    builder.addAllOptions(obj.options.map { WeightedVoteOptionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object DepositParamsJvmConverter : ProtobufTypeMapper<DepositParams, Gov.DepositParams> {
  public override val descriptor: Descriptors.Descriptor = Gov.DepositParams.getDescriptor()

  public override val parser: Parser<Gov.DepositParams> = Gov.DepositParams.parser()

  public override fun convert(obj: Gov.DepositParams): DepositParams = DepositParams(
  	minDeposit = obj.minDepositList.map { CoinJvmConverter.convert(it) },
  	maxDepositPeriod = DurationJvmConverter.convert(obj.maxDepositPeriod),
  )

  public override fun convert(obj: DepositParams): Gov.DepositParams {
    val builder = Gov.DepositParams.newBuilder()
    builder.addAllMinDeposit(obj.minDeposit.map { CoinJvmConverter.convert(it) })
    builder.setMaxDepositPeriod(DurationJvmConverter.convert(obj.maxDepositPeriod))
    return builder.build()
  }
}

public object VotingParamsJvmConverter : ProtobufTypeMapper<VotingParams, Gov.VotingParams> {
  public override val descriptor: Descriptors.Descriptor = Gov.VotingParams.getDescriptor()

  public override val parser: Parser<Gov.VotingParams> = Gov.VotingParams.parser()

  public override fun convert(obj: Gov.VotingParams): VotingParams = VotingParams(
  	votingPeriod = DurationJvmConverter.convert(obj.votingPeriod),
  )

  public override fun convert(obj: VotingParams): Gov.VotingParams {
    val builder = Gov.VotingParams.newBuilder()
    builder.setVotingPeriod(DurationJvmConverter.convert(obj.votingPeriod))
    return builder.build()
  }
}

public object TallyParamsJvmConverter : ProtobufTypeMapper<TallyParams, Gov.TallyParams> {
  public override val descriptor: Descriptors.Descriptor = Gov.TallyParams.getDescriptor()

  public override val parser: Parser<Gov.TallyParams> = Gov.TallyParams.parser()

  public override fun convert(obj: Gov.TallyParams): TallyParams = TallyParams(
  	quorum = obj.quorum.toByteArray(),
  	threshold = obj.threshold.toByteArray(),
  	vetoThreshold = obj.vetoThreshold.toByteArray(),
  )

  public override fun convert(obj: TallyParams): Gov.TallyParams {
    val builder = Gov.TallyParams.newBuilder()
    builder.setQuorum(ByteString.copyFrom(obj.quorum))
    builder.setThreshold(ByteString.copyFrom(obj.threshold))
    builder.setVetoThreshold(ByteString.copyFrom(obj.vetoThreshold))
    return builder.build()
  }
}
