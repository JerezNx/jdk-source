package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynEnumOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u40/3098/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Saturday, March 7, 2015 1:53:26 PM PST
*/


/**
    * DynEnum objects support the manipulation of IDL enumerated values.
    * The current position of a DynEnum is always -1.
    */
public interface DynEnumOperations  extends org.omg.DynamicAny.DynAnyOperations
{

  /**
        * Returns the value of the DynEnum as an IDL identifier.
        */
  String get_as_string ();

  /**
        * Sets the value of the DynEnum to the enumerated value whose IDL identifier is passed in the value parameter.
        *
        * @exception InvalidValue If value contains a string that is not a valid IDL identifier
        *            for the corresponding enumerated type
        */
  void set_as_string (String value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;

  /**
        * Returns the value of the DynEnum as the enumerated value's ordinal value.
        * Enumerators have ordinal values 0 to n-1, as they appear from left to right
        * in the corresponding IDL definition.
        */
  int get_as_ulong ();

  /**
        * Sets the value of the DynEnum as the enumerated value's ordinal value.
        *
        * @exception InvalidValue If value contains a value that is outside the range of ordinal values
        *            for the corresponding enumerated type
        */
  void set_as_ulong (int value) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
} // interface DynEnumOperations
