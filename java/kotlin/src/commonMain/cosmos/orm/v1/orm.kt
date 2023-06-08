// Transform from cosmos/orm/v1/orm.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.2.2")

package cosmos.orm.v1

import kotlin.Boolean
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
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufConverterEncoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder

@Serializable(with = TableDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.orm.v1.TableDescriptor")
public data class TableDescriptor(
  @ProtobufIndex(index = 1)
  public val primaryKey: PrimaryKeyDescriptor,
  @ProtobufIndex(index = 2)
  public val index: List<SecondaryIndexDescriptor>,
  @ProtobufIndex(index = 3)
  public val id: UInt,
) {
  public object KotlinxSerializer : KSerializer<TableDescriptor> {
    private val delegator: KSerializer<TableDescriptor> = TableDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TableDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TableDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TableDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return TableDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PrimaryKeyDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.orm.v1.PrimaryKeyDescriptor")
public data class PrimaryKeyDescriptor(
  @ProtobufIndex(index = 1)
  public val fields: String,
  @ProtobufIndex(index = 2)
  public val autoIncrement: Boolean,
) {
  public object KotlinxSerializer : KSerializer<PrimaryKeyDescriptor> {
    private val delegator: KSerializer<PrimaryKeyDescriptor> = PrimaryKeyDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PrimaryKeyDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PrimaryKeyDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PrimaryKeyDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return PrimaryKeyDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SecondaryIndexDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.orm.v1.SecondaryIndexDescriptor")
public data class SecondaryIndexDescriptor(
  @ProtobufIndex(index = 1)
  public val fields: String,
  @ProtobufIndex(index = 2)
  public val id: UInt,
  @ProtobufIndex(index = 3)
  public val unique: Boolean,
) {
  public object KotlinxSerializer : KSerializer<SecondaryIndexDescriptor> {
    private val delegator: KSerializer<SecondaryIndexDescriptor> =
        SecondaryIndexDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SecondaryIndexDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SecondaryIndexDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SecondaryIndexDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return SecondaryIndexDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SingletonDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.orm.v1.SingletonDescriptor")
public data class SingletonDescriptor(
  @ProtobufIndex(index = 1)
  public val id: UInt,
) {
  public object KotlinxSerializer : KSerializer<SingletonDescriptor> {
    private val delegator: KSerializer<SingletonDescriptor> = SingletonDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SingletonDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SingletonDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SingletonDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return SingletonDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
