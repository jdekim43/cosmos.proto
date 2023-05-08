// Transform from cosmos/group/v1/events.proto
package cosmos.group.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object EventCreateGroupMapper : ProtobufTypeMapper<EventCreateGroup, Events.EventCreateGroup>
    {
  public override val descriptor: Descriptors.Descriptor = Events.EventCreateGroup.getDescriptor()

  public override val parser: Parser<Events.EventCreateGroup> = Events.EventCreateGroup.parser()

  public override fun convert(obj: Events.EventCreateGroup): EventCreateGroup = EventCreateGroup(
  	groupId = obj.groupId.asKotlinType,
  )

  public override fun convert(obj: EventCreateGroup): Events.EventCreateGroup {
    val builder = Events.EventCreateGroup.newBuilder()
    builder.setGroupId(obj.groupId.asJavaType)
    return builder.build()
  }
}

public object EventUpdateGroupMapper : ProtobufTypeMapper<EventUpdateGroup, Events.EventUpdateGroup>
    {
  public override val descriptor: Descriptors.Descriptor = Events.EventUpdateGroup.getDescriptor()

  public override val parser: Parser<Events.EventUpdateGroup> = Events.EventUpdateGroup.parser()

  public override fun convert(obj: Events.EventUpdateGroup): EventUpdateGroup = EventUpdateGroup(
  	groupId = obj.groupId.asKotlinType,
  )

  public override fun convert(obj: EventUpdateGroup): Events.EventUpdateGroup {
    val builder = Events.EventUpdateGroup.newBuilder()
    builder.setGroupId(obj.groupId.asJavaType)
    return builder.build()
  }
}

public object EventCreateGroupPolicyMapper :
    ProtobufTypeMapper<EventCreateGroupPolicy, Events.EventCreateGroupPolicy> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventCreateGroupPolicy.getDescriptor()

  public override val parser: Parser<Events.EventCreateGroupPolicy> =
      Events.EventCreateGroupPolicy.parser()

  public override fun convert(obj: Events.EventCreateGroupPolicy): EventCreateGroupPolicy =
      EventCreateGroupPolicy(
  	address = obj.address,
  )

  public override fun convert(obj: EventCreateGroupPolicy): Events.EventCreateGroupPolicy {
    val builder = Events.EventCreateGroupPolicy.newBuilder()
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object EventUpdateGroupPolicyMapper :
    ProtobufTypeMapper<EventUpdateGroupPolicy, Events.EventUpdateGroupPolicy> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventUpdateGroupPolicy.getDescriptor()

  public override val parser: Parser<Events.EventUpdateGroupPolicy> =
      Events.EventUpdateGroupPolicy.parser()

  public override fun convert(obj: Events.EventUpdateGroupPolicy): EventUpdateGroupPolicy =
      EventUpdateGroupPolicy(
  	address = obj.address,
  )

  public override fun convert(obj: EventUpdateGroupPolicy): Events.EventUpdateGroupPolicy {
    val builder = Events.EventUpdateGroupPolicy.newBuilder()
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object EventSubmitProposalMapper :
    ProtobufTypeMapper<EventSubmitProposal, Events.EventSubmitProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventSubmitProposal.getDescriptor()

  public override val parser: Parser<Events.EventSubmitProposal> =
      Events.EventSubmitProposal.parser()

  public override fun convert(obj: Events.EventSubmitProposal): EventSubmitProposal =
      EventSubmitProposal(
  	proposalId = obj.proposalId.asKotlinType,
  )

  public override fun convert(obj: EventSubmitProposal): Events.EventSubmitProposal {
    val builder = Events.EventSubmitProposal.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    return builder.build()
  }
}

public object EventWithdrawProposalMapper :
    ProtobufTypeMapper<EventWithdrawProposal, Events.EventWithdrawProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventWithdrawProposal.getDescriptor()

  public override val parser: Parser<Events.EventWithdrawProposal> =
      Events.EventWithdrawProposal.parser()

  public override fun convert(obj: Events.EventWithdrawProposal): EventWithdrawProposal =
      EventWithdrawProposal(
  	proposalId = obj.proposalId.asKotlinType,
  )

  public override fun convert(obj: EventWithdrawProposal): Events.EventWithdrawProposal {
    val builder = Events.EventWithdrawProposal.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    return builder.build()
  }
}

public object EventVoteMapper : ProtobufTypeMapper<EventVote, Events.EventVote> {
  public override val descriptor: Descriptors.Descriptor = Events.EventVote.getDescriptor()

  public override val parser: Parser<Events.EventVote> = Events.EventVote.parser()

  public override fun convert(obj: Events.EventVote): EventVote = EventVote(
  	proposalId = obj.proposalId.asKotlinType,
  )

  public override fun convert(obj: EventVote): Events.EventVote {
    val builder = Events.EventVote.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    return builder.build()
  }
}

public object EventExecMapper : ProtobufTypeMapper<EventExec, Events.EventExec> {
  public override val descriptor: Descriptors.Descriptor = Events.EventExec.getDescriptor()

  public override val parser: Parser<Events.EventExec> = Events.EventExec.parser()

  public override fun convert(obj: Events.EventExec): EventExec = EventExec(
  	proposalId = obj.proposalId.asKotlinType,
  	result = ProposalExecutorResult.forNumber(obj.result.number),
  	logs = obj.logs,
  )

  public override fun convert(obj: EventExec): Events.EventExec {
    val builder = Events.EventExec.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setResult(Types.ProposalExecutorResult.forNumber(obj.result.number))
    builder.setLogs(obj.logs)
    return builder.build()
  }
}

public object EventLeaveGroupMapper : ProtobufTypeMapper<EventLeaveGroup, Events.EventLeaveGroup> {
  public override val descriptor: Descriptors.Descriptor = Events.EventLeaveGroup.getDescriptor()

  public override val parser: Parser<Events.EventLeaveGroup> = Events.EventLeaveGroup.parser()

  public override fun convert(obj: Events.EventLeaveGroup): EventLeaveGroup = EventLeaveGroup(
  	groupId = obj.groupId.asKotlinType,
  	address = obj.address,
  )

  public override fun convert(obj: EventLeaveGroup): Events.EventLeaveGroup {
    val builder = Events.EventLeaveGroup.newBuilder()
    builder.setGroupId(obj.groupId.asJavaType)
    builder.setAddress(obj.address)
    return builder.build()
  }
}
