// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_metrics.proto

package com.google.logging.v2;

public interface LogMetricOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.LogMetric)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The client-assigned metric identifier.
   * Examples: `"error_count"`, `"nginx/requests"`.
   * Metric identifiers are limited to 100 characters and can include only the
   * following characters: `A-Z`, `a-z`, `0-9`, and the special characters
   * `_-.,+!*',()%/`. The forward-slash character (`/`) denotes a hierarchy of
   * name pieces, and it cannot be the first character of the name.
   * The metric identifier in this field must not be
   * [URL-encoded](https://en.wikipedia.org/wiki/Percent-encoding).
   * However, when the metric identifier appears as the `[METRIC_ID]` part of a
   * `metric_name` API parameter, then the metric identifier must be
   * URL-encoded. Example: `"projects/my-project/metrics/nginx%2Frequests"`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The client-assigned metric identifier.
   * Examples: `"error_count"`, `"nginx/requests"`.
   * Metric identifiers are limited to 100 characters and can include only the
   * following characters: `A-Z`, `a-z`, `0-9`, and the special characters
   * `_-.,+!*',()%/`. The forward-slash character (`/`) denotes a hierarchy of
   * name pieces, and it cannot be the first character of the name.
   * The metric identifier in this field must not be
   * [URL-encoded](https://en.wikipedia.org/wiki/Percent-encoding).
   * However, when the metric identifier appears as the `[METRIC_ID]` part of a
   * `metric_name` API parameter, then the metric identifier must be
   * URL-encoded. Example: `"projects/my-project/metrics/nginx%2Frequests"`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. A description of this metric, which is used in documentation.
   * The maximum length of the description is 8000 characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. A description of this metric, which is used in documentation.
   * The maximum length of the description is 8000 characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. An [advanced logs filter](/logging/docs/view/advanced_filters)
   * which is used to match log entries.
   * Example:
   *     "resource.type=gae_app AND severity&gt;=ERROR"
   * The maximum length of the filter is 20000 characters.
   * </pre>
   *
   * <code>string filter = 3;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Required. An [advanced logs filter](/logging/docs/view/advanced_filters)
   * which is used to match log entries.
   * Example:
   *     "resource.type=gae_app AND severity&gt;=ERROR"
   * The maximum length of the filter is 20000 characters.
   * </pre>
   *
   * <code>string filter = 3;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. The metric descriptor associated with the logs-based metric.
   * If unspecified, it uses a default metric descriptor with a DELTA metric
   * kind, INT64 value type, with no labels and a unit of "1". Such a metric
   * counts the number of log entries matching the `filter` expression.
   * The `name`, `type`, and `description` fields in the `metric_descriptor`
   * are output only, and is constructed using the `name` and `description`
   * field in the LogMetric.
   * To create a logs-based metric that records a distribution of log values, a
   * DELTA metric kind with a DISTRIBUTION value type must be used along with
   * a `value_extractor` expression in the LogMetric.
   * Each label in the metric descriptor must have a matching label
   * name as the key and an extractor expression as the value in the
   * `label_extractors` map.
   * The `metric_kind` and `value_type` fields in the `metric_descriptor` cannot
   * be updated once initially configured. New labels can be added in the
   * `metric_descriptor`, but existing labels cannot be modified except for
   * their description.
   * </pre>
   *
   * <code>.google.api.MetricDescriptor metric_descriptor = 5;</code>
   */
  boolean hasMetricDescriptor();
  /**
   *
   *
   * <pre>
   * Optional. The metric descriptor associated with the logs-based metric.
   * If unspecified, it uses a default metric descriptor with a DELTA metric
   * kind, INT64 value type, with no labels and a unit of "1". Such a metric
   * counts the number of log entries matching the `filter` expression.
   * The `name`, `type`, and `description` fields in the `metric_descriptor`
   * are output only, and is constructed using the `name` and `description`
   * field in the LogMetric.
   * To create a logs-based metric that records a distribution of log values, a
   * DELTA metric kind with a DISTRIBUTION value type must be used along with
   * a `value_extractor` expression in the LogMetric.
   * Each label in the metric descriptor must have a matching label
   * name as the key and an extractor expression as the value in the
   * `label_extractors` map.
   * The `metric_kind` and `value_type` fields in the `metric_descriptor` cannot
   * be updated once initially configured. New labels can be added in the
   * `metric_descriptor`, but existing labels cannot be modified except for
   * their description.
   * </pre>
   *
   * <code>.google.api.MetricDescriptor metric_descriptor = 5;</code>
   */
  com.google.api.MetricDescriptor getMetricDescriptor();
  /**
   *
   *
   * <pre>
   * Optional. The metric descriptor associated with the logs-based metric.
   * If unspecified, it uses a default metric descriptor with a DELTA metric
   * kind, INT64 value type, with no labels and a unit of "1". Such a metric
   * counts the number of log entries matching the `filter` expression.
   * The `name`, `type`, and `description` fields in the `metric_descriptor`
   * are output only, and is constructed using the `name` and `description`
   * field in the LogMetric.
   * To create a logs-based metric that records a distribution of log values, a
   * DELTA metric kind with a DISTRIBUTION value type must be used along with
   * a `value_extractor` expression in the LogMetric.
   * Each label in the metric descriptor must have a matching label
   * name as the key and an extractor expression as the value in the
   * `label_extractors` map.
   * The `metric_kind` and `value_type` fields in the `metric_descriptor` cannot
   * be updated once initially configured. New labels can be added in the
   * `metric_descriptor`, but existing labels cannot be modified except for
   * their description.
   * </pre>
   *
   * <code>.google.api.MetricDescriptor metric_descriptor = 5;</code>
   */
  com.google.api.MetricDescriptorOrBuilder getMetricDescriptorOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A `value_extractor` is required when using a distribution
   * logs-based metric to extract the values to record from a log entry.
   * Two functions are supported for value extraction: `EXTRACT(field)` or
   * `REGEXP_EXTRACT(field, regex)`. The argument are:
   *   1. field: The name of the log entry field from which the value is to be
   *      extracted.
   *   2. regex: A regular expression using the Google RE2 syntax
   *      (https://github.com/google/re2/wiki/Syntax) with a single capture
   *      group to extract data from the specified log entry field. The value
   *      of the field is converted to a string before applying the regex.
   *      It is an error to specify a regex that does not include exactly one
   *      capture group.
   * The result of the extraction must be convertible to a double type, as the
   * distribution always records double values. If either the extraction or
   * the conversion to double fails, then those values are not recorded in the
   * distribution.
   * Example: `REGEXP_EXTRACT(jsonPayload.request, ".*quantity=(&#92;d+).*")`
   * </pre>
   *
   * <code>string value_extractor = 6;</code>
   */
  java.lang.String getValueExtractor();
  /**
   *
   *
   * <pre>
   * Optional. A `value_extractor` is required when using a distribution
   * logs-based metric to extract the values to record from a log entry.
   * Two functions are supported for value extraction: `EXTRACT(field)` or
   * `REGEXP_EXTRACT(field, regex)`. The argument are:
   *   1. field: The name of the log entry field from which the value is to be
   *      extracted.
   *   2. regex: A regular expression using the Google RE2 syntax
   *      (https://github.com/google/re2/wiki/Syntax) with a single capture
   *      group to extract data from the specified log entry field. The value
   *      of the field is converted to a string before applying the regex.
   *      It is an error to specify a regex that does not include exactly one
   *      capture group.
   * The result of the extraction must be convertible to a double type, as the
   * distribution always records double values. If either the extraction or
   * the conversion to double fails, then those values are not recorded in the
   * distribution.
   * Example: `REGEXP_EXTRACT(jsonPayload.request, ".*quantity=(&#92;d+).*")`
   * </pre>
   *
   * <code>string value_extractor = 6;</code>
   */
  com.google.protobuf.ByteString getValueExtractorBytes();

  /**
   *
   *
   * <pre>
   * Optional. A map from a label key string to an extractor expression which is
   * used to extract data from a log entry field and assign as the label value.
   * Each label key specified in the LabelDescriptor must have an associated
   * extractor expression in this map. The syntax of the extractor expression
   * is the same as for the `value_extractor` field.
   * The extracted value is converted to the type defined in the label
   * descriptor. If the either the extraction or the type conversion fails,
   * the label will have a default value. The default value for a string
   * label is an empty string, for an integer label its 0, and for a boolean
   * label its `false`.
   * Note that there are upper bounds on the maximum number of labels and the
   * number of active time series that are allowed in a project.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label_extractors = 7;</code>
   */
  int getLabelExtractorsCount();
  /**
   *
   *
   * <pre>
   * Optional. A map from a label key string to an extractor expression which is
   * used to extract data from a log entry field and assign as the label value.
   * Each label key specified in the LabelDescriptor must have an associated
   * extractor expression in this map. The syntax of the extractor expression
   * is the same as for the `value_extractor` field.
   * The extracted value is converted to the type defined in the label
   * descriptor. If the either the extraction or the type conversion fails,
   * the label will have a default value. The default value for a string
   * label is an empty string, for an integer label its 0, and for a boolean
   * label its `false`.
   * Note that there are upper bounds on the maximum number of labels and the
   * number of active time series that are allowed in a project.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label_extractors = 7;</code>
   */
  boolean containsLabelExtractors(java.lang.String key);
  /** Use {@link #getLabelExtractorsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabelExtractors();
  /**
   *
   *
   * <pre>
   * Optional. A map from a label key string to an extractor expression which is
   * used to extract data from a log entry field and assign as the label value.
   * Each label key specified in the LabelDescriptor must have an associated
   * extractor expression in this map. The syntax of the extractor expression
   * is the same as for the `value_extractor` field.
   * The extracted value is converted to the type defined in the label
   * descriptor. If the either the extraction or the type conversion fails,
   * the label will have a default value. The default value for a string
   * label is an empty string, for an integer label its 0, and for a boolean
   * label its `false`.
   * Note that there are upper bounds on the maximum number of labels and the
   * number of active time series that are allowed in a project.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label_extractors = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelExtractorsMap();
  /**
   *
   *
   * <pre>
   * Optional. A map from a label key string to an extractor expression which is
   * used to extract data from a log entry field and assign as the label value.
   * Each label key specified in the LabelDescriptor must have an associated
   * extractor expression in this map. The syntax of the extractor expression
   * is the same as for the `value_extractor` field.
   * The extracted value is converted to the type defined in the label
   * descriptor. If the either the extraction or the type conversion fails,
   * the label will have a default value. The default value for a string
   * label is an empty string, for an integer label its 0, and for a boolean
   * label its `false`.
   * Note that there are upper bounds on the maximum number of labels and the
   * number of active time series that are allowed in a project.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label_extractors = 7;</code>
   */
  java.lang.String getLabelExtractorsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. A map from a label key string to an extractor expression which is
   * used to extract data from a log entry field and assign as the label value.
   * Each label key specified in the LabelDescriptor must have an associated
   * extractor expression in this map. The syntax of the extractor expression
   * is the same as for the `value_extractor` field.
   * The extracted value is converted to the type defined in the label
   * descriptor. If the either the extraction or the type conversion fails,
   * the label will have a default value. The default value for a string
   * label is an empty string, for an integer label its 0, and for a boolean
   * label its `false`.
   * Note that there are upper bounds on the maximum number of labels and the
   * number of active time series that are allowed in a project.
   * </pre>
   *
   * <code>map&lt;string, string&gt; label_extractors = 7;</code>
   */
  java.lang.String getLabelExtractorsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The `bucket_options` are required when the logs-based metric is
   * using a DISTRIBUTION value type and it describes the bucket boundaries
   * used to create a histogram of the extracted values.
   * </pre>
   *
   * <code>.google.api.Distribution.BucketOptions bucket_options = 8;</code>
   */
  boolean hasBucketOptions();
  /**
   *
   *
   * <pre>
   * Optional. The `bucket_options` are required when the logs-based metric is
   * using a DISTRIBUTION value type and it describes the bucket boundaries
   * used to create a histogram of the extracted values.
   * </pre>
   *
   * <code>.google.api.Distribution.BucketOptions bucket_options = 8;</code>
   */
  com.google.api.Distribution.BucketOptions getBucketOptions();
  /**
   *
   *
   * <pre>
   * Optional. The `bucket_options` are required when the logs-based metric is
   * using a DISTRIBUTION value type and it describes the bucket boundaries
   * used to create a histogram of the extracted values.
   * </pre>
   *
   * <code>.google.api.Distribution.BucketOptions bucket_options = 8;</code>
   */
  com.google.api.Distribution.BucketOptionsOrBuilder getBucketOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the metric.
   * This field may not be present for older metrics.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the metric.
   * This field may not be present for older metrics.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the metric.
   * This field may not be present for older metrics.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the metric.
   * This field may not be present for older metrics.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10;</code>
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the metric.
   * This field may not be present for older metrics.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10;</code>
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the metric.
   * This field may not be present for older metrics.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Deprecated. The API version that created or updated this metric.
   * The v2 format is used by default and cannot be changed.
   * </pre>
   *
   * <code>.google.logging.v2.LogMetric.ApiVersion version = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  int getVersionValue();
  /**
   *
   *
   * <pre>
   * Deprecated. The API version that created or updated this metric.
   * The v2 format is used by default and cannot be changed.
   * </pre>
   *
   * <code>.google.logging.v2.LogMetric.ApiVersion version = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.logging.v2.LogMetric.ApiVersion getVersion();
}
