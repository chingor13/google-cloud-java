// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/search.proto

package com.google.cloud.datacatalog;

public final class Search {
  private Search() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/datacatalog/v1beta1/searc"
          + "h.proto\022 google.cloud.datacatalog.v1beta"
          + "1\032\037google/protobuf/timestamp.proto\"\275\001\n\023S"
          + "earchCatalogResult\022N\n\022search_result_type"
          + "\030\001 \001(\01622.google.cloud.datacatalog.v1beta"
          + "1.SearchResultType\022\035\n\025search_result_subt"
          + "ype\030\002 \001(\t\022\036\n\026relative_resource_name\030\003 \001("
          + "\t\022\027\n\017linked_resource\030\004 \001(\t*d\n\020SearchResu"
          + "ltType\022\"\n\036SEARCH_RESULT_TYPE_UNSPECIFIED"
          + "\020\000\022\t\n\005ENTRY\020\001\022\020\n\014TAG_TEMPLATE\020\002\022\017\n\013ENTRY"
          + "_GROUP\020\003Bp\n\034com.google.cloud.datacatalog"
          + "P\001ZKgoogle.golang.org/genproto/googleapi"
          + "s/cloud/datacatalog/v1beta1;datacatalog\370"
          + "\001\001b\006proto3"
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
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_SearchCatalogResult_descriptor,
            new java.lang.String[] {
              "SearchResultType", "SearchResultSubtype", "RelativeResourceName", "LinkedResource",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
