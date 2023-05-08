// Transform from cosmos/slashing/v1beta1/slashing.proto
package cosmos.slashing.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.DurationMapper
import google.protobuf.TimestampMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ValidatorSigningInfoMapper :
    ProtobufTypeMapper<ValidatorSigningInfo, Slashing.ValidatorSigningInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Slashing.ValidatorSigningInfo.getDescriptor()

  public override val parser: Parser<Slashing.ValidatorSigningInfo> =
      Slashing.ValidatorSigningInfo.parser()

  public override fun convert(obj: Slashing.ValidatorSigningInfo): ValidatorSigningInfo =
      ValidatorSigningInfo(
  	address = obj.address,
  	startHeight = obj.startHeight,
  	indexOffset = obj.indexOffset,
  	jailedUntil = TimestampMapper.convert(obj.jailedUntil),
  	tombstoned = obj.tombstoned,
  	missedBlocksCounter = obj.missedBlocksCounter,
  )

  public override fun convert(obj: ValidatorSigningInfo): Slashing.ValidatorSigningInfo {
    val builder = Slashing.ValidatorSigningInfo.newBuilder()
    builder.setAddress(obj.address)
    builder.setStartHeight(obj.startHeight)
    builder.setIndexOffset(obj.indexOffset)
    builder.setJailedUntil(TimestampMapper.convert(obj.jailedUntil))
    builder.setTombstoned(obj.tombstoned)
    builder.setMissedBlocksCounter(obj.missedBlocksCounter)
    return builder.build()
  }
}

public object ParamsMapper : ProtobufTypeMapper<Params, Slashing.Params> {
  public override val descriptor: Descriptors.Descriptor = Slashing.Params.getDescriptor()

  public override val parser: Parser<Slashing.Params> = Slashing.Params.parser()

  public override fun convert(obj: Slashing.Params): Params = Params(
  	signedBlocksWindow = obj.signedBlocksWindow,
  	minSignedPerWindow = obj.minSignedPerWindow.toByteArray(),
  	downtimeJailDuration = DurationMapper.convert(obj.downtimeJailDuration),
  	slashFractionDoubleSign = obj.slashFractionDoubleSign.toByteArray(),
  	slashFractionDowntime = obj.slashFractionDowntime.toByteArray(),
  )

  public override fun convert(obj: Params): Slashing.Params {
    val builder = Slashing.Params.newBuilder()
    builder.setSignedBlocksWindow(obj.signedBlocksWindow)
    builder.setMinSignedPerWindow(ByteString.copyFrom(obj.minSignedPerWindow))
    builder.setDowntimeJailDuration(DurationMapper.convert(obj.downtimeJailDuration))
    builder.setSlashFractionDoubleSign(ByteString.copyFrom(obj.slashFractionDoubleSign))
    builder.setSlashFractionDowntime(ByteString.copyFrom(obj.slashFractionDowntime))
    return builder.build()
  }
}
