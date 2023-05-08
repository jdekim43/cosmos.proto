// Transform from cosmos/slashing/v1beta1/genesis.proto
package cosmos.slashing.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateMapper : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsMapper.convert(obj.params),
  	signingInfos = obj.signingInfosList.map { SigningInfoMapper.convert(it) },
  	missedBlocks = obj.missedBlocksList.map { ValidatorMissedBlocksMapper.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsMapper.convert(obj.params))
    builder.addAllSigningInfos(obj.signingInfos.map { SigningInfoMapper.convert(it) })
    builder.addAllMissedBlocks(obj.missedBlocks.map { ValidatorMissedBlocksMapper.convert(it) })
    return builder.build()
  }
}

public object SigningInfoMapper : ProtobufTypeMapper<SigningInfo, Genesis.SigningInfo> {
  public override val descriptor: Descriptors.Descriptor = Genesis.SigningInfo.getDescriptor()

  public override val parser: Parser<Genesis.SigningInfo> = Genesis.SigningInfo.parser()

  public override fun convert(obj: Genesis.SigningInfo): SigningInfo = SigningInfo(
  	address = obj.address,
  	validatorSigningInfo = ValidatorSigningInfoMapper.convert(obj.validatorSigningInfo),
  )

  public override fun convert(obj: SigningInfo): Genesis.SigningInfo {
    val builder = Genesis.SigningInfo.newBuilder()
    builder.setAddress(obj.address)
    builder.setValidatorSigningInfo(ValidatorSigningInfoMapper.convert(obj.validatorSigningInfo))
    return builder.build()
  }
}

public object ValidatorMissedBlocksMapper :
    ProtobufTypeMapper<ValidatorMissedBlocks, Genesis.ValidatorMissedBlocks> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorMissedBlocks.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorMissedBlocks> =
      Genesis.ValidatorMissedBlocks.parser()

  public override fun convert(obj: Genesis.ValidatorMissedBlocks): ValidatorMissedBlocks =
      ValidatorMissedBlocks(
  	address = obj.address,
  	missedBlocks = obj.missedBlocksList.map { MissedBlockMapper.convert(it) },
  )

  public override fun convert(obj: ValidatorMissedBlocks): Genesis.ValidatorMissedBlocks {
    val builder = Genesis.ValidatorMissedBlocks.newBuilder()
    builder.setAddress(obj.address)
    builder.addAllMissedBlocks(obj.missedBlocks.map { MissedBlockMapper.convert(it) })
    return builder.build()
  }
}

public object MissedBlockMapper : ProtobufTypeMapper<MissedBlock, Genesis.MissedBlock> {
  public override val descriptor: Descriptors.Descriptor = Genesis.MissedBlock.getDescriptor()

  public override val parser: Parser<Genesis.MissedBlock> = Genesis.MissedBlock.parser()

  public override fun convert(obj: Genesis.MissedBlock): MissedBlock = MissedBlock(
  	index = obj.index,
  	missed = obj.missed,
  )

  public override fun convert(obj: MissedBlock): Genesis.MissedBlock {
    val builder = Genesis.MissedBlock.newBuilder()
    builder.setIndex(obj.index)
    builder.setMissed(obj.missed)
    return builder.build()
  }
}
