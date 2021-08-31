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
// source: google/cloud/aiplatform/v1/job_service.proto

package com.google.cloud.aiplatform.v1;

public interface SearchModelDeploymentMonitoringStatsAnomaliesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. ModelDeploymentMonitoring Job resource name.
   * Format:
   * `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}
   * </pre>
   *
   * <code>
   * string model_deployment_monitoring_job = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The modelDeploymentMonitoringJob.
   */
  java.lang.String getModelDeploymentMonitoringJob();
  /**
   *
   *
   * <pre>
   * Required. ModelDeploymentMonitoring Job resource name.
   * Format:
   * `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}
   * </pre>
   *
   * <code>
   * string model_deployment_monitoring_job = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for modelDeploymentMonitoringJob.
   */
  com.google.protobuf.ByteString getModelDeploymentMonitoringJobBytes();

  /**
   *
   *
   * <pre>
   * Required. The DeployedModel ID of the
   * [google.cloud.aiplatform.master.ModelDeploymentMonitoringObjectiveConfig.deployed_model_id].
   * </pre>
   *
   * <code>string deployed_model_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The deployedModelId.
   */
  java.lang.String getDeployedModelId();
  /**
   *
   *
   * <pre>
   * Required. The DeployedModel ID of the
   * [google.cloud.aiplatform.master.ModelDeploymentMonitoringObjectiveConfig.deployed_model_id].
   * </pre>
   *
   * <code>string deployed_model_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for deployedModelId.
   */
  com.google.protobuf.ByteString getDeployedModelIdBytes();

  /**
   *
   *
   * <pre>
   * The feature display name. If specified, only return the stats belonging to
   * this feature. Format:
   * [ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.feature_display_name][google.cloud.aiplatform.v1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.feature_display_name],
   * example: "user_destination".
   * </pre>
   *
   * <code>string feature_display_name = 3;</code>
   *
   * @return The featureDisplayName.
   */
  java.lang.String getFeatureDisplayName();
  /**
   *
   *
   * <pre>
   * The feature display name. If specified, only return the stats belonging to
   * this feature. Format:
   * [ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.feature_display_name][google.cloud.aiplatform.v1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.feature_display_name],
   * example: "user_destination".
   * </pre>
   *
   * <code>string feature_display_name = 3;</code>
   *
   * @return The bytes for featureDisplayName.
   */
  com.google.protobuf.ByteString getFeatureDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Objectives of the stats to retrieve.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesRequest.StatsAnomaliesObjective objectives = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          com.google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesRequest
              .StatsAnomaliesObjective>
      getObjectivesList();
  /**
   *
   *
   * <pre>
   * Required. Objectives of the stats to retrieve.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesRequest.StatsAnomaliesObjective objectives = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesRequest
          .StatsAnomaliesObjective
      getObjectives(int index);
  /**
   *
   *
   * <pre>
   * Required. Objectives of the stats to retrieve.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesRequest.StatsAnomaliesObjective objectives = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getObjectivesCount();
  /**
   *
   *
   * <pre>
   * Required. Objectives of the stats to retrieve.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesRequest.StatsAnomaliesObjective objectives = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesRequest
                  .StatsAnomaliesObjectiveOrBuilder>
      getObjectivesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Objectives of the stats to retrieve.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesRequest.StatsAnomaliesObjective objectives = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesRequest
          .StatsAnomaliesObjectiveOrBuilder
      getObjectivesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 5;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token received from a previous
   * [JobService.SearchModelDeploymentMonitoringStatsAnomalies][google.cloud.aiplatform.v1.JobService.SearchModelDeploymentMonitoringStatsAnomalies]
   * call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token received from a previous
   * [JobService.SearchModelDeploymentMonitoringStatsAnomalies][google.cloud.aiplatform.v1.JobService.SearchModelDeploymentMonitoringStatsAnomalies]
   * call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The earliest timestamp of stats being generated.
   * If not set, indicates fetching stats till the earliest possible one.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The earliest timestamp of stats being generated.
   * If not set, indicates fetching stats till the earliest possible one.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The earliest timestamp of stats being generated.
   * If not set, indicates fetching stats till the earliest possible one.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The latest timestamp of stats being generated.
   * If not set, indicates feching stats till the latest possible one.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The latest timestamp of stats being generated.
   * If not set, indicates feching stats till the latest possible one.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The latest timestamp of stats being generated.
   * If not set, indicates feching stats till the latest possible one.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
