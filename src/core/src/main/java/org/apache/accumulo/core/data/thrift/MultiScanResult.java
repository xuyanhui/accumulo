/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.accumulo.core.data.thrift;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

@SuppressWarnings("serial")
public class MultiScanResult implements TBase<MultiScanResult,MultiScanResult._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("MultiScanResult");
  
  private static final TField RESULTS_FIELD_DESC = new TField("results", TType.LIST, (short) 1);
  private static final TField FAILURES_FIELD_DESC = new TField("failures", TType.MAP, (short) 2);
  private static final TField FULL_SCANS_FIELD_DESC = new TField("fullScans", TType.LIST, (short) 3);
  private static final TField PART_SCAN_FIELD_DESC = new TField("partScan", TType.STRUCT, (short) 4);
  private static final TField PART_NEXT_KEY_FIELD_DESC = new TField("partNextKey", TType.STRUCT, (short) 5);
  private static final TField PART_NEXT_KEY_INCLUSIVE_FIELD_DESC = new TField("partNextKeyInclusive", TType.BOOL, (short) 6);
  private static final TField MORE_FIELD_DESC = new TField("more", TType.BOOL, (short) 7);
  
  public java.util.List<TKeyValue> results;
  public java.util.Map<TKeyExtent,java.util.List<TRange>> failures;
  public java.util.List<TKeyExtent> fullScans;
  public TKeyExtent partScan;
  public TKey partNextKey;
  public boolean partNextKeyInclusive;
  public boolean more;
  
  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    RESULTS((short) 1, "results"), FAILURES((short) 2, "failures"), FULL_SCANS((short) 3, "fullScans"), PART_SCAN((short) 4, "partScan"), PART_NEXT_KEY(
        (short) 5, "partNextKey"), PART_NEXT_KEY_INCLUSIVE((short) 6, "partNextKeyInclusive"), MORE((short) 7, "more");
    
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
        case 1: // RESULTS
          return RESULTS;
        case 2: // FAILURES
          return FAILURES;
        case 3: // FULL_SCANS
          return FULL_SCANS;
        case 4: // PART_SCAN
          return PART_SCAN;
        case 5: // PART_NEXT_KEY
          return PART_NEXT_KEY;
        case 6: // PART_NEXT_KEY_INCLUSIVE
          return PART_NEXT_KEY_INCLUSIVE;
        case 7: // MORE
          return MORE;
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
  private static final int __PARTNEXTKEYINCLUSIVE_ISSET_ID = 0;
  private static final int __MORE_ISSET_ID = 1;
  private java.util.BitSet __isset_bit_vector = new java.util.BitSet(2);
  
  public static final java.util.Map<_Fields,FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields,FieldMetaData> tmpMap = new java.util.EnumMap<_Fields,FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULTS, new FieldMetaData("results", TFieldRequirementType.DEFAULT, new ListMetaData(TType.LIST, new StructMetaData(TType.STRUCT,
        TKeyValue.class))));
    tmpMap.put(_Fields.FAILURES, new FieldMetaData("failures", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.MAP, "ScanBatch")));
    tmpMap.put(_Fields.FULL_SCANS, new FieldMetaData("fullScans", TFieldRequirementType.DEFAULT, new ListMetaData(TType.LIST, new StructMetaData(TType.STRUCT,
        TKeyExtent.class))));
    tmpMap.put(_Fields.PART_SCAN, new FieldMetaData("partScan", TFieldRequirementType.DEFAULT, new StructMetaData(TType.STRUCT, TKeyExtent.class)));
    tmpMap.put(_Fields.PART_NEXT_KEY, new FieldMetaData("partNextKey", TFieldRequirementType.DEFAULT, new StructMetaData(TType.STRUCT, TKey.class)));
    tmpMap.put(_Fields.PART_NEXT_KEY_INCLUSIVE, new FieldMetaData("partNextKeyInclusive", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.MORE, new FieldMetaData("more", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(MultiScanResult.class, metaDataMap);
  }
  
  public MultiScanResult() {}
  
  public MultiScanResult(java.util.List<TKeyValue> results, java.util.Map<TKeyExtent,java.util.List<TRange>> failures, java.util.List<TKeyExtent> fullScans,
      TKeyExtent partScan, TKey partNextKey, boolean partNextKeyInclusive, boolean more) {
    this();
    this.results = results;
    this.failures = failures;
    this.fullScans = fullScans;
    this.partScan = partScan;
    this.partNextKey = partNextKey;
    this.partNextKeyInclusive = partNextKeyInclusive;
    setPartNextKeyInclusiveIsSet(true);
    this.more = more;
    setMoreIsSet(true);
  }
  
  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MultiScanResult(MultiScanResult other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetResults()) {
      java.util.List<TKeyValue> __this__results = new java.util.ArrayList<TKeyValue>();
      for (TKeyValue other_element : other.results) {
        __this__results.add(new TKeyValue(other_element));
      }
      this.results = __this__results;
    }
    if (other.isSetFailures()) {
      this.failures = other.failures;
    }
    if (other.isSetFullScans()) {
      java.util.List<TKeyExtent> __this__fullScans = new java.util.ArrayList<TKeyExtent>();
      for (TKeyExtent other_element : other.fullScans) {
        __this__fullScans.add(new TKeyExtent(other_element));
      }
      this.fullScans = __this__fullScans;
    }
    if (other.isSetPartScan()) {
      this.partScan = new TKeyExtent(other.partScan);
    }
    if (other.isSetPartNextKey()) {
      this.partNextKey = new TKey(other.partNextKey);
    }
    this.partNextKeyInclusive = other.partNextKeyInclusive;
    this.more = other.more;
  }
  
  public MultiScanResult deepCopy() {
    return new MultiScanResult(this);
  }
  
  @Deprecated
  public MultiScanResult clone() {
    return new MultiScanResult(this);
  }
  
  public int getResultsSize() {
    return (this.results == null) ? 0 : this.results.size();
  }
  
  public java.util.Iterator<TKeyValue> getResultsIterator() {
    return (this.results == null) ? null : this.results.iterator();
  }
  
  public void addToResults(TKeyValue elem) {
    if (this.results == null) {
      this.results = new java.util.ArrayList<TKeyValue>();
    }
    this.results.add(elem);
  }
  
  public java.util.List<TKeyValue> getResults() {
    return this.results;
  }
  
  public MultiScanResult setResults(java.util.List<TKeyValue> results) {
    this.results = results;
    return this;
  }
  
  public void unsetResults() {
    this.results = null;
  }
  
  /** Returns true if field results is set (has been asigned a value) and false otherwise */
  public boolean isSetResults() {
    return this.results != null;
  }
  
  public void setResultsIsSet(boolean value) {
    if (!value) {
      this.results = null;
    }
  }
  
  public int getFailuresSize() {
    return (this.failures == null) ? 0 : this.failures.size();
  }
  
  public void putToFailures(TKeyExtent key, java.util.List<TRange> val) {
    if (this.failures == null) {
      this.failures = new java.util.HashMap<TKeyExtent,java.util.List<TRange>>();
    }
    this.failures.put(key, val);
  }
  
  public java.util.Map<TKeyExtent,java.util.List<TRange>> getFailures() {
    return this.failures;
  }
  
  public MultiScanResult setFailures(java.util.Map<TKeyExtent,java.util.List<TRange>> failures) {
    this.failures = failures;
    return this;
  }
  
  public void unsetFailures() {
    this.failures = null;
  }
  
  /** Returns true if field failures is set (has been asigned a value) and false otherwise */
  public boolean isSetFailures() {
    return this.failures != null;
  }
  
  public void setFailuresIsSet(boolean value) {
    if (!value) {
      this.failures = null;
    }
  }
  
  public int getFullScansSize() {
    return (this.fullScans == null) ? 0 : this.fullScans.size();
  }
  
  public java.util.Iterator<TKeyExtent> getFullScansIterator() {
    return (this.fullScans == null) ? null : this.fullScans.iterator();
  }
  
  public void addToFullScans(TKeyExtent elem) {
    if (this.fullScans == null) {
      this.fullScans = new java.util.ArrayList<TKeyExtent>();
    }
    this.fullScans.add(elem);
  }
  
  public java.util.List<TKeyExtent> getFullScans() {
    return this.fullScans;
  }
  
  public MultiScanResult setFullScans(java.util.List<TKeyExtent> fullScans) {
    this.fullScans = fullScans;
    return this;
  }
  
  public void unsetFullScans() {
    this.fullScans = null;
  }
  
  /** Returns true if field fullScans is set (has been asigned a value) and false otherwise */
  public boolean isSetFullScans() {
    return this.fullScans != null;
  }
  
  public void setFullScansIsSet(boolean value) {
    if (!value) {
      this.fullScans = null;
    }
  }
  
  public TKeyExtent getPartScan() {
    return this.partScan;
  }
  
  public MultiScanResult setPartScan(TKeyExtent partScan) {
    this.partScan = partScan;
    return this;
  }
  
  public void unsetPartScan() {
    this.partScan = null;
  }
  
  /** Returns true if field partScan is set (has been asigned a value) and false otherwise */
  public boolean isSetPartScan() {
    return this.partScan != null;
  }
  
  public void setPartScanIsSet(boolean value) {
    if (!value) {
      this.partScan = null;
    }
  }
  
  public TKey getPartNextKey() {
    return this.partNextKey;
  }
  
  public MultiScanResult setPartNextKey(TKey partNextKey) {
    this.partNextKey = partNextKey;
    return this;
  }
  
  public void unsetPartNextKey() {
    this.partNextKey = null;
  }
  
  /** Returns true if field partNextKey is set (has been asigned a value) and false otherwise */
  public boolean isSetPartNextKey() {
    return this.partNextKey != null;
  }
  
  public void setPartNextKeyIsSet(boolean value) {
    if (!value) {
      this.partNextKey = null;
    }
  }
  
  public boolean isPartNextKeyInclusive() {
    return this.partNextKeyInclusive;
  }
  
  public MultiScanResult setPartNextKeyInclusive(boolean partNextKeyInclusive) {
    this.partNextKeyInclusive = partNextKeyInclusive;
    setPartNextKeyInclusiveIsSet(true);
    return this;
  }
  
  public void unsetPartNextKeyInclusive() {
    __isset_bit_vector.clear(__PARTNEXTKEYINCLUSIVE_ISSET_ID);
  }
  
  /** Returns true if field partNextKeyInclusive is set (has been asigned a value) and false otherwise */
  public boolean isSetPartNextKeyInclusive() {
    return __isset_bit_vector.get(__PARTNEXTKEYINCLUSIVE_ISSET_ID);
  }
  
  public void setPartNextKeyInclusiveIsSet(boolean value) {
    __isset_bit_vector.set(__PARTNEXTKEYINCLUSIVE_ISSET_ID, value);
  }
  
  public boolean isMore() {
    return this.more;
  }
  
  public MultiScanResult setMore(boolean more) {
    this.more = more;
    setMoreIsSet(true);
    return this;
  }
  
  public void unsetMore() {
    __isset_bit_vector.clear(__MORE_ISSET_ID);
  }
  
  /** Returns true if field more is set (has been asigned a value) and false otherwise */
  public boolean isSetMore() {
    return __isset_bit_vector.get(__MORE_ISSET_ID);
  }
  
  public void setMoreIsSet(boolean value) {
    __isset_bit_vector.set(__MORE_ISSET_ID, value);
  }
  
  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
      case RESULTS:
        if (value == null) {
          unsetResults();
        } else {
          setResults((java.util.List<TKeyValue>) value);
        }
        break;
      
      case FAILURES:
        if (value == null) {
          unsetFailures();
        } else {
          setFailures((java.util.Map<TKeyExtent,java.util.List<TRange>>) value);
        }
        break;
      
      case FULL_SCANS:
        if (value == null) {
          unsetFullScans();
        } else {
          setFullScans((java.util.List<TKeyExtent>) value);
        }
        break;
      
      case PART_SCAN:
        if (value == null) {
          unsetPartScan();
        } else {
          setPartScan((TKeyExtent) value);
        }
        break;
      
      case PART_NEXT_KEY:
        if (value == null) {
          unsetPartNextKey();
        } else {
          setPartNextKey((TKey) value);
        }
        break;
      
      case PART_NEXT_KEY_INCLUSIVE:
        if (value == null) {
          unsetPartNextKeyInclusive();
        } else {
          setPartNextKeyInclusive((Boolean) value);
        }
        break;
      
      case MORE:
        if (value == null) {
          unsetMore();
        } else {
          setMore((Boolean) value);
        }
        break;
    
    }
  }
  
  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }
  
  public Object getFieldValue(_Fields field) {
    switch (field) {
      case RESULTS:
        return getResults();
        
      case FAILURES:
        return getFailures();
        
      case FULL_SCANS:
        return getFullScans();
        
      case PART_SCAN:
        return getPartScan();
        
      case PART_NEXT_KEY:
        return getPartNextKey();
        
      case PART_NEXT_KEY_INCLUSIVE:
        return new Boolean(isPartNextKeyInclusive());
        
      case MORE:
        return new Boolean(isMore());
        
    }
    throw new IllegalStateException();
  }
  
  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }
  
  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
      case RESULTS:
        return isSetResults();
      case FAILURES:
        return isSetFailures();
      case FULL_SCANS:
        return isSetFullScans();
      case PART_SCAN:
        return isSetPartScan();
      case PART_NEXT_KEY:
        return isSetPartNextKey();
      case PART_NEXT_KEY_INCLUSIVE:
        return isSetPartNextKeyInclusive();
      case MORE:
        return isSetMore();
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
    if (that instanceof MultiScanResult)
      return this.equals((MultiScanResult) that);
    return false;
  }
  
  public boolean equals(MultiScanResult that) {
    if (that == null)
      return false;
    
    boolean this_present_results = true && this.isSetResults();
    boolean that_present_results = true && that.isSetResults();
    if (this_present_results || that_present_results) {
      if (!(this_present_results && that_present_results))
        return false;
      if (!this.results.equals(that.results))
        return false;
    }
    
    boolean this_present_failures = true && this.isSetFailures();
    boolean that_present_failures = true && that.isSetFailures();
    if (this_present_failures || that_present_failures) {
      if (!(this_present_failures && that_present_failures))
        return false;
      if (!this.failures.equals(that.failures))
        return false;
    }
    
    boolean this_present_fullScans = true && this.isSetFullScans();
    boolean that_present_fullScans = true && that.isSetFullScans();
    if (this_present_fullScans || that_present_fullScans) {
      if (!(this_present_fullScans && that_present_fullScans))
        return false;
      if (!this.fullScans.equals(that.fullScans))
        return false;
    }
    
    boolean this_present_partScan = true && this.isSetPartScan();
    boolean that_present_partScan = true && that.isSetPartScan();
    if (this_present_partScan || that_present_partScan) {
      if (!(this_present_partScan && that_present_partScan))
        return false;
      if (!this.partScan.equals(that.partScan))
        return false;
    }
    
    boolean this_present_partNextKey = true && this.isSetPartNextKey();
    boolean that_present_partNextKey = true && that.isSetPartNextKey();
    if (this_present_partNextKey || that_present_partNextKey) {
      if (!(this_present_partNextKey && that_present_partNextKey))
        return false;
      if (!this.partNextKey.equals(that.partNextKey))
        return false;
    }
    
    boolean this_present_partNextKeyInclusive = true;
    boolean that_present_partNextKeyInclusive = true;
    if (this_present_partNextKeyInclusive || that_present_partNextKeyInclusive) {
      if (!(this_present_partNextKeyInclusive && that_present_partNextKeyInclusive))
        return false;
      if (this.partNextKeyInclusive != that.partNextKeyInclusive)
        return false;
    }
    
    boolean this_present_more = true;
    boolean that_present_more = true;
    if (this_present_more || that_present_more) {
      if (!(this_present_more && that_present_more))
        return false;
      if (this.more != that.more)
        return false;
    }
    
    return true;
  }
  
  @Override
  public int hashCode() {
    return 0;
  }
  
  public int compareTo(MultiScanResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    
    int lastComparison = 0;
    MultiScanResult typedOther = (MultiScanResult) other;
    
    lastComparison = Boolean.valueOf(isSetResults()).compareTo(typedOther.isSetResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResults()) {
      lastComparison = TBaseHelper.compareTo(this.results, typedOther.results);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFailures()).compareTo(typedOther.isSetFailures());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailures()) {
      lastComparison = TBaseHelper.compareTo(this.failures, typedOther.failures);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFullScans()).compareTo(typedOther.isSetFullScans());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFullScans()) {
      lastComparison = TBaseHelper.compareTo(this.fullScans, typedOther.fullScans);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartScan()).compareTo(typedOther.isSetPartScan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartScan()) {
      lastComparison = TBaseHelper.compareTo(this.partScan, typedOther.partScan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartNextKey()).compareTo(typedOther.isSetPartNextKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartNextKey()) {
      lastComparison = TBaseHelper.compareTo(this.partNextKey, typedOther.partNextKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartNextKeyInclusive()).compareTo(typedOther.isSetPartNextKeyInclusive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartNextKeyInclusive()) {
      lastComparison = TBaseHelper.compareTo(this.partNextKeyInclusive, typedOther.partNextKeyInclusive);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMore()).compareTo(typedOther.isSetMore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMore()) {
      lastComparison = TBaseHelper.compareTo(this.more, typedOther.more);
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
        case 1: // RESULTS
          if (field.type == TType.LIST) {
            {
              TList _list8 = iprot.readListBegin();
              this.results = new java.util.ArrayList<TKeyValue>(_list8.size);
              for (int _i9 = 0; _i9 < _list8.size; ++_i9) {
                TKeyValue _elem10;
                _elem10 = new TKeyValue();
                _elem10.read(iprot);
                this.results.add(_elem10);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // FAILURES
          if (field.type == TType.MAP) {
            {
              TMap _map11 = iprot.readMapBegin();
              this.failures = new java.util.HashMap<TKeyExtent,java.util.List<TRange>>(2 * _map11.size);
              for (int _i12 = 0; _i12 < _map11.size; ++_i12) {
                TKeyExtent _key13;
                java.util.List<TRange> _val14;
                _key13 = new TKeyExtent();
                _key13.read(iprot);
                {
                  TList _list15 = iprot.readListBegin();
                  _val14 = new java.util.ArrayList<TRange>(_list15.size);
                  for (int _i16 = 0; _i16 < _list15.size; ++_i16) {
                    TRange _elem17;
                    _elem17 = new TRange();
                    _elem17.read(iprot);
                    _val14.add(_elem17);
                  }
                  iprot.readListEnd();
                }
                this.failures.put(_key13, _val14);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // FULL_SCANS
          if (field.type == TType.LIST) {
            {
              TList _list18 = iprot.readListBegin();
              this.fullScans = new java.util.ArrayList<TKeyExtent>(_list18.size);
              for (int _i19 = 0; _i19 < _list18.size; ++_i19) {
                TKeyExtent _elem20;
                _elem20 = new TKeyExtent();
                _elem20.read(iprot);
                this.fullScans.add(_elem20);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // PART_SCAN
          if (field.type == TType.STRUCT) {
            this.partScan = new TKeyExtent();
            this.partScan.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // PART_NEXT_KEY
          if (field.type == TType.STRUCT) {
            this.partNextKey = new TKey();
            this.partNextKey.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // PART_NEXT_KEY_INCLUSIVE
          if (field.type == TType.BOOL) {
            this.partNextKeyInclusive = iprot.readBool();
            setPartNextKeyInclusiveIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // MORE
          if (field.type == TType.BOOL) {
            this.more = iprot.readBool();
            setMoreIsSet(true);
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
    if (this.results != null) {
      oprot.writeFieldBegin(RESULTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.results.size()));
        for (TKeyValue _iter21 : this.results) {
          _iter21.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.failures != null) {
      oprot.writeFieldBegin(FAILURES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRUCT, TType.LIST, this.failures.size()));
        for (java.util.Map.Entry<TKeyExtent,java.util.List<TRange>> _iter22 : this.failures.entrySet()) {
          _iter22.getKey().write(oprot);
          {
            oprot.writeListBegin(new TList(TType.STRUCT, _iter22.getValue().size()));
            for (TRange _iter23 : _iter22.getValue()) {
              _iter23.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.fullScans != null) {
      oprot.writeFieldBegin(FULL_SCANS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.fullScans.size()));
        for (TKeyExtent _iter24 : this.fullScans) {
          _iter24.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.partScan != null) {
      oprot.writeFieldBegin(PART_SCAN_FIELD_DESC);
      this.partScan.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.partNextKey != null) {
      oprot.writeFieldBegin(PART_NEXT_KEY_FIELD_DESC);
      this.partNextKey.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(PART_NEXT_KEY_INCLUSIVE_FIELD_DESC);
    oprot.writeBool(this.partNextKeyInclusive);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(MORE_FIELD_DESC);
    oprot.writeBool(this.more);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MultiScanResult(");
    sb.append("results:");
    if (this.results == null) {
      sb.append("null");
    } else {
      sb.append(this.results);
    }
    sb.append(", ");
    sb.append("failures:");
    if (this.failures == null) {
      sb.append("null");
    } else {
      sb.append(this.failures);
    }
    sb.append(", ");
    sb.append("fullScans:");
    if (this.fullScans == null) {
      sb.append("null");
    } else {
      sb.append(this.fullScans);
    }
    sb.append(", ");
    sb.append("partScan:");
    if (this.partScan == null) {
      sb.append("null");
    } else {
      sb.append(this.partScan);
    }
    sb.append(", ");
    sb.append("partNextKey:");
    if (this.partNextKey == null) {
      sb.append("null");
    } else {
      sb.append(this.partNextKey);
    }
    sb.append(", ");
    sb.append("partNextKeyInclusive:");
    sb.append(this.partNextKeyInclusive);
    sb.append(", ");
    sb.append("more:");
    sb.append(this.more);
    sb.append(")");
    return sb.toString();
  }
  
  public void validate() throws TException {
    // check for required fields
  }
  
}
