// Transform from cosmos/group/v1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.group.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MsgCreateGroupConverter : ProtobufConverter<MsgCreateGroup>

public expect object MsgCreateGroupResponseConverter : ProtobufConverter<MsgCreateGroupResponse>

public expect object MsgUpdateGroupMembersConverter : ProtobufConverter<MsgUpdateGroupMembers>

public expect object MsgUpdateGroupMembersResponseConverter :
    ProtobufConverter<MsgUpdateGroupMembersResponse>

public expect object MsgUpdateGroupAdminConverter : ProtobufConverter<MsgUpdateGroupAdmin>

public expect object MsgUpdateGroupAdminResponseConverter :
    ProtobufConverter<MsgUpdateGroupAdminResponse>

public expect object MsgUpdateGroupMetadataConverter : ProtobufConverter<MsgUpdateGroupMetadata>

public expect object MsgUpdateGroupMetadataResponseConverter :
    ProtobufConverter<MsgUpdateGroupMetadataResponse>

public expect object MsgCreateGroupPolicyConverter : ProtobufConverter<MsgCreateGroupPolicy>

public expect object MsgCreateGroupPolicyResponseConverter :
    ProtobufConverter<MsgCreateGroupPolicyResponse>

public expect object MsgUpdateGroupPolicyAdminConverter :
    ProtobufConverter<MsgUpdateGroupPolicyAdmin>

public expect object MsgUpdateGroupPolicyAdminResponseConverter :
    ProtobufConverter<MsgUpdateGroupPolicyAdminResponse>

public expect object MsgCreateGroupWithPolicyConverter : ProtobufConverter<MsgCreateGroupWithPolicy>

public expect object MsgCreateGroupWithPolicyResponseConverter :
    ProtobufConverter<MsgCreateGroupWithPolicyResponse>

public expect object MsgUpdateGroupPolicyDecisionPolicyConverter :
    ProtobufConverter<MsgUpdateGroupPolicyDecisionPolicy>

public expect object MsgUpdateGroupPolicyDecisionPolicyResponseConverter :
    ProtobufConverter<MsgUpdateGroupPolicyDecisionPolicyResponse>

public expect object MsgUpdateGroupPolicyMetadataConverter :
    ProtobufConverter<MsgUpdateGroupPolicyMetadata>

public expect object MsgUpdateGroupPolicyMetadataResponseConverter :
    ProtobufConverter<MsgUpdateGroupPolicyMetadataResponse>

public expect object MsgSubmitProposalConverter : ProtobufConverter<MsgSubmitProposal>

public expect object MsgSubmitProposalResponseConverter :
    ProtobufConverter<MsgSubmitProposalResponse>

public expect object MsgWithdrawProposalConverter : ProtobufConverter<MsgWithdrawProposal>

public expect object MsgWithdrawProposalResponseConverter :
    ProtobufConverter<MsgWithdrawProposalResponse>

public expect object MsgVoteConverter : ProtobufConverter<MsgVote>

public expect object MsgVoteResponseConverter : ProtobufConverter<MsgVoteResponse>

public expect object MsgExecConverter : ProtobufConverter<MsgExec>

public expect object MsgExecResponseConverter : ProtobufConverter<MsgExecResponse>

public expect object MsgLeaveGroupConverter : ProtobufConverter<MsgLeaveGroup>

public expect object MsgLeaveGroupResponseConverter : ProtobufConverter<MsgLeaveGroupResponse>
