// Transform from cosmos/base/store/v1beta1/commit_info.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.base.store.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object CommitInfoConverter : ProtobufConverter<CommitInfo>

public expect object StoreInfoConverter : ProtobufConverter<StoreInfo>

public expect object CommitIDConverter : ProtobufConverter<CommitID>
