// Transform from cosmos/bank/v1beta1/authz.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.bank.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperEncoder

@Serializable(with = SendAuthorization.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.SendAuthorization")
public data class SendAuthorization(
  @ProtobufIndex(index = 1)
  public val spendLimit: List<Coin>,
  @ProtobufIndex(index = 2)
  public val allowList: List<String>,
) {
  public object KotlinxSerializer : KSerializer<SendAuthorization> {
    private val delegator: KSerializer<SendAuthorization> = SendAuthorization.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SendAuthorization): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(SendAuthorizationMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SendAuthorization {
      if (decoder is ProtobufMapperDecoder) {
        return SendAuthorizationMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}