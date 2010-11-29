package com.jet.apps.databrowser.database;

import javax.swing.ImageIcon;
import java.util.*;

import com.jet.core.*;
import com.jet.log.Logger;
import com.jet.utils.properties.*;
import com.jet.utils.icons.*;

/*
 * $Log: DatabaseCustomization.java,v $
 * Revision 1.2  2006/08/14 17:28:56  barney
 * Added support for HSQLDB
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/05/04 19:08:02  bemocvs
 * Working
 *
 * Revision 1.1  2002/05/04 18:54:19  bemocvs
 * plugin work
 *
 */

/**
 * DatabaseCustomization is a class with two primary goals: <p>
 *
 * 1) Isolate the DataBrowser core code from the quirks and 
 * problems of individual databases and JDBC Drivers.
 *
 * 2) Provide and entry point for customizations and extensions
 * to the databrowser. This would include things that are 
 * very database specific -- a usermanager for freedatabases, a 
 * query analyzer, etc.
 *
 * @author Paul Bemowski
 */
public final class DatabaseCustomization implements Logger
{
   private static EProperties root=null;

   private static HashMap iconsByDriver=null;

   /** */
   static {
      try {
         Core core=Core.getInstance();
         root=core.getSystemProperties("database.properties");
      } catch (Exception ex) {
         log.writeError(1, "Serious error, DB customization not available.",
                        ex);
      }
   }

   /** */
   public static final HashMap getIconsByDriver() {
      if (iconsByDriver == null) {
         synchronized (DatabaseCustomization.class) {
            if (iconsByDriver == null) {
               buildIconsByDriver();
            }
         }
      }
      return iconsByDriver;
   }

   /** */
   private static final void buildIconsByDriver() {
      iconsByDriver=new HashMap();

      EProperties drivers=root.getProperties("drivers");
      for (Enumeration keys=drivers.keys(); 
           keys.hasMoreElements();) {
         String key=keys.nextElement().toString();
         EProperties driver=drivers.getProperties(key);
         
         String iconref=driver.getProperty("icon");
         
         ImageIcon icon=IconFactory.findIcon(iconref);

         iconsByDriver.put(key, icon);
      }
   }

   /** */
   public static final EProperties getDatabaseProperties() {
      return root.getProperties("databases");
   }
}
