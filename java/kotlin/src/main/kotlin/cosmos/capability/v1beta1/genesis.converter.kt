// Transform from cosmos/capability/v1beta1/genesis.proto
package cosmos.capability.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisOwnersMapper : ProtobufTypeMapper<GenesisOwners, Genesis.GenesisOwners> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisOwners.getDescriptor()

  public override val parser: Parser<Genesis.GenesisOwners> = Genesis.GenesisOwners.parser()

  public override fun convert(obj: Genesis.GenesisOwners): GenesisOwners = GenesisOwners(
  	index = obj.index.asKotlinType,
  	indexOwners = CapabilityOwnersMapper.convert(obj.indexOwners),
  )

  public override fun convert(obj: GenesisOwners): Genesis.GenesisOwners {
    val builder = Genesis.GenesisOwners.newBuilder()
    builder.setIndex(obj.index.asJavaType)
    builder.setIndexOwners(CapabilityOwnersMapper.convert(obj.indexOwners))
    return builder.build()
  }
}

public object GenesisStateMapper : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	index = obj.index.asKotlinType,
  	owners = obj.ownersList.map { GenesisOwnersMapper.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setIndex(obj.index.asJavaType)
    builder.addAllOwners(obj.owners.map { GenesisOwnersMapper.convert(it) })
    return builder.build()
  }
}
