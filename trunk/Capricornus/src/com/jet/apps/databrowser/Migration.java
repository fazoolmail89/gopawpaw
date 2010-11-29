package com.jet.apps.databrowser;

import java.util.*;
import com.jet.utils.properties.*;
import com.jet.utils.*;

/**
 * The migration class will be a central holding ground for things that
 * need to be done due to upgrades of one software version to another.
 *
 * The initial use of this class is the encryption of passwords in the 
 * jdbcbrowser.properties file.
 *
 * @author Paul Bemowski
 */
public final class Migration
{
   public static final void encryptPasswords(EProperties props,
                                             PBE pbe) {
      // props.debug=true;
      EProperties recent=props.getProperties("recent");
      if (recent != null) {
         int num=recent.getInt("numRecentConnections");
         for (int i=0; i<num; i++) {
            EProperties conprops=recent.getProperties(""+i);
            if (conprops != null) {
               EProperties cprops=conprops.getProperties("connectionProperties");
               String password=(String)cprops.remove("password");
               if (password != null &&
                   password.length() > 0) {
                  // System.out.println ("password: "+password);
                  String encryptedPass=pbe.encrypt(password);
                  // System.out.println ("epassword: "+encryptedPass);
                  cprops.put("password.encrypted", encryptedPass);
                  // cprops.list(System.out);
               }
            }
         }
      }

      EProperties mail=props.getProperties("outboundMail");
      if (mail != null) {
         String mailpass=mail.getProperty("mailPassword");
         if (mailpass != null &&
             mailpass.length() > 0) {
            mail.put("mailPassword.encrypted", pbe.encrypt(mailpass));
         }
         mail.remove("mailPassword");
      }
   }

   public static final void changePassword(EProperties props, PBE oldpbe, 
                                           PBE newpbe) {
      EProperties recent=props.getProperties("recent");
      if (recent != null) {
         int num=recent.getInt("numRecentConnections");
         for (int i=0; i<num; i++) {
            EProperties conprops=recent.getProperties(""+i);
            if (conprops != null) {
               EProperties cprops=conprops.getProperties("connectionProperties");
               
               String oldEncryptedPassword=cprops.getProperty("password.encrypted");
               
               if (oldEncryptedPassword != null &&
                   oldEncryptedPassword.length() > 0) {
                  cprops.put("password.encrypted", 
                             newpbe.encrypt(oldpbe.decrypt(oldEncryptedPassword)));

                  // cprops.list(System.out);
               }
            }
         }
      }

      EProperties mail=props.getProperties("outboundMail");
      if (mail != null) {
         String mailpass=mail.getProperty("mailPassword.encrypted");
         if (mailpass != null &&
             mailpass.length() > 0) {
            mail.put("mailPassword.encrypted", 
                     newpbe.encrypt(oldpbe.decrypt(mailpass)));
         }
      }
   }

   /**
    * History in the 'advanced properties' sectiton was a bad idea.  
    * If someone still has this due to legacy, we're going to remove it.
    */
   static final void removeHistoryFromRecent(EProperties root) {
      EProperties recent=root.getProperties("recent");
      Enumeration keys=recent.keys();
      while (keys.hasMoreElements()) {
         Object key=keys.nextElement();
         Object value=recent.get(key);
         if (value instanceof EProperties) {
            EProperties con=(EProperties)value;
            EProperties advanced=con.getProperties("advancedProperties");
            if (advanced != null) {
               Object history=advanced.get("history");
               if (history != null)
                  advanced.remove("history");
            }
         }
      }
   }
}
