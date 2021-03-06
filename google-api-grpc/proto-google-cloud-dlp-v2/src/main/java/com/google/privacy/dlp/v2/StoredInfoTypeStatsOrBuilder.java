// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface StoredInfoTypeStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.StoredInfoTypeStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * StoredInfoType where findings are defined by a dictionary of phrases.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
   */
  boolean hasLargeCustomDictionary();
  /**
   *
   *
   * <pre>
   * StoredInfoType where findings are defined by a dictionary of phrases.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
   */
  com.google.privacy.dlp.v2.LargeCustomDictionaryStats getLargeCustomDictionary();
  /**
   *
   *
   * <pre>
   * StoredInfoType where findings are defined by a dictionary of phrases.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.LargeCustomDictionaryStats large_custom_dictionary = 1;</code>
   */
  com.google.privacy.dlp.v2.LargeCustomDictionaryStatsOrBuilder getLargeCustomDictionaryOrBuilder();

  public com.google.privacy.dlp.v2.StoredInfoTypeStats.TypeCase getTypeCase();
}
