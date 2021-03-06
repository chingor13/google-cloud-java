// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p2beta1/assets.proto

package com.google.cloud.asset.v1p2beta1;

public interface AssetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p2beta1.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full name of the asset. For example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more information.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The full name of the asset. For example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more information.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Type of the asset. Example: "compute.googleapis.com/Disk".
   * </pre>
   *
   * <code>string asset_type = 2;</code>
   */
  java.lang.String getAssetType();
  /**
   *
   *
   * <pre>
   * Type of the asset. Example: "compute.googleapis.com/Disk".
   * </pre>
   *
   * <code>string asset_type = 2;</code>
   */
  com.google.protobuf.ByteString getAssetTypeBytes();

  /**
   *
   *
   * <pre>
   * Representation of the resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.Resource resource = 3;</code>
   */
  boolean hasResource();
  /**
   *
   *
   * <pre>
   * Representation of the resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.Resource resource = 3;</code>
   */
  com.google.cloud.asset.v1p2beta1.Resource getResource();
  /**
   *
   *
   * <pre>
   * Representation of the resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.Resource resource = 3;</code>
   */
  com.google.cloud.asset.v1p2beta1.ResourceOrBuilder getResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Representation of the actual Cloud IAM policy set on a cloud resource. For
   * each resource, there must be at most one Cloud IAM policy set on it.
   * </pre>
   *
   * <code>.google.iam.v1.Policy iam_policy = 4;</code>
   */
  boolean hasIamPolicy();
  /**
   *
   *
   * <pre>
   * Representation of the actual Cloud IAM policy set on a cloud resource. For
   * each resource, there must be at most one Cloud IAM policy set on it.
   * </pre>
   *
   * <code>.google.iam.v1.Policy iam_policy = 4;</code>
   */
  com.google.iam.v1.Policy getIamPolicy();
  /**
   *
   *
   * <pre>
   * Representation of the actual Cloud IAM policy set on a cloud resource. For
   * each resource, there must be at most one Cloud IAM policy set on it.
   * </pre>
   *
   * <code>.google.iam.v1.Policy iam_policy = 4;</code>
   */
  com.google.iam.v1.PolicyOrBuilder getIamPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud IAM policy name of the Cloud IAM policy set on a cloud resource. For
   * each resource, there must be at most one Cloud IAM policy name associated
   * with it.
   * </pre>
   *
   * <code>bytes iam_policy_name = 5;</code>
   */
  com.google.protobuf.ByteString getIamPolicyName();

  /**
   *
   *
   * <pre>
   * Asset's ancestry path in Cloud Resource Manager (CRM) hierarchy,
   * represented as a list of relative resource names. Ancestry path starts with
   * the closest CRM ancestor and ending at a visible root. If the asset is a
   * CRM project/ folder/organization, this starts from the asset itself.
   * Example: ["projects/123456789", "folders/5432", "organizations/1234"]
   * </pre>
   *
   * <code>repeated string ancestors = 6;</code>
   */
  java.util.List<java.lang.String> getAncestorsList();
  /**
   *
   *
   * <pre>
   * Asset's ancestry path in Cloud Resource Manager (CRM) hierarchy,
   * represented as a list of relative resource names. Ancestry path starts with
   * the closest CRM ancestor and ending at a visible root. If the asset is a
   * CRM project/ folder/organization, this starts from the asset itself.
   * Example: ["projects/123456789", "folders/5432", "organizations/1234"]
   * </pre>
   *
   * <code>repeated string ancestors = 6;</code>
   */
  int getAncestorsCount();
  /**
   *
   *
   * <pre>
   * Asset's ancestry path in Cloud Resource Manager (CRM) hierarchy,
   * represented as a list of relative resource names. Ancestry path starts with
   * the closest CRM ancestor and ending at a visible root. If the asset is a
   * CRM project/ folder/organization, this starts from the asset itself.
   * Example: ["projects/123456789", "folders/5432", "organizations/1234"]
   * </pre>
   *
   * <code>repeated string ancestors = 6;</code>
   */
  java.lang.String getAncestors(int index);
  /**
   *
   *
   * <pre>
   * Asset's ancestry path in Cloud Resource Manager (CRM) hierarchy,
   * represented as a list of relative resource names. Ancestry path starts with
   * the closest CRM ancestor and ending at a visible root. If the asset is a
   * CRM project/ folder/organization, this starts from the asset itself.
   * Example: ["projects/123456789", "folders/5432", "organizations/1234"]
   * </pre>
   *
   * <code>repeated string ancestors = 6;</code>
   */
  com.google.protobuf.ByteString getAncestorsBytes(int index);
}
