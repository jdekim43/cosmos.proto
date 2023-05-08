// Transform from cosmos/upgrade/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.upgrade.v1beta1

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

@Serializable(with = MsgSoftwareUpgrade.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.MsgSoftwareUpgrade")
public data class MsgSoftwareUpgrade(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val plan: Plan,
) {
  public object KotlinxSerializer : KSerializer<MsgSoftwareUpgrade> {
    private val delegator: KSerializer<MsgSoftwareUpgrade> = MsgSoftwareUpgrade.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSoftwareUpgrade): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgSoftwareUpgradeMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSoftwareUpgrade {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSoftwareUpgradeMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSoftwareUpgradeResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.MsgSoftwareUpgradeResponse")
public class MsgSoftwareUpgradeResponse() {
  public object KotlinxSerializer : KSerializer<MsgSoftwareUpgradeResponse> {
    private val delegator: KSerializer<MsgSoftwareUpgradeResponse> =
        MsgSoftwareUpgradeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSoftwareUpgradeResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgSoftwareUpgradeResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSoftwareUpgradeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSoftwareUpgradeResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelUpgrade.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.MsgCancelUpgrade")
public data class MsgCancelUpgrade(
  @ProtobufIndex(index = 1)
  public val authority: String,
) {
  public object KotlinxSerializer : KSerializer<MsgCancelUpgrade> {
    private val delegator: KSerializer<MsgCancelUpgrade> = MsgCancelUpgrade.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelUpgrade): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgCancelUpgradeMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelUpgrade {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelUpgradeMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelUpgradeResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.upgrade.v1beta1.MsgCancelUpgradeResponse")
public class MsgCancelUpgradeResponse() {
  public object KotlinxSerializer : KSerializer<MsgCancelUpgradeResponse> {
    private val delegator: KSerializer<MsgCancelUpgradeResponse> =
        MsgCancelUpgradeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelUpgradeResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgCancelUpgradeResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelUpgradeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelUpgradeResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
