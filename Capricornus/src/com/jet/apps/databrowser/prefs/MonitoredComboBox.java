package com.jet.apps.databrowser.prefs;

import java.util.Vector;

import javax.swing.*;

/*
 * $Log: MonitoredComboBox.java,v $
 * Revision 1.1  2003/02/20 22:53:23  bemocvs
 * Added blob w/ encoding support.
 *
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
public class MonitoredComboBox extends JComboBox
{
   String initialValue=null;

   public MonitoredComboBox() {super();}
   public MonitoredComboBox(Vector v) {super(v);}

   public void setInitialValue(String s) {
      initialValue=s;
      // this.setText(s);
   }

   public boolean isUpdated() {
     String current=this.getSelectedItem().toString();
     if (current != null &&
         initialValue != null && 
         initialValue.equals(current))
         return false;
      else
         return true;
   }
}

