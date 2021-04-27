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
// source: google/cloud/aiplatform/v1beta1/vizier_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for [VizierService.ListOptimalTrials][google.cloud.aiplatform.v1beta1.VizierService.ListOptimalTrials].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse}
 */
public final class ListOptimalTrialsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse)
    ListOptimalTrialsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListOptimalTrialsResponse.newBuilder() to construct.
  private ListOptimalTrialsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListOptimalTrialsResponse() {
    optimalTrials_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListOptimalTrialsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListOptimalTrialsResponse(
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
                optimalTrials_ =
                    new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Trial>();
                mutable_bitField0_ |= 0x00000001;
              }
              optimalTrials_.add(
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.Trial.parser(), extensionRegistry));
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        optimalTrials_ = java.util.Collections.unmodifiableList(optimalTrials_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.VizierServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListOptimalTrialsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.VizierServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListOptimalTrialsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse.class,
            com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse.Builder.class);
  }

  public static final int OPTIMAL_TRIALS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1beta1.Trial> optimalTrials_;
  /**
   *
   *
   * <pre>
   * The pareto-optimal Trials for multiple objective Study or the
   * optimal trial for single objective Study. The definition of
   * pareto-optimal can be checked in wiki page.
   * https://en.wikipedia.org/wiki/Pareto_efficiency
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.Trial> getOptimalTrialsList() {
    return optimalTrials_;
  }
  /**
   *
   *
   * <pre>
   * The pareto-optimal Trials for multiple objective Study or the
   * optimal trial for single objective Study. The definition of
   * pareto-optimal can be checked in wiki page.
   * https://en.wikipedia.org/wiki/Pareto_efficiency
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TrialOrBuilder>
      getOptimalTrialsOrBuilderList() {
    return optimalTrials_;
  }
  /**
   *
   *
   * <pre>
   * The pareto-optimal Trials for multiple objective Study or the
   * optimal trial for single objective Study. The definition of
   * pareto-optimal can be checked in wiki page.
   * https://en.wikipedia.org/wiki/Pareto_efficiency
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
   */
  @java.lang.Override
  public int getOptimalTrialsCount() {
    return optimalTrials_.size();
  }
  /**
   *
   *
   * <pre>
   * The pareto-optimal Trials for multiple objective Study or the
   * optimal trial for single objective Study. The definition of
   * pareto-optimal can be checked in wiki page.
   * https://en.wikipedia.org/wiki/Pareto_efficiency
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Trial getOptimalTrials(int index) {
    return optimalTrials_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The pareto-optimal Trials for multiple objective Study or the
   * optimal trial for single objective Study. The definition of
   * pareto-optimal can be checked in wiki page.
   * https://en.wikipedia.org/wiki/Pareto_efficiency
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TrialOrBuilder getOptimalTrialsOrBuilder(int index) {
    return optimalTrials_.get(index);
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
    for (int i = 0; i < optimalTrials_.size(); i++) {
      output.writeMessage(1, optimalTrials_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < optimalTrials_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, optimalTrials_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse other =
        (com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse) obj;

    if (!getOptimalTrialsList().equals(other.getOptimalTrialsList())) return false;
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
    if (getOptimalTrialsCount() > 0) {
      hash = (37 * hash) + OPTIMAL_TRIALS_FIELD_NUMBER;
      hash = (53 * hash) + getOptimalTrialsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse prototype) {
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
   * Response message for [VizierService.ListOptimalTrials][google.cloud.aiplatform.v1beta1.VizierService.ListOptimalTrials].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse)
      com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListOptimalTrialsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListOptimalTrialsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse.class,
              com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getOptimalTrialsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (optimalTrialsBuilder_ == null) {
        optimalTrials_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        optimalTrialsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListOptimalTrialsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse result =
          new com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse(this);
      int from_bitField0_ = bitField0_;
      if (optimalTrialsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          optimalTrials_ = java.util.Collections.unmodifiableList(optimalTrials_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.optimalTrials_ = optimalTrials_;
      } else {
        result.optimalTrials_ = optimalTrialsBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse.getDefaultInstance())
        return this;
      if (optimalTrialsBuilder_ == null) {
        if (!other.optimalTrials_.isEmpty()) {
          if (optimalTrials_.isEmpty()) {
            optimalTrials_ = other.optimalTrials_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOptimalTrialsIsMutable();
            optimalTrials_.addAll(other.optimalTrials_);
          }
          onChanged();
        }
      } else {
        if (!other.optimalTrials_.isEmpty()) {
          if (optimalTrialsBuilder_.isEmpty()) {
            optimalTrialsBuilder_.dispose();
            optimalTrialsBuilder_ = null;
            optimalTrials_ = other.optimalTrials_;
            bitField0_ = (bitField0_ & ~0x00000001);
            optimalTrialsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOptimalTrialsFieldBuilder()
                    : null;
          } else {
            optimalTrialsBuilder_.addAllMessages(other.optimalTrials_);
          }
        }
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
      com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse)
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.Trial> optimalTrials_ =
        java.util.Collections.emptyList();

    private void ensureOptimalTrialsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        optimalTrials_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Trial>(optimalTrials_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Trial,
            com.google.cloud.aiplatform.v1beta1.Trial.Builder,
            com.google.cloud.aiplatform.v1beta1.TrialOrBuilder>
        optimalTrialsBuilder_;

    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Trial> getOptimalTrialsList() {
      if (optimalTrialsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(optimalTrials_);
      } else {
        return optimalTrialsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public int getOptimalTrialsCount() {
      if (optimalTrialsBuilder_ == null) {
        return optimalTrials_.size();
      } else {
        return optimalTrialsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Trial getOptimalTrials(int index) {
      if (optimalTrialsBuilder_ == null) {
        return optimalTrials_.get(index);
      } else {
        return optimalTrialsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public Builder setOptimalTrials(int index, com.google.cloud.aiplatform.v1beta1.Trial value) {
      if (optimalTrialsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptimalTrialsIsMutable();
        optimalTrials_.set(index, value);
        onChanged();
      } else {
        optimalTrialsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public Builder setOptimalTrials(
        int index, com.google.cloud.aiplatform.v1beta1.Trial.Builder builderForValue) {
      if (optimalTrialsBuilder_ == null) {
        ensureOptimalTrialsIsMutable();
        optimalTrials_.set(index, builderForValue.build());
        onChanged();
      } else {
        optimalTrialsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public Builder addOptimalTrials(com.google.cloud.aiplatform.v1beta1.Trial value) {
      if (optimalTrialsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptimalTrialsIsMutable();
        optimalTrials_.add(value);
        onChanged();
      } else {
        optimalTrialsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public Builder addOptimalTrials(int index, com.google.cloud.aiplatform.v1beta1.Trial value) {
      if (optimalTrialsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptimalTrialsIsMutable();
        optimalTrials_.add(index, value);
        onChanged();
      } else {
        optimalTrialsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public Builder addOptimalTrials(
        com.google.cloud.aiplatform.v1beta1.Trial.Builder builderForValue) {
      if (optimalTrialsBuilder_ == null) {
        ensureOptimalTrialsIsMutable();
        optimalTrials_.add(builderForValue.build());
        onChanged();
      } else {
        optimalTrialsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public Builder addOptimalTrials(
        int index, com.google.cloud.aiplatform.v1beta1.Trial.Builder builderForValue) {
      if (optimalTrialsBuilder_ == null) {
        ensureOptimalTrialsIsMutable();
        optimalTrials_.add(index, builderForValue.build());
        onChanged();
      } else {
        optimalTrialsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public Builder addAllOptimalTrials(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.Trial> values) {
      if (optimalTrialsBuilder_ == null) {
        ensureOptimalTrialsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, optimalTrials_);
        onChanged();
      } else {
        optimalTrialsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public Builder clearOptimalTrials() {
      if (optimalTrialsBuilder_ == null) {
        optimalTrials_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        optimalTrialsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public Builder removeOptimalTrials(int index) {
      if (optimalTrialsBuilder_ == null) {
        ensureOptimalTrialsIsMutable();
        optimalTrials_.remove(index);
        onChanged();
      } else {
        optimalTrialsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Trial.Builder getOptimalTrialsBuilder(int index) {
      return getOptimalTrialsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.TrialOrBuilder getOptimalTrialsOrBuilder(int index) {
      if (optimalTrialsBuilder_ == null) {
        return optimalTrials_.get(index);
      } else {
        return optimalTrialsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TrialOrBuilder>
        getOptimalTrialsOrBuilderList() {
      if (optimalTrialsBuilder_ != null) {
        return optimalTrialsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(optimalTrials_);
      }
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Trial.Builder addOptimalTrialsBuilder() {
      return getOptimalTrialsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.Trial.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Trial.Builder addOptimalTrialsBuilder(int index) {
      return getOptimalTrialsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.Trial.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The pareto-optimal Trials for multiple objective Study or the
     * optimal trial for single objective Study. The definition of
     * pareto-optimal can be checked in wiki page.
     * https://en.wikipedia.org/wiki/Pareto_efficiency
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Trial optimal_trials = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Trial.Builder>
        getOptimalTrialsBuilderList() {
      return getOptimalTrialsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Trial,
            com.google.cloud.aiplatform.v1beta1.Trial.Builder,
            com.google.cloud.aiplatform.v1beta1.TrialOrBuilder>
        getOptimalTrialsFieldBuilder() {
      if (optimalTrialsBuilder_ == null) {
        optimalTrialsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Trial,
                com.google.cloud.aiplatform.v1beta1.Trial.Builder,
                com.google.cloud.aiplatform.v1beta1.TrialOrBuilder>(
                optimalTrials_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        optimalTrials_ = null;
      }
      return optimalTrialsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOptimalTrialsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListOptimalTrialsResponse>() {
        @java.lang.Override
        public ListOptimalTrialsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListOptimalTrialsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListOptimalTrialsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOptimalTrialsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListOptimalTrialsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
