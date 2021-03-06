// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p2beta1/assets.proto

package com.google.cloud.asset.v1p2beta1;

public interface TimeWindowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p2beta1.TimeWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Start time of the time window (exclusive).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Start time of the time window (exclusive).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Start time of the time window (exclusive).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * End time of the time window (inclusive).
   * Current timestamp if not specified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * End time of the time window (inclusive).
   * Current timestamp if not specified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * End time of the time window (inclusive).
   * Current timestamp if not specified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
