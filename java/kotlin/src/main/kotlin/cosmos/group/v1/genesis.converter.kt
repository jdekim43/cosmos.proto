// Transform from cosmos/group/v1/genesis.proto
package cosmos.group.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisStateMapper : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	groupSeq = obj.groupSeq.asKotlinType,
  	groups = obj.groupsList.map { GroupInfoMapper.convert(it) },
  	groupMembers = obj.groupMembersList.map { GroupMemberMapper.convert(it) },
  	groupPolicySeq = obj.groupPolicySeq.asKotlinType,
  	groupPolicies = obj.groupPoliciesList.map { GroupPolicyInfoMapper.convert(it) },
  	proposalSeq = obj.proposalSeq.asKotlinType,
  	proposals = obj.proposalsList.map { ProposalMapper.convert(it) },
  	votes = obj.votesList.map { VoteMapper.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setGroupSeq(obj.groupSeq.asJavaType)
    builder.addAllGroups(obj.groups.map { GroupInfoMapper.convert(it) })
    builder.addAllGroupMembers(obj.groupMembers.map { GroupMemberMapper.convert(it) })
    builder.setGroupPolicySeq(obj.groupPolicySeq.asJavaType)
    builder.addAllGroupPolicies(obj.groupPolicies.map { GroupPolicyInfoMapper.convert(it) })
    builder.setProposalSeq(obj.proposalSeq.asJavaType)
    builder.addAllProposals(obj.proposals.map { ProposalMapper.convert(it) })
    builder.addAllVotes(obj.votes.map { VoteMapper.convert(it) })
    return builder.build()
  }
}
