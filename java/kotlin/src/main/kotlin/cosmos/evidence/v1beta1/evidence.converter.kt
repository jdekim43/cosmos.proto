// Transform from cosmos/evidence/v1beta1/evidence.proto
package cosmos.evidence.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object EquivocationMapper : ProtobufTypeMapper<Equivocation, Evidence.Equivocation> {
  public override val descriptor: Descriptors.Descriptor = Evidence.Equivocation.getDescriptor()

  public override val parser: Parser<Evidence.Equivocation> = Evidence.Equivocation.parser()

  public override fun convert(obj: Evidence.Equivocation): Equivocation = Equivocation(
  	height = obj.height,
  	time = TimestampMapper.convert(obj.time),
  	power = obj.power,
  	consensusAddress = obj.consensusAddress,
  )

  public override fun convert(obj: Equivocation): Evidence.Equivocation {
    val builder = Evidence.Equivocation.newBuilder()
    builder.setHeight(obj.height)
    builder.setTime(TimestampMapper.convert(obj.time))
    builder.setPower(obj.power)
    builder.setConsensusAddress(obj.consensusAddress)
    return builder.build()
  }
}
