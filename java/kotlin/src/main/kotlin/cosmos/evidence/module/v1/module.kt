// Transform from cosmos/evidence/module/v1/module.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.evidence.module.v1

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperEncoder

@Serializable(with = Module.KotlinxSerializer::class)
@SerialName(value = "cosmos.evidence.module.v1.Module")
public class Module() {
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