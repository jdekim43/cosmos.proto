// Transform from cosmos/auth/v1beta1/genesis.proto
package cosmos.auth.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateMapper : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsMapper.convert(obj.params),
  	accounts = obj.accountsList.map { AnyMapper.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsMapper.convert(obj.params))
    builder.addAllAccounts(obj.accounts.map { AnyMapper.convert(it) })
    return builder.build()
  }
}
