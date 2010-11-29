package com.jet.apps.databrowser.prefs;

import javax.swing.*;

/*
 * $Log: MonitoredPasswordField.java,v $
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
 * A Password field that knows if it's value has changed.
 */
public class MonitoredPasswordField extends JPasswordField
{
   String initialValue="";
   public MonitoredPasswordField(int i) {
      super(i);
   }

   public void setInitialText(String s) {
      if (s == null) s="";
      initialValue=s;
      setText(s);
   }

   public boolean isUpdated() {
      if (initialValue.equals(getText()))
         return false;
      else
         return true;
   }
}
