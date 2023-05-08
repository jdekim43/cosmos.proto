// Transform from cosmos/upgrade/v1beta1/query.proto
package cosmos.upgrade.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryCurrentPlanRequestMapper :
    ProtobufTypeMapper<QueryCurrentPlanRequest, QueryOuterClass.QueryCurrentPlanRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCurrentPlanRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCurrentPlanRequest> =
      QueryOuterClass.QueryCurrentPlanRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryCurrentPlanRequest): QueryCurrentPlanRequest
      = QueryCurrentPlanRequest(
  )

  public override fun convert(obj: QueryCurrentPlanRequest):
      QueryOuterClass.QueryCurrentPlanRequest {
    val builder = QueryOuterClass.QueryCurrentPlanRequest.newBuilder()
    return builder.build()
  }
}

public object QueryCurrentPlanResponseMapper :
    ProtobufTypeMapper<QueryCurrentPlanResponse, QueryOuterClass.QueryCurrentPlanResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCurrentPlanResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCurrentPlanResponse> =
      QueryOuterClass.QueryCurrentPlanResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryCurrentPlanResponse):
      QueryCurrentPlanResponse = QueryCurrentPlanResponse(
  	plan = PlanMapper.convert(obj.plan),
  )

  public override fun convert(obj: QueryCurrentPlanResponse):
      QueryOuterClass.QueryCurrentPlanResponse {
    val builder = QueryOuterClass.QueryCurrentPlanResponse.newBuilder()
    builder.setPlan(PlanMapper.convert(obj.plan))
    return builder.build()
  }
}

public object QueryAppliedPlanRequestMapper :
    ProtobufTypeMapper<QueryAppliedPlanRequest, QueryOuterClass.QueryAppliedPlanRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAppliedPlanRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAppliedPlanRequest> =
      QueryOuterClass.QueryAppliedPlanRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAppliedPlanRequest): QueryAppliedPlanRequest
      = QueryAppliedPlanRequest(
  	name = obj.name,
  )

  public override fun convert(obj: QueryAppliedPlanRequest):
      QueryOuterClass.QueryAppliedPlanRequest {
    val builder = QueryOuterClass.QueryAppliedPlanRequest.newBuilder()
    builder.setName(obj.name)
    return builder.build()
  }
}

public object QueryAppliedPlanResponseMapper :
    ProtobufTypeMapper<QueryAppliedPlanResponse, QueryOuterClass.QueryAppliedPlanResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAppliedPlanResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAppliedPlanResponse> =
      QueryOuterClass.QueryAppliedPlanResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAppliedPlanResponse):
      QueryAppliedPlanResponse = QueryAppliedPlanResponse(
  	height = obj.height,
  )

  public override fun convert(obj: QueryAppliedPlanResponse):
      QueryOuterClass.QueryAppliedPlanResponse {
    val builder = QueryOuterClass.QueryAppliedPlanResponse.newBuilder()
    builder.setHeight(obj.height)
    return builder.build()
  }
}

public object QueryUpgradedConsensusStateRequestMapper :
    ProtobufTypeMapper<QueryUpgradedConsensusStateRequest, QueryOuterClass.QueryUpgradedConsensusStateRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryUpgradedConsensusStateRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryUpgradedConsensusStateRequest> =
      QueryOuterClass.QueryUpgradedConsensusStateRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryUpgradedConsensusStateRequest):
      QueryUpgradedConsensusStateRequest = QueryUpgradedConsensusStateRequest(
  	lastHeight = obj.lastHeight,
  )

  public override fun convert(obj: QueryUpgradedConsensusStateRequest):
      QueryOuterClass.QueryUpgradedConsensusStateRequest {
    val builder = QueryOuterClass.QueryUpgradedConsensusStateRequest.newBuilder()
    builder.setLastHeight(obj.lastHeight)
    return builder.build()
  }
}

public object QueryUpgradedConsensusStateResponseMapper :
    ProtobufTypeMapper<QueryUpgradedConsensusStateResponse, QueryOuterClass.QueryUpgradedConsensusStateResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryUpgradedConsensusStateResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryUpgradedConsensusStateResponse> =
      QueryOuterClass.QueryUpgradedConsensusStateResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryUpgradedConsensusStateResponse):
      QueryUpgradedConsensusStateResponse = QueryUpgradedConsensusStateResponse(
  	upgradedConsensusState = obj.upgradedConsensusState.toByteArray(),
  )

  public override fun convert(obj: QueryUpgradedConsensusStateResponse):
      QueryOuterClass.QueryUpgradedConsensusStateResponse {
    val builder = QueryOuterClass.QueryUpgradedConsensusStateResponse.newBuilder()
    builder.setUpgradedConsensusState(ByteString.copyFrom(obj.upgradedConsensusState))
    return builder.build()
  }
}

public object QueryModuleVersionsRequestMapper :
    ProtobufTypeMapper<QueryModuleVersionsRequest, QueryOuterClass.QueryModuleVersionsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleVersionsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleVersionsRequest> =
      QueryOuterClass.QueryModuleVersionsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleVersionsRequest):
      QueryModuleVersionsRequest = QueryModuleVersionsRequest(
  	moduleName = obj.moduleName,
  )

  public override fun convert(obj: QueryModuleVersionsRequest):
      QueryOuterClass.QueryModuleVersionsRequest {
    val builder = QueryOuterClass.QueryModuleVersionsRequest.newBuilder()
    builder.setModuleName(obj.moduleName)
    return builder.build()
  }
}

public object QueryModuleVersionsResponseMapper :
    ProtobufTypeMapper<QueryModuleVersionsResponse, QueryOuterClass.QueryModuleVersionsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleVersionsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleVersionsResponse> =
      QueryOuterClass.QueryModuleVersionsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleVersionsResponse):
      QueryModuleVersionsResponse = QueryModuleVersionsResponse(
  	moduleVersions = obj.moduleVersionsList.map { ModuleVersionMapper.convert(it) },
  )

  public override fun convert(obj: QueryModuleVersionsResponse):
      QueryOuterClass.QueryModuleVersionsResponse {
    val builder = QueryOuterClass.QueryModuleVersionsResponse.newBuilder()
    builder.addAllModuleVersions(obj.moduleVersions.map { ModuleVersionMapper.convert(it) })
    return builder.build()
  }
}

public object QueryAuthorityRequestMapper :
    ProtobufTypeMapper<QueryAuthorityRequest, QueryOuterClass.QueryAuthorityRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAuthorityRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAuthorityRequest> =
      QueryOuterClass.QueryAuthorityRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAuthorityRequest): QueryAuthorityRequest =
      QueryAuthorityRequest(
  )

  public override fun convert(obj: QueryAuthorityRequest): QueryOuterClass.QueryAuthorityRequest {
    val builder = QueryOuterClass.QueryAuthorityRequest.newBuilder()
    return builder.build()
  }
}

public object QueryAuthorityResponseMapper :
    ProtobufTypeMapper<QueryAuthorityResponse, QueryOuterClass.QueryAuthorityResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAuthorityResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAuthorityResponse> =
      QueryOuterClass.QueryAuthorityResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAuthorityResponse): QueryAuthorityResponse =
      QueryAuthorityResponse(
  	address = obj.address,
  )

  public override fun convert(obj: QueryAuthorityResponse): QueryOuterClass.QueryAuthorityResponse {
    val builder = QueryOuterClass.QueryAuthorityResponse.newBuilder()
    builder.setAddress(obj.address)
    return builder.build()
  }
}
