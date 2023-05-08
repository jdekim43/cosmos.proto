// Transform from cosmos/autocli/v1/options.proto
package cosmos.autocli.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ModuleOptionsMapper : ProtobufTypeMapper<ModuleOptions, Options.ModuleOptions> {
  public override val descriptor: Descriptors.Descriptor = Options.ModuleOptions.getDescriptor()

  public override val parser: Parser<Options.ModuleOptions> = Options.ModuleOptions.parser()

  public override fun convert(obj: Options.ModuleOptions): ModuleOptions = ModuleOptions(
  	tx = ServiceCommandDescriptorMapper.convert(obj.tx),
  	query = ServiceCommandDescriptorMapper.convert(obj.query),
  )

  public override fun convert(obj: ModuleOptions): Options.ModuleOptions {
    val builder = Options.ModuleOptions.newBuilder()
    builder.setTx(ServiceCommandDescriptorMapper.convert(obj.tx))
    builder.setQuery(ServiceCommandDescriptorMapper.convert(obj.query))
    return builder.build()
  }
}

public object ServiceCommandDescriptorMapper :
    ProtobufTypeMapper<ServiceCommandDescriptor, Options.ServiceCommandDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Options.ServiceCommandDescriptor.getDescriptor()

  public override val parser: Parser<Options.ServiceCommandDescriptor> =
      Options.ServiceCommandDescriptor.parser()

  public override fun convert(obj: Options.ServiceCommandDescriptor): ServiceCommandDescriptor =
      ServiceCommandDescriptor(
  	service = obj.service,
  	rpcCommandOptions = obj.rpcCommandOptionsList.map { RpcCommandOptionsMapper.convert(it) },
  	subCommands = obj.subCommandsMap.map { it.key to ServiceCommandDescriptorMapper.convert(it.value)
      }.toMap(),
  )

  public override fun convert(obj: ServiceCommandDescriptor): Options.ServiceCommandDescriptor {
    val builder = Options.ServiceCommandDescriptor.newBuilder()
    builder.setService(obj.service)
    builder.addAllRpcCommandOptions(obj.rpcCommandOptions.map { RpcCommandOptionsMapper.convert(it)
        })
    builder.putAllSubCommands(obj.subCommands.map { it.key to
        ServiceCommandDescriptorMapper.convert(it.value) }.toMap())
    return builder.build()
  }
}

public object RpcCommandOptionsMapper :
    ProtobufTypeMapper<RpcCommandOptions, Options.RpcCommandOptions> {
  public override val descriptor: Descriptors.Descriptor = Options.RpcCommandOptions.getDescriptor()

  public override val parser: Parser<Options.RpcCommandOptions> = Options.RpcCommandOptions.parser()

  public override fun convert(obj: Options.RpcCommandOptions): RpcCommandOptions =
      RpcCommandOptions(
  	rpcMethod = obj.rpcMethod,
  	use = obj.use,
  	long = obj.long,
  	short = obj.short,
  	example = obj.example,
  	alias = obj.aliasList.map { it },
  	suggestFor = obj.suggestForList.map { it },
  	deprecated = obj.deprecated,
  	version = obj.version,
  	flagOptions = obj.flagOptionsMap.map { it.key to FlagOptionsMapper.convert(it.value) }.toMap(),
  	positionalArgs = obj.positionalArgsList.map { PositionalArgDescriptorMapper.convert(it) },
  	skip = obj.skip,
  )

  public override fun convert(obj: RpcCommandOptions): Options.RpcCommandOptions {
    val builder = Options.RpcCommandOptions.newBuilder()
    builder.setRpcMethod(obj.rpcMethod)
    builder.setUse(obj.use)
    builder.setLong(obj.long)
    builder.setShort(obj.short)
    builder.setExample(obj.example)
    builder.addAllAlias(obj.alias.map { it })
    builder.addAllSuggestFor(obj.suggestFor.map { it })
    builder.setDeprecated(obj.deprecated)
    builder.setVersion(obj.version)
    builder.putAllFlagOptions(obj.flagOptions.map { it.key to FlagOptionsMapper.convert(it.value)
        }.toMap())
    builder.addAllPositionalArgs(obj.positionalArgs.map { PositionalArgDescriptorMapper.convert(it)
        })
    builder.setSkip(obj.skip)
    return builder.build()
  }
}

public object FlagOptionsMapper : ProtobufTypeMapper<FlagOptions, Options.FlagOptions> {
  public override val descriptor: Descriptors.Descriptor = Options.FlagOptions.getDescriptor()

  public override val parser: Parser<Options.FlagOptions> = Options.FlagOptions.parser()

  public override fun convert(obj: Options.FlagOptions): FlagOptions = FlagOptions(
  	name = obj.name,
  	shorthand = obj.shorthand,
  	usage = obj.usage,
  	defaultValue = obj.defaultValue,
  	noOptDefaultValue = obj.noOptDefaultValue,
  	deprecated = obj.deprecated,
  	shorthandDeprecated = obj.shorthandDeprecated,
  	hidden = obj.hidden,
  )

  public override fun convert(obj: FlagOptions): Options.FlagOptions {
    val builder = Options.FlagOptions.newBuilder()
    builder.setName(obj.name)
    builder.setShorthand(obj.shorthand)
    builder.setUsage(obj.usage)
    builder.setDefaultValue(obj.defaultValue)
    builder.setNoOptDefaultValue(obj.noOptDefaultValue)
    builder.setDeprecated(obj.deprecated)
    builder.setShorthandDeprecated(obj.shorthandDeprecated)
    builder.setHidden(obj.hidden)
    return builder.build()
  }
}

public object PositionalArgDescriptorMapper :
    ProtobufTypeMapper<PositionalArgDescriptor, Options.PositionalArgDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Options.PositionalArgDescriptor.getDescriptor()

  public override val parser: Parser<Options.PositionalArgDescriptor> =
      Options.PositionalArgDescriptor.parser()

  public override fun convert(obj: Options.PositionalArgDescriptor): PositionalArgDescriptor =
      PositionalArgDescriptor(
  	protoField = obj.protoField,
  	varargs = obj.varargs,
  )

  public override fun convert(obj: PositionalArgDescriptor): Options.PositionalArgDescriptor {
    val builder = Options.PositionalArgDescriptor.newBuilder()
    builder.setProtoField(obj.protoField)
    builder.setVarargs(obj.varargs)
    return builder.build()
  }
}
