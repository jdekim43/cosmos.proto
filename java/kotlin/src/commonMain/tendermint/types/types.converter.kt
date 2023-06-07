// Transform from tendermint/types/types.proto
@file:GeneratorVersion(version = "0.2.1")

package tendermint.types

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object PartSetHeaderConverter : ProtobufConverter<PartSetHeader>

public expect object PartConverter : ProtobufConverter<Part>

public expect object BlockIDConverter : ProtobufConverter<BlockID>

public expect object HeaderConverter : ProtobufConverter<Header>

public expect object DataConverter : ProtobufConverter<Data>

public expect object VoteConverter : ProtobufConverter<Vote>

public expect object CommitConverter : ProtobufConverter<Commit>

public expect object CommitSigConverter : ProtobufConverter<CommitSig>

public expect object ProposalConverter : ProtobufConverter<Proposal>

public expect object SignedHeaderConverter : ProtobufConverter<SignedHeader>

public expect object LightBlockConverter : ProtobufConverter<LightBlock>

public expect object BlockMetaConverter : ProtobufConverter<BlockMeta>

public expect object TxProofConverter : ProtobufConverter<TxProof>
