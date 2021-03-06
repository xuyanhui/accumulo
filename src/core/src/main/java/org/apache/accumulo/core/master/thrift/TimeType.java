/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.accumulo.core.master.thrift;

import org.apache.thrift.TEnum;

public enum TimeType implements TEnum {
  LOGICAL(0), MILLIS(1);
  
  private final int value;
  
  private TimeType(int value) {
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
  public static TimeType findByValue(int value) {
    switch (value) {
      case 0:
        return LOGICAL;
      case 1:
        return MILLIS;
      default:
        return null;
    }
  }
}
