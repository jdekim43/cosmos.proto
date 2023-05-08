// Transform from cosmos/feegrant/v1beta1/query.proto
package cosmos.feegrant.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestMapper
import cosmos.base.query.v1beta1.PageResponseMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryAllowanceRequestMapper :
    ProtobufTypeMapper<QueryAllowanceRequest, QueryOuterClass.QueryAllowanceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllowanceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllowanceRequest> =
      QueryOuterClass.QueryAllowanceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllowanceRequest): QueryAllowanceRequest =
      QueryAllowanceRequest(
  	granter = obj.granter,
  	grantee = obj.grantee,
  )

  public override fun convert(obj: QueryAllowanceRequest): QueryOuterClass.QueryAllowanceRequest {
    val builder = QueryOuterClass.QueryAllowanceRequest.newBuilder()
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    return builder.build()
  }
}

public object QueryAllowanceResponseMapper :
    ProtobufTypeMapper<QueryAllowanceResponse, QueryOuterClass.QueryAllowanceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllowanceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllowanceResponse> =
      QueryOuterClass.QueryAllowanceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllowanceResponse): QueryAllowanceResponse =
      QueryAllowanceResponse(
  	allowance = GrantMapper.convert(obj.allowance),
  )

  public override fun convert(obj: QueryAllowanceResponse): QueryOuterClass.QueryAllowanceResponse {
    val builder = QueryOuterClass.QueryAllowanceResponse.newBuilder()
    builder.setAllowance(GrantMapper.convert(obj.allowance))
    return builder.build()
  }
}

public object QueryAllowancesRequestMapper :
    ProtobufTypeMapper<QueryAllowancesRequest, QueryOuterClass.QueryAllowancesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllowancesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllowancesRequest> =
      QueryOuterClass.QueryAllowancesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllowancesRequest): QueryAllowancesRequest =
      QueryAllowancesRequest(
  	grantee = obj.grantee,
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryAllowancesRequest): QueryOuterClass.QueryAllowancesRequest {
    val builder = QueryOuterClass.QueryAllowancesRequest.newBuilder()
    builder.setGrantee(obj.grantee)
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllowancesResponseMapper :
    ProtobufTypeMapper<QueryAllowancesResponse, QueryOuterClass.QueryAllowancesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllowancesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllowancesResponse> =
      QueryOuterClass.QueryAllowancesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllowancesResponse): QueryAllowancesResponse
      = QueryAllowancesResponse(
  	allowances = obj.allowancesList.map { GrantMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryAllowancesResponse):
      QueryOuterClass.QueryAllowancesResponse {
    val builder = QueryOuterClass.QueryAllowancesResponse.newBuilder()
    builder.addAllAllowances(obj.allowances.map { GrantMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllowancesByGranterRequestMapper :
    ProtobufTypeMapper<QueryAllowancesByGranterRequest, QueryOuterClass.QueryAllowancesByGranterRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllowancesByGranterRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllowancesByGranterRequest> =
      QueryOuterClass.QueryAllowancesByGranterRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllowancesByGranterRequest):
      QueryAllowancesByGranterRequest = QueryAllowancesByGranterRequest(
  	granter = obj.granter,
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryAllowancesByGranterRequest):
      QueryOuterClass.QueryAllowancesByGranterRequest {
    val builder = QueryOuterClass.QueryAllowancesByGranterRequest.newBuilder()
    builder.setGranter(obj.granter)
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllowancesByGranterResponseMapper :
    ProtobufTypeMapper<QueryAllowancesByGranterResponse, QueryOuterClass.QueryAllowancesByGranterResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllowancesByGranterResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllowancesByGranterResponse> =
      QueryOuterClass.QueryAllowancesByGranterResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllowancesByGranterResponse):
      QueryAllowancesByGranterResponse = QueryAllowancesByGranterResponse(
  	allowances = obj.allowancesList.map { GrantMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryAllowancesByGranterResponse):
      QueryOuterClass.QueryAllowancesByGranterResponse {
    val builder = QueryOuterClass.QueryAllowancesByGranterResponse.newBuilder()
    builder.addAllAllowances(obj.allowances.map { GrantMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}
