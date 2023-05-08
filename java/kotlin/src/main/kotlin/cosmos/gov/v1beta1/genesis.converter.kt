// Transform from cosmos/gov/v1beta1/genesis.proto
package cosmos.gov.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisStateMapper : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	startingProposalId = obj.startingProposalId.asKotlinType,
  	deposits = obj.depositsList.map { DepositMapper.convert(it) },
  	votes = obj.votesList.map { VoteMapper.convert(it) },
  	proposals = obj.proposalsList.map { ProposalMapper.convert(it) },
  	depositParams = DepositParamsMapper.convert(obj.depositParams),
  	votingParams = VotingParamsMapper.convert(obj.votingParams),
  	tallyParams = TallyParamsMapper.convert(obj.tallyParams),
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setStartingProposalId(obj.startingProposalId.asJavaType)
    builder.addAllDeposits(obj.deposits.map { DepositMapper.convert(it) })
    builder.addAllVotes(obj.votes.map { VoteMapper.convert(it) })
    builder.addAllProposals(obj.proposals.map { ProposalMapper.convert(it) })
    builder.setDepositParams(DepositParamsMapper.convert(obj.depositParams))
    builder.setVotingParams(VotingParamsMapper.convert(obj.votingParams))
    builder.setTallyParams(TallyParamsMapper.convert(obj.tallyParams))
    return builder.build()
  }
}
