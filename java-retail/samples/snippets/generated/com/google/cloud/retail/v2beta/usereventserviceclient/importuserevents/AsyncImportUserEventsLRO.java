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

package com.google.cloud.retail.v2beta.samples;

// [START retail_v2beta_generated_usereventserviceclient_importuserevents_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.retail.v2beta.CatalogName;
import com.google.cloud.retail.v2beta.ImportErrorsConfig;
import com.google.cloud.retail.v2beta.ImportMetadata;
import com.google.cloud.retail.v2beta.ImportUserEventsRequest;
import com.google.cloud.retail.v2beta.ImportUserEventsResponse;
import com.google.cloud.retail.v2beta.UserEventInputConfig;
import com.google.cloud.retail.v2beta.UserEventServiceClient;

public class AsyncImportUserEventsLRO {

  public static void main(String[] args) throws Exception {
    asyncImportUserEventsLRO();
  }

  public static void asyncImportUserEventsLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (UserEventServiceClient userEventServiceClient = UserEventServiceClient.create()) {
      ImportUserEventsRequest request =
          ImportUserEventsRequest.newBuilder()
              .setParent(CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
              .setInputConfig(UserEventInputConfig.newBuilder().build())
              .setErrorsConfig(ImportErrorsConfig.newBuilder().build())
              .build();
      OperationFuture<ImportUserEventsResponse, ImportMetadata> future =
          userEventServiceClient.importUserEventsOperationCallable().futureCall(request);
      // Do something.
      ImportUserEventsResponse response = future.get();
    }
  }
}
// [END retail_v2beta_generated_usereventserviceclient_importuserevents_lro_async]