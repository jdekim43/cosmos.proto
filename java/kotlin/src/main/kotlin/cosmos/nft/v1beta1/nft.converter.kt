// Transform from cosmos/nft/v1beta1/nft.proto
package cosmos.nft.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ClassMapper : ProtobufTypeMapper<Class, Nft.Class> {
  public override val descriptor: Descriptors.Descriptor = Nft.Class.getDescriptor()

  public override val parser: Parser<Nft.Class> = Nft.Class.parser()

  public override fun convert(obj: Nft.Class): Class = Class(
  	id = obj.id,
  	name = obj.name,
  	symbol = obj.symbol,
  	description = obj.description,
  	uri = obj.uri,
  	uriHash = obj.uriHash,
  	`data` = AnyMapper.convert(obj.`data`),
  )

  public override fun convert(obj: Class): Nft.Class {
    val builder = Nft.Class.newBuilder()
    builder.setId(obj.id)
    builder.setName(obj.name)
    builder.setSymbol(obj.symbol)
    builder.setDescription(obj.description)
    builder.setUri(obj.uri)
    builder.setUriHash(obj.uriHash)
    builder.setData(AnyMapper.convert(obj.`data`))
    return builder.build()
  }
}

public object NFTMapper : ProtobufTypeMapper<NFT, Nft.NFT> {
  public override val descriptor: Descriptors.Descriptor = Nft.NFT.getDescriptor()

  public override val parser: Parser<Nft.NFT> = Nft.NFT.parser()

  public override fun convert(obj: Nft.NFT): NFT = NFT(
  	classId = obj.classId,
  	id = obj.id,
  	uri = obj.uri,
  	uriHash = obj.uriHash,
  	`data` = AnyMapper.convert(obj.`data`),
  )

  public override fun convert(obj: NFT): Nft.NFT {
    val builder = Nft.NFT.newBuilder()
    builder.setClassId(obj.classId)
    builder.setId(obj.id)
    builder.setUri(obj.uri)
    builder.setUriHash(obj.uriHash)
    builder.setData(AnyMapper.convert(obj.`data`))
    return builder.build()
  }
}
