// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: workoutTrackerService.proto

package workoutTrackerService;

/**
 * Protobuf type {@code WorkoutDetailResponse}
 */
public  final class WorkoutDetailResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:WorkoutDetailResponse)
    WorkoutDetailResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkoutDetailResponse.newBuilder() to construct.
  private WorkoutDetailResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkoutDetailResponse() {
    burnedCalories_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WorkoutDetailResponse(
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

            burnedCalories_ = input.readInt32();
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
    return workoutTrackerService.WorkoutTrackerServiceImpl.internal_static_WorkoutDetailResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return workoutTrackerService.WorkoutTrackerServiceImpl.internal_static_WorkoutDetailResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            workoutTrackerService.WorkoutDetailResponse.class, workoutTrackerService.WorkoutDetailResponse.Builder.class);
  }

  public static final int BURNEDCALORIES_FIELD_NUMBER = 1;
  private int burnedCalories_;
  /**
   * <code>int32 burnedCalories = 1;</code>
   */
  public int getBurnedCalories() {
    return burnedCalories_;
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
    if (burnedCalories_ != 0) {
      output.writeInt32(1, burnedCalories_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (burnedCalories_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, burnedCalories_);
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
    if (!(obj instanceof workoutTrackerService.WorkoutDetailResponse)) {
      return super.equals(obj);
    }
    workoutTrackerService.WorkoutDetailResponse other = (workoutTrackerService.WorkoutDetailResponse) obj;

    boolean result = true;
    result = result && (getBurnedCalories()
        == other.getBurnedCalories());
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
    hash = (37 * hash) + BURNEDCALORIES_FIELD_NUMBER;
    hash = (53 * hash) + getBurnedCalories();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static workoutTrackerService.WorkoutDetailResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static workoutTrackerService.WorkoutDetailResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static workoutTrackerService.WorkoutDetailResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static workoutTrackerService.WorkoutDetailResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static workoutTrackerService.WorkoutDetailResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static workoutTrackerService.WorkoutDetailResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static workoutTrackerService.WorkoutDetailResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static workoutTrackerService.WorkoutDetailResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static workoutTrackerService.WorkoutDetailResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static workoutTrackerService.WorkoutDetailResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static workoutTrackerService.WorkoutDetailResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static workoutTrackerService.WorkoutDetailResponse parseFrom(
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
  public static Builder newBuilder(workoutTrackerService.WorkoutDetailResponse prototype) {
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
   * Protobuf type {@code WorkoutDetailResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:WorkoutDetailResponse)
      workoutTrackerService.WorkoutDetailResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return workoutTrackerService.WorkoutTrackerServiceImpl.internal_static_WorkoutDetailResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return workoutTrackerService.WorkoutTrackerServiceImpl.internal_static_WorkoutDetailResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              workoutTrackerService.WorkoutDetailResponse.class, workoutTrackerService.WorkoutDetailResponse.Builder.class);
    }

    // Construct using workoutTrackerService.WorkoutDetailResponse.newBuilder()
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
      burnedCalories_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return workoutTrackerService.WorkoutTrackerServiceImpl.internal_static_WorkoutDetailResponse_descriptor;
    }

    @java.lang.Override
    public workoutTrackerService.WorkoutDetailResponse getDefaultInstanceForType() {
      return workoutTrackerService.WorkoutDetailResponse.getDefaultInstance();
    }

    @java.lang.Override
    public workoutTrackerService.WorkoutDetailResponse build() {
      workoutTrackerService.WorkoutDetailResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public workoutTrackerService.WorkoutDetailResponse buildPartial() {
      workoutTrackerService.WorkoutDetailResponse result = new workoutTrackerService.WorkoutDetailResponse(this);
      result.burnedCalories_ = burnedCalories_;
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
      if (other instanceof workoutTrackerService.WorkoutDetailResponse) {
        return mergeFrom((workoutTrackerService.WorkoutDetailResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(workoutTrackerService.WorkoutDetailResponse other) {
      if (other == workoutTrackerService.WorkoutDetailResponse.getDefaultInstance()) return this;
      if (other.getBurnedCalories() != 0) {
        setBurnedCalories(other.getBurnedCalories());
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
      workoutTrackerService.WorkoutDetailResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (workoutTrackerService.WorkoutDetailResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int burnedCalories_ ;
    /**
     * <code>int32 burnedCalories = 1;</code>
     */
    public int getBurnedCalories() {
      return burnedCalories_;
    }
    /**
     * <code>int32 burnedCalories = 1;</code>
     */
    public Builder setBurnedCalories(int value) {
      
      burnedCalories_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 burnedCalories = 1;</code>
     */
    public Builder clearBurnedCalories() {
      
      burnedCalories_ = 0;
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


    // @@protoc_insertion_point(builder_scope:WorkoutDetailResponse)
  }

  // @@protoc_insertion_point(class_scope:WorkoutDetailResponse)
  private static final workoutTrackerService.WorkoutDetailResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new workoutTrackerService.WorkoutDetailResponse();
  }

  public static workoutTrackerService.WorkoutDetailResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkoutDetailResponse>
      PARSER = new com.google.protobuf.AbstractParser<WorkoutDetailResponse>() {
    @java.lang.Override
    public WorkoutDetailResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WorkoutDetailResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkoutDetailResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkoutDetailResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public workoutTrackerService.WorkoutDetailResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

