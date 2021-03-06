// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/webrisk/v1beta1/webrisk.proto

package com.google.webrisk.v1beta1;

public interface ComputeThreatListDiffRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1beta1.ComputeThreatListDiffRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ThreatList to update.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1beta1.ThreatType threat_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getThreatTypeValue();
  /**
   *
   *
   * <pre>
   * The ThreatList to update.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1beta1.ThreatType threat_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.webrisk.v1beta1.ThreatType getThreatType();

  /**
   *
   *
   * <pre>
   * The current version token of the client for the requested list (the
   * client version that was received from the last successful diff).
   * </pre>
   *
   * <code>bytes version_token = 2;</code>
   */
  com.google.protobuf.ByteString getVersionToken();

  /**
   *
   *
   * <pre>
   * Required. The constraints associated with this request.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1beta1.ComputeThreatListDiffRequest.Constraints constraints = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasConstraints();
  /**
   *
   *
   * <pre>
   * Required. The constraints associated with this request.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1beta1.ComputeThreatListDiffRequest.Constraints constraints = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.webrisk.v1beta1.ComputeThreatListDiffRequest.Constraints getConstraints();
  /**
   *
   *
   * <pre>
   * Required. The constraints associated with this request.
   * </pre>
   *
   * <code>
   * .google.cloud.webrisk.v1beta1.ComputeThreatListDiffRequest.Constraints constraints = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.webrisk.v1beta1.ComputeThreatListDiffRequest.ConstraintsOrBuilder
      getConstraintsOrBuilder();
}
