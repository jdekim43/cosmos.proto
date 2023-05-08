// Transform from cosmos/group/v1/types.proto
package cosmos.group.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyMapper
import google.protobuf.DurationMapper
import google.protobuf.TimestampMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MemberMapper : ProtobufTypeMapper<Member, Types.Member> {
  public override val descriptor: Descriptors.Descriptor = Types.Member.getDescriptor()

  public override val parser: Parser<Types.Member> = Types.Member.parser()

  public override fun convert(obj: Types.Member): Member = Member(
  	address = obj.address,
  	weight = obj.weight,
  	metadata = obj.metadata,
  	addedAt = TimestampMapper.convert(obj.addedAt),
  )

  public override fun convert(obj: Member): Types.Member {
    val builder = Types.Member.newBuilder()
    builder.setAddress(obj.address)
    builder.setWeight(obj.weight)
    builder.setMetadata(obj.metadata)
    builder.setAddedAt(TimestampMapper.convert(obj.addedAt))
    return builder.build()
  }
}

public object MemberRequestMapper : ProtobufTypeMapper<MemberRequest, Types.MemberRequest> {
  public override val descriptor: Descriptors.Descriptor = Types.MemberRequest.getDescriptor()

  public override val parser: Parser<Types.MemberRequest> = Types.MemberRequest.parser()

  public override fun convert(obj: Types.MemberRequest): MemberRequest = MemberRequest(
  	address = obj.address,
  	weight = obj.weight,
  	metadata = obj.metadata,
  )

  public override fun convert(obj: MemberRequest): Types.MemberRequest {
    val builder = Types.MemberRequest.newBuilder()
    builder.setAddress(obj.address)
    builder.setWeight(obj.weight)
    builder.setMetadata(obj.metadata)
    return builder.build()
  }
}

public object ThresholdDecisionPolicyMapper :
    ProtobufTypeMapper<ThresholdDecisionPolicy, Types.ThresholdDecisionPolicy> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ThresholdDecisionPolicy.getDescriptor()

  public override val parser: Parser<Types.ThresholdDecisionPolicy> =
      Types.ThresholdDecisionPolicy.parser()

  public override fun convert(obj: Types.ThresholdDecisionPolicy): ThresholdDecisionPolicy =
      ThresholdDecisionPolicy(
  	threshold = obj.threshold,
  	windows = DecisionPolicyWindowsMapper.convert(obj.windows),
  )

  public override fun convert(obj: ThresholdDecisionPolicy): Types.ThresholdDecisionPolicy {
    val builder = Types.ThresholdDecisionPolicy.newBuilder()
    builder.setThreshold(obj.threshold)
    builder.setWindows(DecisionPolicyWindowsMapper.convert(obj.windows))
    return builder.build()
  }
}

public object PercentageDecisionPolicyMapper :
    ProtobufTypeMapper<PercentageDecisionPolicy, Types.PercentageDecisionPolicy> {
  public override val descriptor: Descriptors.Descriptor =
      Types.PercentageDecisionPolicy.getDescriptor()

  public override val parser: Parser<Types.PercentageDecisionPolicy> =
      Types.PercentageDecisionPolicy.parser()

  public override fun convert(obj: Types.PercentageDecisionPolicy): PercentageDecisionPolicy =
      PercentageDecisionPolicy(
  	percentage = obj.percentage,
  	windows = DecisionPolicyWindowsMapper.convert(obj.windows),
  )

  public override fun convert(obj: PercentageDecisionPolicy): Types.PercentageDecisionPolicy {
    val builder = Types.PercentageDecisionPolicy.newBuilder()
    builder.setPercentage(obj.percentage)
    builder.setWindows(DecisionPolicyWindowsMapper.convert(obj.windows))
    return builder.build()
  }
}

public object DecisionPolicyWindowsMapper :
    ProtobufTypeMapper<DecisionPolicyWindows, Types.DecisionPolicyWindows> {
  public override val descriptor: Descriptors.Descriptor =
      Types.DecisionPolicyWindows.getDescriptor()

  public override val parser: Parser<Types.DecisionPolicyWindows> =
      Types.DecisionPolicyWindows.parser()

  public override fun convert(obj: Types.DecisionPolicyWindows): DecisionPolicyWindows =
      DecisionPolicyWindows(
  	votingPeriod = DurationMapper.convert(obj.votingPeriod),
  	minExecutionPeriod = DurationMapper.convert(obj.minExecutionPeriod),
  )

  public override fun convert(obj: DecisionPolicyWindows): Types.DecisionPolicyWindows {
    val builder = Types.DecisionPolicyWindows.newBuilder()
    builder.setVotingPeriod(DurationMapper.convert(obj.votingPeriod))
    builder.setMinExecutionPeriod(DurationMapper.convert(obj.minExecutionPeriod))
    return builder.build()
  }
}

public object GroupInfoMapper : ProtobufTypeMapper<GroupInfo, Types.GroupInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.GroupInfo.getDescriptor()

  public override val parser: Parser<Types.GroupInfo> = Types.GroupInfo.parser()

  public override fun convert(obj: Types.GroupInfo): GroupInfo = GroupInfo(
  	id = obj.id.asKotlinType,
  	admin = obj.admin,
  	metadata = obj.metadata,
  	version = obj.version.asKotlinType,
  	totalWeight = obj.totalWeight,
  	createdAt = TimestampMapper.convert(obj.createdAt),
  )

  public override fun convert(obj: GroupInfo): Types.GroupInfo {
    val builder = Types.GroupInfo.newBuilder()
    builder.setId(obj.id.asJavaType)
    builder.setAdmin(obj.admin)
    builder.setMetadata(obj.metadata)
    builder.setVersion(obj.version.asJavaType)
    builder.setTotalWeight(obj.totalWeight)
    builder.setCreatedAt(TimestampMapper.convert(obj.createdAt))
    return builder.build()
  }
}

public object GroupMemberMapper : ProtobufTypeMapper<GroupMember, Types.GroupMember> {
  public override val descriptor: Descriptors.Descriptor = Types.GroupMember.getDescriptor()

  public override val parser: Parser<Types.GroupMember> = Types.GroupMember.parser()

  public override fun convert(obj: Types.GroupMember): GroupMember = GroupMember(
  	groupId = obj.groupId.asKotlinType,
  	member = MemberMapper.convert(obj.member),
  )

  public override fun convert(obj: GroupMember): Types.GroupMember {
    val builder = Types.GroupMember.newBuilder()
    builder.setGroupId(obj.groupId.asJavaType)
    builder.setMember(MemberMapper.convert(obj.member))
    return builder.build()
  }
}

public object GroupPolicyInfoMapper : ProtobufTypeMapper<GroupPolicyInfo, Types.GroupPolicyInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.GroupPolicyInfo.getDescriptor()

  public override val parser: Parser<Types.GroupPolicyInfo> = Types.GroupPolicyInfo.parser()

  public override fun convert(obj: Types.GroupPolicyInfo): GroupPolicyInfo = GroupPolicyInfo(
  	address = obj.address,
  	groupId = obj.groupId.asKotlinType,
  	admin = obj.admin,
  	metadata = obj.metadata,
  	version = obj.version.asKotlinType,
  	decisionPolicy = AnyMapper.convert(obj.decisionPolicy),
  	createdAt = TimestampMapper.convert(obj.createdAt),
  )

  public override fun convert(obj: GroupPolicyInfo): Types.GroupPolicyInfo {
    val builder = Types.GroupPolicyInfo.newBuilder()
    builder.setAddress(obj.address)
    builder.setGroupId(obj.groupId.asJavaType)
    builder.setAdmin(obj.admin)
    builder.setMetadata(obj.metadata)
    builder.setVersion(obj.version.asJavaType)
    builder.setDecisionPolicy(AnyMapper.convert(obj.decisionPolicy))
    builder.setCreatedAt(TimestampMapper.convert(obj.createdAt))
    return builder.build()
  }
}

public object ProposalMapper : ProtobufTypeMapper<Proposal, Types.Proposal> {
  public override val descriptor: Descriptors.Descriptor = Types.Proposal.getDescriptor()

  public override val parser: Parser<Types.Proposal> = Types.Proposal.parser()

  public override fun convert(obj: Types.Proposal): Proposal = Proposal(
  	id = obj.id.asKotlinType,
  	groupPolicyAddress = obj.groupPolicyAddress,
  	metadata = obj.metadata,
  	proposers = obj.proposersList.map { it },
  	submitTime = TimestampMapper.convert(obj.submitTime),
  	groupVersion = obj.groupVersion.asKotlinType,
  	groupPolicyVersion = obj.groupPolicyVersion.asKotlinType,
  	status = ProposalStatus.forNumber(obj.status.number),
  	finalTallyResult = TallyResultMapper.convert(obj.finalTallyResult),
  	votingPeriodEnd = TimestampMapper.convert(obj.votingPeriodEnd),
  	executorResult = ProposalExecutorResult.forNumber(obj.executorResult.number),
  	messages = obj.messagesList.map { AnyMapper.convert(it) },
  	title = obj.title,
  	summary = obj.summary,
  )

  public override fun convert(obj: Proposal): Types.Proposal {
    val builder = Types.Proposal.newBuilder()
    builder.setId(obj.id.asJavaType)
    builder.setGroupPolicyAddress(obj.groupPolicyAddress)
    builder.setMetadata(obj.metadata)
    builder.addAllProposers(obj.proposers.map { it })
    builder.setSubmitTime(TimestampMapper.convert(obj.submitTime))
    builder.setGroupVersion(obj.groupVersion.asJavaType)
    builder.setGroupPolicyVersion(obj.groupPolicyVersion.asJavaType)
    builder.setStatus(Types.ProposalStatus.forNumber(obj.status.number))
    builder.setFinalTallyResult(TallyResultMapper.convert(obj.finalTallyResult))
    builder.setVotingPeriodEnd(TimestampMapper.convert(obj.votingPeriodEnd))
    builder.setExecutorResult(Types.ProposalExecutorResult.forNumber(obj.executorResult.number))
    builder.addAllMessages(obj.messages.map { AnyMapper.convert(it) })
    builder.setTitle(obj.title)
    builder.setSummary(obj.summary)
    return builder.build()
  }
}

public object TallyResultMapper : ProtobufTypeMapper<TallyResult, Types.TallyResult> {
  public override val descriptor: Descriptors.Descriptor = Types.TallyResult.getDescriptor()

  public override val parser: Parser<Types.TallyResult> = Types.TallyResult.parser()

  public override fun convert(obj: Types.TallyResult): TallyResult = TallyResult(
  	yesCount = obj.yesCount,
  	abstainCount = obj.abstainCount,
  	noCount = obj.noCount,
  	noWithVetoCount = obj.noWithVetoCount,
  )

  public override fun convert(obj: TallyResult): Types.TallyResult {
    val builder = Types.TallyResult.newBuilder()
    builder.setYesCount(obj.yesCount)
    builder.setAbstainCount(obj.abstainCount)
    builder.setNoCount(obj.noCount)
    builder.setNoWithVetoCount(obj.noWithVetoCount)
    return builder.build()
  }
}

public object VoteMapper : ProtobufTypeMapper<Vote, Types.Vote> {
  public override val descriptor: Descriptors.Descriptor = Types.Vote.getDescriptor()

  public override val parser: Parser<Types.Vote> = Types.Vote.parser()

  public override fun convert(obj: Types.Vote): Vote = Vote(
  	proposalId = obj.proposalId.asKotlinType,
  	voter = obj.voter,
  	option = VoteOption.forNumber(obj.option.number),
  	metadata = obj.metadata,
  	submitTime = TimestampMapper.convert(obj.submitTime),
  )

  public override fun convert(obj: Vote): Types.Vote {
    val builder = Types.Vote.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setVoter(obj.voter)
    builder.setOption(Types.VoteOption.forNumber(obj.option.number))
    builder.setMetadata(obj.metadata)
    builder.setSubmitTime(TimestampMapper.convert(obj.submitTime))
    return builder.build()
  }
}
