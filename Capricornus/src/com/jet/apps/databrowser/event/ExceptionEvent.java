package com.jet.apps.databrowser.event;

import java.sql.SQLException;

/*
 * $Log: ExceptionEvent.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 */

/**
 *
 * @author Paul Bemowski
 */
public class ExceptionEvent extends DBEvent {
   String message=null;

   /** */
   public ExceptionEvent(int code, Throwable ex, String sql) {
      super(code, ex);
      this.message=message;
   }

   /** */
   public Throwable getException() {
      return (Throwable)data;
   }

   /** */
   public String getMessage() {
      return message;
   }

   /** */
   public String toString() {
      return "ExceptionEvent["+code+"] "+data;
   }
}
