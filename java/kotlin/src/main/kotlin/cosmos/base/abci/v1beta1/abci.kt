// Transform from cosmos/base/abci/v1beta1/abci.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.base.abci.v1beta1

import google.protobuf.Any
import kotlin.ByteArray
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Long
import kotlin.ReplaceWith
import kotlin.String
import kotlin.UInt
import kotlin.ULong
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
import tendermint.abci.Event

@Serializable(with = TxResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.abci.v1beta1.TxResponse")
public data class TxResponse(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val txhash: String,
  @ProtobufIndex(index = 3)
  public val codespace: String,
  @ProtobufIndex(index = 4)
  public val code: UInt,
  @ProtobufIndex(index = 5)
  public val `data`: String,
  @ProtobufIndex(index = 6)
  public val rawLog: String,
  @ProtobufIndex(index = 7)
  public val logs: List<ABCIMessageLog>,
  @ProtobufIndex(index = 8)
  public val info: String,
  @ProtobufIndex(index = 9)
  public val gasWanted: Long,
  @ProtobufIndex(index = 10)
  public val gasUsed: Long,
  @ProtobufIndex(index = 11)
  public val tx: Any,
  @ProtobufIndex(index = 12)
  public val timestamp: String,
  @ProtobufIndex(index = 13)
  public val events: List<Event>,
) {
  public object KotlinxSerializer : KSerializer<TxResponse> {
    private val delegator: KSerializer<TxResponse> = TxResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(TxResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxResponse {
      if (decoder is ProtobufMapperDecoder) {
        return TxResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ABCIMessageLog.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.abci.v1beta1.ABCIMessageLog")
public data class ABCIMessageLog(
  @ProtobufIndex(index = 1)
  public val msgIndex: UInt,
  @ProtobufIndex(index = 2)
  public val log: String,
  @ProtobufIndex(index = 3)
  public val events: List<StringEvent>,
) {
  public object KotlinxSerializer : KSerializer<ABCIMessageLog> {
    private val delegator: KSerializer<ABCIMessageLog> = ABCIMessageLog.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ABCIMessageLog): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ABCIMessageLogMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ABCIMessageLog {
      if (decoder is ProtobufMapperDecoder) {
        return ABCIMessageLogMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = StringEvent.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.abci.v1beta1.StringEvent")
public data class StringEvent(
  @ProtobufIndex(index = 1)
  public val type: String,
  @ProtobufIndex(index = 2)
  public val attributes: List<Attribute>,
) {
  public object KotlinxSerializer : KSerializer<StringEvent> {
    private val delegator: KSerializer<StringEvent> = StringEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: StringEvent): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(StringEventMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): StringEvent {
      if (decoder is ProtobufMapperDecoder) {
        return StringEventMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Attribute.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.abci.v1beta1.Attribute")
public data class Attribute(
  @ProtobufIndex(index = 1)
  public val key: String,
  @ProtobufIndex(index = 2)
  public val `value`: String,
) {
  public object KotlinxSerializer : KSerializer<Attribute> {
    private val delegator: KSerializer<Attribute> = Attribute.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Attribute): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(AttributeMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Attribute {
      if (decoder is ProtobufMapperDecoder) {
        return AttributeMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GasInfo.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.abci.v1beta1.GasInfo")
public data class GasInfo(
  @ProtobufIndex(index = 1)
  public val gasWanted: ULong,
  @ProtobufIndex(index = 2)
  public val gasUsed: ULong,
) {
  public object KotlinxSerializer : KSerializer<GasInfo> {
    private val delegator: KSerializer<GasInfo> = GasInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GasInfo): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GasInfoMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GasInfo {
      if (decoder is ProtobufMapperDecoder) {
        return GasInfoMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Result.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.abci.v1beta1.Result")
public data class Result(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 2)
  public val log: String,
  @ProtobufIndex(index = 3)
  public val events: List<Event>,
  @ProtobufIndex(index = 4)
  public val msgResponses: List<Any>,
) {
  public object KotlinxSerializer : KSerializer<Result> {
    private val delegator: KSerializer<Result> = Result.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Result): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(ResultMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Result {
      if (decoder is ProtobufMapperDecoder) {
        return ResultMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SimulationResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.abci.v1beta1.SimulationResponse")
public data class SimulationResponse(
  @ProtobufIndex(index = 1)
  public val gasInfo: GasInfo,
  @ProtobufIndex(index = 2)
  public val result: Result,
) {
  public object KotlinxSerializer : KSerializer<SimulationResponse> {
    private val delegator: KSerializer<SimulationResponse> = SimulationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SimulationResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(SimulationResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SimulationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return SimulationResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgData.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.abci.v1beta1.MsgData")
public data class MsgData(
  @ProtobufIndex(index = 1)
  public val msgType: String,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
) {
  public object KotlinxSerializer : KSerializer<MsgData> {
    private val delegator: KSerializer<MsgData> = MsgData.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgData): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgDataMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgData {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDataMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxMsgData.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.abci.v1beta1.TxMsgData")
public data class TxMsgData(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val `data`: List<MsgData>,
  @ProtobufIndex(index = 2)
  public val msgResponses: List<Any>,
) {
  public object KotlinxSerializer : KSerializer<TxMsgData> {
    private val delegator: KSerializer<TxMsgData> = TxMsgData.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxMsgData): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(TxMsgDataMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxMsgData {
      if (decoder is ProtobufMapperDecoder) {
        return TxMsgDataMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SearchTxsResult.KotlinxSerializer::class)
@SerialName(value = "cosmos.base.abci.v1beta1.SearchTxsResult")
public data class SearchTxsResult(
  @ProtobufIndex(index = 1)
  public val totalCount: ULong,
  @ProtobufIndex(index = 2)
  public val count: ULong,
  @ProtobufIndex(index = 3)
  public val pageNumber: ULong,
  @ProtobufIndex(index = 4)
  public val pageTotal: ULong,
  @ProtobufIndex(index = 5)
  public val limit: ULong,
  @ProtobufIndex(index = 6)
  public val txs: List<TxResponse>,
) {
  public object KotlinxSerializer : KSerializer<SearchTxsResult> {
    private val delegator: KSerializer<SearchTxsResult> = SearchTxsResult.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SearchTxsResult): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(SearchTxsResultMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SearchTxsResult {
      if (decoder is ProtobufMapperDecoder) {
        return SearchTxsResultMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
