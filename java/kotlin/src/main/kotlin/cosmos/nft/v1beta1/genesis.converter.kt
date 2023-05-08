// Transform from cosmos/nft/v1beta1/genesis.proto
package cosmos.nft.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenesisStateMapper : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	classes = obj.classesList.map { ClassMapper.convert(it) },
  	entries = obj.entriesList.map { EntryMapper.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.addAllClasses(obj.classes.map { ClassMapper.convert(it) })
    builder.addAllEntries(obj.entries.map { EntryMapper.convert(it) })
    return builder.build()
  }
}

public object EntryMapper : ProtobufTypeMapper<Entry, Genesis.Entry> {
  public override val descriptor: Descriptors.Descriptor = Genesis.Entry.getDescriptor()

  public override val parser: Parser<Genesis.Entry> = Genesis.Entry.parser()

  public override fun convert(obj: Genesis.Entry): Entry = Entry(
  	owner = obj.owner,
  	nfts = obj.nftsList.map { NFTMapper.convert(it) },
  )

  public override fun convert(obj: Entry): Genesis.Entry {
    val builder = Genesis.Entry.newBuilder()
    builder.setOwner(obj.owner)
    builder.addAllNfts(obj.nfts.map { NFTMapper.convert(it) })
    return builder.build()
  }
}
