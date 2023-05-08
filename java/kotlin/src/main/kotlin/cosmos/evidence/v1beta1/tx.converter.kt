// Transform from cosmos/evidence/v1beta1/tx.proto
package cosmos.evidence.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgSubmitEvidenceMapper : ProtobufTypeMapper<MsgSubmitEvidence, Tx.MsgSubmitEvidence>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSubmitEvidence.getDescriptor()

  public override val parser: Parser<Tx.MsgSubmitEvidence> = Tx.MsgSubmitEvidence.parser()

  public override fun convert(obj: Tx.MsgSubmitEvidence): MsgSubmitEvidence = MsgSubmitEvidence(
  	submitter = obj.submitter,
  	evidence = AnyMapper.convert(obj.evidence),
  )

  public override fun convert(obj: MsgSubmitEvidence): Tx.MsgSubmitEvidence {
    val builder = Tx.MsgSubmitEvidence.newBuilder()
    builder.setSubmitter(obj.submitter)
    builder.setEvidence(AnyMapper.convert(obj.evidence))
    return builder.build()
  }
}

public object MsgSubmitEvidenceResponseMapper :
    ProtobufTypeMapper<MsgSubmitEvidenceResponse, Tx.MsgSubmitEvidenceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgSubmitEvidenceResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSubmitEvidenceResponse> =
      Tx.MsgSubmitEvidenceResponse.parser()

  public override fun convert(obj: Tx.MsgSubmitEvidenceResponse): MsgSubmitEvidenceResponse =
      MsgSubmitEvidenceResponse(
  	hash = obj.hash.toByteArray(),
  )

  public override fun convert(obj: MsgSubmitEvidenceResponse): Tx.MsgSubmitEvidenceResponse {
    val builder = Tx.MsgSubmitEvidenceResponse.newBuilder()
    builder.setHash(ByteString.copyFrom(obj.hash))
    return builder.build()
  }
}
