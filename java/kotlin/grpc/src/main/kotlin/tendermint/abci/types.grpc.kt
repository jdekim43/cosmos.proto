// Transform from tendermint/abci/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")

package tendermint.abci

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ServerCalls
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax

public object ABCIApplicationService {
  private val descriptor: ServiceDescriptor = ABCIApplicationGrpc.getServiceDescriptor()!!

  private val echoDescriptor: MethodDescriptor<Types.RequestEcho, Types.ResponseEcho> =
      ABCIApplicationGrpc.getEchoMethod()!!

  private val flushDescriptor: MethodDescriptor<Types.RequestFlush, Types.ResponseFlush> =
      ABCIApplicationGrpc.getFlushMethod()!!

  private val infoDescriptor: MethodDescriptor<Types.RequestInfo, Types.ResponseInfo> =
      ABCIApplicationGrpc.getInfoMethod()!!

  private val deliverTxDescriptor: MethodDescriptor<Types.RequestDeliverTx, Types.ResponseDeliverTx>
      = ABCIApplicationGrpc.getDeliverTxMethod()!!

  private val checkTxDescriptor: MethodDescriptor<Types.RequestCheckTx, Types.ResponseCheckTx> =
      ABCIApplicationGrpc.getCheckTxMethod()!!

  private val queryDescriptor: MethodDescriptor<Types.RequestQuery, Types.ResponseQuery> =
      ABCIApplicationGrpc.getQueryMethod()!!

  private val commitDescriptor: MethodDescriptor<Types.RequestCommit, Types.ResponseCommit> =
      ABCIApplicationGrpc.getCommitMethod()!!

  private val initChainDescriptor: MethodDescriptor<Types.RequestInitChain, Types.ResponseInitChain>
      = ABCIApplicationGrpc.getInitChainMethod()!!

  private val beginBlockDescriptor:
      MethodDescriptor<Types.RequestBeginBlock, Types.ResponseBeginBlock> =
      ABCIApplicationGrpc.getBeginBlockMethod()!!

  private val endBlockDescriptor: MethodDescriptor<Types.RequestEndBlock, Types.ResponseEndBlock> =
      ABCIApplicationGrpc.getEndBlockMethod()!!

  private val listSnapshotsDescriptor:
      MethodDescriptor<Types.RequestListSnapshots, Types.ResponseListSnapshots> =
      ABCIApplicationGrpc.getListSnapshotsMethod()!!

  private val offerSnapshotDescriptor:
      MethodDescriptor<Types.RequestOfferSnapshot, Types.ResponseOfferSnapshot> =
      ABCIApplicationGrpc.getOfferSnapshotMethod()!!

  private val loadSnapshotChunkDescriptor:
      MethodDescriptor<Types.RequestLoadSnapshotChunk, Types.ResponseLoadSnapshotChunk> =
      ABCIApplicationGrpc.getLoadSnapshotChunkMethod()!!

  private val applySnapshotChunkDescriptor:
      MethodDescriptor<Types.RequestApplySnapshotChunk, Types.ResponseApplySnapshotChunk> =
      ABCIApplicationGrpc.getApplySnapshotChunkMethod()!!

  private val prepareProposalDescriptor:
      MethodDescriptor<Types.RequestPrepareProposal, Types.ResponsePrepareProposal> =
      ABCIApplicationGrpc.getPrepareProposalMethod()!!

  private val processProposalDescriptor:
      MethodDescriptor<Types.RequestProcessProposal, Types.ResponseProcessProposal> =
      ABCIApplicationGrpc.getProcessProposalMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext) {
    public open suspend fun echo(request: RequestEcho): ResponseEcho = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.Echo is unimplemented"))

    public open suspend fun flush(request: RequestFlush): ResponseFlush = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.Flush is unimplemented"))

    public open suspend fun info(request: RequestInfo): ResponseInfo = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.Info is unimplemented"))

    public open suspend fun deliverTx(request: RequestDeliverTx): ResponseDeliverTx = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.DeliverTx is unimplemented"))

    public open suspend fun checkTx(request: RequestCheckTx): ResponseCheckTx = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.CheckTx is unimplemented"))

    public open suspend fun query(request: RequestQuery): ResponseQuery = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.Query is unimplemented"))

    public open suspend fun commit(request: RequestCommit): ResponseCommit = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.Commit is unimplemented"))

    public open suspend fun initChain(request: RequestInitChain): ResponseInitChain = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.InitChain is unimplemented"))

    public open suspend fun beginBlock(request: RequestBeginBlock): ResponseBeginBlock = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.BeginBlock is unimplemented"))

    public open suspend fun endBlock(request: RequestEndBlock): ResponseEndBlock = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.EndBlock is unimplemented"))

    public open suspend fun listSnapshots(request: RequestListSnapshots): ResponseListSnapshots =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.ListSnapshots is unimplemented"))

    public open suspend fun offerSnapshot(request: RequestOfferSnapshot): ResponseOfferSnapshot =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.OfferSnapshot is unimplemented"))

    public open suspend fun loadSnapshotChunk(request: RequestLoadSnapshotChunk):
        ResponseLoadSnapshotChunk = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.LoadSnapshotChunk is unimplemented"))

    public open suspend fun applySnapshotChunk(request: RequestApplySnapshotChunk):
        ResponseApplySnapshotChunk = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.ApplySnapshotChunk is unimplemented"))

    public open suspend fun prepareProposal(request: RequestPrepareProposal):
        ResponsePrepareProposal = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.PrepareProposal is unimplemented"))

    public open suspend fun processProposal(request: RequestProcessProposal):
        ResponseProcessProposal = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.abci.ABCIApplication.ProcessProposal is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = echoDescriptor,
    				implementation = { ResponseEchoMapper.convert(echo(RequestEchoMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = flushDescriptor,
    				implementation = { ResponseFlushMapper.convert(flush(RequestFlushMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = infoDescriptor,
    				implementation = { ResponseInfoMapper.convert(info(RequestInfoMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = deliverTxDescriptor,
    				implementation = {
        ResponseDeliverTxMapper.convert(deliverTx(RequestDeliverTxMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = checkTxDescriptor,
    				implementation = { ResponseCheckTxMapper.convert(checkTx(RequestCheckTxMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = queryDescriptor,
    				implementation = { ResponseQueryMapper.convert(query(RequestQueryMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = commitDescriptor,
    				implementation = { ResponseCommitMapper.convert(commit(RequestCommitMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = initChainDescriptor,
    				implementation = {
        ResponseInitChainMapper.convert(initChain(RequestInitChainMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = beginBlockDescriptor,
    				implementation = {
        ResponseBeginBlockMapper.convert(beginBlock(RequestBeginBlockMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = endBlockDescriptor,
    				implementation = {
        ResponseEndBlockMapper.convert(endBlock(RequestEndBlockMapper.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = listSnapshotsDescriptor,
    				implementation = {
        ResponseListSnapshotsMapper.convert(listSnapshots(RequestListSnapshotsMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = offerSnapshotDescriptor,
    				implementation = {
        ResponseOfferSnapshotMapper.convert(offerSnapshot(RequestOfferSnapshotMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = loadSnapshotChunkDescriptor,
    				implementation = {
        ResponseLoadSnapshotChunkMapper.convert(loadSnapshotChunk(RequestLoadSnapshotChunkMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = applySnapshotChunkDescriptor,
    				implementation = {
        ResponseApplySnapshotChunkMapper.convert(applySnapshotChunk(RequestApplySnapshotChunkMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = prepareProposalDescriptor,
    				implementation = {
        ResponsePrepareProposalMapper.convert(prepareProposal(RequestPrepareProposalMapper.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = processProposalDescriptor,
    				implementation = {
        ResponseProcessProposalMapper.convert(processProposal(RequestProcessProposalMapper.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public class Client(
    channel: Channel,
    callOptions: CallOptions = CallOptions.DEFAULT,
  ) : AbstractCoroutineStub<Client>(channel = channel, callOptions = callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions): Client = Client(channel,
        callOptions)

    public suspend fun echo(request: RequestEcho, metadata: Metadata = Metadata()): ResponseEcho =
        ResponseEchoMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, echoDescriptor,
    			RequestEchoMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun flush(request: RequestFlush, metadata: Metadata = Metadata()): ResponseFlush
        = ResponseFlushMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, flushDescriptor,
    			RequestFlushMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun info(request: RequestInfo, metadata: Metadata = Metadata()): ResponseInfo =
        ResponseInfoMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, infoDescriptor,
    			RequestInfoMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun deliverTx(request: RequestDeliverTx, metadata: Metadata = Metadata()):
        ResponseDeliverTx = ResponseDeliverTxMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, deliverTxDescriptor,
    			RequestDeliverTxMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun checkTx(request: RequestCheckTx, metadata: Metadata = Metadata()):
        ResponseCheckTx = ResponseCheckTxMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, checkTxDescriptor,
    			RequestCheckTxMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun query(request: RequestQuery, metadata: Metadata = Metadata()): ResponseQuery
        = ResponseQueryMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, queryDescriptor,
    			RequestQueryMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun commit(request: RequestCommit, metadata: Metadata = Metadata()):
        ResponseCommit = ResponseCommitMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, commitDescriptor,
    			RequestCommitMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun initChain(request: RequestInitChain, metadata: Metadata = Metadata()):
        ResponseInitChain = ResponseInitChainMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, initChainDescriptor,
    			RequestInitChainMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun beginBlock(request: RequestBeginBlock, metadata: Metadata = Metadata()):
        ResponseBeginBlock = ResponseBeginBlockMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, beginBlockDescriptor,
    			RequestBeginBlockMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun endBlock(request: RequestEndBlock, metadata: Metadata = Metadata()):
        ResponseEndBlock = ResponseEndBlockMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, endBlockDescriptor,
    			RequestEndBlockMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun listSnapshots(request: RequestListSnapshots, metadata: Metadata =
        Metadata()): ResponseListSnapshots = ResponseListSnapshotsMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, listSnapshotsDescriptor,
    			RequestListSnapshotsMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun offerSnapshot(request: RequestOfferSnapshot, metadata: Metadata =
        Metadata()): ResponseOfferSnapshot = ResponseOfferSnapshotMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, offerSnapshotDescriptor,
    			RequestOfferSnapshotMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun loadSnapshotChunk(request: RequestLoadSnapshotChunk, metadata: Metadata =
        Metadata()): ResponseLoadSnapshotChunk = ResponseLoadSnapshotChunkMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, loadSnapshotChunkDescriptor,
    			RequestLoadSnapshotChunkMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun applySnapshotChunk(request: RequestApplySnapshotChunk, metadata: Metadata =
        Metadata()): ResponseApplySnapshotChunk = ResponseApplySnapshotChunkMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, applySnapshotChunkDescriptor,
    			RequestApplySnapshotChunkMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun prepareProposal(request: RequestPrepareProposal, metadata: Metadata =
        Metadata()): ResponsePrepareProposal = ResponsePrepareProposalMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, prepareProposalDescriptor,
    			RequestPrepareProposalMapper.convert(request),
    			callOptions, metadata,
    		),
    	)

    public suspend fun processProposal(request: RequestProcessProposal, metadata: Metadata =
        Metadata()): ResponseProcessProposal = ResponseProcessProposalMapper.convert(
    		ClientCalls.unaryRpc(
    			channel, processProposalDescriptor,
    			RequestProcessProposalMapper.convert(request),
    			callOptions, metadata,
    		),
    	)
  }
}
