// Transform from cosmos/base/reflection/v2alpha1/reflection.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.base.reflection.v2alpha1

import kotlin.Boolean
import kotlin.Int
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

@Serializable(with = AppDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.AppDescriptor")
public data class AppDescriptor(
  @ProtobufIndex(index = 1)
  public val authn: AuthnDescriptor,
  @ProtobufIndex(index = 2)
  public val chain: ChainDescriptor,
  @ProtobufIndex(index = 3)
  public val codec: CodecDescriptor,
  @ProtobufIndex(index = 4)
  public val configuration: ConfigurationDescriptor,
  @ProtobufIndex(index = 5)
  public val queryServices: QueryServicesDescriptor,
  @ProtobufIndex(index = 6)
  public val tx: TxDescriptor,
) {
  public object KotlinxSerializer : KSerializer<AppDescriptor> {
    private val delegator: KSerializer<AppDescriptor> = AppDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AppDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(AppDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AppDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return AppDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.TxDescriptor")
public data class TxDescriptor(
  @ProtobufIndex(index = 1)
  public val fullname: String,
  @ProtobufIndex(index = 2)
  public val msgs: List<MsgDescriptor>,
) {
  public object KotlinxSerializer : KSerializer<TxDescriptor> {
    private val delegator: KSerializer<TxDescriptor> = TxDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(TxDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return TxDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AuthnDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.AuthnDescriptor")
public data class AuthnDescriptor(
  @ProtobufIndex(index = 1)
  public val signModes: List<SigningModeDescriptor>,
) {
  public object KotlinxSerializer : KSerializer<AuthnDescriptor> {
    private val delegator: KSerializer<AuthnDescriptor> = AuthnDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AuthnDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(AuthnDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AuthnDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return AuthnDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SigningModeDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.SigningModeDescriptor")
public data class SigningModeDescriptor(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val number: Int,
  @ProtobufIndex(index = 3)
  public val authnInfoProviderMethodFullname: String,
) {
  public object KotlinxSerializer : KSerializer<SigningModeDescriptor> {
    private val delegator: KSerializer<SigningModeDescriptor> = SigningModeDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SigningModeDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(SigningModeDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SigningModeDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return SigningModeDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ChainDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.ChainDescriptor")
public data class ChainDescriptor(
  @ProtobufIndex(index = 1)
  public val id: String,
) {
  public object KotlinxSerializer : KSerializer<ChainDescriptor> {
    private val delegator: KSerializer<ChainDescriptor> = ChainDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ChainDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ChainDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ChainDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return ChainDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CodecDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.CodecDescriptor")
public data class CodecDescriptor(
  @ProtobufIndex(index = 1)
  public val interfaces: List<InterfaceDescriptor>,
) {
  public object KotlinxSerializer : KSerializer<CodecDescriptor> {
    private val delegator: KSerializer<CodecDescriptor> = CodecDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CodecDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(CodecDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CodecDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return CodecDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = InterfaceDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.InterfaceDescriptor")
public data class InterfaceDescriptor(
  @ProtobufIndex(index = 1)
  public val fullname: String,
  @ProtobufIndex(index = 2)
  public val interfaceAcceptingMessages: List<InterfaceAcceptingMessageDescriptor>,
  @ProtobufIndex(index = 3)
  public val interfaceImplementers: List<InterfaceImplementerDescriptor>,
) {
  public object KotlinxSerializer : KSerializer<InterfaceDescriptor> {
    private val delegator: KSerializer<InterfaceDescriptor> = InterfaceDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: InterfaceDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(InterfaceDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): InterfaceDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return InterfaceDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = InterfaceImplementerDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptor")
public data class InterfaceImplementerDescriptor(
  @ProtobufIndex(index = 1)
  public val fullname: String,
  @ProtobufIndex(index = 2)
  public val typeUrl: String,
) {
  public object KotlinxSerializer : KSerializer<InterfaceImplementerDescriptor> {
    private val delegator: KSerializer<InterfaceImplementerDescriptor> =
        InterfaceImplementerDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: InterfaceImplementerDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(InterfaceImplementerDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): InterfaceImplementerDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return InterfaceImplementerDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = InterfaceAcceptingMessageDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.InterfaceAcceptingMessageDescriptor")
public data class InterfaceAcceptingMessageDescriptor(
  @ProtobufIndex(index = 1)
  public val fullname: String,
  @ProtobufIndex(index = 2)
  public val fieldDescriptorNames: List<String>,
) {
  public object KotlinxSerializer : KSerializer<InterfaceAcceptingMessageDescriptor> {
    private val delegator: KSerializer<InterfaceAcceptingMessageDescriptor> =
        InterfaceAcceptingMessageDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: InterfaceAcceptingMessageDescriptor):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(InterfaceAcceptingMessageDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): InterfaceAcceptingMessageDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return InterfaceAcceptingMessageDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ConfigurationDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.ConfigurationDescriptor")
public data class ConfigurationDescriptor(
  @ProtobufIndex(index = 1)
  public val bech32AccountAddressPrefix: String,
) {
  public object KotlinxSerializer : KSerializer<ConfigurationDescriptor> {
    private val delegator: KSerializer<ConfigurationDescriptor> =
        ConfigurationDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ConfigurationDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ConfigurationDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ConfigurationDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return ConfigurationDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.MsgDescriptor")
public data class MsgDescriptor(
  @ProtobufIndex(index = 1)
  public val msgTypeUrl: String,
) {
  public object KotlinxSerializer : KSerializer<MsgDescriptor> {
    private val delegator: KSerializer<MsgDescriptor> = MsgDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetAuthnDescriptorRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.GetAuthnDescriptorRequest")
public class GetAuthnDescriptorRequest() {
  public object KotlinxSerializer : KSerializer<GetAuthnDescriptorRequest> {
    private val delegator: KSerializer<GetAuthnDescriptorRequest> =
        GetAuthnDescriptorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetAuthnDescriptorRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetAuthnDescriptorRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetAuthnDescriptorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetAuthnDescriptorRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetAuthnDescriptorResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.GetAuthnDescriptorResponse")
public data class GetAuthnDescriptorResponse(
  @ProtobufIndex(index = 1)
  public val authn: AuthnDescriptor,
) {
  public object KotlinxSerializer : KSerializer<GetAuthnDescriptorResponse> {
    private val delegator: KSerializer<GetAuthnDescriptorResponse> =
        GetAuthnDescriptorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetAuthnDescriptorResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetAuthnDescriptorResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetAuthnDescriptorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetAuthnDescriptorResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetChainDescriptorRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.GetChainDescriptorRequest")
public class GetChainDescriptorRequest() {
  public object KotlinxSerializer : KSerializer<GetChainDescriptorRequest> {
    private val delegator: KSerializer<GetChainDescriptorRequest> =
        GetChainDescriptorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetChainDescriptorRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetChainDescriptorRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetChainDescriptorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetChainDescriptorRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetChainDescriptorResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.GetChainDescriptorResponse")
public data class GetChainDescriptorResponse(
  @ProtobufIndex(index = 1)
  public val chain: ChainDescriptor,
) {
  public object KotlinxSerializer : KSerializer<GetChainDescriptorResponse> {
    private val delegator: KSerializer<GetChainDescriptorResponse> =
        GetChainDescriptorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetChainDescriptorResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetChainDescriptorResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetChainDescriptorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetChainDescriptorResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetCodecDescriptorRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.GetCodecDescriptorRequest")
public class GetCodecDescriptorRequest() {
  public object KotlinxSerializer : KSerializer<GetCodecDescriptorRequest> {
    private val delegator: KSerializer<GetCodecDescriptorRequest> =
        GetCodecDescriptorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetCodecDescriptorRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetCodecDescriptorRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetCodecDescriptorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetCodecDescriptorRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetCodecDescriptorResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.GetCodecDescriptorResponse")
public data class GetCodecDescriptorResponse(
  @ProtobufIndex(index = 1)
  public val codec: CodecDescriptor,
) {
  public object KotlinxSerializer : KSerializer<GetCodecDescriptorResponse> {
    private val delegator: KSerializer<GetCodecDescriptorResponse> =
        GetCodecDescriptorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetCodecDescriptorResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetCodecDescriptorResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetCodecDescriptorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetCodecDescriptorResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetConfigurationDescriptorRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.GetConfigurationDescriptorRequest")
public class GetConfigurationDescriptorRequest() {
  public object KotlinxSerializer : KSerializer<GetConfigurationDescriptorRequest> {
    private val delegator: KSerializer<GetConfigurationDescriptorRequest> =
        GetConfigurationDescriptorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetConfigurationDescriptorRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetConfigurationDescriptorRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetConfigurationDescriptorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetConfigurationDescriptorRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetConfigurationDescriptorResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.GetConfigurationDescriptorResponse")
public data class GetConfigurationDescriptorResponse(
  @ProtobufIndex(index = 1)
  public val config: ConfigurationDescriptor,
) {
  public object KotlinxSerializer : KSerializer<GetConfigurationDescriptorResponse> {
    private val delegator: KSerializer<GetConfigurationDescriptorResponse> =
        GetConfigurationDescriptorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetConfigurationDescriptorResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetConfigurationDescriptorResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetConfigurationDescriptorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetConfigurationDescriptorResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetQueryServicesDescriptorRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.GetQueryServicesDescriptorRequest")
public class GetQueryServicesDescriptorRequest() {
  public object KotlinxSerializer : KSerializer<GetQueryServicesDescriptorRequest> {
    private val delegator: KSerializer<GetQueryServicesDescriptorRequest> =
        GetQueryServicesDescriptorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetQueryServicesDescriptorRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetQueryServicesDescriptorRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetQueryServicesDescriptorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetQueryServicesDescriptorRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetQueryServicesDescriptorResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.GetQueryServicesDescriptorResponse")
public data class GetQueryServicesDescriptorResponse(
  @ProtobufIndex(index = 1)
  public val queries: QueryServicesDescriptor,
) {
  public object KotlinxSerializer : KSerializer<GetQueryServicesDescriptorResponse> {
    private val delegator: KSerializer<GetQueryServicesDescriptorResponse> =
        GetQueryServicesDescriptorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetQueryServicesDescriptorResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetQueryServicesDescriptorResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetQueryServicesDescriptorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetQueryServicesDescriptorResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetTxDescriptorRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.GetTxDescriptorRequest")
public class GetTxDescriptorRequest() {
  public object KotlinxSerializer : KSerializer<GetTxDescriptorRequest> {
    private val delegator: KSerializer<GetTxDescriptorRequest> = GetTxDescriptorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetTxDescriptorRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetTxDescriptorRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetTxDescriptorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetTxDescriptorRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetTxDescriptorResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.GetTxDescriptorResponse")
public data class GetTxDescriptorResponse(
  @ProtobufIndex(index = 1)
  public val tx: TxDescriptor,
) {
  public object KotlinxSerializer : KSerializer<GetTxDescriptorResponse> {
    private val delegator: KSerializer<GetTxDescriptorResponse> =
        GetTxDescriptorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetTxDescriptorResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GetTxDescriptorResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetTxDescriptorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetTxDescriptorResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryServicesDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.QueryServicesDescriptor")
public data class QueryServicesDescriptor(
  @ProtobufIndex(index = 1)
  public val queryServices: List<QueryServiceDescriptor>,
) {
  public object KotlinxSerializer : KSerializer<QueryServicesDescriptor> {
    private val delegator: KSerializer<QueryServicesDescriptor> =
        QueryServicesDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryServicesDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryServicesDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryServicesDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return QueryServicesDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryServiceDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.QueryServiceDescriptor")
public data class QueryServiceDescriptor(
  @ProtobufIndex(index = 1)
  public val fullname: String,
  @ProtobufIndex(index = 2)
  public val isModule: Boolean,
  @ProtobufIndex(index = 3)
  public val methods: List<QueryMethodDescriptor>,
) {
  public object KotlinxSerializer : KSerializer<QueryServiceDescriptor> {
    private val delegator: KSerializer<QueryServiceDescriptor> = QueryServiceDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryServiceDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryServiceDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryServiceDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return QueryServiceDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryMethodDescriptor.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.reflection.v2alpha1.QueryMethodDescriptor")
public data class QueryMethodDescriptor(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val fullQueryPath: String,
) {
  public object KotlinxSerializer : KSerializer<QueryMethodDescriptor> {
    private val delegator: KSerializer<QueryMethodDescriptor> = QueryMethodDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryMethodDescriptor): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryMethodDescriptorMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryMethodDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return QueryMethodDescriptorMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
