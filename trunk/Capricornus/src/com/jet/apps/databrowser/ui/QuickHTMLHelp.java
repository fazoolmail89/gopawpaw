package com.jet.apps.databrowser.ui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.html.*;
import javax.swing.text.*;
import javax.swing.event.*;

import java.util.*;
import java.net.*;
import java.io.*;


import com.jet.log.Logger;
import com.jet.utils.icons.*;

import com.jet.utils.ui.*;
// import com.jet.apps.jdbcbrowser.Main;

/*
 * $Log: QuickHTMLHelp.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/01 21:21:30  bemocvs
 * atl weekend work.
 *
 * Revision 1.2  2001/09/03 20:10:12  bemocvs
 * Removed search button, overrode show.
 *
 * Revision 1.1  2001/05/11 20:22:27  bemocvs
 * working with password encryption
 *
 * Revision 1.2  2001/03/15 17:35:54  bemocvs
 * performance improvement related to init
 *
 */

/**
 * Help window for the databrowser.
 * 
 * @author Paul Bemowski
 */
public class QuickHTMLHelp extends JFrame implements Logger
{
   private static URL INSERT_URL;
   private static URL UPDATE_URL;
   private static URL DELETE_URL;
   private static URL SELECT_URL;
   private static URL CREATE_URL;

   private static URL ERROR_PAGE;
   private static URL START_PAGE;

   DocumentListener helpListener=null;

   JEditorPane mEditorPane;
   Toolbar toolbar=null;
   StatusBar statusbar=null;
   History history=new History(25);


   /** */
   static {
      SELECT_URL=QuickHTMLHelp.class.getClassLoader().getResource("resources/help/sql/select.htm");
      INSERT_URL=QuickHTMLHelp.class.getClassLoader().getResource("resources/help/sql/insert.htm");
      UPDATE_URL=QuickHTMLHelp.class.getClassLoader().getResource("resources/help/sql/update.htm");
      DELETE_URL=QuickHTMLHelp.class.getClassLoader().getResource("resources/help/sql/delete.htm");
      CREATE_URL=QuickHTMLHelp.class.getClassLoader().getResource("resources/help/sql/create.htm");

      ERROR_PAGE=QuickHTMLHelp.class.getClassLoader().getResource("resources/help/sql/start.htm");
      START_PAGE=QuickHTMLHelp.class.getClassLoader().getResource("resources/help/sql/start.htm");
   }

   /**
    *
    */
   public QuickHTMLHelp()
   {
      super();
      this.setSize(550, 375);
      this.setTitle("QuickHELP");

      ImageIcon icon=IconFactory.
      findIcon("resources/icons/question_16x16.gif");
      if (icon != null)
         setIconImage(icon.getImage());
      // layout the frame
      getContentPane().setLayout(new BorderLayout());
      
      // get an editor
      mEditorPane=new QHEditorPane();
      mEditorPane.setEditable(false);
      mEditorPane.addHyperlinkListener(new Linker());
      
      toolbar=new Toolbar();
      statusbar=new StatusBar();
      JScrollPane sp=new JScrollPane(mEditorPane);
      getContentPane().add(toolbar, "North");
      getContentPane().add(sp, "Center");
      getContentPane().add(statusbar, "South");

      statusbar.setCenter(" ");

      helpListener=new HelpListener();

      // the code below was very expensive on databrowser startup, 
      // and not really necessary! PAB, 03/15/01

      //try {
      //   setPage(START_PAGE);
      //}
      //catch (Exception ex) 
      //{
      //   log.printStackTrace(ex);
      //}
   }

   /** */
   public DocumentListener getHelpListener()
   {
      return helpListener;
   }

   /** */
   public void show() {
      // if page is not set, set it.
      if (toolbar.location.getText().trim().length() == 0) 
         setPage(START_PAGE);
      super.show();
   }
   
   /**
    *
    */
   public void GO(String url)
   {
      setPage(url);
   }

   /**
    *
    */
   public void GO(URL url)
   {
      setPage(url);
   }

   static String lastFirstWord="";
   /**
    *
    */
   class HelpListener implements DocumentListener
   {

      public HelpListener()
      {
      }

      /** */
      public void changedUpdate(DocumentEvent de)
      {
         //System.out.println ("Document change");
      }

      /** */
      public void insertUpdate(DocumentEvent de)
      {
         //System.out.println ("Document insert");
         Document d=de.getDocument();
         int length=d.getLength();
         if (length < 5)
            return;
         String text=null;
         if (length > 10)
            length=10;

         try {text=d.getText(0, length);}
         catch (Exception ex) {log.printStackTrace(ex); return;}
         
         String firstWord=null;
         if (text.indexOf(" ") != -1)
            firstWord=text.substring(0, text.indexOf(" ")).toLowerCase();
         else
            firstWord=text.toLowerCase();
         
         if (firstWord == null || 
             firstWord.equals(lastFirstWord))
            return;
         lastFirstWord=firstWord;


         try {
            if (firstWord.equals("select")) 
               setPage(SELECT_URL);
            else if (firstWord.equals("insert"))
               setPage(INSERT_URL);
            else if (firstWord.equals("update"))
               setPage(UPDATE_URL);
            else if (firstWord.equals("delete"))
               setPage(DELETE_URL);
            else if (firstWord.equals("create"))
               setPage(CREATE_URL);
         }
         catch (Exception ex) {
            log.printStackTrace(ex);
         }
      }
      /** */
      public void removeUpdate(DocumentEvent de)
      {
      }
   }

   public static void main(String args[])
   {
      QuickHTMLHelp qh=new QuickHTMLHelp();
      qh.show();
   }


   /**
    */
   private class Linker implements HyperlinkListener
   {
      public void hyperlinkUpdate(HyperlinkEvent e)
      {
         try {
            // there are 3 event types.  ENTERED, EXITED, AND ACTIVATED
            if (e.getEventType() == HyperlinkEvent.EventType.ENTERED) {
               // System.out.println (e.getDescription());
               URL url=e.getURL();
               if (url != null) {
                  statusbar.setCenter(url.toString());
               }
               else {
                  statusbar.setCenter(e.getDescription());
               }
            }
            else if (e.getEventType() == HyperlinkEvent.EventType.EXITED) {
               statusbar.setCenter(" ");
            }
            else if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
               String urldes=e.getDescription();
               if (urldes.startsWith("resource://")) {
                  String resource=urldes.substring(11);
                  URL url=QuickHTMLHelp.class.getClassLoader().getResource(resource);

                  log.writeDebug("Link Handler Res: "+resource+ "->"+url);
                  setPage(url);
               }
               else {
                  URL url=e.getURL();
                  log.writeDebug ("Link handler: "+url);
                  setPage(url);
               }
            }
         } catch (Throwable t) {
            log.writeError(1, t);
         }
      }
   }


   private void setPage(String s) 
   {
      try {
         setPage(new URL(s));
      } catch (MalformedURLException ex) {
         setPage(ERROR_PAGE);
      }
   }

   /**
    * This is the primary function that actually goes to get data.<p>
    *
    * The set page function will lock the GUI.  Setup a backgroud thread
    * to go fetch the page (keep the gui responsive).  The, send the page to 
    * the renders with a SwingUtils.invokeLater() call.
    *
    * Better yet, subclass the editor pane itself, and override the "getStream" 
    * method.  Add a cache, and a background thread.
    */
   private void setPage(URL url)
   {
      try {
         history.addElement(url.toString());
         toolbar.location.setText(url.toString());
         toolbar.update();
         mEditorPane.setPage(url);
      }
      catch (Exception ex) {
         log.printStackTrace(ex);
      }
   }

   /** 
    *
    */
   private class Toolbar extends JToolBar implements ActionListener
   {
      JButton backButton, forwardButton, homeButton, searchButton;
      
      JTextField location=null;

      public Toolbar()
      {
         Icon icon=null;
         int h=17; // Icon height
         int w=16; // Icon width

         icon=IconFactory.findIcon("resources/icons/back_sm.gif", h, w);
         backButton=new JButton(icon);
         backButton.setActionCommand("back");
         backButton.setToolTipText("Back");
         backButton.addActionListener(this);
         backButton.setEnabled(false);
         this.add (backButton);

         icon=IconFactory.findIcon("resources/icons/forward_sm.gif", h, w);
         forwardButton=new JButton(icon);
         forwardButton.setActionCommand("forward");
         forwardButton.setToolTipText("Forward");
         forwardButton.addActionListener(this);
         forwardButton.setEnabled(false);
         this.add (forwardButton);

         icon=IconFactory.findIcon("resources/icons/home_sm.gif", h, w);
         homeButton=new JButton(icon);
         homeButton.setActionCommand("home");
         homeButton.setToolTipText("Home");
         homeButton.addActionListener(this);
         homeButton.setEnabled(true);
         this.add (homeButton);

//           icon=IconFactory.findIcon("resources/icons/search_sm.gif", h, w);
//           searchButton=new JButton(icon);
//           searchButton.setActionCommand("search");
//           searchButton.setToolTipText("Search");
//           searchButton.addActionListener(this);
//           searchButton.setEnabled(true);
//           this.add (searchButton);

         this.addSeparator();
         this.addSeparator();
         location=new JTextField();
         location.setActionCommand("location");
         Font smallfont=Font.getFont("Times-PLAIN-6");
         location.setFont(smallfont);
         location.addActionListener(this);
         this.add(location);
      }

      public void actionPerformed(ActionEvent ae)
      {
         String action=ae.getActionCommand();
         log.writeDebug ("QHAction: "+action);

         try {
            if (action.equals("home")) {
               setPage(START_PAGE);
            }
            else if (action.equals("back")) {
               
               setPage(history.getPrev());
            }
            else if (action.equals("forward")) {
               setPage(history.getNext());
            }
            else if (action.equals("location")) {
               setPage(location.getText());
            }
         }
         catch (Exception ex) {
            log.printStackTrace(ex);
         }
      }
      
      public void update()
      {
         if (history.hasPrev())
            backButton.setEnabled(true);
         else 
            backButton.setEnabled(false);
         
         if (history.hasNext())
            forwardButton.setEnabled(true);
         else
            forwardButton.setEnabled(false);
      }
   }

   /**
    * I want to override the getStream(URL url) method on the editor
    * pane to re-set some headers.
    */
   static final class QHEditorPane extends JEditorPane
   {
      public QHEditorPane () {
         super();
      }

      public InputStream getStream(URL page) throws java.io.IOException {
         URLConnection conn = page.openConnection();
         conn.setRequestProperty("User-Agent", "Mozilla/4.0 (DataBrowser QuickHelp)");

         String type = conn.getContentType();
         if (type != null) {
            setContentType(type);
         }
         InputStream in = conn.getInputStream();
         return in;
      }      
   }
}

