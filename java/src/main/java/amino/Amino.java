// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: amino/amino.proto

package amino;

public final class Amino {
  private Amino() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(amino.Amino.name);
    registry.add(amino.Amino.messageEncoding);
    registry.add(amino.Amino.encoding);
    registry.add(amino.Amino.fieldName);
    registry.add(amino.Amino.dontOmitempty);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int NAME_FIELD_NUMBER = 11110001;
  /**
   * <pre>
   * name is the string used when registering a concrete
   * type into the Amino type registry, via the Amino codec's
   * `RegisterConcrete()` method. This string MUST be at most 39
   * characters long, or else the message will be rejected by the
   * Ledger hardware device.
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.String> name = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int MESSAGE_ENCODING_FIELD_NUMBER = 11110002;
  /**
   * <pre>
   * encoding describes the encoding format used by Amino for the given
   * message. The field type is chosen to be a string for
   * flexibility, but it should ideally be short and expected to be
   * machine-readable, for example "base64" or "utf8_json". We
   * highly recommend to use underscores for word separation instead of spaces.
   * If left empty, then the Amino encoding is expected to be the same as the
   * Protobuf one.
   * This annotation should not be confused with the `encoding`
   * one which operates on the field level.
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.String> messageEncoding = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int ENCODING_FIELD_NUMBER = 11110003;
  /**
   * <pre>
   * encoding describes the encoding format used by Amino for
   * the given field. The field type is chosen to be a string for
   * flexibility, but it should ideally be short and expected to be
   * machine-readable, for example "base64" or "utf8_json". We
   * highly recommend to use underscores for word separation instead of spaces.
   * If left empty, then the Amino encoding is expected to be the same as the
   * Protobuf one.
   * This annotation should not be confused with the
   * `message_encoding` one which operates on the message level.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.String> encoding = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int FIELD_NAME_FIELD_NUMBER = 11110004;
  /**
   * <pre>
   * field_name sets a different field name (i.e. key name) in
   * the amino JSON object for the given field.
   * Example:
   * message Foo {
   *   string bar = 1 [(amino.field_name) = "baz"];
   * }
   * Then the Amino encoding of Foo will be:
   * `{"baz":"some value"}`
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.String> fieldName = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int DONT_OMITEMPTY_FIELD_NUMBER = 11110005;
  /**
   * <pre>
   * dont_omitempty sets the field in the JSON object even if
   * its value is empty, i.e. equal to the Golang zero value. To learn what
   * the zero values are, see https://go.dev/ref/spec#The_zero_value.
   * Fields default to `omitempty`, which is the default behavior when this
   * annotation is unset. When set to true, then the field value in the
   * JSON object will be set, i.e. not `undefined`.
   * Example:
   * message Foo {
   *   string bar = 1;
   *   string baz = 2 [(amino.dont_omitempty) = true];
   * }
   * f := Foo{};
   * out := AminoJSONEncoder(&amp;f);
   * out == {"baz":""}
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.Boolean> dontOmitempty = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021amino/amino.proto\022\005amino\032 google/proto" +
      "buf/descriptor.proto:0\n\004name\022\037.google.pr" +
      "otobuf.MessageOptions\030\361\214\246\005 \001(\t:<\n\020messag" +
      "e_encoding\022\037.google.protobuf.MessageOpti" +
      "ons\030\362\214\246\005 \001(\t:2\n\010encoding\022\035.google.protob" +
      "uf.FieldOptions\030\363\214\246\005 \001(\t:4\n\nfield_name\022\035" +
      ".google.protobuf.FieldOptions\030\364\214\246\005 \001(\t:8" +
      "\n\016dont_omitempty\022\035.google.protobuf.Field" +
      "Options\030\365\214\246\005 \001(\010B-Z+github.com/cosmos/co" +
      "smos-sdk/types/tx/aminob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    name.internalInit(descriptor.getExtensions().get(0));
    messageEncoding.internalInit(descriptor.getExtensions().get(1));
    encoding.internalInit(descriptor.getExtensions().get(2));
    fieldName.internalInit(descriptor.getExtensions().get(3));
    dontOmitempty.internalInit(descriptor.getExtensions().get(4));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
