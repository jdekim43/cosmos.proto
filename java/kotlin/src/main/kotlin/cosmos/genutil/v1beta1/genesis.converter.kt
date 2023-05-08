// Transform from cosmos/genutil/v1beta1/genesis.proto
package cosmos.genutil.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateMapper : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	genTxs = obj.genTxsList.map { it.toByteArray() },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.addAllGenTxs(obj.genTxs.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}