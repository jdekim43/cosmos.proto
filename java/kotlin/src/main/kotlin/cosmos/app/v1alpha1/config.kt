// Transform from cosmos/app/v1alpha1/config.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.app.v1alpha1

import google.protobuf.Any
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

@Serializable(with = Config.KotlinxSerializer::class)
@SerialName(value = "cosmos.app.v1alpha1.Config")
public data class Config(
  @ProtobufIndex(index = 1)
  public val modules: List<ModuleConfig>,
  @ProtobufIndex(index = 2)
  public val golangBindings: List<GolangBinding>,
) {
  public object KotlinxSerializer : KSerializer<Config> {
    private val delegator: KSerializer<Config> = Config.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Config): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ConfigMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Config {
      if (decoder is ProtobufMapperDecoder) {
        return ConfigMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ModuleConfig.KotlinxSerializer::class)
@SerialName(value = "cosmos.app.v1alpha1.ModuleConfig")
public data class ModuleConfig(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val config: Any,
  @ProtobufIndex(index = 3)
  public val golangBindings: List<GolangBinding>,
) {
  public object KotlinxSerializer : KSerializer<ModuleConfig> {
    private val delegator: KSerializer<ModuleConfig> = ModuleConfig.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ModuleConfig): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ModuleConfigMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ModuleConfig {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleConfigMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GolangBinding.KotlinxSerializer::class)
@SerialName(value = "cosmos.app.v1alpha1.GolangBinding")
public data class GolangBinding(
  @ProtobufIndex(index = 1)
  public val interfaceType: String,
  @ProtobufIndex(index = 2)
  public val implementation: String,
) {
  public object KotlinxSerializer : KSerializer<GolangBinding> {
    private val delegator: KSerializer<GolangBinding> = GolangBinding.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GolangBinding): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GolangBindingMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GolangBinding {
      if (decoder is ProtobufMapperDecoder) {
        return GolangBindingMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
