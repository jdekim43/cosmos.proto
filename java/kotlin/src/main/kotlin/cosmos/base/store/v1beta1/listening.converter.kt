// Transform from cosmos/base/store/v1beta1/listening.proto
package cosmos.base.store.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import tendermint.abci.RequestBeginBlockMapper
import tendermint.abci.RequestDeliverTxMapper
import tendermint.abci.RequestEndBlockMapper
import tendermint.abci.ResponseBeginBlockMapper
import tendermint.abci.ResponseCommitMapper
import tendermint.abci.ResponseDeliverTxMapper
import tendermint.abci.ResponseEndBlockMapper

public object StoreKVPairMapper : ProtobufTypeMapper<StoreKVPair, Listening.StoreKVPair> {
  public override val descriptor: Descriptors.Descriptor = Listening.StoreKVPair.getDescriptor()

  public override val parser: Parser<Listening.StoreKVPair> = Listening.StoreKVPair.parser()

  public override fun convert(obj: Listening.StoreKVPair): StoreKVPair = StoreKVPair(
  	storeKey = obj.storeKey,
  	delete = obj.delete,
  	key = obj.key.toByteArray(),
  	`value` = obj.`value`.toByteArray(),
  )

  public override fun convert(obj: StoreKVPair): Listening.StoreKVPair {
    val builder = Listening.StoreKVPair.newBuilder()
    builder.setStoreKey(obj.storeKey)
    builder.setDelete(obj.delete)
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    return builder.build()
  }
}

public object BlockMetadataMapper : ProtobufTypeMapper<BlockMetadata, Listening.BlockMetadata> {
  public override val descriptor: Descriptors.Descriptor = Listening.BlockMetadata.getDescriptor()

  public override val parser: Parser<Listening.BlockMetadata> = Listening.BlockMetadata.parser()

  public override fun convert(obj: Listening.BlockMetadata): BlockMetadata = BlockMetadata(
  	requestBeginBlock = RequestBeginBlockMapper.convert(obj.requestBeginBlock),
  	responseBeginBlock = ResponseBeginBlockMapper.convert(obj.responseBeginBlock),
  	deliverTxs = obj.deliverTxsList.map { DeliverTxMapper.convert(it) },
  	requestEndBlock = RequestEndBlockMapper.convert(obj.requestEndBlock),
  	responseEndBlock = ResponseEndBlockMapper.convert(obj.responseEndBlock),
  	responseCommit = ResponseCommitMapper.convert(obj.responseCommit),
  )

  public override fun convert(obj: BlockMetadata): Listening.BlockMetadata {
    val builder = Listening.BlockMetadata.newBuilder()
    builder.setRequestBeginBlock(RequestBeginBlockMapper.convert(obj.requestBeginBlock))
    builder.setResponseBeginBlock(ResponseBeginBlockMapper.convert(obj.responseBeginBlock))
    builder.addAllDeliverTxs(obj.deliverTxs.map { DeliverTxMapper.convert(it) })
    builder.setRequestEndBlock(RequestEndBlockMapper.convert(obj.requestEndBlock))
    builder.setResponseEndBlock(ResponseEndBlockMapper.convert(obj.responseEndBlock))
    builder.setResponseCommit(ResponseCommitMapper.convert(obj.responseCommit))
    return builder.build()
  }

  public object DeliverTxMapper :
      ProtobufTypeMapper<BlockMetadata.DeliverTx, Listening.BlockMetadata.DeliverTx> {
    public override val descriptor: Descriptors.Descriptor =
        Listening.BlockMetadata.DeliverTx.getDescriptor()

    public override val parser: Parser<Listening.BlockMetadata.DeliverTx> =
        Listening.BlockMetadata.DeliverTx.parser()

    public override fun convert(obj: Listening.BlockMetadata.DeliverTx): BlockMetadata.DeliverTx =
        BlockMetadata.DeliverTx(
    	request = RequestDeliverTxMapper.convert(obj.request),
    	response = ResponseDeliverTxMapper.convert(obj.response),
    )

    public override fun convert(obj: BlockMetadata.DeliverTx): Listening.BlockMetadata.DeliverTx {
      val builder = Listening.BlockMetadata.DeliverTx.newBuilder()
      builder.setRequest(RequestDeliverTxMapper.convert(obj.request))
      builder.setResponse(ResponseDeliverTxMapper.convert(obj.response))
      return builder.build()
    }
  }
}
