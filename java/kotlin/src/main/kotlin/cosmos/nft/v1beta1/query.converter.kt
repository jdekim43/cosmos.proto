// Transform from cosmos/nft/v1beta1/query.proto
package cosmos.nft.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestMapper
import cosmos.base.query.v1beta1.PageResponseMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object QueryBalanceRequestMapper :
    ProtobufTypeMapper<QueryBalanceRequest, QueryOuterClass.QueryBalanceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBalanceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBalanceRequest> =
      QueryOuterClass.QueryBalanceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBalanceRequest): QueryBalanceRequest =
      QueryBalanceRequest(
  	classId = obj.classId,
  	owner = obj.owner,
  )

  public override fun convert(obj: QueryBalanceRequest): QueryOuterClass.QueryBalanceRequest {
    val builder = QueryOuterClass.QueryBalanceRequest.newBuilder()
    builder.setClassId(obj.classId)
    builder.setOwner(obj.owner)
    return builder.build()
  }
}

public object QueryBalanceResponseMapper :
    ProtobufTypeMapper<QueryBalanceResponse, QueryOuterClass.QueryBalanceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBalanceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBalanceResponse> =
      QueryOuterClass.QueryBalanceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryBalanceResponse): QueryBalanceResponse =
      QueryBalanceResponse(
  	amount = obj.amount.asKotlinType,
  )

  public override fun convert(obj: QueryBalanceResponse): QueryOuterClass.QueryBalanceResponse {
    val builder = QueryOuterClass.QueryBalanceResponse.newBuilder()
    builder.setAmount(obj.amount.asJavaType)
    return builder.build()
  }
}

public object QueryOwnerRequestMapper :
    ProtobufTypeMapper<QueryOwnerRequest, QueryOuterClass.QueryOwnerRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOwnerRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOwnerRequest> =
      QueryOuterClass.QueryOwnerRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryOwnerRequest): QueryOwnerRequest =
      QueryOwnerRequest(
  	classId = obj.classId,
  	id = obj.id,
  )

  public override fun convert(obj: QueryOwnerRequest): QueryOuterClass.QueryOwnerRequest {
    val builder = QueryOuterClass.QueryOwnerRequest.newBuilder()
    builder.setClassId(obj.classId)
    builder.setId(obj.id)
    return builder.build()
  }
}

public object QueryOwnerResponseMapper :
    ProtobufTypeMapper<QueryOwnerResponse, QueryOuterClass.QueryOwnerResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOwnerResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOwnerResponse> =
      QueryOuterClass.QueryOwnerResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryOwnerResponse): QueryOwnerResponse =
      QueryOwnerResponse(
  	owner = obj.owner,
  )

  public override fun convert(obj: QueryOwnerResponse): QueryOuterClass.QueryOwnerResponse {
    val builder = QueryOuterClass.QueryOwnerResponse.newBuilder()
    builder.setOwner(obj.owner)
    return builder.build()
  }
}

public object QuerySupplyRequestMapper :
    ProtobufTypeMapper<QuerySupplyRequest, QueryOuterClass.QuerySupplyRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySupplyRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySupplyRequest> =
      QueryOuterClass.QuerySupplyRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySupplyRequest): QuerySupplyRequest =
      QuerySupplyRequest(
  	classId = obj.classId,
  )

  public override fun convert(obj: QuerySupplyRequest): QueryOuterClass.QuerySupplyRequest {
    val builder = QueryOuterClass.QuerySupplyRequest.newBuilder()
    builder.setClassId(obj.classId)
    return builder.build()
  }
}

public object QuerySupplyResponseMapper :
    ProtobufTypeMapper<QuerySupplyResponse, QueryOuterClass.QuerySupplyResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySupplyResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySupplyResponse> =
      QueryOuterClass.QuerySupplyResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySupplyResponse): QuerySupplyResponse =
      QuerySupplyResponse(
  	amount = obj.amount.asKotlinType,
  )

  public override fun convert(obj: QuerySupplyResponse): QueryOuterClass.QuerySupplyResponse {
    val builder = QueryOuterClass.QuerySupplyResponse.newBuilder()
    builder.setAmount(obj.amount.asJavaType)
    return builder.build()
  }
}

public object QueryNFTsRequestMapper :
    ProtobufTypeMapper<QueryNFTsRequest, QueryOuterClass.QueryNFTsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryNFTsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryNFTsRequest> =
      QueryOuterClass.QueryNFTsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryNFTsRequest): QueryNFTsRequest =
      QueryNFTsRequest(
  	classId = obj.classId,
  	owner = obj.owner,
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryNFTsRequest): QueryOuterClass.QueryNFTsRequest {
    val builder = QueryOuterClass.QueryNFTsRequest.newBuilder()
    builder.setClassId(obj.classId)
    builder.setOwner(obj.owner)
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryNFTsResponseMapper :
    ProtobufTypeMapper<QueryNFTsResponse, QueryOuterClass.QueryNFTsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryNFTsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryNFTsResponse> =
      QueryOuterClass.QueryNFTsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryNFTsResponse): QueryNFTsResponse =
      QueryNFTsResponse(
  	nfts = obj.nftsList.map { NFTMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryNFTsResponse): QueryOuterClass.QueryNFTsResponse {
    val builder = QueryOuterClass.QueryNFTsResponse.newBuilder()
    builder.addAllNfts(obj.nfts.map { NFTMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryNFTRequestMapper :
    ProtobufTypeMapper<QueryNFTRequest, QueryOuterClass.QueryNFTRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryNFTRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryNFTRequest> =
      QueryOuterClass.QueryNFTRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryNFTRequest): QueryNFTRequest =
      QueryNFTRequest(
  	classId = obj.classId,
  	id = obj.id,
  )

  public override fun convert(obj: QueryNFTRequest): QueryOuterClass.QueryNFTRequest {
    val builder = QueryOuterClass.QueryNFTRequest.newBuilder()
    builder.setClassId(obj.classId)
    builder.setId(obj.id)
    return builder.build()
  }
}

public object QueryNFTResponseMapper :
    ProtobufTypeMapper<QueryNFTResponse, QueryOuterClass.QueryNFTResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryNFTResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryNFTResponse> =
      QueryOuterClass.QueryNFTResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryNFTResponse): QueryNFTResponse =
      QueryNFTResponse(
  	nft = NFTMapper.convert(obj.nft),
  )

  public override fun convert(obj: QueryNFTResponse): QueryOuterClass.QueryNFTResponse {
    val builder = QueryOuterClass.QueryNFTResponse.newBuilder()
    builder.setNft(NFTMapper.convert(obj.nft))
    return builder.build()
  }
}

public object QueryClassRequestMapper :
    ProtobufTypeMapper<QueryClassRequest, QueryOuterClass.QueryClassRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryClassRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryClassRequest> =
      QueryOuterClass.QueryClassRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryClassRequest): QueryClassRequest =
      QueryClassRequest(
  	classId = obj.classId,
  )

  public override fun convert(obj: QueryClassRequest): QueryOuterClass.QueryClassRequest {
    val builder = QueryOuterClass.QueryClassRequest.newBuilder()
    builder.setClassId(obj.classId)
    return builder.build()
  }
}

public object QueryClassResponseMapper :
    ProtobufTypeMapper<QueryClassResponse, QueryOuterClass.QueryClassResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryClassResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryClassResponse> =
      QueryOuterClass.QueryClassResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryClassResponse): QueryClassResponse =
      QueryClassResponse(
  	`class` = ClassMapper.convert(obj.class_),
  )

  public override fun convert(obj: QueryClassResponse): QueryOuterClass.QueryClassResponse {
    val builder = QueryOuterClass.QueryClassResponse.newBuilder()
    builder.setClass_(ClassMapper.convert(obj.`class`))
    return builder.build()
  }
}

public object QueryClassesRequestMapper :
    ProtobufTypeMapper<QueryClassesRequest, QueryOuterClass.QueryClassesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryClassesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryClassesRequest> =
      QueryOuterClass.QueryClassesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryClassesRequest): QueryClassesRequest =
      QueryClassesRequest(
  	pagination = PageRequestMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryClassesRequest): QueryOuterClass.QueryClassesRequest {
    val builder = QueryOuterClass.QueryClassesRequest.newBuilder()
    builder.setPagination(PageRequestMapper.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryClassesResponseMapper :
    ProtobufTypeMapper<QueryClassesResponse, QueryOuterClass.QueryClassesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryClassesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryClassesResponse> =
      QueryOuterClass.QueryClassesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryClassesResponse): QueryClassesResponse =
      QueryClassesResponse(
  	classes = obj.classesList.map { ClassMapper.convert(it) },
  	pagination = PageResponseMapper.convert(obj.pagination),
  )

  public override fun convert(obj: QueryClassesResponse): QueryOuterClass.QueryClassesResponse {
    val builder = QueryOuterClass.QueryClassesResponse.newBuilder()
    builder.addAllClasses(obj.classes.map { ClassMapper.convert(it) })
    builder.setPagination(PageResponseMapper.convert(obj.pagination))
    return builder.build()
  }
}
