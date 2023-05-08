// Transform from cosmos/group/v1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package cosmos.group.v1

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

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = "cosmos.group.v1.GenesisState")
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val groupSeq: ULong,
  @ProtobufIndex(index = 2)
  public val groups: List<GroupInfo>,
  @ProtobufIndex(index = 3)
  public val groupMembers: List<GroupMember>,
  @ProtobufIndex(index = 4)
  public val groupPolicySeq: ULong,
  @ProtobufIndex(index = 5)
  public val groupPolicies: List<GroupPolicyInfo>,
  @ProtobufIndex(index = 6)
  public val proposalSeq: ULong,
  @ProtobufIndex(index = 7)
  public val proposals: List<Proposal>,
  @ProtobufIndex(index = 8)
  public val votes: List<Vote>,
) {
  public object KotlinxSerializer : KSerializer<GenesisState> {
    private val delegator: KSerializer<GenesisState> = GenesisState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GenesisState): Unit {
      if (encoder is ProtobufMapperEncoder) {
        encoder.encodeValue(GenesisStateMapper.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GenesisState {
      if (decoder is ProtobufMapperDecoder) {
        return GenesisStateMapper.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
