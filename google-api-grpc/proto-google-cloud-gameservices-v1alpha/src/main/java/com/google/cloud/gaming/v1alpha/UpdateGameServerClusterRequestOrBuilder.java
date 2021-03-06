// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1alpha/game_server_clusters.proto

package com.google.cloud.gaming.v1alpha;

public interface UpdateGameServerClusterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The game server cluster to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.GameServerCluster game_server_cluster = 1;</code>
   */
  boolean hasGameServerCluster();
  /**
   *
   *
   * <pre>
   * Required. The game server cluster to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.GameServerCluster game_server_cluster = 1;</code>
   */
  com.google.cloud.gaming.v1alpha.GameServerCluster getGameServerCluster();
  /**
   *
   *
   * <pre>
   * Required. The game server cluster to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.GameServerCluster game_server_cluster = 1;</code>
   */
  com.google.cloud.gaming.v1alpha.GameServerClusterOrBuilder getGameServerClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. For the `FieldMask` definition, see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. For the `FieldMask` definition, see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. For the `FieldMask` definition, see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
