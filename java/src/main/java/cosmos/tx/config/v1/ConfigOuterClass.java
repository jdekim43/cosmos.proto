// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/config/v1/config.proto

package cosmos.tx.config.v1;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.tx.config.v1.Config)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * skip_ante_handler defines whether the ante handler registration should be skipped in case an app wants to override
     * this functionality.
     * </pre>
     *
     * <code>bool skip_ante_handler = 1;</code>
     * @return The skipAnteHandler.
     */
    boolean getSkipAnteHandler();

    /**
     * <pre>
     * skip_post_handler defines whether the post handler registration should be skipped in case an app wants to override
     * this functionality.
     * </pre>
     *
     * <code>bool skip_post_handler = 2;</code>
     * @return The skipPostHandler.
     */
    boolean getSkipPostHandler();
  }
  /**
   * <pre>
   * Config is the config object of the x/auth/tx package.
   * </pre>
   *
   * Protobuf type {@code cosmos.tx.config.v1.Config}
   */
  public static final class Config extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.tx.config.v1.Config)
      ConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Config.newBuilder() to construct.
    private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Config() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Config();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.tx.config.v1.ConfigOuterClass.internal_static_cosmos_tx_config_v1_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.tx.config.v1.ConfigOuterClass.internal_static_cosmos_tx_config_v1_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.tx.config.v1.ConfigOuterClass.Config.class, cosmos.tx.config.v1.ConfigOuterClass.Config.Builder.class);
    }

    public static final int SKIP_ANTE_HANDLER_FIELD_NUMBER = 1;
    private boolean skipAnteHandler_ = false;
    /**
     * <pre>
     * skip_ante_handler defines whether the ante handler registration should be skipped in case an app wants to override
     * this functionality.
     * </pre>
     *
     * <code>bool skip_ante_handler = 1;</code>
     * @return The skipAnteHandler.
     */
    @java.lang.Override
    public boolean getSkipAnteHandler() {
      return skipAnteHandler_;
    }

    public static final int SKIP_POST_HANDLER_FIELD_NUMBER = 2;
    private boolean skipPostHandler_ = false;
    /**
     * <pre>
     * skip_post_handler defines whether the post handler registration should be skipped in case an app wants to override
     * this functionality.
     * </pre>
     *
     * <code>bool skip_post_handler = 2;</code>
     * @return The skipPostHandler.
     */
    @java.lang.Override
    public boolean getSkipPostHandler() {
      return skipPostHandler_;
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
      if (skipAnteHandler_ != false) {
        output.writeBool(1, skipAnteHandler_);
      }
      if (skipPostHandler_ != false) {
        output.writeBool(2, skipPostHandler_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skipAnteHandler_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, skipAnteHandler_);
      }
      if (skipPostHandler_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, skipPostHandler_);
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
      if (!(obj instanceof cosmos.tx.config.v1.ConfigOuterClass.Config)) {
        return super.equals(obj);
      }
      cosmos.tx.config.v1.ConfigOuterClass.Config other = (cosmos.tx.config.v1.ConfigOuterClass.Config) obj;

      if (getSkipAnteHandler()
          != other.getSkipAnteHandler()) return false;
      if (getSkipPostHandler()
          != other.getSkipPostHandler()) return false;
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
      hash = (37 * hash) + SKIP_ANTE_HANDLER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSkipAnteHandler());
      hash = (37 * hash) + SKIP_POST_HANDLER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSkipPostHandler());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.tx.config.v1.ConfigOuterClass.Config parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.tx.config.v1.ConfigOuterClass.Config parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.tx.config.v1.ConfigOuterClass.Config parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.tx.config.v1.ConfigOuterClass.Config parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.tx.config.v1.ConfigOuterClass.Config parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.tx.config.v1.ConfigOuterClass.Config parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.tx.config.v1.ConfigOuterClass.Config parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.tx.config.v1.ConfigOuterClass.Config parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.tx.config.v1.ConfigOuterClass.Config parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.tx.config.v1.ConfigOuterClass.Config parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.tx.config.v1.ConfigOuterClass.Config parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.tx.config.v1.ConfigOuterClass.Config parseFrom(
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
    public static Builder newBuilder(cosmos.tx.config.v1.ConfigOuterClass.Config prototype) {
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
     * Config is the config object of the x/auth/tx package.
     * </pre>
     *
     * Protobuf type {@code cosmos.tx.config.v1.Config}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.tx.config.v1.Config)
        cosmos.tx.config.v1.ConfigOuterClass.ConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.tx.config.v1.ConfigOuterClass.internal_static_cosmos_tx_config_v1_Config_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.tx.config.v1.ConfigOuterClass.internal_static_cosmos_tx_config_v1_Config_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.tx.config.v1.ConfigOuterClass.Config.class, cosmos.tx.config.v1.ConfigOuterClass.Config.Builder.class);
      }

      // Construct using cosmos.tx.config.v1.ConfigOuterClass.Config.newBuilder()
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
        skipAnteHandler_ = false;
        skipPostHandler_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.tx.config.v1.ConfigOuterClass.internal_static_cosmos_tx_config_v1_Config_descriptor;
      }

      @java.lang.Override
      public cosmos.tx.config.v1.ConfigOuterClass.Config getDefaultInstanceForType() {
        return cosmos.tx.config.v1.ConfigOuterClass.Config.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.tx.config.v1.ConfigOuterClass.Config build() {
        cosmos.tx.config.v1.ConfigOuterClass.Config result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.tx.config.v1.ConfigOuterClass.Config buildPartial() {
        cosmos.tx.config.v1.ConfigOuterClass.Config result = new cosmos.tx.config.v1.ConfigOuterClass.Config(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(cosmos.tx.config.v1.ConfigOuterClass.Config result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.skipAnteHandler_ = skipAnteHandler_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.skipPostHandler_ = skipPostHandler_;
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
        if (other instanceof cosmos.tx.config.v1.ConfigOuterClass.Config) {
          return mergeFrom((cosmos.tx.config.v1.ConfigOuterClass.Config)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.tx.config.v1.ConfigOuterClass.Config other) {
        if (other == cosmos.tx.config.v1.ConfigOuterClass.Config.getDefaultInstance()) return this;
        if (other.getSkipAnteHandler() != false) {
          setSkipAnteHandler(other.getSkipAnteHandler());
        }
        if (other.getSkipPostHandler() != false) {
          setSkipPostHandler(other.getSkipPostHandler());
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
                skipAnteHandler_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                skipPostHandler_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private boolean skipAnteHandler_ ;
      /**
       * <pre>
       * skip_ante_handler defines whether the ante handler registration should be skipped in case an app wants to override
       * this functionality.
       * </pre>
       *
       * <code>bool skip_ante_handler = 1;</code>
       * @return The skipAnteHandler.
       */
      @java.lang.Override
      public boolean getSkipAnteHandler() {
        return skipAnteHandler_;
      }
      /**
       * <pre>
       * skip_ante_handler defines whether the ante handler registration should be skipped in case an app wants to override
       * this functionality.
       * </pre>
       *
       * <code>bool skip_ante_handler = 1;</code>
       * @param value The skipAnteHandler to set.
       * @return This builder for chaining.
       */
      public Builder setSkipAnteHandler(boolean value) {
        
        skipAnteHandler_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * skip_ante_handler defines whether the ante handler registration should be skipped in case an app wants to override
       * this functionality.
       * </pre>
       *
       * <code>bool skip_ante_handler = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkipAnteHandler() {
        bitField0_ = (bitField0_ & ~0x00000001);
        skipAnteHandler_ = false;
        onChanged();
        return this;
      }

      private boolean skipPostHandler_ ;
      /**
       * <pre>
       * skip_post_handler defines whether the post handler registration should be skipped in case an app wants to override
       * this functionality.
       * </pre>
       *
       * <code>bool skip_post_handler = 2;</code>
       * @return The skipPostHandler.
       */
      @java.lang.Override
      public boolean getSkipPostHandler() {
        return skipPostHandler_;
      }
      /**
       * <pre>
       * skip_post_handler defines whether the post handler registration should be skipped in case an app wants to override
       * this functionality.
       * </pre>
       *
       * <code>bool skip_post_handler = 2;</code>
       * @param value The skipPostHandler to set.
       * @return This builder for chaining.
       */
      public Builder setSkipPostHandler(boolean value) {
        
        skipPostHandler_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * skip_post_handler defines whether the post handler registration should be skipped in case an app wants to override
       * this functionality.
       * </pre>
       *
       * <code>bool skip_post_handler = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkipPostHandler() {
        bitField0_ = (bitField0_ & ~0x00000002);
        skipPostHandler_ = false;
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


      // @@protoc_insertion_point(builder_scope:cosmos.tx.config.v1.Config)
    }

    // @@protoc_insertion_point(class_scope:cosmos.tx.config.v1.Config)
    private static final cosmos.tx.config.v1.ConfigOuterClass.Config DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.tx.config.v1.ConfigOuterClass.Config();
    }

    public static cosmos.tx.config.v1.ConfigOuterClass.Config getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Config>
        PARSER = new com.google.protobuf.AbstractParser<Config>() {
      @java.lang.Override
      public Config parsePartialFrom(
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

    public static com.google.protobuf.Parser<Config> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Config> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cosmos.tx.config.v1.ConfigOuterClass.Config getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_config_v1_Config_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_config_v1_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n cosmos/tx/config/v1/config.proto\022\023cosm" +
      "os.tx.config.v1\032 cosmos/app/v1alpha1/mod" +
      "ule.proto\"n\n\006Config\022\031\n\021skip_ante_handler" +
      "\030\001 \001(\010\022\031\n\021skip_post_handler\030\002 \001(\010:.\272\300\226\332\001" +
      "(\n&github.com/cosmos/cosmos-sdk/x/auth/t" +
      "xb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cosmos.app.v1alpha1.Module.getDescriptor(),
        });
    internal_static_cosmos_tx_config_v1_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_tx_config_v1_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_config_v1_Config_descriptor,
        new java.lang.String[] { "SkipAnteHandler", "SkipPostHandler", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(cosmos.app.v1alpha1.Module.module);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    cosmos.app.v1alpha1.Module.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
