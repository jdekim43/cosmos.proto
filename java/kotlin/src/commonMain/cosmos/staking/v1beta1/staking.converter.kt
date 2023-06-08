// Transform from cosmos/staking/v1beta1/staking.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.staking.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object HistoricalInfoConverter : ProtobufConverter<HistoricalInfo>

public expect object CommissionRatesConverter : ProtobufConverter<CommissionRates>

public expect object CommissionConverter : ProtobufConverter<Commission>

public expect object DescriptionConverter : ProtobufConverter<Description>

public expect object ValidatorConverter : ProtobufConverter<Validator>

public expect object ValAddressesConverter : ProtobufConverter<ValAddresses>

public expect object DVPairConverter : ProtobufConverter<DVPair>

public expect object DVPairsConverter : ProtobufConverter<DVPairs>

public expect object DVVTripletConverter : ProtobufConverter<DVVTriplet>

public expect object DVVTripletsConverter : ProtobufConverter<DVVTriplets>

public expect object DelegationConverter : ProtobufConverter<Delegation>

public expect object UnbondingDelegationConverter : ProtobufConverter<UnbondingDelegation>

public expect object UnbondingDelegationEntryConverter : ProtobufConverter<UnbondingDelegationEntry>

public expect object RedelegationEntryConverter : ProtobufConverter<RedelegationEntry>

public expect object RedelegationConverter : ProtobufConverter<Redelegation>

public expect object ParamsConverter : ProtobufConverter<Params>

public expect object DelegationResponseConverter : ProtobufConverter<DelegationResponse>

public expect object RedelegationEntryResponseConverter :
    ProtobufConverter<RedelegationEntryResponse>

public expect object RedelegationResponseConverter : ProtobufConverter<RedelegationResponse>

public expect object PoolConverter : ProtobufConverter<Pool>

public expect object ValidatorUpdatesConverter : ProtobufConverter<ValidatorUpdates>
