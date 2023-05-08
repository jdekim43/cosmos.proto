// Transform from cosmos/bank/v1beta1/bank.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.bank.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.ReplaceWith
import kotlin.String
import kotlin.UInt
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

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.Params")
public data class Params(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val sendEnabled: List<SendEnabled>,
  @ProtobufIndex(index = 2)
  public val defaultSendEnabled: Boolean,
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

@Serializable(with = SendEnabled.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.SendEnabled")
public data class SendEnabled(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val enabled: Boolean,
) {
  public object KotlinxSerializer : KSerializer<SendEnabled> {
    private val delegator: KSerializer<SendEnabled> = SendEnabled.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SendEnabled): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(SendEnabledMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SendEnabled {
      if (decoder is ProtobufMapperDecoder) {
        return SendEnabledMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Input.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.Input")
public data class Input(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val coins: List<Coin>,
) {
  public object KotlinxSerializer : KSerializer<Input> {
    private val delegator: KSerializer<Input> = Input.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Input): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(InputMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Input {
      if (decoder is ProtobufMapperDecoder) {
        return InputMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Output.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.Output")
public data class Output(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val coins: List<Coin>,
) {
  public object KotlinxSerializer : KSerializer<Output> {
    private val delegator: KSerializer<Output> = Output.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Output): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(OutputMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Output {
      if (decoder is ProtobufMapperDecoder) {
        return OutputMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Supply.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.Supply")
public data class Supply(
  @ProtobufIndex(index = 1)
  public val total: List<Coin>,
) {
  public object KotlinxSerializer : KSerializer<Supply> {
    private val delegator: KSerializer<Supply> = Supply.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Supply): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(SupplyMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Supply {
      if (decoder is ProtobufMapperDecoder) {
        return SupplyMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DenomUnit.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.DenomUnit")
public data class DenomUnit(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val exponent: UInt,
  @ProtobufIndex(index = 3)
  public val aliases: List<String>,
) {
  public object KotlinxSerializer : KSerializer<DenomUnit> {
    private val delegator: KSerializer<DenomUnit> = DenomUnit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DenomUnit): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(DenomUnitMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DenomUnit {
      if (decoder is ProtobufMapperDecoder) {
        return DenomUnitMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Metadata.KotlinxSerializer::class)
@SerialName(value = "cosmos.bank.v1beta1.Metadata")
public data class Metadata(
  @ProtobufIndex(index = 1)
  public val description: String,
  @ProtobufIndex(index = 2)
  public val denomUnits: List<DenomUnit>,
  @ProtobufIndex(index = 3)
  public val base: String,
  @ProtobufIndex(index = 4)
  public val display: String,
  @ProtobufIndex(index = 5)
  public val name: String,
  @ProtobufIndex(index = 6)
  public val symbol: String,
  @ProtobufIndex(index = 7)
  public val uri: String,
  @ProtobufIndex(index = 8)
  public val uriHash: String,
) {
  public object KotlinxSerializer : KSerializer<Metadata> {
    private val delegator: KSerializer<Metadata> = Metadata.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Metadata): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MetadataMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Metadata {
      if (decoder is ProtobufMapperDecoder) {
        return MetadataMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
