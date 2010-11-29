package com.jet.apps.databrowser.database;

/*
 * $Log: SQLProcessListener.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 *
 */
public interface SQLProcessListener {
   public void sqlFinished(boolean success);
   public void sqlFinished(boolean success, int rows);
}
