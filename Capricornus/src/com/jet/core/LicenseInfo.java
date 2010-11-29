package com.jet.core;

import java.util.Hashtable;

/**
 *
 */
class LicenseInfo
{
   LicenseInfo () {}

   LicenseInfo (String type, byte code[], Hashtable h) {
      typeName=type;
      this.code=code;
      this.features=h;
   }

   LicenseInfo(String type, int c, Hashtable h) {
      typeName=type;
      icode=c;
      features=h;
   }

   int icode=0;
   String typeName="";
   byte code[]=null;
   
   long expires=0;
   
   Hashtable features=new Hashtable();
}
