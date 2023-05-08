// Transform from cosmos/base/reflection/v1beta1/reflection.proto
package cosmos.base.reflection.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ListAllInterfacesRequestMapper :
    ProtobufTypeMapper<ListAllInterfacesRequest, Reflection.ListAllInterfacesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.ListAllInterfacesRequest.getDescriptor()

  public override val parser: Parser<Reflection.ListAllInterfacesRequest> =
      Reflection.ListAllInterfacesRequest.parser()

  public override fun convert(obj: Reflection.ListAllInterfacesRequest): ListAllInterfacesRequest =
      ListAllInterfacesRequest(
  )

  public override fun convert(obj: ListAllInterfacesRequest): Reflection.ListAllInterfacesRequest {
    val builder = Reflection.ListAllInterfacesRequest.newBuilder()
    return builder.build()
  }
}

public object ListAllInterfacesResponseMapper :
    ProtobufTypeMapper<ListAllInterfacesResponse, Reflection.ListAllInterfacesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.ListAllInterfacesResponse.getDescriptor()

  public override val parser: Parser<Reflection.ListAllInterfacesResponse> =
      Reflection.ListAllInterfacesResponse.parser()

  public override fun convert(obj: Reflection.ListAllInterfacesResponse): ListAllInterfacesResponse
      = ListAllInterfacesResponse(
  	interfaceNames = obj.interfaceNamesList.map { it },
  )

  public override fun convert(obj: ListAllInterfacesResponse):
      Reflection.ListAllInterfacesResponse {
    val builder = Reflection.ListAllInterfacesResponse.newBuilder()
    builder.addAllInterfaceNames(obj.interfaceNames.map { it })
    return builder.build()
  }
}

public object ListImplementationsRequestMapper :
    ProtobufTypeMapper<ListImplementationsRequest, Reflection.ListImplementationsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.ListImplementationsRequest.getDescriptor()

  public override val parser: Parser<Reflection.ListImplementationsRequest> =
      Reflection.ListImplementationsRequest.parser()

  public override fun convert(obj: Reflection.ListImplementationsRequest):
      ListImplementationsRequest = ListImplementationsRequest(
  	interfaceName = obj.interfaceName,
  )

  public override fun convert(obj: ListImplementationsRequest):
      Reflection.ListImplementationsRequest {
    val builder = Reflection.ListImplementationsRequest.newBuilder()
    builder.setInterfaceName(obj.interfaceName)
    return builder.build()
  }
}

public object ListImplementationsResponseMapper :
    ProtobufTypeMapper<ListImplementationsResponse, Reflection.ListImplementationsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.ListImplementationsResponse.getDescriptor()

  public override val parser: Parser<Reflection.ListImplementationsResponse> =
      Reflection.ListImplementationsResponse.parser()

  public override fun convert(obj: Reflection.ListImplementationsResponse):
      ListImplementationsResponse = ListImplementationsResponse(
  	implementationMessageNames = obj.implementationMessageNamesList.map { it },
  )

  public override fun convert(obj: ListImplementationsResponse):
      Reflection.ListImplementationsResponse {
    val builder = Reflection.ListImplementationsResponse.newBuilder()
    builder.addAllImplementationMessageNames(obj.implementationMessageNames.map { it })
    return builder.build()
  }
}
