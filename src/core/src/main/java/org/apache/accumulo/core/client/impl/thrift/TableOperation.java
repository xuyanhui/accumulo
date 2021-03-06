/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.accumulo.core.client.impl.thrift;

import org.apache.thrift.TEnum;

public enum TableOperation implements TEnum {
  CREATE(0), DELETE(1), RENAME(2), SET_PROPERTY(3), REMOVE_PROPERTY(4), OFFLINE(5), ONLINE(6), FLUSH(7), PERMISSION(8);
  
  private final int value;
  
  private TableOperation(int value) {
    this.value = value;
  }
  
  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }
  
  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * 
   * @return null if the value is not found.
   */
  public static TableOperation findByValue(int value) {
    switch (value) {
      case 0:
        return CREATE;
      case 1:
        return DELETE;
      case 2:
        return RENAME;
      case 3:
        return SET_PROPERTY;
      case 4:
        return REMOVE_PROPERTY;
      case 5:
        return OFFLINE;
      case 6:
        return ONLINE;
      case 7:
        return FLUSH;
      case 8:
        return PERMISSION;
      default:
        return null;
    }
  }
}
