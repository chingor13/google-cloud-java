// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1alpha;

public interface CreateScanConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name where the scan is created, which should be a
   * project resource name in the format 'projects/{projectId}'.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource name where the scan is created, which should be a
   * project resource name in the format 'projects/{projectId}'.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ScanConfig to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasScanConfig();
  /**
   *
   *
   * <pre>
   * Required. The ScanConfig to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig getScanConfig();
  /**
   *
   *
   * <pre>
   * Required. The ScanConfig to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder getScanConfigOrBuilder();
}
