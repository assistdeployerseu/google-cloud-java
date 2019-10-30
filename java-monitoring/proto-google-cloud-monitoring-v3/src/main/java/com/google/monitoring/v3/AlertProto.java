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
// source: google/monitoring/v3/alert.proto

package com.google.monitoring.v3;

public final class AlertProto {
  private AlertProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Documentation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Documentation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n google/monitoring/v3/alert.proto\022\024goog"
          + "le.monitoring.v3\032!google/monitoring/v3/c"
          + "ommon.proto\032*google/monitoring/v3/mutati"
          + "on_record.proto\032\036google/protobuf/duratio"
          + "n.proto\032\036google/protobuf/wrappers.proto\032"
          + "\027google/rpc/status.proto\"\203\r\n\013AlertPolicy"
          + "\022\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022F\n\r"
          + "documentation\030\r \001(\0132/.google.monitoring."
          + "v3.AlertPolicy.Documentation\022F\n\013user_lab"
          + "els\030\020 \003(\01321.google.monitoring.v3.AlertPo"
          + "licy.UserLabelsEntry\022?\n\nconditions\030\014 \003(\013"
          + "2+.google.monitoring.v3.AlertPolicy.Cond"
          + "ition\022I\n\010combiner\030\006 \001(\01627.google.monitor"
          + "ing.v3.AlertPolicy.ConditionCombinerType"
          + "\022+\n\007enabled\030\021 \001(\0132\032.google.protobuf.Bool"
          + "Value\022$\n\010validity\030\022 \001(\0132\022.google.rpc.Sta"
          + "tus\022\035\n\025notification_channels\030\016 \003(\t\022=\n\017cr"
          + "eation_record\030\n \001(\0132$.google.monitoring."
          + "v3.MutationRecord\022=\n\017mutation_record\030\013 \001"
          + "(\0132$.google.monitoring.v3.MutationRecord"
          + "\0323\n\rDocumentation\022\017\n\007content\030\001 \001(\t\022\021\n\tmi"
          + "me_type\030\002 \001(\t\032\370\006\n\tCondition\022\014\n\004name\030\014 \001("
          + "\t\022\024\n\014display_name\030\006 \001(\t\022Z\n\023condition_thr"
          + "eshold\030\001 \001(\0132;.google.monitoring.v3.Aler"
          + "tPolicy.Condition.MetricThresholdH\000\022U\n\020c"
          + "ondition_absent\030\002 \001(\01329.google.monitorin"
          + "g.v3.AlertPolicy.Condition.MetricAbsence"
          + "H\000\0325\n\007Trigger\022\017\n\005count\030\001 \001(\005H\000\022\021\n\007percen"
          + "t\030\002 \001(\001H\000B\006\n\004type\032\201\003\n\017MetricThreshold\022\016\n"
          + "\006filter\030\002 \001(\t\0227\n\014aggregations\030\010 \003(\0132!.go"
          + "ogle.monitoring.v3.Aggregation\022\032\n\022denomi"
          + "nator_filter\030\t \001(\t\022C\n\030denominator_aggreg"
          + "ations\030\n \003(\0132!.google.monitoring.v3.Aggr"
          + "egation\0228\n\ncomparison\030\004 \001(\0162$.google.mon"
          + "itoring.v3.ComparisonType\022\027\n\017threshold_v"
          + "alue\030\005 \001(\001\022+\n\010duration\030\006 \001(\0132\031.google.pr"
          + "otobuf.Duration\022D\n\007trigger\030\007 \001(\01323.googl"
          + "e.monitoring.v3.AlertPolicy.Condition.Tr"
          + "igger\032\313\001\n\rMetricAbsence\022\016\n\006filter\030\001 \001(\t\022"
          + "7\n\014aggregations\030\005 \003(\0132!.google.monitorin"
          + "g.v3.Aggregation\022+\n\010duration\030\002 \001(\0132\031.goo"
          + "gle.protobuf.Duration\022D\n\007trigger\030\003 \001(\01323"
          + ".google.monitoring.v3.AlertPolicy.Condit"
          + "ion.TriggerB\013\n\tcondition\0321\n\017UserLabelsEn"
          + "try\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"a\n\025C"
          + "onditionCombinerType\022\027\n\023COMBINE_UNSPECIF"
          + "IED\020\000\022\007\n\003AND\020\001\022\006\n\002OR\020\002\022\036\n\032AND_WITH_MATCH"
          + "ING_RESOURCE\020\003B\242\001\n\030com.google.monitoring"
          + ".v3B\nAlertProtoP\001Z>google.golang.org/gen"
          + "proto/googleapis/monitoring/v3;monitorin"
          + "g\252\002\032Google.Cloud.Monitoring.V3\312\002\032Google\\"
          + "Cloud\\Monitoring\\V3b\006proto3"
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
          com.google.monitoring.v3.CommonProto.getDescriptor(),
          com.google.monitoring.v3.MutationRecordProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        },
        assigner);
    internal_static_google_monitoring_v3_AlertPolicy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_AlertPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Documentation",
              "UserLabels",
              "Conditions",
              "Combiner",
              "Enabled",
              "Validity",
              "NotificationChannels",
              "CreationRecord",
              "MutationRecord",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Documentation_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_AlertPolicy_Documentation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Documentation_descriptor,
            new java.lang.String[] {
              "Content", "MimeType",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "ConditionThreshold", "ConditionAbsent", "Condition",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_descriptor,
            new java.lang.String[] {
              "Count", "Percent", "Type",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_descriptor,
            new java.lang.String[] {
              "Filter",
              "Aggregations",
              "DenominatorFilter",
              "DenominatorAggregations",
              "Comparison",
              "ThresholdValue",
              "Duration",
              "Trigger",
            });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_descriptor,
            new java.lang.String[] {
              "Filter", "Aggregations", "Duration", "Trigger",
            });
    internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_descriptor =
        internal_static_google_monitoring_v3_AlertPolicy_descriptor.getNestedTypes().get(2);
    internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.monitoring.v3.CommonProto.getDescriptor();
    com.google.monitoring.v3.MutationRecordProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
