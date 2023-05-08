// Transform from cosmos/base/store/v1beta1/commit_info.proto
package cosmos.base.store.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object CommitInfoMapper : ProtobufTypeMapper<CommitInfo, CommitInfoOuterClass.CommitInfo> {
  public override val descriptor: Descriptors.Descriptor =
      CommitInfoOuterClass.CommitInfo.getDescriptor()

  public override val parser: Parser<CommitInfoOuterClass.CommitInfo> =
      CommitInfoOuterClass.CommitInfo.parser()

  public override fun convert(obj: CommitInfoOuterClass.CommitInfo): CommitInfo = CommitInfo(
  	version = obj.version,
  	storeInfos = obj.storeInfosList.map { StoreInfoMapper.convert(it) },
  )

  public override fun convert(obj: CommitInfo): CommitInfoOuterClass.CommitInfo {
    val builder = CommitInfoOuterClass.CommitInfo.newBuilder()
    builder.setVersion(obj.version)
    builder.addAllStoreInfos(obj.storeInfos.map { StoreInfoMapper.convert(it) })
    return builder.build()
  }
}

public object StoreInfoMapper : ProtobufTypeMapper<StoreInfo, CommitInfoOuterClass.StoreInfo> {
  public override val descriptor: Descriptors.Descriptor =
      CommitInfoOuterClass.StoreInfo.getDescriptor()

  public override val parser: Parser<CommitInfoOuterClass.StoreInfo> =
      CommitInfoOuterClass.StoreInfo.parser()

  public override fun convert(obj: CommitInfoOuterClass.StoreInfo): StoreInfo = StoreInfo(
  	name = obj.name,
  	commitId = CommitIDMapper.convert(obj.commitId),
  )

  public override fun convert(obj: StoreInfo): CommitInfoOuterClass.StoreInfo {
    val builder = CommitInfoOuterClass.StoreInfo.newBuilder()
    builder.setName(obj.name)
    builder.setCommitId(CommitIDMapper.convert(obj.commitId))
    return builder.build()
  }
}

public object CommitIDMapper : ProtobufTypeMapper<CommitID, CommitInfoOuterClass.CommitID> {
  public override val descriptor: Descriptors.Descriptor =
      CommitInfoOuterClass.CommitID.getDescriptor()

  public override val parser: Parser<CommitInfoOuterClass.CommitID> =
      CommitInfoOuterClass.CommitID.parser()

  public override fun convert(obj: CommitInfoOuterClass.CommitID): CommitID = CommitID(
  	version = obj.version,
  	hash = obj.hash.toByteArray(),
  )

  public override fun convert(obj: CommitID): CommitInfoOuterClass.CommitID {
    val builder = CommitInfoOuterClass.CommitID.newBuilder()
    builder.setVersion(obj.version)
    builder.setHash(ByteString.copyFrom(obj.hash))
    return builder.build()
  }
}
