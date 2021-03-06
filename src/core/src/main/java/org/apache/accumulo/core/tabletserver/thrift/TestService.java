/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.accumulo.core.tabletserver.thrift;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class TestService {
  
  public interface Iface {
    
    public void setTimeOffset(org.apache.accumulo.core.security.thrift.AuthInfo credentials, long millis)
        throws org.apache.accumulo.core.security.thrift.ThriftSecurityException, TException;
    
  }
  
  public static class Client implements TServiceClient, Iface {
    public static class Factory implements TServiceClientFactory<Client> {
      public Factory() {}
      
      public Client getClient(TProtocol prot) {
        return new Client(prot);
      }
      
      public Client getClient(TProtocol iprot, TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }
    
    public Client(TProtocol prot) {
      this(prot, prot);
    }
    
    public Client(TProtocol iprot, TProtocol oprot) {
      iprot_ = iprot;
      oprot_ = oprot;
    }
    
    protected TProtocol iprot_;
    protected TProtocol oprot_;
    
    protected int seqid_;
    
    public TProtocol getInputProtocol() {
      return this.iprot_;
    }
    
    public TProtocol getOutputProtocol() {
      return this.oprot_;
    }
    
    public void setTimeOffset(org.apache.accumulo.core.security.thrift.AuthInfo credentials, long millis)
        throws org.apache.accumulo.core.security.thrift.ThriftSecurityException, TException {
      send_setTimeOffset(credentials, millis);
      recv_setTimeOffset();
    }
    
    public void send_setTimeOffset(org.apache.accumulo.core.security.thrift.AuthInfo credentials, long millis) throws TException {
      oprot_.writeMessageBegin(new TMessage("setTimeOffset", TMessageType.CALL, ++seqid_));
      setTimeOffset_args args = new setTimeOffset_args();
      args.setCredentials(credentials);
      args.setMillis(millis);
      args.write(oprot_);
      oprot_.writeMessageEnd();
      oprot_.getTransport().flush();
    }
    
    public void recv_setTimeOffset() throws org.apache.accumulo.core.security.thrift.ThriftSecurityException, TException {
      TMessage msg = iprot_.readMessageBegin();
      if (msg.type == TMessageType.EXCEPTION) {
        TApplicationException x = TApplicationException.read(iprot_);
        iprot_.readMessageEnd();
        throw x;
      }
      if (msg.seqid != seqid_) {
        throw new TApplicationException(TApplicationException.BAD_SEQUENCE_ID, "setTimeOffset failed: out of sequence response");
      }
      setTimeOffset_result result = new setTimeOffset_result();
      result.read(iprot_);
      iprot_.readMessageEnd();
      if (result.sec != null) {
        throw result.sec;
      }
      return;
    }
    
  }
  
  public static class Processor implements TProcessor {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(Processor.class.getName());
    
    public Processor(Iface iface) {
      iface_ = iface;
      processMap_.put("setTimeOffset", new setTimeOffset());
    }
    
    protected static interface ProcessFunction {
      public void process(int seqid, TProtocol iprot, TProtocol oprot) throws TException;
    }
    
    private Iface iface_;
    protected final java.util.HashMap<String,ProcessFunction> processMap_ = new java.util.HashMap<String,ProcessFunction>();
    
    public boolean process(TProtocol iprot, TProtocol oprot) throws TException {
      TMessage msg = iprot.readMessageBegin();
      ProcessFunction fn = processMap_.get(msg.name);
      if (fn == null) {
        TProtocolUtil.skip(iprot, TType.STRUCT);
        iprot.readMessageEnd();
        TApplicationException x = new TApplicationException(TApplicationException.UNKNOWN_METHOD, "Invalid method name: '" + msg.name + "'");
        oprot.writeMessageBegin(new TMessage(msg.name, TMessageType.EXCEPTION, msg.seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return true;
      }
      fn.process(msg.seqid, iprot, oprot);
      return true;
    }
    
    private class setTimeOffset implements ProcessFunction {
      public void process(int seqid, TProtocol iprot, TProtocol oprot) throws TException {
        setTimeOffset_args args = new setTimeOffset_args();
        try {
          args.read(iprot);
        } catch (TProtocolException e) {
          iprot.readMessageEnd();
          TApplicationException x = new TApplicationException(TApplicationException.PROTOCOL_ERROR, e.getMessage());
          oprot.writeMessageBegin(new TMessage("setTimeOffset", TMessageType.EXCEPTION, seqid));
          x.write(oprot);
          oprot.writeMessageEnd();
          oprot.getTransport().flush();
          return;
        }
        iprot.readMessageEnd();
        setTimeOffset_result result = new setTimeOffset_result();
        try {
          iface_.setTimeOffset(args.credentials, args.millis);
        } catch (org.apache.accumulo.core.security.thrift.ThriftSecurityException sec) {
          result.sec = sec;
        } catch (Throwable th) {
          LOGGER.error("Internal error processing setTimeOffset", th);
          TApplicationException x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing setTimeOffset");
          oprot.writeMessageBegin(new TMessage("setTimeOffset", TMessageType.EXCEPTION, seqid));
          x.write(oprot);
          oprot.writeMessageEnd();
          oprot.getTransport().flush();
          return;
        }
        oprot.writeMessageBegin(new TMessage("setTimeOffset", TMessageType.REPLY, seqid));
        result.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
      }
      
    }
    
  }
  
  @SuppressWarnings("serial")
  public static class setTimeOffset_args implements TBase<setTimeOffset_args,setTimeOffset_args._Fields>, java.io.Serializable, Cloneable {
    private static final TStruct STRUCT_DESC = new TStruct("setTimeOffset_args");
    
    private static final TField CREDENTIALS_FIELD_DESC = new TField("credentials", TType.STRUCT, (short) 1);
    private static final TField MILLIS_FIELD_DESC = new TField("millis", TType.I64, (short) 2);
    
    public org.apache.accumulo.core.security.thrift.AuthInfo credentials;
    public long millis;
    
    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements TFieldIdEnum {
      CREDENTIALS((short) 1, "credentials"), MILLIS((short) 2, "millis");
      
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
          case 1: // CREDENTIALS
            return CREDENTIALS;
          case 2: // MILLIS
            return MILLIS;
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
    private static final int __MILLIS_ISSET_ID = 0;
    private java.util.BitSet __isset_bit_vector = new java.util.BitSet(1);
    
    public static final java.util.Map<_Fields,FieldMetaData> metaDataMap;
    static {
      java.util.Map<_Fields,FieldMetaData> tmpMap = new java.util.EnumMap<_Fields,FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.CREDENTIALS, new FieldMetaData("credentials", TFieldRequirementType.DEFAULT, new StructMetaData(TType.STRUCT,
          org.apache.accumulo.core.security.thrift.AuthInfo.class)));
      tmpMap.put(_Fields.MILLIS, new FieldMetaData("millis", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.I64)));
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      FieldMetaData.addStructMetaDataMap(setTimeOffset_args.class, metaDataMap);
    }
    
    public setTimeOffset_args() {}
    
    public setTimeOffset_args(org.apache.accumulo.core.security.thrift.AuthInfo credentials, long millis) {
      this();
      this.credentials = credentials;
      this.millis = millis;
      setMillisIsSet(true);
    }
    
    /**
     * Performs a deep copy on <i>other</i>.
     */
    public setTimeOffset_args(setTimeOffset_args other) {
      __isset_bit_vector.clear();
      __isset_bit_vector.or(other.__isset_bit_vector);
      if (other.isSetCredentials()) {
        this.credentials = new org.apache.accumulo.core.security.thrift.AuthInfo(other.credentials);
      }
      this.millis = other.millis;
    }
    
    public setTimeOffset_args deepCopy() {
      return new setTimeOffset_args(this);
    }
    
    @Deprecated
    public setTimeOffset_args clone() {
      return new setTimeOffset_args(this);
    }
    
    public org.apache.accumulo.core.security.thrift.AuthInfo getCredentials() {
      return this.credentials;
    }
    
    public setTimeOffset_args setCredentials(org.apache.accumulo.core.security.thrift.AuthInfo credentials) {
      this.credentials = credentials;
      return this;
    }
    
    public void unsetCredentials() {
      this.credentials = null;
    }
    
    /** Returns true if field credentials is set (has been asigned a value) and false otherwise */
    public boolean isSetCredentials() {
      return this.credentials != null;
    }
    
    public void setCredentialsIsSet(boolean value) {
      if (!value) {
        this.credentials = null;
      }
    }
    
    public long getMillis() {
      return this.millis;
    }
    
    public setTimeOffset_args setMillis(long millis) {
      this.millis = millis;
      setMillisIsSet(true);
      return this;
    }
    
    public void unsetMillis() {
      __isset_bit_vector.clear(__MILLIS_ISSET_ID);
    }
    
    /** Returns true if field millis is set (has been asigned a value) and false otherwise */
    public boolean isSetMillis() {
      return __isset_bit_vector.get(__MILLIS_ISSET_ID);
    }
    
    public void setMillisIsSet(boolean value) {
      __isset_bit_vector.set(__MILLIS_ISSET_ID, value);
    }
    
    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
        case CREDENTIALS:
          if (value == null) {
            unsetCredentials();
          } else {
            setCredentials((org.apache.accumulo.core.security.thrift.AuthInfo) value);
          }
          break;
        
        case MILLIS:
          if (value == null) {
            unsetMillis();
          } else {
            setMillis((Long) value);
          }
          break;
      
      }
    }
    
    public void setFieldValue(int fieldID, Object value) {
      setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
    }
    
    public Object getFieldValue(_Fields field) {
      switch (field) {
        case CREDENTIALS:
          return getCredentials();
          
        case MILLIS:
          return new Long(getMillis());
          
      }
      throw new IllegalStateException();
    }
    
    public Object getFieldValue(int fieldId) {
      return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
    }
    
    /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      switch (field) {
        case CREDENTIALS:
          return isSetCredentials();
        case MILLIS:
          return isSetMillis();
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
      if (that instanceof setTimeOffset_args)
        return this.equals((setTimeOffset_args) that);
      return false;
    }
    
    public boolean equals(setTimeOffset_args that) {
      if (that == null)
        return false;
      
      boolean this_present_credentials = true && this.isSetCredentials();
      boolean that_present_credentials = true && that.isSetCredentials();
      if (this_present_credentials || that_present_credentials) {
        if (!(this_present_credentials && that_present_credentials))
          return false;
        if (!this.credentials.equals(that.credentials))
          return false;
      }
      
      boolean this_present_millis = true;
      boolean that_present_millis = true;
      if (this_present_millis || that_present_millis) {
        if (!(this_present_millis && that_present_millis))
          return false;
        if (this.millis != that.millis)
          return false;
      }
      
      return true;
    }
    
    @Override
    public int hashCode() {
      return 0;
    }
    
    public int compareTo(setTimeOffset_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }
      
      int lastComparison = 0;
      setTimeOffset_args typedOther = (setTimeOffset_args) other;
      
      lastComparison = Boolean.valueOf(isSetCredentials()).compareTo(typedOther.isSetCredentials());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetCredentials()) {
        lastComparison = TBaseHelper.compareTo(this.credentials, typedOther.credentials);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetMillis()).compareTo(typedOther.isSetMillis());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetMillis()) {
        lastComparison = TBaseHelper.compareTo(this.millis, typedOther.millis);
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
          case 1: // CREDENTIALS
            if (field.type == TType.STRUCT) {
              this.credentials = new org.apache.accumulo.core.security.thrift.AuthInfo();
              this.credentials.read(iprot);
            } else {
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case 2: // MILLIS
            if (field.type == TType.I64) {
              this.millis = iprot.readI64();
              setMillisIsSet(true);
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
      if (this.credentials != null) {
        oprot.writeFieldBegin(CREDENTIALS_FIELD_DESC);
        this.credentials.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MILLIS_FIELD_DESC);
      oprot.writeI64(this.millis);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("setTimeOffset_args(");
      sb.append("credentials:");
      if (this.credentials == null) {
        sb.append("null");
      } else {
        sb.append(this.credentials);
      }
      sb.append(", ");
      sb.append("millis:");
      sb.append(this.millis);
      sb.append(")");
      return sb.toString();
    }
    
    public void validate() throws TException {
      // check for required fields
    }
    
  }
  
  @SuppressWarnings("serial")
  public static class setTimeOffset_result implements TBase<setTimeOffset_result,setTimeOffset_result._Fields>, java.io.Serializable, Cloneable {
    private static final TStruct STRUCT_DESC = new TStruct("setTimeOffset_result");
    
    private static final TField SEC_FIELD_DESC = new TField("sec", TType.STRUCT, (short) 1);
    
    public org.apache.accumulo.core.security.thrift.ThriftSecurityException sec;
    
    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements TFieldIdEnum {
      SEC((short) 1, "sec");
      
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
          case 1: // SEC
            return SEC;
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
      tmpMap.put(_Fields.SEC, new FieldMetaData("sec", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRUCT)));
      metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
      FieldMetaData.addStructMetaDataMap(setTimeOffset_result.class, metaDataMap);
    }
    
    public setTimeOffset_result() {}
    
    public setTimeOffset_result(org.apache.accumulo.core.security.thrift.ThriftSecurityException sec) {
      this();
      this.sec = sec;
    }
    
    /**
     * Performs a deep copy on <i>other</i>.
     */
    public setTimeOffset_result(setTimeOffset_result other) {
      if (other.isSetSec()) {
        this.sec = new org.apache.accumulo.core.security.thrift.ThriftSecurityException(other.sec);
      }
    }
    
    public setTimeOffset_result deepCopy() {
      return new setTimeOffset_result(this);
    }
    
    @Deprecated
    public setTimeOffset_result clone() {
      return new setTimeOffset_result(this);
    }
    
    public org.apache.accumulo.core.security.thrift.ThriftSecurityException getSec() {
      return this.sec;
    }
    
    public setTimeOffset_result setSec(org.apache.accumulo.core.security.thrift.ThriftSecurityException sec) {
      this.sec = sec;
      return this;
    }
    
    public void unsetSec() {
      this.sec = null;
    }
    
    /** Returns true if field sec is set (has been asigned a value) and false otherwise */
    public boolean isSetSec() {
      return this.sec != null;
    }
    
    public void setSecIsSet(boolean value) {
      if (!value) {
        this.sec = null;
      }
    }
    
    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
        case SEC:
          if (value == null) {
            unsetSec();
          } else {
            setSec((org.apache.accumulo.core.security.thrift.ThriftSecurityException) value);
          }
          break;
      
      }
    }
    
    public void setFieldValue(int fieldID, Object value) {
      setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
    }
    
    public Object getFieldValue(_Fields field) {
      switch (field) {
        case SEC:
          return getSec();
          
      }
      throw new IllegalStateException();
    }
    
    public Object getFieldValue(int fieldId) {
      return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
    }
    
    /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      switch (field) {
        case SEC:
          return isSetSec();
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
      if (that instanceof setTimeOffset_result)
        return this.equals((setTimeOffset_result) that);
      return false;
    }
    
    public boolean equals(setTimeOffset_result that) {
      if (that == null)
        return false;
      
      boolean this_present_sec = true && this.isSetSec();
      boolean that_present_sec = true && that.isSetSec();
      if (this_present_sec || that_present_sec) {
        if (!(this_present_sec && that_present_sec))
          return false;
        if (!this.sec.equals(that.sec))
          return false;
      }
      
      return true;
    }
    
    @Override
    public int hashCode() {
      return 0;
    }
    
    public int compareTo(setTimeOffset_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }
      
      int lastComparison = 0;
      setTimeOffset_result typedOther = (setTimeOffset_result) other;
      
      lastComparison = Boolean.valueOf(isSetSec()).compareTo(typedOther.isSetSec());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSec()) {
        lastComparison = TBaseHelper.compareTo(this.sec, typedOther.sec);
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
          case 1: // SEC
            if (field.type == TType.STRUCT) {
              this.sec = new org.apache.accumulo.core.security.thrift.ThriftSecurityException();
              this.sec.read(iprot);
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
      oprot.writeStructBegin(STRUCT_DESC);
      
      if (this.isSetSec()) {
        oprot.writeFieldBegin(SEC_FIELD_DESC);
        this.sec.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("setTimeOffset_result(");
      sb.append("sec:");
      if (this.sec == null) {
        sb.append("null");
      } else {
        sb.append(this.sec);
      }
      sb.append(")");
      return sb.toString();
    }
    
    public void validate() throws TException {
      // check for required fields
    }
    
  }
  
}
