// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

public interface LabelAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.LabelAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Detected entity.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.Entity entity = 1;</code>
   */
  boolean hasEntity();
  /**
   *
   *
   * <pre>
   * Detected entity.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.Entity entity = 1;</code>
   */
  com.google.cloud.videointelligence.v1.Entity getEntity();
  /**
   *
   *
   * <pre>
   * Detected entity.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.Entity entity = 1;</code>
   */
  com.google.cloud.videointelligence.v1.EntityOrBuilder getEntityOrBuilder();

  /**
   *
   *
   * <pre>
   * Common categories for the detected entity.
   * E.g. when the label is `Terrier` the category is likely `dog`. And in some
   * cases there might be more than one categories e.g. `Terrier` could also be
   * a `pet`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Entity category_entities = 2;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.Entity> getCategoryEntitiesList();
  /**
   *
   *
   * <pre>
   * Common categories for the detected entity.
   * E.g. when the label is `Terrier` the category is likely `dog`. And in some
   * cases there might be more than one categories e.g. `Terrier` could also be
   * a `pet`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Entity category_entities = 2;</code>
   */
  com.google.cloud.videointelligence.v1.Entity getCategoryEntities(int index);
  /**
   *
   *
   * <pre>
   * Common categories for the detected entity.
   * E.g. when the label is `Terrier` the category is likely `dog`. And in some
   * cases there might be more than one categories e.g. `Terrier` could also be
   * a `pet`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Entity category_entities = 2;</code>
   */
  int getCategoryEntitiesCount();
  /**
   *
   *
   * <pre>
   * Common categories for the detected entity.
   * E.g. when the label is `Terrier` the category is likely `dog`. And in some
   * cases there might be more than one categories e.g. `Terrier` could also be
   * a `pet`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Entity category_entities = 2;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.EntityOrBuilder>
      getCategoryEntitiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Common categories for the detected entity.
   * E.g. when the label is `Terrier` the category is likely `dog`. And in some
   * cases there might be more than one categories e.g. `Terrier` could also be
   * a `pet`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Entity category_entities = 2;</code>
   */
  com.google.cloud.videointelligence.v1.EntityOrBuilder getCategoryEntitiesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * All video segments where a label was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelSegment segments = 3;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.LabelSegment> getSegmentsList();
  /**
   *
   *
   * <pre>
   * All video segments where a label was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelSegment segments = 3;</code>
   */
  com.google.cloud.videointelligence.v1.LabelSegment getSegments(int index);
  /**
   *
   *
   * <pre>
   * All video segments where a label was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelSegment segments = 3;</code>
   */
  int getSegmentsCount();
  /**
   *
   *
   * <pre>
   * All video segments where a label was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelSegment segments = 3;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.LabelSegmentOrBuilder>
      getSegmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * All video segments where a label was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelSegment segments = 3;</code>
   */
  com.google.cloud.videointelligence.v1.LabelSegmentOrBuilder getSegmentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * All video frames where a label was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelFrame frames = 4;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.LabelFrame> getFramesList();
  /**
   *
   *
   * <pre>
   * All video frames where a label was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelFrame frames = 4;</code>
   */
  com.google.cloud.videointelligence.v1.LabelFrame getFrames(int index);
  /**
   *
   *
   * <pre>
   * All video frames where a label was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelFrame frames = 4;</code>
   */
  int getFramesCount();
  /**
   *
   *
   * <pre>
   * All video frames where a label was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelFrame frames = 4;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.LabelFrameOrBuilder>
      getFramesOrBuilderList();
  /**
   *
   *
   * <pre>
   * All video frames where a label was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelFrame frames = 4;</code>
   */
  com.google.cloud.videointelligence.v1.LabelFrameOrBuilder getFramesOrBuilder(int index);
}
