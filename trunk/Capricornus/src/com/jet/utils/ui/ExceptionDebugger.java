package com.jet.utils.ui;

/*
 * $Log: ExceptionDebugger.java,v $
 * Revision 1.6  2006/12/18 03:22:05  bemocvs
 * *** empty log message ***
 *
 * Revision 1.5  2006/12/05 00:29:42  bemocvs
 * Added JDialog function.
 *
 * Revision 1.4  2004/08/30 13:57:13  buildcvs
 * Added constructor
 *
 * Revision 1.3  2004/08/27 19:54:43  bemocvs
 * Prevent NPE's on null throwable.  constructors.
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.border.*;


/**
 * Swing UI component for showing users nice views of exceptions.
 *
 * @author Paul Bemowski
 */
public class ExceptionDebugger extends JDialog implements ActionListener
{
   static final int MAX_WIDTH=500;

   static final String DETAIL="detail";
   static final String NEXT="next";
   static final String CLOSE="close";

   protected Throwable throwable;
   protected String message=null;

   protected JFrame parentFrame=null;

   protected JDialog parentDialog=null;

   /** The scroll pane containing the stack trace, which may be shown
    * and hidden. */
   protected JScrollPane stackSP=null;

   protected JButton detailButton=null;

   /** State boolean indicating whether detail is currently visible. */
   protected boolean detailShowing=true;

   /** 
    * Swing error dialog.
    *
    * @param parent A swing component.  This component will search
    *               up the object tree to find the JComponent's owning
    *               JFrame and use that as the parent for this dialog.
    *               Can be null - in which case the dailog will not be modal.
    * @param message A user definable message to be displayed to the user.
    *                This can be null.
    * @param t A throwable.  This component works with all java excpetional
    *          conditions -- Errors, Exceptions, RuntimeExceptions, etc.
    * @param showDetail A boolean indicating whether the default view
    *                   shows or hides the detail.
    */
   public static void debug(JComponent parent, String message, Throwable t,
                            boolean showDetail) {
      JFrame p=WinUtil.findParentJFrame(parent);
      ExceptionDebugger dlg = new ExceptionDebugger(p, message, t, showDetail);
      dlg.show();
   }

   /** 
    * Swing error dialog.
    *
    * @param parent A swing component.  This component will search
    *               up the object tree to find the JComponent's owning
    *               JFrame and use that as the parent for this dialog.
    *               Can be null - in which case the dailog will not be modal.
    * @param message A user definable message to be displayed to the user.
    *                This can be null.
    * @param t A throwable.  This component works with all java excpetional
    *          conditions -- Errors, Exceptions, RuntimeExceptions, etc.
    * @param showDetail A boolean indicating whether the default view
    *                   shows or hides the detail.
    */
   public static void debug(JFrame parent, String message, Throwable t,
                            boolean showDetail) {
      ExceptionDebugger dlg = new ExceptionDebugger(parent, message, t, showDetail);
      dlg.show();
   }

   /** */
   public static void debug(JDialog parent, String message, Throwable t,
                            boolean showDetail) {
      ExceptionDebugger dlg = 
      new ExceptionDebugger(parent, message, t, showDetail);

      dlg.show();
   }

   /** */
   public static void debug(JDialog parent, String message, Throwable t) {
      debug(parent, message, t, false);
   }

   /** */
   public static void debug(JFrame parent, String message, Throwable t) {
      debug(parent, message, t, false);
   }

   /** */
   protected ExceptionDebugger(JFrame p, String m, Throwable t, boolean sd) {
      super(p,"Exception Caught", true);
      parentFrame=p;
      throwable=t;
      message=m;

      detailShowing=sd;
      layout(sd);
   }

   /** */
   protected ExceptionDebugger(JDialog p, String m, Throwable t, boolean sd) {
      super(p,"Exception Caught", true);
      parentDialog=p;
      throwable=t;
      message=m;

      detailShowing=sd;
      layout(sd);
   }

   public static void debug(String message, Throwable t) {
      debug((JFrame)null, message, t, false);
   }

   public static void debug(Throwable t) {
      debug((JFrame)null, null, t, false);
   }

   public static void debug(JComponent c, String m, Throwable t) {
      debug(c, m, t, false);
   }

   public static void debug(JFrame f, Throwable t) {
      debug(f, null, t, false);
   }

   /** */ 
   protected void layout(boolean detail) {
      getContentPane().setLayout(new BorderLayout(5, 5));

      JPanel northPanel=new JPanel(new BorderLayout(5, 5));
      JPanel messagePanel=new JPanel();
      
      // display components
      JTextField exClassField=new JTextField();
      exClassField.setEditable(false);
      if (throwable != null) 
         exClassField.setText(throwable.getClass().getName());

      JTextArea userMessage=new JTextArea();
      JTextArea exMessage=new JTextArea();
      userMessage.setRows(2); userMessage.setEditable(false);
      exMessage.setRows(2);   exMessage.setEditable(false);
      JScrollPane userMessageSP=new JScrollPane(userMessage);
      JScrollPane exMessageSP=new JScrollPane(exMessage);

      // may or may not have a user message
      if (message != null) {
         messagePanel.setLayout(new GridLayout(2, 1));
         messagePanel.add(userMessageSP);
         messagePanel.add(exMessageSP);
         userMessage.setText(message);
      } else {
         messagePanel.setLayout(new GridLayout(1, 1));
         messagePanel.add(exMessageSP);
      }
      if (throwable != null)
         exMessage.setText(throwable.getMessage());
      
      // get laf specific error icon
      Icon errorIcon=(Icon)UIManager.get("OptionPane.errorIcon");

      // layout north panel
      northPanel.add(exClassField, BorderLayout.NORTH);
      northPanel.add(new JLabel(errorIcon), BorderLayout.WEST);
      northPanel.add(messagePanel, BorderLayout.CENTER);

      getContentPane().add(northPanel, BorderLayout.NORTH);
      //System.out.println ("Added north panel to content pane.");

      String stackString=getStackString();
      JTextArea stack=new JTextArea(stackString);
      stack.setTabSize(3);
      stack.setRows(7);
      stack.setEditable(false);
      stackSP=new JScrollPane(stack);

      // Buttons
      JButton close=new JButton("Close");
      close.setActionCommand(CLOSE);
      close.addActionListener(this);

      detailButton=new JButton(""); // text is set by show/hide
      detailButton.setActionCommand(DETAIL);
      detailButton.addActionListener(this);

      JButton nextButton=new JButton("View Next");
      nextButton.setActionCommand(NEXT);
      nextButton.setToolTipText("<html>This error has a nested error <br>"+
                                "which may have additional debugging <br>"+
                                "information.</html>");
      nextButton.addActionListener(this);

      JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      if (hasNext())
         buttonPanel.add(nextButton);
      buttonPanel.add(detailButton);
      buttonPanel.add(close);

      getContentPane().add(buttonPanel, "South");

      if (detail)
         showDetail();
      else
         hideDetail();

      // this.setSize(400,280);
      pack();
      setLocation(WinUtil.alignCenter(this));
   }

   /** This is called by pack to determine the window size. */
   public Dimension getPreferredSize() {
      Dimension d=super.getPreferredSize();      
      if (d.width > MAX_WIDTH) {
         d=new Dimension(MAX_WIDTH, d.height);
      }
      return d;
   }

   /** */
   protected void showDetail() {
      detailButton.setText("<< Hide Detail");
      getContentPane().add(stackSP, BorderLayout.CENTER);
      pack(); 
      invalidate();
      repaint();
      detailShowing=true;
   }
   
   /** */
   protected void hideDetail() {
      detailButton.setText("Show Detail >>");
      getContentPane().remove(stackSP);
      pack(); 
      invalidate();
      repaint();
      detailShowing=false;
   }

   /** */
   protected String getStackString() {
      if (throwable == null)
         return "";

      ByteArrayOutputStream baos=new ByteArrayOutputStream();
      PrintStream ps=new PrintStream(baos);
      throwable.printStackTrace(ps);
      ps.flush();
      return baos.toString();
   }

   /** */
   protected boolean hasNext() {
      if (throwable != null && throwable.getCause() != null)
         return true;
      return false;
   }
   
   /** */
   public void actionPerformed(ActionEvent e) {
      String action=e.getActionCommand();

      if(action.equals(CLOSE)) {
         dispose();
      } else if (action.equals(DETAIL)) {         
         if (detailShowing)
            hideDetail();
         else
            showDetail();
      }
      else if(action.equals(NEXT)) {
         if (throwable != null) {
            if (parentDialog != null)
               debug(parentDialog, null, throwable.getCause(), detailShowing);
            else
               debug(parentFrame, null, throwable.getCause(), detailShowing);
         }
         else {// this is imposslble.
            debug(parentFrame, 
                  "Drat! this action shouldn't be callable with a "+
                  "null throwable.", null, false);
         }
      }         
   }

   /** */
   public static void main(String args[]) {
      try {
         nester();
      } catch (Throwable ex) {
         debug((JFrame)null, "This is a \nmulti-line\ntestmessage", ex, true);
      }
   }

   /** */
   public static void tosser() throws Exception {
      throw new Exception("tosser test exception");
   }

   /** */
   public static void nester() throws Exception {
      try { 
         // tosser();
         stacker();
      } catch (Throwable ex) {
         throw new Exception("Nexted error", ex);
      }
   }

   /** */
   public static void stacker() {
      stacker();
   }
} // ExceptionDebugger
