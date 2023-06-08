// Transform from tendermint/p2p/types.proto
@file:GeneratorVersion(version = "0.2.2")

package tendermint.p2p

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object NetAddressJvmConverter : ProtobufTypeMapper<NetAddress, Types.NetAddress> {
  public override val descriptor: Descriptors.Descriptor = Types.NetAddress.getDescriptor()

  public override val parser: Parser<Types.NetAddress> = Types.NetAddress.parser()

  public override fun convert(obj: Types.NetAddress): NetAddress = NetAddress(
  	id = obj.id,
  	ip = obj.ip,
  	port = obj.port.asKotlinType,
  )

  public override fun convert(obj: NetAddress): Types.NetAddress {
    val builder = Types.NetAddress.newBuilder()
    builder.setId(obj.id)
    builder.setIp(obj.ip)
    builder.setPort(obj.port.asJavaType)
    return builder.build()
  }
}

public object ProtocolVersionJvmConverter :
    ProtobufTypeMapper<ProtocolVersion, Types.ProtocolVersion> {
  public override val descriptor: Descriptors.Descriptor = Types.ProtocolVersion.getDescriptor()

  public override val parser: Parser<Types.ProtocolVersion> = Types.ProtocolVersion.parser()

  public override fun convert(obj: Types.ProtocolVersion): ProtocolVersion = ProtocolVersion(
  	p2P = obj.p2P.asKotlinType,
  	block = obj.block.asKotlinType,
  	app = obj.app.asKotlinType,
  )

  public override fun convert(obj: ProtocolVersion): Types.ProtocolVersion {
    val builder = Types.ProtocolVersion.newBuilder()
    builder.setP2P(obj.p2P.asJavaType)
    builder.setBlock(obj.block.asJavaType)
    builder.setApp(obj.app.asJavaType)
    return builder.build()
  }
}

public object DefaultNodeInfoJvmConverter :
    ProtobufTypeMapper<DefaultNodeInfo, Types.DefaultNodeInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.DefaultNodeInfo.getDescriptor()

  public override val parser: Parser<Types.DefaultNodeInfo> = Types.DefaultNodeInfo.parser()

  public override fun convert(obj: Types.DefaultNodeInfo): DefaultNodeInfo = DefaultNodeInfo(
  	protocolVersion = ProtocolVersionJvmConverter.convert(obj.protocolVersion),
  	defaultNodeId = obj.defaultNodeId,
  	listenAddr = obj.listenAddr,
  	network = obj.network,
  	version = obj.version,
  	channels = obj.channels.toByteArray(),
  	moniker = obj.moniker,
  	other = DefaultNodeInfoOtherJvmConverter.convert(obj.other),
  )

  public override fun convert(obj: DefaultNodeInfo): Types.DefaultNodeInfo {
    val builder = Types.DefaultNodeInfo.newBuilder()
    builder.setProtocolVersion(ProtocolVersionJvmConverter.convert(obj.protocolVersion))
    builder.setDefaultNodeId(obj.defaultNodeId)
    builder.setListenAddr(obj.listenAddr)
    builder.setNetwork(obj.network)
    builder.setVersion(obj.version)
    builder.setChannels(ByteString.copyFrom(obj.channels))
    builder.setMoniker(obj.moniker)
    builder.setOther(DefaultNodeInfoOtherJvmConverter.convert(obj.other))
    return builder.build()
  }
}

public object DefaultNodeInfoOtherJvmConverter :
    ProtobufTypeMapper<DefaultNodeInfoOther, Types.DefaultNodeInfoOther> {
  public override val descriptor: Descriptors.Descriptor =
      Types.DefaultNodeInfoOther.getDescriptor()

  public override val parser: Parser<Types.DefaultNodeInfoOther> =
      Types.DefaultNodeInfoOther.parser()

  public override fun convert(obj: Types.DefaultNodeInfoOther): DefaultNodeInfoOther =
      DefaultNodeInfoOther(
  	txIndex = obj.txIndex,
  	rpcAddress = obj.rpcAddress,
  )

  public override fun convert(obj: DefaultNodeInfoOther): Types.DefaultNodeInfoOther {
    val builder = Types.DefaultNodeInfoOther.newBuilder()
    builder.setTxIndex(obj.txIndex)
    builder.setRpcAddress(obj.rpcAddress)
    return builder.build()
  }
}
