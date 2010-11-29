package com.jet.apps.sqlminus;

import java.sql.*;

import java.util.*;

import com.jet.database.DBUtils;

/**
 * Represents a SQLMinus database session.
 */
public class DBSession implements DBSessionKeys
{
   String driver=null;
   String url=null;
   String user=null;
   String pass=null;

   Connection con=null;

   /** Properties */
   private HashMap props=new HashMap();

   /** */
   public DBSession(String driver, String url, String user, String pass) {
      this.driver=driver;

      this.url=url;
      this.user=user;
      this.pass=pass;
   }

   /** */
   public void open() 
      throws Exception {
      Class.forName(driver);
      con=DriverManager.getConnection(url, user, pass);

      System.out.println ("Connected to "+url+" as "+user);
   }

   /** */
   public void set(String key, String value) {
      props.put(key, value);
      System.out.println ("'"+key+"' set to '"+value+"'");
   }

   /** */
   public String get(String key) {
      return (String)props.get(key);
   }

   /** */
   public String get(String key, String def) {
      String s=(String)props.get(key);
      if (s == null)
         return def;
      return s;
   }
   
   /** */
   public HashMap getProperties() {return props;}

   /** */
   public void unset(String key) {
      props.remove(key);
   }

   /** */
   public ArrayList executeSQL(String sql) 
      throws Exception {
      Statement state=null;
      ResultSet rs=null;

      ArrayList list=null;
      try {
         state=con.createStatement();
         boolean results=state.execute(sql);

         if (results) {
            rs=state.getResultSet();
            ArrayList headers=DBUtils.getHeaders(rs);
            ArrayList data=DBUtils.getRows(rs, 400, false, 10, "US-ASCII");
            
            data.add(0, headers);

            return data;
         } else {
            System.out.println ("SQL modified "+state.getUpdateCount()+
                                " rows.");
            return null;
         }
      } finally {
         if (rs != null) 
            try {rs.close();}catch (Exception ex) {}
         if (state != null) 
            try {state.close();} catch (Exception ex) {}
      }
   }

   /** */
   public ArrayList describe(String tableName) 
      throws Exception {
      DatabaseMetaData dbmd=null;
      ResultSet rs=null;

      try {
         dbmd=con.getMetaData();

         String cat=(String)props.get("catalog");
         String sch=(String)props.get("schema");
         if (sch == null)
            sch="";
         else 
            sch=sch.toUpperCase();

         String col=null;

         tableName=tableName.toUpperCase();

         System.out.println ("Getting table description: cat="+cat+
                             " sch="+sch+" table="+tableName+" col="+col);
         rs=dbmd.getColumns(cat, sch, tableName, col);

         ArrayList tableData=new ArrayList();

         ArrayList header=new ArrayList();
         header.add("Column"); 
         header.add("Type"); 
         header.add("Size");
         header.add("Nullable");

         tableData.add(header);

         boolean more=rs.next();
         while (more) {
            // System.out.println ("xx");
            ArrayList row=new ArrayList();
            row.add(rs.getString("column_name"));
            row.add(rs.getString("type_name"));
            row.add(""+rs.getInt("column_size"));
            row.add(rs.getString("nullable"));
            tableData.add(row);
            more=rs.next();
         }

         return tableData;
      } finally {
         if (rs !=null)
            try {rs.close();} catch (Exception ex) {}
      }
   }

   /** */
   public ArrayList getTables(String pattern) 
      throws Exception {
      DatabaseMetaData dbmd=null;
      ResultSet rs=null;

      try {
         dbmd=con.getMetaData();

         String cat=(String)props.get("catalog");
         String sch=(String)props.get("schema");
         if (sch != null)
            sch=sch.toUpperCase();


         System.out.println ("Getting tables: cat="+cat+
                             " sch="+sch);
         rs=dbmd.getTables(cat, sch, pattern, null);

         ArrayList tableData=new ArrayList();

         ArrayList header=new ArrayList();
         header.add("Name"); 
         header.add("Type"); 
         header.add("Schema");
         header.add("Catalog");

         tableData.add(header);

         boolean more=rs.next();
         while (more) {
            ArrayList row=new ArrayList();
            row.add(rs.getString("table_name"));
            row.add(rs.getString("table_type"));
            row.add(rs.getString("table_schem"));
            row.add(rs.getString("table_cat"));
            tableData.add(row);
            more=rs.next();
         }

         return tableData;
      } finally {
         if (rs !=null)
            try {rs.close();} catch (Exception ex) {}
      }      
   }
}
