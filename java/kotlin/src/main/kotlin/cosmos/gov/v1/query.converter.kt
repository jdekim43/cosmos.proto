// Transform from cosmos/gov/v1/query.proto
package cosmos.gov.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestMapper
import cosmos.base.query.v1beta1.PageResponseMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object QueryProposalRequestMapper :
    ProtobufTypeMapper<QueryProposalRequest, QueryOuterClass.QueryProposalRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryProposalRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryProposalRequest> =
      QueryOuterClass.QueryProposalRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryProposalRequest): QueryProposalRequest =
      QueryProposalRequest(
  	proposalId = obj.proposalId.asKotlinType,
  )

  public override fun convert(obj: QueryProposalRequest): QueryOuterClass.QueryProposalRequest {
    val builder = QueryOuterClass.QueryProposalRequest.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    return builder.build()
  }
}

public object QueryProposalResponseMapper :
    ProtobufTypeMapper<QueryProposalResponse, QueryOuterClass.QueryProposalResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryProposalResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryProposalResponse> =
      QueryOuterClass.QueryProposalResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryProposalResponse): QueryProposalResponse =
      QueryProposalResponse(
  	proposal = ProposalMapper.convert(obj.proposal),
  )

  public override fun convert(obj: QueryProposalResponse): QueryOuterClass.QueryProposalResponse {
    val builder = QueryOuterClass.QueryProposalResponse.newBuilder()
    builder.setProposal(ProposalMapper.convert(obj.proposal))
    return builder.build()
  }
}

public object QueryProposalsRequestMapper :
    ProtobufTypeMapper<QueryProposalsRequest, QueryOuterClass.QueryProposalsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryProposalsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryProposalsRequest> =
      QueryOuterClass.QueryProposalsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryProposalsRequest): QueryProposalsRequest =
      QueryProposalsRequest(
  	proposalStatus = ProposalStatus.forNumber(obj.proposalStatus.number),
  	voter = obj.voter,
  	depositor = obj.depositor,
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryProposalsRequest): QueryOuterClass.QueryProposalsRequest {
    val builder = QueryOuterClass.QueryProposalsRequest.newBuilder()
    builder.setProposalStatus(Gov.ProposalStatus.forNumber(obj.proposalStatus.number))
    builder.setVoter(obj.voter)
    builder.setDepositor(obj.depositor)
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryProposalsResponseMapper :
    ProtobufTypeMapper<QueryProposalsResponse, QueryOuterClass.QueryProposalsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryProposalsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryProposalsResponse> =
      QueryOuterClass.QueryProposalsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryProposalsResponse): QueryProposalsResponse =
      QueryProposalsResponse(
  	proposals = obj.proposalsList.map { ProposalMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryProposalsResponse): QueryOuterClass.QueryProposalsResponse {
    val builder = QueryOuterClass.QueryProposalsResponse.newBuilder()
    builder.addAllProposals(obj.proposals.map { ProposalMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryVoteRequestMapper :
    ProtobufTypeMapper<QueryVoteRequest, QueryOuterClass.QueryVoteRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVoteRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVoteRequest> =
      QueryOuterClass.QueryVoteRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryVoteRequest): QueryVoteRequest =
      QueryVoteRequest(
  	proposalId = obj.proposalId.asKotlinType,
  	voter = obj.voter,
  )

  public override fun convert(obj: QueryVoteRequest): QueryOuterClass.QueryVoteRequest {
    val builder = QueryOuterClass.QueryVoteRequest.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setVoter(obj.voter)
    return builder.build()
  }
}

public object QueryVoteResponseMapper :
    ProtobufTypeMapper<QueryVoteResponse, QueryOuterClass.QueryVoteResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVoteResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVoteResponse> =
      QueryOuterClass.QueryVoteResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryVoteResponse): QueryVoteResponse =
      QueryVoteResponse(
  	vote = VoteMapper.convert(obj.vote),
  )

  public override fun convert(obj: QueryVoteResponse): QueryOuterClass.QueryVoteResponse {
    val builder = QueryOuterClass.QueryVoteResponse.newBuilder()
    builder.setVote(VoteMapper.convert(obj.vote))
    return builder.build()
  }
}

public object QueryVotesRequestMapper :
    ProtobufTypeMapper<QueryVotesRequest, QueryOuterClass.QueryVotesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVotesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVotesRequest> =
      QueryOuterClass.QueryVotesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryVotesRequest): QueryVotesRequest =
      QueryVotesRequest(
  	proposalId = obj.proposalId.asKotlinType,
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryVotesRequest): QueryOuterClass.QueryVotesRequest {
    val builder = QueryOuterClass.QueryVotesRequest.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryVotesResponseMapper :
    ProtobufTypeMapper<QueryVotesResponse, QueryOuterClass.QueryVotesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVotesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVotesResponse> =
      QueryOuterClass.QueryVotesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryVotesResponse): QueryVotesResponse =
      QueryVotesResponse(
  	votes = obj.votesList.map { VoteMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryVotesResponse): QueryOuterClass.QueryVotesResponse {
    val builder = QueryOuterClass.QueryVotesResponse.newBuilder()
    builder.addAllVotes(obj.votes.map { VoteMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryParamsRequestMapper :
    ProtobufTypeMapper<QueryParamsRequest, QueryOuterClass.QueryParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsRequest> =
      QueryOuterClass.QueryParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsRequest): QueryParamsRequest =
      QueryParamsRequest(
  	paramsType = obj.paramsType,
  )

  public override fun convert(obj: QueryParamsRequest): QueryOuterClass.QueryParamsRequest {
    val builder = QueryOuterClass.QueryParamsRequest.newBuilder()
    builder.setParamsType(obj.paramsType)
    return builder.build()
  }
}

public object QueryParamsResponseMapper :
    ProtobufTypeMapper<QueryParamsResponse, QueryOuterClass.QueryParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsResponse> =
      QueryOuterClass.QueryParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsResponse): QueryParamsResponse =
      QueryParamsResponse(
  	votingParams = VotingParamsMapper.convert(obj.votingParams),
  	depositParams = DepositParamsMapper.convert(obj.depositParams),
  	tallyParams = TallyParamsMapper.convert(obj.tallyParams),
  	params = ParamsMapper.convert(obj.params),
  )

  public override fun convert(obj: QueryParamsResponse): QueryOuterClass.QueryParamsResponse {
    val builder = QueryOuterClass.QueryParamsResponse.newBuilder()
    builder.setVotingParams(VotingParamsMapper.convert(obj.votingParams))
    builder.setDepositParams(DepositParamsMapper.convert(obj.depositParams))
    builder.setTallyParams(TallyParamsMapper.convert(obj.tallyParams))
    builder.setParams(ParamsMapper.convert(obj.params))
    return builder.build()
  }
}

public object QueryDepositRequestMapper :
    ProtobufTypeMapper<QueryDepositRequest, QueryOuterClass.QueryDepositRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDepositRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDepositRequest> =
      QueryOuterClass.QueryDepositRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDepositRequest): QueryDepositRequest =
      QueryDepositRequest(
  	proposalId = obj.proposalId.asKotlinType,
  	depositor = obj.depositor,
  )

  public override fun convert(obj: QueryDepositRequest): QueryOuterClass.QueryDepositRequest {
    val builder = QueryOuterClass.QueryDepositRequest.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setDepositor(obj.depositor)
    return builder.build()
  }
}

public object QueryDepositResponseMapper :
    ProtobufTypeMapper<QueryDepositResponse, QueryOuterClass.QueryDepositResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDepositResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDepositResponse> =
      QueryOuterClass.QueryDepositResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDepositResponse): QueryDepositResponse =
      QueryDepositResponse(
  	deposit = DepositMapper.convert(obj.deposit),
  )

  public override fun convert(obj: QueryDepositResponse): QueryOuterClass.QueryDepositResponse {
    val builder = QueryOuterClass.QueryDepositResponse.newBuilder()
    builder.setDeposit(DepositMapper.convert(obj.deposit))
    return builder.build()
  }
}

public object QueryDepositsRequestMapper :
    ProtobufTypeMapper<QueryDepositsRequest, QueryOuterClass.QueryDepositsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDepositsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDepositsRequest> =
      QueryOuterClass.QueryDepositsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDepositsRequest): QueryDepositsRequest =
      QueryDepositsRequest(
  	proposalId = obj.proposalId.asKotlinType,
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryDepositsRequest): QueryOuterClass.QueryDepositsRequest {
    val builder = QueryOuterClass.QueryDepositsRequest.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryDepositsResponseMapper :
    ProtobufTypeMapper<QueryDepositsResponse, QueryOuterClass.QueryDepositsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDepositsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDepositsResponse> =
      QueryOuterClass.QueryDepositsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDepositsResponse): QueryDepositsResponse =
      QueryDepositsResponse(
  	deposits = obj.depositsList.map { DepositMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryDepositsResponse): QueryOuterClass.QueryDepositsResponse {
    val builder = QueryOuterClass.QueryDepositsResponse.newBuilder()
    builder.addAllDeposits(obj.deposits.map { DepositMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryTallyResultRequestMapper :
    ProtobufTypeMapper<QueryTallyResultRequest, QueryOuterClass.QueryTallyResultRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTallyResultRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTallyResultRequest> =
      QueryOuterClass.QueryTallyResultRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTallyResultRequest): QueryTallyResultRequest
      = QueryTallyResultRequest(
  	proposalId = obj.proposalId.asKotlinType,
  )

  public override fun convert(obj: QueryTallyResultRequest):
      QueryOuterClass.QueryTallyResultRequest {
    val builder = QueryOuterClass.QueryTallyResultRequest.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    return builder.build()
  }
}

public object QueryTallyResultResponseMapper :
    ProtobufTypeMapper<QueryTallyResultResponse, QueryOuterClass.QueryTallyResultResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTallyResultResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTallyResultResponse> =
      QueryOuterClass.QueryTallyResultResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTallyResultResponse):
      QueryTallyResultResponse = QueryTallyResultResponse(
  	tally = TallyResultMapper.convert(obj.tally),
  )

  public override fun convert(obj: QueryTallyResultResponse):
      QueryOuterClass.QueryTallyResultResponse {
    val builder = QueryOuterClass.QueryTallyResultResponse.newBuilder()
    builder.setTally(TallyResultMapper.convert(obj.tally))
    return builder.build()
  }
}
