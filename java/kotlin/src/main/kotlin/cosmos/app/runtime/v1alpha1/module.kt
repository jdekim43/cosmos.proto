// Transform from cosmos/app/runtime/v1alpha1/module.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.app.runtime.v1alpha1

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

@Serializable(with = Module.KotlinxSerializer::class)
@SerialName(value = "cosmos.app.runtime.v1alpha1.Module")
public data class Module(
  @ProtobufIndex(index = 1)
  public val appName: String,
  @ProtobufIndex(index = 2)
  public val beginBlockers: List<String>,
  @ProtobufIndex(index = 3)
  public val endBlockers: List<String>,
  @ProtobufIndex(index = 4)
  public val initGenesis: List<String>,
  @ProtobufIndex(index = 5)
  public val exportGenesis: List<String>,
  @ProtobufIndex(index = 6)
  public val overrideStoreKeys: List<StoreKeyConfig>,
) {
  public object KotlinxSerializer : KSerializer<Module> {
    private val delegator: KSerializer<Module> = Module.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Module): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ModuleMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Module {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = StoreKeyConfig.KotlinxSerializer::class)
@SerialName(value = "cosmos.app.runtime.v1alpha1.StoreKeyConfig")
public data class StoreKeyConfig(
  @ProtobufIndex(index = 1)
  public val moduleName: String,
  @ProtobufIndex(index = 2)
  public val kvStoreKey: String,
) {
  public object KotlinxSerializer : KSerializer<StoreKeyConfig> {
    private val delegator: KSerializer<StoreKeyConfig> = StoreKeyConfig.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: StoreKeyConfig): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(StoreKeyConfigMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): StoreKeyConfig {
      if (decoder is ProtobufMapperDecoder) {
        return StoreKeyConfigMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
