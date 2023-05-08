// Transform from cosmos/slashing/v1beta1/query.proto
package cosmos.slashing.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestMapper
import cosmos.base.query.v1beta1.PageResponseMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryParamsRequestMapper :
    ProtobufTypeMapper<QueryParamsRequest, QueryOuterClass.QueryParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsRequest> =
      QueryOuterClass.QueryParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsRequest): QueryParamsRequest =
      QueryParamsRequest(
  )

  public override fun convert(obj: QueryParamsRequest): QueryOuterClass.QueryParamsRequest {
    val builder = QueryOuterClass.QueryParamsRequest.newBuilder()
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
  	params = ParamsMapper.convert(obj.params),
  )

  public override fun convert(obj: QueryParamsResponse): QueryOuterClass.QueryParamsResponse {
    val builder = QueryOuterClass.QueryParamsResponse.newBuilder()
    builder.setParams(ParamsMapper.convert(obj.params))
    return builder.build()
  }
}

public object QuerySigningInfoRequestMapper :
    ProtobufTypeMapper<QuerySigningInfoRequest, QueryOuterClass.QuerySigningInfoRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySigningInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySigningInfoRequest> =
      QueryOuterClass.QuerySigningInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySigningInfoRequest): QuerySigningInfoRequest
      = QuerySigningInfoRequest(
  	consAddress = obj.consAddress,
  )

  public override fun convert(obj: QuerySigningInfoRequest):
      QueryOuterClass.QuerySigningInfoRequest {
    val builder = QueryOuterClass.QuerySigningInfoRequest.newBuilder()
    builder.setConsAddress(obj.consAddress)
    return builder.build()
  }
}

public object QuerySigningInfoResponseMapper :
    ProtobufTypeMapper<QuerySigningInfoResponse, QueryOuterClass.QuerySigningInfoResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySigningInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySigningInfoResponse> =
      QueryOuterClass.QuerySigningInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySigningInfoResponse):
      QuerySigningInfoResponse = QuerySigningInfoResponse(
  	valSigningInfo = ValidatorSigningInfoMapper.convert(obj.valSigningInfo),
  )

  public override fun convert(obj: QuerySigningInfoResponse):
      QueryOuterClass.QuerySigningInfoResponse {
    val builder = QueryOuterClass.QuerySigningInfoResponse.newBuilder()
    builder.setValSigningInfo(ValidatorSigningInfoMapper.convert(obj.valSigningInfo))
    return builder.build()
  }
}

public object QuerySigningInfosRequestMapper :
    ProtobufTypeMapper<QuerySigningInfosRequest, QueryOuterClass.QuerySigningInfosRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySigningInfosRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySigningInfosRequest> =
      QueryOuterClass.QuerySigningInfosRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySigningInfosRequest):
      QuerySigningInfosRequest = QuerySigningInfosRequest(
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QuerySigningInfosRequest):
      QueryOuterClass.QuerySigningInfosRequest {
    val builder = QueryOuterClass.QuerySigningInfosRequest.newBuilder()
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QuerySigningInfosResponseMapper :
    ProtobufTypeMapper<QuerySigningInfosResponse, QueryOuterClass.QuerySigningInfosResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySigningInfosResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySigningInfosResponse> =
      QueryOuterClass.QuerySigningInfosResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySigningInfosResponse):
      QuerySigningInfosResponse = QuerySigningInfosResponse(
  	info = obj.infoList.map { ValidatorSigningInfoMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QuerySigningInfosResponse):
      QueryOuterClass.QuerySigningInfosResponse {
    val builder = QueryOuterClass.QuerySigningInfosResponse.newBuilder()
    builder.addAllInfo(obj.info.map { ValidatorSigningInfoMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}
