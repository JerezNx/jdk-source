package org.omg.IOP;


/**
* org/omg/IOP/ServiceContextListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u40/3098/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Saturday, March 7, 2015 1:53:26 PM PST
*/


/** An array of service contexts, forming a service context list. */
public final class ServiceContextListHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.ServiceContext value[] = null;

  public ServiceContextListHolder ()
  {
  }

  public ServiceContextListHolder (org.omg.IOP.ServiceContext[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.ServiceContextListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.ServiceContextListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.ServiceContextListHelper.type ();
  }

}
