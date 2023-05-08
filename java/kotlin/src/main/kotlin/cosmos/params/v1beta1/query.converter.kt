// Transform from cosmos/params/v1beta1/query.proto
package cosmos.params.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryParamsRequestMapper :
    ProtobufTypeMapper<QueryParamsRequest, QueryOuterClass.QueryParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsRequest> =
      QueryOuterClass.QueryParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsRequest): QueryParamsRequest =
      QueryParamsRequest(
  	subspace = obj.subspace,
  	key = obj.key,
  )

  public override fun convert(obj: QueryParamsRequest): QueryOuterClass.QueryParamsRequest {
    val builder = QueryOuterClass.QueryParamsRequest.newBuilder()
    builder.setSubspace(obj.subspace)
    builder.setKey(obj.key)
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
  	`param` = ParamChangeMapper.convert(obj.`param`),
  )

  public override fun convert(obj: QueryParamsResponse): QueryOuterClass.QueryParamsResponse {
    val builder = QueryOuterClass.QueryParamsResponse.newBuilder()
    builder.setParam(ParamChangeMapper.convert(obj.`param`))
    return builder.build()
  }
}

public object QuerySubspacesRequestMapper :
    ProtobufTypeMapper<QuerySubspacesRequest, QueryOuterClass.QuerySubspacesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubspacesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubspacesRequest> =
      QueryOuterClass.QuerySubspacesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubspacesRequest): QuerySubspacesRequest =
      QuerySubspacesRequest(
  )

  public override fun convert(obj: QuerySubspacesRequest): QueryOuterClass.QuerySubspacesRequest {
    val builder = QueryOuterClass.QuerySubspacesRequest.newBuilder()
    return builder.build()
  }
}

public object QuerySubspacesResponseMapper :
    ProtobufTypeMapper<QuerySubspacesResponse, QueryOuterClass.QuerySubspacesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubspacesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubspacesResponse> =
      QueryOuterClass.QuerySubspacesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubspacesResponse): QuerySubspacesResponse =
      QuerySubspacesResponse(
  	subspaces = obj.subspacesList.map { SubspaceMapper.convert(it) },
  )

  public override fun convert(obj: QuerySubspacesResponse): QueryOuterClass.QuerySubspacesResponse {
    val builder = QueryOuterClass.QuerySubspacesResponse.newBuilder()
    builder.addAllSubspaces(obj.subspaces.map { SubspaceMapper.convert(it) })
    return builder.build()
  }
}

public object SubspaceMapper : ProtobufTypeMapper<Subspace, QueryOuterClass.Subspace> {
  public override val descriptor: Descriptors.Descriptor = QueryOuterClass.Subspace.getDescriptor()

  public override val parser: Parser<QueryOuterClass.Subspace> = QueryOuterClass.Subspace.parser()

  public override fun convert(obj: QueryOuterClass.Subspace): Subspace = Subspace(
  	subspace = obj.subspace,
  	keys = obj.keysList.map { it },
  )

  public override fun convert(obj: Subspace): QueryOuterClass.Subspace {
    val builder = QueryOuterClass.Subspace.newBuilder()
    builder.setSubspace(obj.subspace)
    builder.addAllKeys(obj.keys.map { it })
    return builder.build()
  }
}
