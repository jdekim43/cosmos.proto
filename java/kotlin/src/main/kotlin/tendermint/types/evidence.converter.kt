// Transform from tendermint/types/evidence.proto
package tendermint.types

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object EvidenceMapper : ProtobufTypeMapper<Evidence, EvidenceOuterClass.Evidence> {
  public override val descriptor: Descriptors.Descriptor =
      EvidenceOuterClass.Evidence.getDescriptor()

  public override val parser: Parser<EvidenceOuterClass.Evidence> =
      EvidenceOuterClass.Evidence.parser()

  public override fun convert(obj: EvidenceOuterClass.Evidence): Evidence = Evidence(
  	sum = mapOf(
  1 to {
      Evidence.SumOneOf.DuplicateVoteEvidence(DuplicateVoteEvidenceMapper.convert(obj.duplicateVoteEvidence))
      },
  2 to {
      Evidence.SumOneOf.LightClientAttackEvidence(LightClientAttackEvidenceMapper.convert(obj.lightClientAttackEvidence))
      },
  ).getValue(obj.sumCase.number)(),
  )

  public override fun convert(obj: Evidence): EvidenceOuterClass.Evidence {
    val builder = EvidenceOuterClass.Evidence.newBuilder()
    when (obj.sum) {
      is Evidence.SumOneOf.DuplicateVoteEvidence ->
          builder.setDuplicateVoteEvidence(DuplicateVoteEvidenceMapper.convert(obj.sum.value))
      is Evidence.SumOneOf.LightClientAttackEvidence ->
          builder.setLightClientAttackEvidence(LightClientAttackEvidenceMapper.convert(obj.sum.value))
    }
    return builder.build()
  }
}

public object DuplicateVoteEvidenceMapper :
    ProtobufTypeMapper<DuplicateVoteEvidence, EvidenceOuterClass.DuplicateVoteEvidence> {
  public override val descriptor: Descriptors.Descriptor =
      EvidenceOuterClass.DuplicateVoteEvidence.getDescriptor()

  public override val parser: Parser<EvidenceOuterClass.DuplicateVoteEvidence> =
      EvidenceOuterClass.DuplicateVoteEvidence.parser()

  public override fun convert(obj: EvidenceOuterClass.DuplicateVoteEvidence): DuplicateVoteEvidence
      = DuplicateVoteEvidence(
  	voteA = VoteMapper.convert(obj.voteA),
  	voteB = VoteMapper.convert(obj.voteB),
  	totalVotingPower = obj.totalVotingPower,
  	validatorPower = obj.validatorPower,
  	timestamp = TimestampMapper.convert(obj.timestamp),
  )

  public override fun convert(obj: DuplicateVoteEvidence):
      EvidenceOuterClass.DuplicateVoteEvidence {
    val builder = EvidenceOuterClass.DuplicateVoteEvidence.newBuilder()
    builder.setVoteA(VoteMapper.convert(obj.voteA))
    builder.setVoteB(VoteMapper.convert(obj.voteB))
    builder.setTotalVotingPower(obj.totalVotingPower)
    builder.setValidatorPower(obj.validatorPower)
    builder.setTimestamp(TimestampMapper.convert(obj.timestamp))
    return builder.build()
  }
}

public object LightClientAttackEvidenceMapper :
    ProtobufTypeMapper<LightClientAttackEvidence, EvidenceOuterClass.LightClientAttackEvidence> {
  public override val descriptor: Descriptors.Descriptor =
      EvidenceOuterClass.LightClientAttackEvidence.getDescriptor()

  public override val parser: Parser<EvidenceOuterClass.LightClientAttackEvidence> =
      EvidenceOuterClass.LightClientAttackEvidence.parser()

  public override fun convert(obj: EvidenceOuterClass.LightClientAttackEvidence):
      LightClientAttackEvidence = LightClientAttackEvidence(
  	conflictingBlock = LightBlockMapper.convert(obj.conflictingBlock),
  	commonHeight = obj.commonHeight,
  	byzantineValidators = obj.byzantineValidatorsList.map { ValidatorMapper.convert(it) },
  	totalVotingPower = obj.totalVotingPower,
  	timestamp = TimestampMapper.convert(obj.timestamp),
  )

  public override fun convert(obj: LightClientAttackEvidence):
      EvidenceOuterClass.LightClientAttackEvidence {
    val builder = EvidenceOuterClass.LightClientAttackEvidence.newBuilder()
    builder.setConflictingBlock(LightBlockMapper.convert(obj.conflictingBlock))
    builder.setCommonHeight(obj.commonHeight)
    builder.addAllByzantineValidators(obj.byzantineValidators.map { ValidatorMapper.convert(it) })
    builder.setTotalVotingPower(obj.totalVotingPower)
    builder.setTimestamp(TimestampMapper.convert(obj.timestamp))
    return builder.build()
  }
}

public object EvidenceListMapper : ProtobufTypeMapper<EvidenceList, EvidenceOuterClass.EvidenceList>
    {
  public override val descriptor: Descriptors.Descriptor =
      EvidenceOuterClass.EvidenceList.getDescriptor()

  public override val parser: Parser<EvidenceOuterClass.EvidenceList> =
      EvidenceOuterClass.EvidenceList.parser()

  public override fun convert(obj: EvidenceOuterClass.EvidenceList): EvidenceList = EvidenceList(
  	evidence = obj.evidenceList.map { EvidenceMapper.convert(it) },
  )

  public override fun convert(obj: EvidenceList): EvidenceOuterClass.EvidenceList {
    val builder = EvidenceOuterClass.EvidenceList.newBuilder()
    builder.addAllEvidence(obj.evidence.map { EvidenceMapper.convert(it) })
    return builder.build()
  }
}
