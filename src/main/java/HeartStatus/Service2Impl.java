// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package HeartStatus;

public final class Service2Impl {
  private Service2Impl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wearGRPC_StatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wearGRPC_StatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wearGRPC_StatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wearGRPC_StatusResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016service2.proto\022\010wearGRPC\"\036\n\rStatusRequ" +
      "est\022\r\n\005Beats\030\001 \001(\001\"!\n\016StatusResponse\022\017\n\007" +
      "classif\030\001 \001(\t2S\n\013HeartStatus\022D\n\013HeartSta" +
      "tus\022\027.wearGRPC.StatusRequest\032\030.wearGRPC." +
      "StatusResponse(\0010\001B\035\n\013HeartStatusB\014Servi" +
      "ce2ImplP\001b\006proto3"
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
    internal_static_wearGRPC_StatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wearGRPC_StatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wearGRPC_StatusRequest_descriptor,
        new java.lang.String[] { "Beats", });
    internal_static_wearGRPC_StatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_wearGRPC_StatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wearGRPC_StatusResponse_descriptor,
        new java.lang.String[] { "Classif", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}