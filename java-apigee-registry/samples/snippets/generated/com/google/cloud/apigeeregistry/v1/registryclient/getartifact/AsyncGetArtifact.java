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

package com.google.cloud.apigeeregistry.v1.samples;

// [START apigeeregistry_v1_generated_registryclient_getartifact_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.apigeeregistry.v1.Artifact;
import com.google.cloud.apigeeregistry.v1.ArtifactName;
import com.google.cloud.apigeeregistry.v1.GetArtifactRequest;
import com.google.cloud.apigeeregistry.v1.RegistryClient;

public class AsyncGetArtifact {

  public static void main(String[] args) throws Exception {
    asyncGetArtifact();
  }

  public static void asyncGetArtifact() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RegistryClient registryClient = RegistryClient.create()) {
      GetArtifactRequest request =
          GetArtifactRequest.newBuilder()
              .setName(
                  ArtifactName.ofProjectLocationArtifactName(
                          "[PROJECT]", "[LOCATION]", "[ARTIFACT]")
                      .toString())
              .build();
      ApiFuture<Artifact> future = registryClient.getArtifactCallable().futureCall(request);
      // Do something.
      Artifact response = future.get();
    }
  }
}
// [END apigeeregistry_v1_generated_registryclient_getartifact_async]