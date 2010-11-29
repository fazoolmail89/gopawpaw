package com.jet.apps.databrowser.event;

/*
 * $Log: DBEvent.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 *
 * @author Paul Bemowski
 */
public class DBEvent implements DBEvents {

   /** */
   protected int code=-1;
   /** */
   protected Object data=null;

   /** */
   public DBEvent(int code, Object data) {
      this.code=code;
      this.data=data;
   }

   /** */
   public DBEvent (int code) {
      this(code, null);
   }

   /** */
   public int getCode() {return code;}

   /** */
   public Object getData() {return data;}

   /** */
   public void setData(Object d) {
      data=d;
   }
   
   /** */
   public String toString() {
      return "DBEvent["+code+"] "+data;
   }
}
