// Transform from cosmos/group/v1/events.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.group.v1

import kotlin.String
import kotlin.ULong
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

@Serializable(with = EventCreateGroup.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.EventCreateGroup")
public data class EventCreateGroup(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
) {
  public object KotlinxSerializer : KSerializer<EventCreateGroup> {
    private val delegator: KSerializer<EventCreateGroup> = EventCreateGroup.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventCreateGroup): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventCreateGroupMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventCreateGroup {
      if (decoder is ProtobufMapperDecoder) {
        return EventCreateGroupMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventUpdateGroup.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.EventUpdateGroup")
public data class EventUpdateGroup(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
) {
  public object KotlinxSerializer : KSerializer<EventUpdateGroup> {
    private val delegator: KSerializer<EventUpdateGroup> = EventUpdateGroup.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventUpdateGroup): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventUpdateGroupMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventUpdateGroup {
      if (decoder is ProtobufMapperDecoder) {
        return EventUpdateGroupMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventCreateGroupPolicy.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.EventCreateGroupPolicy")
public data class EventCreateGroupPolicy(
  @ProtobufIndex(index = 1)
  public val address: String,
) {
  public object KotlinxSerializer : KSerializer<EventCreateGroupPolicy> {
    private val delegator: KSerializer<EventCreateGroupPolicy> = EventCreateGroupPolicy.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventCreateGroupPolicy): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventCreateGroupPolicyMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventCreateGroupPolicy {
      if (decoder is ProtobufMapperDecoder) {
        return EventCreateGroupPolicyMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventUpdateGroupPolicy.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.EventUpdateGroupPolicy")
public data class EventUpdateGroupPolicy(
  @ProtobufIndex(index = 1)
  public val address: String,
) {
  public object KotlinxSerializer : KSerializer<EventUpdateGroupPolicy> {
    private val delegator: KSerializer<EventUpdateGroupPolicy> = EventUpdateGroupPolicy.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventUpdateGroupPolicy): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventUpdateGroupPolicyMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventUpdateGroupPolicy {
      if (decoder is ProtobufMapperDecoder) {
        return EventUpdateGroupPolicyMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventSubmitProposal.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.EventSubmitProposal")
public data class EventSubmitProposal(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) {
  public object KotlinxSerializer : KSerializer<EventSubmitProposal> {
    private val delegator: KSerializer<EventSubmitProposal> = EventSubmitProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSubmitProposal): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventSubmitProposalMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSubmitProposal {
      if (decoder is ProtobufMapperDecoder) {
        return EventSubmitProposalMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventWithdrawProposal.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.EventWithdrawProposal")
public data class EventWithdrawProposal(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) {
  public object KotlinxSerializer : KSerializer<EventWithdrawProposal> {
    private val delegator: KSerializer<EventWithdrawProposal> = EventWithdrawProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventWithdrawProposal): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventWithdrawProposalMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventWithdrawProposal {
      if (decoder is ProtobufMapperDecoder) {
        return EventWithdrawProposalMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventVote.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.EventVote")
public data class EventVote(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) {
  public object KotlinxSerializer : KSerializer<EventVote> {
    private val delegator: KSerializer<EventVote> = EventVote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventVote): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventVoteMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventVote {
      if (decoder is ProtobufMapperDecoder) {
        return EventVoteMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventExec.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.EventExec")
public data class EventExec(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val result: ProposalExecutorResult,
  @ProtobufIndex(index = 3)
  public val logs: String,
) {
  public object KotlinxSerializer : KSerializer<EventExec> {
    private val delegator: KSerializer<EventExec> = EventExec.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventExec): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventExecMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventExec {
      if (decoder is ProtobufMapperDecoder) {
        return EventExecMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventLeaveGroup.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.EventLeaveGroup")
public data class EventLeaveGroup(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
  @ProtobufIndex(index = 2)
  public val address: String,
) {
  public object KotlinxSerializer : KSerializer<EventLeaveGroup> {
    private val delegator: KSerializer<EventLeaveGroup> = EventLeaveGroup.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventLeaveGroup): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(EventLeaveGroupMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventLeaveGroup {
      if (decoder is ProtobufMapperDecoder) {
        return EventLeaveGroupMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
