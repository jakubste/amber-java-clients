// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dummy.proto

package pl.edu.agh.amber.dummy.proto;

public final class DummyProto {
  private DummyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registry.add(pl.edu.agh.amber.dummy.proto.DummyProto.enable);
    registry.add(pl.edu.agh.amber.dummy.proto.DummyProto.message);
    registry.add(pl.edu.agh.amber.dummy.proto.DummyProto.getStatus);
  }
  public static final int ENABLE_FIELD_NUMBER = 50;
  /**
   * <code>extend .amber.DriverMsg { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      pl.edu.agh.amber.common.proto.CommonProto.DriverMsg,
      java.lang.Boolean> enable = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int MESSAGE_FIELD_NUMBER = 51;
  /**
   * <code>extend .amber.DriverMsg { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      pl.edu.agh.amber.common.proto.CommonProto.DriverMsg,
      java.lang.String> message = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int GET_STATUS_FIELD_NUMBER = 52;
  /**
   * <code>extend .amber.DriverMsg { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      pl.edu.agh.amber.common.proto.CommonProto.DriverMsg,
      java.lang.Boolean> getStatus = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013dummy.proto\022\021amber.dummy_proto\032\017driver" +
      "msg.proto: \n\006enable\022\020.amber.DriverMsg\0302 " +
      "\001(\010:!\n\007message\022\020.amber.DriverMsg\0303 \001(\t:$" +
      "\n\nget_status\022\020.amber.DriverMsg\0304 \001(\010B*\n\034" +
      "pl.edu.agh.amber.dummy.protoB\nDummyProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          enable.internalInit(descriptor.getExtensions().get(0));
          message.internalInit(descriptor.getExtensions().get(1));
          getStatus.internalInit(descriptor.getExtensions().get(2));
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          pl.edu.agh.amber.common.proto.CommonProto.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
