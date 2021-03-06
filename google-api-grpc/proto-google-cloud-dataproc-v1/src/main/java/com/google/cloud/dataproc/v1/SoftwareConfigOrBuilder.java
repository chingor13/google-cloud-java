// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface SoftwareConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.SoftwareConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The version of software inside the cluster. It must be one of the
   * supported [Cloud Dataproc
   * Versions](/dataproc/docs/concepts/versioning/dataproc-versions#supported_cloud_dataproc_versions),
   * such as "1.2" (including a subminor version, such as "1.2.29"), or the
   * ["preview"
   * version](/dataproc/docs/concepts/versioning/dataproc-versions#other_versions).
   * If unspecified, it defaults to the latest Debian version.
   * </pre>
   *
   * <code>string image_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getImageVersion();
  /**
   *
   *
   * <pre>
   * Optional. The version of software inside the cluster. It must be one of the
   * supported [Cloud Dataproc
   * Versions](/dataproc/docs/concepts/versioning/dataproc-versions#supported_cloud_dataproc_versions),
   * such as "1.2" (including a subminor version, such as "1.2.29"), or the
   * ["preview"
   * version](/dataproc/docs/concepts/versioning/dataproc-versions#other_versions).
   * If unspecified, it defaults to the latest Debian version.
   * </pre>
   *
   * <code>string image_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getImageVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `core:hadoop.tmp.dir`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPropertiesCount();
  /**
   *
   *
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `core:hadoop.tmp.dir`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsProperties(java.lang.String key);
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getProperties();
  /**
   *
   *
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `core:hadoop.tmp.dir`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getPropertiesMap();
  /**
   *
   *
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `core:hadoop.tmp.dir`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getPropertiesOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `core:hadoop.tmp.dir`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getPropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The set of components to activate on the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Component optional_components = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.Component> getOptionalComponentsList();
  /**
   *
   *
   * <pre>
   * Optional. The set of components to activate on the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Component optional_components = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getOptionalComponentsCount();
  /**
   *
   *
   * <pre>
   * Optional. The set of components to activate on the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Component optional_components = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.Component getOptionalComponents(int index);
  /**
   *
   *
   * <pre>
   * Optional. The set of components to activate on the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Component optional_components = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<java.lang.Integer> getOptionalComponentsValueList();
  /**
   *
   *
   * <pre>
   * Optional. The set of components to activate on the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Component optional_components = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getOptionalComponentsValue(int index);
}
