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
// source: google/cloud/optimization/v1/fleet_routing.proto

package com.google.cloud.optimization.v1;

public interface BreakRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.optimization.v1.BreakRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Sequence of breaks. See the `BreakRequest` message.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.BreakRule.BreakRequest break_requests = 1;</code>
   */
  java.util.List<com.google.cloud.optimization.v1.BreakRule.BreakRequest> getBreakRequestsList();
  /**
   *
   *
   * <pre>
   * Sequence of breaks. See the `BreakRequest` message.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.BreakRule.BreakRequest break_requests = 1;</code>
   */
  com.google.cloud.optimization.v1.BreakRule.BreakRequest getBreakRequests(int index);
  /**
   *
   *
   * <pre>
   * Sequence of breaks. See the `BreakRequest` message.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.BreakRule.BreakRequest break_requests = 1;</code>
   */
  int getBreakRequestsCount();
  /**
   *
   *
   * <pre>
   * Sequence of breaks. See the `BreakRequest` message.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.BreakRule.BreakRequest break_requests = 1;</code>
   */
  java.util.List<? extends com.google.cloud.optimization.v1.BreakRule.BreakRequestOrBuilder>
      getBreakRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Sequence of breaks. See the `BreakRequest` message.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.BreakRule.BreakRequest break_requests = 1;</code>
   */
  com.google.cloud.optimization.v1.BreakRule.BreakRequestOrBuilder getBreakRequestsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Several `FrequencyConstraint` may apply. They must all be satisfied by
   * the `BreakRequest`s of this `BreakRule`. See `FrequencyConstraint`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.BreakRule.FrequencyConstraint frequency_constraints = 2;
   * </code>
   */
  java.util.List<com.google.cloud.optimization.v1.BreakRule.FrequencyConstraint>
      getFrequencyConstraintsList();
  /**
   *
   *
   * <pre>
   * Several `FrequencyConstraint` may apply. They must all be satisfied by
   * the `BreakRequest`s of this `BreakRule`. See `FrequencyConstraint`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.BreakRule.FrequencyConstraint frequency_constraints = 2;
   * </code>
   */
  com.google.cloud.optimization.v1.BreakRule.FrequencyConstraint getFrequencyConstraints(int index);
  /**
   *
   *
   * <pre>
   * Several `FrequencyConstraint` may apply. They must all be satisfied by
   * the `BreakRequest`s of this `BreakRule`. See `FrequencyConstraint`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.BreakRule.FrequencyConstraint frequency_constraints = 2;
   * </code>
   */
  int getFrequencyConstraintsCount();
  /**
   *
   *
   * <pre>
   * Several `FrequencyConstraint` may apply. They must all be satisfied by
   * the `BreakRequest`s of this `BreakRule`. See `FrequencyConstraint`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.BreakRule.FrequencyConstraint frequency_constraints = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.optimization.v1.BreakRule.FrequencyConstraintOrBuilder>
      getFrequencyConstraintsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Several `FrequencyConstraint` may apply. They must all be satisfied by
   * the `BreakRequest`s of this `BreakRule`. See `FrequencyConstraint`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.BreakRule.FrequencyConstraint frequency_constraints = 2;
   * </code>
   */
  com.google.cloud.optimization.v1.BreakRule.FrequencyConstraintOrBuilder
      getFrequencyConstraintsOrBuilder(int index);
}