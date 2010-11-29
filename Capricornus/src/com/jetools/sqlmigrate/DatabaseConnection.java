package com.jetools.sqlmigrate;

import java.sql.*;

/**
 *
 */
public class DatabaseConnection
{
   String driver=null;
   String url=null;
   String user=null;
   String pass=null;

   public DatabaseConnection(String d, String u, String us, String p) {
      driver=d;
      url=u;
      user=us;
      pass=p;
   }

   public Connection getConnection() 
      throws SQLException {
      System.out.print ("Connecting to "+url+"...");
      try {
         Class.forName(driver);
      } catch (ClassNotFoundException ex) {
         throw new SQLException("Cannot find driver class '"+driver+"'");
      }
      System.out.println (" done.");
      return DriverManager.getConnection(url, user, pass);
   }

   public String toString() {
      return "Connection{"+user+" at "+url+" with "+driver+"}";
   }
}
