/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.accumulo.cloudtrace.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all") public class TInfo implements org.apache.thrift.TBase<TInfo, TInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TInfo");

  private static final org.apache.thrift.protocol.TField TRACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("traceId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PARENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("parentId", org.apache.thrift.protocol.TType.I64, (short)2);

  public long traceId;
  public long parentId;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  @SuppressWarnings("all") public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRACE_ID((short)1, "traceId"),
    PARENT_ID((short)2, "parentId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TRACE_ID
          return TRACE_ID;
        case 2: // PARENT_ID
          return PARENT_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TRACEID_ISSET_ID = 0;
  private static final int __PARENTID_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRACE_ID, new org.apache.thrift.meta_data.FieldMetaData("traceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PARENT_ID, new org.apache.thrift.meta_data.FieldMetaData("parentId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TInfo.class, metaDataMap);
  }

  public TInfo() {
  }

  public TInfo(
    long traceId,
    long parentId)
  {
    this();
    this.traceId = traceId;
    setTraceIdIsSet(true);
    this.parentId = parentId;
    setParentIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TInfo(TInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.traceId = other.traceId;
    this.parentId = other.parentId;
  }

  public TInfo deepCopy() {
    return new TInfo(this);
  }

  @Override
  public void clear() {
    setTraceIdIsSet(false);
    this.traceId = 0;
    setParentIdIsSet(false);
    this.parentId = 0;
  }

  public long getTraceId() {
    return this.traceId;
  }

  public TInfo setTraceId(long traceId) {
    this.traceId = traceId;
    setTraceIdIsSet(true);
    return this;
  }

  public void unsetTraceId() {
    __isset_bit_vector.clear(__TRACEID_ISSET_ID);
  }

  /** Returns true if field traceId is set (has been assigned a value) and false otherwise */
  public boolean isSetTraceId() {
    return __isset_bit_vector.get(__TRACEID_ISSET_ID);
  }

  public void setTraceIdIsSet(boolean value) {
    __isset_bit_vector.set(__TRACEID_ISSET_ID, value);
  }

  public long getParentId() {
    return this.parentId;
  }

  public TInfo setParentId(long parentId) {
    this.parentId = parentId;
    setParentIdIsSet(true);
    return this;
  }

  public void unsetParentId() {
    __isset_bit_vector.clear(__PARENTID_ISSET_ID);
  }

  /** Returns true if field parentId is set (has been assigned a value) and false otherwise */
  public boolean isSetParentId() {
    return __isset_bit_vector.get(__PARENTID_ISSET_ID);
  }

  public void setParentIdIsSet(boolean value) {
    __isset_bit_vector.set(__PARENTID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRACE_ID:
      if (value == null) {
        unsetTraceId();
      } else {
        setTraceId((Long)value);
      }
      break;

    case PARENT_ID:
      if (value == null) {
        unsetParentId();
      } else {
        setParentId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRACE_ID:
      return new Long(getTraceId());

    case PARENT_ID:
      return new Long(getParentId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRACE_ID:
      return isSetTraceId();
    case PARENT_ID:
      return isSetParentId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TInfo)
      return this.equals((TInfo)that);
    return false;
  }

  public boolean equals(TInfo that) {
    if (that == null)
      return false;

    boolean this_present_traceId = true;
    boolean that_present_traceId = true;
    if (this_present_traceId || that_present_traceId) {
      if (!(this_present_traceId && that_present_traceId))
        return false;
      if (this.traceId != that.traceId)
        return false;
    }

    boolean this_present_parentId = true;
    boolean that_present_parentId = true;
    if (this_present_parentId || that_present_parentId) {
      if (!(this_present_parentId && that_present_parentId))
        return false;
      if (this.parentId != that.parentId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TInfo typedOther = (TInfo)other;

    lastComparison = Boolean.valueOf(isSetTraceId()).compareTo(typedOther.isSetTraceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTraceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.traceId, typedOther.traceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParentId()).compareTo(typedOther.isSetParentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parentId, typedOther.parentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // TRACE_ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.traceId = iprot.readI64();
            setTraceIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PARENT_ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.parentId = iprot.readI64();
            setParentIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(TRACE_ID_FIELD_DESC);
    oprot.writeI64(this.traceId);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PARENT_ID_FIELD_DESC);
    oprot.writeI64(this.parentId);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TInfo(");
    boolean first = true;

    sb.append("traceId:");
    sb.append(this.traceId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("parentId:");
    sb.append(this.parentId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

