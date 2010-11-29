package com.jet.utils.ui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import java.util.*;
import java.sql.*;


import com.jet.utils.ui.*;

/*
 * $Log: SQLExceptionDebugger.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2001/10/09 11:36:58  bemocvs
 * moved from jdbcbrowser/ui
 *
 */

/**
 * Generic connection frame.  This should work for ANY jdbc driver,
 * it graphically encapsulates all data necessary to connect to 
 * a database.
 *
 * @author Paul Bemowski
 */
public class SQLExceptionDebugger extends JDialog
{
   private JTextField state, errorCode;
   private JTextArea message;
   
   private JButton nextButton=null;
   private SQLException mException=null;

   private Frame parent=null;

   /** */
   private SQLExceptionDebugger(Dialog d, String sql) {
      super (d, true);
      layout(sql);
   }
   

   /** */
   private SQLExceptionDebugger(Frame p, String sql) {
      super (p, true);
      layout(sql);
   }

   private void layout (String sql) 
   {
      // parent=p;
      if (sql == null)
         setSize(320, 180);
      else
         setSize(360, 240);

      setLocation (WinUtil.alignCenter(this));
      setTitle ("SQL Exception Info");

      getContentPane().setLayout(new BorderLayout());

      // Initialize the fields
      state=new JTextField(40);
      errorCode=new JTextField(40);
      state.setEditable(false);
      errorCode.setEditable(false);
    
      JPanel northPanel=new JPanel(new BorderLayout());
      
      JPanel labels=new JPanel(new GridLayout(2, 1));
      labels.add(new JLabel("State:"));
      labels.add(new JLabel("Error Code:  "));

      northPanel.add(labels, "West");
                 
      JPanel fields=new JPanel(new GridLayout(2, 1));
      fields.add(state);
      fields.add(errorCode);

      northPanel.add(fields, "Center");

      JPanel centerPanel=new JPanel(new BorderLayout());
      
      message=new JTextArea();
      message.setEditable(false);
      message.setWrapStyleWord(true);
      message.setLineWrap(true);
      
      JScrollPane msp=new JScrollPane(message);
      
      if (sql != null) {
         JTextArea sa=new JTextArea();
         sa.setEditable(false);
         sa.setWrapStyleWord(true);
         sa.setLineWrap(true);
         sa.setText(sql);
         JScrollPane ssp=new JScrollPane(sa);
         centerPanel.add(msp, "North");
         centerPanel.add(ssp, "Center");
      }
      else {
         centerPanel.add(msp, "Center");
      }

      getContentPane().add(centerPanel, "Center");
      getContentPane().add(northPanel, "North");
    
      JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));

      nextButton=new JButton("View Next Exception");
      nextButton.setActionCommand("nextButton");
      southPanel.add (nextButton);

      JButton closeButton=new JButton("Close");
      closeButton.setActionCommand("closeButton");
      closeButton.requestFocus();
      southPanel.add (closeButton);


      getContentPane().add (southPanel, "South");

      //pack();
      // setup action handlers
      ActionHandler ah=new ActionHandler();
      closeButton.addActionListener(ah);
      nextButton.addActionListener(ah);
   }

   /**
    *
    */
   public static void debug(Frame parent, SQLException ex, String sql)
   {
      SQLExceptionDebugger diag=new SQLExceptionDebugger(parent, sql);
      diag.mException = ex;

      diag.state.setText(ex.getSQLState());
      diag.errorCode.setText(""+ex.getErrorCode());
      diag.message.setText(ex.getMessage());
      diag.nextButton.setEnabled(ex.getNextException() != null);
      Toolkit.getDefaultToolkit().beep();
      diag.show();
   }

   /** */
   public static void debug(Dialog parent, SQLException ex, String sql) {      
      SQLExceptionDebugger diag=new SQLExceptionDebugger(parent, sql);
      diag.mException = ex;

      diag.state.setText(ex.getSQLState());
      diag.errorCode.setText(""+ex.getErrorCode());
      diag.message.setText(ex.getMessage());
      diag.nextButton.setEnabled(ex.getNextException() != null);
      Toolkit.getDefaultToolkit().beep();
      diag.show();
   }

   /** */
   public static void debug(Frame parent, SQLException ex) {
      debug (parent, ex, null);
   }

   /**
    *
    */
   public static void debug(Component c, SQLException ex)
   {
      debug(WinUtil.findParentFrame(c), ex);
   }


   /**
    *
    */
   class ActionHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String action=e.getActionCommand();
         if (action.equals("closeButton"))
            closeButtonHandler();
         else if (action.equals("nextButton"))
         {
            nextButtonHandler();
         }
      }
   }

   private void closeButtonHandler()
   {
      dispose();
   }

   private void nextButtonHandler()
   {
      debug(this, mException.getNextException());
   }
}


