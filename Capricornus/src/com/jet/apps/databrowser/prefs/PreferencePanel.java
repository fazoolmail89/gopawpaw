package com.jet.apps.databrowser.prefs;

import com.jet.utils.exception.ValidationException;

/*
 * $Log: PreferencePanel.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.1  2001/09/14 00:24:24  bemocvs
 * initial checkin.
 *
 */

/**
 *
 */
public interface PreferencePanel
{
   /**
    * In the future, make this throw a ValidationException, and create
    * a validation exception dialog, that tells the user what is 
    * invalid.  Use the multiple validation exeption nesting similar
    * to HD.
    */
   public boolean validateData() throws ValidationException;
      
   /**
    */
   public boolean save();
}
