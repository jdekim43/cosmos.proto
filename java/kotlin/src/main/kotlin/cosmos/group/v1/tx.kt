// Transform from cosmos/group/v1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.group.v1

import google.protobuf.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
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

@Serializable
@SerialName(value = "cosmos.group.v1.Exec")
public enum class Exec(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  EXEC_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  EXEC_TRY(1),
  ;

  public companion object {
    public fun forNumber(number: Int): Exec = Exec.values()
    	.first { it.number == number }
  }
}

@Serializable(with = MsgCreateGroup.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgCreateGroup")
public data class MsgCreateGroup(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val members: List<MemberRequest>,
  @ProtobufIndex(index = 3)
  public val metadata: String,
) {
  public object KotlinxSerializer : KSerializer<MsgCreateGroup> {
    private val delegator: KSerializer<MsgCreateGroup> = MsgCreateGroup.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateGroup): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgCreateGroupMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateGroup {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateGroupMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateGroupResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgCreateGroupResponse")
public data class MsgCreateGroupResponse(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
) {
  public object KotlinxSerializer : KSerializer<MsgCreateGroupResponse> {
    private val delegator: KSerializer<MsgCreateGroupResponse> = MsgCreateGroupResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateGroupResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgCreateGroupResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateGroupResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateGroupResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateGroupMembers.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgUpdateGroupMembers")
public data class MsgUpdateGroupMembers(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val groupId: ULong,
  @ProtobufIndex(index = 3)
  public val memberUpdates: List<MemberRequest>,
) {
  public object KotlinxSerializer : KSerializer<MsgUpdateGroupMembers> {
    private val delegator: KSerializer<MsgUpdateGroupMembers> = MsgUpdateGroupMembers.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateGroupMembers): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateGroupMembersMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateGroupMembers {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateGroupMembersMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateGroupMembersResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgUpdateGroupMembersResponse")
public class MsgUpdateGroupMembersResponse() {
  public object KotlinxSerializer : KSerializer<MsgUpdateGroupMembersResponse> {
    private val delegator: KSerializer<MsgUpdateGroupMembersResponse> =
        MsgUpdateGroupMembersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateGroupMembersResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateGroupMembersResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateGroupMembersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateGroupMembersResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateGroupAdmin.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgUpdateGroupAdmin")
public data class MsgUpdateGroupAdmin(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val groupId: ULong,
  @ProtobufIndex(index = 3)
  public val newAdmin: String,
) {
  public object KotlinxSerializer : KSerializer<MsgUpdateGroupAdmin> {
    private val delegator: KSerializer<MsgUpdateGroupAdmin> = MsgUpdateGroupAdmin.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateGroupAdmin): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateGroupAdminMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateGroupAdmin {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateGroupAdminMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateGroupAdminResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgUpdateGroupAdminResponse")
public class MsgUpdateGroupAdminResponse() {
  public object KotlinxSerializer : KSerializer<MsgUpdateGroupAdminResponse> {
    private val delegator: KSerializer<MsgUpdateGroupAdminResponse> =
        MsgUpdateGroupAdminResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateGroupAdminResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateGroupAdminResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateGroupAdminResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateGroupAdminResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateGroupMetadata.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgUpdateGroupMetadata")
public data class MsgUpdateGroupMetadata(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val groupId: ULong,
  @ProtobufIndex(index = 3)
  public val metadata: String,
) {
  public object KotlinxSerializer : KSerializer<MsgUpdateGroupMetadata> {
    private val delegator: KSerializer<MsgUpdateGroupMetadata> = MsgUpdateGroupMetadata.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateGroupMetadata): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateGroupMetadataMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateGroupMetadata {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateGroupMetadataMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateGroupMetadataResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgUpdateGroupMetadataResponse")
public class MsgUpdateGroupMetadataResponse() {
  public object KotlinxSerializer : KSerializer<MsgUpdateGroupMetadataResponse> {
    private val delegator: KSerializer<MsgUpdateGroupMetadataResponse> =
        MsgUpdateGroupMetadataResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateGroupMetadataResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateGroupMetadataResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateGroupMetadataResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateGroupMetadataResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateGroupPolicy.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgCreateGroupPolicy")
public data class MsgCreateGroupPolicy(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val groupId: ULong,
  @ProtobufIndex(index = 3)
  public val metadata: String,
  @ProtobufIndex(index = 4)
  public val decisionPolicy: Any,
) {
  public object KotlinxSerializer : KSerializer<MsgCreateGroupPolicy> {
    private val delegator: KSerializer<MsgCreateGroupPolicy> = MsgCreateGroupPolicy.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateGroupPolicy): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgCreateGroupPolicyMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateGroupPolicy {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateGroupPolicyMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateGroupPolicyResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgCreateGroupPolicyResponse")
public data class MsgCreateGroupPolicyResponse(
  @ProtobufIndex(index = 1)
  public val address: String,
) {
  public object KotlinxSerializer : KSerializer<MsgCreateGroupPolicyResponse> {
    private val delegator: KSerializer<MsgCreateGroupPolicyResponse> =
        MsgCreateGroupPolicyResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateGroupPolicyResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgCreateGroupPolicyResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateGroupPolicyResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateGroupPolicyResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateGroupPolicyAdmin.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgUpdateGroupPolicyAdmin")
public data class MsgUpdateGroupPolicyAdmin(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val groupPolicyAddress: String,
  @ProtobufIndex(index = 3)
  public val newAdmin: String,
) {
  public object KotlinxSerializer : KSerializer<MsgUpdateGroupPolicyAdmin> {
    private val delegator: KSerializer<MsgUpdateGroupPolicyAdmin> =
        MsgUpdateGroupPolicyAdmin.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateGroupPolicyAdmin): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateGroupPolicyAdminMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateGroupPolicyAdmin {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateGroupPolicyAdminMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateGroupPolicyAdminResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgUpdateGroupPolicyAdminResponse")
public class MsgUpdateGroupPolicyAdminResponse() {
  public object KotlinxSerializer : KSerializer<MsgUpdateGroupPolicyAdminResponse> {
    private val delegator: KSerializer<MsgUpdateGroupPolicyAdminResponse> =
        MsgUpdateGroupPolicyAdminResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateGroupPolicyAdminResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateGroupPolicyAdminResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateGroupPolicyAdminResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateGroupPolicyAdminResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateGroupWithPolicy.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgCreateGroupWithPolicy")
public data class MsgCreateGroupWithPolicy(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val members: List<MemberRequest>,
  @ProtobufIndex(index = 3)
  public val groupMetadata: String,
  @ProtobufIndex(index = 4)
  public val groupPolicyMetadata: String,
  @ProtobufIndex(index = 5)
  public val groupPolicyAsAdmin: Boolean,
  @ProtobufIndex(index = 6)
  public val decisionPolicy: Any,
) {
  public object KotlinxSerializer : KSerializer<MsgCreateGroupWithPolicy> {
    private val delegator: KSerializer<MsgCreateGroupWithPolicy> =
        MsgCreateGroupWithPolicy.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateGroupWithPolicy): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgCreateGroupWithPolicyMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateGroupWithPolicy {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateGroupWithPolicyMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateGroupWithPolicyResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgCreateGroupWithPolicyResponse")
public data class MsgCreateGroupWithPolicyResponse(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
  @ProtobufIndex(index = 2)
  public val groupPolicyAddress: String,
) {
  public object KotlinxSerializer : KSerializer<MsgCreateGroupWithPolicyResponse> {
    private val delegator: KSerializer<MsgCreateGroupWithPolicyResponse> =
        MsgCreateGroupWithPolicyResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateGroupWithPolicyResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgCreateGroupWithPolicyResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateGroupWithPolicyResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateGroupWithPolicyResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateGroupPolicyDecisionPolicy.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgUpdateGroupPolicyDecisionPolicy")
public data class MsgUpdateGroupPolicyDecisionPolicy(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val groupPolicyAddress: String,
  @ProtobufIndex(index = 3)
  public val decisionPolicy: Any,
) {
  public object KotlinxSerializer : KSerializer<MsgUpdateGroupPolicyDecisionPolicy> {
    private val delegator: KSerializer<MsgUpdateGroupPolicyDecisionPolicy> =
        MsgUpdateGroupPolicyDecisionPolicy.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateGroupPolicyDecisionPolicy):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateGroupPolicyDecisionPolicyMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateGroupPolicyDecisionPolicy {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateGroupPolicyDecisionPolicyMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateGroupPolicyDecisionPolicyResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgUpdateGroupPolicyDecisionPolicyResponse")
public class MsgUpdateGroupPolicyDecisionPolicyResponse() {
  public object KotlinxSerializer : KSerializer<MsgUpdateGroupPolicyDecisionPolicyResponse> {
    private val delegator: KSerializer<MsgUpdateGroupPolicyDecisionPolicyResponse> =
        MsgUpdateGroupPolicyDecisionPolicyResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgUpdateGroupPolicyDecisionPolicyResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateGroupPolicyDecisionPolicyResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateGroupPolicyDecisionPolicyResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateGroupPolicyDecisionPolicyResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateGroupPolicyMetadata.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgUpdateGroupPolicyMetadata")
public data class MsgUpdateGroupPolicyMetadata(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val groupPolicyAddress: String,
  @ProtobufIndex(index = 3)
  public val metadata: String,
) {
  public object KotlinxSerializer : KSerializer<MsgUpdateGroupPolicyMetadata> {
    private val delegator: KSerializer<MsgUpdateGroupPolicyMetadata> =
        MsgUpdateGroupPolicyMetadata.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateGroupPolicyMetadata): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateGroupPolicyMetadataMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateGroupPolicyMetadata {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateGroupPolicyMetadataMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateGroupPolicyMetadataResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgUpdateGroupPolicyMetadataResponse")
public class MsgUpdateGroupPolicyMetadataResponse() {
  public object KotlinxSerializer : KSerializer<MsgUpdateGroupPolicyMetadataResponse> {
    private val delegator: KSerializer<MsgUpdateGroupPolicyMetadataResponse> =
        MsgUpdateGroupPolicyMetadataResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateGroupPolicyMetadataResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgUpdateGroupPolicyMetadataResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateGroupPolicyMetadataResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateGroupPolicyMetadataResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSubmitProposal.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgSubmitProposal")
public data class MsgSubmitProposal(
  @ProtobufIndex(index = 1)
  public val groupPolicyAddress: String,
  @ProtobufIndex(index = 2)
  public val proposers: List<String>,
  @ProtobufIndex(index = 3)
  public val metadata: String,
  @ProtobufIndex(index = 4)
  public val messages: List<Any>,
  @ProtobufIndex(index = 5)
  public val exec: Exec,
  @ProtobufIndex(index = 6)
  public val title: String,
  @ProtobufIndex(index = 7)
  public val summary: String,
) {
  public object KotlinxSerializer : KSerializer<MsgSubmitProposal> {
    private val delegator: KSerializer<MsgSubmitProposal> = MsgSubmitProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSubmitProposal): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgSubmitProposalMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSubmitProposal {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSubmitProposalMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSubmitProposalResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgSubmitProposalResponse")
public data class MsgSubmitProposalResponse(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) {
  public object KotlinxSerializer : KSerializer<MsgSubmitProposalResponse> {
    private val delegator: KSerializer<MsgSubmitProposalResponse> =
        MsgSubmitProposalResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSubmitProposalResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgSubmitProposalResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSubmitProposalResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSubmitProposalResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawProposal.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgWithdrawProposal")
public data class MsgWithdrawProposal(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val address: String,
) {
  public object KotlinxSerializer : KSerializer<MsgWithdrawProposal> {
    private val delegator: KSerializer<MsgWithdrawProposal> = MsgWithdrawProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawProposal): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgWithdrawProposalMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawProposal {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawProposalMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawProposalResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgWithdrawProposalResponse")
public class MsgWithdrawProposalResponse() {
  public object KotlinxSerializer : KSerializer<MsgWithdrawProposalResponse> {
    private val delegator: KSerializer<MsgWithdrawProposalResponse> =
        MsgWithdrawProposalResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawProposalResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgWithdrawProposalResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawProposalResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawProposalResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgVote.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgVote")
public data class MsgVote(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val voter: String,
  @ProtobufIndex(index = 3)
  public val option: VoteOption,
  @ProtobufIndex(index = 4)
  public val metadata: String,
  @ProtobufIndex(index = 5)
  public val exec: Exec,
) {
  public object KotlinxSerializer : KSerializer<MsgVote> {
    private val delegator: KSerializer<MsgVote> = MsgVote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVote): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgVoteMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVote {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVoteMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgVoteResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgVoteResponse")
public class MsgVoteResponse() {
  public object KotlinxSerializer : KSerializer<MsgVoteResponse> {
    private val delegator: KSerializer<MsgVoteResponse> = MsgVoteResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgVoteResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgVoteResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgVoteResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgVoteResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExec.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgExec")
public data class MsgExec(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val executor: String,
) {
  public object KotlinxSerializer : KSerializer<MsgExec> {
    private val delegator: KSerializer<MsgExec> = MsgExec.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExec): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgExecMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExec {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExecMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExecResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgExecResponse")
public data class MsgExecResponse(
  @ProtobufIndex(index = 2)
  public val result: ProposalExecutorResult,
) {
  public object KotlinxSerializer : KSerializer<MsgExecResponse> {
    private val delegator: KSerializer<MsgExecResponse> = MsgExecResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExecResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgExecResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExecResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExecResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgLeaveGroup.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgLeaveGroup")
public data class MsgLeaveGroup(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val groupId: ULong,
) {
  public object KotlinxSerializer : KSerializer<MsgLeaveGroup> {
    private val delegator: KSerializer<MsgLeaveGroup> = MsgLeaveGroup.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgLeaveGroup): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgLeaveGroupMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgLeaveGroup {
      if (decoder is ProtobufMapperDecoder) {
        return MsgLeaveGroupMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgLeaveGroupResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.MsgLeaveGroupResponse")
public class MsgLeaveGroupResponse() {
  public object KotlinxSerializer : KSerializer<MsgLeaveGroupResponse> {
    private val delegator: KSerializer<MsgLeaveGroupResponse> = MsgLeaveGroupResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgLeaveGroupResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(MsgLeaveGroupResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgLeaveGroupResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgLeaveGroupResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
