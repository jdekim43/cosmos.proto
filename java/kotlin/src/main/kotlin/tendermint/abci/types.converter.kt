// Transform from tendermint/abci/types.proto
package tendermint.abci

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampMapper
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType
import tendermint.crypto.ProofOpsMapper
import tendermint.crypto.PublicKeyMapper
import tendermint.types.ConsensusParamsMapper
import tendermint.types.HeaderMapper

public object RequestMapper : ProtobufTypeMapper<Request, Types.Request> {
  public override val descriptor: Descriptors.Descriptor = Types.Request.getDescriptor()

  public override val parser: Parser<Types.Request> = Types.Request.parser()

  public override fun convert(obj: Types.Request): Request = Request(
  	`value` = mapOf(
  1 to { Request.ValueOneOf.Echo(RequestEchoMapper.convert(obj.echo)) },
  2 to { Request.ValueOneOf.Flush(RequestFlushMapper.convert(obj.flush)) },
  3 to { Request.ValueOneOf.Info(RequestInfoMapper.convert(obj.info)) },
  5 to { Request.ValueOneOf.InitChain(RequestInitChainMapper.convert(obj.initChain)) },
  6 to { Request.ValueOneOf.Query(RequestQueryMapper.convert(obj.query)) },
  7 to { Request.ValueOneOf.BeginBlock(RequestBeginBlockMapper.convert(obj.beginBlock)) },
  8 to { Request.ValueOneOf.CheckTx(RequestCheckTxMapper.convert(obj.checkTx)) },
  9 to { Request.ValueOneOf.DeliverTx(RequestDeliverTxMapper.convert(obj.deliverTx)) },
  10 to { Request.ValueOneOf.EndBlock(RequestEndBlockMapper.convert(obj.endBlock)) },
  11 to { Request.ValueOneOf.Commit(RequestCommitMapper.convert(obj.commit)) },
  12 to { Request.ValueOneOf.ListSnapshots(RequestListSnapshotsMapper.convert(obj.listSnapshots)) },
  13 to { Request.ValueOneOf.OfferSnapshot(RequestOfferSnapshotMapper.convert(obj.offerSnapshot)) },
  14 to {
      Request.ValueOneOf.LoadSnapshotChunk(RequestLoadSnapshotChunkMapper.convert(obj.loadSnapshotChunk))
      },
  15 to {
      Request.ValueOneOf.ApplySnapshotChunk(RequestApplySnapshotChunkMapper.convert(obj.applySnapshotChunk))
      },
  16 to {
      Request.ValueOneOf.PrepareProposal(RequestPrepareProposalMapper.convert(obj.prepareProposal))
      },
  17 to {
      Request.ValueOneOf.ProcessProposal(RequestProcessProposalMapper.convert(obj.processProposal))
      },
  ).getValue(obj.valueCase.number)(),
  )

  public override fun convert(obj: Request): Types.Request {
    val builder = Types.Request.newBuilder()
    when (obj.`value`) {
      is Request.ValueOneOf.Echo -> builder.setEcho(RequestEchoMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.Flush -> builder.setFlush(RequestFlushMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.Info -> builder.setInfo(RequestInfoMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.InitChain ->
          builder.setInitChain(RequestInitChainMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.Query -> builder.setQuery(RequestQueryMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.BeginBlock ->
          builder.setBeginBlock(RequestBeginBlockMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.CheckTx ->
          builder.setCheckTx(RequestCheckTxMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.DeliverTx ->
          builder.setDeliverTx(RequestDeliverTxMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.EndBlock ->
          builder.setEndBlock(RequestEndBlockMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.Commit ->
          builder.setCommit(RequestCommitMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.ListSnapshots ->
          builder.setListSnapshots(RequestListSnapshotsMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.OfferSnapshot ->
          builder.setOfferSnapshot(RequestOfferSnapshotMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.LoadSnapshotChunk ->
          builder.setLoadSnapshotChunk(RequestLoadSnapshotChunkMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.ApplySnapshotChunk ->
          builder.setApplySnapshotChunk(RequestApplySnapshotChunkMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.PrepareProposal ->
          builder.setPrepareProposal(RequestPrepareProposalMapper.convert(obj.`value`.value))
      is Request.ValueOneOf.ProcessProposal ->
          builder.setProcessProposal(RequestProcessProposalMapper.convert(obj.`value`.value))
    }
    return builder.build()
  }
}

public object RequestEchoMapper : ProtobufTypeMapper<RequestEcho, Types.RequestEcho> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestEcho.getDescriptor()

  public override val parser: Parser<Types.RequestEcho> = Types.RequestEcho.parser()

  public override fun convert(obj: Types.RequestEcho): RequestEcho = RequestEcho(
  	message = obj.message,
  )

  public override fun convert(obj: RequestEcho): Types.RequestEcho {
    val builder = Types.RequestEcho.newBuilder()
    builder.setMessage(obj.message)
    return builder.build()
  }
}

public object RequestFlushMapper : ProtobufTypeMapper<RequestFlush, Types.RequestFlush> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestFlush.getDescriptor()

  public override val parser: Parser<Types.RequestFlush> = Types.RequestFlush.parser()

  public override fun convert(obj: Types.RequestFlush): RequestFlush = RequestFlush(
  )

  public override fun convert(obj: RequestFlush): Types.RequestFlush {
    val builder = Types.RequestFlush.newBuilder()
    return builder.build()
  }
}

public object RequestInfoMapper : ProtobufTypeMapper<RequestInfo, Types.RequestInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestInfo.getDescriptor()

  public override val parser: Parser<Types.RequestInfo> = Types.RequestInfo.parser()

  public override fun convert(obj: Types.RequestInfo): RequestInfo = RequestInfo(
  	version = obj.version,
  	blockVersion = obj.blockVersion.asKotlinType,
  	p2PVersion = obj.p2PVersion.asKotlinType,
  	abciVersion = obj.abciVersion,
  )

  public override fun convert(obj: RequestInfo): Types.RequestInfo {
    val builder = Types.RequestInfo.newBuilder()
    builder.setVersion(obj.version)
    builder.setBlockVersion(obj.blockVersion.asJavaType)
    builder.setP2PVersion(obj.p2PVersion.asJavaType)
    builder.setAbciVersion(obj.abciVersion)
    return builder.build()
  }
}

public object RequestInitChainMapper : ProtobufTypeMapper<RequestInitChain, Types.RequestInitChain>
    {
  public override val descriptor: Descriptors.Descriptor = Types.RequestInitChain.getDescriptor()

  public override val parser: Parser<Types.RequestInitChain> = Types.RequestInitChain.parser()

  public override fun convert(obj: Types.RequestInitChain): RequestInitChain = RequestInitChain(
  	time = TimestampMapper.convert(obj.time),
  	chainId = obj.chainId,
  	consensusParams = ConsensusParamsMapper.convert(obj.consensusParams),
  	validators = obj.validatorsList.map { ValidatorUpdateMapper.convert(it) },
  	appStateBytes = obj.appStateBytes.toByteArray(),
  	initialHeight = obj.initialHeight,
  )

  public override fun convert(obj: RequestInitChain): Types.RequestInitChain {
    val builder = Types.RequestInitChain.newBuilder()
    builder.setTime(TimestampMapper.convert(obj.time))
    builder.setChainId(obj.chainId)
    builder.setConsensusParams(ConsensusParamsMapper.convert(obj.consensusParams))
    builder.addAllValidators(obj.validators.map { ValidatorUpdateMapper.convert(it) })
    builder.setAppStateBytes(ByteString.copyFrom(obj.appStateBytes))
    builder.setInitialHeight(obj.initialHeight)
    return builder.build()
  }
}

public object RequestQueryMapper : ProtobufTypeMapper<RequestQuery, Types.RequestQuery> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestQuery.getDescriptor()

  public override val parser: Parser<Types.RequestQuery> = Types.RequestQuery.parser()

  public override fun convert(obj: Types.RequestQuery): RequestQuery = RequestQuery(
  	`data` = obj.`data`.toByteArray(),
  	path = obj.path,
  	height = obj.height,
  	prove = obj.prove,
  )

  public override fun convert(obj: RequestQuery): Types.RequestQuery {
    val builder = Types.RequestQuery.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    builder.setPath(obj.path)
    builder.setHeight(obj.height)
    builder.setProve(obj.prove)
    return builder.build()
  }
}

public object RequestBeginBlockMapper :
    ProtobufTypeMapper<RequestBeginBlock, Types.RequestBeginBlock> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestBeginBlock.getDescriptor()

  public override val parser: Parser<Types.RequestBeginBlock> = Types.RequestBeginBlock.parser()

  public override fun convert(obj: Types.RequestBeginBlock): RequestBeginBlock = RequestBeginBlock(
  	hash = obj.hash.toByteArray(),
  	`header` = HeaderMapper.convert(obj.`header`),
  	lastCommitInfo = CommitInfoMapper.convert(obj.lastCommitInfo),
  	byzantineValidators = obj.byzantineValidatorsList.map { MisbehaviorMapper.convert(it) },
  )

  public override fun convert(obj: RequestBeginBlock): Types.RequestBeginBlock {
    val builder = Types.RequestBeginBlock.newBuilder()
    builder.setHash(ByteString.copyFrom(obj.hash))
    builder.setHeader(HeaderMapper.convert(obj.`header`))
    builder.setLastCommitInfo(CommitInfoMapper.convert(obj.lastCommitInfo))
    builder.addAllByzantineValidators(obj.byzantineValidators.map { MisbehaviorMapper.convert(it) })
    return builder.build()
  }
}

public object RequestCheckTxMapper : ProtobufTypeMapper<RequestCheckTx, Types.RequestCheckTx> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestCheckTx.getDescriptor()

  public override val parser: Parser<Types.RequestCheckTx> = Types.RequestCheckTx.parser()

  public override fun convert(obj: Types.RequestCheckTx): RequestCheckTx = RequestCheckTx(
  	tx = obj.tx.toByteArray(),
  	type = CheckTxType.forNumber(obj.type.number),
  )

  public override fun convert(obj: RequestCheckTx): Types.RequestCheckTx {
    val builder = Types.RequestCheckTx.newBuilder()
    builder.setTx(ByteString.copyFrom(obj.tx))
    builder.setType(Types.CheckTxType.forNumber(obj.type.number))
    return builder.build()
  }
}

public object RequestDeliverTxMapper : ProtobufTypeMapper<RequestDeliverTx, Types.RequestDeliverTx>
    {
  public override val descriptor: Descriptors.Descriptor = Types.RequestDeliverTx.getDescriptor()

  public override val parser: Parser<Types.RequestDeliverTx> = Types.RequestDeliverTx.parser()

  public override fun convert(obj: Types.RequestDeliverTx): RequestDeliverTx = RequestDeliverTx(
  	tx = obj.tx.toByteArray(),
  )

  public override fun convert(obj: RequestDeliverTx): Types.RequestDeliverTx {
    val builder = Types.RequestDeliverTx.newBuilder()
    builder.setTx(ByteString.copyFrom(obj.tx))
    return builder.build()
  }
}

public object RequestEndBlockMapper : ProtobufTypeMapper<RequestEndBlock, Types.RequestEndBlock> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestEndBlock.getDescriptor()

  public override val parser: Parser<Types.RequestEndBlock> = Types.RequestEndBlock.parser()

  public override fun convert(obj: Types.RequestEndBlock): RequestEndBlock = RequestEndBlock(
  	height = obj.height,
  )

  public override fun convert(obj: RequestEndBlock): Types.RequestEndBlock {
    val builder = Types.RequestEndBlock.newBuilder()
    builder.setHeight(obj.height)
    return builder.build()
  }
}

public object RequestCommitMapper : ProtobufTypeMapper<RequestCommit, Types.RequestCommit> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestCommit.getDescriptor()

  public override val parser: Parser<Types.RequestCommit> = Types.RequestCommit.parser()

  public override fun convert(obj: Types.RequestCommit): RequestCommit = RequestCommit(
  )

  public override fun convert(obj: RequestCommit): Types.RequestCommit {
    val builder = Types.RequestCommit.newBuilder()
    return builder.build()
  }
}

public object RequestListSnapshotsMapper :
    ProtobufTypeMapper<RequestListSnapshots, Types.RequestListSnapshots> {
  public override val descriptor: Descriptors.Descriptor =
      Types.RequestListSnapshots.getDescriptor()

  public override val parser: Parser<Types.RequestListSnapshots> =
      Types.RequestListSnapshots.parser()

  public override fun convert(obj: Types.RequestListSnapshots): RequestListSnapshots =
      RequestListSnapshots(
  )

  public override fun convert(obj: RequestListSnapshots): Types.RequestListSnapshots {
    val builder = Types.RequestListSnapshots.newBuilder()
    return builder.build()
  }
}

public object RequestOfferSnapshotMapper :
    ProtobufTypeMapper<RequestOfferSnapshot, Types.RequestOfferSnapshot> {
  public override val descriptor: Descriptors.Descriptor =
      Types.RequestOfferSnapshot.getDescriptor()

  public override val parser: Parser<Types.RequestOfferSnapshot> =
      Types.RequestOfferSnapshot.parser()

  public override fun convert(obj: Types.RequestOfferSnapshot): RequestOfferSnapshot =
      RequestOfferSnapshot(
  	snapshot = SnapshotMapper.convert(obj.snapshot),
  	appHash = obj.appHash.toByteArray(),
  )

  public override fun convert(obj: RequestOfferSnapshot): Types.RequestOfferSnapshot {
    val builder = Types.RequestOfferSnapshot.newBuilder()
    builder.setSnapshot(SnapshotMapper.convert(obj.snapshot))
    builder.setAppHash(ByteString.copyFrom(obj.appHash))
    return builder.build()
  }
}

public object RequestLoadSnapshotChunkMapper :
    ProtobufTypeMapper<RequestLoadSnapshotChunk, Types.RequestLoadSnapshotChunk> {
  public override val descriptor: Descriptors.Descriptor =
      Types.RequestLoadSnapshotChunk.getDescriptor()

  public override val parser: Parser<Types.RequestLoadSnapshotChunk> =
      Types.RequestLoadSnapshotChunk.parser()

  public override fun convert(obj: Types.RequestLoadSnapshotChunk): RequestLoadSnapshotChunk =
      RequestLoadSnapshotChunk(
  	height = obj.height.asKotlinType,
  	format = obj.format.asKotlinType,
  	chunk = obj.chunk.asKotlinType,
  )

  public override fun convert(obj: RequestLoadSnapshotChunk): Types.RequestLoadSnapshotChunk {
    val builder = Types.RequestLoadSnapshotChunk.newBuilder()
    builder.setHeight(obj.height.asJavaType)
    builder.setFormat(obj.format.asJavaType)
    builder.setChunk(obj.chunk.asJavaType)
    return builder.build()
  }
}

public object RequestApplySnapshotChunkMapper :
    ProtobufTypeMapper<RequestApplySnapshotChunk, Types.RequestApplySnapshotChunk> {
  public override val descriptor: Descriptors.Descriptor =
      Types.RequestApplySnapshotChunk.getDescriptor()

  public override val parser: Parser<Types.RequestApplySnapshotChunk> =
      Types.RequestApplySnapshotChunk.parser()

  public override fun convert(obj: Types.RequestApplySnapshotChunk): RequestApplySnapshotChunk =
      RequestApplySnapshotChunk(
  	index = obj.index.asKotlinType,
  	chunk = obj.chunk.toByteArray(),
  	sender = obj.sender,
  )

  public override fun convert(obj: RequestApplySnapshotChunk): Types.RequestApplySnapshotChunk {
    val builder = Types.RequestApplySnapshotChunk.newBuilder()
    builder.setIndex(obj.index.asJavaType)
    builder.setChunk(ByteString.copyFrom(obj.chunk))
    builder.setSender(obj.sender)
    return builder.build()
  }
}

public object RequestPrepareProposalMapper :
    ProtobufTypeMapper<RequestPrepareProposal, Types.RequestPrepareProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Types.RequestPrepareProposal.getDescriptor()

  public override val parser: Parser<Types.RequestPrepareProposal> =
      Types.RequestPrepareProposal.parser()

  public override fun convert(obj: Types.RequestPrepareProposal): RequestPrepareProposal =
      RequestPrepareProposal(
  	maxTxBytes = obj.maxTxBytes,
  	txs = obj.txsList.map { it.toByteArray() },
  	localLastCommit = ExtendedCommitInfoMapper.convert(obj.localLastCommit),
  	misbehavior = obj.misbehaviorList.map { MisbehaviorMapper.convert(it) },
  	height = obj.height,
  	time = TimestampMapper.convert(obj.time),
  	nextValidatorsHash = obj.nextValidatorsHash.toByteArray(),
  	proposerAddress = obj.proposerAddress.toByteArray(),
  )

  public override fun convert(obj: RequestPrepareProposal): Types.RequestPrepareProposal {
    val builder = Types.RequestPrepareProposal.newBuilder()
    builder.setMaxTxBytes(obj.maxTxBytes)
    builder.addAllTxs(obj.txs.map { ByteString.copyFrom(it) })
    builder.setLocalLastCommit(ExtendedCommitInfoMapper.convert(obj.localLastCommit))
    builder.addAllMisbehavior(obj.misbehavior.map { MisbehaviorMapper.convert(it) })
    builder.setHeight(obj.height)
    builder.setTime(TimestampMapper.convert(obj.time))
    builder.setNextValidatorsHash(ByteString.copyFrom(obj.nextValidatorsHash))
    builder.setProposerAddress(ByteString.copyFrom(obj.proposerAddress))
    return builder.build()
  }
}

public object RequestProcessProposalMapper :
    ProtobufTypeMapper<RequestProcessProposal, Types.RequestProcessProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Types.RequestProcessProposal.getDescriptor()

  public override val parser: Parser<Types.RequestProcessProposal> =
      Types.RequestProcessProposal.parser()

  public override fun convert(obj: Types.RequestProcessProposal): RequestProcessProposal =
      RequestProcessProposal(
  	txs = obj.txsList.map { it.toByteArray() },
  	proposedLastCommit = CommitInfoMapper.convert(obj.proposedLastCommit),
  	misbehavior = obj.misbehaviorList.map { MisbehaviorMapper.convert(it) },
  	hash = obj.hash.toByteArray(),
  	height = obj.height,
  	time = TimestampMapper.convert(obj.time),
  	nextValidatorsHash = obj.nextValidatorsHash.toByteArray(),
  	proposerAddress = obj.proposerAddress.toByteArray(),
  )

  public override fun convert(obj: RequestProcessProposal): Types.RequestProcessProposal {
    val builder = Types.RequestProcessProposal.newBuilder()
    builder.addAllTxs(obj.txs.map { ByteString.copyFrom(it) })
    builder.setProposedLastCommit(CommitInfoMapper.convert(obj.proposedLastCommit))
    builder.addAllMisbehavior(obj.misbehavior.map { MisbehaviorMapper.convert(it) })
    builder.setHash(ByteString.copyFrom(obj.hash))
    builder.setHeight(obj.height)
    builder.setTime(TimestampMapper.convert(obj.time))
    builder.setNextValidatorsHash(ByteString.copyFrom(obj.nextValidatorsHash))
    builder.setProposerAddress(ByteString.copyFrom(obj.proposerAddress))
    return builder.build()
  }
}

public object ResponseMapper : ProtobufTypeMapper<Response, Types.Response> {
  public override val descriptor: Descriptors.Descriptor = Types.Response.getDescriptor()

  public override val parser: Parser<Types.Response> = Types.Response.parser()

  public override fun convert(obj: Types.Response): Response = Response(
  	`value` = mapOf(
  1 to { Response.ValueOneOf.Exception(ResponseExceptionMapper.convert(obj.exception)) },
  2 to { Response.ValueOneOf.Echo(ResponseEchoMapper.convert(obj.echo)) },
  3 to { Response.ValueOneOf.Flush(ResponseFlushMapper.convert(obj.flush)) },
  4 to { Response.ValueOneOf.Info(ResponseInfoMapper.convert(obj.info)) },
  6 to { Response.ValueOneOf.InitChain(ResponseInitChainMapper.convert(obj.initChain)) },
  7 to { Response.ValueOneOf.Query(ResponseQueryMapper.convert(obj.query)) },
  8 to { Response.ValueOneOf.BeginBlock(ResponseBeginBlockMapper.convert(obj.beginBlock)) },
  9 to { Response.ValueOneOf.CheckTx(ResponseCheckTxMapper.convert(obj.checkTx)) },
  10 to { Response.ValueOneOf.DeliverTx(ResponseDeliverTxMapper.convert(obj.deliverTx)) },
  11 to { Response.ValueOneOf.EndBlock(ResponseEndBlockMapper.convert(obj.endBlock)) },
  12 to { Response.ValueOneOf.Commit(ResponseCommitMapper.convert(obj.commit)) },
  13 to { Response.ValueOneOf.ListSnapshots(ResponseListSnapshotsMapper.convert(obj.listSnapshots))
      },
  14 to { Response.ValueOneOf.OfferSnapshot(ResponseOfferSnapshotMapper.convert(obj.offerSnapshot))
      },
  15 to {
      Response.ValueOneOf.LoadSnapshotChunk(ResponseLoadSnapshotChunkMapper.convert(obj.loadSnapshotChunk))
      },
  16 to {
      Response.ValueOneOf.ApplySnapshotChunk(ResponseApplySnapshotChunkMapper.convert(obj.applySnapshotChunk))
      },
  17 to {
      Response.ValueOneOf.PrepareProposal(ResponsePrepareProposalMapper.convert(obj.prepareProposal))
      },
  18 to {
      Response.ValueOneOf.ProcessProposal(ResponseProcessProposalMapper.convert(obj.processProposal))
      },
  ).getValue(obj.valueCase.number)(),
  )

  public override fun convert(obj: Response): Types.Response {
    val builder = Types.Response.newBuilder()
    when (obj.`value`) {
      is Response.ValueOneOf.Exception ->
          builder.setException(ResponseExceptionMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.Echo -> builder.setEcho(ResponseEchoMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.Flush ->
          builder.setFlush(ResponseFlushMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.Info -> builder.setInfo(ResponseInfoMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.InitChain ->
          builder.setInitChain(ResponseInitChainMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.Query ->
          builder.setQuery(ResponseQueryMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.BeginBlock ->
          builder.setBeginBlock(ResponseBeginBlockMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.CheckTx ->
          builder.setCheckTx(ResponseCheckTxMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.DeliverTx ->
          builder.setDeliverTx(ResponseDeliverTxMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.EndBlock ->
          builder.setEndBlock(ResponseEndBlockMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.Commit ->
          builder.setCommit(ResponseCommitMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.ListSnapshots ->
          builder.setListSnapshots(ResponseListSnapshotsMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.OfferSnapshot ->
          builder.setOfferSnapshot(ResponseOfferSnapshotMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.LoadSnapshotChunk ->
          builder.setLoadSnapshotChunk(ResponseLoadSnapshotChunkMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.ApplySnapshotChunk ->
          builder.setApplySnapshotChunk(ResponseApplySnapshotChunkMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.PrepareProposal ->
          builder.setPrepareProposal(ResponsePrepareProposalMapper.convert(obj.`value`.value))
      is Response.ValueOneOf.ProcessProposal ->
          builder.setProcessProposal(ResponseProcessProposalMapper.convert(obj.`value`.value))
    }
    return builder.build()
  }
}

public object ResponseExceptionMapper :
    ProtobufTypeMapper<ResponseException, Types.ResponseException> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseException.getDescriptor()

  public override val parser: Parser<Types.ResponseException> = Types.ResponseException.parser()

  public override fun convert(obj: Types.ResponseException): ResponseException = ResponseException(
  	error = obj.error,
  )

  public override fun convert(obj: ResponseException): Types.ResponseException {
    val builder = Types.ResponseException.newBuilder()
    builder.setError(obj.error)
    return builder.build()
  }
}

public object ResponseEchoMapper : ProtobufTypeMapper<ResponseEcho, Types.ResponseEcho> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseEcho.getDescriptor()

  public override val parser: Parser<Types.ResponseEcho> = Types.ResponseEcho.parser()

  public override fun convert(obj: Types.ResponseEcho): ResponseEcho = ResponseEcho(
  	message = obj.message,
  )

  public override fun convert(obj: ResponseEcho): Types.ResponseEcho {
    val builder = Types.ResponseEcho.newBuilder()
    builder.setMessage(obj.message)
    return builder.build()
  }
}

public object ResponseFlushMapper : ProtobufTypeMapper<ResponseFlush, Types.ResponseFlush> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseFlush.getDescriptor()

  public override val parser: Parser<Types.ResponseFlush> = Types.ResponseFlush.parser()

  public override fun convert(obj: Types.ResponseFlush): ResponseFlush = ResponseFlush(
  )

  public override fun convert(obj: ResponseFlush): Types.ResponseFlush {
    val builder = Types.ResponseFlush.newBuilder()
    return builder.build()
  }
}

public object ResponseInfoMapper : ProtobufTypeMapper<ResponseInfo, Types.ResponseInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseInfo.getDescriptor()

  public override val parser: Parser<Types.ResponseInfo> = Types.ResponseInfo.parser()

  public override fun convert(obj: Types.ResponseInfo): ResponseInfo = ResponseInfo(
  	`data` = obj.`data`,
  	version = obj.version,
  	appVersion = obj.appVersion.asKotlinType,
  	lastBlockHeight = obj.lastBlockHeight,
  	lastBlockAppHash = obj.lastBlockAppHash.toByteArray(),
  )

  public override fun convert(obj: ResponseInfo): Types.ResponseInfo {
    val builder = Types.ResponseInfo.newBuilder()
    builder.setData(obj.`data`)
    builder.setVersion(obj.version)
    builder.setAppVersion(obj.appVersion.asJavaType)
    builder.setLastBlockHeight(obj.lastBlockHeight)
    builder.setLastBlockAppHash(ByteString.copyFrom(obj.lastBlockAppHash))
    return builder.build()
  }
}

public object ResponseInitChainMapper :
    ProtobufTypeMapper<ResponseInitChain, Types.ResponseInitChain> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseInitChain.getDescriptor()

  public override val parser: Parser<Types.ResponseInitChain> = Types.ResponseInitChain.parser()

  public override fun convert(obj: Types.ResponseInitChain): ResponseInitChain = ResponseInitChain(
  	consensusParams = ConsensusParamsMapper.convert(obj.consensusParams),
  	validators = obj.validatorsList.map { ValidatorUpdateMapper.convert(it) },
  	appHash = obj.appHash.toByteArray(),
  )

  public override fun convert(obj: ResponseInitChain): Types.ResponseInitChain {
    val builder = Types.ResponseInitChain.newBuilder()
    builder.setConsensusParams(ConsensusParamsMapper.convert(obj.consensusParams))
    builder.addAllValidators(obj.validators.map { ValidatorUpdateMapper.convert(it) })
    builder.setAppHash(ByteString.copyFrom(obj.appHash))
    return builder.build()
  }
}

public object ResponseQueryMapper : ProtobufTypeMapper<ResponseQuery, Types.ResponseQuery> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseQuery.getDescriptor()

  public override val parser: Parser<Types.ResponseQuery> = Types.ResponseQuery.parser()

  public override fun convert(obj: Types.ResponseQuery): ResponseQuery = ResponseQuery(
  	code = obj.code.asKotlinType,
  	log = obj.log,
  	info = obj.info,
  	index = obj.index,
  	key = obj.key.toByteArray(),
  	`value` = obj.`value`.toByteArray(),
  	proofOps = ProofOpsMapper.convert(obj.proofOps),
  	height = obj.height,
  	codespace = obj.codespace,
  )

  public override fun convert(obj: ResponseQuery): Types.ResponseQuery {
    val builder = Types.ResponseQuery.newBuilder()
    builder.setCode(obj.code.asJavaType)
    builder.setLog(obj.log)
    builder.setInfo(obj.info)
    builder.setIndex(obj.index)
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    builder.setProofOps(ProofOpsMapper.convert(obj.proofOps))
    builder.setHeight(obj.height)
    builder.setCodespace(obj.codespace)
    return builder.build()
  }
}

public object ResponseBeginBlockMapper :
    ProtobufTypeMapper<ResponseBeginBlock, Types.ResponseBeginBlock> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseBeginBlock.getDescriptor()

  public override val parser: Parser<Types.ResponseBeginBlock> = Types.ResponseBeginBlock.parser()

  public override fun convert(obj: Types.ResponseBeginBlock): ResponseBeginBlock =
      ResponseBeginBlock(
  	events = obj.eventsList.map { EventMapper.convert(it) },
  )

  public override fun convert(obj: ResponseBeginBlock): Types.ResponseBeginBlock {
    val builder = Types.ResponseBeginBlock.newBuilder()
    builder.addAllEvents(obj.events.map { EventMapper.convert(it) })
    return builder.build()
  }
}

public object ResponseCheckTxMapper : ProtobufTypeMapper<ResponseCheckTx, Types.ResponseCheckTx> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseCheckTx.getDescriptor()

  public override val parser: Parser<Types.ResponseCheckTx> = Types.ResponseCheckTx.parser()

  public override fun convert(obj: Types.ResponseCheckTx): ResponseCheckTx = ResponseCheckTx(
  	code = obj.code.asKotlinType,
  	`data` = obj.`data`.toByteArray(),
  	log = obj.log,
  	info = obj.info,
  	gasWanted = obj.gasWanted,
  	gasUsed = obj.gasUsed,
  	events = obj.eventsList.map { EventMapper.convert(it) },
  	codespace = obj.codespace,
  	sender = obj.sender,
  	priority = obj.priority,
  	mempoolError = obj.mempoolError,
  )

  public override fun convert(obj: ResponseCheckTx): Types.ResponseCheckTx {
    val builder = Types.ResponseCheckTx.newBuilder()
    builder.setCode(obj.code.asJavaType)
    builder.setData(ByteString.copyFrom(obj.`data`))
    builder.setLog(obj.log)
    builder.setInfo(obj.info)
    builder.setGasWanted(obj.gasWanted)
    builder.setGasUsed(obj.gasUsed)
    builder.addAllEvents(obj.events.map { EventMapper.convert(it) })
    builder.setCodespace(obj.codespace)
    builder.setSender(obj.sender)
    builder.setPriority(obj.priority)
    builder.setMempoolError(obj.mempoolError)
    return builder.build()
  }
}

public object ResponseDeliverTxMapper :
    ProtobufTypeMapper<ResponseDeliverTx, Types.ResponseDeliverTx> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseDeliverTx.getDescriptor()

  public override val parser: Parser<Types.ResponseDeliverTx> = Types.ResponseDeliverTx.parser()

  public override fun convert(obj: Types.ResponseDeliverTx): ResponseDeliverTx = ResponseDeliverTx(
  	code = obj.code.asKotlinType,
  	`data` = obj.`data`.toByteArray(),
  	log = obj.log,
  	info = obj.info,
  	gasWanted = obj.gasWanted,
  	gasUsed = obj.gasUsed,
  	events = obj.eventsList.map { EventMapper.convert(it) },
  	codespace = obj.codespace,
  )

  public override fun convert(obj: ResponseDeliverTx): Types.ResponseDeliverTx {
    val builder = Types.ResponseDeliverTx.newBuilder()
    builder.setCode(obj.code.asJavaType)
    builder.setData(ByteString.copyFrom(obj.`data`))
    builder.setLog(obj.log)
    builder.setInfo(obj.info)
    builder.setGasWanted(obj.gasWanted)
    builder.setGasUsed(obj.gasUsed)
    builder.addAllEvents(obj.events.map { EventMapper.convert(it) })
    builder.setCodespace(obj.codespace)
    return builder.build()
  }
}

public object ResponseEndBlockMapper : ProtobufTypeMapper<ResponseEndBlock, Types.ResponseEndBlock>
    {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseEndBlock.getDescriptor()

  public override val parser: Parser<Types.ResponseEndBlock> = Types.ResponseEndBlock.parser()

  public override fun convert(obj: Types.ResponseEndBlock): ResponseEndBlock = ResponseEndBlock(
  	validatorUpdates = obj.validatorUpdatesList.map { ValidatorUpdateMapper.convert(it) },
  	consensusParamUpdates = ConsensusParamsMapper.convert(obj.consensusParamUpdates),
  	events = obj.eventsList.map { EventMapper.convert(it) },
  )

  public override fun convert(obj: ResponseEndBlock): Types.ResponseEndBlock {
    val builder = Types.ResponseEndBlock.newBuilder()
    builder.addAllValidatorUpdates(obj.validatorUpdates.map { ValidatorUpdateMapper.convert(it) })
    builder.setConsensusParamUpdates(ConsensusParamsMapper.convert(obj.consensusParamUpdates))
    builder.addAllEvents(obj.events.map { EventMapper.convert(it) })
    return builder.build()
  }
}

public object ResponseCommitMapper : ProtobufTypeMapper<ResponseCommit, Types.ResponseCommit> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseCommit.getDescriptor()

  public override val parser: Parser<Types.ResponseCommit> = Types.ResponseCommit.parser()

  public override fun convert(obj: Types.ResponseCommit): ResponseCommit = ResponseCommit(
  	`data` = obj.`data`.toByteArray(),
  	retainHeight = obj.retainHeight,
  )

  public override fun convert(obj: ResponseCommit): Types.ResponseCommit {
    val builder = Types.ResponseCommit.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    builder.setRetainHeight(obj.retainHeight)
    return builder.build()
  }
}

public object ResponseListSnapshotsMapper :
    ProtobufTypeMapper<ResponseListSnapshots, Types.ResponseListSnapshots> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ResponseListSnapshots.getDescriptor()

  public override val parser: Parser<Types.ResponseListSnapshots> =
      Types.ResponseListSnapshots.parser()

  public override fun convert(obj: Types.ResponseListSnapshots): ResponseListSnapshots =
      ResponseListSnapshots(
  	snapshots = obj.snapshotsList.map { SnapshotMapper.convert(it) },
  )

  public override fun convert(obj: ResponseListSnapshots): Types.ResponseListSnapshots {
    val builder = Types.ResponseListSnapshots.newBuilder()
    builder.addAllSnapshots(obj.snapshots.map { SnapshotMapper.convert(it) })
    return builder.build()
  }
}

public object ResponseOfferSnapshotMapper :
    ProtobufTypeMapper<ResponseOfferSnapshot, Types.ResponseOfferSnapshot> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ResponseOfferSnapshot.getDescriptor()

  public override val parser: Parser<Types.ResponseOfferSnapshot> =
      Types.ResponseOfferSnapshot.parser()

  public override fun convert(obj: Types.ResponseOfferSnapshot): ResponseOfferSnapshot =
      ResponseOfferSnapshot(
  	result = ResponseOfferSnapshot.Result.forNumber(obj.result.number),
  )

  public override fun convert(obj: ResponseOfferSnapshot): Types.ResponseOfferSnapshot {
    val builder = Types.ResponseOfferSnapshot.newBuilder()
    builder.setResult(Types.ResponseOfferSnapshot.Result.forNumber(obj.result.number))
    return builder.build()
  }
}

public object ResponseLoadSnapshotChunkMapper :
    ProtobufTypeMapper<ResponseLoadSnapshotChunk, Types.ResponseLoadSnapshotChunk> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ResponseLoadSnapshotChunk.getDescriptor()

  public override val parser: Parser<Types.ResponseLoadSnapshotChunk> =
      Types.ResponseLoadSnapshotChunk.parser()

  public override fun convert(obj: Types.ResponseLoadSnapshotChunk): ResponseLoadSnapshotChunk =
      ResponseLoadSnapshotChunk(
  	chunk = obj.chunk.toByteArray(),
  )

  public override fun convert(obj: ResponseLoadSnapshotChunk): Types.ResponseLoadSnapshotChunk {
    val builder = Types.ResponseLoadSnapshotChunk.newBuilder()
    builder.setChunk(ByteString.copyFrom(obj.chunk))
    return builder.build()
  }
}

public object ResponseApplySnapshotChunkMapper :
    ProtobufTypeMapper<ResponseApplySnapshotChunk, Types.ResponseApplySnapshotChunk> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ResponseApplySnapshotChunk.getDescriptor()

  public override val parser: Parser<Types.ResponseApplySnapshotChunk> =
      Types.ResponseApplySnapshotChunk.parser()

  public override fun convert(obj: Types.ResponseApplySnapshotChunk): ResponseApplySnapshotChunk =
      ResponseApplySnapshotChunk(
  	result = ResponseApplySnapshotChunk.Result.forNumber(obj.result.number),
  	refetchChunks = obj.refetchChunksList.map { it.asKotlinType },
  	rejectSenders = obj.rejectSendersList.map { it },
  )

  public override fun convert(obj: ResponseApplySnapshotChunk): Types.ResponseApplySnapshotChunk {
    val builder = Types.ResponseApplySnapshotChunk.newBuilder()
    builder.setResult(Types.ResponseApplySnapshotChunk.Result.forNumber(obj.result.number))
    builder.addAllRefetchChunks(obj.refetchChunks.map { it.asJavaType })
    builder.addAllRejectSenders(obj.rejectSenders.map { it })
    return builder.build()
  }
}

public object ResponsePrepareProposalMapper :
    ProtobufTypeMapper<ResponsePrepareProposal, Types.ResponsePrepareProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ResponsePrepareProposal.getDescriptor()

  public override val parser: Parser<Types.ResponsePrepareProposal> =
      Types.ResponsePrepareProposal.parser()

  public override fun convert(obj: Types.ResponsePrepareProposal): ResponsePrepareProposal =
      ResponsePrepareProposal(
  	txs = obj.txsList.map { it.toByteArray() },
  )

  public override fun convert(obj: ResponsePrepareProposal): Types.ResponsePrepareProposal {
    val builder = Types.ResponsePrepareProposal.newBuilder()
    builder.addAllTxs(obj.txs.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object ResponseProcessProposalMapper :
    ProtobufTypeMapper<ResponseProcessProposal, Types.ResponseProcessProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ResponseProcessProposal.getDescriptor()

  public override val parser: Parser<Types.ResponseProcessProposal> =
      Types.ResponseProcessProposal.parser()

  public override fun convert(obj: Types.ResponseProcessProposal): ResponseProcessProposal =
      ResponseProcessProposal(
  	status = ResponseProcessProposal.ProposalStatus.forNumber(obj.status.number),
  )

  public override fun convert(obj: ResponseProcessProposal): Types.ResponseProcessProposal {
    val builder = Types.ResponseProcessProposal.newBuilder()
    builder.setStatus(Types.ResponseProcessProposal.ProposalStatus.forNumber(obj.status.number))
    return builder.build()
  }
}

public object CommitInfoMapper : ProtobufTypeMapper<CommitInfo, Types.CommitInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.CommitInfo.getDescriptor()

  public override val parser: Parser<Types.CommitInfo> = Types.CommitInfo.parser()

  public override fun convert(obj: Types.CommitInfo): CommitInfo = CommitInfo(
  	round = obj.round,
  	votes = obj.votesList.map { VoteInfoMapper.convert(it) },
  )

  public override fun convert(obj: CommitInfo): Types.CommitInfo {
    val builder = Types.CommitInfo.newBuilder()
    builder.setRound(obj.round)
    builder.addAllVotes(obj.votes.map { VoteInfoMapper.convert(it) })
    return builder.build()
  }
}

public object ExtendedCommitInfoMapper :
    ProtobufTypeMapper<ExtendedCommitInfo, Types.ExtendedCommitInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.ExtendedCommitInfo.getDescriptor()

  public override val parser: Parser<Types.ExtendedCommitInfo> = Types.ExtendedCommitInfo.parser()

  public override fun convert(obj: Types.ExtendedCommitInfo): ExtendedCommitInfo =
      ExtendedCommitInfo(
  	round = obj.round,
  	votes = obj.votesList.map { ExtendedVoteInfoMapper.convert(it) },
  )

  public override fun convert(obj: ExtendedCommitInfo): Types.ExtendedCommitInfo {
    val builder = Types.ExtendedCommitInfo.newBuilder()
    builder.setRound(obj.round)
    builder.addAllVotes(obj.votes.map { ExtendedVoteInfoMapper.convert(it) })
    return builder.build()
  }
}

public object EventMapper : ProtobufTypeMapper<Event, Types.Event> {
  public override val descriptor: Descriptors.Descriptor = Types.Event.getDescriptor()

  public override val parser: Parser<Types.Event> = Types.Event.parser()

  public override fun convert(obj: Types.Event): Event = Event(
  	type = obj.type,
  	attributes = obj.attributesList.map { EventAttributeMapper.convert(it) },
  )

  public override fun convert(obj: Event): Types.Event {
    val builder = Types.Event.newBuilder()
    builder.setType(obj.type)
    builder.addAllAttributes(obj.attributes.map { EventAttributeMapper.convert(it) })
    return builder.build()
  }
}

public object EventAttributeMapper : ProtobufTypeMapper<EventAttribute, Types.EventAttribute> {
  public override val descriptor: Descriptors.Descriptor = Types.EventAttribute.getDescriptor()

  public override val parser: Parser<Types.EventAttribute> = Types.EventAttribute.parser()

  public override fun convert(obj: Types.EventAttribute): EventAttribute = EventAttribute(
  	key = obj.key,
  	`value` = obj.`value`,
  	index = obj.index,
  )

  public override fun convert(obj: EventAttribute): Types.EventAttribute {
    val builder = Types.EventAttribute.newBuilder()
    builder.setKey(obj.key)
    builder.setValue(obj.`value`)
    builder.setIndex(obj.index)
    return builder.build()
  }
}

public object TxResultMapper : ProtobufTypeMapper<TxResult, Types.TxResult> {
  public override val descriptor: Descriptors.Descriptor = Types.TxResult.getDescriptor()

  public override val parser: Parser<Types.TxResult> = Types.TxResult.parser()

  public override fun convert(obj: Types.TxResult): TxResult = TxResult(
  	height = obj.height,
  	index = obj.index.asKotlinType,
  	tx = obj.tx.toByteArray(),
  	result = ResponseDeliverTxMapper.convert(obj.result),
  )

  public override fun convert(obj: TxResult): Types.TxResult {
    val builder = Types.TxResult.newBuilder()
    builder.setHeight(obj.height)
    builder.setIndex(obj.index.asJavaType)
    builder.setTx(ByteString.copyFrom(obj.tx))
    builder.setResult(ResponseDeliverTxMapper.convert(obj.result))
    return builder.build()
  }
}

public object ValidatorMapper : ProtobufTypeMapper<Validator, Types.Validator> {
  public override val descriptor: Descriptors.Descriptor = Types.Validator.getDescriptor()

  public override val parser: Parser<Types.Validator> = Types.Validator.parser()

  public override fun convert(obj: Types.Validator): Validator = Validator(
  	address = obj.address.toByteArray(),
  	power = obj.power,
  )

  public override fun convert(obj: Validator): Types.Validator {
    val builder = Types.Validator.newBuilder()
    builder.setAddress(ByteString.copyFrom(obj.address))
    builder.setPower(obj.power)
    return builder.build()
  }
}

public object ValidatorUpdateMapper : ProtobufTypeMapper<ValidatorUpdate, Types.ValidatorUpdate> {
  public override val descriptor: Descriptors.Descriptor = Types.ValidatorUpdate.getDescriptor()

  public override val parser: Parser<Types.ValidatorUpdate> = Types.ValidatorUpdate.parser()

  public override fun convert(obj: Types.ValidatorUpdate): ValidatorUpdate = ValidatorUpdate(
  	pubKey = PublicKeyMapper.convert(obj.pubKey),
  	power = obj.power,
  )

  public override fun convert(obj: ValidatorUpdate): Types.ValidatorUpdate {
    val builder = Types.ValidatorUpdate.newBuilder()
    builder.setPubKey(PublicKeyMapper.convert(obj.pubKey))
    builder.setPower(obj.power)
    return builder.build()
  }
}

public object VoteInfoMapper : ProtobufTypeMapper<VoteInfo, Types.VoteInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.VoteInfo.getDescriptor()

  public override val parser: Parser<Types.VoteInfo> = Types.VoteInfo.parser()

  public override fun convert(obj: Types.VoteInfo): VoteInfo = VoteInfo(
  	validator = ValidatorMapper.convert(obj.validator),
  	signedLastBlock = obj.signedLastBlock,
  )

  public override fun convert(obj: VoteInfo): Types.VoteInfo {
    val builder = Types.VoteInfo.newBuilder()
    builder.setValidator(ValidatorMapper.convert(obj.validator))
    builder.setSignedLastBlock(obj.signedLastBlock)
    return builder.build()
  }
}

public object ExtendedVoteInfoMapper : ProtobufTypeMapper<ExtendedVoteInfo, Types.ExtendedVoteInfo>
    {
  public override val descriptor: Descriptors.Descriptor = Types.ExtendedVoteInfo.getDescriptor()

  public override val parser: Parser<Types.ExtendedVoteInfo> = Types.ExtendedVoteInfo.parser()

  public override fun convert(obj: Types.ExtendedVoteInfo): ExtendedVoteInfo = ExtendedVoteInfo(
  	validator = ValidatorMapper.convert(obj.validator),
  	signedLastBlock = obj.signedLastBlock,
  	voteExtension = obj.voteExtension.toByteArray(),
  )

  public override fun convert(obj: ExtendedVoteInfo): Types.ExtendedVoteInfo {
    val builder = Types.ExtendedVoteInfo.newBuilder()
    builder.setValidator(ValidatorMapper.convert(obj.validator))
    builder.setSignedLastBlock(obj.signedLastBlock)
    builder.setVoteExtension(ByteString.copyFrom(obj.voteExtension))
    return builder.build()
  }
}

public object MisbehaviorMapper : ProtobufTypeMapper<Misbehavior, Types.Misbehavior> {
  public override val descriptor: Descriptors.Descriptor = Types.Misbehavior.getDescriptor()

  public override val parser: Parser<Types.Misbehavior> = Types.Misbehavior.parser()

  public override fun convert(obj: Types.Misbehavior): Misbehavior = Misbehavior(
  	type = MisbehaviorType.forNumber(obj.type.number),
  	validator = ValidatorMapper.convert(obj.validator),
  	height = obj.height,
  	time = TimestampMapper.convert(obj.time),
  	totalVotingPower = obj.totalVotingPower,
  )

  public override fun convert(obj: Misbehavior): Types.Misbehavior {
    val builder = Types.Misbehavior.newBuilder()
    builder.setType(Types.MisbehaviorType.forNumber(obj.type.number))
    builder.setValidator(ValidatorMapper.convert(obj.validator))
    builder.setHeight(obj.height)
    builder.setTime(TimestampMapper.convert(obj.time))
    builder.setTotalVotingPower(obj.totalVotingPower)
    return builder.build()
  }
}

public object SnapshotMapper : ProtobufTypeMapper<Snapshot, Types.Snapshot> {
  public override val descriptor: Descriptors.Descriptor = Types.Snapshot.getDescriptor()

  public override val parser: Parser<Types.Snapshot> = Types.Snapshot.parser()

  public override fun convert(obj: Types.Snapshot): Snapshot = Snapshot(
  	height = obj.height.asKotlinType,
  	format = obj.format.asKotlinType,
  	chunks = obj.chunks.asKotlinType,
  	hash = obj.hash.toByteArray(),
  	metadata = obj.metadata.toByteArray(),
  )

  public override fun convert(obj: Snapshot): Types.Snapshot {
    val builder = Types.Snapshot.newBuilder()
    builder.setHeight(obj.height.asJavaType)
    builder.setFormat(obj.format.asJavaType)
    builder.setChunks(obj.chunks.asJavaType)
    builder.setHash(ByteString.copyFrom(obj.hash))
    builder.setMetadata(ByteString.copyFrom(obj.metadata))
    return builder.build()
  }
}
