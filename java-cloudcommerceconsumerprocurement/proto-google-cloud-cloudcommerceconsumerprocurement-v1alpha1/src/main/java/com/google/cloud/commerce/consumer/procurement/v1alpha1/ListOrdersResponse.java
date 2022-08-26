/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/commerce/consumer/procurement/v1alpha1/procurement_service.proto

package com.google.cloud.commerce.consumer.procurement.v1alpha1;

/**
 *
 *
 * <pre>
 * Response message for [ConsumerProcurementService.ListOrders][google.cloud.commerce.consumer.procurement.v1alpha1.ConsumerProcurementService.ListOrders].
 * </pre>
 *
 * Protobuf type {@code google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse}
 */
public final class ListOrdersResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse)
    ListOrdersResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListOrdersResponse.newBuilder() to construct.
  private ListOrdersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListOrdersResponse() {
    orders_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListOrdersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListOrdersResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                orders_ =
                    new java.util.ArrayList<
                        com.google.cloud.commerce.consumer.procurement.v1alpha1.Order>();
                mutable_bitField0_ |= 0x00000001;
              }
              orders_.add(
                  input.readMessage(
                      com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.parser(),
                      extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        orders_ = java.util.Collections.unmodifiableList(orders_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.commerce.consumer.procurement.v1alpha1.ProcurementService
        .internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.commerce.consumer.procurement.v1alpha1.ProcurementService
        .internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse.class,
            com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse.Builder
                .class);
  }

  public static final int ORDERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.commerce.consumer.procurement.v1alpha1.Order> orders_;
  /**
   *
   *
   * <pre>
   * The list of orders in this response.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.commerce.consumer.procurement.v1alpha1.Order>
      getOrdersList() {
    return orders_;
  }
  /**
   *
   *
   * <pre>
   * The list of orders in this response.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOrBuilder>
      getOrdersOrBuilderList() {
    return orders_;
  }
  /**
   *
   *
   * <pre>
   * The list of orders in this response.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
   */
  @java.lang.Override
  public int getOrdersCount() {
    return orders_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of orders in this response.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.commerce.consumer.procurement.v1alpha1.Order getOrders(int index) {
    return orders_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of orders in this response.
   * </pre>
   *
   * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOrBuilder getOrdersOrBuilder(
      int index) {
    return orders_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * The token for fetching the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The token for fetching the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < orders_.size(); i++) {
      output.writeMessage(1, orders_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < orders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, orders_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj
        instanceof com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse other =
        (com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse) obj;

    if (!getOrdersList().equals(other.getOrdersList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getOrdersCount() > 0) {
      hash = (37 * hash) + ORDERS_FIELD_NUMBER;
      hash = (53 * hash) + getOrdersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for [ConsumerProcurementService.ListOrders][google.cloud.commerce.consumer.procurement.v1alpha1.ConsumerProcurementService.ListOrders].
   * </pre>
   *
   * Protobuf type {@code google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse)
      com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.commerce.consumer.procurement.v1alpha1.ProcurementService
          .internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.commerce.consumer.procurement.v1alpha1.ProcurementService
          .internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse.class,
              com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getOrdersFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ordersBuilder_ == null) {
        orders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ordersBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.commerce.consumer.procurement.v1alpha1.ProcurementService
          .internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_ListOrdersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
        getDefaultInstanceForType() {
      return com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse build() {
      com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
        buildPartial() {
      com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse result =
          new com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse(this);
      int from_bitField0_ = bitField0_;
      if (ordersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          orders_ = java.util.Collections.unmodifiableList(orders_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.orders_ = orders_;
      } else {
        result.orders_ = ordersBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other
          instanceof com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse) {
        return mergeFrom(
            (com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse other) {
      if (other
          == com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
              .getDefaultInstance()) return this;
      if (ordersBuilder_ == null) {
        if (!other.orders_.isEmpty()) {
          if (orders_.isEmpty()) {
            orders_ = other.orders_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrdersIsMutable();
            orders_.addAll(other.orders_);
          }
          onChanged();
        }
      } else {
        if (!other.orders_.isEmpty()) {
          if (ordersBuilder_.isEmpty()) {
            ordersBuilder_.dispose();
            ordersBuilder_ = null;
            orders_ = other.orders_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ordersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOrdersFieldBuilder()
                    : null;
          } else {
            ordersBuilder_.addAllMessages(other.orders_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse parsedMessage =
          null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.commerce.consumer.procurement.v1alpha1.Order> orders_ =
        java.util.Collections.emptyList();

    private void ensureOrdersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        orders_ =
            new java.util.ArrayList<com.google.cloud.commerce.consumer.procurement.v1alpha1.Order>(
                orders_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.commerce.consumer.procurement.v1alpha1.Order,
            com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.Builder,
            com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOrBuilder>
        ordersBuilder_;

    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public java.util.List<com.google.cloud.commerce.consumer.procurement.v1alpha1.Order>
        getOrdersList() {
      if (ordersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(orders_);
      } else {
        return ordersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public int getOrdersCount() {
      if (ordersBuilder_ == null) {
        return orders_.size();
      } else {
        return ordersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public com.google.cloud.commerce.consumer.procurement.v1alpha1.Order getOrders(int index) {
      if (ordersBuilder_ == null) {
        return orders_.get(index);
      } else {
        return ordersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public Builder setOrders(
        int index, com.google.cloud.commerce.consumer.procurement.v1alpha1.Order value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.set(index, value);
        onChanged();
      } else {
        ordersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public Builder setOrders(
        int index,
        com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.set(index, builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public Builder addOrders(com.google.cloud.commerce.consumer.procurement.v1alpha1.Order value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.add(value);
        onChanged();
      } else {
        ordersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public Builder addOrders(
        int index, com.google.cloud.commerce.consumer.procurement.v1alpha1.Order value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.add(index, value);
        onChanged();
      } else {
        ordersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public Builder addOrders(
        com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.add(builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public Builder addOrders(
        int index,
        com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.add(index, builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public Builder addAllOrders(
        java.lang.Iterable<? extends com.google.cloud.commerce.consumer.procurement.v1alpha1.Order>
            values) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, orders_);
        onChanged();
      } else {
        ordersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public Builder clearOrders() {
      if (ordersBuilder_ == null) {
        orders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ordersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public Builder removeOrders(int index) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.remove(index);
        onChanged();
      } else {
        ordersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.Builder getOrdersBuilder(
        int index) {
      return getOrdersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOrBuilder
        getOrdersOrBuilder(int index) {
      if (ordersBuilder_ == null) {
        return orders_.get(index);
      } else {
        return ordersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public java.util.List<
            ? extends com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOrBuilder>
        getOrdersOrBuilderList() {
      if (ordersBuilder_ != null) {
        return ordersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(orders_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.Builder
        addOrdersBuilder() {
      return getOrdersFieldBuilder()
          .addBuilder(
              com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.Builder addOrdersBuilder(
        int index) {
      return getOrdersFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of orders in this response.
     * </pre>
     *
     * <code>repeated .google.cloud.commerce.consumer.procurement.v1alpha1.Order orders = 1;</code>
     */
    public java.util.List<com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.Builder>
        getOrdersBuilderList() {
      return getOrdersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.commerce.consumer.procurement.v1alpha1.Order,
            com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.Builder,
            com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOrBuilder>
        getOrdersFieldBuilder() {
      if (ordersBuilder_ == null) {
        ordersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.commerce.consumer.procurement.v1alpha1.Order,
                com.google.cloud.commerce.consumer.procurement.v1alpha1.Order.Builder,
                com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOrBuilder>(
                orders_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        orders_ = null;
      }
      return ordersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The token for fetching the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The token for fetching the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The token for fetching the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The token for fetching the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The token for fetching the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse)
  private static final com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse();
  }

  public static com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOrdersResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListOrdersResponse>() {
        @java.lang.Override
        public ListOrdersResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListOrdersResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListOrdersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOrdersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.commerce.consumer.procurement.v1alpha1.ListOrdersResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}