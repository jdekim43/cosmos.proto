// Transform from cosmos/auth/module/v1/module.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.auth.module.v1

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
@SerialName(value = "cosmos.auth.module.v1.Module")
public data class Module(
  @ProtobufIndex(index = 1)
  public val bech32Prefix: String,
  @ProtobufIndex(index = 2)
  public val moduleAccountPermissions: List<ModuleAccountPermission>,
  @ProtobufIndex(index = 3)
  public val authority: String,
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

@Serializable(with = ModuleAccountPermission.KotlinxSerializer::class)
@SerialName(value = "cosmos.auth.module.v1.ModuleAccountPermission")
public data class ModuleAccountPermission(
  @ProtobufIndex(index = 1)
  public val account: String,
  @ProtobufIndex(index = 2)
  public val permissions: List<String>,
) {
  public object KotlinxSerializer : KSerializer<ModuleAccountPermission> {
    private val delegator: KSerializer<ModuleAccountPermission> =
        ModuleAccountPermission.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ModuleAccountPermission): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ModuleAccountPermissionMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ModuleAccountPermission {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleAccountPermissionMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
