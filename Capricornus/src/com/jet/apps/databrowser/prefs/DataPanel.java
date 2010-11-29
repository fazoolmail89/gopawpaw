package com.jet.apps.databrowser.prefs;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;
import java.io.*;

import com.jet.utils.properties.*;
import com.jet.utils.filesystem.*;
import com.jet.net.mail.*;
import com.jet.utils.exception.ValidationException;
import com.jet.utils.*;
import com.jet.utils.ui.*;

import com.jet.core.*;

import com.jet.log.Logger;

// import com.jet.apps.databrowser.ui.JEditConfig;

import com.jet.apps.databrowser.model.SessionPropertyKeys;

/*
 * $Log: DataPanel.java,v $
 * Revision 1.4  2006/08/11 21:27:23  bemocvs
 * formatting fixes
 *
 * Revision 1.3  2006/08/11 16:52:47  bemocvs
 * *** empty log message ***
 *
 * Revision 1.2  2003/02/20 22:53:23  bemocvs
 * Added blob w/ encoding support.
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/22 19:28:40  bemocvs
 * added for 3.0.5
 *
 */

/**
 *
 */
class DataPanel extends JPanel
   implements PreferencePanel, Logger, SessionPropertyKeys, ActionListener
{
   MonitoredCheckBox retrieveLobs=null;
   MonitoredTextField maxLobSize=null;

   MonitoredComboBox blobEncoding=null;

   MonitoredTextField absMaxRows=null;
   
   EProperties mProps=null;
   EProperties dataProps=null;
  
   static Vector charEncodings=new Vector();
   static {
      charEncodings.add("US-ASCII");
      charEncodings.add("ISO-8859-1");
      charEncodings.add("UTF-8");
      charEncodings.add("UTF-16BE");
      charEncodings.add("UTF-16LE");
      charEncodings.add("UTF-16");
   }

   /** */
   public DataPanel(EProperties p)
   {
      setLayout(new BorderLayout());
      mProps=p;

      dataProps=mProps.getProperties(DATA_PROPS);
      if (dataProps == null) {
         dataProps=new EProperties();
         mProps.put(DATA_PROPS, dataProps);
      }

      blobEncoding=new MonitoredComboBox(charEncodings);
      blobEncoding.setInitialValue(dataProps.getProperty("blobEncoding", 
                                                         "US-ASCII"));
      if (dataProps.getProperty("blobEncoding") != null)
         blobEncoding.setSelectedItem(dataProps.getProperty("blobEncoding"));


      retrieveLobs=new MonitoredCheckBox("Retrieve Large Objects");
      retrieveLobs.setInitialValue(dataProps.getBoolean("retrieveLobs", 
                                                        false)); 
      retrieveLobs.addActionListener(this);
      
      maxLobSize=new MonitoredTextField(8, 1);
      maxLobSize.setInitialText(""+dataProps.getInt("maxLobSize", -1));
      
      actionPerformed(null);

      absMaxRows=new MonitoredTextField(8, 1);
      absMaxRows.setInitialText(""+dataProps.getInt("absMaxRows", -1));


      JPanel centerPanel=new JPanel(new GridBagLayout());

      GridBagConstraints c=new GridBagConstraints();

      c.ipadx=c.ipady=2; c.insets=new Insets(6,6,6,6);
      c.gridx=c.gridy=0; c.anchor=c.NORTHWEST;
      c.gridy=c.RELATIVE;

      c.fill=c.HORIZONTAL;
      c.gridx=1; c.gridy=0; c.weightx=1; 
      c.gridy=c.RELATIVE;

      c.gridx=0; c.gridwidth=2; c.gridy=0;
      centerPanel.add(retrieveLobs, c);

      c.gridx=0; c.gridy=1;

      JPanel temp=new JPanel(new FlowLayout(FlowLayout.LEFT));
      temp.add(new JLabel("Max LOB Size"));
      temp.add(maxLobSize);
      centerPanel.add(temp, c);

      c.gridx=0; c.gridy=2; 
      temp=new JPanel(new FlowLayout(FlowLayout.LEFT));
      temp.add(new JLabel("Absolute Max Rows"));
      temp.add(absMaxRows);
      centerPanel.add(temp, c);
         
      c.gridx=0; c.gridy=3; 
      temp=new JPanel(new FlowLayout(FlowLayout.LEFT));
      temp.add(new JLabel("Character Encoding"));
      temp.add(blobEncoding);
      centerPanel.add(temp, c);


      this.add(centerPanel, "North");
   }

   /**
    *
    */
   public boolean validateData()
      throws ValidationException {

      return true;
   }

   public boolean save()
   {
      if (retrieveLobs.isUpdated()) {
         dataProps.putBoolean("retrieveLobs", retrieveLobs.isSelected());
         retrieveLobs.setInitialValue(retrieveLobs.isSelected());
      }
      if (maxLobSize.isUpdated()) {
         dataProps.put("maxLobSize", maxLobSize.getText());
         maxLobSize.setInitialText(maxLobSize.getText());
      }
      if (absMaxRows.isUpdated()) {
         dataProps.put("absMaxRows", absMaxRows.getText());
         absMaxRows.setInitialText(absMaxRows.getText());
      }
      if (blobEncoding.isUpdated()) {
         dataProps.put("blobEncoding", blobEncoding.getSelectedItem().toString());
         blobEncoding.setInitialValue(blobEncoding.getSelectedItem().toString());
      }

      return true;
   }
   
   public void actionPerformed(ActionEvent ae) {
      if (retrieveLobs.isSelected())
         maxLobSize.setEnabled(true);
      else
         maxLobSize.setEnabled(false);
   }
}


