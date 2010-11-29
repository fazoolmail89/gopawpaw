package com.jet.apps.databrowser.database;

import java.util.*;
import java.sql.*;

import com.jet.log.Logger;

import java.lang.reflect.*;

import java.io.Reader;
import java.io.InputStream;
import java.io.IOException;

import com.jet.apps.databrowser.model.*;

import com.jet.utils.properties.*;

import com.jet.utils.exception.*;

// import com.jet.apps.databrowser.model.*;

/* 
 * $Log: DBUtils.java,v $
 * Revision 1.6  2006/12/12 01:41:06  bemocvs
 * fix for oracle date/timestamp
 *
 * Revision 1.5  2006/11/10 17:24:29  bemocvs
 * Moved static method to object method where it belongs.
 *
 * Revision 1.4  2006/08/11 21:26:50  bemocvs
 * Added fix for oracle timestamp bug # 1171
 *
 * Revision 1.3  2004/01/15 19:04:43  bemocvs
 * *** empty log message ***
 *
 * Revision 1.2  2003/02/20 22:53:23  bemocvs
 * Added blob w/ encoding support.
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/05/21 20:57:45  bemocvs
 * 3.0.5
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.4  2002/04/05 15:34:14  bemocvs
 * Final support for Clobs.  Code is slower due to larger amt of data being pulled.
 *
 * Revision 1.3  2002/03/30 21:18:34  bemocvs
 * support for clobs
 *
 * Revision 1.2  2001/10/30 12:54:10  bemocvs
 * changes for array list
 *
 * Revision 1.1  2001/10/03 11:33:04  bemocvs
 * xxx
 *
 */

/**
 * Used to convert elements in a result set into Objects in a 2-d
 * ArrayList.
 *
 *
 * @author Paul Bemowski
 */
public class DBUtils implements Logger, SessionPropertyKeys
{
   /**
    *
    */
   public static final ArrayList getHeaders(ResultSet rs) 
      throws SQLException
   {
      ResultSetMetaData rsmd=rs.getMetaData();
      int colCount=rsmd.getColumnCount();
      
      ArrayList headers=new ArrayList(colCount);

      for (int i=1; i<=colCount; i++)
         headers.add(rsmd.getColumnName(i));
      return headers;
   }

   /** */
   public static final ArrayList getRows(ResultSet rs, int max) 
      throws SQLException {
      if (rs == null)
         return null;

      EProperties dataProps=DBSession.getProperties(DATA_PROPS);
      if (dataProps == null) {
         dataProps=new EProperties();
      }
      boolean retrieveLobs=dataProps.getBoolean("retrieveLobs", false);
      int maxLobSize=dataProps.getInt("maxLobSize", 256);
      String charEncoding=dataProps.getProperty("blobEncoding", "US-ASCII");

      //ConnectionInfo ci=DBSession.
      //boolean isOracle=
      

      ArrayList rows=new ArrayList();
      int rowCount=0;
      int colCount;

      ResultSetMetaData rsmd=rs.getMetaData();
      colCount=rsmd.getColumnCount();
      
      boolean more=rs.next(); int count=1;
      while (more && count <= max) {
         ArrayList row=new ArrayList();
         rowCount++;
         for (int i=1; i<=colCount; i++)
         {
            Object obj=null;

            // The postgres jdbc driver don't fucking work for 
            // getObject on a datetime field!!  Here we take care of that
            try {obj=rs.getObject(i);} catch (Exception ex) {}
            if (obj == null) {
               // this can throw a "no data exception" on MS Access
               // if the value is null.   Problem!!
                  
               // this shit won't be fast, but it's fucking 
               // robust.
               try {obj=rs.getString(i);}
               catch (Exception ex) {obj = null;}
            }
            if (obj == null)
               obj=(new Null());
            else if (obj instanceof byte[]) {
               // this could be a clob!  be careful
               byte b[]=(byte[])obj;
               if (b.length < 255)
                  obj=new String(b);
               else {
                  // should use system.arrayCopy here and make 
                  // the string shorter
                  obj=new String(b);
               }
            }
            else if (obj instanceof Clob) {
               if (retrieveLobs) {
                  // Requested by Fred Hard 3/30/02.
                  // Add max clob length as a parameter in the application
                  // parameters section.
                  
                  Clob clob=(Clob)obj;

                  // Code suggested by fred hart, modified for resiliency
                  Reader r=null;
                  try {
                     r = clob.getCharacterStream();
                     char[] cb = new char[2048];
                     StringBuffer sb = new StringBuffer(2048);
                     int length = r.read(cb);
                     while (length == cb.length) {
                        sb.append(cb);
                        length = r.read(cb);
                     }
                     if (length > 0) 
                        sb.append(cb, 0, length);
                     obj = sb.toString();
                  }
                  catch (IOException ex) {
                     log.writeError(1, "Error reading CLOB", ex);
                     obj="error";
                  }
                  finally {
                     if (r != null) {
                        try {r.close();}catch (Exception ex) {}
                     }
                  }
               } else {
                  obj="LOB Not Retrieved (See Preferences->Data Retrieval)";
               }
            }
            else if (obj instanceof Blob) {
               if (retrieveLobs) {
                  // Requested by Fred Hard 3/30/02.
                  // Add max clob length as a parameter in the application
                  // parameters section.
                  
                  Blob blob=(Blob)obj;

                  // Code suggested by fred hart, modified for resiliency
                  InputStream is=null;
                  try {
                     is = blob.getBinaryStream();
                     byte[] b = new byte[2048];
                     StringBuffer sb = new StringBuffer(2048);
                     int length = is.read(b);
                     while (length > 0) {
                        sb.append(new String(b, 0, length, charEncoding));
                        length = is.read(b);
                     }

                     obj = sb.toString();
                  }
                  catch (IOException ex) {
                     log.writeError(1, "Error reading BLOB", ex);
                     obj="error";
                  }
                  finally {
                     if (is != null) {
                        try {is.close();}catch (Exception ex) {}
                     }
                  }
               } else {
                  obj="LOB Not Retrieved (See Preferences->Data Retrieval)";
               }

            }

            //System.out.println ("object for row "+(rows.size()+1)+" col "+
            //                    (row.size()+1)+" is "+obj.getClass().getName());
            // see comment below
            obj=filterOracle(obj, rs, i);

            //System.out.println ("filtered object for row "+(rows.size()+1)+" col "+
            //                    (row.size()+1)+" is "+obj.getClass().getName());

            row.add(obj);
         }
         rows.add(row);
         more=rs.next(); count++;
      }
      log.writeDebug ("getRows shows "+count+
                      " rows and "+colCount+" cols");
      return rows;      
   }

   /**
    * Ok.  Oracle is evil like microsoft is evil.
    *
    * For the TIMESTAMP datatype, the rs.getObject() method returns
    * a oracle.sql.TIMESTAMP object which DOES NOT extend java.sql.timestamp.
    * This is not explicitly forbidden by JDBC, but it is unexpected
    * for my purposes.
    *
    * I don't want runtime dependancies on the Oracle driver, but
    * compile time dependancies are inevitable.  The getClass().getName()
    * stuff shields us from runtime dependancies.
    *
    * This method is private static final, so it will be inlined, but 
    * it will still cause significant overhead - for all database connection
    * types, when it only benefits (! benefits) Oracle.  So we should
    * make this stateful based on whether the DataBrowser is connected 
    * to Oracle or some other DB.  MySQL and Postgres JDBC driver authors
    * are penalized here for Oracle's arrogance.  I will fix that.
    * 
    * Bemo, 3 dec 2005, Atlanta.
    *
    * Further, 11 dec 2006:
    * Ok, the code was never finished.  The issue is now a bit clearer
    * based on this oracle kb case:
    * http://www.oracle.com/technology/tech/java/sqlj_jdbc/htdocs/jdbc_faq.htm#06_01
    * 
    */
   private static final Object filterOracle(Object obj, ResultSet rs, int col) 
      throws SQLException {
      // Class oclass=obj.getClass();
      if (obj.getClass().getName().equals(O_TIMESTAMP) ||
          obj instanceof java.sql.Date) { 
         obj=rs.getTimestamp(col);
      }
      return obj;
   }
   
   private static final String O_TIMESTAMP="oracle.sql.TIMESTAMP".intern();
   private static final String O_DATE="oracle.sql.DATE".intern();

   private static final class DBOracleTimestampException 
      extends NestedRuntimeException {
      public DBOracleTimestampException(String s, Throwable t) {super (s, t);}
   }                                                  
}
