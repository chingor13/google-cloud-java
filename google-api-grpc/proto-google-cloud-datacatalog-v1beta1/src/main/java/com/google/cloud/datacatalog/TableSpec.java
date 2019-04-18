// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/table_spec.proto

package com.google.cloud.datacatalog;

public final class TableSpec {
  private TableSpec() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_ViewSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_ViewSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/datacatalog/v1beta1/table"
          + "_spec.proto\022 google.cloud.datacatalog.v1"
          + "beta1\"\240\001\n\021BigQueryTableSpec\022L\n\021table_sou"
          + "rce_type\030\001 \001(\01621.google.cloud.datacatalo"
          + "g.v1beta1.TableSourceType\022=\n\tview_spec\030\002"
          + " \001(\0132*.google.cloud.datacatalog.v1beta1."
          + "ViewSpec\"\036\n\010ViewSpec\022\022\n\nview_query\030\001 \001(\t"
          + "*[\n\017TableSourceType\022!\n\035TABLE_SOURCE_TYPE"
          + "_UNSPECIFIED\020\000\022\021\n\rBIGQUERY_VIEW\020\002\022\022\n\016BIG"
          + "QUERY_TABLE\020\005Bp\n\034com.google.cloud.dataca"
          + "talogP\001ZKgoogle.golang.org/genproto/goog"
          + "leapis/cloud/datacatalog/v1beta1;datacat"
          + "alog\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
    internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_descriptor,
            new java.lang.String[] {
              "TableSourceType", "ViewSpec",
            });
    internal_static_google_cloud_datacatalog_v1beta1_ViewSpec_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1beta1_ViewSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_ViewSpec_descriptor,
            new java.lang.String[] {
              "ViewQuery",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}