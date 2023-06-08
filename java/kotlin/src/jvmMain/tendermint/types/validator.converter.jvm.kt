// Transform from tendermint/types/validator.proto
@file:GeneratorVersion(version = "0.2.2")

package tendermint.types

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import tendermint.crypto.PublicKeyJvmConverter

public object ValidatorSetJvmConverter :
    ProtobufTypeMapper<ValidatorSet, ValidatorOuterClass.ValidatorSet> {
  public override val descriptor: Descriptors.Descriptor =
      ValidatorOuterClass.ValidatorSet.getDescriptor()

  public override val parser: Parser<ValidatorOuterClass.ValidatorSet> =
      ValidatorOuterClass.ValidatorSet.parser()

  public override fun convert(obj: ValidatorOuterClass.ValidatorSet): ValidatorSet = ValidatorSet(
  	validators = obj.validatorsList.map { ValidatorJvmConverter.convert(it) },
  	proposer = ValidatorJvmConverter.convert(obj.proposer),
  	totalVotingPower = obj.totalVotingPower,
  )

  public override fun convert(obj: ValidatorSet): ValidatorOuterClass.ValidatorSet {
    val builder = ValidatorOuterClass.ValidatorSet.newBuilder()
    builder.addAllValidators(obj.validators.map { ValidatorJvmConverter.convert(it) })
    builder.setProposer(ValidatorJvmConverter.convert(obj.proposer))
    builder.setTotalVotingPower(obj.totalVotingPower)
    return builder.build()
  }
}

public object ValidatorJvmConverter : ProtobufTypeMapper<Validator, ValidatorOuterClass.Validator> {
  public override val descriptor: Descriptors.Descriptor =
      ValidatorOuterClass.Validator.getDescriptor()

  public override val parser: Parser<ValidatorOuterClass.Validator> =
      ValidatorOuterClass.Validator.parser()

  public override fun convert(obj: ValidatorOuterClass.Validator): Validator = Validator(
  	address = obj.address.toByteArray(),
  	pubKey = PublicKeyJvmConverter.convert(obj.pubKey),
  	votingPower = obj.votingPower,
  	proposerPriority = obj.proposerPriority,
  )

  public override fun convert(obj: Validator): ValidatorOuterClass.Validator {
    val builder = ValidatorOuterClass.Validator.newBuilder()
    builder.setAddress(ByteString.copyFrom(obj.address))
    builder.setPubKey(PublicKeyJvmConverter.convert(obj.pubKey))
    builder.setVotingPower(obj.votingPower)
    builder.setProposerPriority(obj.proposerPriority)
    return builder.build()
  }
}

public object SimpleValidatorJvmConverter :
    ProtobufTypeMapper<SimpleValidator, ValidatorOuterClass.SimpleValidator> {
  public override val descriptor: Descriptors.Descriptor =
      ValidatorOuterClass.SimpleValidator.getDescriptor()

  public override val parser: Parser<ValidatorOuterClass.SimpleValidator> =
      ValidatorOuterClass.SimpleValidator.parser()

  public override fun convert(obj: ValidatorOuterClass.SimpleValidator): SimpleValidator =
      SimpleValidator(
  	pubKey = PublicKeyJvmConverter.convert(obj.pubKey),
  	votingPower = obj.votingPower,
  )

  public override fun convert(obj: SimpleValidator): ValidatorOuterClass.SimpleValidator {
    val builder = ValidatorOuterClass.SimpleValidator.newBuilder()
    builder.setPubKey(PublicKeyJvmConverter.convert(obj.pubKey))
    builder.setVotingPower(obj.votingPower)
    return builder.build()
  }
}
