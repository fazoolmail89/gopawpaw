package com.jet.database;

import java.util.*;
import java.sql.*;

import com.jet.log.Logger;

import java.io.Reader;
import java.io.InputStream;
import java.io.IOException;

import com.jet.utils.properties.*;

// import com.jet.apps.databrowser.model.*;

/* 
 * $Log: DBUtils.java,v $
 * Revision 1.1  2004/05/03 14:50:19  bemocvs
 * misc work on sqlminus
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
public class DBUtils implements Logger
{
   private static final Object NULL="null";

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
   public static final ArrayList getRows(ResultSet rs, int max, 
                                         boolean retrieveLobs, 
                                         int maxLobSize, 
                                         String charEncoding) 
      throws SQLException {
      if (rs == null)
         return null;

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
            if (obj == null){
               // obj=(new Null());
               obj=NULL;
            }
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
                  obj="LOB Not Retrieved";
               }
            }
            row.add(obj);
         }
         rows.add(row);
         more=rs.next(); count++;
      }
      log.writeDebug ("getRows shows "+count+
                      " rows and "+colCount+" cols");
      return rows;      
   }
}
