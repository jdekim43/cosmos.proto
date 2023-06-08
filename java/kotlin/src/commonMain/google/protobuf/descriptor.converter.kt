// Transform from google/protobuf/descriptor.proto
@file:GeneratorVersion(version = "0.2.2")

package google.protobuf

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public expect object FileDescriptorSetConverter : ProtobufConverter<FileDescriptorSet>

public expect object FileDescriptorProtoConverter : ProtobufConverter<FileDescriptorProto>

public expect object DescriptorProtoConverter : ProtobufConverter<DescriptorProto> {
  public object ExtensionRangeConverter : ProtobufConverter<DescriptorProto.ExtensionRange>

  public object ReservedRangeConverter : ProtobufConverter<DescriptorProto.ReservedRange>
}

public expect object ExtensionRangeOptionsConverter : ProtobufConverter<ExtensionRangeOptions>

public expect object FieldDescriptorProtoConverter : ProtobufConverter<FieldDescriptorProto>

public expect object OneofDescriptorProtoConverter : ProtobufConverter<OneofDescriptorProto>

public expect object EnumDescriptorProtoConverter : ProtobufConverter<EnumDescriptorProto> {
  public object EnumReservedRangeConverter :
      ProtobufConverter<EnumDescriptorProto.EnumReservedRange>
}

public expect object EnumValueDescriptorProtoConverter : ProtobufConverter<EnumValueDescriptorProto>

public expect object ServiceDescriptorProtoConverter : ProtobufConverter<ServiceDescriptorProto>

public expect object MethodDescriptorProtoConverter : ProtobufConverter<MethodDescriptorProto>

public expect object FileOptionsConverter : ProtobufConverter<FileOptions>

public expect object MessageOptionsConverter : ProtobufConverter<MessageOptions>

public expect object FieldOptionsConverter : ProtobufConverter<FieldOptions>

public expect object OneofOptionsConverter : ProtobufConverter<OneofOptions>

public expect object EnumOptionsConverter : ProtobufConverter<EnumOptions>

public expect object EnumValueOptionsConverter : ProtobufConverter<EnumValueOptions>

public expect object ServiceOptionsConverter : ProtobufConverter<ServiceOptions>

public expect object MethodOptionsConverter : ProtobufConverter<MethodOptions>

public expect object UninterpretedOptionConverter : ProtobufConverter<UninterpretedOption> {
  public object NamePartConverter : ProtobufConverter<UninterpretedOption.NamePart>
}

public expect object SourceCodeInfoConverter : ProtobufConverter<SourceCodeInfo> {
  public object LocationConverter : ProtobufConverter<SourceCodeInfo.Location>
}

public expect object GeneratedCodeInfoConverter : ProtobufConverter<GeneratedCodeInfo> {
  public object AnnotationConverter : ProtobufConverter<GeneratedCodeInfo.Annotation>
}
