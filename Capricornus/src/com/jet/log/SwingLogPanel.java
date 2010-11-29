package com.jet.log;

import java.io.*;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.*;


/**
 *
 *
 */
public class SwingLogPanel extends JPanel {

   /** Refresh rate.  This is the number of ms the update
    * thread will sleep. */
   protected int refreshDelay=500;

   /** */
   protected int lineBuffer=2000;

   /** */
   protected JScrollPane scroller=null;
   
   /** */
   protected JTextArea textArea=null;

   /** */
   protected LogWriter logWriter=null;
   
   /** */
   protected RefreshThread refreshThread=null;

   /** */
   public SwingLogPanel() {
      super(new BorderLayout());

      textArea=new JTextArea(); 
      scroller=new JScrollPane(textArea);
      
      this.add(scroller, BorderLayout.CENTER);

      Toolbar toolbar=new Toolbar();
      this.add(toolbar, BorderLayout.NORTH);

      // create the log writer
      logWriter=new LogWriter();

      // start the refresh thread
      refreshThread=new RefreshThread();
      refreshThread.start();
   }

   /** */
   public LogWriter getWriter() {
      return logWriter;
   }

   /** */
   public class LogWriter extends Writer {
      StringBuffer buffer=null;
      
      /** */
      public LogWriter() {
         // FIXME: in 1.5, we can replace this with unsynchronized 
         //        StringBuilder
         buffer=new StringBuffer();
      }

      /** */
      public void write(char buf[], int off, int len) {
         buffer.append(buf, off, len);
      }
      
      public void flush() {
      }

      public void close() {
      }

      /** */
      public synchronized boolean hasContent() {
         if (buffer.length() > 0)
            return true;
         return false;
      }

      /** */
      public synchronized String getContent() {
         String s=buffer.toString();
         buffer.delete(0, buffer.length());
         return s;
      }
   }

   /** */
   class Toolbar extends JPanel implements ActionListener {
      public Toolbar() {
         super(new FlowLayout(FlowLayout.LEFT));
         
         JButton clear=new JButton("Clear");
         clear.setActionCommand("clear");
         clear.addActionListener(this);
         add(clear);
      }

      /** */
      public void actionPerformed(ActionEvent ae) {
         String command=ae.getActionCommand();
         if (command.equals("gc")) {
            System.gc();
         } else if (command.equals("clear")) {
            textArea.setText("");
         }
      }
   }

   static int threadCount=0;

   /** */
   class RefreshThread extends Thread {
      public RefreshThread() {
         setName("LogPanelRefreshThread-"+threadCount++);
      }

      /** */
      public void run() {
         while (true) {
            if (logWriter.hasContent()) {
               // System.out.println ("RefreshThread firing!");
               String content=logWriter.getContent();

               SwingLogWriter slw=new SwingLogWriter(content);
               SwingUtilities.invokeLater(slw);
            }

            try {sleep (refreshDelay);}
            catch (InterruptedException ex) { }
         }
      }
   }

   /** Convience class used to queue operations for the
    * AWTEventQueue using invokeLater. */
   class SwingLogWriter implements Runnable {
      String data=null;
      public SwingLogWriter(String s) {data=s;}
      public void run() {
         textArea.append(data);
         scroller.getViewport().
         setViewPosition(new Point(0, textArea.getText().length()));
      }
   }
}