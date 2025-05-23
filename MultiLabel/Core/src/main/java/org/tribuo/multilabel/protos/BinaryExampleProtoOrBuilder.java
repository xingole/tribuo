// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-multilabel-core.proto

// Protobuf Java Version: 3.25.6
package org.tribuo.multilabel.protos;

public interface BinaryExampleProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.multilabel.BinaryExampleProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tribuo.core.ExampleProto inner_example = 1;</code>
   * @return Whether the innerExample field is set.
   */
  boolean hasInnerExample();
  /**
   * <code>.tribuo.core.ExampleProto inner_example = 1;</code>
   * @return The innerExample.
   */
  org.tribuo.protos.core.ExampleProto getInnerExample();
  /**
   * <code>.tribuo.core.ExampleProto inner_example = 1;</code>
   */
  org.tribuo.protos.core.ExampleProtoOrBuilder getInnerExampleOrBuilder();

  /**
   * <code>.tribuo.core.OutputProto label = 2;</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <code>.tribuo.core.OutputProto label = 2;</code>
   * @return The label.
   */
  org.tribuo.protos.core.OutputProto getLabel();
  /**
   * <code>.tribuo.core.OutputProto label = 2;</code>
   */
  org.tribuo.protos.core.OutputProtoOrBuilder getLabelOrBuilder();

  /**
   * <code>float weight = 3;</code>
   * @return The weight.
   */
  float getWeight();

  /**
   * <code>repeated string feature_name = 4;</code>
   * @return A list containing the featureName.
   */
  java.util.List<java.lang.String>
      getFeatureNameList();
  /**
   * <code>repeated string feature_name = 4;</code>
   * @return The count of featureName.
   */
  int getFeatureNameCount();
  /**
   * <code>repeated string feature_name = 4;</code>
   * @param index The index of the element to return.
   * @return The featureName at the given index.
   */
  java.lang.String getFeatureName(int index);
  /**
   * <code>repeated string feature_name = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the featureName at the given index.
   */
  com.google.protobuf.ByteString
      getFeatureNameBytes(int index);

  /**
   * <code>repeated double feature_value = 5;</code>
   * @return A list containing the featureValue.
   */
  java.util.List<java.lang.Double> getFeatureValueList();
  /**
   * <code>repeated double feature_value = 5;</code>
   * @return The count of featureValue.
   */
  int getFeatureValueCount();
  /**
   * <code>repeated double feature_value = 5;</code>
   * @param index The index of the element to return.
   * @return The featureValue at the given index.
   */
  double getFeatureValue(int index);
}
