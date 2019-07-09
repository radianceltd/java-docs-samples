/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// [START functions_background_helloworld]
// [START functions_helloworld_pubsub]
package com.example.functions;

import java.util.Base64;
import java.util.logging.Logger;

public class HelloPubSubSample {
  private static Logger logger = Logger.getLogger(HelloPubSubSample.class.getName());

  public void helloPubSub(PubSubMessage message) throws Exception {
    String name = "world";
    if (message.data != null) {
      name = new String(Base64.getDecoder().decode(message.data.getBytes("UTF-8")));
    }
    logger.info(String.format("Hello %s!", name));
  }
}
// [END functions_background_helloworld]
// [END functions_helloworld_pubsub]