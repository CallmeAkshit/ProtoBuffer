package com.manish.assignment3;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Person)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *int32 id = 1;
     *int32 rollNumber = 4;
     *string first_name = 2;
     *string last_name = 3;
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     *int32 id = 1;
     *int32 rollNumber = 4;
     *string first_name = 2;
     *string last_name = 3;
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    int getAge();

    /**
     * <code>string company = 3;</code>
     * @return The company.
     */
    java.lang.String getCompany();
    /**
     * <code>string company = 3;</code>
     * @return The bytes for company.
     */
    com.google.protobuf.ByteString
        getCompanyBytes();

    /**
     * <code>int32 building_code = 4;</code>
     * @return The buildingCode.
     */
    int getBuildingCode();

    /**
     * <code>string phone_number = 5;</code>
     * @return The phoneNumber.
     */
    java.lang.String getPhoneNumber();
    /**
     * <code>string phone_number = 5;</code>
     * @return The bytes for phoneNumber.
     */
    com.google.protobuf.ByteString
        getPhoneNumberBytes();

    /**
     * <code>string address = 6;</code>
     * @return The address.
     */
    java.lang.String getAddress();
    /**
     * <code>string address = 6;</code>
     * @return The bytes for address.
     */
    com.google.protobuf.ByteString
        getAddressBytes();
  }
  /**
   * Protobuf type {@code Person}
   */
  public static final class Person extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Person)
      PersonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Person() {
      name_ = "";
      company_ = "";
      phoneNumber_ = "";
      address_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Person();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Person(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 16: {

              age_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              company_ = s;
              break;
            }
            case 32: {

              buildingCode_ = input.readInt32();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              phoneNumber_ = s;
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              address_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PersonOuterClass.internal_static_Person_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PersonOuterClass.internal_static_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PersonOuterClass.Person.class, PersonOuterClass.Person.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     *int32 id = 1;
     *int32 rollNumber = 4;
     *string first_name = 2;
     *string last_name = 3;
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *int32 id = 1;
     *int32 rollNumber = 4;
     *string first_name = 2;
     *string last_name = 3;
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private int age_;
    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    @java.lang.Override
    public int getAge() {
      return age_;
    }

    public static final int COMPANY_FIELD_NUMBER = 3;
    private volatile java.lang.Object company_;
    /**
     * <code>string company = 3;</code>
     * @return The company.
     */
    @java.lang.Override
    public java.lang.String getCompany() {
      java.lang.Object ref = company_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        company_ = s;
        return s;
      }
    }
    /**
     * <code>string company = 3;</code>
     * @return The bytes for company.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCompanyBytes() {
      java.lang.Object ref = company_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        company_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BUILDING_CODE_FIELD_NUMBER = 4;
    private int buildingCode_;
    /**
     * <code>int32 building_code = 4;</code>
     * @return The buildingCode.
     */
    @java.lang.Override
    public int getBuildingCode() {
      return buildingCode_;
    }

    public static final int PHONE_NUMBER_FIELD_NUMBER = 5;
    private volatile java.lang.Object phoneNumber_;
    /**
     * <code>string phone_number = 5;</code>
     * @return The phoneNumber.
     */
    @java.lang.Override
    public java.lang.String getPhoneNumber() {
      java.lang.Object ref = phoneNumber_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phoneNumber_ = s;
        return s;
      }
    }
    /**
     * <code>string phone_number = 5;</code>
     * @return The bytes for phoneNumber.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPhoneNumberBytes() {
      java.lang.Object ref = phoneNumber_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phoneNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ADDRESS_FIELD_NUMBER = 6;
    private volatile java.lang.Object address_;
    /**
     * <code>string address = 6;</code>
     * @return The address.
     */
    @java.lang.Override
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      }
    }
    /**
     * <code>string address = 6;</code>
     * @return The bytes for address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (age_ != 0) {
        output.writeInt32(2, age_);
      }
      if (!getCompanyBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, company_);
      }
      if (buildingCode_ != 0) {
        output.writeInt32(4, buildingCode_);
      }
      if (!getPhoneNumberBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, phoneNumber_);
      }
      if (!getAddressBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, address_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, age_);
      }
      if (!getCompanyBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, company_);
      }
      if (buildingCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, buildingCode_);
      }
      if (!getPhoneNumberBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, phoneNumber_);
      }
      if (!getAddressBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, address_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof PersonOuterClass.Person)) {
        return super.equals(obj);
      }
      PersonOuterClass.Person other = (PersonOuterClass.Person) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getAge()
          != other.getAge()) return false;
      if (!getCompany()
          .equals(other.getCompany())) return false;
      if (getBuildingCode()
          != other.getBuildingCode()) return false;
      if (!getPhoneNumber()
          .equals(other.getPhoneNumber())) return false;
      if (!getAddress()
          .equals(other.getAddress())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge();
      hash = (37 * hash) + COMPANY_FIELD_NUMBER;
      hash = (53 * hash) + getCompany().hashCode();
      hash = (37 * hash) + BUILDING_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getBuildingCode();
      hash = (37 * hash) + PHONE_NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getPhoneNumber().hashCode();
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PersonOuterClass.Person parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PersonOuterClass.Person parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PersonOuterClass.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PersonOuterClass.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PersonOuterClass.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PersonOuterClass.Person parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PersonOuterClass.Person parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PersonOuterClass.Person parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static PersonOuterClass.Person parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static PersonOuterClass.Person parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PersonOuterClass.Person parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PersonOuterClass.Person parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(PersonOuterClass.Person prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Person}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Person)
        PersonOuterClass.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PersonOuterClass.internal_static_Person_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PersonOuterClass.internal_static_Person_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PersonOuterClass.Person.class, PersonOuterClass.Person.Builder.class);
      }

      // Construct using com.manish.assignment3.PersonOuterClass.Person.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";

        age_ = 0;

        company_ = "";

        buildingCode_ = 0;

        phoneNumber_ = "";

        address_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PersonOuterClass.internal_static_Person_descriptor;
      }

      @java.lang.Override
      public PersonOuterClass.Person getDefaultInstanceForType() {
        return PersonOuterClass.Person.getDefaultInstance();
      }

      @java.lang.Override
      public PersonOuterClass.Person build() {
        PersonOuterClass.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public PersonOuterClass.Person buildPartial() {
        PersonOuterClass.Person result = new PersonOuterClass.Person(this);
        result.name_ = name_;
        result.age_ = age_;
        result.company_ = company_;
        result.buildingCode_ = buildingCode_;
        result.phoneNumber_ = phoneNumber_;
        result.address_ = address_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PersonOuterClass.Person) {
          return mergeFrom((PersonOuterClass.Person)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PersonOuterClass.Person other) {
        if (other == PersonOuterClass.Person.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getAge() != 0) {
          setAge(other.getAge());
        }
        if (!other.getCompany().isEmpty()) {
          company_ = other.company_;
          onChanged();
        }
        if (other.getBuildingCode() != 0) {
          setBuildingCode(other.getBuildingCode());
        }
        if (!other.getPhoneNumber().isEmpty()) {
          phoneNumber_ = other.phoneNumber_;
          onChanged();
        }
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        PersonOuterClass.Person parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PersonOuterClass.Person) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       *int32 id = 1;
       *int32 rollNumber = 4;
       *string first_name = 2;
       *string last_name = 3;
       * </pre>
       *
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *int32 id = 1;
       *int32 rollNumber = 4;
       *string first_name = 2;
       *string last_name = 3;
       * </pre>
       *
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *int32 id = 1;
       *int32 rollNumber = 4;
       *string first_name = 2;
       *string last_name = 3;
       * </pre>
       *
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *int32 id = 1;
       *int32 rollNumber = 4;
       *string first_name = 2;
       *string last_name = 3;
       * </pre>
       *
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *int32 id = 1;
       *int32 rollNumber = 4;
       *string first_name = 2;
       *string last_name = 3;
       * </pre>
       *
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>int32 age = 2;</code>
       * @return The age.
       */
      @java.lang.Override
      public int getAge() {
        return age_;
      }
      /**
       * <code>int32 age = 2;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(int value) {
        
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 age = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        
        age_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object company_ = "";
      /**
       * <code>string company = 3;</code>
       * @return The company.
       */
      public java.lang.String getCompany() {
        java.lang.Object ref = company_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          company_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string company = 3;</code>
       * @return The bytes for company.
       */
      public com.google.protobuf.ByteString
          getCompanyBytes() {
        java.lang.Object ref = company_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          company_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string company = 3;</code>
       * @param value The company to set.
       * @return This builder for chaining.
       */
      public Builder setCompany(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        company_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string company = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCompany() {
        
        company_ = getDefaultInstance().getCompany();
        onChanged();
        return this;
      }
      /**
       * <code>string company = 3;</code>
       * @param value The bytes for company to set.
       * @return This builder for chaining.
       */
      public Builder setCompanyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        company_ = value;
        onChanged();
        return this;
      }

      private int buildingCode_ ;
      /**
       * <code>int32 building_code = 4;</code>
       * @return The buildingCode.
       */
      @java.lang.Override
      public int getBuildingCode() {
        return buildingCode_;
      }
      /**
       * <code>int32 building_code = 4;</code>
       * @param value The buildingCode to set.
       * @return This builder for chaining.
       */
      public Builder setBuildingCode(int value) {
        
        buildingCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 building_code = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuildingCode() {
        
        buildingCode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object phoneNumber_ = "";
      /**
       * <code>string phone_number = 5;</code>
       * @return The phoneNumber.
       */
      public java.lang.String getPhoneNumber() {
        java.lang.Object ref = phoneNumber_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          phoneNumber_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string phone_number = 5;</code>
       * @return The bytes for phoneNumber.
       */
      public com.google.protobuf.ByteString
          getPhoneNumberBytes() {
        java.lang.Object ref = phoneNumber_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          phoneNumber_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string phone_number = 5;</code>
       * @param value The phoneNumber to set.
       * @return This builder for chaining.
       */
      public Builder setPhoneNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        phoneNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string phone_number = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearPhoneNumber() {
        
        phoneNumber_ = getDefaultInstance().getPhoneNumber();
        onChanged();
        return this;
      }
      /**
       * <code>string phone_number = 5;</code>
       * @param value The bytes for phoneNumber to set.
       * @return This builder for chaining.
       */
      public Builder setPhoneNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        phoneNumber_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object address_ = "";
      /**
       * <code>string address = 6;</code>
       * @return The address.
       */
      public java.lang.String getAddress() {
        java.lang.Object ref = address_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          address_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string address = 6;</code>
       * @return The bytes for address.
       */
      public com.google.protobuf.ByteString
          getAddressBytes() {
        java.lang.Object ref = address_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          address_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string address = 6;</code>
       * @param value The address to set.
       * @return This builder for chaining.
       */
      public Builder setAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        address_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string address = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddress() {
        
        address_ = getDefaultInstance().getAddress();
        onChanged();
        return this;
      }
      /**
       * <code>string address = 6;</code>
       * @param value The bytes for address to set.
       * @return This builder for chaining.
       */
      public Builder setAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        address_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Person)
    }

    // @@protoc_insertion_point(class_scope:Person)
    private static final PersonOuterClass.Person DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PersonOuterClass.Person();
    }

    public static PersonOuterClass.Person getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Person>
        PARSER = new com.google.protobuf.AbstractParser<Person>() {
      @java.lang.Override
      public Person parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Person(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Person> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public PersonOuterClass.Person getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\"r\n\006Person\022\014\n\004name\030\001 \001(\t\022\013" +
      "\n\003age\030\002 \001(\005\022\017\n\007company\030\003 \001(\t\022\025\n\rbuilding" +
      "_code\030\004 \001(\005\022\024\n\014phone_number\030\005 \001(\t\022\017\n\007add" +
      "ress\030\006 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Name", "Age", "Company", "BuildingCode", "PhoneNumber", "Address", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
