package com.jet.apps.databrowser.model;

import java.util.*;
import java.net.URL;

import javax.swing.*;

import com.jet.apps.databrowser.ui.DataBrowser;
import com.jet.apps.databrowser.ui.QuickHTMLHelp;
import com.jet.utils.ui.ErrorWindow;

/*
 * $Log: UIModel.java,v $
 * Revision 1.2  2007/02/24 18:46:03  bemocvs
 * 3.5.0 updates
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.3  2002/05/17 09:25:59  bemocvs
 * added help url method.
 *
 * Revision 1.2  2002/05/02 00:22:57  bemocvs
 * 3.0.1
 *
 * Revision 1.1  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 */

/**
 * The UIModel manages the various UI compoents within 
 * an active databrowser VM.  
 *
 * @author Paul Bemowski
 */
public class UIModel implements com.jet.log.Logger
{
   /** */
   private static JFrame logFrame=null;

   /** */
   private static ArrayList activeWindows=new ArrayList();
   
   /** */
   private static QuickHTMLHelp quickHelp=null;

   /** */
   public static void setLogFrame(JFrame lf) {
      logFrame=lf;
   }
   
   /** */
    public static JFrame getLogFrame() {
       return logFrame;
    }

   /** */
   public static void setHelpURL(URL url) {
      QuickHTMLHelp qh=getQuickHelpWindow();
      qh.GO(url);
      qh.show();
   }

   /** */
   public static synchronized QuickHTMLHelp getQuickHelpWindow() {
      if (quickHelp == null) {
         quickHelp=new QuickHTMLHelp();
      }
      return quickHelp;
   }

   /** */
   public static void setLookAndFeel(LookAndFeel laf) {
      try {
         UIManager.setLookAndFeel(laf);
         updateLookAndFeel();
      } catch (Exception ex) {
         log.writeError(1, "Unable to update LAF.", ex);
      }
   }

   /** */
   public static void updateLookAndFeel() {
      for (int i=0; i<activeWindows.size(); i++) {
         JFrame frame=(JFrame)activeWindows.get(i);
         SwingUtilities.updateComponentTreeUI(frame);
      }
      
      if (logFrame != null)
         SwingUtilities.updateComponentTreeUI(logFrame);
      if (quickHelp != null)
         SwingUtilities.updateComponentTreeUI(quickHelp);
   }

   /** */
   public static synchronized void addDataBrowser(DataBrowser db) {
      activeWindows.add(db);
   }

   /** */
   public static synchronized void removeDataBrowser(DataBrowser db) {
      activeWindows.remove(db);
   }

   /** */
   public static void prepareShutdown() {
      if (quickHelp != null)
         quickHelp.setVisible(false);

      for (int i=0; i<activeWindows.size(); i++) {
         DataBrowser db=(DataBrowser)activeWindows.get(i);
         // db.setVisible(false);
         db.dispose();
      }

      if (logFrame != null)
         logFrame.setVisible(false);
   }

   /** */
   public static synchronized int getActiveWindowCount() {
      return activeWindows.size();
   }
}
