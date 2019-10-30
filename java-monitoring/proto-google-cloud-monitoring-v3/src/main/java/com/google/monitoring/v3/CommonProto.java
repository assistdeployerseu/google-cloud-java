/*
 * Copyright 2019 Google LLC
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
// source: google/monitoring/v3/common.proto

package com.google.monitoring.v3;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_TypedValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TypedValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_TimeInterval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TimeInterval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Aggregation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Aggregation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/monitoring/v3/common.proto\022\024goo"
          + "gle.monitoring.v3\032\035google/api/distributi"
          + "on.proto\032\036google/protobuf/duration.proto"
          + "\032\037google/protobuf/timestamp.proto\"\252\001\n\nTy"
          + "pedValue\022\024\n\nbool_value\030\001 \001(\010H\000\022\025\n\013int64_"
          + "value\030\002 \001(\003H\000\022\026\n\014double_value\030\003 \001(\001H\000\022\026\n"
          + "\014string_value\030\004 \001(\tH\000\0226\n\022distribution_va"
          + "lue\030\005 \001(\0132\030.google.api.DistributionH\000B\007\n"
          + "\005value\"l\n\014TimeInterval\022,\n\010end_time\030\002 \001(\013"
          + "2\032.google.protobuf.Timestamp\022.\n\nstart_ti"
          + "me\030\001 \001(\0132\032.google.protobuf.Timestamp\"\255\007\n"
          + "\013Aggregation\0223\n\020alignment_period\030\001 \001(\0132\031"
          + ".google.protobuf.Duration\022E\n\022per_series_"
          + "aligner\030\002 \001(\0162).google.monitoring.v3.Agg"
          + "regation.Aligner\022G\n\024cross_series_reducer"
          + "\030\004 \001(\0162).google.monitoring.v3.Aggregatio"
          + "n.Reducer\022\027\n\017group_by_fields\030\005 \003(\t\"\213\003\n\007A"
          + "ligner\022\016\n\nALIGN_NONE\020\000\022\017\n\013ALIGN_DELTA\020\001\022"
          + "\016\n\nALIGN_RATE\020\002\022\025\n\021ALIGN_INTERPOLATE\020\003\022\024"
          + "\n\020ALIGN_NEXT_OLDER\020\004\022\r\n\tALIGN_MIN\020\n\022\r\n\tA"
          + "LIGN_MAX\020\013\022\016\n\nALIGN_MEAN\020\014\022\017\n\013ALIGN_COUN"
          + "T\020\r\022\r\n\tALIGN_SUM\020\016\022\020\n\014ALIGN_STDDEV\020\017\022\024\n\020"
          + "ALIGN_COUNT_TRUE\020\020\022\025\n\021ALIGN_COUNT_FALSE\020"
          + "\030\022\027\n\023ALIGN_FRACTION_TRUE\020\021\022\027\n\023ALIGN_PERC"
          + "ENTILE_99\020\022\022\027\n\023ALIGN_PERCENTILE_95\020\023\022\027\n\023"
          + "ALIGN_PERCENTILE_50\020\024\022\027\n\023ALIGN_PERCENTIL"
          + "E_05\020\025\022\030\n\024ALIGN_PERCENT_CHANGE\020\027\"\261\002\n\007Red"
          + "ucer\022\017\n\013REDUCE_NONE\020\000\022\017\n\013REDUCE_MEAN\020\001\022\016"
          + "\n\nREDUCE_MIN\020\002\022\016\n\nREDUCE_MAX\020\003\022\016\n\nREDUCE"
          + "_SUM\020\004\022\021\n\rREDUCE_STDDEV\020\005\022\020\n\014REDUCE_COUN"
          + "T\020\006\022\025\n\021REDUCE_COUNT_TRUE\020\007\022\026\n\022REDUCE_COU"
          + "NT_FALSE\020\017\022\030\n\024REDUCE_FRACTION_TRUE\020\010\022\030\n\024"
          + "REDUCE_PERCENTILE_99\020\t\022\030\n\024REDUCE_PERCENT"
          + "ILE_95\020\n\022\030\n\024REDUCE_PERCENTILE_50\020\013\022\030\n\024RE"
          + "DUCE_PERCENTILE_05\020\014*\236\001\n\016ComparisonType\022"
          + "\032\n\026COMPARISON_UNSPECIFIED\020\000\022\021\n\rCOMPARISO"
          + "N_GT\020\001\022\021\n\rCOMPARISON_GE\020\002\022\021\n\rCOMPARISON_"
          + "LT\020\003\022\021\n\rCOMPARISON_LE\020\004\022\021\n\rCOMPARISON_EQ"
          + "\020\005\022\021\n\rCOMPARISON_NE\020\006*a\n\013ServiceTier\022\034\n\030"
          + "SERVICE_TIER_UNSPECIFIED\020\000\022\026\n\022SERVICE_TI"
          + "ER_BASIC\020\001\022\030\n\024SERVICE_TIER_PREMIUM\020\002\032\002\030\001"
          + "B\243\001\n\030com.google.monitoring.v3B\013CommonPro"
          + "toP\001Z>google.golang.org/genproto/googlea"
          + "pis/monitoring/v3;monitoring\252\002\032Google.Cl"
          + "oud.Monitoring.V3\312\002\032Google\\Cloud\\Monitor"
          + "ing\\V3b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.DistributionProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_monitoring_v3_TypedValue_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_TypedValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_TypedValue_descriptor,
            new java.lang.String[] {
              "BoolValue", "Int64Value", "DoubleValue", "StringValue", "DistributionValue", "Value",
            });
    internal_static_google_monitoring_v3_TimeInterval_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_TimeInterval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_TimeInterval_descriptor,
            new java.lang.String[] {
              "EndTime", "StartTime",
            });
    internal_static_google_monitoring_v3_Aggregation_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_Aggregation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Aggregation_descriptor,
            new java.lang.String[] {
              "AlignmentPeriod", "PerSeriesAligner", "CrossSeriesReducer", "GroupByFields",
            });
    com.google.api.DistributionProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
