// Transform from cosmos/base/reflection/v2alpha1/reflection.proto
package cosmos.base.reflection.v2alpha1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object AppDescriptorMapper : ProtobufTypeMapper<AppDescriptor, Reflection.AppDescriptor> {
  public override val descriptor: Descriptors.Descriptor = Reflection.AppDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.AppDescriptor> = Reflection.AppDescriptor.parser()

  public override fun convert(obj: Reflection.AppDescriptor): AppDescriptor = AppDescriptor(
  	authn = AuthnDescriptorMapper.convert(obj.authn),
  	chain = ChainDescriptorMapper.convert(obj.chain),
  	codec = CodecDescriptorMapper.convert(obj.codec),
  	configuration = ConfigurationDescriptorMapper.convert(obj.configuration),
  	queryServices = QueryServicesDescriptorMapper.convert(obj.queryServices),
  	tx = TxDescriptorMapper.convert(obj.tx),
  )

  public override fun convert(obj: AppDescriptor): Reflection.AppDescriptor {
    val builder = Reflection.AppDescriptor.newBuilder()
    builder.setAuthn(AuthnDescriptorMapper.convert(obj.authn))
    builder.setChain(ChainDescriptorMapper.convert(obj.chain))
    builder.setCodec(CodecDescriptorMapper.convert(obj.codec))
    builder.setConfiguration(ConfigurationDescriptorMapper.convert(obj.configuration))
    builder.setQueryServices(QueryServicesDescriptorMapper.convert(obj.queryServices))
    builder.setTx(TxDescriptorMapper.convert(obj.tx))
    return builder.build()
  }
}

public object TxDescriptorMapper : ProtobufTypeMapper<TxDescriptor, Reflection.TxDescriptor> {
  public override val descriptor: Descriptors.Descriptor = Reflection.TxDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.TxDescriptor> = Reflection.TxDescriptor.parser()

  public override fun convert(obj: Reflection.TxDescriptor): TxDescriptor = TxDescriptor(
  	fullname = obj.fullname,
  	msgs = obj.msgsList.map { MsgDescriptorMapper.convert(it) },
  )

  public override fun convert(obj: TxDescriptor): Reflection.TxDescriptor {
    val builder = Reflection.TxDescriptor.newBuilder()
    builder.setFullname(obj.fullname)
    builder.addAllMsgs(obj.msgs.map { MsgDescriptorMapper.convert(it) })
    return builder.build()
  }
}

public object AuthnDescriptorMapper :
    ProtobufTypeMapper<AuthnDescriptor, Reflection.AuthnDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.AuthnDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.AuthnDescriptor> =
      Reflection.AuthnDescriptor.parser()

  public override fun convert(obj: Reflection.AuthnDescriptor): AuthnDescriptor = AuthnDescriptor(
  	signModes = obj.signModesList.map { SigningModeDescriptorMapper.convert(it) },
  )

  public override fun convert(obj: AuthnDescriptor): Reflection.AuthnDescriptor {
    val builder = Reflection.AuthnDescriptor.newBuilder()
    builder.addAllSignModes(obj.signModes.map { SigningModeDescriptorMapper.convert(it) })
    return builder.build()
  }
}

public object SigningModeDescriptorMapper :
    ProtobufTypeMapper<SigningModeDescriptor, Reflection.SigningModeDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.SigningModeDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.SigningModeDescriptor> =
      Reflection.SigningModeDescriptor.parser()

  public override fun convert(obj: Reflection.SigningModeDescriptor): SigningModeDescriptor =
      SigningModeDescriptor(
  	name = obj.name,
  	number = obj.number,
  	authnInfoProviderMethodFullname = obj.authnInfoProviderMethodFullname,
  )

  public override fun convert(obj: SigningModeDescriptor): Reflection.SigningModeDescriptor {
    val builder = Reflection.SigningModeDescriptor.newBuilder()
    builder.setName(obj.name)
    builder.setNumber(obj.number)
    builder.setAuthnInfoProviderMethodFullname(obj.authnInfoProviderMethodFullname)
    return builder.build()
  }
}

public object ChainDescriptorMapper :
    ProtobufTypeMapper<ChainDescriptor, Reflection.ChainDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.ChainDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.ChainDescriptor> =
      Reflection.ChainDescriptor.parser()

  public override fun convert(obj: Reflection.ChainDescriptor): ChainDescriptor = ChainDescriptor(
  	id = obj.id,
  )

  public override fun convert(obj: ChainDescriptor): Reflection.ChainDescriptor {
    val builder = Reflection.ChainDescriptor.newBuilder()
    builder.setId(obj.id)
    return builder.build()
  }
}

public object CodecDescriptorMapper :
    ProtobufTypeMapper<CodecDescriptor, Reflection.CodecDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.CodecDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.CodecDescriptor> =
      Reflection.CodecDescriptor.parser()

  public override fun convert(obj: Reflection.CodecDescriptor): CodecDescriptor = CodecDescriptor(
  	interfaces = obj.interfacesList.map { InterfaceDescriptorMapper.convert(it) },
  )

  public override fun convert(obj: CodecDescriptor): Reflection.CodecDescriptor {
    val builder = Reflection.CodecDescriptor.newBuilder()
    builder.addAllInterfaces(obj.interfaces.map { InterfaceDescriptorMapper.convert(it) })
    return builder.build()
  }
}

public object InterfaceDescriptorMapper :
    ProtobufTypeMapper<InterfaceDescriptor, Reflection.InterfaceDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.InterfaceDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.InterfaceDescriptor> =
      Reflection.InterfaceDescriptor.parser()

  public override fun convert(obj: Reflection.InterfaceDescriptor): InterfaceDescriptor =
      InterfaceDescriptor(
  	fullname = obj.fullname,
  	interfaceAcceptingMessages = obj.interfaceAcceptingMessagesList.map {
      InterfaceAcceptingMessageDescriptorMapper.convert(it) },
  	interfaceImplementers = obj.interfaceImplementersList.map {
      InterfaceImplementerDescriptorMapper.convert(it) },
  )

  public override fun convert(obj: InterfaceDescriptor): Reflection.InterfaceDescriptor {
    val builder = Reflection.InterfaceDescriptor.newBuilder()
    builder.setFullname(obj.fullname)
    builder.addAllInterfaceAcceptingMessages(obj.interfaceAcceptingMessages.map {
        InterfaceAcceptingMessageDescriptorMapper.convert(it) })
    builder.addAllInterfaceImplementers(obj.interfaceImplementers.map {
        InterfaceImplementerDescriptorMapper.convert(it) })
    return builder.build()
  }
}

public object InterfaceImplementerDescriptorMapper :
    ProtobufTypeMapper<InterfaceImplementerDescriptor, Reflection.InterfaceImplementerDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.InterfaceImplementerDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.InterfaceImplementerDescriptor> =
      Reflection.InterfaceImplementerDescriptor.parser()

  public override fun convert(obj: Reflection.InterfaceImplementerDescriptor):
      InterfaceImplementerDescriptor = InterfaceImplementerDescriptor(
  	fullname = obj.fullname,
  	typeUrl = obj.typeUrl,
  )

  public override fun convert(obj: InterfaceImplementerDescriptor):
      Reflection.InterfaceImplementerDescriptor {
    val builder = Reflection.InterfaceImplementerDescriptor.newBuilder()
    builder.setFullname(obj.fullname)
    builder.setTypeUrl(obj.typeUrl)
    return builder.build()
  }
}

public object InterfaceAcceptingMessageDescriptorMapper :
    ProtobufTypeMapper<InterfaceAcceptingMessageDescriptor, Reflection.InterfaceAcceptingMessageDescriptor>
    {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.InterfaceAcceptingMessageDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.InterfaceAcceptingMessageDescriptor> =
      Reflection.InterfaceAcceptingMessageDescriptor.parser()

  public override fun convert(obj: Reflection.InterfaceAcceptingMessageDescriptor):
      InterfaceAcceptingMessageDescriptor = InterfaceAcceptingMessageDescriptor(
  	fullname = obj.fullname,
  	fieldDescriptorNames = obj.fieldDescriptorNamesList.map { it },
  )

  public override fun convert(obj: InterfaceAcceptingMessageDescriptor):
      Reflection.InterfaceAcceptingMessageDescriptor {
    val builder = Reflection.InterfaceAcceptingMessageDescriptor.newBuilder()
    builder.setFullname(obj.fullname)
    builder.addAllFieldDescriptorNames(obj.fieldDescriptorNames.map { it })
    return builder.build()
  }
}

public object ConfigurationDescriptorMapper :
    ProtobufTypeMapper<ConfigurationDescriptor, Reflection.ConfigurationDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.ConfigurationDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.ConfigurationDescriptor> =
      Reflection.ConfigurationDescriptor.parser()

  public override fun convert(obj: Reflection.ConfigurationDescriptor): ConfigurationDescriptor =
      ConfigurationDescriptor(
  	bech32AccountAddressPrefix = obj.bech32AccountAddressPrefix,
  )

  public override fun convert(obj: ConfigurationDescriptor): Reflection.ConfigurationDescriptor {
    val builder = Reflection.ConfigurationDescriptor.newBuilder()
    builder.setBech32AccountAddressPrefix(obj.bech32AccountAddressPrefix)
    return builder.build()
  }
}

public object MsgDescriptorMapper : ProtobufTypeMapper<MsgDescriptor, Reflection.MsgDescriptor> {
  public override val descriptor: Descriptors.Descriptor = Reflection.MsgDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.MsgDescriptor> = Reflection.MsgDescriptor.parser()

  public override fun convert(obj: Reflection.MsgDescriptor): MsgDescriptor = MsgDescriptor(
  	msgTypeUrl = obj.msgTypeUrl,
  )

  public override fun convert(obj: MsgDescriptor): Reflection.MsgDescriptor {
    val builder = Reflection.MsgDescriptor.newBuilder()
    builder.setMsgTypeUrl(obj.msgTypeUrl)
    return builder.build()
  }
}

public object GetAuthnDescriptorRequestMapper :
    ProtobufTypeMapper<GetAuthnDescriptorRequest, Reflection.GetAuthnDescriptorRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetAuthnDescriptorRequest.getDescriptor()

  public override val parser: Parser<Reflection.GetAuthnDescriptorRequest> =
      Reflection.GetAuthnDescriptorRequest.parser()

  public override fun convert(obj: Reflection.GetAuthnDescriptorRequest): GetAuthnDescriptorRequest
      = GetAuthnDescriptorRequest(
  )

  public override fun convert(obj: GetAuthnDescriptorRequest):
      Reflection.GetAuthnDescriptorRequest {
    val builder = Reflection.GetAuthnDescriptorRequest.newBuilder()
    return builder.build()
  }
}

public object GetAuthnDescriptorResponseMapper :
    ProtobufTypeMapper<GetAuthnDescriptorResponse, Reflection.GetAuthnDescriptorResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetAuthnDescriptorResponse.getDescriptor()

  public override val parser: Parser<Reflection.GetAuthnDescriptorResponse> =
      Reflection.GetAuthnDescriptorResponse.parser()

  public override fun convert(obj: Reflection.GetAuthnDescriptorResponse):
      GetAuthnDescriptorResponse = GetAuthnDescriptorResponse(
  	authn = AuthnDescriptorMapper.convert(obj.authn),
  )

  public override fun convert(obj: GetAuthnDescriptorResponse):
      Reflection.GetAuthnDescriptorResponse {
    val builder = Reflection.GetAuthnDescriptorResponse.newBuilder()
    builder.setAuthn(AuthnDescriptorMapper.convert(obj.authn))
    return builder.build()
  }
}

public object GetChainDescriptorRequestMapper :
    ProtobufTypeMapper<GetChainDescriptorRequest, Reflection.GetChainDescriptorRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetChainDescriptorRequest.getDescriptor()

  public override val parser: Parser<Reflection.GetChainDescriptorRequest> =
      Reflection.GetChainDescriptorRequest.parser()

  public override fun convert(obj: Reflection.GetChainDescriptorRequest): GetChainDescriptorRequest
      = GetChainDescriptorRequest(
  )

  public override fun convert(obj: GetChainDescriptorRequest):
      Reflection.GetChainDescriptorRequest {
    val builder = Reflection.GetChainDescriptorRequest.newBuilder()
    return builder.build()
  }
}

public object GetChainDescriptorResponseMapper :
    ProtobufTypeMapper<GetChainDescriptorResponse, Reflection.GetChainDescriptorResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetChainDescriptorResponse.getDescriptor()

  public override val parser: Parser<Reflection.GetChainDescriptorResponse> =
      Reflection.GetChainDescriptorResponse.parser()

  public override fun convert(obj: Reflection.GetChainDescriptorResponse):
      GetChainDescriptorResponse = GetChainDescriptorResponse(
  	chain = ChainDescriptorMapper.convert(obj.chain),
  )

  public override fun convert(obj: GetChainDescriptorResponse):
      Reflection.GetChainDescriptorResponse {
    val builder = Reflection.GetChainDescriptorResponse.newBuilder()
    builder.setChain(ChainDescriptorMapper.convert(obj.chain))
    return builder.build()
  }
}

public object GetCodecDescriptorRequestMapper :
    ProtobufTypeMapper<GetCodecDescriptorRequest, Reflection.GetCodecDescriptorRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetCodecDescriptorRequest.getDescriptor()

  public override val parser: Parser<Reflection.GetCodecDescriptorRequest> =
      Reflection.GetCodecDescriptorRequest.parser()

  public override fun convert(obj: Reflection.GetCodecDescriptorRequest): GetCodecDescriptorRequest
      = GetCodecDescriptorRequest(
  )

  public override fun convert(obj: GetCodecDescriptorRequest):
      Reflection.GetCodecDescriptorRequest {
    val builder = Reflection.GetCodecDescriptorRequest.newBuilder()
    return builder.build()
  }
}

public object GetCodecDescriptorResponseMapper :
    ProtobufTypeMapper<GetCodecDescriptorResponse, Reflection.GetCodecDescriptorResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetCodecDescriptorResponse.getDescriptor()

  public override val parser: Parser<Reflection.GetCodecDescriptorResponse> =
      Reflection.GetCodecDescriptorResponse.parser()

  public override fun convert(obj: Reflection.GetCodecDescriptorResponse):
      GetCodecDescriptorResponse = GetCodecDescriptorResponse(
  	codec = CodecDescriptorMapper.convert(obj.codec),
  )

  public override fun convert(obj: GetCodecDescriptorResponse):
      Reflection.GetCodecDescriptorResponse {
    val builder = Reflection.GetCodecDescriptorResponse.newBuilder()
    builder.setCodec(CodecDescriptorMapper.convert(obj.codec))
    return builder.build()
  }
}

public object GetConfigurationDescriptorRequestMapper :
    ProtobufTypeMapper<GetConfigurationDescriptorRequest, Reflection.GetConfigurationDescriptorRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetConfigurationDescriptorRequest.getDescriptor()

  public override val parser: Parser<Reflection.GetConfigurationDescriptorRequest> =
      Reflection.GetConfigurationDescriptorRequest.parser()

  public override fun convert(obj: Reflection.GetConfigurationDescriptorRequest):
      GetConfigurationDescriptorRequest = GetConfigurationDescriptorRequest(
  )

  public override fun convert(obj: GetConfigurationDescriptorRequest):
      Reflection.GetConfigurationDescriptorRequest {
    val builder = Reflection.GetConfigurationDescriptorRequest.newBuilder()
    return builder.build()
  }
}

public object GetConfigurationDescriptorResponseMapper :
    ProtobufTypeMapper<GetConfigurationDescriptorResponse, Reflection.GetConfigurationDescriptorResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetConfigurationDescriptorResponse.getDescriptor()

  public override val parser: Parser<Reflection.GetConfigurationDescriptorResponse> =
      Reflection.GetConfigurationDescriptorResponse.parser()

  public override fun convert(obj: Reflection.GetConfigurationDescriptorResponse):
      GetConfigurationDescriptorResponse = GetConfigurationDescriptorResponse(
  	config = ConfigurationDescriptorMapper.convert(obj.config),
  )

  public override fun convert(obj: GetConfigurationDescriptorResponse):
      Reflection.GetConfigurationDescriptorResponse {
    val builder = Reflection.GetConfigurationDescriptorResponse.newBuilder()
    builder.setConfig(ConfigurationDescriptorMapper.convert(obj.config))
    return builder.build()
  }
}

public object GetQueryServicesDescriptorRequestMapper :
    ProtobufTypeMapper<GetQueryServicesDescriptorRequest, Reflection.GetQueryServicesDescriptorRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetQueryServicesDescriptorRequest.getDescriptor()

  public override val parser: Parser<Reflection.GetQueryServicesDescriptorRequest> =
      Reflection.GetQueryServicesDescriptorRequest.parser()

  public override fun convert(obj: Reflection.GetQueryServicesDescriptorRequest):
      GetQueryServicesDescriptorRequest = GetQueryServicesDescriptorRequest(
  )

  public override fun convert(obj: GetQueryServicesDescriptorRequest):
      Reflection.GetQueryServicesDescriptorRequest {
    val builder = Reflection.GetQueryServicesDescriptorRequest.newBuilder()
    return builder.build()
  }
}

public object GetQueryServicesDescriptorResponseMapper :
    ProtobufTypeMapper<GetQueryServicesDescriptorResponse, Reflection.GetQueryServicesDescriptorResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetQueryServicesDescriptorResponse.getDescriptor()

  public override val parser: Parser<Reflection.GetQueryServicesDescriptorResponse> =
      Reflection.GetQueryServicesDescriptorResponse.parser()

  public override fun convert(obj: Reflection.GetQueryServicesDescriptorResponse):
      GetQueryServicesDescriptorResponse = GetQueryServicesDescriptorResponse(
  	queries = QueryServicesDescriptorMapper.convert(obj.queries),
  )

  public override fun convert(obj: GetQueryServicesDescriptorResponse):
      Reflection.GetQueryServicesDescriptorResponse {
    val builder = Reflection.GetQueryServicesDescriptorResponse.newBuilder()
    builder.setQueries(QueryServicesDescriptorMapper.convert(obj.queries))
    return builder.build()
  }
}

public object GetTxDescriptorRequestMapper :
    ProtobufTypeMapper<GetTxDescriptorRequest, Reflection.GetTxDescriptorRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetTxDescriptorRequest.getDescriptor()

  public override val parser: Parser<Reflection.GetTxDescriptorRequest> =
      Reflection.GetTxDescriptorRequest.parser()

  public override fun convert(obj: Reflection.GetTxDescriptorRequest): GetTxDescriptorRequest =
      GetTxDescriptorRequest(
  )

  public override fun convert(obj: GetTxDescriptorRequest): Reflection.GetTxDescriptorRequest {
    val builder = Reflection.GetTxDescriptorRequest.newBuilder()
    return builder.build()
  }
}

public object GetTxDescriptorResponseMapper :
    ProtobufTypeMapper<GetTxDescriptorResponse, Reflection.GetTxDescriptorResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.GetTxDescriptorResponse.getDescriptor()

  public override val parser: Parser<Reflection.GetTxDescriptorResponse> =
      Reflection.GetTxDescriptorResponse.parser()

  public override fun convert(obj: Reflection.GetTxDescriptorResponse): GetTxDescriptorResponse =
      GetTxDescriptorResponse(
  	tx = TxDescriptorMapper.convert(obj.tx),
  )

  public override fun convert(obj: GetTxDescriptorResponse): Reflection.GetTxDescriptorResponse {
    val builder = Reflection.GetTxDescriptorResponse.newBuilder()
    builder.setTx(TxDescriptorMapper.convert(obj.tx))
    return builder.build()
  }
}

public object QueryServicesDescriptorMapper :
    ProtobufTypeMapper<QueryServicesDescriptor, Reflection.QueryServicesDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.QueryServicesDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.QueryServicesDescriptor> =
      Reflection.QueryServicesDescriptor.parser()

  public override fun convert(obj: Reflection.QueryServicesDescriptor): QueryServicesDescriptor =
      QueryServicesDescriptor(
  	queryServices = obj.queryServicesList.map { QueryServiceDescriptorMapper.convert(it) },
  )

  public override fun convert(obj: QueryServicesDescriptor): Reflection.QueryServicesDescriptor {
    val builder = Reflection.QueryServicesDescriptor.newBuilder()
    builder.addAllQueryServices(obj.queryServices.map { QueryServiceDescriptorMapper.convert(it) })
    return builder.build()
  }
}

public object QueryServiceDescriptorMapper :
    ProtobufTypeMapper<QueryServiceDescriptor, Reflection.QueryServiceDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.QueryServiceDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.QueryServiceDescriptor> =
      Reflection.QueryServiceDescriptor.parser()

  public override fun convert(obj: Reflection.QueryServiceDescriptor): QueryServiceDescriptor =
      QueryServiceDescriptor(
  	fullname = obj.fullname,
  	isModule = obj.isModule,
  	methods = obj.methodsList.map { QueryMethodDescriptorMapper.convert(it) },
  )

  public override fun convert(obj: QueryServiceDescriptor): Reflection.QueryServiceDescriptor {
    val builder = Reflection.QueryServiceDescriptor.newBuilder()
    builder.setFullname(obj.fullname)
    builder.setIsModule(obj.isModule)
    builder.addAllMethods(obj.methods.map { QueryMethodDescriptorMapper.convert(it) })
    return builder.build()
  }
}

public object QueryMethodDescriptorMapper :
    ProtobufTypeMapper<QueryMethodDescriptor, Reflection.QueryMethodDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.QueryMethodDescriptor.getDescriptor()

  public override val parser: Parser<Reflection.QueryMethodDescriptor> =
      Reflection.QueryMethodDescriptor.parser()

  public override fun convert(obj: Reflection.QueryMethodDescriptor): QueryMethodDescriptor =
      QueryMethodDescriptor(
  	name = obj.name,
  	fullQueryPath = obj.fullQueryPath,
  )

  public override fun convert(obj: QueryMethodDescriptor): Reflection.QueryMethodDescriptor {
    val builder = Reflection.QueryMethodDescriptor.newBuilder()
    builder.setName(obj.name)
    builder.setFullQueryPath(obj.fullQueryPath)
    return builder.build()
  }
}
