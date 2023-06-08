// Transform from tendermint/abci/types.proto
@file:GeneratorVersion(version = "0.2.2")

package tendermint.abci

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object RequestConverter : ProtobufConverter<Request>

public expect object RequestEchoConverter : ProtobufConverter<RequestEcho>

public expect object RequestFlushConverter : ProtobufConverter<RequestFlush>

public expect object RequestInfoConverter : ProtobufConverter<RequestInfo>

public expect object RequestInitChainConverter : ProtobufConverter<RequestInitChain>

public expect object RequestQueryConverter : ProtobufConverter<RequestQuery>

public expect object RequestBeginBlockConverter : ProtobufConverter<RequestBeginBlock>

public expect object RequestCheckTxConverter : ProtobufConverter<RequestCheckTx>

public expect object RequestDeliverTxConverter : ProtobufConverter<RequestDeliverTx>

public expect object RequestEndBlockConverter : ProtobufConverter<RequestEndBlock>

public expect object RequestCommitConverter : ProtobufConverter<RequestCommit>

public expect object RequestListSnapshotsConverter : ProtobufConverter<RequestListSnapshots>

public expect object RequestOfferSnapshotConverter : ProtobufConverter<RequestOfferSnapshot>

public expect object RequestLoadSnapshotChunkConverter : ProtobufConverter<RequestLoadSnapshotChunk>

public expect object RequestApplySnapshotChunkConverter :
    ProtobufConverter<RequestApplySnapshotChunk>

public expect object RequestPrepareProposalConverter : ProtobufConverter<RequestPrepareProposal>

public expect object RequestProcessProposalConverter : ProtobufConverter<RequestProcessProposal>

public expect object ResponseConverter : ProtobufConverter<Response>

public expect object ResponseExceptionConverter : ProtobufConverter<ResponseException>

public expect object ResponseEchoConverter : ProtobufConverter<ResponseEcho>

public expect object ResponseFlushConverter : ProtobufConverter<ResponseFlush>

public expect object ResponseInfoConverter : ProtobufConverter<ResponseInfo>

public expect object ResponseInitChainConverter : ProtobufConverter<ResponseInitChain>

public expect object ResponseQueryConverter : ProtobufConverter<ResponseQuery>

public expect object ResponseBeginBlockConverter : ProtobufConverter<ResponseBeginBlock>

public expect object ResponseCheckTxConverter : ProtobufConverter<ResponseCheckTx>

public expect object ResponseDeliverTxConverter : ProtobufConverter<ResponseDeliverTx>

public expect object ResponseEndBlockConverter : ProtobufConverter<ResponseEndBlock>

public expect object ResponseCommitConverter : ProtobufConverter<ResponseCommit>

public expect object ResponseListSnapshotsConverter : ProtobufConverter<ResponseListSnapshots>

public expect object ResponseOfferSnapshotConverter : ProtobufConverter<ResponseOfferSnapshot>

public expect object ResponseLoadSnapshotChunkConverter :
    ProtobufConverter<ResponseLoadSnapshotChunk>

public expect object ResponseApplySnapshotChunkConverter :
    ProtobufConverter<ResponseApplySnapshotChunk>

public expect object ResponsePrepareProposalConverter : ProtobufConverter<ResponsePrepareProposal>

public expect object ResponseProcessProposalConverter : ProtobufConverter<ResponseProcessProposal>

public expect object CommitInfoConverter : ProtobufConverter<CommitInfo>

public expect object ExtendedCommitInfoConverter : ProtobufConverter<ExtendedCommitInfo>

public expect object EventConverter : ProtobufConverter<Event>

public expect object EventAttributeConverter : ProtobufConverter<EventAttribute>

public expect object TxResultConverter : ProtobufConverter<TxResult>

public expect object ValidatorConverter : ProtobufConverter<Validator>

public expect object ValidatorUpdateConverter : ProtobufConverter<ValidatorUpdate>

public expect object VoteInfoConverter : ProtobufConverter<VoteInfo>

public expect object ExtendedVoteInfoConverter : ProtobufConverter<ExtendedVoteInfo>

public expect object MisbehaviorConverter : ProtobufConverter<Misbehavior>

public expect object SnapshotConverter : ProtobufConverter<Snapshot>
