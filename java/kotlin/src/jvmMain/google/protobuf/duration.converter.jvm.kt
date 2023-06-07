// Transform from google/protobuf/duration.proto
@file:GeneratorVersion(version = "0.2.1")

package google.protobuf

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object DurationJvmConverter : ProtobufTypeMapper<Duration, com.google.protobuf.Duration> {
  public override val descriptor: Descriptors.Descriptor =
      com.google.protobuf.Duration.getDescriptor()

  public override val parser: Parser<com.google.protobuf.Duration> =
      com.google.protobuf.Duration.parser()

  public override fun convert(obj: com.google.protobuf.Duration): Duration = Duration(
  	seconds = obj.seconds,
  	nanos = obj.nanos,
  )

  public override fun convert(obj: Duration): com.google.protobuf.Duration {
    val builder = com.google.protobuf.Duration.newBuilder()
    builder.setSeconds(obj.seconds)
    builder.setNanos(obj.nanos)
    return builder.build()
  }
}