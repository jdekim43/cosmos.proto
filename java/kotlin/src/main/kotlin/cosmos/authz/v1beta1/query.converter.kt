// Transform from cosmos/authz/v1beta1/query.proto
package cosmos.authz.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestMapper
import cosmos.base.query.v1beta1.PageResponseMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryGrantsRequestMapper :
    ProtobufTypeMapper<QueryGrantsRequest, QueryOuterClass.QueryGrantsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGrantsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGrantsRequest> =
      QueryOuterClass.QueryGrantsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGrantsRequest): QueryGrantsRequest =
      QueryGrantsRequest(
  	granter = obj.granter,
  	grantee = obj.grantee,
  	msgTypeUrl = obj.msgTypeUrl,
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryGrantsRequest): QueryOuterClass.QueryGrantsRequest {
    val builder = QueryOuterClass.QueryGrantsRequest.newBuilder()
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    builder.setMsgTypeUrl(obj.msgTypeUrl)
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGrantsResponseMapper :
    ProtobufTypeMapper<QueryGrantsResponse, QueryOuterClass.QueryGrantsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGrantsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGrantsResponse> =
      QueryOuterClass.QueryGrantsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGrantsResponse): QueryGrantsResponse =
      QueryGrantsResponse(
  	grants = obj.grantsList.map { GrantMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryGrantsResponse): QueryOuterClass.QueryGrantsResponse {
    val builder = QueryOuterClass.QueryGrantsResponse.newBuilder()
    builder.addAllGrants(obj.grants.map { GrantMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGranterGrantsRequestMapper :
    ProtobufTypeMapper<QueryGranterGrantsRequest, QueryOuterClass.QueryGranterGrantsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGranterGrantsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGranterGrantsRequest> =
      QueryOuterClass.QueryGranterGrantsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGranterGrantsRequest):
      QueryGranterGrantsRequest = QueryGranterGrantsRequest(
  	granter = obj.granter,
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryGranterGrantsRequest):
      QueryOuterClass.QueryGranterGrantsRequest {
    val builder = QueryOuterClass.QueryGranterGrantsRequest.newBuilder()
    builder.setGranter(obj.granter)
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGranterGrantsResponseMapper :
    ProtobufTypeMapper<QueryGranterGrantsResponse, QueryOuterClass.QueryGranterGrantsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGranterGrantsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGranterGrantsResponse> =
      QueryOuterClass.QueryGranterGrantsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGranterGrantsResponse):
      QueryGranterGrantsResponse = QueryGranterGrantsResponse(
  	grants = obj.grantsList.map { GrantAuthorizationMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryGranterGrantsResponse):
      QueryOuterClass.QueryGranterGrantsResponse {
    val builder = QueryOuterClass.QueryGranterGrantsResponse.newBuilder()
    builder.addAllGrants(obj.grants.map { GrantAuthorizationMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGranteeGrantsRequestMapper :
    ProtobufTypeMapper<QueryGranteeGrantsRequest, QueryOuterClass.QueryGranteeGrantsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGranteeGrantsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGranteeGrantsRequest> =
      QueryOuterClass.QueryGranteeGrantsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGranteeGrantsRequest):
      QueryGranteeGrantsRequest = QueryGranteeGrantsRequest(
  	grantee = obj.grantee,
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryGranteeGrantsRequest):
      QueryOuterClass.QueryGranteeGrantsRequest {
    val builder = QueryOuterClass.QueryGranteeGrantsRequest.newBuilder()
    builder.setGrantee(obj.grantee)
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGranteeGrantsResponseMapper :
    ProtobufTypeMapper<QueryGranteeGrantsResponse, QueryOuterClass.QueryGranteeGrantsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGranteeGrantsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGranteeGrantsResponse> =
      QueryOuterClass.QueryGranteeGrantsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGranteeGrantsResponse):
      QueryGranteeGrantsResponse = QueryGranteeGrantsResponse(
  	grants = obj.grantsList.map { GrantAuthorizationMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryGranteeGrantsResponse):
      QueryOuterClass.QueryGranteeGrantsResponse {
    val builder = QueryOuterClass.QueryGranteeGrantsResponse.newBuilder()
    builder.addAllGrants(obj.grants.map { GrantAuthorizationMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}
