// Transform from cosmos/base/tendermint/v1beta1/query.proto
package cosmos.base.tendermint.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestMapper
import cosmos.base.query.v1beta1.PageResponseMapper
import google.protobuf.AnyMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType
import tendermint.p2p.DefaultNodeInfoMapper
import tendermint.types.BlockIDMapper

public object GetValidatorSetByHeightRequestMapper :
    ProtobufTypeMapper<GetValidatorSetByHeightRequest, Query.GetValidatorSetByHeightRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetValidatorSetByHeightRequest.getDescriptor()

  public override val parser: Parser<Query.GetValidatorSetByHeightRequest> =
      Query.GetValidatorSetByHeightRequest.parser()

  public override fun convert(obj: Query.GetValidatorSetByHeightRequest):
      GetValidatorSetByHeightRequest = GetValidatorSetByHeightRequest(
  	height = obj.height,
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: GetValidatorSetByHeightRequest):
      Query.GetValidatorSetByHeightRequest {
    val builder = Query.GetValidatorSetByHeightRequest.newBuilder()
    builder.setHeight(obj.height)
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object GetValidatorSetByHeightResponseMapper :
    ProtobufTypeMapper<GetValidatorSetByHeightResponse, Query.GetValidatorSetByHeightResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetValidatorSetByHeightResponse.getDescriptor()

  public override val parser: Parser<Query.GetValidatorSetByHeightResponse> =
      Query.GetValidatorSetByHeightResponse.parser()

  public override fun convert(obj: Query.GetValidatorSetByHeightResponse):
      GetValidatorSetByHeightResponse = GetValidatorSetByHeightResponse(
  	blockHeight = obj.blockHeight,
  	validators = obj.validatorsList.map { ValidatorMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: GetValidatorSetByHeightResponse):
      Query.GetValidatorSetByHeightResponse {
    val builder = Query.GetValidatorSetByHeightResponse.newBuilder()
    builder.setBlockHeight(obj.blockHeight)
    builder.addAllValidators(obj.validators.map { ValidatorMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object GetLatestValidatorSetRequestMapper :
    ProtobufTypeMapper<GetLatestValidatorSetRequest, Query.GetLatestValidatorSetRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetLatestValidatorSetRequest.getDescriptor()

  public override val parser: Parser<Query.GetLatestValidatorSetRequest> =
      Query.GetLatestValidatorSetRequest.parser()

  public override fun convert(obj: Query.GetLatestValidatorSetRequest): GetLatestValidatorSetRequest
      = GetLatestValidatorSetRequest(
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: GetLatestValidatorSetRequest):
      Query.GetLatestValidatorSetRequest {
    val builder = Query.GetLatestValidatorSetRequest.newBuilder()
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object GetLatestValidatorSetResponseMapper :
    ProtobufTypeMapper<GetLatestValidatorSetResponse, Query.GetLatestValidatorSetResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetLatestValidatorSetResponse.getDescriptor()

  public override val parser: Parser<Query.GetLatestValidatorSetResponse> =
      Query.GetLatestValidatorSetResponse.parser()

  public override fun convert(obj: Query.GetLatestValidatorSetResponse):
      GetLatestValidatorSetResponse = GetLatestValidatorSetResponse(
  	blockHeight = obj.blockHeight,
  	validators = obj.validatorsList.map { ValidatorMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: GetLatestValidatorSetResponse):
      Query.GetLatestValidatorSetResponse {
    val builder = Query.GetLatestValidatorSetResponse.newBuilder()
    builder.setBlockHeight(obj.blockHeight)
    builder.addAllValidators(obj.validators.map { ValidatorMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object ValidatorMapper : ProtobufTypeMapper<Validator, Query.Validator> {
  public override val descriptor: Descriptors.Descriptor = Query.Validator.getDescriptor()

  public override val parser: Parser<Query.Validator> = Query.Validator.parser()

  public override fun convert(obj: Query.Validator): Validator = Validator(
  	address = obj.address,
  	pubKey = AnyMapper.convert(obj.pubKey),
  	votingPower = obj.votingPower,
  	proposerPriority = obj.proposerPriority,
  )

  public override fun convert(obj: Validator): Query.Validator {
    val builder = Query.Validator.newBuilder()
    builder.setAddress(obj.address)
    builder.setPubKey(AnyMapper.convert(obj.pubKey))
    builder.setVotingPower(obj.votingPower)
    builder.setProposerPriority(obj.proposerPriority)
    return builder.build()
  }
}

public object GetBlockByHeightRequestMapper :
    ProtobufTypeMapper<GetBlockByHeightRequest, Query.GetBlockByHeightRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetBlockByHeightRequest.getDescriptor()

  public override val parser: Parser<Query.GetBlockByHeightRequest> =
      Query.GetBlockByHeightRequest.parser()

  public override fun convert(obj: Query.GetBlockByHeightRequest): GetBlockByHeightRequest =
      GetBlockByHeightRequest(
  	height = obj.height,
  )

  public override fun convert(obj: GetBlockByHeightRequest): Query.GetBlockByHeightRequest {
    val builder = Query.GetBlockByHeightRequest.newBuilder()
    builder.setHeight(obj.height)
    return builder.build()
  }
}

public object GetBlockByHeightResponseMapper :
    ProtobufTypeMapper<GetBlockByHeightResponse, Query.GetBlockByHeightResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetBlockByHeightResponse.getDescriptor()

  public override val parser: Parser<Query.GetBlockByHeightResponse> =
      Query.GetBlockByHeightResponse.parser()

  public override fun convert(obj: Query.GetBlockByHeightResponse): GetBlockByHeightResponse =
      GetBlockByHeightResponse(
  	blockId = BlockIDMapper.convert(obj.blockId),
  	block = tendermint.types.BlockMapper.convert(obj.block),
  	sdkBlock = BlockMapper.convert(obj.sdkBlock),
  )

  public override fun convert(obj: GetBlockByHeightResponse): Query.GetBlockByHeightResponse {
    val builder = Query.GetBlockByHeightResponse.newBuilder()
    builder.setBlockId(BlockIDMapper.convert(obj.blockId))
    builder.setBlock(tendermint.types.BlockMapper.convert(obj.block))
    builder.setSdkBlock(BlockMapper.convert(obj.sdkBlock))
    return builder.build()
  }
}

public object GetLatestBlockRequestMapper :
    ProtobufTypeMapper<GetLatestBlockRequest, Query.GetLatestBlockRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetLatestBlockRequest.getDescriptor()

  public override val parser: Parser<Query.GetLatestBlockRequest> =
      Query.GetLatestBlockRequest.parser()

  public override fun convert(obj: Query.GetLatestBlockRequest): GetLatestBlockRequest =
      GetLatestBlockRequest(
  )

  public override fun convert(obj: GetLatestBlockRequest): Query.GetLatestBlockRequest {
    val builder = Query.GetLatestBlockRequest.newBuilder()
    return builder.build()
  }
}

public object GetLatestBlockResponseMapper :
    ProtobufTypeMapper<GetLatestBlockResponse, Query.GetLatestBlockResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Query.GetLatestBlockResponse.getDescriptor()

  public override val parser: Parser<Query.GetLatestBlockResponse> =
      Query.GetLatestBlockResponse.parser()

  public override fun convert(obj: Query.GetLatestBlockResponse): GetLatestBlockResponse =
      GetLatestBlockResponse(
  	blockId = BlockIDMapper.convert(obj.blockId),
  	block = tendermint.types.BlockMapper.convert(obj.block),
  	sdkBlock = BlockMapper.convert(obj.sdkBlock),
  )

  public override fun convert(obj: GetLatestBlockResponse): Query.GetLatestBlockResponse {
    val builder = Query.GetLatestBlockResponse.newBuilder()
    builder.setBlockId(BlockIDMapper.convert(obj.blockId))
    builder.setBlock(tendermint.types.BlockMapper.convert(obj.block))
    builder.setSdkBlock(BlockMapper.convert(obj.sdkBlock))
    return builder.build()
  }
}

public object GetSyncingRequestMapper :
    ProtobufTypeMapper<GetSyncingRequest, Query.GetSyncingRequest> {
  public override val descriptor: Descriptors.Descriptor = Query.GetSyncingRequest.getDescriptor()

  public override val parser: Parser<Query.GetSyncingRequest> = Query.GetSyncingRequest.parser()

  public override fun convert(obj: Query.GetSyncingRequest): GetSyncingRequest = GetSyncingRequest(
  )

  public override fun convert(obj: GetSyncingRequest): Query.GetSyncingRequest {
    val builder = Query.GetSyncingRequest.newBuilder()
    return builder.build()
  }
}

public object GetSyncingResponseMapper :
    ProtobufTypeMapper<GetSyncingResponse, Query.GetSyncingResponse> {
  public override val descriptor: Descriptors.Descriptor = Query.GetSyncingResponse.getDescriptor()

  public override val parser: Parser<Query.GetSyncingResponse> = Query.GetSyncingResponse.parser()

  public override fun convert(obj: Query.GetSyncingResponse): GetSyncingResponse =
      GetSyncingResponse(
  	syncing = obj.syncing,
  )

  public override fun convert(obj: GetSyncingResponse): Query.GetSyncingResponse {
    val builder = Query.GetSyncingResponse.newBuilder()
    builder.setSyncing(obj.syncing)
    return builder.build()
  }
}

public object GetNodeInfoRequestMapper :
    ProtobufTypeMapper<GetNodeInfoRequest, Query.GetNodeInfoRequest> {
  public override val descriptor: Descriptors.Descriptor = Query.GetNodeInfoRequest.getDescriptor()

  public override val parser: Parser<Query.GetNodeInfoRequest> = Query.GetNodeInfoRequest.parser()

  public override fun convert(obj: Query.GetNodeInfoRequest): GetNodeInfoRequest =
      GetNodeInfoRequest(
  )

  public override fun convert(obj: GetNodeInfoRequest): Query.GetNodeInfoRequest {
    val builder = Query.GetNodeInfoRequest.newBuilder()
    return builder.build()
  }
}

public object GetNodeInfoResponseMapper :
    ProtobufTypeMapper<GetNodeInfoResponse, Query.GetNodeInfoResponse> {
  public override val descriptor: Descriptors.Descriptor = Query.GetNodeInfoResponse.getDescriptor()

  public override val parser: Parser<Query.GetNodeInfoResponse> = Query.GetNodeInfoResponse.parser()

  public override fun convert(obj: Query.GetNodeInfoResponse): GetNodeInfoResponse =
      GetNodeInfoResponse(
  	defaultNodeInfo = DefaultNodeInfoMapper.convert(obj.defaultNodeInfo),
  	applicationVersion = VersionInfoMapper.convert(obj.applicationVersion),
  )

  public override fun convert(obj: GetNodeInfoResponse): Query.GetNodeInfoResponse {
    val builder = Query.GetNodeInfoResponse.newBuilder()
    builder.setDefaultNodeInfo(DefaultNodeInfoMapper.convert(obj.defaultNodeInfo))
    builder.setApplicationVersion(VersionInfoMapper.convert(obj.applicationVersion))
    return builder.build()
  }
}

public object VersionInfoMapper : ProtobufTypeMapper<VersionInfo, Query.VersionInfo> {
  public override val descriptor: Descriptors.Descriptor = Query.VersionInfo.getDescriptor()

  public override val parser: Parser<Query.VersionInfo> = Query.VersionInfo.parser()

  public override fun convert(obj: Query.VersionInfo): VersionInfo = VersionInfo(
  	name = obj.name,
  	appName = obj.appName,
  	version = obj.version,
  	gitCommit = obj.gitCommit,
  	buildTags = obj.buildTags,
  	goVersion = obj.goVersion,
  	buildDeps = obj.buildDepsList.map { ModuleMapper.convert(it) },
  	cosmosSdkVersion = obj.cosmosSdkVersion,
  )

  public override fun convert(obj: VersionInfo): Query.VersionInfo {
    val builder = Query.VersionInfo.newBuilder()
    builder.setName(obj.name)
    builder.setAppName(obj.appName)
    builder.setVersion(obj.version)
    builder.setGitCommit(obj.gitCommit)
    builder.setBuildTags(obj.buildTags)
    builder.setGoVersion(obj.goVersion)
    builder.addAllBuildDeps(obj.buildDeps.map { ModuleMapper.convert(it) })
    builder.setCosmosSdkVersion(obj.cosmosSdkVersion)
    return builder.build()
  }
}

public object ModuleMapper : ProtobufTypeMapper<Module, Query.Module> {
  public override val descriptor: Descriptors.Descriptor = Query.Module.getDescriptor()

  public override val parser: Parser<Query.Module> = Query.Module.parser()

  public override fun convert(obj: Query.Module): Module = Module(
  	path = obj.path,
  	version = obj.version,
  	sum = obj.sum,
  )

  public override fun convert(obj: Module): Query.Module {
    val builder = Query.Module.newBuilder()
    builder.setPath(obj.path)
    builder.setVersion(obj.version)
    builder.setSum(obj.sum)
    return builder.build()
  }
}

public object ABCIQueryRequestMapper : ProtobufTypeMapper<ABCIQueryRequest, Query.ABCIQueryRequest>
    {
  public override val descriptor: Descriptors.Descriptor = Query.ABCIQueryRequest.getDescriptor()

  public override val parser: Parser<Query.ABCIQueryRequest> = Query.ABCIQueryRequest.parser()

  public override fun convert(obj: Query.ABCIQueryRequest): ABCIQueryRequest = ABCIQueryRequest(
  	`data` = obj.`data`.toByteArray(),
  	path = obj.path,
  	height = obj.height,
  	prove = obj.prove,
  )

  public override fun convert(obj: ABCIQueryRequest): Query.ABCIQueryRequest {
    val builder = Query.ABCIQueryRequest.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    builder.setPath(obj.path)
    builder.setHeight(obj.height)
    builder.setProve(obj.prove)
    return builder.build()
  }
}

public object ABCIQueryResponseMapper :
    ProtobufTypeMapper<ABCIQueryResponse, Query.ABCIQueryResponse> {
  public override val descriptor: Descriptors.Descriptor = Query.ABCIQueryResponse.getDescriptor()

  public override val parser: Parser<Query.ABCIQueryResponse> = Query.ABCIQueryResponse.parser()

  public override fun convert(obj: Query.ABCIQueryResponse): ABCIQueryResponse = ABCIQueryResponse(
  	code = obj.code.asKotlinType,
  	log = obj.log,
  	info = obj.info,
  	index = obj.index,
  	key = obj.key.toByteArray(),
  	`value` = obj.`value`.toByteArray(),
  	proofOps = ProofOpsMapper.convert(obj.proofOps),
  	height = obj.height,
  	codespace = obj.codespace,
  )

  public override fun convert(obj: ABCIQueryResponse): Query.ABCIQueryResponse {
    val builder = Query.ABCIQueryResponse.newBuilder()
    builder.setCode(obj.code.asJavaType)
    builder.setLog(obj.log)
    builder.setInfo(obj.info)
    builder.setIndex(obj.index)
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    builder.setProofOps(ProofOpsMapper.convert(obj.proofOps))
    builder.setHeight(obj.height)
    builder.setCodespace(obj.codespace)
    return builder.build()
  }
}

public object ProofOpMapper : ProtobufTypeMapper<ProofOp, Query.ProofOp> {
  public override val descriptor: Descriptors.Descriptor = Query.ProofOp.getDescriptor()

  public override val parser: Parser<Query.ProofOp> = Query.ProofOp.parser()

  public override fun convert(obj: Query.ProofOp): ProofOp = ProofOp(
  	type = obj.type,
  	key = obj.key.toByteArray(),
  	`data` = obj.`data`.toByteArray(),
  )

  public override fun convert(obj: ProofOp): Query.ProofOp {
    val builder = Query.ProofOp.newBuilder()
    builder.setType(obj.type)
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object ProofOpsMapper : ProtobufTypeMapper<ProofOps, Query.ProofOps> {
  public override val descriptor: Descriptors.Descriptor = Query.ProofOps.getDescriptor()

  public override val parser: Parser<Query.ProofOps> = Query.ProofOps.parser()

  public override fun convert(obj: Query.ProofOps): ProofOps = ProofOps(
  	ops = obj.opsList.map { ProofOpMapper.convert(it) },
  )

  public override fun convert(obj: ProofOps): Query.ProofOps {
    val builder = Query.ProofOps.newBuilder()
    builder.addAllOps(obj.ops.map { ProofOpMapper.convert(it) })
    return builder.build()
  }
}
