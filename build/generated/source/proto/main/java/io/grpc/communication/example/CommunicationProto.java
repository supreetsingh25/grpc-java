// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: communication.proto

package io.grpc.communication.example;

public final class CommunicationProto {
  private CommunicationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_communication_DigitalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_communication_DigitalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_communication_DigitalReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_communication_DigitalReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023communication.proto\022\rcommunication\"\036\n\016" +
      "DigitalRequest\022\014\n\004name\030\001 \001(\t\"\037\n\014DigitalR" +
      "eply\022\017\n\007message\030\001 \001(\t2\255\001\n\014Communicator\022K" +
      "\n\013SendMessage\022\035.communication.DigitalReq" +
      "uest\032\033.communication.DigitalReply\"\000\022P\n\020S" +
      "endMessageAgain\022\035.communication.DigitalR" +
      "equest\032\033.communication.DigitalReply\"\000B;\n" +
      "\035io.grpc.communication.exampleB\022Communic" +
      "ationProtoP\001\242\002\003COMb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_communication_DigitalRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_communication_DigitalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_communication_DigitalRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_communication_DigitalReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_communication_DigitalReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_communication_DigitalReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}