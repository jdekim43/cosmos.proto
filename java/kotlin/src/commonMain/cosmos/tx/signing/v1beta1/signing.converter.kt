// Transform from cosmos/tx/signing/v1beta1/signing.proto
@file:GeneratorVersion(version = "0.2.1")

package cosmos.tx.signing.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object SignatureDescriptorsConverter : ProtobufConverter<SignatureDescriptors>

public expect object SignatureDescriptorConverter : ProtobufConverter<SignatureDescriptor> {
  public expect object DataConverter : ProtobufConverter<SignatureDescriptor.Data> {
    public expect object SingleConverter : ProtobufConverter<SignatureDescriptor.Data.Single>

    public expect object MultiConverter : ProtobufConverter<SignatureDescriptor.Data.Multi>
  }
}
