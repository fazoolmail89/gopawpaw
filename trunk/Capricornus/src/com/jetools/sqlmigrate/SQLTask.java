package com.jetools.sqlmigrate;

import java.util.*;
import java.sql.*;

import java.text.*;
import com.jet.utils.ClassUtil;

/** */
public class SQLTask implements Task
{
   /** Signals that this SQL should be executed against the source
    * database. */
   public static final int SOURCE=0;
   
   /** Signals that this SQL should be executed against the dest
    * database. */
   public static final int DEST=1;

   /** The raw inbound sql, not parsed into statements. */
   String rawSQL=null;

   /** A list of statements, suitable for sending to the database. */
   ArrayList statements=null;

   /** */
   int targetDB=-1;

   public String toString() {
      return 
      ClassUtil.shortClassName(this)+"[target: "+targetString(targetDB)+"]\n"+
      rawSQL;
   }

   public static final String targetString(int i) {
      switch(i) {
         case SOURCE: return "SOURCE";
         case DEST: return "DEST";
         default: return "UNKNOWN";
      }
   }

   /** */
   public SQLTask(String s) {
      this(s, DEST);
   }

   /** */
   public SQLTask(String s, int t) {
      rawSQL=s;
      targetDB=t;
      parseStatements();
   }

   /** */
   protected void parseStatements() {
      // here we need to parse a (potenitally) long series of 
      // sql statements, delimited by ';' into a list of statements
      // suitable for execution individually on the database. 
      
      // FIXME: Quoted semicolons will not fly
      StringTokenizer st=new StringTokenizer(rawSQL, ";", false);
      statements=new ArrayList();
      while (st.hasMoreElements()) {
         statements.add(st.nextToken());
      }
      System.out.println ("SQLTask: parsed out "+statements.size()+
                          " statements.");
   }

   /** */
   public void execute(DatabaseConnection source, 
                       DatabaseConnection dest) 
      throws SQLException {

      Connection con=null;
      Statement statement=null;

      if (targetDB == SOURCE) {
         con=source.getConnection();
      } else if (targetDB == DEST) {
         con=dest.getConnection();
      } else {
         throw new RuntimeException("Target DB '"+targetDB+"' out of range.");
      }      

      try {
         con.setAutoCommit(true);

         statement=con.createStatement();

         for (int i=0; i<statements.size(); i++) {
            String sql=(String)statements.get(i);

            System.out.println ("Executing SQL: \n"+sql);

            int rows=statement.executeUpdate(sql);

            System.out.println ("done.");
         }
      }
      finally {
         if (statement != null)
            try {statement.close();} catch (Exception ex) {}
         if (con != null)
            con.close();
      }
   }
}
