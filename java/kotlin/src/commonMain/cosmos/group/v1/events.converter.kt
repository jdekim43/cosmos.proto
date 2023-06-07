// Transform from cosmos/group/v1/events.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.group.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object EventCreateGroupConverter : ProtobufConverter<EventCreateGroup>

public expect object EventUpdateGroupConverter : ProtobufConverter<EventUpdateGroup>

public expect object EventCreateGroupPolicyConverter : ProtobufConverter<EventCreateGroupPolicy>

public expect object EventUpdateGroupPolicyConverter : ProtobufConverter<EventUpdateGroupPolicy>

public expect object EventSubmitProposalConverter : ProtobufConverter<EventSubmitProposal>

public expect object EventWithdrawProposalConverter : ProtobufConverter<EventWithdrawProposal>

public expect object EventVoteConverter : ProtobufConverter<EventVote>

public expect object EventExecConverter : ProtobufConverter<EventExec>

public expect object EventLeaveGroupConverter : ProtobufConverter<EventLeaveGroup>
