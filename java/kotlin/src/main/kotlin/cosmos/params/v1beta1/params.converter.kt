// Transform from cosmos/params/v1beta1/params.proto
package cosmos.params.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ParameterChangeProposalMapper :
    ProtobufTypeMapper<ParameterChangeProposal, Params.ParameterChangeProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Params.ParameterChangeProposal.getDescriptor()

  public override val parser: Parser<Params.ParameterChangeProposal> =
      Params.ParameterChangeProposal.parser()

  public override fun convert(obj: Params.ParameterChangeProposal): ParameterChangeProposal =
      ParameterChangeProposal(
  	title = obj.title,
  	description = obj.description,
  	changes = obj.changesList.map { ParamChangeMapper.convert(it) },
  )

  public override fun convert(obj: ParameterChangeProposal): Params.ParameterChangeProposal {
    val builder = Params.ParameterChangeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllChanges(obj.changes.map { ParamChangeMapper.convert(it) })
    return builder.build()
  }
}

public object ParamChangeMapper : ProtobufTypeMapper<ParamChange, Params.ParamChange> {
  public override val descriptor: Descriptors.Descriptor = Params.ParamChange.getDescriptor()

  public override val parser: Parser<Params.ParamChange> = Params.ParamChange.parser()

  public override fun convert(obj: Params.ParamChange): ParamChange = ParamChange(
  	subspace = obj.subspace,
  	key = obj.key,
  	`value` = obj.`value`,
  )

  public override fun convert(obj: ParamChange): Params.ParamChange {
    val builder = Params.ParamChange.newBuilder()
    builder.setSubspace(obj.subspace)
    builder.setKey(obj.key)
    builder.setValue(obj.`value`)
    return builder.build()
  }
}
