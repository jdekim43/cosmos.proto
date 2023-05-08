// Transform from cosmos/crypto/secp256k1/keys.proto
package cosmos.crypto.secp256k1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object PubKeyMapper : ProtobufTypeMapper<PubKey, Keys.PubKey> {
  public override val descriptor: Descriptors.Descriptor = Keys.PubKey.getDescriptor()

  public override val parser: Parser<Keys.PubKey> = Keys.PubKey.parser()

  public override fun convert(obj: Keys.PubKey): PubKey = PubKey(
  	key = obj.key.toByteArray(),
  )

  public override fun convert(obj: PubKey): Keys.PubKey {
    val builder = Keys.PubKey.newBuilder()
    builder.setKey(ByteString.copyFrom(obj.key))
    return builder.build()
  }
}

public object PrivKeyMapper : ProtobufTypeMapper<PrivKey, Keys.PrivKey> {
  public override val descriptor: Descriptors.Descriptor = Keys.PrivKey.getDescriptor()

  public override val parser: Parser<Keys.PrivKey> = Keys.PrivKey.parser()

  public override fun convert(obj: Keys.PrivKey): PrivKey = PrivKey(
  	key = obj.key.toByteArray(),
  )

  public override fun convert(obj: PrivKey): Keys.PrivKey {
    val builder = Keys.PrivKey.newBuilder()
    builder.setKey(ByteString.copyFrom(obj.key))
    return builder.build()
  }
}
