// Transform from cosmos/crypto/hd/v1/hd.proto
package cosmos.crypto.hd.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object BIP44ParamsMapper : ProtobufTypeMapper<BIP44Params, Hd.BIP44Params> {
  public override val descriptor: Descriptors.Descriptor = Hd.BIP44Params.getDescriptor()

  public override val parser: Parser<Hd.BIP44Params> = Hd.BIP44Params.parser()

  public override fun convert(obj: Hd.BIP44Params): BIP44Params = BIP44Params(
  	purpose = obj.purpose.asKotlinType,
  	coinType = obj.coinType.asKotlinType,
  	account = obj.account.asKotlinType,
  	change = obj.change,
  	addressIndex = obj.addressIndex.asKotlinType,
  )

  public override fun convert(obj: BIP44Params): Hd.BIP44Params {
    val builder = Hd.BIP44Params.newBuilder()
    builder.setPurpose(obj.purpose.asJavaType)
    builder.setCoinType(obj.coinType.asJavaType)
    builder.setAccount(obj.account.asJavaType)
    builder.setChange(obj.change)
    builder.setAddressIndex(obj.addressIndex.asJavaType)
    return builder.build()
  }
}
