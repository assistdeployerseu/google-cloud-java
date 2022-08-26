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
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

public interface TrackOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.Track)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Video segment of a track.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   *
   * @return Whether the segment field is set.
   */
  boolean hasSegment();
  /**
   *
   *
   * <pre>
   * Video segment of a track.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   *
   * @return The segment.
   */
  com.google.cloud.videointelligence.v1.VideoSegment getSegment();
  /**
   *
   *
   * <pre>
   * Video segment of a track.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   */
  com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder getSegmentOrBuilder();

  /**
   *
   *
   * <pre>
   * The object with timestamp and attributes per frame in the track.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TimestampedObject timestamped_objects = 2;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.TimestampedObject>
      getTimestampedObjectsList();
  /**
   *
   *
   * <pre>
   * The object with timestamp and attributes per frame in the track.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TimestampedObject timestamped_objects = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1.TimestampedObject getTimestampedObjects(int index);
  /**
   *
   *
   * <pre>
   * The object with timestamp and attributes per frame in the track.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TimestampedObject timestamped_objects = 2;
   * </code>
   */
  int getTimestampedObjectsCount();
  /**
   *
   *
   * <pre>
   * The object with timestamp and attributes per frame in the track.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TimestampedObject timestamped_objects = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.TimestampedObjectOrBuilder>
      getTimestampedObjectsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The object with timestamp and attributes per frame in the track.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TimestampedObject timestamped_objects = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1.TimestampedObjectOrBuilder getTimestampedObjectsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Attributes in the track level.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.DetectedAttribute attributes = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.DetectedAttribute> getAttributesList();
  /**
   *
   *
   * <pre>
   * Optional. Attributes in the track level.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.DetectedAttribute attributes = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.videointelligence.v1.DetectedAttribute getAttributes(int index);
  /**
   *
   *
   * <pre>
   * Optional. Attributes in the track level.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.DetectedAttribute attributes = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAttributesCount();
  /**
   *
   *
   * <pre>
   * Optional. Attributes in the track level.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.DetectedAttribute attributes = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.DetectedAttributeOrBuilder>
      getAttributesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Attributes in the track level.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.DetectedAttribute attributes = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.videointelligence.v1.DetectedAttributeOrBuilder getAttributesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. The confidence score of the tracked object.
   * </pre>
   *
   * <code>float confidence = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The confidence.
   */
  float getConfidence();
}