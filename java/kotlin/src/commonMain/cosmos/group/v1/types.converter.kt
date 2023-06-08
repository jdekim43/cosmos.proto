// Transform from cosmos/group/v1/types.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.group.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MemberConverter : ProtobufConverter<Member>

public expect object MemberRequestConverter : ProtobufConverter<MemberRequest>

public expect object ThresholdDecisionPolicyConverter : ProtobufConverter<ThresholdDecisionPolicy>

public expect object PercentageDecisionPolicyConverter : ProtobufConverter<PercentageDecisionPolicy>

public expect object DecisionPolicyWindowsConverter : ProtobufConverter<DecisionPolicyWindows>

public expect object GroupInfoConverter : ProtobufConverter<GroupInfo>

public expect object GroupMemberConverter : ProtobufConverter<GroupMember>

public expect object GroupPolicyInfoConverter : ProtobufConverter<GroupPolicyInfo>

public expect object ProposalConverter : ProtobufConverter<Proposal>

public expect object TallyResultConverter : ProtobufConverter<TallyResult>

public expect object VoteConverter : ProtobufConverter<Vote>
