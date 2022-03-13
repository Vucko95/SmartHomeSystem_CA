// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gymRoomControlService.proto

package gymRoomControlService;

/**
 * Protobuf enum {@code LightStatus}
 */
public enum LightStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>on = 0;</code>
   */
  on(0),
  /**
   * <code>off = 1;</code>
   */
  off(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>on = 0;</code>
   */
  public static final int on_VALUE = 0;
  /**
   * <code>off = 1;</code>
   */
  public static final int off_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static LightStatus valueOf(int value) {
    return forNumber(value);
  }

  public static LightStatus forNumber(int value) {
    switch (value) {
      case 0: return on;
      case 1: return off;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LightStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LightStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LightStatus>() {
          public LightStatus findValueByNumber(int number) {
            return LightStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return gymRoomControlService.GymRoomProtoService.getDescriptor().getEnumTypes().get(0);
  }

  private static final LightStatus[] VALUES = values();

  public static LightStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LightStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:LightStatus)
}
