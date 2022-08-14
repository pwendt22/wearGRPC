// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service4.proto

package AvgHeartBeat;

/**
 * Protobuf type {@code wearGRPC.GetHeartBeatRequest}
 */
public  final class GetHeartBeatRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wearGRPC.GetHeartBeatRequest)
    GetHeartBeatRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetHeartBeatRequest.newBuilder() to construct.
  private GetHeartBeatRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetHeartBeatRequest() {
    numberQual_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetHeartBeatRequest(
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
          case 8: {

            numberQual_ = input.readInt32();
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
    return AvgHeartBeat.Service4Impl.internal_static_wearGRPC_GetHeartBeatRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return AvgHeartBeat.Service4Impl.internal_static_wearGRPC_GetHeartBeatRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AvgHeartBeat.GetHeartBeatRequest.class, AvgHeartBeat.GetHeartBeatRequest.Builder.class);
  }

  public static final int NUMBERQUAL_FIELD_NUMBER = 1;
  private int numberQual_;
  /**
   * <code>int32 numberQual = 1;</code>
   */
  public int getNumberQual() {
    return numberQual_;
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
    if (numberQual_ != 0) {
      output.writeInt32(1, numberQual_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numberQual_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, numberQual_);
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
    if (!(obj instanceof AvgHeartBeat.GetHeartBeatRequest)) {
      return super.equals(obj);
    }
    AvgHeartBeat.GetHeartBeatRequest other = (AvgHeartBeat.GetHeartBeatRequest) obj;

    boolean result = true;
    result = result && (getNumberQual()
        == other.getNumberQual());
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
    hash = (37 * hash) + NUMBERQUAL_FIELD_NUMBER;
    hash = (53 * hash) + getNumberQual();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AvgHeartBeat.GetHeartBeatRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AvgHeartBeat.GetHeartBeatRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AvgHeartBeat.GetHeartBeatRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AvgHeartBeat.GetHeartBeatRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AvgHeartBeat.GetHeartBeatRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AvgHeartBeat.GetHeartBeatRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AvgHeartBeat.GetHeartBeatRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AvgHeartBeat.GetHeartBeatRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AvgHeartBeat.GetHeartBeatRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AvgHeartBeat.GetHeartBeatRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AvgHeartBeat.GetHeartBeatRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AvgHeartBeat.GetHeartBeatRequest parseFrom(
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
  public static Builder newBuilder(AvgHeartBeat.GetHeartBeatRequest prototype) {
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
   * Protobuf type {@code wearGRPC.GetHeartBeatRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wearGRPC.GetHeartBeatRequest)
      AvgHeartBeat.GetHeartBeatRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AvgHeartBeat.Service4Impl.internal_static_wearGRPC_GetHeartBeatRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AvgHeartBeat.Service4Impl.internal_static_wearGRPC_GetHeartBeatRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AvgHeartBeat.GetHeartBeatRequest.class, AvgHeartBeat.GetHeartBeatRequest.Builder.class);
    }

    // Construct using AvgHeartBeat.GetHeartBeatRequest.newBuilder()
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
      numberQual_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return AvgHeartBeat.Service4Impl.internal_static_wearGRPC_GetHeartBeatRequest_descriptor;
    }

    @java.lang.Override
    public AvgHeartBeat.GetHeartBeatRequest getDefaultInstanceForType() {
      return AvgHeartBeat.GetHeartBeatRequest.getDefaultInstance();
    }

    @java.lang.Override
    public AvgHeartBeat.GetHeartBeatRequest build() {
      AvgHeartBeat.GetHeartBeatRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public AvgHeartBeat.GetHeartBeatRequest buildPartial() {
      AvgHeartBeat.GetHeartBeatRequest result = new AvgHeartBeat.GetHeartBeatRequest(this);
      result.numberQual_ = numberQual_;
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
      if (other instanceof AvgHeartBeat.GetHeartBeatRequest) {
        return mergeFrom((AvgHeartBeat.GetHeartBeatRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AvgHeartBeat.GetHeartBeatRequest other) {
      if (other == AvgHeartBeat.GetHeartBeatRequest.getDefaultInstance()) return this;
      if (other.getNumberQual() != 0) {
        setNumberQual(other.getNumberQual());
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
      AvgHeartBeat.GetHeartBeatRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AvgHeartBeat.GetHeartBeatRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int numberQual_ ;
    /**
     * <code>int32 numberQual = 1;</code>
     */
    public int getNumberQual() {
      return numberQual_;
    }
    /**
     * <code>int32 numberQual = 1;</code>
     */
    public Builder setNumberQual(int value) {
      
      numberQual_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 numberQual = 1;</code>
     */
    public Builder clearNumberQual() {
      
      numberQual_ = 0;
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


    // @@protoc_insertion_point(builder_scope:wearGRPC.GetHeartBeatRequest)
  }

  // @@protoc_insertion_point(class_scope:wearGRPC.GetHeartBeatRequest)
  private static final AvgHeartBeat.GetHeartBeatRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AvgHeartBeat.GetHeartBeatRequest();
  }

  public static AvgHeartBeat.GetHeartBeatRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetHeartBeatRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetHeartBeatRequest>() {
    @java.lang.Override
    public GetHeartBeatRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetHeartBeatRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetHeartBeatRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetHeartBeatRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public AvgHeartBeat.GetHeartBeatRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
