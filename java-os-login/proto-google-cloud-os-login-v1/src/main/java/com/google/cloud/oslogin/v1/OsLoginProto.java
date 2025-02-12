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
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

public final class OsLoginProto {
  private OsLoginProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_LoginProfile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_LoginProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_CreateSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_CreateSshPublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/oslogin/v1/oslogin.proto\022"
          + "\027google.cloud.oslogin.v1\032\034google/api/ann"
          + "otations.proto\032\027google/api/client.proto\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032(google/cloud/oslogi"
          + "n/common/common.proto\032\033google/protobuf/e"
          + "mpty.proto\032 google/protobuf/field_mask.p"
          + "roto\"\230\002\n\014LoginProfile\022\021\n\004name\030\001 \001(\tB\003\340A\002"
          + "\022A\n\016posix_accounts\030\002 \003(\0132).google.cloud."
          + "oslogin.common.PosixAccount\022Q\n\017ssh_publi"
          + "c_keys\030\003 \003(\01328.google.cloud.oslogin.v1.L"
          + "oginProfile.SshPublicKeysEntry\032_\n\022SshPub"
          + "licKeysEntry\022\013\n\003key\030\001 \001(\t\0228\n\005value\030\002 \001(\013"
          + "2).google.cloud.oslogin.common.SshPublic"
          + "Key:\0028\001\"\240\001\n\031CreateSshPublicKeyRequest\022;\n"
          + "\006parent\030\001 \001(\tB+\340A\002\372A%\022#oslogin.googleapi"
          + "s.com/SshPublicKey\022F\n\016ssh_public_key\030\002 \001"
          + "(\0132).google.cloud.oslogin.common.SshPubl"
          + "icKeyB\003\340A\002\"V\n\031DeletePosixAccountRequest\022"
          + "9\n\004name\030\001 \001(\tB+\340A\002\372A%\n#oslogin.googleapi"
          + "s.com/PosixAccount\"V\n\031DeleteSshPublicKey"
          + "Request\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#oslogin.g"
          + "oogleapis.com/SshPublicKey\"z\n\026GetLoginPr"
          + "ofileRequest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\022#oslo"
          + "gin.googleapis.com/PosixAccount\022\022\n\nproje"
          + "ct_id\030\002 \001(\t\022\021\n\tsystem_id\030\003 \001(\t\"S\n\026GetSsh"
          + "PublicKeyRequest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#"
          + "oslogin.googleapis.com/SshPublicKey\"\264\001\n\031"
          + "ImportSshPublicKeyRequest\022;\n\006parent\030\001 \001("
          + "\tB+\340A\002\372A%\022#oslogin.googleapis.com/SshPub"
          + "licKey\022F\n\016ssh_public_key\030\002 \001(\0132).google."
          + "cloud.oslogin.common.SshPublicKeyB\003\340A\001\022\022"
          + "\n\nproject_id\030\003 \001(\t\"k\n\032ImportSshPublicKey"
          + "Response\022<\n\rlogin_profile\030\001 \001(\0132%.google"
          + ".cloud.oslogin.v1.LoginProfile\022\017\n\007detail"
          + "s\030\002 \001(\t\"\317\001\n\031UpdateSshPublicKeyRequest\0229\n"
          + "\004name\030\001 \001(\tB+\340A\002\372A%\n#oslogin.googleapis."
          + "com/SshPublicKey\022F\n\016ssh_public_key\030\002 \001(\013"
          + "2).google.cloud.oslogin.common.SshPublic"
          + "KeyB\003\340A\002\022/\n\013update_mask\030\003 \001(\0132\032.google.p"
          + "rotobuf.FieldMask2\206\014\n\016OsLoginService\022\307\001\n"
          + "\022CreateSshPublicKey\0222.google.cloud.oslog"
          + "in.v1.CreateSshPublicKeyRequest\032).google"
          + ".cloud.oslogin.common.SshPublicKey\"R\202\323\344\223"
          + "\0024\"\"/v1/{parent=users/*}/sshPublicKeys:\016"
          + "ssh_public_key\332A\025parent,ssh_public_key\022\216"
          + "\001\n\022DeletePosixAccount\0222.google.cloud.osl"
          + "ogin.v1.DeletePosixAccountRequest\032\026.goog"
          + "le.protobuf.Empty\",\202\323\344\223\002\037*\035/v1/{name=use"
          + "rs/*/projects/*}\332A\004name\022\223\001\n\022DeleteSshPub"
          + "licKey\0222.google.cloud.oslogin.v1.DeleteS"
          + "shPublicKeyRequest\032\026.google.protobuf.Emp"
          + "ty\"1\202\323\344\223\002$*\"/v1/{name=users/*/sshPublicK"
          + "eys/*}\332A\004name\022\231\001\n\017GetLoginProfile\022/.goog"
          + "le.cloud.oslogin.v1.GetLoginProfileReque"
          + "st\032%.google.cloud.oslogin.v1.LoginProfil"
          + "e\".\202\323\344\223\002!\022\037/v1/{name=users/*}/loginProfi"
          + "le\332A\004name\022\240\001\n\017GetSshPublicKey\022/.google.c"
          + "loud.oslogin.v1.GetSshPublicKeyRequest\032)"
          + ".google.cloud.oslogin.common.SshPublicKe"
          + "y\"1\202\323\344\223\002$\022\"/v1/{name=users/*/sshPublicKe"
          + "ys/*}\332A\004name\022\371\001\n\022ImportSshPublicKey\0222.go"
          + "ogle.cloud.oslogin.v1.ImportSshPublicKey"
          + "Request\0323.google.cloud.oslogin.v1.Import"
          + "SshPublicKeyResponse\"z\202\323\344\223\0029\"\'/v1/{paren"
          + "t=users/*}:importSshPublicKey:\016ssh_publi"
          + "c_key\332A\025parent,ssh_public_key\332A parent,s"
          + "sh_public_key,project_id\022\347\001\n\022UpdateSshPu"
          + "blicKey\0222.google.cloud.oslogin.v1.Update"
          + "SshPublicKeyRequest\032).google.cloud.oslog"
          + "in.common.SshPublicKey\"r\202\323\344\223\00242\"/v1/{nam"
          + "e=users/*/sshPublicKeys/*}:\016ssh_public_k"
          + "ey\332A\023name,ssh_public_key\332A\037name,ssh_publ"
          + "ic_key,update_mask\032\335\001\312A\026oslogin.googleap"
          + "is.com\322A\300\001https://www.googleapis.com/aut"
          + "h/cloud-platform,https://www.googleapis."
          + "com/auth/cloud-platform.read-only,https:"
          + "//www.googleapis.com/auth/compute,https:"
          + "//www.googleapis.com/auth/compute.readon"
          + "lyB\276\001\n\033com.google.cloud.oslogin.v1B\014OsLo"
          + "ginProtoP\001Z>google.golang.org/genproto/g"
          + "oogleapis/cloud/oslogin/v1;oslogin\252\002\027Goo"
          + "gle.Cloud.OsLogin.V1\312\002\027Google\\Cloud\\OsLo"
          + "gin\\V1\352\002\032Google::Cloud::OsLogin::V1b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.oslogin.common.OsLoginProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_oslogin_v1_LoginProfile_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_oslogin_v1_LoginProfile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_LoginProfile_descriptor,
            new java.lang.String[] {
              "Name", "PosixAccounts", "SshPublicKeys",
            });
    internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_descriptor =
        internal_static_google_cloud_oslogin_v1_LoginProfile_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_LoginProfile_SshPublicKeysEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_oslogin_v1_CreateSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_oslogin_v1_CreateSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_CreateSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SshPublicKey",
            });
    internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_DeletePosixAccountRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_DeleteSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_GetLoginProfileRequest_descriptor,
            new java.lang.String[] {
              "Name", "ProjectId", "SystemId",
            });
    internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_GetSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SshPublicKey", "ProjectId",
            });
    internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_descriptor,
            new java.lang.String[] {
              "LoginProfile", "Details",
            });
    internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor,
            new java.lang.String[] {
              "Name", "SshPublicKey", "UpdateMask",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.oslogin.common.OsLoginProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
