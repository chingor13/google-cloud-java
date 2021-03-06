// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto

package com.google.cloud.datalabeling.v1beta1;

public interface SentimentConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.SentimentConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If set to true, contributors will have the option to select sentiment of
   * the label they selected, to mark it as negative or positive label. Default
   * is false.
   * </pre>
   *
   * <code>bool enable_label_sentiment_selection = 1;</code>
   */
  boolean getEnableLabelSentimentSelection();
}
