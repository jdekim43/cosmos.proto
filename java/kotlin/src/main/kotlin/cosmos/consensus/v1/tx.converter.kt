// Transform from cosmos/consensus/v1/tx.proto
package cosmos.consensus.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import tendermint.types.BlockParamsMapper
import tendermint.types.EvidenceParamsMapper
import tendermint.types.ValidatorParamsMapper

public object MsgUpdateParamsMapper : ProtobufTypeMapper<MsgUpdateParams, Tx.MsgUpdateParams> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParams> = Tx.MsgUpdateParams.parser()

  public override fun convert(obj: Tx.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.authority,
  	block = BlockParamsMapper.convert(obj.block),
  	evidence = EvidenceParamsMapper.convert(obj.evidence),
  	validator = ValidatorParamsMapper.convert(obj.validator),
  )

  public override fun convert(obj: MsgUpdateParams): Tx.MsgUpdateParams {
    val builder = Tx.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setBlock(BlockParamsMapper.convert(obj.block))
    builder.setEvidence(EvidenceParamsMapper.convert(obj.evidence))
    builder.setValidator(ValidatorParamsMapper.convert(obj.validator))
    return builder.build()
  }
}

public object MsgUpdateParamsResponseMapper :
    ProtobufTypeMapper<MsgUpdateParamsResponse, Tx.MsgUpdateParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateParamsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParamsResponse> =
      Tx.MsgUpdateParamsResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateParamsResponse): MsgUpdateParamsResponse =
      MsgUpdateParamsResponse(
  )

  public override fun convert(obj: MsgUpdateParamsResponse): Tx.MsgUpdateParamsResponse {
    val builder = Tx.MsgUpdateParamsResponse.newBuilder()
    return builder.build()
  }
}
