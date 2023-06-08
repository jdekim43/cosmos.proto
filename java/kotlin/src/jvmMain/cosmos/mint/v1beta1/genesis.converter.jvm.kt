// Transform from cosmos/mint/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.mint.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	minter = MinterJvmConverter.convert(obj.minter),
  	params = ParamsJvmConverter.convert(obj.params),
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setMinter(MinterJvmConverter.convert(obj.minter))
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}
