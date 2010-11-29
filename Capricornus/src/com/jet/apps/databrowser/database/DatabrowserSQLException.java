package com.jet.apps.databrowser.database;

import java.sql.SQLException;

/**
 *
 */
public class DatabrowserSQLException extends SQLException 
{
   /** */
   public DatabrowserSQLException(String s) {super(s);}

   /** */
   //public DatabrowserSQLException(String s, Throwable t) {super(s, t);}
}