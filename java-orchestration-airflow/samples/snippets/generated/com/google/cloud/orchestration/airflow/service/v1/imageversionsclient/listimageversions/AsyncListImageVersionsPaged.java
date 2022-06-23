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

package com.google.cloud.orchestration.airflow.service.v1.samples;

// [START service_v1_generated_imageversionsclient_listimageversions_paged_async]
import com.google.cloud.orchestration.airflow.service.v1.ImageVersion;
import com.google.cloud.orchestration.airflow.service.v1.ImageVersionsClient;
import com.google.cloud.orchestration.airflow.service.v1.ListImageVersionsRequest;
import com.google.cloud.orchestration.airflow.service.v1.ListImageVersionsResponse;
import com.google.common.base.Strings;

public class AsyncListImageVersionsPaged {

  public static void main(String[] args) throws Exception {
    asyncListImageVersionsPaged();
  }

  public static void asyncListImageVersionsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ImageVersionsClient imageVersionsClient = ImageVersionsClient.create()) {
      ListImageVersionsRequest request =
          ListImageVersionsRequest.newBuilder()
              .setParent("parent-995424086")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setIncludePastReleases(true)
              .build();
      while (true) {
        ListImageVersionsResponse response =
            imageVersionsClient.listImageVersionsCallable().call(request);
        for (ImageVersion element : response.getImageVersionsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END service_v1_generated_imageversionsclient_listimageversions_paged_async]
