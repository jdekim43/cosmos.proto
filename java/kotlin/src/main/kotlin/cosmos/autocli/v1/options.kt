// Transform from cosmos/autocli/v1/options.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.autocli.v1

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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

@Serializable(with = ModuleOptions.KotlinxSerializer::class)
@SerialName(value = "cosmos.autocli.v1.ModuleOptions")
public data class ModuleOptions(
  @ProtobufIndex(index = 1)
  public val tx: ServiceCommandDescriptor,
  @ProtobufIndex(index = 2)
  public val query: ServiceCommandDescriptor,
) {
  public object KotlinxSerializer : KSerializer<ModuleOptions> {
    private val delegator: KSerializer<ModuleOptions> = ModuleOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ModuleOptions): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ModuleOptionsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ModuleOptions {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleOptionsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ServiceCommandDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.autocli.v1.ServiceCommandDescriptor")
public data class ServiceCommandDescriptor(
  @ProtobufIndex(index = 1)
  public val service: String,
  @ProtobufIndex(index = 2)
  public val rpcCommandOptions: List<RpcCommandOptions>,
  @ProtobufIndex(index = 3)
  public val subCommands: Map<String, ServiceCommandDescriptor>,
) {
  public object KotlinxSerializer : KSerializer<ServiceCommandDescriptor> {
    private val delegator: KSerializer<ServiceCommandDescriptor> =
        ServiceCommandDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ServiceCommandDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ServiceCommandDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ServiceCommandDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return ServiceCommandDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RpcCommandOptions.KotlinxSerializer::class)
@SerialName(value = "cosmos.autocli.v1.RpcCommandOptions")
public data class RpcCommandOptions(
  @ProtobufIndex(index = 1)
  public val rpcMethod: String,
  @ProtobufIndex(index = 2)
  public val use: String,
  @ProtobufIndex(index = 3)
  public val long: String,
  @ProtobufIndex(index = 4)
  public val short: String,
  @ProtobufIndex(index = 5)
  public val example: String,
  @ProtobufIndex(index = 6)
  public val alias: List<String>,
  @ProtobufIndex(index = 7)
  public val suggestFor: List<String>,
  @ProtobufIndex(index = 8)
  public val deprecated: String,
  @ProtobufIndex(index = 9)
  public val version: String,
  @ProtobufIndex(index = 10)
  public val flagOptions: Map<String, FlagOptions>,
  @ProtobufIndex(index = 11)
  public val positionalArgs: List<PositionalArgDescriptor>,
  @ProtobufIndex(index = 12)
  public val skip: Boolean,
) {
  public object KotlinxSerializer : KSerializer<RpcCommandOptions> {
    private val delegator: KSerializer<RpcCommandOptions> = RpcCommandOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RpcCommandOptions): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(RpcCommandOptionsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RpcCommandOptions {
      if (decoder is ProtobufMapperDecoder) {
        return RpcCommandOptionsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FlagOptions.KotlinxSerializer::class)
@SerialName(value = "cosmos.autocli.v1.FlagOptions")
public data class FlagOptions(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val shorthand: String,
  @ProtobufIndex(index = 3)
  public val usage: String,
  @ProtobufIndex(index = 4)
  public val defaultValue: String,
  @ProtobufIndex(index = 5)
  public val noOptDefaultValue: String,
  @ProtobufIndex(index = 6)
  public val deprecated: String,
  @ProtobufIndex(index = 7)
  public val shorthandDeprecated: String,
  @ProtobufIndex(index = 8)
  public val hidden: Boolean,
) {
  public object KotlinxSerializer : KSerializer<FlagOptions> {
    private val delegator: KSerializer<FlagOptions> = FlagOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FlagOptions): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(FlagOptionsMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FlagOptions {
      if (decoder is ProtobufMapperDecoder) {
        return FlagOptionsMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PositionalArgDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.autocli.v1.PositionalArgDescriptor")
public data class PositionalArgDescriptor(
  @ProtobufIndex(index = 1)
  public val protoField: String,
  @ProtobufIndex(index = 2)
  public val varargs: Boolean,
) {
  public object KotlinxSerializer : KSerializer<PositionalArgDescriptor> {
    private val delegator: KSerializer<PositionalArgDescriptor> =
        PositionalArgDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PositionalArgDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(PositionalArgDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PositionalArgDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return PositionalArgDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
