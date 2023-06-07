// Transform from cosmos/orm/query/v1alpha1/query.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.orm.query.v1alpha1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import google.protobuf.AnyJvmConverter
import google.protobuf.DurationJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GetRequestJvmConverter : ProtobufTypeMapper<GetRequest, QueryOuterClass.GetRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.GetRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.GetRequest> =
      QueryOuterClass.GetRequest.parser()

  public override fun convert(obj: QueryOuterClass.GetRequest): GetRequest = GetRequest(
  	messageName = obj.messageName,
  	index = obj.index,
  	values = obj.valuesList.map { IndexValueJvmConverter.convert(it) },
  )

  public override fun convert(obj: GetRequest): QueryOuterClass.GetRequest {
    val builder = QueryOuterClass.GetRequest.newBuilder()
    builder.setMessageName(obj.messageName)
    builder.setIndex(obj.index)
    builder.addAllValues(obj.values.map { IndexValueJvmConverter.convert(it) })
    return builder.build()
  }
}

public object GetResponseJvmConverter : ProtobufTypeMapper<GetResponse, QueryOuterClass.GetResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.GetResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.GetResponse> =
      QueryOuterClass.GetResponse.parser()

  public override fun convert(obj: QueryOuterClass.GetResponse): GetResponse = GetResponse(
  	result = AnyJvmConverter.convert(obj.result),
  )

  public override fun convert(obj: GetResponse): QueryOuterClass.GetResponse {
    val builder = QueryOuterClass.GetResponse.newBuilder()
    builder.setResult(AnyJvmConverter.convert(obj.result))
    return builder.build()
  }
}

public object ListRequestJvmConverter : ProtobufTypeMapper<ListRequest, QueryOuterClass.ListRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.ListRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.ListRequest> =
      QueryOuterClass.ListRequest.parser()

  public override fun convert(obj: QueryOuterClass.ListRequest): ListRequest = ListRequest(
  	messageName = obj.messageName,
  	index = obj.index,
  	pagination = PageRequestJvmConverter.convert(obj.pagination),
  	query = mapOf(
  3 to { ListRequest.QueryOneOf.Prefix(PrefixJvmConverter.convert(obj.prefix)) },
  4 to { ListRequest.QueryOneOf.Range(RangeJvmConverter.convert(obj.range)) },
  ).getValue(obj.queryCase.number)(),
  )

  public override fun convert(obj: ListRequest): QueryOuterClass.ListRequest {
    val builder = QueryOuterClass.ListRequest.newBuilder()
    builder.setMessageName(obj.messageName)
    builder.setIndex(obj.index)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    when (obj.query) {
      is ListRequest.QueryOneOf.Prefix ->
          builder.setPrefix(PrefixJvmConverter.convert(obj.query.value))
      is ListRequest.QueryOneOf.Range ->
          builder.setRange(RangeJvmConverter.convert(obj.query.value))
    }
    return builder.build()
  }

  public object PrefixJvmConverter :
      ProtobufTypeMapper<ListRequest.Prefix, QueryOuterClass.ListRequest.Prefix> {
    public override val descriptor: Descriptors.Descriptor =
        QueryOuterClass.ListRequest.Prefix.getDescriptor()

    public override val parser: Parser<QueryOuterClass.ListRequest.Prefix> =
        QueryOuterClass.ListRequest.Prefix.parser()

    public override fun convert(obj: QueryOuterClass.ListRequest.Prefix): ListRequest.Prefix =
        ListRequest.Prefix(
    	values = obj.valuesList.map { IndexValueJvmConverter.convert(it) },
    )

    public override fun convert(obj: ListRequest.Prefix): QueryOuterClass.ListRequest.Prefix {
      val builder = QueryOuterClass.ListRequest.Prefix.newBuilder()
      builder.addAllValues(obj.values.map { IndexValueJvmConverter.convert(it) })
      return builder.build()
    }
  }

  public object RangeJvmConverter :
      ProtobufTypeMapper<ListRequest.Range, QueryOuterClass.ListRequest.Range> {
    public override val descriptor: Descriptors.Descriptor =
        QueryOuterClass.ListRequest.Range.getDescriptor()

    public override val parser: Parser<QueryOuterClass.ListRequest.Range> =
        QueryOuterClass.ListRequest.Range.parser()

    public override fun convert(obj: QueryOuterClass.ListRequest.Range): ListRequest.Range =
        ListRequest.Range(
    	start = obj.startList.map { IndexValueJvmConverter.convert(it) },
    	end = obj.endList.map { IndexValueJvmConverter.convert(it) },
    )

    public override fun convert(obj: ListRequest.Range): QueryOuterClass.ListRequest.Range {
      val builder = QueryOuterClass.ListRequest.Range.newBuilder()
      builder.addAllStart(obj.start.map { IndexValueJvmConverter.convert(it) })
      builder.addAllEnd(obj.end.map { IndexValueJvmConverter.convert(it) })
      return builder.build()
    }
  }
}

public object ListResponseJvmConverter :
    ProtobufTypeMapper<ListResponse, QueryOuterClass.ListResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.ListResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.ListResponse> =
      QueryOuterClass.ListResponse.parser()

  public override fun convert(obj: QueryOuterClass.ListResponse): ListResponse = ListResponse(
  	results = obj.resultsList.map { AnyJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.pagination),
  )

  public override fun convert(obj: ListResponse): QueryOuterClass.ListResponse {
    val builder = QueryOuterClass.ListResponse.newBuilder()
    builder.addAllResults(obj.results.map { AnyJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object IndexValueJvmConverter : ProtobufTypeMapper<IndexValue, QueryOuterClass.IndexValue> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.IndexValue.getDescriptor()

  public override val parser: Parser<QueryOuterClass.IndexValue> =
      QueryOuterClass.IndexValue.parser()

  public override fun convert(obj: QueryOuterClass.IndexValue): IndexValue = IndexValue(
  	`value` = mapOf(
  1 to { IndexValue.ValueOneOf.Uint(obj.uint.asKotlinType) },
  2 to { IndexValue.ValueOneOf.Int(obj.int) },
  3 to { IndexValue.ValueOneOf.Str(obj.str) },
  4 to { IndexValue.ValueOneOf.Bytes(obj.bytes.toByteArray()) },
  5 to { IndexValue.ValueOneOf.Enum(obj.`enum`) },
  6 to { IndexValue.ValueOneOf.Bool(obj.bool) },
  7 to { IndexValue.ValueOneOf.Timestamp(TimestampJvmConverter.convert(obj.timestamp)) },
  8 to { IndexValue.ValueOneOf.Duration(DurationJvmConverter.convert(obj.duration)) },
  ).getValue(obj.valueCase.number)(),
  )

  public override fun convert(obj: IndexValue): QueryOuterClass.IndexValue {
    val builder = QueryOuterClass.IndexValue.newBuilder()
    when (obj.`value`) {
      is IndexValue.ValueOneOf.Uint -> builder.setUint(obj.`value`.value.asJavaType)
      is IndexValue.ValueOneOf.Int -> builder.setInt(obj.`value`.value)
      is IndexValue.ValueOneOf.Str -> builder.setStr(obj.`value`.value)
      is IndexValue.ValueOneOf.Bytes -> builder.setBytes(ByteString.copyFrom(obj.`value`.value))
      is IndexValue.ValueOneOf.Enum -> builder.setEnum(obj.`value`.value)
      is IndexValue.ValueOneOf.Bool -> builder.setBool(obj.`value`.value)
      is IndexValue.ValueOneOf.Timestamp ->
          builder.setTimestamp(TimestampJvmConverter.convert(obj.`value`.value))
      is IndexValue.ValueOneOf.Duration ->
          builder.setDuration(DurationJvmConverter.convert(obj.`value`.value))
    }
    return builder.build()
  }
}
