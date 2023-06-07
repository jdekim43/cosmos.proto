// Transform from cosmos/base/v1beta1/coin.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.base.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object CoinConverter : ProtobufConverter<Coin>

public expect object DecCoinConverter : ProtobufConverter<DecCoin>

public expect object IntProtoConverter : ProtobufConverter<IntProto>

public expect object DecProtoConverter : ProtobufConverter<DecProto>
