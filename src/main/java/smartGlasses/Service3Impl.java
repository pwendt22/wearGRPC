// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service3.proto

package smartGlasses;

public final class Service3Impl {
  private Service3Impl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wearGRPC_choseVideo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wearGRPC_choseVideo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wearGRPC_playingVideo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wearGRPC_playingVideo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wearGRPC_activation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wearGRPC_activation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wearGRPC_confirmActivation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wearGRPC_confirmActivation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016service3.proto\022\010wearGRPC\"\037\n\nchoseVideo" +
      "\022\021\n\tplayVideo\030\001 \001(\t\"\037\n\014playingVideo\022\017\n\007p" +
      "laying\030\001 \001(\t\"\"\n\nactivation\022\024\n\014bluetoothY" +
      "es\030\001 \001(\t\"%\n\021confirmActivation\022\020\n\010conecte" +
      "d\030\001 \001(\t2\216\001\n\010Service3\022=\n\tplayVideo\022\024.wear" +
      "GRPC.choseVideo\032\026.wearGRPC.playingVideo\"" +
      "\0000\001\022C\n\014actBluetooth\022\024.wearGRPC.activatio" +
      "n\032\033.wearGRPC.confirmActivation\"\000B\036\n\014smar" +
      "tGlassesB\014Service3ImplP\001b\006proto3"
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
    internal_static_wearGRPC_choseVideo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wearGRPC_choseVideo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wearGRPC_choseVideo_descriptor,
        new java.lang.String[] { "PlayVideo", });
    internal_static_wearGRPC_playingVideo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_wearGRPC_playingVideo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wearGRPC_playingVideo_descriptor,
        new java.lang.String[] { "Playing", });
    internal_static_wearGRPC_activation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_wearGRPC_activation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wearGRPC_activation_descriptor,
        new java.lang.String[] { "BluetoothYes", });
    internal_static_wearGRPC_confirmActivation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_wearGRPC_confirmActivation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wearGRPC_confirmActivation_descriptor,
        new java.lang.String[] { "Conected", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
