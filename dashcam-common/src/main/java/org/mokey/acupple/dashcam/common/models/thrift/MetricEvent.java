/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.mokey.acupple.dashcam.common.models.thrift;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.server.AbstractNonblockingServer.*;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-30")
public class MetricEvent implements org.apache.thrift.TBase<MetricEvent, MetricEvent._Fields>, java.io.Serializable, Cloneable, Comparable<MetricEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MetricEvent");

  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField VALUE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("valueType", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField TAGS_FIELD_DESC = new org.apache.thrift.protocol.TField("tags", org.apache.thrift.protocol.TType.SET, (short)5);
  private static final org.apache.thrift.protocol.TField SEQUENCE_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("sequenceNo", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField ROUTE_FIELD_DESC = new org.apache.thrift.protocol.TField("route", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetricEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MetricEventTupleSchemeFactory());
  }

  public long createdTime; // required
  public String name; // required
  public String value; // required
  /**
   * 
   * @see MetricValueType
   */
  public MetricValueType valueType; // required
  public Set<String> tags; // required
  public long sequenceNo; // optional
  public String route; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CREATED_TIME((short)1, "createdTime"),
    NAME((short)2, "name"),
    VALUE((short)3, "value"),
    /**
     * 
     * @see MetricValueType
     */
    VALUE_TYPE((short)4, "valueType"),
    TAGS((short)5, "tags"),
    SEQUENCE_NO((short)6, "sequenceNo"),
    ROUTE((short)7, "route");

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
        case 1: // CREATED_TIME
          return CREATED_TIME;
        case 2: // NAME
          return NAME;
        case 3: // VALUE
          return VALUE;
        case 4: // VALUE_TYPE
          return VALUE_TYPE;
        case 5: // TAGS
          return TAGS;
        case 6: // SEQUENCE_NO
          return SEQUENCE_NO;
        case 7: // ROUTE
          return ROUTE;
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
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private static final int __SEQUENCENO_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SEQUENCE_NO, _Fields.ROUTE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("valueType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MetricValueType.class)));
    tmpMap.put(_Fields.TAGS, new org.apache.thrift.meta_data.FieldMetaData("tags", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SEQUENCE_NO, new org.apache.thrift.meta_data.FieldMetaData("sequenceNo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ROUTE, new org.apache.thrift.meta_data.FieldMetaData("route", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MetricEvent.class, metaDataMap);
  }

  public MetricEvent() {
  }

  public MetricEvent(
    long createdTime,
    String name,
    String value,
    MetricValueType valueType,
    Set<String> tags)
  {
    this();
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.name = name;
    this.value = value;
    this.valueType = valueType;
    this.tags = tags;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetricEvent(MetricEvent other) {
    __isset_bitfield = other.__isset_bitfield;
    this.createdTime = other.createdTime;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetValue()) {
      this.value = other.value;
    }
    if (other.isSetValueType()) {
      this.valueType = other.valueType;
    }
    if (other.isSetTags()) {
      Set<String> __this__tags = new HashSet<String>(other.tags);
      this.tags = __this__tags;
    }
    this.sequenceNo = other.sequenceNo;
    if (other.isSetRoute()) {
      this.route = other.route;
    }
  }

  public MetricEvent deepCopy() {
    return new MetricEvent(this);
  }

  @Override
  public void clear() {
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    this.name = null;
    this.value = null;
    this.valueType = null;
    this.tags = null;
    setSequenceNoIsSet(false);
    this.sequenceNo = 0;
    this.route = null;
  }

  public long getCreatedTime() {
    return this.createdTime;
  }

  public MetricEvent setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    return this;
  }

  public void unsetCreatedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATEDTIME_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public MetricEvent setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getValue() {
    return this.value;
  }

  public MetricEvent setValue(String value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  /**
   * 
   * @see MetricValueType
   */
  public MetricValueType getValueType() {
    return this.valueType;
  }

  /**
   * 
   * @see MetricValueType
   */
  public MetricEvent setValueType(MetricValueType valueType) {
    this.valueType = valueType;
    return this;
  }

  public void unsetValueType() {
    this.valueType = null;
  }

  /** Returns true if field valueType is set (has been assigned a value) and false otherwise */
  public boolean isSetValueType() {
    return this.valueType != null;
  }

  public void setValueTypeIsSet(boolean value) {
    if (!value) {
      this.valueType = null;
    }
  }

  public int getTagsSize() {
    return (this.tags == null) ? 0 : this.tags.size();
  }

  public java.util.Iterator<String> getTagsIterator() {
    return (this.tags == null) ? null : this.tags.iterator();
  }

  public void addToTags(String elem) {
    if (this.tags == null) {
      this.tags = new HashSet<String>();
    }
    this.tags.add(elem);
  }

  public Set<String> getTags() {
    return this.tags;
  }

  public MetricEvent setTags(Set<String> tags) {
    this.tags = tags;
    return this;
  }

  public void unsetTags() {
    this.tags = null;
  }

  /** Returns true if field tags is set (has been assigned a value) and false otherwise */
  public boolean isSetTags() {
    return this.tags != null;
  }

  public void setTagsIsSet(boolean value) {
    if (!value) {
      this.tags = null;
    }
  }

  public long getSequenceNo() {
    return this.sequenceNo;
  }

  public MetricEvent setSequenceNo(long sequenceNo) {
    this.sequenceNo = sequenceNo;
    setSequenceNoIsSet(true);
    return this;
  }

  public void unsetSequenceNo() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEQUENCENO_ISSET_ID);
  }

  /** Returns true if field sequenceNo is set (has been assigned a value) and false otherwise */
  public boolean isSetSequenceNo() {
    return EncodingUtils.testBit(__isset_bitfield, __SEQUENCENO_ISSET_ID);
  }

  public void setSequenceNoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEQUENCENO_ISSET_ID, value);
  }

  public String getRoute() {
    return this.route;
  }

  public MetricEvent setRoute(String route) {
    this.route = route;
    return this;
  }

  public void unsetRoute() {
    this.route = null;
  }

  /** Returns true if field route is set (has been assigned a value) and false otherwise */
  public boolean isSetRoute() {
    return this.route != null;
  }

  public void setRouteIsSet(boolean value) {
    if (!value) {
      this.route = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((String)value);
      }
      break;

    case VALUE_TYPE:
      if (value == null) {
        unsetValueType();
      } else {
        setValueType((MetricValueType)value);
      }
      break;

    case TAGS:
      if (value == null) {
        unsetTags();
      } else {
        setTags((Set<String>)value);
      }
      break;

    case SEQUENCE_NO:
      if (value == null) {
        unsetSequenceNo();
      } else {
        setSequenceNo((Long)value);
      }
      break;

    case ROUTE:
      if (value == null) {
        unsetRoute();
      } else {
        setRoute((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CREATED_TIME:
      return Long.valueOf(getCreatedTime());

    case NAME:
      return getName();

    case VALUE:
      return getValue();

    case VALUE_TYPE:
      return getValueType();

    case TAGS:
      return getTags();

    case SEQUENCE_NO:
      return Long.valueOf(getSequenceNo());

    case ROUTE:
      return getRoute();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CREATED_TIME:
      return isSetCreatedTime();
    case NAME:
      return isSetName();
    case VALUE:
      return isSetValue();
    case VALUE_TYPE:
      return isSetValueType();
    case TAGS:
      return isSetTags();
    case SEQUENCE_NO:
      return isSetSequenceNo();
    case ROUTE:
      return isSetRoute();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetricEvent)
      return this.equals((MetricEvent)that);
    return false;
  }

  public boolean equals(MetricEvent that) {
    if (that == null)
      return false;

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_valueType = true && this.isSetValueType();
    boolean that_present_valueType = true && that.isSetValueType();
    if (this_present_valueType || that_present_valueType) {
      if (!(this_present_valueType && that_present_valueType))
        return false;
      if (!this.valueType.equals(that.valueType))
        return false;
    }

    boolean this_present_tags = true && this.isSetTags();
    boolean that_present_tags = true && that.isSetTags();
    if (this_present_tags || that_present_tags) {
      if (!(this_present_tags && that_present_tags))
        return false;
      if (!this.tags.equals(that.tags))
        return false;
    }

    boolean this_present_sequenceNo = true && this.isSetSequenceNo();
    boolean that_present_sequenceNo = true && that.isSetSequenceNo();
    if (this_present_sequenceNo || that_present_sequenceNo) {
      if (!(this_present_sequenceNo && that_present_sequenceNo))
        return false;
      if (this.sequenceNo != that.sequenceNo)
        return false;
    }

    boolean this_present_route = true && this.isSetRoute();
    boolean that_present_route = true && that.isSetRoute();
    if (this_present_route || that_present_route) {
      if (!(this_present_route && that_present_route))
        return false;
      if (!this.route.equals(that.route))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_createdTime = true;
    list.add(present_createdTime);
    if (present_createdTime)
      list.add(createdTime);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_value = true && (isSetValue());
    list.add(present_value);
    if (present_value)
      list.add(value);

    boolean present_valueType = true && (isSetValueType());
    list.add(present_valueType);
    if (present_valueType)
      list.add(valueType.getValue());

    boolean present_tags = true && (isSetTags());
    list.add(present_tags);
    if (present_tags)
      list.add(tags);

    boolean present_sequenceNo = true && (isSetSequenceNo());
    list.add(present_sequenceNo);
    if (present_sequenceNo)
      list.add(sequenceNo);

    boolean present_route = true && (isSetRoute());
    list.add(present_route);
    if (present_route)
      list.add(route);

    return list.hashCode();
  }

  @Override
  public int compareTo(MetricEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCreatedTime()).compareTo(other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValueType()).compareTo(other.isSetValueType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValueType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.valueType, other.valueType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTags()).compareTo(other.isSetTags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTags()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tags, other.tags);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSequenceNo()).compareTo(other.isSetSequenceNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequenceNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sequenceNo, other.sequenceNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoute()).compareTo(other.isSetRoute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoute()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.route, other.route);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MetricEvent(");
    boolean first = true;

    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      sb.append(this.value);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("valueType:");
    if (this.valueType == null) {
      sb.append("null");
    } else {
      sb.append(this.valueType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tags:");
    if (this.tags == null) {
      sb.append("null");
    } else {
      sb.append(this.tags);
    }
    first = false;
    if (isSetSequenceNo()) {
      if (!first) sb.append(", ");
      sb.append("sequenceNo:");
      sb.append(this.sequenceNo);
      first = false;
    }
    if (isSetRoute()) {
      if (!first) sb.append(", ");
      sb.append("route:");
      if (this.route == null) {
        sb.append("null");
      } else {
        sb.append(this.route);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'createdTime' because it's a primitive and you chose the non-beans generator.
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (value == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'value' was not present! Struct: " + toString());
    }
    if (valueType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'valueType' was not present! Struct: " + toString());
    }
    if (tags == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tags' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MetricEventStandardSchemeFactory implements SchemeFactory {
    public MetricEventStandardScheme getScheme() {
      return new MetricEventStandardScheme();
    }
  }

  private static class MetricEventStandardScheme extends StandardScheme<MetricEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MetricEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CREATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdTime = iprot.readI64();
              struct.setCreatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readString();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VALUE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.valueType = com.dcf.iqunxing.fx.dashcam.common.models.thrift.MetricValueType.findByValue(iprot.readI32());
              struct.setValueTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TAGS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set28 = iprot.readSetBegin();
                struct.tags = new HashSet<String>(2*_set28.size);
                String _elem29;
                for (int _i30 = 0; _i30 < _set28.size; ++_i30)
                {
                  _elem29 = iprot.readString();
                  struct.tags.add(_elem29);
                }
                iprot.readSetEnd();
              }
              struct.setTagsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SEQUENCE_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sequenceNo = iprot.readI64();
              struct.setSequenceNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ROUTE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.route = iprot.readString();
              struct.setRouteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetCreatedTime()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'createdTime' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MetricEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
      oprot.writeI64(struct.createdTime);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeString(struct.value);
        oprot.writeFieldEnd();
      }
      if (struct.valueType != null) {
        oprot.writeFieldBegin(VALUE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.valueType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.tags != null) {
        oprot.writeFieldBegin(TAGS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.tags.size()));
          for (String _iter31 : struct.tags)
          {
            oprot.writeString(_iter31);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetSequenceNo()) {
        oprot.writeFieldBegin(SEQUENCE_NO_FIELD_DESC);
        oprot.writeI64(struct.sequenceNo);
        oprot.writeFieldEnd();
      }
      if (struct.route != null) {
        if (struct.isSetRoute()) {
          oprot.writeFieldBegin(ROUTE_FIELD_DESC);
          oprot.writeString(struct.route);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MetricEventTupleSchemeFactory implements SchemeFactory {
    public MetricEventTupleScheme getScheme() {
      return new MetricEventTupleScheme();
    }
  }

  private static class MetricEventTupleScheme extends TupleScheme<MetricEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MetricEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.createdTime);
      oprot.writeString(struct.name);
      oprot.writeString(struct.value);
      oprot.writeI32(struct.valueType.getValue());
      {
        oprot.writeI32(struct.tags.size());
        for (String _iter32 : struct.tags)
        {
          oprot.writeString(_iter32);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetSequenceNo()) {
        optionals.set(0);
      }
      if (struct.isSetRoute()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSequenceNo()) {
        oprot.writeI64(struct.sequenceNo);
      }
      if (struct.isSetRoute()) {
        oprot.writeString(struct.route);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MetricEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.createdTime = iprot.readI64();
      struct.setCreatedTimeIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.value = iprot.readString();
      struct.setValueIsSet(true);
      struct.valueType = com.dcf.iqunxing.fx.dashcam.common.models.thrift.MetricValueType.findByValue(iprot.readI32());
      struct.setValueTypeIsSet(true);
      {
        org.apache.thrift.protocol.TSet _set33 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.tags = new HashSet<String>(2*_set33.size);
        String _elem34;
        for (int _i35 = 0; _i35 < _set33.size; ++_i35)
        {
          _elem34 = iprot.readString();
          struct.tags.add(_elem34);
        }
      }
      struct.setTagsIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.sequenceNo = iprot.readI64();
        struct.setSequenceNoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.route = iprot.readString();
        struct.setRouteIsSet(true);
      }
    }
  }

}
