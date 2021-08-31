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
// source: google/cloud/aiplatform/v1/feature_monitoring_stats.proto

package com.google.cloud.aiplatform.v1;

public final class FeatureMonitoringStatsProto {
  private FeatureMonitoringStatsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureStatsAnomaly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureStatsAnomaly_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/aiplatform/v1/feature_mon"
          + "itoring_stats.proto\022\032google.cloud.aiplat"
          + "form.v1\032\037google/protobuf/timestamp.proto"
          + "\032\034google/api/annotations.proto\"\357\001\n\023Featu"
          + "reStatsAnomaly\022\r\n\005score\030\001 \001(\001\022\021\n\tstats_u"
          + "ri\030\003 \001(\t\022\023\n\013anomaly_uri\030\004 \001(\t\022\036\n\026distrib"
          + "ution_deviation\030\005 \001(\001\022#\n\033anomaly_detecti"
          + "on_threshold\030\t \001(\001\022.\n\nstart_time\030\007 \001(\0132\032"
          + ".google.protobuf.Timestamp\022,\n\010end_time\030\010"
          + " \001(\0132\032.google.protobuf.TimestampB\337\001\n\036com"
          + ".google.cloud.aiplatform.v1B\033FeatureMoni"
          + "toringStatsProtoP\001ZDgoogle.golang.org/ge"
          + "nproto/googleapis/cloud/aiplatform/v1;ai"
          + "platform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032"
          + "Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Clo"
          + "ud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_FeatureStatsAnomaly_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureStatsAnomaly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureStatsAnomaly_descriptor,
            new java.lang.String[] {
              "Score",
              "StatsUri",
              "AnomalyUri",
              "DistributionDeviation",
              "AnomalyDetectionThreshold",
              "StartTime",
              "EndTime",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
