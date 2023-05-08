// Transform from cosmos/slashing/v1beta1/slashing.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.slashing.v1beta1

import google.protobuf.Duration
import google.protobuf.Timestamp
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Long
import kotlin.String
import kotlin.Unit
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

@Serializable(with = ValidatorSigningInfo.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.ValidatorSigningInfo")
public data class ValidatorSigningInfo(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val startHeight: Long,
  @ProtobufIndex(index = 3)
  public val indexOffset: Long,
  @ProtobufIndex(index = 4)
  public val jailedUntil: Timestamp,
  @ProtobufIndex(index = 5)
  public val tombstoned: Boolean,
  @ProtobufIndex(index = 6)
  public val missedBlocksCounter: Long,
) {
  public object KotlinxSerializer : KSerializer<ValidatorSigningInfo> {
    private val delegator: KSerializer<ValidatorSigningInfo> = ValidatorSigningInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorSigningInfo): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ValidatorSigningInfoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorSigningInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorSigningInfoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = "cosmos.slashing.v1beta1.Params")
public data class Params(
  @ProtobufIndex(index = 1)
  public val signedBlocksWindow: Long,
  @ProtobufIndex(index = 2)
  public val minSignedPerWindow: ByteArray,
  @ProtobufIndex(index = 3)
  public val downtimeJailDuration: Duration,
  @ProtobufIndex(index = 4)
  public val slashFractionDoubleSign: ByteArray,
  @ProtobufIndex(index = 5)
  public val slashFractionDowntime: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<Params> {
    private val delegator: KSerializer<Params> = Params.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Params): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ParamsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Params {
      if (decoder is ProtobufMapperDecoder) {
        return ParamsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
