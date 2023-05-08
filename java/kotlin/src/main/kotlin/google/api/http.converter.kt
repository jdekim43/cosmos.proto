// Transform from google/api/http.proto
package google.api

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object HttpMapper : ProtobufTypeMapper<Http, com.google.api.Http> {
  public override val descriptor: Descriptors.Descriptor = com.google.api.Http.getDescriptor()

  public override val parser: Parser<com.google.api.Http> = com.google.api.Http.parser()

  public override fun convert(obj: com.google.api.Http): Http = Http(
  	rules = obj.rulesList.map { HttpRuleMapper.convert(it) },
  	fullyDecodeReservedExpansion = obj.fullyDecodeReservedExpansion,
  )

  public override fun convert(obj: Http): com.google.api.Http {
    val builder = com.google.api.Http.newBuilder()
    builder.addAllRules(obj.rules.map { HttpRuleMapper.convert(it) })
    builder.setFullyDecodeReservedExpansion(obj.fullyDecodeReservedExpansion)
    return builder.build()
  }
}

public object HttpRuleMapper : ProtobufTypeMapper<HttpRule, com.google.api.HttpRule> {
  public override val descriptor: Descriptors.Descriptor = com.google.api.HttpRule.getDescriptor()

  public override val parser: Parser<com.google.api.HttpRule> = com.google.api.HttpRule.parser()

  public override fun convert(obj: com.google.api.HttpRule): HttpRule = HttpRule(
  	selector = obj.selector,
  	body = obj.body,
  	responseBody = obj.responseBody,
  	additionalBindings = obj.additionalBindingsList.map { HttpRuleMapper.convert(it) },
  	pattern = mapOf(
  2 to { HttpRule.PatternOneOf.Get(obj.`get`) },
  3 to { HttpRule.PatternOneOf.Put(obj.put) },
  4 to { HttpRule.PatternOneOf.Post(obj.post) },
  5 to { HttpRule.PatternOneOf.Delete(obj.delete) },
  6 to { HttpRule.PatternOneOf.Patch(obj.patch) },
  8 to { HttpRule.PatternOneOf.Custom(CustomHttpPatternMapper.convert(obj.custom)) },
  ).getValue(obj.patternCase.number)(),
  )

  public override fun convert(obj: HttpRule): com.google.api.HttpRule {
    val builder = com.google.api.HttpRule.newBuilder()
    builder.setSelector(obj.selector)
    builder.setBody(obj.body)
    builder.setResponseBody(obj.responseBody)
    builder.addAllAdditionalBindings(obj.additionalBindings.map { HttpRuleMapper.convert(it) })
    when (obj.pattern) {
      is HttpRule.PatternOneOf.Get -> builder.setGet(obj.pattern.value)
      is HttpRule.PatternOneOf.Put -> builder.setPut(obj.pattern.value)
      is HttpRule.PatternOneOf.Post -> builder.setPost(obj.pattern.value)
      is HttpRule.PatternOneOf.Delete -> builder.setDelete(obj.pattern.value)
      is HttpRule.PatternOneOf.Patch -> builder.setPatch(obj.pattern.value)
      is HttpRule.PatternOneOf.Custom ->
          builder.setCustom(CustomHttpPatternMapper.convert(obj.pattern.value))
    }
    return builder.build()
  }
}

public object CustomHttpPatternMapper :
    ProtobufTypeMapper<CustomHttpPattern, com.google.api.CustomHttpPattern> {
  public override val descriptor: Descriptors.Descriptor =
      com.google.api.CustomHttpPattern.getDescriptor()

  public override val parser: Parser<com.google.api.CustomHttpPattern> =
      com.google.api.CustomHttpPattern.parser()

  public override fun convert(obj: com.google.api.CustomHttpPattern): CustomHttpPattern =
      CustomHttpPattern(
  	kind = obj.kind,
  	path = obj.path,
  )

  public override fun convert(obj: CustomHttpPattern): com.google.api.CustomHttpPattern {
    val builder = com.google.api.CustomHttpPattern.newBuilder()
    builder.setKind(obj.kind)
    builder.setPath(obj.path)
    return builder.build()
  }
}
