// Transform from cosmos/gov/v1beta1/gov.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.gov.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object WeightedVoteOptionConverter : ProtobufConverter<WeightedVoteOption>

public expect object TextProposalConverter : ProtobufConverter<TextProposal>

public expect object DepositConverter : ProtobufConverter<Deposit>

public expect object ProposalConverter : ProtobufConverter<Proposal>

public expect object TallyResultConverter : ProtobufConverter<TallyResult>

public expect object VoteConverter : ProtobufConverter<Vote>

public expect object DepositParamsConverter : ProtobufConverter<DepositParams>

public expect object VotingParamsConverter : ProtobufConverter<VotingParams>

public expect object TallyParamsConverter : ProtobufConverter<TallyParams>
