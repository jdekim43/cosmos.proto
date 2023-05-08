// Transform from cosmos/evidence/v1beta1/query.proto
package cosmos.evidence.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestMapper
import cosmos.base.query.v1beta1.PageResponseMapper
import google.protobuf.AnyMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryEvidenceRequestMapper :
    ProtobufTypeMapper<QueryEvidenceRequest, QueryOuterClass.QueryEvidenceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryEvidenceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryEvidenceRequest> =
      QueryOuterClass.QueryEvidenceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryEvidenceRequest): QueryEvidenceRequest =
      QueryEvidenceRequest(
  	evidenceHash = obj.evidenceHash.toByteArray(),
  	hash = obj.hash,
  )

  public override fun convert(obj: QueryEvidenceRequest): QueryOuterClass.QueryEvidenceRequest {
    val builder = QueryOuterClass.QueryEvidenceRequest.newBuilder()
    builder.setEvidenceHash(ByteString.copyFrom(obj.evidenceHash))
    builder.setHash(obj.hash)
    return builder.build()
  }
}

public object QueryEvidenceResponseMapper :
    ProtobufTypeMapper<QueryEvidenceResponse, QueryOuterClass.QueryEvidenceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryEvidenceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryEvidenceResponse> =
      QueryOuterClass.QueryEvidenceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryEvidenceResponse): QueryEvidenceResponse =
      QueryEvidenceResponse(
  	evidence = AnyMapper.convert(obj.evidence),
  )

  public override fun convert(obj: QueryEvidenceResponse): QueryOuterClass.QueryEvidenceResponse {
    val builder = QueryOuterClass.QueryEvidenceResponse.newBuilder()
    builder.setEvidence(AnyMapper.convert(obj.evidence))
    return builder.build()
  }
}

public object QueryAllEvidenceRequestMapper :
    ProtobufTypeMapper<QueryAllEvidenceRequest, QueryOuterClass.QueryAllEvidenceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllEvidenceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllEvidenceRequest> =
      QueryOuterClass.QueryAllEvidenceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllEvidenceRequest): QueryAllEvidenceRequest
      = QueryAllEvidenceRequest(
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryAllEvidenceRequest):
      QueryOuterClass.QueryAllEvidenceRequest {
    val builder = QueryOuterClass.QueryAllEvidenceRequest.newBuilder()
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllEvidenceResponseMapper :
    ProtobufTypeMapper<QueryAllEvidenceResponse, QueryOuterClass.QueryAllEvidenceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllEvidenceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllEvidenceResponse> =
      QueryOuterClass.QueryAllEvidenceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllEvidenceResponse):
      QueryAllEvidenceResponse = QueryAllEvidenceResponse(
  	evidence = obj.evidenceList.map { AnyMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryAllEvidenceResponse):
      QueryOuterClass.QueryAllEvidenceResponse {
    val builder = QueryOuterClass.QueryAllEvidenceResponse.newBuilder()
    builder.addAllEvidence(obj.evidence.map { AnyMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}
