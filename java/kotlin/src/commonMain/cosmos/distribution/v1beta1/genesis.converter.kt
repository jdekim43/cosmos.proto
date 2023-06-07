// Transform from cosmos/distribution/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.distribution.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object DelegatorWithdrawInfoConverter : ProtobufConverter<DelegatorWithdrawInfo>

public expect object ValidatorOutstandingRewardsRecordConverter :
    ProtobufConverter<ValidatorOutstandingRewardsRecord>

public expect object ValidatorAccumulatedCommissionRecordConverter :
    ProtobufConverter<ValidatorAccumulatedCommissionRecord>

public expect object ValidatorHistoricalRewardsRecordConverter :
    ProtobufConverter<ValidatorHistoricalRewardsRecord>

public expect object ValidatorCurrentRewardsRecordConverter :
    ProtobufConverter<ValidatorCurrentRewardsRecord>

public expect object DelegatorStartingInfoRecordConverter :
    ProtobufConverter<DelegatorStartingInfoRecord>

public expect object ValidatorSlashEventRecordConverter :
    ProtobufConverter<ValidatorSlashEventRecord>

public expect object GenesisStateConverter : ProtobufConverter<GenesisState>
