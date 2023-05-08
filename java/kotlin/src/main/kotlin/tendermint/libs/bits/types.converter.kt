// Transform from tendermint/libs/bits/types.proto
package tendermint.libs.bits

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object BitArrayMapper : ProtobufTypeMapper<BitArray, Types.BitArray> {
  public override val descriptor: Descriptors.Descriptor = Types.BitArray.getDescriptor()

  public override val parser: Parser<Types.BitArray> = Types.BitArray.parser()

  public override fun convert(obj: Types.BitArray): BitArray = BitArray(
  	bits = obj.bits,
  	elems = obj.elemsList.map { it.asKotlinType },
  )

  public override fun convert(obj: BitArray): Types.BitArray {
    val builder = Types.BitArray.newBuilder()
    builder.setBits(obj.bits)
    builder.addAllElems(obj.elems.map { it.asJavaType })
    return builder.build()
  }
}
