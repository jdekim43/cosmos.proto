// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/capability/module/v1/module.proto

package cosmos.capability.module.v1;

public final class ModuleOuterClass {
  private ModuleOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ModuleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.capability.module.v1.Module)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * seal_keeper defines if keeper.Seal() will run on BeginBlock() to prevent further modules from creating a scoped
     * keeper. For more details check x/capability/keeper.go.
     * </pre>
     *
     * <code>bool seal_keeper = 1;</code>
     * @return The sealKeeper.
     */
    boolean getSealKeeper();
  }
  /**
   * <pre>
   * Module is the config object of the capability module.
   * </pre>
   *
   * Protobuf type {@code cosmos.capability.module.v1.Module}
   */
  public static final class Module extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.capability.module.v1.Module)
      ModuleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Module.newBuilder() to construct.
    private Module(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Module() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Module();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.capability.module.v1.ModuleOuterClass.internal_static_cosmos_capability_module_v1_Module_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.capability.module.v1.ModuleOuterClass.internal_static_cosmos_capability_module_v1_Module_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.capability.module.v1.ModuleOuterClass.Module.class, cosmos.capability.module.v1.ModuleOuterClass.Module.Builder.class);
    }

    public static final int SEAL_KEEPER_FIELD_NUMBER = 1;
    private boolean sealKeeper_ = false;
    /**
     * <pre>
     * seal_keeper defines if keeper.Seal() will run on BeginBlock() to prevent further modules from creating a scoped
     * keeper. For more details check x/capability/keeper.go.
     * </pre>
     *
     * <code>bool seal_keeper = 1;</code>
     * @return The sealKeeper.
     */
    @java.lang.Override
    public boolean getSealKeeper() {
      return sealKeeper_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (sealKeeper_ != false) {
        output.writeBool(1, sealKeeper_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sealKeeper_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, sealKeeper_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof cosmos.capability.module.v1.ModuleOuterClass.Module)) {
        return super.equals(obj);
      }
      cosmos.capability.module.v1.ModuleOuterClass.Module other = (cosmos.capability.module.v1.ModuleOuterClass.Module) obj;

      if (getSealKeeper()
          != other.getSealKeeper()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SEAL_KEEPER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSealKeeper());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.capability.module.v1.ModuleOuterClass.Module parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.capability.module.v1.ModuleOuterClass.Module parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.capability.module.v1.ModuleOuterClass.Module parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.capability.module.v1.ModuleOuterClass.Module parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.capability.module.v1.ModuleOuterClass.Module parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.capability.module.v1.ModuleOuterClass.Module parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.capability.module.v1.ModuleOuterClass.Module parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.capability.module.v1.ModuleOuterClass.Module parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.capability.module.v1.ModuleOuterClass.Module parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.capability.module.v1.ModuleOuterClass.Module parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.capability.module.v1.ModuleOuterClass.Module parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.capability.module.v1.ModuleOuterClass.Module parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(cosmos.capability.module.v1.ModuleOuterClass.Module prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Module is the config object of the capability module.
     * </pre>
     *
     * Protobuf type {@code cosmos.capability.module.v1.Module}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.capability.module.v1.Module)
        cosmos.capability.module.v1.ModuleOuterClass.ModuleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.capability.module.v1.ModuleOuterClass.internal_static_cosmos_capability_module_v1_Module_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.capability.module.v1.ModuleOuterClass.internal_static_cosmos_capability_module_v1_Module_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.capability.module.v1.ModuleOuterClass.Module.class, cosmos.capability.module.v1.ModuleOuterClass.Module.Builder.class);
      }

      // Construct using cosmos.capability.module.v1.ModuleOuterClass.Module.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        sealKeeper_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.capability.module.v1.ModuleOuterClass.internal_static_cosmos_capability_module_v1_Module_descriptor;
      }

      @java.lang.Override
      public cosmos.capability.module.v1.ModuleOuterClass.Module getDefaultInstanceForType() {
        return cosmos.capability.module.v1.ModuleOuterClass.Module.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.capability.module.v1.ModuleOuterClass.Module build() {
        cosmos.capability.module.v1.ModuleOuterClass.Module result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.capability.module.v1.ModuleOuterClass.Module buildPartial() {
        cosmos.capability.module.v1.ModuleOuterClass.Module result = new cosmos.capability.module.v1.ModuleOuterClass.Module(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(cosmos.capability.module.v1.ModuleOuterClass.Module result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.sealKeeper_ = sealKeeper_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cosmos.capability.module.v1.ModuleOuterClass.Module) {
          return mergeFrom((cosmos.capability.module.v1.ModuleOuterClass.Module)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.capability.module.v1.ModuleOuterClass.Module other) {
        if (other == cosmos.capability.module.v1.ModuleOuterClass.Module.getDefaultInstance()) return this;
        if (other.getSealKeeper() != false) {
          setSealKeeper(other.getSealKeeper());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                sealKeeper_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private boolean sealKeeper_ ;
      /**
       * <pre>
       * seal_keeper defines if keeper.Seal() will run on BeginBlock() to prevent further modules from creating a scoped
       * keeper. For more details check x/capability/keeper.go.
       * </pre>
       *
       * <code>bool seal_keeper = 1;</code>
       * @return The sealKeeper.
       */
      @java.lang.Override
      public boolean getSealKeeper() {
        return sealKeeper_;
      }
      /**
       * <pre>
       * seal_keeper defines if keeper.Seal() will run on BeginBlock() to prevent further modules from creating a scoped
       * keeper. For more details check x/capability/keeper.go.
       * </pre>
       *
       * <code>bool seal_keeper = 1;</code>
       * @param value The sealKeeper to set.
       * @return This builder for chaining.
       */
      public Builder setSealKeeper(boolean value) {
        
        sealKeeper_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * seal_keeper defines if keeper.Seal() will run on BeginBlock() to prevent further modules from creating a scoped
       * keeper. For more details check x/capability/keeper.go.
       * </pre>
       *
       * <code>bool seal_keeper = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSealKeeper() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sealKeeper_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:cosmos.capability.module.v1.Module)
    }

    // @@protoc_insertion_point(class_scope:cosmos.capability.module.v1.Module)
    private static final cosmos.capability.module.v1.ModuleOuterClass.Module DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.capability.module.v1.ModuleOuterClass.Module();
    }

    public static cosmos.capability.module.v1.ModuleOuterClass.Module getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Module>
        PARSER = new com.google.protobuf.AbstractParser<Module>() {
      @java.lang.Override
      public Module parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Module> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Module> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cosmos.capability.module.v1.ModuleOuterClass.Module getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_capability_module_v1_Module_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_capability_module_v1_Module_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(cosmos/capability/module/v1/module.pro" +
      "to\022\033cosmos.capability.module.v1\032 cosmos/" +
      "app/v1alpha1/module.proto\"P\n\006Module\022\023\n\013s" +
      "eal_keeper\030\001 \001(\010:1\272\300\226\332\001+\n)github.com/cos" +
      "mos/cosmos-sdk/x/capabilityb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cosmos.app.v1alpha1.Module.getDescriptor(),
        });
    internal_static_cosmos_capability_module_v1_Module_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_capability_module_v1_Module_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_capability_module_v1_Module_descriptor,
        new java.lang.String[] { "SealKeeper", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(cosmos.app.v1alpha1.Module.module);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    cosmos.app.v1alpha1.Module.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
