package com.jet.utils.ui;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.jet.utils.icons.*;

/*
 * $Log: ErrorWindow.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.5  2001/10/12 00:33:51  bemocvs
 * added some buttons
 *
 * Revision 1.4  2001/10/11 20:58:09  bemocvs
 * Added memory monitor.
 *
 * Revision 1.3  2001/08/14 00:26:42  bemocvs
 * Added a thread safe log flusher.
 *
 * Revision 1.2  2001/07/29 01:08:41  bemocvs
 * moved stream to inner class.  Added scroll code.
 *
 */

/**
 * Works in conjunction with ErrorWindowStream to re-direct most 
 * output from the console to a JTextArea.  Useful to read errors 
 * for debugging.
 *
 * The Error window should be used in the following way:
 * 
 * <pre>
 * public static void main (String argv[])
 * {
 *   ErrorWindow ew=new ErrorWindow();
 *   System.setOut(ew.getErrorStream());
 *   ....
 * }
 * </pre>
 *
 * This usage will re-direct all the stuff from System.out to 
 * the window.
 *
 * @author Paul Bemowski
 * @see ErrorWindowStream
 */
public class ErrorWindow extends JFrame
   implements ActionListener 
{
   ErrorWindowStream errorStream;
   JTextArea text;
   JScrollPane scroller=null;

   public ErrorWindow(String title)
   {
      setTitle(title);
      WinUtil.setParentIcon(this);
      text=new PopupTextArea();
      errorStream=new ErrorWindowStream ();

      ImageIcon icon=IconFactory.
      findIcon("resources/icons/log_16x16x16.gif");
      if (icon != null){
         setIconImage(icon.getImage());
      }

      setSize(550, 290);
      setLocation (WinUtil.alignBottomLeft(this));
      scroller=new JScrollPane(text);
      getContentPane().setLayout(new BorderLayout());

      getContentPane().add (scroller, "Center");

      JPanel northPanel=new JPanel(new BorderLayout());
      // MemoryMonitor surf=new MemoryMonitor();
      MMPanel mmp=new MMPanel();
      mmp.start();
      northPanel.add(mmp, "East");
      northPanel.add(new Toolbar(), "West");
      getContentPane().add(northPanel, "North");


      //JPanel buttonPanel = new JPanel (new FlowLayout());
      //JButton saveButton=(JButton)buttonPanel.add(new JButton("Save to File"));
      //saveButton.setActionCommand("saveButton");
      //getContentPane().add (buttonPanel, "South");
    
      // Install listeners.
      WindowListener wh=new WindowHandler();
      addWindowListener(wh);
      //saveButton.addActionListener(this);
   }

   /**
    * Returns the handle of the ErrorWindowStream that has been 
    * created to re-direct System.out to.  After instantiation
    * of the ErrorWindow class, execute "System.setOut(ew.getErrorStream);"
    *
    * @return Re-directed error stream.
    */
   public PrintStream getErrorStream()
   {
      return (PrintStream)errorStream;
   }

   /*   public void setShowOnException (boolean b)
        {
        if (errorStream != null)
        errorStream.setShowOnException (b);
        }*/

   
   private class WindowHandler extends WindowAdapter
   {
      public void windowClosing(WindowEvent e)
      {
         setVisible(false);
      }
   } // WindowHandler

   public void actionPerformed(ActionEvent e)
   {
      String action=e.getActionCommand();
      if (action.equals ("saveButton"))
         saveButtonHandler();      
   }

   private void saveButtonHandler()
   {
      String filename=JOptionPane.showInputDialog(this,
                                                  "Enter file name for output");

      JOptionPane.showMessageDialog (this, "Not implemented");    
   }

   /** */
   public class Toolbar extends JToolBar implements ActionListener
   {
      public Toolbar() {
         setLayout(new FlowLayout());
         setFloatable(false);

         JButton button=null;

         button=new JButton("GC");
         button.setActionCommand("gc");
         button.addActionListener(this);
         this.add(button);

         button=new JButton("Clear");
         button.setActionCommand("clear");
         button.addActionListener(this);
         this.add(button);
      }

      public void actionPerformed(ActionEvent ae) {
         String action=ae.getActionCommand();
         if (action.equals("gc"))
            System.gc();
         else if (action.equals("clear"))
            text.setText("");
      }
   }


   /**
    * This is a simple class the overrides PrintStream and re-directs
    * the println(String s) stuff to a JTextArea.  The rest of the stuff
    * filters through to System.out.  It only works in conjunction with an 
    * ErrorWindow, and should not be instantiated from anywhere other 
    * that the constructor for ErrorWindow.
    *
    * @author Paul Bemowski
    */
   public class ErrorWindowStream extends java.io.PrintStream
   {
      private StringBuffer buffer=new StringBuffer(200);

      /**
       * Constructor which requires a JTextArea that will recieve the 
       * error messages for the system.
       */
      public ErrorWindowStream () {
         super(System.out);
      }

      /**
       *
       */
      public void write(int b) // throws IOException
      {
         // FIXME: BUFFER!!!!!!  WITH FUNCTIONAL FLUSH!!
         buffer.append(""+(char)b);
         // text.append(""+(char)b);
      }
   
      /**
       *
       */
      public void flush()
      {
         if (Thread.currentThread().getClass().getName().equals("java.awt.EventDispatchThread")) {
            doFlush();
         }
         else {
            ThreadSafeFlush flusher=new ThreadSafeFlush();
            try {
               SwingUtilities.invokeLater(flusher);
            } catch (Exception ex) {
               ex.printStackTrace();
            }
         }
      }

      final class ThreadSafeFlush implements Runnable {
         public ThreadSafeFlush() {}
         public void run() {
            doFlush();
         }
      }
      
      /** */
      public void doFlush() {
         String s=buffer.toString();
         text.append(s);
         scroller.getViewport().
         setViewPosition(new Point(0, text.getText().length()));
         // this is about the worst thing you could do!!!
         // buffer.setLength(0);
         buffer.delete(0, s.length());
      }
   
      /**
       *
       */
      public void write(byte b[], int off, int len) //throws IOException 
      {
         for (int i = 0 ; i < len ; i++) {
            write(b[off + i]);
         }
      }

      /**
       *
       */
      public void write(byte b[]) //throws IOException 
      {
         write(b, 0, b.length);
      }
   }

}



