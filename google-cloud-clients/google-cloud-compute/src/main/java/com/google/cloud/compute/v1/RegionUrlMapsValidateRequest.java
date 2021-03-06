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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class RegionUrlMapsValidateRequest implements ApiMessage {
  private final UrlMap resource;

  private RegionUrlMapsValidateRequest() {
    this.resource = null;
  }

  private RegionUrlMapsValidateRequest(UrlMap resource) {
    this.resource = resource;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("resource".equals(fieldName)) {
      return resource;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /** Content of the UrlMap to be validated. */
  public UrlMap getResource() {
    return resource;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(RegionUrlMapsValidateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static RegionUrlMapsValidateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final RegionUrlMapsValidateRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new RegionUrlMapsValidateRequest();
  }

  public static class Builder {
    private UrlMap resource;

    Builder() {}

    public Builder mergeFrom(RegionUrlMapsValidateRequest other) {
      if (other == RegionUrlMapsValidateRequest.getDefaultInstance()) return this;
      if (other.getResource() != null) {
        this.resource = other.resource;
      }
      return this;
    }

    Builder(RegionUrlMapsValidateRequest source) {
      this.resource = source.resource;
    }

    /** Content of the UrlMap to be validated. */
    public UrlMap getResource() {
      return resource;
    }

    /** Content of the UrlMap to be validated. */
    public Builder setResource(UrlMap resource) {
      this.resource = resource;
      return this;
    }

    public RegionUrlMapsValidateRequest build() {
      return new RegionUrlMapsValidateRequest(resource);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setResource(this.resource);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "RegionUrlMapsValidateRequest{" + "resource=" + resource + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RegionUrlMapsValidateRequest) {
      RegionUrlMapsValidateRequest that = (RegionUrlMapsValidateRequest) o;
      return Objects.equals(this.resource, that.getResource());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource);
  }
}
