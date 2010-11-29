package com.jet.apps.databrowser.database;

import java.sql.*;

/*
 * $Log: SQLProcess.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/05/21 20:57:45  bemocvs
 * 3.0.5
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.2  2001/07/31 00:37:16  bemocvs
 * added non-functional kill method
 *
 */

/**
 *
 * @author Paul Bemowski
 */
public interface SQLProcess
{
   public void stopSql()
      throws SQLException;
   
   public void killSql()
      throws SecurityException;

   public boolean isRunning();
}


