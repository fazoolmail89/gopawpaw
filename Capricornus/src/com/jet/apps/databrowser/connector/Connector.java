package com.jet.apps.databrowser.connector;

import com.jet.apps.databrowser.database.ConnectionInfo;

/**
 * This is the interface that must be implemented to become a connector
 * that can be integrated into the database browser gui.
 *
 * @author Paul Bemowski
 */
public interface Connector
{
   /**
    * @return A ConnectionInfo object with the necessary information to 
    * connect to a JDBC database.
    */
   public ConnectionInfo getConnectionInfo();
}
