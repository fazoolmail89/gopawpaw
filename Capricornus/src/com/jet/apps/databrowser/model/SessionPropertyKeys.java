package com.jet.apps.databrowser.model;


/*
 * $Log: SessionPropertyKeys.java,v $
 * Revision 1.3  2007/02/15 11:36:09  bemocvs
 * Fixes for oracle number types.
 *
 * Revision 1.2  2005/01/19 21:09:08  bemocvs
 * changes for 3.3.1
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.4  2002/05/21 20:57:45  bemocvs
 * 3.0.5
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
 * This is a set of static final declarations of 'special' keys
 * within the global properties object.
 *
 * @author J Enterprise Technologies
 */
public interface SessionPropertyKeys {

   /** */
   public static final String DEBUG_LEVEL="debugLevel";
   
   /** Key for sql bookmarks. */
   public static final String SQL_BOOKMARKS="savedSQL";

   /** */
   public static final String RECENT_FILES_VECTOR="files";

   /** */
   public static final String RECENT_FILES="recent_files";

   /** */
   public static final String MAX_RECENT_FILES="max_recent_files";

   /** Key for recent connection properties */
   public static final String RECENT_CONNECTIONS="recent";

   /** */
   public static final String TNS_FILE_KEY="tnsNamesFile";

   /** */
   public static final String MAX_RESULTS="maxResults";

   /** */
   public static final String SHOW_CONSOLE_ON_STARTUP="showConsoleOnStartup";

   /** */
   public static final String WINDOW_HISTORY="windowHistory";

   /** */
   public static final String JEDIT_CONFIG="jedit";

   /** */
   public static final String DATA_PROPS="dataProps";
}



