package com.jet.apps.databrowser.prefs;

import javax.swing.*;

/*
 * $Log: MonitoredCheckBox.java,v $
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
 * A check box that knows if it's initial value has changed.
 */
public class MonitoredCheckBox extends JCheckBox
{
   boolean initialValue=false;

   public MonitoredCheckBox() {super();}
   public MonitoredCheckBox(String s) {super(s);}

   public void setInitialValue(boolean b) {
      initialValue=b;
      this.setSelected(b);
   }

   public boolean isUpdated() {
      if (this.isSelected() && initialValue ||
          !this.isSelected() && !initialValue)
         return false;
      else
         return true;
   }
}

