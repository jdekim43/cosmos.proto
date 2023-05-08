// Transform from cosmos/group/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.group.v1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
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

@Serializable(with = QueryGroupInfoRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupInfoRequest")
public data class QueryGroupInfoRequest(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupInfoRequest> {
    private val delegator: KSerializer<QueryGroupInfoRequest> = QueryGroupInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupInfoRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupInfoRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupInfoRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupInfoResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupInfoResponse")
public data class QueryGroupInfoResponse(
  @ProtobufIndex(index = 1)
  public val info: GroupInfo,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupInfoResponse> {
    private val delegator: KSerializer<QueryGroupInfoResponse> = QueryGroupInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupInfoResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupInfoResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupInfoResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupPolicyInfoRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupPolicyInfoRequest")
public data class QueryGroupPolicyInfoRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupPolicyInfoRequest> {
    private val delegator: KSerializer<QueryGroupPolicyInfoRequest> =
        QueryGroupPolicyInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupPolicyInfoRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupPolicyInfoRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupPolicyInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupPolicyInfoRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupPolicyInfoResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupPolicyInfoResponse")
public data class QueryGroupPolicyInfoResponse(
  @ProtobufIndex(index = 1)
  public val info: GroupPolicyInfo,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupPolicyInfoResponse> {
    private val delegator: KSerializer<QueryGroupPolicyInfoResponse> =
        QueryGroupPolicyInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupPolicyInfoResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupPolicyInfoResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupPolicyInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupPolicyInfoResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupMembersRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupMembersRequest")
public data class QueryGroupMembersRequest(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupMembersRequest> {
    private val delegator: KSerializer<QueryGroupMembersRequest> =
        QueryGroupMembersRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupMembersRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupMembersRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupMembersRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupMembersRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupMembersResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupMembersResponse")
public data class QueryGroupMembersResponse(
  @ProtobufIndex(index = 1)
  public val members: List<GroupMember>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupMembersResponse> {
    private val delegator: KSerializer<QueryGroupMembersResponse> =
        QueryGroupMembersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupMembersResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupMembersResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupMembersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupMembersResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupsByAdminRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupsByAdminRequest")
public data class QueryGroupsByAdminRequest(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupsByAdminRequest> {
    private val delegator: KSerializer<QueryGroupsByAdminRequest> =
        QueryGroupsByAdminRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupsByAdminRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupsByAdminRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupsByAdminRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupsByAdminRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupsByAdminResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupsByAdminResponse")
public data class QueryGroupsByAdminResponse(
  @ProtobufIndex(index = 1)
  public val groups: List<GroupInfo>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupsByAdminResponse> {
    private val delegator: KSerializer<QueryGroupsByAdminResponse> =
        QueryGroupsByAdminResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupsByAdminResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupsByAdminResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupsByAdminResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupsByAdminResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupPoliciesByGroupRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupPoliciesByGroupRequest")
public data class QueryGroupPoliciesByGroupRequest(
  @ProtobufIndex(index = 1)
  public val groupId: ULong,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupPoliciesByGroupRequest> {
    private val delegator: KSerializer<QueryGroupPoliciesByGroupRequest> =
        QueryGroupPoliciesByGroupRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupPoliciesByGroupRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupPoliciesByGroupRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupPoliciesByGroupRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupPoliciesByGroupRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupPoliciesByGroupResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupPoliciesByGroupResponse")
public data class QueryGroupPoliciesByGroupResponse(
  @ProtobufIndex(index = 1)
  public val groupPolicies: List<GroupPolicyInfo>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupPoliciesByGroupResponse> {
    private val delegator: KSerializer<QueryGroupPoliciesByGroupResponse> =
        QueryGroupPoliciesByGroupResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupPoliciesByGroupResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupPoliciesByGroupResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupPoliciesByGroupResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupPoliciesByGroupResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupPoliciesByAdminRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupPoliciesByAdminRequest")
public data class QueryGroupPoliciesByAdminRequest(
  @ProtobufIndex(index = 1)
  public val admin: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupPoliciesByAdminRequest> {
    private val delegator: KSerializer<QueryGroupPoliciesByAdminRequest> =
        QueryGroupPoliciesByAdminRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupPoliciesByAdminRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupPoliciesByAdminRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupPoliciesByAdminRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupPoliciesByAdminRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupPoliciesByAdminResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupPoliciesByAdminResponse")
public data class QueryGroupPoliciesByAdminResponse(
  @ProtobufIndex(index = 1)
  public val groupPolicies: List<GroupPolicyInfo>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupPoliciesByAdminResponse> {
    private val delegator: KSerializer<QueryGroupPoliciesByAdminResponse> =
        QueryGroupPoliciesByAdminResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupPoliciesByAdminResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupPoliciesByAdminResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupPoliciesByAdminResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupPoliciesByAdminResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProposalRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryProposalRequest")
public data class QueryProposalRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) {
  public object KotlinxSerializer : KSerializer<QueryProposalRequest> {
    private val delegator: KSerializer<QueryProposalRequest> = QueryProposalRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryProposalRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProposalResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryProposalResponse")
public data class QueryProposalResponse(
  @ProtobufIndex(index = 1)
  public val proposal: Proposal,
) {
  public object KotlinxSerializer : KSerializer<QueryProposalResponse> {
    private val delegator: KSerializer<QueryProposalResponse> = QueryProposalResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryProposalResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProposalsByGroupPolicyRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryProposalsByGroupPolicyRequest")
public data class QueryProposalsByGroupPolicyRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryProposalsByGroupPolicyRequest> {
    private val delegator: KSerializer<QueryProposalsByGroupPolicyRequest> =
        QueryProposalsByGroupPolicyRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalsByGroupPolicyRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryProposalsByGroupPolicyRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalsByGroupPolicyRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalsByGroupPolicyRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProposalsByGroupPolicyResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryProposalsByGroupPolicyResponse")
public data class QueryProposalsByGroupPolicyResponse(
  @ProtobufIndex(index = 1)
  public val proposals: List<Proposal>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryProposalsByGroupPolicyResponse> {
    private val delegator: KSerializer<QueryProposalsByGroupPolicyResponse> =
        QueryProposalsByGroupPolicyResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProposalsByGroupPolicyResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryProposalsByGroupPolicyResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProposalsByGroupPolicyResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProposalsByGroupPolicyResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVoteByProposalVoterRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryVoteByProposalVoterRequest")
public data class QueryVoteByProposalVoterRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val voter: String,
) {
  public object KotlinxSerializer : KSerializer<QueryVoteByProposalVoterRequest> {
    private val delegator: KSerializer<QueryVoteByProposalVoterRequest> =
        QueryVoteByProposalVoterRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVoteByProposalVoterRequest):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryVoteByProposalVoterRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVoteByProposalVoterRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVoteByProposalVoterRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVoteByProposalVoterResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryVoteByProposalVoterResponse")
public data class QueryVoteByProposalVoterResponse(
  @ProtobufIndex(index = 1)
  public val vote: Vote,
) {
  public object KotlinxSerializer : KSerializer<QueryVoteByProposalVoterResponse> {
    private val delegator: KSerializer<QueryVoteByProposalVoterResponse> =
        QueryVoteByProposalVoterResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVoteByProposalVoterResponse):
        Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryVoteByProposalVoterResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVoteByProposalVoterResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVoteByProposalVoterResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotesByProposalRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryVotesByProposalRequest")
public data class QueryVotesByProposalRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryVotesByProposalRequest> {
    private val delegator: KSerializer<QueryVotesByProposalRequest> =
        QueryVotesByProposalRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotesByProposalRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryVotesByProposalRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotesByProposalRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotesByProposalRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotesByProposalResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryVotesByProposalResponse")
public data class QueryVotesByProposalResponse(
  @ProtobufIndex(index = 1)
  public val votes: List<Vote>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryVotesByProposalResponse> {
    private val delegator: KSerializer<QueryVotesByProposalResponse> =
        QueryVotesByProposalResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotesByProposalResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryVotesByProposalResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotesByProposalResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotesByProposalResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotesByVoterRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryVotesByVoterRequest")
public data class QueryVotesByVoterRequest(
  @ProtobufIndex(index = 1)
  public val voter: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryVotesByVoterRequest> {
    private val delegator: KSerializer<QueryVotesByVoterRequest> =
        QueryVotesByVoterRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotesByVoterRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryVotesByVoterRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotesByVoterRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotesByVoterRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVotesByVoterResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryVotesByVoterResponse")
public data class QueryVotesByVoterResponse(
  @ProtobufIndex(index = 1)
  public val votes: List<Vote>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryVotesByVoterResponse> {
    private val delegator: KSerializer<QueryVotesByVoterResponse> =
        QueryVotesByVoterResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVotesByVoterResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryVotesByVoterResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVotesByVoterResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVotesByVoterResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupsByMemberRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupsByMemberRequest")
public data class QueryGroupsByMemberRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupsByMemberRequest> {
    private val delegator: KSerializer<QueryGroupsByMemberRequest> =
        QueryGroupsByMemberRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupsByMemberRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupsByMemberRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupsByMemberRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupsByMemberRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupsByMemberResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupsByMemberResponse")
public data class QueryGroupsByMemberResponse(
  @ProtobufIndex(index = 1)
  public val groups: List<GroupInfo>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupsByMemberResponse> {
    private val delegator: KSerializer<QueryGroupsByMemberResponse> =
        QueryGroupsByMemberResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupsByMemberResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupsByMemberResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupsByMemberResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupsByMemberResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTallyResultRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryTallyResultRequest")
public data class QueryTallyResultRequest(
  @ProtobufIndex(index = 1)
  public val proposalId: ULong,
) {
  public object KotlinxSerializer : KSerializer<QueryTallyResultRequest> {
    private val delegator: KSerializer<QueryTallyResultRequest> =
        QueryTallyResultRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTallyResultRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryTallyResultRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTallyResultRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTallyResultRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTallyResultResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryTallyResultResponse")
public data class QueryTallyResultResponse(
  @ProtobufIndex(index = 1)
  public val tally: TallyResult,
) {
  public object KotlinxSerializer : KSerializer<QueryTallyResultResponse> {
    private val delegator: KSerializer<QueryTallyResultResponse> =
        QueryTallyResultResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTallyResultResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryTallyResultResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTallyResultResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTallyResultResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupsRequest.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupsRequest")
public data class QueryGroupsRequest(
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupsRequest> {
    private val delegator: KSerializer<QueryGroupsRequest> = QueryGroupsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupsRequest): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupsRequestMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupsRequestMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGroupsResponse.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.QueryGroupsResponse")
public data class QueryGroupsResponse(
  @ProtobufIndex(index = 1)
  public val groups: List<GroupInfo>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) {
  public object KotlinxSerializer : KSerializer<QueryGroupsResponse> {
    private val delegator: KSerializer<QueryGroupsResponse> = QueryGroupsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGroupsResponse): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(QueryGroupsResponseMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGroupsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGroupsResponseMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}