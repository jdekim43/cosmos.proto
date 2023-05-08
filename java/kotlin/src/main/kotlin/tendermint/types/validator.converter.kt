// Transform from tendermint/types/validator.proto
package tendermint.types

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import tendermint.crypto.PublicKeyMapper

public object ValidatorSetMapper :
    ProtobufTypeMapper<ValidatorSet, ValidatorOuterClass.ValidatorSet> {
  public override val descriptor: Descriptors.Descriptor =
      ValidatorOuterClass.ValidatorSet.getDescriptor()

  public override val parser: Parser<ValidatorOuterClass.ValidatorSet> =
      ValidatorOuterClass.ValidatorSet.parser()

  public override fun convert(obj: ValidatorOuterClass.ValidatorSet): ValidatorSet = ValidatorSet(
  	validators = obj.validatorsList.map { ValidatorMapper.convert(it) },
  	proposer = ValidatorMapper.convert(obj.proposer),
  	totalVotingPower = obj.totalVotingPower,
  )

  public override fun convert(obj: ValidatorSet): ValidatorOuterClass.ValidatorSet {
    val builder = ValidatorOuterClass.ValidatorSet.newBuilder()
    builder.addAllValidators(obj.validators.map { ValidatorMapper.convert(it) })
    builder.setProposer(ValidatorMapper.convert(obj.proposer))
    builder.setTotalVotingPower(obj.totalVotingPower)
    return builder.build()
  }
}

public object ValidatorMapper : ProtobufTypeMapper<Validator, ValidatorOuterClass.Validator> {
  public override val descriptor: Descriptors.Descriptor =
      ValidatorOuterClass.Validator.getDescriptor()

  public override val parser: Parser<ValidatorOuterClass.Validator> =
      ValidatorOuterClass.Validator.parser()

  public override fun convert(obj: ValidatorOuterClass.Validator): Validator = Validator(
  	address = obj.address.toByteArray(),
  	pubKey = PublicKeyMapper.convert(obj.pubKey),
  	votingPower = obj.votingPower,
  	proposerPriority = obj.proposerPriority,
  )

  public override fun convert(obj: Validator): ValidatorOuterClass.Validator {
    val builder = ValidatorOuterClass.Validator.newBuilder()
    builder.setAddress(ByteString.copyFrom(obj.address))
    builder.setPubKey(PublicKeyMapper.convert(obj.pubKey))
    builder.setVotingPower(obj.votingPower)
    builder.setProposerPriority(obj.proposerPriority)
    return builder.build()
  }
}

public object SimpleValidatorMapper :
    ProtobufTypeMapper<SimpleValidator, ValidatorOuterClass.SimpleValidator> {
  public override val descriptor: Descriptors.Descriptor =
      ValidatorOuterClass.SimpleValidator.getDescriptor()

  public override val parser: Parser<ValidatorOuterClass.SimpleValidator> =
      ValidatorOuterClass.SimpleValidator.parser()

  public override fun convert(obj: ValidatorOuterClass.SimpleValidator): SimpleValidator =
      SimpleValidator(
  	pubKey = PublicKeyMapper.convert(obj.pubKey),
  	votingPower = obj.votingPower,
  )

  public override fun convert(obj: SimpleValidator): ValidatorOuterClass.SimpleValidator {
    val builder = ValidatorOuterClass.SimpleValidator.newBuilder()
    builder.setPubKey(PublicKeyMapper.convert(obj.pubKey))
    builder.setVotingPower(obj.votingPower)
    return builder.build()
  }
}
