// Transform from cosmos/base/v1beta1/coin.proto
package cosmos.base.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object CoinMapper : ProtobufTypeMapper<Coin, CoinOuterClass.Coin> {
  public override val descriptor: Descriptors.Descriptor = CoinOuterClass.Coin.getDescriptor()

  public override val parser: Parser<CoinOuterClass.Coin> = CoinOuterClass.Coin.parser()

  public override fun convert(obj: CoinOuterClass.Coin): Coin = Coin(
  	denom = obj.denom,
  	amount = obj.amount,
  )

  public override fun convert(obj: Coin): CoinOuterClass.Coin {
    val builder = CoinOuterClass.Coin.newBuilder()
    builder.setDenom(obj.denom)
    builder.setAmount(obj.amount)
    return builder.build()
  }
}

public object DecCoinMapper : ProtobufTypeMapper<DecCoin, CoinOuterClass.DecCoin> {
  public override val descriptor: Descriptors.Descriptor = CoinOuterClass.DecCoin.getDescriptor()

  public override val parser: Parser<CoinOuterClass.DecCoin> = CoinOuterClass.DecCoin.parser()

  public override fun convert(obj: CoinOuterClass.DecCoin): DecCoin = DecCoin(
  	denom = obj.denom,
  	amount = obj.amount,
  )

  public override fun convert(obj: DecCoin): CoinOuterClass.DecCoin {
    val builder = CoinOuterClass.DecCoin.newBuilder()
    builder.setDenom(obj.denom)
    builder.setAmount(obj.amount)
    return builder.build()
  }
}

public object IntProtoMapper : ProtobufTypeMapper<IntProto, CoinOuterClass.IntProto> {
  public override val descriptor: Descriptors.Descriptor = CoinOuterClass.IntProto.getDescriptor()

  public override val parser: Parser<CoinOuterClass.IntProto> = CoinOuterClass.IntProto.parser()

  public override fun convert(obj: CoinOuterClass.IntProto): IntProto = IntProto(
  	int = obj.int,
  )

  public override fun convert(obj: IntProto): CoinOuterClass.IntProto {
    val builder = CoinOuterClass.IntProto.newBuilder()
    builder.setInt(obj.int)
    return builder.build()
  }
}

public object DecProtoMapper : ProtobufTypeMapper<DecProto, CoinOuterClass.DecProto> {
  public override val descriptor: Descriptors.Descriptor = CoinOuterClass.DecProto.getDescriptor()

  public override val parser: Parser<CoinOuterClass.DecProto> = CoinOuterClass.DecProto.parser()

  public override fun convert(obj: CoinOuterClass.DecProto): DecProto = DecProto(
  	dec = obj.dec,
  )

  public override fun convert(obj: DecProto): CoinOuterClass.DecProto {
    val builder = CoinOuterClass.DecProto.newBuilder()
    builder.setDec(obj.dec)
    return builder.build()
  }
}
