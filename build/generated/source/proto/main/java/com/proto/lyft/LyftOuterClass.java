// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lyft/lyft.proto

package com.proto.lyft;

public final class LyftOuterClass {
  private LyftOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lyft_Lyft_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lyft_Lyft_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lyft_CreateLyftRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lyft_CreateLyftRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lyft_CreateLyftResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lyft_CreateLyftResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lyft_ReadLyftRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lyft_ReadLyftRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lyft_ReadLyftResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lyft_ReadLyftResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lyft_ListLyftRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lyft_ListLyftRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lyft_ListLyftResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lyft_ListLyftResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017lyft/lyft.proto\022\004lyft\"B\n\004Lyft\022\n\n\002id\030\001 " +
      "\001(\t\022\021\n\tdriver_id\030\002 \001(\t\022\016\n\006rating\030\003 \001(\t\022\013" +
      "\n\003car\030\004 \001(\t\"-\n\021CreateLyftRequest\022\030\n\004lyft" +
      "\030\001 \001(\0132\n.lyft.Lyft\".\n\022CreateLyftResponse" +
      "\022\030\n\004lyft\030\001 \001(\0132\n.lyft.Lyft\"\"\n\017ReadLyftRe" +
      "quest\022\017\n\007lyft_id\030\001 \001(\t\",\n\020ReadLyftRespon" +
      "se\022\030\n\004lyft\030\001 \001(\0132\n.lyft.Lyft\"\021\n\017ListLyft" +
      "Request\",\n\020ListLyftResponse\022\030\n\004lyft\030\001 \001(" +
      "\0132\n.lyft.Lyft2\312\001\n\013LyftService\022A\n\nCreateL" +
      "yft\022\027.lyft.CreateLyftRequest\032\030.lyft.Crea" +
      "teLyftResponse\"\000\022;\n\010ReadLyft\022\025.lyft.Read" +
      "LyftRequest\032\026.lyft.ReadLyftResponse\"\000\022;\n" +
      "\010ListLyft\022\025.lyft.ListLyftRequest\032\026.lyft." +
      "ListLyftResponse\"\000B\022\n\016com.proto.lyftP\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_lyft_Lyft_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lyft_Lyft_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lyft_Lyft_descriptor,
        new java.lang.String[] { "Id", "DriverId", "Rating", "Car", });
    internal_static_lyft_CreateLyftRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_lyft_CreateLyftRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lyft_CreateLyftRequest_descriptor,
        new java.lang.String[] { "Lyft", });
    internal_static_lyft_CreateLyftResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_lyft_CreateLyftResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lyft_CreateLyftResponse_descriptor,
        new java.lang.String[] { "Lyft", });
    internal_static_lyft_ReadLyftRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_lyft_ReadLyftRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lyft_ReadLyftRequest_descriptor,
        new java.lang.String[] { "LyftId", });
    internal_static_lyft_ReadLyftResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_lyft_ReadLyftResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lyft_ReadLyftResponse_descriptor,
        new java.lang.String[] { "Lyft", });
    internal_static_lyft_ListLyftRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_lyft_ListLyftRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lyft_ListLyftRequest_descriptor,
        new java.lang.String[] { });
    internal_static_lyft_ListLyftResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_lyft_ListLyftResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lyft_ListLyftResponse_descriptor,
        new java.lang.String[] { "Lyft", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
