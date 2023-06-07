// Transform from cosmos/gov/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.gov.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MsgSubmitProposalJvmConverter :
    ProtobufTypeMapper<MsgSubmitProposal, Tx.MsgSubmitProposal> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSubmitProposal.getDescriptor()

  public override val parser: Parser<Tx.MsgSubmitProposal> = Tx.MsgSubmitProposal.parser()

  public override fun convert(obj: Tx.MsgSubmitProposal): MsgSubmitProposal = MsgSubmitProposal(
  	content = AnyJvmConverter.convert(obj.content),
  	initialDeposit = obj.initialDepositList.map { CoinJvmConverter.convert(it) },
  	proposer = obj.proposer,
  )

  public override fun convert(obj: MsgSubmitProposal): Tx.MsgSubmitProposal {
    val builder = Tx.MsgSubmitProposal.newBuilder()
    builder.setContent(AnyJvmConverter.convert(obj.content))
    builder.addAllInitialDeposit(obj.initialDeposit.map { CoinJvmConverter.convert(it) })
    builder.setProposer(obj.proposer)
    return builder.build()
  }
}

public object MsgSubmitProposalResponseJvmConverter :
    ProtobufTypeMapper<MsgSubmitProposalResponse, Tx.MsgSubmitProposalResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgSubmitProposalResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSubmitProposalResponse> =
      Tx.MsgSubmitProposalResponse.parser()

  public override fun convert(obj: Tx.MsgSubmitProposalResponse): MsgSubmitProposalResponse =
      MsgSubmitProposalResponse(
  	proposalId = obj.proposalId.asKotlinType,
  )

  public override fun convert(obj: MsgSubmitProposalResponse): Tx.MsgSubmitProposalResponse {
    val builder = Tx.MsgSubmitProposalResponse.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    return builder.build()
  }
}

public object MsgVoteJvmConverter : ProtobufTypeMapper<MsgVote, Tx.MsgVote> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgVote.getDescriptor()

  public override val parser: Parser<Tx.MsgVote> = Tx.MsgVote.parser()

  public override fun convert(obj: Tx.MsgVote): MsgVote = MsgVote(
  	proposalId = obj.proposalId.asKotlinType,
  	voter = obj.voter,
  	option = VoteOption.forNumber(obj.option.number),
  )

  public override fun convert(obj: MsgVote): Tx.MsgVote {
    val builder = Tx.MsgVote.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setVoter(obj.voter)
    builder.setOption(Gov.VoteOption.forNumber(obj.option.number))
    return builder.build()
  }
}

public object MsgVoteResponseJvmConverter : ProtobufTypeMapper<MsgVoteResponse, Tx.MsgVoteResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgVoteResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgVoteResponse> = Tx.MsgVoteResponse.parser()

  public override fun convert(obj: Tx.MsgVoteResponse): MsgVoteResponse = MsgVoteResponse(
  )

  public override fun convert(obj: MsgVoteResponse): Tx.MsgVoteResponse {
    val builder = Tx.MsgVoteResponse.newBuilder()
    return builder.build()
  }
}

public object MsgVoteWeightedJvmConverter : ProtobufTypeMapper<MsgVoteWeighted, Tx.MsgVoteWeighted>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgVoteWeighted.getDescriptor()

  public override val parser: Parser<Tx.MsgVoteWeighted> = Tx.MsgVoteWeighted.parser()

  public override fun convert(obj: Tx.MsgVoteWeighted): MsgVoteWeighted = MsgVoteWeighted(
  	proposalId = obj.proposalId.asKotlinType,
  	voter = obj.voter,
  	options = obj.optionsList.map { WeightedVoteOptionJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgVoteWeighted): Tx.MsgVoteWeighted {
    val builder = Tx.MsgVoteWeighted.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setVoter(obj.voter)
    builder.addAllOptions(obj.options.map { WeightedVoteOptionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgVoteWeightedResponseJvmConverter :
    ProtobufTypeMapper<MsgVoteWeightedResponse, Tx.MsgVoteWeightedResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgVoteWeightedResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgVoteWeightedResponse> =
      Tx.MsgVoteWeightedResponse.parser()

  public override fun convert(obj: Tx.MsgVoteWeightedResponse): MsgVoteWeightedResponse =
      MsgVoteWeightedResponse(
  )

  public override fun convert(obj: MsgVoteWeightedResponse): Tx.MsgVoteWeightedResponse {
    val builder = Tx.MsgVoteWeightedResponse.newBuilder()
    return builder.build()
  }
}

public object MsgDepositJvmConverter : ProtobufTypeMapper<MsgDeposit, Tx.MsgDeposit> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgDeposit.getDescriptor()

  public override val parser: Parser<Tx.MsgDeposit> = Tx.MsgDeposit.parser()

  public override fun convert(obj: Tx.MsgDeposit): MsgDeposit = MsgDeposit(
  	proposalId = obj.proposalId.asKotlinType,
  	depositor = obj.depositor,
  	amount = obj.amountList.map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgDeposit): Tx.MsgDeposit {
    val builder = Tx.MsgDeposit.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setDepositor(obj.depositor)
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgDepositResponseJvmConverter :
    ProtobufTypeMapper<MsgDepositResponse, Tx.MsgDepositResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgDepositResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgDepositResponse> = Tx.MsgDepositResponse.parser()

  public override fun convert(obj: Tx.MsgDepositResponse): MsgDepositResponse = MsgDepositResponse(
  )

  public override fun convert(obj: MsgDepositResponse): Tx.MsgDepositResponse {
    val builder = Tx.MsgDepositResponse.newBuilder()
    return builder.build()
  }
}