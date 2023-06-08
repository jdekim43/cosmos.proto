// Transform from cosmos/base/reflection/v2alpha1/reflection.proto
@file:GeneratorVersion(version = "0.2.2")

package cosmos.base.reflection.v2alpha1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object AppDescriptorConverter : ProtobufConverter<AppDescriptor>

public expect object TxDescriptorConverter : ProtobufConverter<TxDescriptor>

public expect object AuthnDescriptorConverter : ProtobufConverter<AuthnDescriptor>

public expect object SigningModeDescriptorConverter : ProtobufConverter<SigningModeDescriptor>

public expect object ChainDescriptorConverter : ProtobufConverter<ChainDescriptor>

public expect object CodecDescriptorConverter : ProtobufConverter<CodecDescriptor>

public expect object InterfaceDescriptorConverter : ProtobufConverter<InterfaceDescriptor>

public expect object InterfaceImplementerDescriptorConverter :
    ProtobufConverter<InterfaceImplementerDescriptor>

public expect object InterfaceAcceptingMessageDescriptorConverter :
    ProtobufConverter<InterfaceAcceptingMessageDescriptor>

public expect object ConfigurationDescriptorConverter : ProtobufConverter<ConfigurationDescriptor>

public expect object MsgDescriptorConverter : ProtobufConverter<MsgDescriptor>

public expect object GetAuthnDescriptorRequestConverter :
    ProtobufConverter<GetAuthnDescriptorRequest>

public expect object GetAuthnDescriptorResponseConverter :
    ProtobufConverter<GetAuthnDescriptorResponse>

public expect object GetChainDescriptorRequestConverter :
    ProtobufConverter<GetChainDescriptorRequest>

public expect object GetChainDescriptorResponseConverter :
    ProtobufConverter<GetChainDescriptorResponse>

public expect object GetCodecDescriptorRequestConverter :
    ProtobufConverter<GetCodecDescriptorRequest>

public expect object GetCodecDescriptorResponseConverter :
    ProtobufConverter<GetCodecDescriptorResponse>

public expect object GetConfigurationDescriptorRequestConverter :
    ProtobufConverter<GetConfigurationDescriptorRequest>

public expect object GetConfigurationDescriptorResponseConverter :
    ProtobufConverter<GetConfigurationDescriptorResponse>

public expect object GetQueryServicesDescriptorRequestConverter :
    ProtobufConverter<GetQueryServicesDescriptorRequest>

public expect object GetQueryServicesDescriptorResponseConverter :
    ProtobufConverter<GetQueryServicesDescriptorResponse>

public expect object GetTxDescriptorRequestConverter : ProtobufConverter<GetTxDescriptorRequest>

public expect object GetTxDescriptorResponseConverter : ProtobufConverter<GetTxDescriptorResponse>

public expect object QueryServicesDescriptorConverter : ProtobufConverter<QueryServicesDescriptor>

public expect object QueryServiceDescriptorConverter : ProtobufConverter<QueryServiceDescriptor>

public expect object QueryMethodDescriptorConverter : ProtobufConverter<QueryMethodDescriptor>
