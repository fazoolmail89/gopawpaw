package com.jet.apps.databrowser.ui.editor;

import com.jet.database.SQLTypes;

/**
 * A set of constants used for the DataEditor.
 *
 * @author Paul Bemowski
 */
public interface DataEditorConstants extends SQLTypes
{
   /** Unknown int constant. */
   public static final int UNKNOWN=-1;

   /** Insert mode. */
   public static final int INSERT=1;
   
   /** Update mode. */
   public static final int UPDATE=2;

   // primary key modes
   static final int PK_MANUAL=1;
   static final int PK_NONE=2;
   static final int PK_MAXPLUS1=3;
   static final int PK_GUID=4;
}