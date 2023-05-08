// Transform from cosmos/tx/signing/v1beta1/signing.proto
package cosmos.tx.signing.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.crypto.multisig.v1beta1.CompactBitArrayMapper
import google.protobuf.AnyMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object SignatureDescriptorsMapper :
    ProtobufTypeMapper<SignatureDescriptors, Signing.SignatureDescriptors> {
  public override val descriptor: Descriptors.Descriptor =
      Signing.SignatureDescriptors.getDescriptor()

  public override val parser: Parser<Signing.SignatureDescriptors> =
      Signing.SignatureDescriptors.parser()

  public override fun convert(obj: Signing.SignatureDescriptors): SignatureDescriptors =
      SignatureDescriptors(
  	signatures = obj.signaturesList.map { SignatureDescriptorMapper.convert(it) },
  )

  public override fun convert(obj: SignatureDescriptors): Signing.SignatureDescriptors {
    val builder = Signing.SignatureDescriptors.newBuilder()
    builder.addAllSignatures(obj.signatures.map { SignatureDescriptorMapper.convert(it) })
    return builder.build()
  }
}

public object SignatureDescriptorMapper :
    ProtobufTypeMapper<SignatureDescriptor, Signing.SignatureDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Signing.SignatureDescriptor.getDescriptor()

  public override val parser: Parser<Signing.SignatureDescriptor> =
      Signing.SignatureDescriptor.parser()

  public override fun convert(obj: Signing.SignatureDescriptor): SignatureDescriptor =
      SignatureDescriptor(
  	publicKey = AnyMapper.convert(obj.publicKey),
  	`data` = DataMapper.convert(obj.`data`),
  	sequence = obj.sequence.asKotlinType,
  )

  public override fun convert(obj: SignatureDescriptor): Signing.SignatureDescriptor {
    val builder = Signing.SignatureDescriptor.newBuilder()
    builder.setPublicKey(AnyMapper.convert(obj.publicKey))
    builder.setData(DataMapper.convert(obj.`data`))
    builder.setSequence(obj.sequence.asJavaType)
    return builder.build()
  }

  public object DataMapper :
      ProtobufTypeMapper<SignatureDescriptor.Data, Signing.SignatureDescriptor.Data> {
    public override val descriptor: Descriptors.Descriptor =
        Signing.SignatureDescriptor.Data.getDescriptor()

    public override val parser: Parser<Signing.SignatureDescriptor.Data> =
        Signing.SignatureDescriptor.Data.parser()

    public override fun convert(obj: Signing.SignatureDescriptor.Data): SignatureDescriptor.Data =
        SignatureDescriptor.Data(
    	sum = mapOf(
    1 to { SignatureDescriptor.Data.SumOneOf.Single(SingleMapper.convert(obj.single)) },
    2 to { SignatureDescriptor.Data.SumOneOf.Multi(MultiMapper.convert(obj.multi)) },
    ).getValue(obj.sumCase.number)(),
    )

    public override fun convert(obj: SignatureDescriptor.Data): Signing.SignatureDescriptor.Data {
      val builder = Signing.SignatureDescriptor.Data.newBuilder()
      when (obj.sum) {
        is SignatureDescriptor.Data.SumOneOf.Single ->
            builder.setSingle(SingleMapper.convert(obj.sum.value))
        is SignatureDescriptor.Data.SumOneOf.Multi ->
            builder.setMulti(MultiMapper.convert(obj.sum.value))
      }
      return builder.build()
    }

    public object SingleMapper :
        ProtobufTypeMapper<SignatureDescriptor.Data.Single, Signing.SignatureDescriptor.Data.Single>
        {
      public override val descriptor: Descriptors.Descriptor =
          Signing.SignatureDescriptor.Data.Single.getDescriptor()

      public override val parser: Parser<Signing.SignatureDescriptor.Data.Single> =
          Signing.SignatureDescriptor.Data.Single.parser()

      public override fun convert(obj: Signing.SignatureDescriptor.Data.Single):
          SignatureDescriptor.Data.Single = SignatureDescriptor.Data.Single(
      	mode = SignMode.forNumber(obj.mode.number),
      	signature = obj.signature.toByteArray(),
      )

      public override fun convert(obj: SignatureDescriptor.Data.Single):
          Signing.SignatureDescriptor.Data.Single {
        val builder = Signing.SignatureDescriptor.Data.Single.newBuilder()
        builder.setMode(Signing.SignMode.forNumber(obj.mode.number))
        builder.setSignature(ByteString.copyFrom(obj.signature))
        return builder.build()
      }
    }

    public object MultiMapper :
        ProtobufTypeMapper<SignatureDescriptor.Data.Multi, Signing.SignatureDescriptor.Data.Multi> {
      public override val descriptor: Descriptors.Descriptor =
          Signing.SignatureDescriptor.Data.Multi.getDescriptor()

      public override val parser: Parser<Signing.SignatureDescriptor.Data.Multi> =
          Signing.SignatureDescriptor.Data.Multi.parser()

      public override fun convert(obj: Signing.SignatureDescriptor.Data.Multi):
          SignatureDescriptor.Data.Multi = SignatureDescriptor.Data.Multi(
      	bitarray = CompactBitArrayMapper.convert(obj.bitarray),
      	signatures = obj.signaturesList.map { DataMapper.convert(it) },
      )

      public override fun convert(obj: SignatureDescriptor.Data.Multi):
          Signing.SignatureDescriptor.Data.Multi {
        val builder = Signing.SignatureDescriptor.Data.Multi.newBuilder()
        builder.setBitarray(CompactBitArrayMapper.convert(obj.bitarray))
        builder.addAllSignatures(obj.signatures.map { DataMapper.convert(it) })
        return builder.build()
      }
    }
  }
}
