// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bank.proto

package org.example.stubs;

/**
 * Protobuf type {@code GetReservationByIdResponse}
 */
public  final class GetReservationByIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetReservationByIdResponse)
    GetReservationByIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetReservationByIdResponse.newBuilder() to construct.
  private GetReservationByIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetReservationByIdResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetReservationByIdResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetReservationByIdResponse(
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
            org.example.stubs.Reservation.Builder subBuilder = null;
            if (reservation_ != null) {
              subBuilder = reservation_.toBuilder();
            }
            reservation_ = input.readMessage(org.example.stubs.Reservation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(reservation_);
              reservation_ = subBuilder.buildPartial();
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
    return org.example.stubs.Bank.internal_static_GetReservationByIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.stubs.Bank.internal_static_GetReservationByIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.stubs.GetReservationByIdResponse.class, org.example.stubs.GetReservationByIdResponse.Builder.class);
  }

  public static final int RESERVATION_FIELD_NUMBER = 1;
  private org.example.stubs.Reservation reservation_;
  /**
   * <code>.Reservation reservation = 1;</code>
   * @return Whether the reservation field is set.
   */
  public boolean hasReservation() {
    return reservation_ != null;
  }
  /**
   * <code>.Reservation reservation = 1;</code>
   * @return The reservation.
   */
  public org.example.stubs.Reservation getReservation() {
    return reservation_ == null ? org.example.stubs.Reservation.getDefaultInstance() : reservation_;
  }
  /**
   * <code>.Reservation reservation = 1;</code>
   */
  public org.example.stubs.ReservationOrBuilder getReservationOrBuilder() {
    return getReservation();
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
    if (reservation_ != null) {
      output.writeMessage(1, getReservation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reservation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReservation());
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
    if (!(obj instanceof org.example.stubs.GetReservationByIdResponse)) {
      return super.equals(obj);
    }
    org.example.stubs.GetReservationByIdResponse other = (org.example.stubs.GetReservationByIdResponse) obj;

    if (hasReservation() != other.hasReservation()) return false;
    if (hasReservation()) {
      if (!getReservation()
          .equals(other.getReservation())) return false;
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
    if (hasReservation()) {
      hash = (37 * hash) + RESERVATION_FIELD_NUMBER;
      hash = (53 * hash) + getReservation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.stubs.GetReservationByIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.stubs.GetReservationByIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.stubs.GetReservationByIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.stubs.GetReservationByIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.stubs.GetReservationByIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.stubs.GetReservationByIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.stubs.GetReservationByIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.stubs.GetReservationByIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.stubs.GetReservationByIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.stubs.GetReservationByIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.stubs.GetReservationByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.stubs.GetReservationByIdResponse parseFrom(
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
  public static Builder newBuilder(org.example.stubs.GetReservationByIdResponse prototype) {
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
   * Protobuf type {@code GetReservationByIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetReservationByIdResponse)
      org.example.stubs.GetReservationByIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.stubs.Bank.internal_static_GetReservationByIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.stubs.Bank.internal_static_GetReservationByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.stubs.GetReservationByIdResponse.class, org.example.stubs.GetReservationByIdResponse.Builder.class);
    }

    // Construct using org.example.stubs.GetReservationByIdResponse.newBuilder()
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
      if (reservationBuilder_ == null) {
        reservation_ = null;
      } else {
        reservation_ = null;
        reservationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.stubs.Bank.internal_static_GetReservationByIdResponse_descriptor;
    }

    @java.lang.Override
    public org.example.stubs.GetReservationByIdResponse getDefaultInstanceForType() {
      return org.example.stubs.GetReservationByIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.stubs.GetReservationByIdResponse build() {
      org.example.stubs.GetReservationByIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.stubs.GetReservationByIdResponse buildPartial() {
      org.example.stubs.GetReservationByIdResponse result = new org.example.stubs.GetReservationByIdResponse(this);
      if (reservationBuilder_ == null) {
        result.reservation_ = reservation_;
      } else {
        result.reservation_ = reservationBuilder_.build();
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
      if (other instanceof org.example.stubs.GetReservationByIdResponse) {
        return mergeFrom((org.example.stubs.GetReservationByIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.stubs.GetReservationByIdResponse other) {
      if (other == org.example.stubs.GetReservationByIdResponse.getDefaultInstance()) return this;
      if (other.hasReservation()) {
        mergeReservation(other.getReservation());
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
      org.example.stubs.GetReservationByIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.stubs.GetReservationByIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.example.stubs.Reservation reservation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.stubs.Reservation, org.example.stubs.Reservation.Builder, org.example.stubs.ReservationOrBuilder> reservationBuilder_;
    /**
     * <code>.Reservation reservation = 1;</code>
     * @return Whether the reservation field is set.
     */
    public boolean hasReservation() {
      return reservationBuilder_ != null || reservation_ != null;
    }
    /**
     * <code>.Reservation reservation = 1;</code>
     * @return The reservation.
     */
    public org.example.stubs.Reservation getReservation() {
      if (reservationBuilder_ == null) {
        return reservation_ == null ? org.example.stubs.Reservation.getDefaultInstance() : reservation_;
      } else {
        return reservationBuilder_.getMessage();
      }
    }
    /**
     * <code>.Reservation reservation = 1;</code>
     */
    public Builder setReservation(org.example.stubs.Reservation value) {
      if (reservationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reservation_ = value;
        onChanged();
      } else {
        reservationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Reservation reservation = 1;</code>
     */
    public Builder setReservation(
        org.example.stubs.Reservation.Builder builderForValue) {
      if (reservationBuilder_ == null) {
        reservation_ = builderForValue.build();
        onChanged();
      } else {
        reservationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Reservation reservation = 1;</code>
     */
    public Builder mergeReservation(org.example.stubs.Reservation value) {
      if (reservationBuilder_ == null) {
        if (reservation_ != null) {
          reservation_ =
            org.example.stubs.Reservation.newBuilder(reservation_).mergeFrom(value).buildPartial();
        } else {
          reservation_ = value;
        }
        onChanged();
      } else {
        reservationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Reservation reservation = 1;</code>
     */
    public Builder clearReservation() {
      if (reservationBuilder_ == null) {
        reservation_ = null;
        onChanged();
      } else {
        reservation_ = null;
        reservationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Reservation reservation = 1;</code>
     */
    public org.example.stubs.Reservation.Builder getReservationBuilder() {
      
      onChanged();
      return getReservationFieldBuilder().getBuilder();
    }
    /**
     * <code>.Reservation reservation = 1;</code>
     */
    public org.example.stubs.ReservationOrBuilder getReservationOrBuilder() {
      if (reservationBuilder_ != null) {
        return reservationBuilder_.getMessageOrBuilder();
      } else {
        return reservation_ == null ?
            org.example.stubs.Reservation.getDefaultInstance() : reservation_;
      }
    }
    /**
     * <code>.Reservation reservation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.stubs.Reservation, org.example.stubs.Reservation.Builder, org.example.stubs.ReservationOrBuilder> 
        getReservationFieldBuilder() {
      if (reservationBuilder_ == null) {
        reservationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.example.stubs.Reservation, org.example.stubs.Reservation.Builder, org.example.stubs.ReservationOrBuilder>(
                getReservation(),
                getParentForChildren(),
                isClean());
        reservation_ = null;
      }
      return reservationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GetReservationByIdResponse)
  }

  // @@protoc_insertion_point(class_scope:GetReservationByIdResponse)
  private static final org.example.stubs.GetReservationByIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.stubs.GetReservationByIdResponse();
  }

  public static org.example.stubs.GetReservationByIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetReservationByIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetReservationByIdResponse>() {
    @java.lang.Override
    public GetReservationByIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetReservationByIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetReservationByIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetReservationByIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.stubs.GetReservationByIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

