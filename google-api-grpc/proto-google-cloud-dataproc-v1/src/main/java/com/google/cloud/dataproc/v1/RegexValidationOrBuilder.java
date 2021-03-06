// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

public interface RegexValidationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.RegexValidation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. RE2 regular expressions used to validate the parameter's value.
   * The value must match the regex in its entirety (substring
   * matches are not sufficient).
   * </pre>
   *
   * <code>repeated string regexes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<java.lang.String> getRegexesList();
  /**
   *
   *
   * <pre>
   * Required. RE2 regular expressions used to validate the parameter's value.
   * The value must match the regex in its entirety (substring
   * matches are not sufficient).
   * </pre>
   *
   * <code>repeated string regexes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getRegexesCount();
  /**
   *
   *
   * <pre>
   * Required. RE2 regular expressions used to validate the parameter's value.
   * The value must match the regex in its entirety (substring
   * matches are not sufficient).
   * </pre>
   *
   * <code>repeated string regexes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getRegexes(int index);
  /**
   *
   *
   * <pre>
   * Required. RE2 regular expressions used to validate the parameter's value.
   * The value must match the regex in its entirety (substring
   * matches are not sufficient).
   * </pre>
   *
   * <code>repeated string regexes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getRegexesBytes(int index);
}
