package com.jet.apps.databrowser.event;

/*
 * $Log: DBEvents.java,v $
 * Revision 1.2  2003/08/21 16:30:37  bemocvs
 * autocommit, sql editing
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.4  2002/05/04 18:50:03  bemocvs
 * Working
 *
 * Revision 1.3  2002/05/02 00:22:57  bemocvs
 * 3.0.1
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
 */
public interface DBEvents {
   public static final int BUSY_EVENT=0;   
   public static final int DONE_EVENT=1;

   public static final int STATUS_STRING_CHANGE=2;
   
   public static final int TREE_RELOAD=3;
   public static final int TREE_COMBO_RELOAD=4;

   public static final int SQL_STARTED=5;   
   public static final int SQL_FINISHED=6;

   public static final int DATABASE_CONNECT=7;
   public static final int DATABASE_DISCONNECT=8;

   public static final int NEW_RESULTS=20;
   public static final int REMOVE_RESULTS=21;
   public static final int UPDATE_HEADERS=22;
   public static final int QUERY_TIME_UPDATE=23;
   public static final int QUERY_STATUS_UPDATE=24;
   public static final int QUERY_STARTED=25;
   public static final int QUERY_FINISHED=26;
   
   public static final int UPDATE_COMPLETE=30;

   public static final int CONNECTION_STATE=40;

   public static final int FILE_OPEN=50;
   public static final int FILE_CLOSED=51;

   public static final int EXCEPTION=100;
   public static final int SQL_EXCEPTION=110;
}
