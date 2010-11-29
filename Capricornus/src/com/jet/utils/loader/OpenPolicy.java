package com.jet.utils.loader;

import java.security.*;
import com.jet.log.Logger;

/**
 * Attempts to implement an 'open' java security policy, used
 * primarily for JavaWebStart...  
 */
public class OpenPolicy extends Policy implements Logger
{
   PermissionCollection allPermissionCollection=null;

   public OpenPolicy() {
      AllPermission ap=new AllPermission();
      allPermissionCollection=ap.newPermissionCollection();
      allPermissionCollection.add(ap);

      // the line below throws an exception
      //allPermissionCollection.add(new java.io.FilePermission("<<ALL FILES>>", 
      //                                                              "READ"));

      log.writeDebug(1, "PermissionCollection: "+allPermissionCollection);
   }
   /** */
   public PermissionCollection getPermissions(CodeSource cs) {
      log.writeDebug(1, "OpenPolicy.getPermissions(): cs: "+cs);
      return allPermissionCollection;
   }


   /** */
   public void refresh() {
      // noop
   }
}