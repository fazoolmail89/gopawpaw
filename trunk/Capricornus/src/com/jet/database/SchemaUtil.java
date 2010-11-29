package com.jet.database;

import java.sql.*;
import java.util.*;
import java.io.*;

import java.text.SimpleDateFormat;

import com.jet.log.*;
import com.jet.utils.properties.*;
import com.jet.utils.VectorUtil;

/*
 * $Log: SchemaUtil.java,v $
 * Revision 1.13  2007/02/15 11:40:12  bemocvs
 * *** empty log message ***
 *
 * Revision 1.11  2006/12/20 21:17:56  bemocvs
 * jet_databrowser/rootfiles/release.txt
 *
 * Revision 1.10  2006/12/07 14:43:17  bemocvs
 * Debug strings.  Added code to support new data editor
 *
 * Revision 1.9  2004/09/30 19:11:28  bemocvs
 * Fixed oracle schema prefixing
 *
 * Revision 1.8  2004/01/24 23:46:03  bemocvs
 * 3.2.4
 *
 * Revision 1.7  2003/11/19 16:04:01  bemocvs
 * fixed dataeditor schema util interaction problem
 *
 * Revision 1.6  2003/09/09 10:25:39  bemocvs
 * Bug fixes.
 *
 * Revision 1.5  2003/07/19 11:41:50  bemocvs
 * Fixed schama util, 3.2.1
 *
 * Revision 1.4  2003/07/19 11:36:08  bemocvs
 * Fixed schama util -- don't send All
 *
 * Revision 1.3  2002/12/31 07:10:36  bemocvs
 * Better SQL formatting abstraction.
 *
 * Revision 1.2  2002/12/08 20:48:01  bemocvs
 * Added error reporting.
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.14  2002/05/02 11:06:43  bemocvs
 * 3.0.2
 *
 * Revision 1.13  2002/03/16 21:27:45  bemocvs
 * fixed unlikely null pointer exception
 *
 * Revision 1.12  2002/03/08 12:05:01  bemocvs
 * Overwriting 1.11
 *
 */ 

/**
 * Builds objects representing a database schema from a database
 * connection.
 * 
 * @author Paul Bemowski
 */
public class SchemaUtil
   implements Logger
{
   //private ConnectionInfo conInfo=null;
   private Connection con=null;
   private DatabaseMetaData dbmd=null;
   
   // private boolean shortStringToMetaData=false;
   
   private String catalog=null;
   private String schema=null;
   private String typeList[]=null;

   private Vector types=null;

   private static EProperties allDatabaseProps=null;
   private EProperties thisDatabaseProps=null;

   /** This is a local cache of object representations of the 
    * table schema. */
   private Hashtable sqlTables=new Hashtable();

   /** This is a local cache of simple tables. */
   private Hashtable simpleTables=new Hashtable();

   private SQLFormatter sqlFormatter=null;

   private String driver=null;
   private String user=null;

   private boolean isOracle=false;
   private boolean isMSSQLServer=false;

   private static int uniqueIDCounter=0;
   
   private int uniqueId=0;

   static {
      try {
         InputStream is=SchemaUtil.class.getResourceAsStream("database.properties");
         
         if (is != null){
            allDatabaseProps=new EProperties();
            allDatabaseProps.load(is);
         } else {
            log.writeError("CRITICAL ERROR: Unable to get "+
                           "database properties");
         }
      }
      catch (Exception ex) {
         log.writeError(1, "Error loading schema utils properties.", ex);
      }
   }

   /** */
   public String toString() {
      return 
      "SchemaUtil {uid: "+uniqueId+
      " schema: "+schema+
      " cat: "+catalog+
      " types: "+
      ((typeList==null) ? "null" : VectorUtil.arrayToVector(typeList).toString())+"}";
   }

   /** */
   public SchemaUtil(Connection con, String driver, String user) {
      this.driver=driver;
      this.user=user;
      init(con);

      synchronized(this) {
         uniqueId=uniqueIDCounter++;
      }
   }

   /** */
   public synchronized void resetTableCaches() {
      sqlTables=new Hashtable();
      simpleTables=new Hashtable();      
   }

   /**
    */
   private void init(Connection c)
   {
      con=c;
      // don't cache connection to metadata object, PostgreSQL dosen't
      // like that.
      try {
         dbmd = con.getMetaData();
      }
      catch (Exception ex) {
         log.writeError(1, "SchemaUtil unable to get metadata.", ex);
      }
      
      String propsKey=null;
      String lcDriver=driver.toLowerCase();
      if (lcDriver.startsWith("com.ibm.db2")) {
         propsKey="db2";
      }
      
      if (propsKey == null) {
         try {
            String dbProductName=dbmd.getDatabaseProductName();
            if (dbProductName == null)
               dbProductName="";
            else
               dbProductName=dbProductName.toLowerCase();
            
            if (dbProductName.indexOf("oracle") != -1) {
               isOracle=true;
               propsKey="oracle";
            }
            else if (dbProductName.indexOf("access") != -1) 
               propsKey="access";
            else if (dbProductName.indexOf("postgres") != -1)
               propsKey="postgresql";
            else if (dbProductName.indexOf("mysql") != -1)
               propsKey="mysql";
            // this is for Steve Gertiser, and his HiT db2 driver
            else if (dbProductName.indexOf("db2") != -1)
               propsKey="hit_db2";
            else if (dbProductName.indexOf("microsoft sql server") != -1) {
               isMSSQLServer=true;
               propsKey="default";
                                  
            } else if (dbProductName.indexOf("hsql") != -1) {
               propsKey="hsqldb";
            }
            else
               propsKey="default";            
         }
         catch (Exception ex) {
            log.writeError(1, "Unable to get database "+
                           "specific properties.", ex);
         }
      }
      thisDatabaseProps=allDatabaseProps.getProperties(propsKey);
      log.writeDebug(3, "This Database's properties for key "+propsKey+
                     ": \n"+thisDatabaseProps);
      sqlFormatter=new DatabaseSQLFormatter(thisDatabaseProps);
   }

   // NOTE: FUNCTIONALITY MOVED TO SQLFormatter
//     /** */
//     public String cleanSQL(String sql) {
//        // at this point, this really only applies to the
//        // hit db2 driver.
//        if (thisDatabaseProps.getBoolean("stripNewlinesFromSQL", false)) {
//           String s=sql.replace('\n', ' ');
//           s=s.replace('\r', ' ');
//           return s;
//        }
//        else 
//           return sql;
//     }

//     /** */
//     public String dateTimeSQL(java.util.Date d) {
//        EProperties props=thisDatabaseProps.getProperties("dateConversion");
      
//        SimpleDateFormat stf=new SimpleDateFormat(props.getProperty("format"));
//        StringBuffer sql=new StringBuffer(props.getProperty("SQL"));
//        int index=sql.toString().indexOf("%datevalue%");
//        sql.replace(index, index+11, stf.format(d));

//        log.writeDebug("DB Date Conversion, result: "+sql.toString());
//        return sql.toString();
//     }

   /** */
   public SQLFormatter getSQLFormatter() {
      return sqlFormatter;
   }

   /** */
   public String tableSQL(String table) {
      String iqs=thisDatabaseProps.getProperty("identifierQuoteString", "");
      if ((isOracle ||isMSSQLServer) && schema != null) {
         if (table.startsWith(schema+"."))
            return iqs+table+iqs;
         else
            return iqs+schema+"."+table+iqs;
      }
      else
         return iqs+table+iqs;
   }

   /** */
   public void setSchema(String s) {
      // Removed: this is old code.  null is a valid value.  
      // filtering out the word 'all' must happen in the UI
      // if (s != null && !s.equals("All"))
      
      schema=s;
   }

   /** */
   public void setCatalog(String s) {
      // if (s != null && !s.equals("All"))
      catalog=s;
   }

   /** */
   public void setTypeList(String s[]) {
      typeList=s;
   }

   /**
    *
    */
   public Vector getAllTypes()
   {
      if (types != null)
         return types;
      else {
         types=new Vector();
         ResultSet rs=null;
         try{
            rs=dbmd.getTypeInfo();
            if (rs != null){
               boolean more=rs.next();
               while (more){
                  types.addElement(new SQLType(rs));
                  more=rs.next();
               }
            }
            log.writeDebug("SchemaUtil returning "+types.size()+
                         " supported data types.");
         }
         catch (Exception ex) {
            types=null;
            log.printStackTrace(ex);
         }
         finally {
            if (rs != null)
               try {rs.close();}catch (Exception ex) {log.printStackTrace(ex);}
         }
         return types;
      }
   }

   /**
    *
    */
   private SQLType guessType(String typeName, int typeint)
   {
      // first guess by name, then by number, then try to 
      if (types == null)
         types=getAllTypes();
      if (types == null) {
         log.writeDebug("Types list is null in SchemaUtil!!!!");
         SQLType type=new SQLType(typeName, false);
         type.setIType(typeint);
         return type;
      }
      int numTypes=types.size();
      
      SQLType hit=null;
      for (int i=0; i<numTypes; i++) {
         SQLType type=(SQLType)types.elementAt(i);

         if (type.getIType() == typeint) {
            hit=type;
            if (typeName != null &&
                typeName.equalsIgnoreCase(type.getName())) {
               // log.writeDebug("OriginalTypeDetails "+hit.getTypeDetail());

               return new SQLType(hit);
            }
            else {
               // keep looking, but hold onto the previous hit.
            }
         }
         else if (typeName != null &&
                  typeName.equalsIgnoreCase(type.getName())) {
            hit=type; // already failed itype, so continue...
         }
      }
      if (hit != null) {
         // log.writeDebug("OriginalTypeDetails (def) "+hit.getTypeDetail());
         
         return new SQLType(hit);
      }
      else {
         log.writeDebug("Could not find match in type list for "+
                      typeName+" "+typeint);

         return simpleType(typeName, typeint, 20, 0, 0);
      }
   }

   /** */
   static SQLType simpleType(String typeName, int typeint, int size, 
                             int scale, int precision) {
      SQLType type=null;
      if (typeName.toLowerCase().startsWith("varchar") ||
          typeName.toLowerCase().startsWith("char")||
          typeint == Types.CHAR || 
          typeint == Types.CLOB ||
          typeint == Types.VARCHAR) {
         type=new SQLType(typeName, true);
         type.setParameterString(""+size);
      } else if (typeName.toLowerCase().equals("number")) {
         type=new SQLType(typeName, true);

         // Found this on the net.  Bascically, in Oracle, 
         // the itype for numbers always = Types.NUMERIC (2), 
         // getTypeName always = NUMBER, 
         // columnClassName = java.math.BigDecimal
         // the only thing that identifies a float is a 
         // precision of 0, and a scale of -127
         if (scale == -127) {
            type.setName("FLOAT");
         } else if (scale != 0)
            type.setParameterString(""+precision+","+scale); 
         else 
            type.setParameterString(""+precision);

      } else {
         type=new SQLType(typeName, false);
      }
      
      type.setIType(typeint);

      type.setScale(scale);
      type.setPrecision(precision);
      return type;
   }

   /**
    *
    */
   public Vector getTableNames()
   {
      Vector v=new Vector();
      ResultSet rs=null;
      try {
         log.writeDebug("Getting table names, cat="+catalog+" schema="+
                      schema+" type="+((typeList==null)?"null":typeList[0]));
         rs=dbmd.getTables(catalog, schema, null, typeList);
         boolean more=rs.next();
         while(more) {
            String s=rs.getString("TABLE_NAME");
            v.addElement(s);
            more=rs.next();
         }
      }
      catch (SQLException ex) {
         log.printStackTrace(ex);
         v=null;
      }
      return v;
   }

   /**
    * The Schema util is stateful, it knows about a catalog and schema. <P>
    * 
    * The getTables method will return a vector of FULLY formed SQLTable
    * objects.  It will know EVERYTHING that can be known about the table
    * given the jdbc spec.<P>
    *
    * This is a very expensive method.
    */
   public Vector getTables()
      throws SQLException {
      Vector tables=new Vector();
      ResultSet rs=null;
      try {
         rs=dbmd.getTables(catalog, schema, null, typeList);

         boolean more=rs.next();
         while (more) {
            String name=rs.getString("TABLE_NAME");
            String sch=rs.getString("TABLE_SCHEM");
            String cat=rs.getString("TABLE_CAT");
            String type=rs.getString("TABLE_TYPE");


            SQLTable table=getTable(name);
            table.setType(type);
            table.setSchema(sch);
            table.setCatalog(cat);

            tables.addElement(table);

            more=rs.next();
         }
      } catch (RuntimeException ex) {
         log.printStackTrace(ex);
         throw ex;
      } catch (Error ex) {
         log.printStackTrace(ex);
         throw ex;
      }
      finally {
         if (rs != null) {
            try {rs.close();}
            catch (Exception ex) {}
         }
      }
      return tables;
   }

   /** */
   //public Vector getTables(Vector names) 
   //   throws SQLException {return getTables(names, null);}
   
   
   /** */
   public Vector getTables(Vector names) // , ProgressWatcher pw)
      throws SQLException
   {
      Vector ret=new Vector();
      for (int i=0; i<names.size(); i++)
      {
         String tn=(String)names.elementAt(i);
         
         SQLTable st=null;
         
         st=getTable(tn);
         
         ret.addElement(st);
      }

      return ret;
   }

   /** */
   private final void logState() {
      StringBuffer sb=new StringBuffer();
      
      sb.append("SchemaUtil: schema='"+schema+"' cat='"+catalog+"'");
      if (typeList != null) {
         for (int i=0; i<typeList.length; i++) {
            sb.append(" type='"+typeList[i]+"'");
         }
      }
      log.writeDebug(3, sb.toString());
   }


   /**
    *
    */
   public SQLTable getSimpleTable(String tableName)
      throws SQLException
   {
      SQLTable table=null; // new SQLTable(tableName);
      
      table=(SQLTable)simpleTables.get(tableName);
      if (table != null)
         return table;

      String sql="select * from "+sqlFormatter.formatIdentifier(tableName);

      
      Statement state=null;
      ResultSet rs=null;


      log.writeDebug("Building "+tableName+" in catalog "+catalog+
                   " and schema "+schema);
      try { // only matches to finally
         //Connection con=conInfo.getConnection();
         state=con.createStatement();
         state.setMaxRows(1);
         try {state.setQueryTimeout(20);} // 20 sec query timeout 
         catch (Exception ex) {} // not suppored by odbc bridge.
         try {
            log.writeDebug("Executing "+sql);
            rs = state.executeQuery(sql);
            log.writeDebug("Got results.");
         }
         catch (SQLException ex) {
            logState();
            if (schema != null && 
                tableName.indexOf(".") == -1) {
               String longName=schema+"."+tableName;
               log.writeDebug(2, "Unable to form table with name '"+
                              tableName+"' trying with "+longName);
               sql="select * from "+sqlFormatter.formatIdentifier(longName);

               log.writeDebug("Error querying w/o schema, trying with: \n"+
                              sql);
               try {
                  rs=state.executeQuery(sql);
               } catch (SQLException exx) {
                  log.writeError(2, "SchmaUtil: Error executing "+sql+
                                 " while building simple table.", exx);
                  return table;
               }
            }
            else {               
               // log and return??
               log.writeError(2, "SchmaUtil: Error executing "+sql+
                              " while building simple table.", ex);
               return table;
            }
            // throw ex;
         }

         ResultSetMetaData rsmd=rs.getMetaData();
         
         table=simpleTableFromMetaData(tableName, rsmd);
         
         rs.close();
         state.close();
      }
      catch (Throwable t) {
         log.writeDebug("Unknown error buliding SQLTable, returning partial");
         log.printStackTrace(t);
         return table;
      }
      finally {
         try {if (rs != null) rs.close();}
         catch (Exception ex) {}
         try {if (state != null) state.close();}
         catch (Exception es) {}
      }
      simpleTables.put(tableName, table);
      return table;
   }
   
   /** */
   public static SQLTable simpleTableFromMetaData(String name, 
                                                  ResultSetMetaData rsmd) 
      throws SQLException {
      SQLTable table=null; 

      table=new SQLTable(name);
      for (int i=1; i<=rsmd.getColumnCount(); i++)
      {
         String colname=rsmd.getColumnName(i);
         String typeName=rsmd.getColumnTypeName(i);
         int itype=rsmd.getColumnType(i);
         int size=rsmd.getColumnDisplaySize(i);

         int scale=0; 
         int precision=0; 

         try {
            scale=rsmd.getScale(i);
            precision=rsmd.getPrecision(i);
         } catch (Exception ex) {
            log.writeError(3, "Unable to get scale or precision: ", ex);
         }
            
         int n=rsmd.isNullable(i);
         boolean nullable=true;
         switch (n) {
            case ResultSetMetaData.columnNoNulls:
               nullable=false; break;
            case ResultSetMetaData.columnNullable:
               nullable=true; break;
            default:
               nullable=true;
         }
            
         SQLColumn col=new SQLColumn(colname);

         // SQLType type=guessType(typeName, itype);
         SQLType type=simpleType(typeName, itype, size, scale, precision);
         
            
         //log.writeDebug("Found type for "+typeName+" "+itype+
         //             type.getTypeDetail());

         //if (type.allowsParameters())
         //   type.setParameterString(""+size);

         col.setType(type);
         col.setNullable(nullable);

         table.addColumn(col);
         // still have to get primary key info
      }

      return table;
   }

   /** */
   public SQLTable getTableFromCache(String name) {
      return (SQLTable)sqlTables.get(name);
   }

   /**
    * Builds a complete sql table from all available information.  Usually
    * takes considerale effort.
    */
   public SQLTable getTable(String tableName)
      throws SQLException 
   {      
      SQLTable table=null;

      // check the cache
      table=(SQLTable)sqlTables.get(tableName);
      if (table != null)
         return table;

      table=getSimpleTable(tableName);

      if (table == null)
         return null;

      String shortName=null;
      int dotindex=tableName.indexOf(".");
      if (dotindex == -1)
         shortName=tableName;
      else
         shortName=tableName.substring(dotindex+1);


      Statement state=null;
      ResultSet rs=null;
      try {
         // Try to get Primary keys, and indices.
         Vector keys=null;
         Vector indices=new Vector();
         DatabaseMetaData dbmd=con.getMetaData();
         rs=null;
         try {
            String tname=null;
            if (thisDatabaseProps.getBoolean("shortNameToMetaData", false))
               tname=shortName;
            else
               tname=tableName;

            log.writeDebug("Attempting to get keys for table="+tname);
            log.writeDebug("   catalog="+catalog+" schema="+schema);
            rs=dbmd.getPrimaryKeys(catalog, schema, tname);
            log.writeDebug("Got resultSet from getPrimaryKeys()");
         }
         catch (Exception ex) {
            log.writeDebug("Unable to get primary keys:"+ex);
            // log.printStackTrace(ex);
            rs=null;
         }

         if (rs != null) {
            log.writeDebug("Getting primary keys.");
            keys=new Vector();
            boolean more=rs.next();
            while (more) {
               String key=rs.getString("COLUMN_NAME");
               keys.addElement(key);
               log.writeDebug("key ="+key);
               more=rs.next();
            }
            table.setPrimaryKeys(keys);
         }

         // Get Indices
         rs=null;
         boolean guessKeys=false;
         if (keys == null) {
            guessKeys=true;
            keys=new Vector();
         }
         try {
            String tname=null;
            // if (shortStringToMetaData)
            if (thisDatabaseProps.getBoolean("shortNameToMetaData", false))
               tname=shortName;
            else
               tname=tableName;

            log.writeDebug("Getting indices for table="+tname);
            log.writeDebug("  catalog="+catalog+" schema="+schema);
            // 
            //rs=dbmd.getIndexInfo(catalog, schema, tname, false, false);
            // the final 'true' allows oracle to approximate, which should
            // be much quicker on oracle.  And what the hell do we care
            // if it is approximated or not - we're not using the
            // statistics...  bemo, 20 dec 2006
            rs=dbmd.getIndexInfo(catalog, schema, tname, false, true);
            log.writeDebug("Got indices.");
         }
         catch (Exception ex) {
            log.printStackTrace(ex);
            rs=null;
         }
         if (rs != null) {
            boolean more=rs.next();
            while (more) {
               try {
                  String iname=rs.getString("INDEX_NAME");
                  String cname=rs.getString("COLUMN_NAME");
                  short type=rs.getShort("TYPE");
                  boolean unique=rs.getBoolean("NON_UNIQUE");
                  int position=rs.getInt("ORDINAL_POSITION");
                  unique=!unique;
                  //log.writeDebug("Iname="+iname+" Cname="+cname+" unique="+
                  //             unique+" pos="+position);
                  if (iname == null) {
                     log.writeDebug("Null index name.");
                  }
                  else {
                     // for Access driver
                     if (guessKeys &&
                         iname.equalsIgnoreCase("primarykey")) {
                        keys.addElement(cname);
                     }
                     table.addIndex(iname, cname, type);
                     
                     if (unique) {
                        SQLColumn col=table.getColumn(cname);
                        if (col != null)
                           col.setUnique(unique);
                        else {
                           // log a message here.
                           log.writeDebug("Null column "+cname+" in table "+
                                          table.getName()+
                                          " while setting unique.");
                        }
                     }
                  }
                  more=rs.next();
               }
               catch (SQLException ex) {
                  // I was alerted by justin@blowouts.co.uk that 
                  // the mysql odbc driver version myodbc-2.50.37-nt.zip
                  // was throwing a SQLException on 
                  // getInt("ORDINAL_POSITION")... Fuck that.  The driver
                  // writer sux.  But I'll deal w/ it here and the
                  // SQLTable won't have index information.
                  // PAB, 08/15/01
                  log.writeError(1, "SchemaUtil: Error retrieving index "+
                                 "information.", ex);
                  more=false;
               }
            }
            table.setPrimaryKeys(keys);

            log.writeDebug("Indices: "+indices);
            // table.setPrimaryKeys(keys);
         }
         
         // Get foreign keys
         try {
            String tname=null;
            // if (shortStringToMetaData)
            if (thisDatabaseProps.getBoolean("shortNameToMetaData", false))
               tname=shortName;
            else
               tname=tableName;

            log.writeDebug("Getting exported keys for "+tname);
            rs=dbmd.getExportedKeys(catalog, schema, tname);
            log.writeDebug("Got exported keys.");
         }
         catch (Exception ex) {
            log.writeDebug("Unable to getExportedKeys from DatabaseMetaData.  "+
                         "Your driver may not support this feature.");
            log.writeDebug(ex.toString());
            // log.printStackTrace(ex);
            rs=null;
         }
         if (rs != null)
         {
            boolean more=rs.next();
            while (more)
            {
               String primaryTable=rs.getString("PKTABLE_NAME");
               String primaryCol=rs.getString("PKCOLUMN_NAME");
               String foreignTable=rs.getString("FKTABLE_NAME");
               String foreignCol=rs.getString("FKCOLUMN_NAME");
               
               log.writeDebug("Table "+table);
               log.writeDebug("  PK: "+primaryTable+"."+primaryCol);
               log.writeDebug("  FK: "+foreignTable+"."+foreignCol);
               
               more=rs.next();
            }
         }
      }
      finally
      {
         try {if (rs != null) rs.close();}
         catch (Exception ex) {}
         try {if (state != null) state.close();}
         catch (Exception es) {}
      }
      
      if (table != null)
         sqlTables.put(tableName, table);
      return table;
   }
}
