// Transform from cosmos/base/tendermint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.base.tendermint.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object GetValidatorSetByHeightRequestConverter :
    ProtobufConverter<GetValidatorSetByHeightRequest>

public expect object GetValidatorSetByHeightResponseConverter :
    ProtobufConverter<GetValidatorSetByHeightResponse>

public expect object GetLatestValidatorSetRequestConverter :
    ProtobufConverter<GetLatestValidatorSetRequest>

public expect object GetLatestValidatorSetResponseConverter :
    ProtobufConverter<GetLatestValidatorSetResponse>

public expect object ValidatorConverter : ProtobufConverter<Validator>

public expect object GetBlockByHeightRequestConverter : ProtobufConverter<GetBlockByHeightRequest>

public expect object GetBlockByHeightResponseConverter : ProtobufConverter<GetBlockByHeightResponse>

public expect object GetLatestBlockRequestConverter : ProtobufConverter<GetLatestBlockRequest>

public expect object GetLatestBlockResponseConverter : ProtobufConverter<GetLatestBlockResponse>

public expect object GetSyncingRequestConverter : ProtobufConverter<GetSyncingRequest>

public expect object GetSyncingResponseConverter : ProtobufConverter<GetSyncingResponse>

public expect object GetNodeInfoRequestConverter : ProtobufConverter<GetNodeInfoRequest>

public expect object GetNodeInfoResponseConverter : ProtobufConverter<GetNodeInfoResponse>

public expect object VersionInfoConverter : ProtobufConverter<VersionInfo>

public expect object ModuleConverter : ProtobufConverter<Module>

public expect object ABCIQueryRequestConverter : ProtobufConverter<ABCIQueryRequest>

public expect object ABCIQueryResponseConverter : ProtobufConverter<ABCIQueryResponse>

public expect object ProofOpConverter : ProtobufConverter<ProofOp>

public expect object ProofOpsConverter : ProtobufConverter<ProofOps>
