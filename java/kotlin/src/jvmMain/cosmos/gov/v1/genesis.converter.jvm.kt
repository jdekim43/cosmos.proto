// Transform from cosmos/gov/v1/genesis.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.gov.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	startingProposalId = obj.startingProposalId.asKotlinType,
  	deposits = obj.depositsList.map { DepositJvmConverter.convert(it) },
  	votes = obj.votesList.map { VoteJvmConverter.convert(it) },
  	proposals = obj.proposalsList.map { ProposalJvmConverter.convert(it) },
  	depositParams = DepositParamsJvmConverter.convert(obj.depositParams),
  	votingParams = VotingParamsJvmConverter.convert(obj.votingParams),
  	tallyParams = TallyParamsJvmConverter.convert(obj.tallyParams),
  	params = ParamsJvmConverter.convert(obj.params),
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setStartingProposalId(obj.startingProposalId.asJavaType)
    builder.addAllDeposits(obj.deposits.map { DepositJvmConverter.convert(it) })
    builder.addAllVotes(obj.votes.map { VoteJvmConverter.convert(it) })
    builder.addAllProposals(obj.proposals.map { ProposalJvmConverter.convert(it) })
    builder.setDepositParams(DepositParamsJvmConverter.convert(obj.depositParams))
    builder.setVotingParams(VotingParamsJvmConverter.convert(obj.votingParams))
    builder.setTallyParams(TallyParamsJvmConverter.convert(obj.tallyParams))
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}
