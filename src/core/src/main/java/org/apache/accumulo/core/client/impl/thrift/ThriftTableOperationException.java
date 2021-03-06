/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.accumulo.core.client.impl.thrift;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

@SuppressWarnings("serial")
public class ThriftTableOperationException extends Exception implements TBase<ThriftTableOperationException,ThriftTableOperationException._Fields>,
    java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ThriftTableOperationException");
  
  private static final TField TABLE_ID_FIELD_DESC = new TField("tableId", TType.STRING, (short) 1);
  private static final TField TABLE_NAME_FIELD_DESC = new TField("tableName", TType.STRING, (short) 2);
  private static final TField OP_FIELD_DESC = new TField("op", TType.I32, (short) 3);
  private static final TField TYPE_FIELD_DESC = new TField("type", TType.I32, (short) 4);
  private static final TField DESCRIPTION_FIELD_DESC = new TField("description", TType.STRING, (short) 5);
  
  public String tableId;
  public String tableName;
  /**
   * 
   * @see TableOperation
   */
  public TableOperation op;
  /**
   * 
   * @see TableOperationExceptionType
   */
  public TableOperationExceptionType type;
  public String description;
  
  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    TABLE_ID((short) 1, "tableId"), TABLE_NAME((short) 2, "tableName"),
    /**
     * 
     * @see TableOperation
     */
    OP((short) 3, "op"),
    /**
     * 
     * @see TableOperationExceptionType
     */
    TYPE((short) 4, "type"), DESCRIPTION((short) 5, "description");
    
    private static final java.util.Map<String,_Fields> byName = new java.util.HashMap<String,_Fields>();
    
    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    
    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch (fieldId) {
        case 1: // TABLE_ID
          return TABLE_ID;
        case 2: // TABLE_NAME
          return TABLE_NAME;
        case 3: // OP
          return OP;
        case 4: // TYPE
          return TYPE;
        case 5: // DESCRIPTION
          return DESCRIPTION;
        default:
          return null;
      }
    }
    
    /**
     * Find the _Fields constant that matches fieldId, throwing an exception if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null)
        throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
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
  
  public static final java.util.Map<_Fields,FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields,FieldMetaData> tmpMap = new java.util.EnumMap<_Fields,FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_ID, new FieldMetaData("tableId", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME, new FieldMetaData("tableName", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.OP, new FieldMetaData("op", TFieldRequirementType.DEFAULT, new EnumMetaData(TType.ENUM, TableOperation.class)));
    tmpMap.put(_Fields.TYPE, new FieldMetaData("type", TFieldRequirementType.DEFAULT, new EnumMetaData(TType.ENUM, TableOperationExceptionType.class)));
    tmpMap.put(_Fields.DESCRIPTION, new FieldMetaData("description", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ThriftTableOperationException.class, metaDataMap);
  }
  
  public ThriftTableOperationException() {}
  
  public ThriftTableOperationException(String tableId, String tableName, TableOperation op, TableOperationExceptionType type, String description) {
    this();
    this.tableId = tableId;
    this.tableName = tableName;
    this.op = op;
    this.type = type;
    this.description = description;
  }
  
  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftTableOperationException(ThriftTableOperationException other) {
    if (other.isSetTableId()) {
      this.tableId = other.tableId;
    }
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetOp()) {
      this.op = other.op;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
  }
  
  public ThriftTableOperationException deepCopy() {
    return new ThriftTableOperationException(this);
  }
  
  @Deprecated
  public ThriftTableOperationException clone() {
    return new ThriftTableOperationException(this);
  }
  
  public String getTableId() {
    return this.tableId;
  }
  
  public ThriftTableOperationException setTableId(String tableId) {
    this.tableId = tableId;
    return this;
  }
  
  public void unsetTableId() {
    this.tableId = null;
  }
  
  /** Returns true if field tableId is set (has been asigned a value) and false otherwise */
  public boolean isSetTableId() {
    return this.tableId != null;
  }
  
  public void setTableIdIsSet(boolean value) {
    if (!value) {
      this.tableId = null;
    }
  }
  
  public String getTableName() {
    return this.tableName;
  }
  
  public ThriftTableOperationException setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }
  
  public void unsetTableName() {
    this.tableName = null;
  }
  
  /** Returns true if field tableName is set (has been asigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }
  
  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }
  
  /**
   * 
   * @see TableOperation
   */
  public TableOperation getOp() {
    return this.op;
  }
  
  /**
   * 
   * @see TableOperation
   */
  public ThriftTableOperationException setOp(TableOperation op) {
    this.op = op;
    return this;
  }
  
  public void unsetOp() {
    this.op = null;
  }
  
  /** Returns true if field op is set (has been asigned a value) and false otherwise */
  public boolean isSetOp() {
    return this.op != null;
  }
  
  public void setOpIsSet(boolean value) {
    if (!value) {
      this.op = null;
    }
  }
  
  /**
   * 
   * @see TableOperationExceptionType
   */
  public TableOperationExceptionType getType() {
    return this.type;
  }
  
  /**
   * 
   * @see TableOperationExceptionType
   */
  public ThriftTableOperationException setType(TableOperationExceptionType type) {
    this.type = type;
    return this;
  }
  
  public void unsetType() {
    this.type = null;
  }
  
  /** Returns true if field type is set (has been asigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }
  
  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public ThriftTableOperationException setDescription(String description) {
    this.description = description;
    return this;
  }
  
  public void unsetDescription() {
    this.description = null;
  }
  
  /** Returns true if field description is set (has been asigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }
  
  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }
  
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
      case TABLE_ID:
        if (value == null) {
          unsetTableId();
        } else {
          setTableId((String) value);
        }
        break;
      
      case TABLE_NAME:
        if (value == null) {
          unsetTableName();
        } else {
          setTableName((String) value);
        }
        break;
      
      case OP:
        if (value == null) {
          unsetOp();
        } else {
          setOp((TableOperation) value);
        }
        break;
      
      case TYPE:
        if (value == null) {
          unsetType();
        } else {
          setType((TableOperationExceptionType) value);
        }
        break;
      
      case DESCRIPTION:
        if (value == null) {
          unsetDescription();
        } else {
          setDescription((String) value);
        }
        break;
    
    }
  }
  
  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }
  
  public Object getFieldValue(_Fields field) {
    switch (field) {
      case TABLE_ID:
        return getTableId();
        
      case TABLE_NAME:
        return getTableName();
        
      case OP:
        return getOp();
        
      case TYPE:
        return getType();
        
      case DESCRIPTION:
        return getDescription();
        
    }
    throw new IllegalStateException();
  }
  
  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }
  
  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
      case TABLE_ID:
        return isSetTableId();
      case TABLE_NAME:
        return isSetTableName();
      case OP:
        return isSetOp();
      case TYPE:
        return isSetType();
      case DESCRIPTION:
        return isSetDescription();
    }
    throw new IllegalStateException();
  }
  
  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }
  
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftTableOperationException)
      return this.equals((ThriftTableOperationException) that);
    return false;
  }
  
  public boolean equals(ThriftTableOperationException that) {
    if (that == null)
      return false;
    
    boolean this_present_tableId = true && this.isSetTableId();
    boolean that_present_tableId = true && that.isSetTableId();
    if (this_present_tableId || that_present_tableId) {
      if (!(this_present_tableId && that_present_tableId))
        return false;
      if (!this.tableId.equals(that.tableId))
        return false;
    }
    
    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }
    
    boolean this_present_op = true && this.isSetOp();
    boolean that_present_op = true && that.isSetOp();
    if (this_present_op || that_present_op) {
      if (!(this_present_op && that_present_op))
        return false;
      if (!this.op.equals(that.op))
        return false;
    }
    
    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }
    
    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }
    
    return true;
  }
  
  @Override
  public int hashCode() {
    return 0;
  }
  
  public int compareTo(ThriftTableOperationException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    
    int lastComparison = 0;
    ThriftTableOperationException typedOther = (ThriftTableOperationException) other;
    
    lastComparison = Boolean.valueOf(isSetTableId()).compareTo(typedOther.isSetTableId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableId()) {
      lastComparison = TBaseHelper.compareTo(this.tableId, typedOther.tableId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(typedOther.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = TBaseHelper.compareTo(this.tableName, typedOther.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOp()).compareTo(typedOther.isSetOp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOp()) {
      lastComparison = TBaseHelper.compareTo(this.op, typedOther.op);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(typedOther.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = TBaseHelper.compareTo(this.type, typedOther.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(typedOther.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = TBaseHelper.compareTo(this.description, typedOther.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }
  
  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true) {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // TABLE_ID
          if (field.type == TType.STRING) {
            this.tableId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TABLE_NAME
          if (field.type == TType.STRING) {
            this.tableName = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // OP
          if (field.type == TType.I32) {
            this.op = TableOperation.findByValue(iprot.readI32());
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // TYPE
          if (field.type == TType.I32) {
            this.type = TableOperationExceptionType.findByValue(iprot.readI32());
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // DESCRIPTION
          if (field.type == TType.STRING) {
            this.description = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    
    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }
  
  public void write(TProtocol oprot) throws TException {
    validate();
    
    oprot.writeStructBegin(STRUCT_DESC);
    if (this.tableId != null) {
      oprot.writeFieldBegin(TABLE_ID_FIELD_DESC);
      oprot.writeString(this.tableId);
      oprot.writeFieldEnd();
    }
    if (this.tableName != null) {
      oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
      oprot.writeString(this.tableName);
      oprot.writeFieldEnd();
    }
    if (this.op != null) {
      oprot.writeFieldBegin(OP_FIELD_DESC);
      oprot.writeI32(this.op.getValue());
      oprot.writeFieldEnd();
    }
    if (this.type != null) {
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(this.type.getValue());
      oprot.writeFieldEnd();
    }
    if (this.description != null) {
      oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
      oprot.writeString(this.description);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftTableOperationException(");
    sb.append("tableId:");
    if (this.tableId == null) {
      sb.append("null");
    } else {
      sb.append(this.tableId);
    }
    sb.append(", ");
    sb.append("tableName:");
    if (this.tableName == null) {
      sb.append("null");
    } else {
      sb.append(this.tableName);
    }
    sb.append(", ");
    sb.append("op:");
    if (this.op == null) {
      sb.append("null");
    } else {
      sb.append(this.op);
    }
    sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    sb.append(", ");
    sb.append("description:");
    if (this.description == null) {
      sb.append("null");
    } else {
      sb.append(this.description);
    }
    sb.append(")");
    return sb.toString();
  }
  
  public void validate() throws TException {
    // check for required fields
  }
  
}
