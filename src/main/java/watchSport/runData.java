// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package watchSport;

/**
 * Protobuf type {@code wearGRPC.runData}
 */
public  final class runData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wearGRPC.runData)
    runDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use runData.newBuilder() to construct.
  private runData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private runData() {
    runMode_ = "";
    steps_ = 0;
    time_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private runData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            runMode_ = s;
            break;
          }
          case 16: {

            steps_ = input.readInt32();
            break;
          }
          case 25: {

            time_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return watchSport.Service2Impl.internal_static_wearGRPC_runData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return watchSport.Service2Impl.internal_static_wearGRPC_runData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            watchSport.runData.class, watchSport.runData.Builder.class);
  }

  public static final int RUNMODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object runMode_;
  /**
   * <code>string runMode = 1;</code>
   */
  public java.lang.String getRunMode() {
    java.lang.Object ref = runMode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      runMode_ = s;
      return s;
    }
  }
  /**
   * <code>string runMode = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRunModeBytes() {
    java.lang.Object ref = runMode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      runMode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STEPS_FIELD_NUMBER = 2;
  private int steps_;
  /**
   * <code>int32 steps = 2;</code>
   */
  public int getSteps() {
    return steps_;
  }

  public static final int TIME_FIELD_NUMBER = 3;
  private double time_;
  /**
   * <code>double time = 3;</code>
   */
  public double getTime() {
    return time_;
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
    if (!getRunModeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, runMode_);
    }
    if (steps_ != 0) {
      output.writeInt32(2, steps_);
    }
    if (time_ != 0D) {
      output.writeDouble(3, time_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRunModeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, runMode_);
    }
    if (steps_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, steps_);
    }
    if (time_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, time_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof watchSport.runData)) {
      return super.equals(obj);
    }
    watchSport.runData other = (watchSport.runData) obj;

    boolean result = true;
    result = result && getRunMode()
        .equals(other.getRunMode());
    result = result && (getSteps()
        == other.getSteps());
    result = result && (
        java.lang.Double.doubleToLongBits(getTime())
        == java.lang.Double.doubleToLongBits(
            other.getTime()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RUNMODE_FIELD_NUMBER;
    hash = (53 * hash) + getRunMode().hashCode();
    hash = (37 * hash) + STEPS_FIELD_NUMBER;
    hash = (53 * hash) + getSteps();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTime()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static watchSport.runData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static watchSport.runData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static watchSport.runData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static watchSport.runData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static watchSport.runData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static watchSport.runData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static watchSport.runData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static watchSport.runData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static watchSport.runData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static watchSport.runData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static watchSport.runData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static watchSport.runData parseFrom(
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
  public static Builder newBuilder(watchSport.runData prototype) {
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
   * Protobuf type {@code wearGRPC.runData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wearGRPC.runData)
      watchSport.runDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return watchSport.Service2Impl.internal_static_wearGRPC_runData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return watchSport.Service2Impl.internal_static_wearGRPC_runData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              watchSport.runData.class, watchSport.runData.Builder.class);
    }

    // Construct using watchSport.runData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      runMode_ = "";

      steps_ = 0;

      time_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return watchSport.Service2Impl.internal_static_wearGRPC_runData_descriptor;
    }

    @java.lang.Override
    public watchSport.runData getDefaultInstanceForType() {
      return watchSport.runData.getDefaultInstance();
    }

    @java.lang.Override
    public watchSport.runData build() {
      watchSport.runData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public watchSport.runData buildPartial() {
      watchSport.runData result = new watchSport.runData(this);
      result.runMode_ = runMode_;
      result.steps_ = steps_;
      result.time_ = time_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof watchSport.runData) {
        return mergeFrom((watchSport.runData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(watchSport.runData other) {
      if (other == watchSport.runData.getDefaultInstance()) return this;
      if (!other.getRunMode().isEmpty()) {
        runMode_ = other.runMode_;
        onChanged();
      }
      if (other.getSteps() != 0) {
        setSteps(other.getSteps());
      }
      if (other.getTime() != 0D) {
        setTime(other.getTime());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      watchSport.runData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (watchSport.runData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object runMode_ = "";
    /**
     * <code>string runMode = 1;</code>
     */
    public java.lang.String getRunMode() {
      java.lang.Object ref = runMode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        runMode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string runMode = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRunModeBytes() {
      java.lang.Object ref = runMode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        runMode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string runMode = 1;</code>
     */
    public Builder setRunMode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      runMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string runMode = 1;</code>
     */
    public Builder clearRunMode() {
      
      runMode_ = getDefaultInstance().getRunMode();
      onChanged();
      return this;
    }
    /**
     * <code>string runMode = 1;</code>
     */
    public Builder setRunModeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      runMode_ = value;
      onChanged();
      return this;
    }

    private int steps_ ;
    /**
     * <code>int32 steps = 2;</code>
     */
    public int getSteps() {
      return steps_;
    }
    /**
     * <code>int32 steps = 2;</code>
     */
    public Builder setSteps(int value) {
      
      steps_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 steps = 2;</code>
     */
    public Builder clearSteps() {
      
      steps_ = 0;
      onChanged();
      return this;
    }

    private double time_ ;
    /**
     * <code>double time = 3;</code>
     */
    public double getTime() {
      return time_;
    }
    /**
     * <code>double time = 3;</code>
     */
    public Builder setTime(double value) {
      
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double time = 3;</code>
     */
    public Builder clearTime() {
      
      time_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:wearGRPC.runData)
  }

  // @@protoc_insertion_point(class_scope:wearGRPC.runData)
  private static final watchSport.runData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new watchSport.runData();
  }

  public static watchSport.runData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<runData>
      PARSER = new com.google.protobuf.AbstractParser<runData>() {
    @java.lang.Override
    public runData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new runData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<runData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<runData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public watchSport.runData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

