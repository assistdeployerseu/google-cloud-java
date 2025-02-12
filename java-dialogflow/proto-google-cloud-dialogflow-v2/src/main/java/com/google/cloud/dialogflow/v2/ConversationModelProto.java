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
// source: google/cloud/dialogflow/v2/conversation_model.proto

package com.google.cloud.dialogflow.v2;

public final class ConversationModelProto {
  private ConversationModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ConversationModel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ConversationModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ConversationModelEvaluation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ConversationModelEvaluation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EvaluationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EvaluationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartReplyConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartReplyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartComposeConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartComposeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_InputDataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_InputDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_TopNMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_TopNMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetConversationModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetConversationModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListConversationModelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListConversationModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteConversationModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteConversationModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeployConversationModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeployConversationModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UndeployConversationModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UndeployConversationModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetConversationModelEvaluationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetConversationModelEvaluationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeployConversationModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeployConversationModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteConversationModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteConversationModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/dialogflow/v2/conversatio"
          + "n_model.proto\022\032google.cloud.dialogflow.v"
          + "2\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032#go"
          + "ogle/longrunning/operations.proto\032\037googl"
          + "e/protobuf/timestamp.proto\"\247\007\n\021Conversat"
          + "ionModel\022\014\n\004name\030\001 \001(\t\022\031\n\014display_name\030\002"
          + " \001(\tB\003\340A\002\0224\n\013create_time\030\003 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022?\n\010datasets\030\004 \003("
          + "\0132(.google.cloud.dialogflow.v2.InputData"
          + "setB\003\340A\002\022G\n\005state\030\007 \001(\01623.google.cloud.d"
          + "ialogflow.v2.ConversationModel.StateB\003\340A"
          + "\003\022\025\n\rlanguage_code\030\023 \001(\t\022g\n!article_sugg"
          + "estion_model_metadata\030\010 \001(\0132:.google.clo"
          + "ud.dialogflow.v2.ArticleSuggestionModelM"
          + "etadataH\000\022Y\n\032smart_reply_model_metadata\030"
          + "\t \001(\01323.google.cloud.dialogflow.v2.Smart"
          + "ReplyModelMetadataH\000\"\221\001\n\005State\022\025\n\021STATE_"
          + "UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\016\n\nUNDEPLOYE"
          + "D\020\002\022\r\n\tDEPLOYING\020\003\022\014\n\010DEPLOYED\020\004\022\017\n\013UNDE"
          + "PLOYING\020\005\022\014\n\010DELETING\020\006\022\n\n\006FAILED\020\007\022\013\n\007P"
          + "ENDING\020\010\"g\n\tModelType\022\032\n\026MODEL_TYPE_UNSP"
          + "ECIFIED\020\000\022\"\n\036SMART_REPLY_DUAL_ENCODER_MO"
          + "DEL\020\002\022\032\n\026SMART_REPLY_BERT_MODEL\020\006:\276\001\352A\272\001"
          + "\n+dialogflow.googleapis.com/Conversation"
          + "Model\022Oprojects/{project}/locations/{loc"
          + "ation}/conversationModels/{conversation_"
          + "model}\022:projects/{project}/conversationM"
          + "odels/{conversation_model}B\020\n\016model_meta"
          + "data\"\317\004\n\033ConversationModelEvaluation\022\014\n\004"
          + "name\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\001\022L\n"
          + "\021evaluation_config\030\006 \001(\0132,.google.cloud."
          + "dialogflow.v2.EvaluationConfigB\003\340A\001\0224\n\013c"
          + "reate_time\030\003 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022Q\n\023smart_reply_metrics\030\005 \001(\0132-"
          + ".google.cloud.dialogflow.v2.SmartReplyMe"
          + "tricsB\003\340A\003H\000\022(\n\033raw_human_eval_template_"
          + "csv\030\010 \001(\tB\003\340A\003:\372\001\352A\366\001\n5dialogflow.google"
          + "apis.com/ConversationModelEvaluation\022Spr"
          + "ojects/{project}/conversationModels/{con"
          + "versation_model}/evaluations/{evaluation"
          + "}\022hprojects/{project}/locations/{locatio"
          + "n}/conversationModels/{conversation_mode"
          + "l}/evaluations/{evaluation}B\t\n\007metrics\"\234"
          + "\004\n\020EvaluationConfig\022?\n\010datasets\030\003 \003(\0132(."
          + "google.cloud.dialogflow.v2.InputDatasetB"
          + "\003\340A\002\022[\n\022smart_reply_config\030\002 \001(\0132=.googl"
          + "e.cloud.dialogflow.v2.EvaluationConfig.S"
          + "martReplyConfigH\000\022_\n\024smart_compose_confi"
          + "g\030\004 \001(\0132?.google.cloud.dialogflow.v2.Eva"
          + "luationConfig.SmartComposeConfigH\000\032v\n\020Sm"
          + "artReplyConfig\022C\n\022allowlist_document\030\001 \001"
          + "(\tB\'\372A$\n\"dialogflow.googleapis.com/Docum"
          + "ent\022\035\n\020max_result_count\030\002 \001(\005B\003\340A\002\032x\n\022Sm"
          + "artComposeConfig\022C\n\022allowlist_document\030\001"
          + " \001(\tB\'\372A$\n\"dialogflow.googleapis.com/Doc"
          + "ument\022\035\n\020max_result_count\030\002 \001(\005B\003\340A\002B\027\n\025"
          + "model_specific_config\"V\n\014InputDataset\022F\n"
          + "\007dataset\030\001 \001(\tB5\340A\002\372A/\n-dialogflow.googl"
          + "eapis.com/ConversationDataset\"{\n\036Article"
          + "SuggestionModelMetadata\022Y\n\023training_mode"
          + "l_type\030\003 \001(\01627.google.cloud.dialogflow.v"
          + "2.ConversationModel.ModelTypeB\003\340A\001\"t\n\027Sm"
          + "artReplyModelMetadata\022Y\n\023training_model_"
          + "type\030\006 \001(\01627.google.cloud.dialogflow.v2."
          + "ConversationModel.ModelTypeB\003\340A\001\"\307\001\n\021Sma"
          + "rtReplyMetrics\022\032\n\022allowlist_coverage\030\001 \001"
          + "(\002\022P\n\rtop_n_metrics\030\002 \003(\01329.google.cloud"
          + ".dialogflow.v2.SmartReplyMetrics.TopNMet"
          + "rics\022\032\n\022conversation_count\030\003 \001(\003\032(\n\013TopN"
          + "Metrics\022\t\n\001n\030\001 \001(\005\022\016\n\006recall\030\002 \001(\002\"\200\001\n\036C"
          + "reateConversationModelRequest\022\016\n\006parent\030"
          + "\001 \001(\t\022N\n\022conversation_model\030\002 \001(\0132-.goog"
          + "le.cloud.dialogflow.v2.ConversationModel"
          + "B\003\340A\002\"0\n\033GetConversationModelRequest\022\021\n\004"
          + "name\030\001 \001(\tB\003\340A\002\"e\n\035ListConversationModel"
          + "sRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022\026\n\tpage_si"
          + "ze\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"\205"
          + "\001\n\036ListConversationModelsResponse\022J\n\023con"
          + "versation_models\030\001 \003(\0132-.google.cloud.di"
          + "alogflow.v2.ConversationModel\022\027\n\017next_pa"
          + "ge_token\030\002 \001(\t\"3\n\036DeleteConversationMode"
          + "lRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"3\n\036DeployCon"
          + "versationModelRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002"
          + "\"5\n UndeployConversationModelRequest\022\021\n\004"
          + "name\030\001 \001(\tB\003\340A\002\":\n%GetConversationModelE"
          + "valuationRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"o\n\'L"
          + "istConversationModelEvaluationsRequest\022\023"
          + "\n\006parent\030\001 \001(\tB\003\340A\002\022\026\n\tpage_size\030\002 \001(\005B\003"
          + "\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"\244\001\n(ListCon"
          + "versationModelEvaluationsResponse\022_\n\036con"
          + "versation_model_evaluations\030\001 \003(\01327.goog"
          + "le.cloud.dialogflow.v2.ConversationModel"
          + "Evaluation\022\027\n\017next_page_token\030\002 \001(\t\"\336\001\n("
          + "CreateConversationModelEvaluationRequest"
          + "\022M\n\006parent\030\001 \001(\tB=\340A\002\372A7\0225dialogflow.goo"
          + "gleapis.com/ConversationModelEvaluation\022"
          + "c\n\035conversation_model_evaluation\030\002 \001(\01327"
          + ".google.cloud.dialogflow.v2.Conversation"
          + "ModelEvaluationB\003\340A\002\"\307\002\n(CreateConversat"
          + "ionModelOperationMetadata\022\032\n\022conversatio"
          + "n_model\030\001 \001(\t\022Y\n\005state\030\002 \001(\0162J.google.cl"
          + "oud.dialogflow.v2.CreateConversationMode"
          + "lOperationMetadata.State\022/\n\013create_time\030"
          + "\003 \001(\0132\032.google.protobuf.Timestamp\"s\n\005Sta"
          + "te\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\r"
          + "\n\tSUCCEEDED\020\002\022\n\n\006FAILED\020\003\022\r\n\tCANCELLED\020\004"
          + "\022\016\n\nCANCELLING\020\005\022\014\n\010TRAINING\020\006\"w\n(Deploy"
          + "ConversationModelOperationMetadata\022\032\n\022co"
          + "nversation_model\030\001 \001(\t\022/\n\013create_time\030\003 "
          + "\001(\0132\032.google.protobuf.Timestamp\"y\n*Undep"
          + "loyConversationModelOperationMetadata\022\032\n"
          + "\022conversation_model\030\001 \001(\t\022/\n\013create_time"
          + "\030\003 \001(\0132\032.google.protobuf.Timestamp\"w\n(De"
          + "leteConversationModelOperationMetadata\022\032"
          + "\n\022conversation_model\030\001 \001(\t\022/\n\013create_tim"
          + "e\030\003 \001(\0132\032.google.protobuf.Timestamp\"\366\002\n2"
          + "CreateConversationModelEvaluationOperati"
          + "onMetadata\022%\n\035conversation_model_evaluat"
          + "ion\030\001 \001(\t\022\032\n\022conversation_model\030\004 \001(\t\022c\n"
          + "\005state\030\002 \001(\0162T.google.cloud.dialogflow.v"
          + "2.CreateConversationModelEvaluationOpera"
          + "tionMetadata.State\022/\n\013create_time\030\003 \001(\0132"
          + "\032.google.protobuf.Timestamp\"g\n\005State\022\025\n\021"
          + "STATE_UNSPECIFIED\020\000\022\020\n\014INITIALIZING\020\001\022\013\n"
          + "\007RUNNING\020\002\022\r\n\tCANCELLED\020\003\022\r\n\tSUCCEEDED\020\004"
          + "\022\n\n\006FAILED\020\0052\376\026\n\022ConversationModels\022\350\002\n\027"
          + "CreateConversationModel\022:.google.cloud.d"
          + "ialogflow.v2.CreateConversationModelRequ"
          + "est\032\035.google.longrunning.Operation\"\361\001\202\323\344"
          + "\223\002\216\001\"*/v2/{parent=projects/*}/conversati"
          + "onModels:\022conversation_modelZL\"6/v2/{par"
          + "ent=projects/*/locations/*}/conversation"
          + "Models:\022conversation_model\332A\031parent,conv"
          + "ersation_model\312A=\n\021ConversationModel\022(Cr"
          + "eateConversationModelOperationMetadata\022\363"
          + "\001\n\024GetConversationModel\0227.google.cloud.d"
          + "ialogflow.v2.GetConversationModelRequest"
          + "\032-.google.cloud.dialogflow.v2.Conversati"
          + "onModel\"s\202\323\344\223\002f\022*/v2/{name=projects/*/co"
          + "nversationModels/*}Z8\0226/v2/{name=project"
          + "s/*/locations/*/conversationModels/*}\332A\004"
          + "name\022\206\002\n\026ListConversationModels\0229.google"
          + ".cloud.dialogflow.v2.ListConversationMod"
          + "elsRequest\032:.google.cloud.dialogflow.v2."
          + "ListConversationModelsResponse\"u\202\323\344\223\002f\022*"
          + "/v2/{parent=projects/*}/conversationMode"
          + "lsZ8\0226/v2/{parent=projects/*/locations/*"
          + "}/conversationModels\332A\006parent\022\256\002\n\027Delete"
          + "ConversationModel\022:.google.cloud.dialogf"
          + "low.v2.DeleteConversationModelRequest\032\035."
          + "google.longrunning.Operation\"\267\001\202\323\344\223\002f**/"
          + "v2/{name=projects/*/conversationModels/*"
          + "}Z8*6/v2/{name=projects/*/locations/*/co"
          + "nversationModels/*}\332A\004name\312AA\n\025google.pr"
          + "otobuf.Empty\022(DeleteConversationModelOpe"
          + "rationMetadata\022\273\002\n\027DeployConversationMod"
          + "el\022:.google.cloud.dialogflow.v2.DeployCo"
          + "nversationModelRequest\032\035.google.longrunn"
          + "ing.Operation\"\304\001\202\323\344\223\002z\"1/v2/{name=projec"
          + "ts/*/conversationModels/*}:deploy:\001*ZB\"="
          + "/v2/{name=projects/*/locations/*/convers"
          + "ationModels/*}:deploy:\001*\312AA\n\025google.prot"
          + "obuf.Empty\022(DeployConversationModelOpera"
          + "tionMetadata\022\305\002\n\031UndeployConversationMod"
          + "el\022<.google.cloud.dialogflow.v2.Undeploy"
          + "ConversationModelRequest\032\035.google.longru"
          + "nning.Operation\"\312\001\202\323\344\223\002~\"3/v2/{name=proj"
          + "ects/*/conversationModels/*}:undeploy:\001*"
          + "ZD\"?/v2/{name=projects/*/locations/*/con"
          + "versationModels/*}:undeploy:\001*\312AC\n\025googl"
          + "e.protobuf.Empty\022*UndeployConversationMo"
          + "delOperationMetadata\022\257\002\n\036GetConversation"
          + "ModelEvaluation\022A.google.cloud.dialogflo"
          + "w.v2.GetConversationModelEvaluationReque"
          + "st\0327.google.cloud.dialogflow.v2.Conversa"
          + "tionModelEvaluation\"\220\001\202\323\344\223\002\202\001\0228/v2/{name"
          + "=projects/*/conversationModels/*/evaluat"
          + "ions/*}ZF\022D/v2/{name=projects/*/location"
          + "s/*/conversationModels/*/evaluations/*}\332"
          + "A\004name\022\302\002\n ListConversationModelEvaluati"
          + "ons\022C.google.cloud.dialogflow.v2.ListCon"
          + "versationModelEvaluationsRequest\032D.googl"
          + "e.cloud.dialogflow.v2.ListConversationMo"
          + "delEvaluationsResponse\"\222\001\202\323\344\223\002\202\001\0228/v2/{p"
          + "arent=projects/*/conversationModels/*}/e"
          + "valuationsZF\022D/v2/{parent=projects/*/loc"
          + "ations/*/conversationModels/*}/evaluatio"
          + "ns\332A\006parent\022\325\002\n!CreateConversationModelE"
          + "valuation\022D.google.cloud.dialogflow.v2.C"
          + "reateConversationModelEvaluationRequest\032"
          + "\035.google.longrunning.Operation\"\312\001\202\323\344\223\002I\""
          + "D/v2/{parent=projects/*/locations/*/conv"
          + "ersationModels/*}/evaluations:\001*\332A$paren"
          + "t,conversation_model_evaluation\312AQ\n\033Conv"
          + "ersationModelEvaluation\0222CreateConversat"
          + "ionModelEvaluationOperationMetadata\032x\312A\031"
          + "dialogflow.googleapis.com\322AYhttps://www."
          + "googleapis.com/auth/cloud-platform,https"
          + "://www.googleapis.com/auth/dialogflowB\237\001"
          + "\n\036com.google.cloud.dialogflow.v2B\026Conver"
          + "sationModelProtoP\001Z>cloud.google.com/go/"
          + "dialogflow/apiv2/dialogflowpb;dialogflow"
          + "pb\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V2b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_ConversationModel_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_ConversationModel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ConversationModel_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "CreateTime",
              "Datasets",
              "State",
              "LanguageCode",
              "ArticleSuggestionModelMetadata",
              "SmartReplyModelMetadata",
              "ModelMetadata",
            });
    internal_static_google_cloud_dialogflow_v2_ConversationModelEvaluation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ConversationModelEvaluation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ConversationModelEvaluation_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "EvaluationConfig",
              "CreateTime",
              "SmartReplyMetrics",
              "RawHumanEvalTemplateCsv",
              "Metrics",
            });
    internal_static_google_cloud_dialogflow_v2_EvaluationConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_EvaluationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EvaluationConfig_descriptor,
            new java.lang.String[] {
              "Datasets", "SmartReplyConfig", "SmartComposeConfig", "ModelSpecificConfig",
            });
    internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartReplyConfig_descriptor =
        internal_static_google_cloud_dialogflow_v2_EvaluationConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartReplyConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartReplyConfig_descriptor,
            new java.lang.String[] {
              "AllowlistDocument", "MaxResultCount",
            });
    internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartComposeConfig_descriptor =
        internal_static_google_cloud_dialogflow_v2_EvaluationConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartComposeConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EvaluationConfig_SmartComposeConfig_descriptor,
            new java.lang.String[] {
              "AllowlistDocument", "MaxResultCount",
            });
    internal_static_google_cloud_dialogflow_v2_InputDataset_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_InputDataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_InputDataset_descriptor,
            new java.lang.String[] {
              "Dataset",
            });
    internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ArticleSuggestionModelMetadata_descriptor,
            new java.lang.String[] {
              "TrainingModelType",
            });
    internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_descriptor,
            new java.lang.String[] {
              "TrainingModelType",
            });
    internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_descriptor,
            new java.lang.String[] {
              "AllowlistCoverage", "TopNMetrics", "ConversationCount",
            });
    internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_TopNMetrics_descriptor =
        internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_TopNMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SmartReplyMetrics_TopNMetrics_descriptor,
            new java.lang.String[] {
              "N", "Recall",
            });
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ConversationModel",
            });
    internal_static_google_cloud_dialogflow_v2_GetConversationModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_GetConversationModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetConversationModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_ListConversationModelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_ListConversationModelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListConversationModelsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListConversationModelsResponse_descriptor,
            new java.lang.String[] {
              "ConversationModels", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteConversationModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_DeleteConversationModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteConversationModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_DeployConversationModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2_DeployConversationModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeployConversationModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_UndeployConversationModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2_UndeployConversationModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UndeployConversationModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_GetConversationModelEvaluationRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_dialogflow_v2_GetConversationModelEvaluationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetConversationModelEvaluationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListConversationModelEvaluationsResponse_descriptor,
            new java.lang.String[] {
              "ConversationModelEvaluations", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ConversationModelEvaluation",
            });
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateConversationModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "ConversationModel", "State", "CreateTime",
            });
    internal_static_google_cloud_dialogflow_v2_DeployConversationModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_cloud_dialogflow_v2_DeployConversationModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeployConversationModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "ConversationModel", "CreateTime",
            });
    internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(20);
    internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "ConversationModel", "CreateTime",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteConversationModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(21);
    internal_static_google_cloud_dialogflow_v2_DeleteConversationModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteConversationModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "ConversationModel", "CreateTime",
            });
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(22);
    internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationOperationMetadata_descriptor,
            new java.lang.String[] {
              "ConversationModelEvaluation", "ConversationModel", "State", "CreateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
