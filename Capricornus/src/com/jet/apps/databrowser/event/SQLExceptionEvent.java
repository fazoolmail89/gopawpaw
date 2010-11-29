package com.jet.apps.databrowser.event;

import java.sql.SQLException;

/*
 * $Log: SQLExceptionEvent.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 *
 * @author Paul Bemowski
 */
public class SQLExceptionEvent extends DBEvent {
   String sql=null;

   /** */
   public SQLExceptionEvent(int code, SQLException ex, String sql) {
      super(code, ex);
      this.sql=sql;
   }

   /** */
   public SQLException getSQLException() {
      return (SQLException)data;
   }

   /** */
   public String getSql() {
      return sql;
   }

   /** */
   public String toString() {
      return "SQLExceptionEvent["+code+"] "+data;
   }
}
