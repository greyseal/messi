/*
 * Copyright (c) 2014 Red Hat, Inc. and others
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.greyseal.messi.model;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link io.greyseal.messi.model.Mock}.
 *
 * NOTE: This class has been automatically generated from the {@link io.greyseal.messi.model.Mock} original class using Vert.x codegen.
 */
public class MockConverter {

  public static void fromJson(JsonObject json, Mock obj) {
    if (json.getValue("createdBy") instanceof String) {
      obj.setCreatedBy((String)json.getValue("createdBy"));
    }
    if (json.getValue("headers") instanceof JsonObject) {
      java.util.Map<String, java.lang.String> map = new java.util.LinkedHashMap<>();
      json.getJsonObject("headers").forEach(entry -> {
        if (entry.getValue() instanceof String)
          map.put(entry.getKey(), (String)entry.getValue());
      });
      obj.setHeaders(map);
    }
    if (json.getValue("httpMethod") instanceof String) {
      obj.setHttpMethod((String)json.getValue("httpMethod"));
    }
    if (json.getValue("isActive") instanceof Boolean) {
      obj.setIsActive((Boolean)json.getValue("isActive"));
    }
    if (json.getValue("response") instanceof JsonObject) {
      obj.setResponse(((JsonObject)json.getValue("response")).copy());
    }
    if (json.getValue("statusCode") instanceof Number) {
      obj.setStatusCode(((Number)json.getValue("statusCode")).intValue());
    }
    if (json.getValue("updatedBy") instanceof String) {
      obj.setUpdatedBy((String)json.getValue("updatedBy"));
    }
    if (json.getValue("url") instanceof String) {
      obj.setUrl((String)json.getValue("url"));
    }
  }

  public static void toJson(Mock obj, JsonObject json) {
    if (obj.getCreatedBy() != null) {
      json.put("createdBy", obj.getCreatedBy());
    }
    if (obj.getHeaders() != null) {
      JsonObject map = new JsonObject();
      obj.getHeaders().forEach((key,value) -> map.put(key, value));
      json.put("headers", map);
    }
    if (obj.getHttpMethod() != null) {
      json.put("httpMethod", obj.getHttpMethod());
    }
    if (obj.getIsActive() != null) {
      json.put("isActive", obj.getIsActive());
    }
    if (obj.getResponse() != null) {
      json.put("response", obj.getResponse());
    }
    if (obj.getStatusCode() != null) {
      json.put("statusCode", obj.getStatusCode());
    }
    if (obj.getUpdatedBy() != null) {
      json.put("updatedBy", obj.getUpdatedBy());
    }
    if (obj.getUrl() != null) {
      json.put("url", obj.getUrl());
    }
  }
}