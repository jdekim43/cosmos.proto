// Transform from cosmos/auth/v1beta1/auth.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.auth.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object BaseAccountConverter : ProtobufConverter<BaseAccount>

public expect object ModuleAccountConverter : ProtobufConverter<ModuleAccount>

public expect object ModuleCredentialConverter : ProtobufConverter<ModuleCredential>

public expect object ParamsConverter : ProtobufConverter<Params>
