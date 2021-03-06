// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lyft/lyft.proto

package com.proto.lyft;

/**
 * Protobuf type {@code lyft.ReadLyftResponse}
 */
public final class ReadLyftResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lyft.ReadLyftResponse)
    ReadLyftResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadLyftResponse.newBuilder() to construct.
  private ReadLyftResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadLyftResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReadLyftResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReadLyftResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.proto.lyft.Lyft.Builder subBuilder = null;
            if (lyft_ != null) {
              subBuilder = lyft_.toBuilder();
            }
            lyft_ = input.readMessage(com.proto.lyft.Lyft.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lyft_);
              lyft_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.proto.lyft.LyftOuterClass.internal_static_lyft_ReadLyftResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.lyft.LyftOuterClass.internal_static_lyft_ReadLyftResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.lyft.ReadLyftResponse.class, com.proto.lyft.ReadLyftResponse.Builder.class);
  }

  public static final int LYFT_FIELD_NUMBER = 1;
  private com.proto.lyft.Lyft lyft_;
  /**
   * <code>.lyft.Lyft lyft = 1;</code>
   * @return Whether the lyft field is set.
   */
  @java.lang.Override
  public boolean hasLyft() {
    return lyft_ != null;
  }
  /**
   * <code>.lyft.Lyft lyft = 1;</code>
   * @return The lyft.
   */
  @java.lang.Override
  public com.proto.lyft.Lyft getLyft() {
    return lyft_ == null ? com.proto.lyft.Lyft.getDefaultInstance() : lyft_;
  }
  /**
   * <code>.lyft.Lyft lyft = 1;</code>
   */
  @java.lang.Override
  public com.proto.lyft.LyftOrBuilder getLyftOrBuilder() {
    return getLyft();
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
    if (lyft_ != null) {
      output.writeMessage(1, getLyft());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lyft_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLyft());
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
    if (!(obj instanceof com.proto.lyft.ReadLyftResponse)) {
      return super.equals(obj);
    }
    com.proto.lyft.ReadLyftResponse other = (com.proto.lyft.ReadLyftResponse) obj;

    if (hasLyft() != other.hasLyft()) return false;
    if (hasLyft()) {
      if (!getLyft()
          .equals(other.getLyft())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLyft()) {
      hash = (37 * hash) + LYFT_FIELD_NUMBER;
      hash = (53 * hash) + getLyft().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.lyft.ReadLyftResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.lyft.ReadLyftResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.lyft.ReadLyftResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.lyft.ReadLyftResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.lyft.ReadLyftResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.lyft.ReadLyftResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.lyft.ReadLyftResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.lyft.ReadLyftResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.lyft.ReadLyftResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.lyft.ReadLyftResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.lyft.ReadLyftResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.lyft.ReadLyftResponse parseFrom(
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
  public static Builder newBuilder(com.proto.lyft.ReadLyftResponse prototype) {
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
   * Protobuf type {@code lyft.ReadLyftResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lyft.ReadLyftResponse)
      com.proto.lyft.ReadLyftResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.lyft.LyftOuterClass.internal_static_lyft_ReadLyftResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.lyft.LyftOuterClass.internal_static_lyft_ReadLyftResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.lyft.ReadLyftResponse.class, com.proto.lyft.ReadLyftResponse.Builder.class);
    }

    // Construct using com.proto.lyft.ReadLyftResponse.newBuilder()
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
      if (lyftBuilder_ == null) {
        lyft_ = null;
      } else {
        lyft_ = null;
        lyftBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.lyft.LyftOuterClass.internal_static_lyft_ReadLyftResponse_descriptor;
    }

    @java.lang.Override
    public com.proto.lyft.ReadLyftResponse getDefaultInstanceForType() {
      return com.proto.lyft.ReadLyftResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.lyft.ReadLyftResponse build() {
      com.proto.lyft.ReadLyftResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.lyft.ReadLyftResponse buildPartial() {
      com.proto.lyft.ReadLyftResponse result = new com.proto.lyft.ReadLyftResponse(this);
      if (lyftBuilder_ == null) {
        result.lyft_ = lyft_;
      } else {
        result.lyft_ = lyftBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.proto.lyft.ReadLyftResponse) {
        return mergeFrom((com.proto.lyft.ReadLyftResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.lyft.ReadLyftResponse other) {
      if (other == com.proto.lyft.ReadLyftResponse.getDefaultInstance()) return this;
      if (other.hasLyft()) {
        mergeLyft(other.getLyft());
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
      com.proto.lyft.ReadLyftResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.lyft.ReadLyftResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.lyft.Lyft lyft_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.lyft.Lyft, com.proto.lyft.Lyft.Builder, com.proto.lyft.LyftOrBuilder> lyftBuilder_;
    /**
     * <code>.lyft.Lyft lyft = 1;</code>
     * @return Whether the lyft field is set.
     */
    public boolean hasLyft() {
      return lyftBuilder_ != null || lyft_ != null;
    }
    /**
     * <code>.lyft.Lyft lyft = 1;</code>
     * @return The lyft.
     */
    public com.proto.lyft.Lyft getLyft() {
      if (lyftBuilder_ == null) {
        return lyft_ == null ? com.proto.lyft.Lyft.getDefaultInstance() : lyft_;
      } else {
        return lyftBuilder_.getMessage();
      }
    }
    /**
     * <code>.lyft.Lyft lyft = 1;</code>
     */
    public Builder setLyft(com.proto.lyft.Lyft value) {
      if (lyftBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lyft_ = value;
        onChanged();
      } else {
        lyftBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.lyft.Lyft lyft = 1;</code>
     */
    public Builder setLyft(
        com.proto.lyft.Lyft.Builder builderForValue) {
      if (lyftBuilder_ == null) {
        lyft_ = builderForValue.build();
        onChanged();
      } else {
        lyftBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.lyft.Lyft lyft = 1;</code>
     */
    public Builder mergeLyft(com.proto.lyft.Lyft value) {
      if (lyftBuilder_ == null) {
        if (lyft_ != null) {
          lyft_ =
            com.proto.lyft.Lyft.newBuilder(lyft_).mergeFrom(value).buildPartial();
        } else {
          lyft_ = value;
        }
        onChanged();
      } else {
        lyftBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.lyft.Lyft lyft = 1;</code>
     */
    public Builder clearLyft() {
      if (lyftBuilder_ == null) {
        lyft_ = null;
        onChanged();
      } else {
        lyft_ = null;
        lyftBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.lyft.Lyft lyft = 1;</code>
     */
    public com.proto.lyft.Lyft.Builder getLyftBuilder() {
      
      onChanged();
      return getLyftFieldBuilder().getBuilder();
    }
    /**
     * <code>.lyft.Lyft lyft = 1;</code>
     */
    public com.proto.lyft.LyftOrBuilder getLyftOrBuilder() {
      if (lyftBuilder_ != null) {
        return lyftBuilder_.getMessageOrBuilder();
      } else {
        return lyft_ == null ?
            com.proto.lyft.Lyft.getDefaultInstance() : lyft_;
      }
    }
    /**
     * <code>.lyft.Lyft lyft = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.lyft.Lyft, com.proto.lyft.Lyft.Builder, com.proto.lyft.LyftOrBuilder> 
        getLyftFieldBuilder() {
      if (lyftBuilder_ == null) {
        lyftBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.lyft.Lyft, com.proto.lyft.Lyft.Builder, com.proto.lyft.LyftOrBuilder>(
                getLyft(),
                getParentForChildren(),
                isClean());
        lyft_ = null;
      }
      return lyftBuilder_;
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


    // @@protoc_insertion_point(builder_scope:lyft.ReadLyftResponse)
  }

  // @@protoc_insertion_point(class_scope:lyft.ReadLyftResponse)
  private static final com.proto.lyft.ReadLyftResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.lyft.ReadLyftResponse();
  }

  public static com.proto.lyft.ReadLyftResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadLyftResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReadLyftResponse>() {
    @java.lang.Override
    public ReadLyftResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReadLyftResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadLyftResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadLyftResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.lyft.ReadLyftResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

