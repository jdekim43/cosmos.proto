// Transform from cosmos/tx/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.tx.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import cosmos.crypto.multisig.v1beta1.CompactBitArrayJvmConverter
import cosmos.tx.signing.v1beta1.SignMode
import cosmos.tx.signing.v1beta1.Signing
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object TxJvmConverter : ProtobufTypeMapper<Tx, TxOuterClass.Tx> {
  public override val descriptor: Descriptors.Descriptor = TxOuterClass.Tx.getDescriptor()

  public override val parser: Parser<TxOuterClass.Tx> = TxOuterClass.Tx.parser()

  public override fun convert(obj: TxOuterClass.Tx): Tx = Tx(
  	body = TxBodyJvmConverter.convert(obj.body),
  	authInfo = AuthInfoJvmConverter.convert(obj.authInfo),
  	signatures = obj.signaturesList.map { it.toByteArray() },
  )

  public override fun convert(obj: Tx): TxOuterClass.Tx {
    val builder = TxOuterClass.Tx.newBuilder()
    builder.setBody(TxBodyJvmConverter.convert(obj.body))
    builder.setAuthInfo(AuthInfoJvmConverter.convert(obj.authInfo))
    builder.addAllSignatures(obj.signatures.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object TxRawJvmConverter : ProtobufTypeMapper<TxRaw, TxOuterClass.TxRaw> {
  public override val descriptor: Descriptors.Descriptor = TxOuterClass.TxRaw.getDescriptor()

  public override val parser: Parser<TxOuterClass.TxRaw> = TxOuterClass.TxRaw.parser()

  public override fun convert(obj: TxOuterClass.TxRaw): TxRaw = TxRaw(
  	bodyBytes = obj.bodyBytes.toByteArray(),
  	authInfoBytes = obj.authInfoBytes.toByteArray(),
  	signatures = obj.signaturesList.map { it.toByteArray() },
  )

  public override fun convert(obj: TxRaw): TxOuterClass.TxRaw {
    val builder = TxOuterClass.TxRaw.newBuilder()
    builder.setBodyBytes(ByteString.copyFrom(obj.bodyBytes))
    builder.setAuthInfoBytes(ByteString.copyFrom(obj.authInfoBytes))
    builder.addAllSignatures(obj.signatures.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object SignDocJvmConverter : ProtobufTypeMapper<SignDoc, TxOuterClass.SignDoc> {
  public override val descriptor: Descriptors.Descriptor = TxOuterClass.SignDoc.getDescriptor()

  public override val parser: Parser<TxOuterClass.SignDoc> = TxOuterClass.SignDoc.parser()

  public override fun convert(obj: TxOuterClass.SignDoc): SignDoc = SignDoc(
  	bodyBytes = obj.bodyBytes.toByteArray(),
  	authInfoBytes = obj.authInfoBytes.toByteArray(),
  	chainId = obj.chainId,
  	accountNumber = obj.accountNumber.asKotlinType,
  )

  public override fun convert(obj: SignDoc): TxOuterClass.SignDoc {
    val builder = TxOuterClass.SignDoc.newBuilder()
    builder.setBodyBytes(ByteString.copyFrom(obj.bodyBytes))
    builder.setAuthInfoBytes(ByteString.copyFrom(obj.authInfoBytes))
    builder.setChainId(obj.chainId)
    builder.setAccountNumber(obj.accountNumber.asJavaType)
    return builder.build()
  }
}

public object SignDocDirectAuxJvmConverter :
    ProtobufTypeMapper<SignDocDirectAux, TxOuterClass.SignDocDirectAux> {
  public override val descriptor: Descriptors.Descriptor =
      TxOuterClass.SignDocDirectAux.getDescriptor()

  public override val parser: Parser<TxOuterClass.SignDocDirectAux> =
      TxOuterClass.SignDocDirectAux.parser()

  public override fun convert(obj: TxOuterClass.SignDocDirectAux): SignDocDirectAux =
      SignDocDirectAux(
  	bodyBytes = obj.bodyBytes.toByteArray(),
  	publicKey = AnyJvmConverter.convert(obj.publicKey),
  	chainId = obj.chainId,
  	accountNumber = obj.accountNumber.asKotlinType,
  	sequence = obj.sequence.asKotlinType,
  	tip = TipJvmConverter.convert(obj.tip),
  )

  public override fun convert(obj: SignDocDirectAux): TxOuterClass.SignDocDirectAux {
    val builder = TxOuterClass.SignDocDirectAux.newBuilder()
    builder.setBodyBytes(ByteString.copyFrom(obj.bodyBytes))
    builder.setPublicKey(AnyJvmConverter.convert(obj.publicKey))
    builder.setChainId(obj.chainId)
    builder.setAccountNumber(obj.accountNumber.asJavaType)
    builder.setSequence(obj.sequence.asJavaType)
    builder.setTip(TipJvmConverter.convert(obj.tip))
    return builder.build()
  }
}

public object TxBodyJvmConverter : ProtobufTypeMapper<TxBody, TxOuterClass.TxBody> {
  public override val descriptor: Descriptors.Descriptor = TxOuterClass.TxBody.getDescriptor()

  public override val parser: Parser<TxOuterClass.TxBody> = TxOuterClass.TxBody.parser()

  public override fun convert(obj: TxOuterClass.TxBody): TxBody = TxBody(
  	messages = obj.messagesList.map { AnyJvmConverter.convert(it) },
  	memo = obj.memo,
  	timeoutHeight = obj.timeoutHeight.asKotlinType,
  	extensionOptions = obj.extensionOptionsList.map { AnyJvmConverter.convert(it) },
  	nonCriticalExtensionOptions = obj.nonCriticalExtensionOptionsList.map {
      AnyJvmConverter.convert(it) },
  )

  public override fun convert(obj: TxBody): TxOuterClass.TxBody {
    val builder = TxOuterClass.TxBody.newBuilder()
    builder.addAllMessages(obj.messages.map { AnyJvmConverter.convert(it) })
    builder.setMemo(obj.memo)
    builder.setTimeoutHeight(obj.timeoutHeight.asJavaType)
    builder.addAllExtensionOptions(obj.extensionOptions.map { AnyJvmConverter.convert(it) })
    builder.addAllNonCriticalExtensionOptions(obj.nonCriticalExtensionOptions.map {
        AnyJvmConverter.convert(it) })
    return builder.build()
  }
}

public object AuthInfoJvmConverter : ProtobufTypeMapper<AuthInfo, TxOuterClass.AuthInfo> {
  public override val descriptor: Descriptors.Descriptor = TxOuterClass.AuthInfo.getDescriptor()

  public override val parser: Parser<TxOuterClass.AuthInfo> = TxOuterClass.AuthInfo.parser()

  public override fun convert(obj: TxOuterClass.AuthInfo): AuthInfo = AuthInfo(
  	signerInfos = obj.signerInfosList.map { SignerInfoJvmConverter.convert(it) },
  	fee = FeeJvmConverter.convert(obj.fee),
  	tip = TipJvmConverter.convert(obj.tip),
  )

  public override fun convert(obj: AuthInfo): TxOuterClass.AuthInfo {
    val builder = TxOuterClass.AuthInfo.newBuilder()
    builder.addAllSignerInfos(obj.signerInfos.map { SignerInfoJvmConverter.convert(it) })
    builder.setFee(FeeJvmConverter.convert(obj.fee))
    builder.setTip(TipJvmConverter.convert(obj.tip))
    return builder.build()
  }
}

public object SignerInfoJvmConverter : ProtobufTypeMapper<SignerInfo, TxOuterClass.SignerInfo> {
  public override val descriptor: Descriptors.Descriptor = TxOuterClass.SignerInfo.getDescriptor()

  public override val parser: Parser<TxOuterClass.SignerInfo> = TxOuterClass.SignerInfo.parser()

  public override fun convert(obj: TxOuterClass.SignerInfo): SignerInfo = SignerInfo(
  	publicKey = AnyJvmConverter.convert(obj.publicKey),
  	modeInfo = ModeInfoJvmConverter.convert(obj.modeInfo),
  	sequence = obj.sequence.asKotlinType,
  )

  public override fun convert(obj: SignerInfo): TxOuterClass.SignerInfo {
    val builder = TxOuterClass.SignerInfo.newBuilder()
    builder.setPublicKey(AnyJvmConverter.convert(obj.publicKey))
    builder.setModeInfo(ModeInfoJvmConverter.convert(obj.modeInfo))
    builder.setSequence(obj.sequence.asJavaType)
    return builder.build()
  }
}

public object ModeInfoJvmConverter : ProtobufTypeMapper<ModeInfo, TxOuterClass.ModeInfo> {
  public override val descriptor: Descriptors.Descriptor = TxOuterClass.ModeInfo.getDescriptor()

  public override val parser: Parser<TxOuterClass.ModeInfo> = TxOuterClass.ModeInfo.parser()

  public override fun convert(obj: TxOuterClass.ModeInfo): ModeInfo = ModeInfo(
  	sum = mapOf(
  1 to { ModeInfo.SumOneOf.Single(SingleJvmConverter.convert(obj.single)) },
  2 to { ModeInfo.SumOneOf.Multi(MultiJvmConverter.convert(obj.multi)) },
  ).getValue(obj.sumCase.number)(),
  )

  public override fun convert(obj: ModeInfo): TxOuterClass.ModeInfo {
    val builder = TxOuterClass.ModeInfo.newBuilder()
    when (obj.sum) {
      is ModeInfo.SumOneOf.Single -> builder.setSingle(SingleJvmConverter.convert(obj.sum.value))
      is ModeInfo.SumOneOf.Multi -> builder.setMulti(MultiJvmConverter.convert(obj.sum.value))
    }
    return builder.build()
  }

  public object SingleJvmConverter :
      ProtobufTypeMapper<ModeInfo.Single, TxOuterClass.ModeInfo.Single> {
    public override val descriptor: Descriptors.Descriptor =
        TxOuterClass.ModeInfo.Single.getDescriptor()

    public override val parser: Parser<TxOuterClass.ModeInfo.Single> =
        TxOuterClass.ModeInfo.Single.parser()

    public override fun convert(obj: TxOuterClass.ModeInfo.Single): ModeInfo.Single =
        ModeInfo.Single(
    	mode = SignMode.forNumber(obj.mode.number),
    )

    public override fun convert(obj: ModeInfo.Single): TxOuterClass.ModeInfo.Single {
      val builder = TxOuterClass.ModeInfo.Single.newBuilder()
      builder.setMode(Signing.SignMode.forNumber(obj.mode.number))
      return builder.build()
    }
  }

  public object MultiJvmConverter : ProtobufTypeMapper<ModeInfo.Multi, TxOuterClass.ModeInfo.Multi>
      {
    public override val descriptor: Descriptors.Descriptor =
        TxOuterClass.ModeInfo.Multi.getDescriptor()

    public override val parser: Parser<TxOuterClass.ModeInfo.Multi> =
        TxOuterClass.ModeInfo.Multi.parser()

    public override fun convert(obj: TxOuterClass.ModeInfo.Multi): ModeInfo.Multi = ModeInfo.Multi(
    	bitarray = CompactBitArrayJvmConverter.convert(obj.bitarray),
    	modeInfos = obj.modeInfosList.map { ModeInfoJvmConverter.convert(it) },
    )

    public override fun convert(obj: ModeInfo.Multi): TxOuterClass.ModeInfo.Multi {
      val builder = TxOuterClass.ModeInfo.Multi.newBuilder()
      builder.setBitarray(CompactBitArrayJvmConverter.convert(obj.bitarray))
      builder.addAllModeInfos(obj.modeInfos.map { ModeInfoJvmConverter.convert(it) })
      return builder.build()
    }
  }
}

public object FeeJvmConverter : ProtobufTypeMapper<Fee, TxOuterClass.Fee> {
  public override val descriptor: Descriptors.Descriptor = TxOuterClass.Fee.getDescriptor()

  public override val parser: Parser<TxOuterClass.Fee> = TxOuterClass.Fee.parser()

  public override fun convert(obj: TxOuterClass.Fee): Fee = Fee(
  	amount = obj.amountList.map { CoinJvmConverter.convert(it) },
  	gasLimit = obj.gasLimit.asKotlinType,
  	payer = obj.payer,
  	granter = obj.granter,
  )

  public override fun convert(obj: Fee): TxOuterClass.Fee {
    val builder = TxOuterClass.Fee.newBuilder()
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    builder.setGasLimit(obj.gasLimit.asJavaType)
    builder.setPayer(obj.payer)
    builder.setGranter(obj.granter)
    return builder.build()
  }
}

public object TipJvmConverter : ProtobufTypeMapper<Tip, TxOuterClass.Tip> {
  public override val descriptor: Descriptors.Descriptor = TxOuterClass.Tip.getDescriptor()

  public override val parser: Parser<TxOuterClass.Tip> = TxOuterClass.Tip.parser()

  public override fun convert(obj: TxOuterClass.Tip): Tip = Tip(
  	amount = obj.amountList.map { CoinJvmConverter.convert(it) },
  	tipper = obj.tipper,
  )

  public override fun convert(obj: Tip): TxOuterClass.Tip {
    val builder = TxOuterClass.Tip.newBuilder()
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    builder.setTipper(obj.tipper)
    return builder.build()
  }
}

public object AuxSignerDataJvmConverter :
    ProtobufTypeMapper<AuxSignerData, TxOuterClass.AuxSignerData> {
  public override val descriptor: Descriptors.Descriptor =
      TxOuterClass.AuxSignerData.getDescriptor()

  public override val parser: Parser<TxOuterClass.AuxSignerData> =
      TxOuterClass.AuxSignerData.parser()

  public override fun convert(obj: TxOuterClass.AuxSignerData): AuxSignerData = AuxSignerData(
  	address = obj.address,
  	signDoc = SignDocDirectAuxJvmConverter.convert(obj.signDoc),
  	mode = SignMode.forNumber(obj.mode.number),
  	sig = obj.sig.toByteArray(),
  )

  public override fun convert(obj: AuxSignerData): TxOuterClass.AuxSignerData {
    val builder = TxOuterClass.AuxSignerData.newBuilder()
    builder.setAddress(obj.address)
    builder.setSignDoc(SignDocDirectAuxJvmConverter.convert(obj.signDoc))
    builder.setMode(Signing.SignMode.forNumber(obj.mode.number))
    builder.setSig(ByteString.copyFrom(obj.sig))
    return builder.build()
  }
}
