// Transform from cosmos/gov/v1/tx.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.gov.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object MsgSubmitProposalConverter : ProtobufConverter<MsgSubmitProposal>

public expect object MsgSubmitProposalResponseConverter :
    ProtobufConverter<MsgSubmitProposalResponse>

public expect object MsgExecLegacyContentConverter : ProtobufConverter<MsgExecLegacyContent>

public expect object MsgExecLegacyContentResponseConverter :
    ProtobufConverter<MsgExecLegacyContentResponse>

public expect object MsgVoteConverter : ProtobufConverter<MsgVote>

public expect object MsgVoteResponseConverter : ProtobufConverter<MsgVoteResponse>

public expect object MsgVoteWeightedConverter : ProtobufConverter<MsgVoteWeighted>

public expect object MsgVoteWeightedResponseConverter : ProtobufConverter<MsgVoteWeightedResponse>

public expect object MsgDepositConverter : ProtobufConverter<MsgDeposit>

public expect object MsgDepositResponseConverter : ProtobufConverter<MsgDepositResponse>

public expect object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams>

public expect object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
