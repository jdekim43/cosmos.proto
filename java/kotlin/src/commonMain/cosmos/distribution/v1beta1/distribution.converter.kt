// Transform from cosmos/distribution/v1beta1/distribution.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.distribution.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object ParamsConverter : ProtobufConverter<Params>

public expect object ValidatorHistoricalRewardsConverter :
    ProtobufConverter<ValidatorHistoricalRewards>

public expect object ValidatorCurrentRewardsConverter : ProtobufConverter<ValidatorCurrentRewards>

public expect object ValidatorAccumulatedCommissionConverter :
    ProtobufConverter<ValidatorAccumulatedCommission>

public expect object ValidatorOutstandingRewardsConverter :
    ProtobufConverter<ValidatorOutstandingRewards>

public expect object ValidatorSlashEventConverter : ProtobufConverter<ValidatorSlashEvent>

public expect object ValidatorSlashEventsConverter : ProtobufConverter<ValidatorSlashEvents>

public expect object FeePoolConverter : ProtobufConverter<FeePool>

public expect object CommunityPoolSpendProposalConverter :
    ProtobufConverter<CommunityPoolSpendProposal>

public expect object DelegatorStartingInfoConverter : ProtobufConverter<DelegatorStartingInfo>

public expect object DelegationDelegatorRewardConverter :
    ProtobufConverter<DelegationDelegatorReward>

public expect object CommunityPoolSpendProposalWithDepositConverter :
    ProtobufConverter<CommunityPoolSpendProposalWithDeposit>
