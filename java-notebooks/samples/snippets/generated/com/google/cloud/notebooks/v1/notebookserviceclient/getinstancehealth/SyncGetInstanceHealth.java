/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.notebooks.v1.samples;

// [START notebooks_v1_generated_notebookserviceclient_getinstancehealth_sync]
import com.google.cloud.notebooks.v1.GetInstanceHealthRequest;
import com.google.cloud.notebooks.v1.GetInstanceHealthResponse;
import com.google.cloud.notebooks.v1.InstanceName;
import com.google.cloud.notebooks.v1.NotebookServiceClient;

public class SyncGetInstanceHealth {

  public static void main(String[] args) throws Exception {
    syncGetInstanceHealth();
  }

  public static void syncGetInstanceHealth() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (NotebookServiceClient notebookServiceClient = NotebookServiceClient.create()) {
      GetInstanceHealthRequest request =
          GetInstanceHealthRequest.newBuilder()
              .setName(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
              .build();
      GetInstanceHealthResponse response = notebookServiceClient.getInstanceHealth(request);
    }
  }
}
// [END notebooks_v1_generated_notebookserviceclient_getinstancehealth_sync]