package com.jet.apps.databrowser.connector;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.jet.log.Logger;

import com.jet.utils.ui.*;
import com.jet.utils.properties.*;

/**
 * The data keys for this window are:
 * 
 * com.jet.conninfo.advanced.INITIAL_SCHEMA
 * com.jet.conninfo.advanced.INITIAL_CATALOG
 * com.jet.conninfo.advanced.INITIAL_TYPE
 * com.jet.conninfo.advanced.LOAD_TREE_VIEW
 * 
 *
 * @author Paul Bemowski
 */
class Advanced extends JDialog
   implements Logger, ActionListener, AdvancedConnectionProperties
{
   private boolean ok=false;

   private EProperties props=null;

   private PopupTextField schema, catalog, type;
   private JCheckBox loadTreeView;


   /**
    *
    */
   public Advanced(Component parent, EProperties p)
   {
      super(WinUtil.findParentFrame(parent), true);

      props=p;

      if (props == null)
         props=new EProperties();
      setTitle("Advanced Connection Info");
      setSize(300, 160);
      setLocation(WinUtil.alignCenter(this));
      getContentPane().setLayout(new BorderLayout());

      JPanel centerPanel=new JPanel(new BorderLayout());
      JPanel centerLeftPanel=new JPanel(new GridLayout(4, 1));
      JPanel centerCenterPanel=new JPanel(new GridLayout(4, 1));
      
      centerLeftPanel.add(new JLabel("Schema:"));
      centerLeftPanel.add(new JLabel("Catalog:"));
      centerLeftPanel.add(new JLabel("Type:"));
      centerLeftPanel.add(new JLabel(""));

      schema=new PopupTextField();
      catalog=new PopupTextField();
      type=new PopupTextField();

      loadTreeView=new JCheckBox("Load TreeVeiw on connect");

      // Initialize window
      String temp=null;

      temp=props.getProperty(SCHEMA_KEY);
      if (temp != null)
         schema.setText(temp);
      temp=props.getProperty(CATALOG_KEY);
      if (temp != null)
         catalog.setText(temp);
      temp=props.getProperty(TYPE_KEY);
      if (temp != null)
         type.setText(temp);
      
      boolean b=props.getBoolean(LOAD_TREE_KEY,true);
      
      loadTreeView.setSelected(b);

      centerCenterPanel.add(schema);
      centerCenterPanel.add(catalog);
      centerCenterPanel.add(type);
      centerCenterPanel.add(loadTreeView);

      centerPanel.add(centerLeftPanel, "West");
      centerPanel.add(centerCenterPanel, "Center");
      // centerPanel.add(loadTreeView, "South");
      
      getContentPane().add(centerPanel, "Center");
      
      JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JButton okButton=new JButton("OK");
      okButton.setActionCommand("ok");
      okButton.addActionListener(this);
      buttonPanel.add(okButton);
      JButton cancelButton=new JButton("Cancel");
      cancelButton.setActionCommand("cancel");
      cancelButton.addActionListener(this);
      buttonPanel.add(cancelButton);

      getContentPane().add(buttonPanel, "South");
   }
   
   /**
    *
    */
   public static EProperties getAdvancedProperties(Component parent,
                                                   EProperties initialProps)
   {
      Advanced adv=new Advanced(parent, initialProps);

      adv.show();
      if (adv.ok)
         return adv.props;
      else
         return null;
   }

   

   public void actionPerformed(ActionEvent ae)
   {
      String action=ae.getActionCommand();
      if (action.equals("ok"))
      {
         okHandler();
      }
      else if (action.equals("cancel"))
      {
         this.dispose();
      }
   }

   /**
    *
    */
   private void okHandler()
   {
      String temp=null; 

      temp=schema.getText().trim();
      props.put(SCHEMA_KEY, temp);
      
      temp=catalog.getText().trim();
      props.put(CATALOG_KEY, temp);

      temp=type.getText().trim();
      props.put(TYPE_KEY, temp);

      boolean b=loadTreeView.isSelected();
      props.put(LOAD_TREE_KEY, (b?"true":"false"));
      
      ok=true;
      this.dispose();
   }

   private boolean empty(String s)
   {
      if (s == null || s.length() == 0)
         return true;
      else 
         return false;
   }
}




