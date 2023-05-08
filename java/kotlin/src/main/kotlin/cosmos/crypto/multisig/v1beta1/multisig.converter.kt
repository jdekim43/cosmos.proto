// Transform from cosmos/crypto/multisig/v1beta1/multisig.proto
package cosmos.crypto.multisig.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MultiSignatureMapper : ProtobufTypeMapper<MultiSignature, Multisig.MultiSignature> {
  public override val descriptor: Descriptors.Descriptor = Multisig.MultiSignature.getDescriptor()

  public override val parser: Parser<Multisig.MultiSignature> = Multisig.MultiSignature.parser()

  public override fun convert(obj: Multisig.MultiSignature): MultiSignature = MultiSignature(
  	signatures = obj.signaturesList.map { it.toByteArray() },
  )

  public override fun convert(obj: MultiSignature): Multisig.MultiSignature {
    val builder = Multisig.MultiSignature.newBuilder()
    builder.addAllSignatures(obj.signatures.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object CompactBitArrayMapper : ProtobufTypeMapper<CompactBitArray, Multisig.CompactBitArray>
    {
  public override val descriptor: Descriptors.Descriptor = Multisig.CompactBitArray.getDescriptor()

  public override val parser: Parser<Multisig.CompactBitArray> = Multisig.CompactBitArray.parser()

  public override fun convert(obj: Multisig.CompactBitArray): CompactBitArray = CompactBitArray(
  	extraBitsStored = obj.extraBitsStored.asKotlinType,
  	elems = obj.elems.toByteArray(),
  )

  public override fun convert(obj: CompactBitArray): Multisig.CompactBitArray {
    val builder = Multisig.CompactBitArray.newBuilder()
    builder.setExtraBitsStored(obj.extraBitsStored.asJavaType)
    builder.setElems(ByteString.copyFrom(obj.elems))
    return builder.build()
  }
}
