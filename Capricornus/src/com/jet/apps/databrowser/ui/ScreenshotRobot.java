package com.jet.apps.databrowser.ui;

import java.io.File;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

// for screenshots
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import com.jet.log.Logger;

import com.jet.database.*;

import com.jet.apps.databrowser.database.ConnectionInfo;
import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.model.tree.*;


/**
 * This is a Robot used to automate the collection of 
 * DataBrowser screenshots.
 *
 * @author Paul Bemowski
 */
public class ScreenshotRobot extends Thread implements Logger
{
   /** */
   Robot robot=null;

   /** */
   DataBrowser databrowser=null;

   /** */
   public ScreenshotRobot(DataBrowser db) {
      setName("ScreenshotRobot");
      databrowser=db;
   }


   /** */
   public void run() {
      try {
         robot=new Robot();
         sleep(100);
         log.writeDebug("Starting ScreenshotRobot...");
         sleep(2000);
         
         initialSetup();
         sleep(2000);
         rootWindowScreenshot(new File(".", "databrowser.png"));

         sleep(1000);
         resultsPaneScreenshot(new File(".", "databrowser_results.png"));

         sleep(1000);
         editDataScreenshot(new File(".", "databrowser_edit.png"));

         sleep(1000);
         insertDataScreenshot(new File(".", "databrowser_insert.png"));

         sleep(1000);
         tableEditorScreenshot(new File(".", "databrowser_table.png"));

      } catch (Exception ex) {
         log.writeError(1, "Error in robot.", ex);
      } finally {
         log.writeDebug("ScreenshotRobot finished.");
      }
   }

   /** */
   void initialSetup() 
      throws Exception {
      log.writeDebug("Robot: initialSetup()");
      
      databrowser.setSize(800, 600);
      
      String url="jdbc:mysql://pint:3306/jmatrix";
      String driver="org.gjt.mm.mysql.Driver";
      String user="bemo";
      String pass="bemo";

      ConnectionInfo ci=new ConnectionInfo(driver, url, user, pass);

      ci.setName("user on localhost:3306(jmatrix)");

      Thread connectThread=databrowser.getSession().connect(ci);
      
      // open a file
      String filename="../resources/sample.sql";

      databrowser.openFileWithNewEditor(filename);
      
      log.writeDebug(2, "Waiting for connect thread to finish.");
      // wait for conncect thread to finish.
      // sleep(6000);
      
      connectThread.join();
      log.writeDebug("Connected!");
      sleep(1000);

      int tableNodeId=3;
      // select the 'cases' node
      TreePanelModel tpm=databrowser.getSession().getTreePanelModel();
      TreeModel tm=tpm.getTreeModel();
      DatabaseNode dn=(DatabaseNode)tm.getRoot();
      TableNode tn=(TableNode)dn.getChildAt(tableNodeId); // cases
      

      TreePath path=databrowser.treePanel.getTree().getPathForRow(tableNodeId+1);
      databrowser.treePanel.getTree().setSelectionPath(path);

      databrowser.treePanel.updateTable(tn);

      // execute a query
      databrowser.getSession().executeQuery("select * from contact");
      sleep(1000);
      databrowser.getSession().executeQuery("select * from forum");
      sleep(1000);
      
      databrowser.resultsTabPane.setSelectedIndex(0);

      // show the new connections menu via keystrokes
      robot.keyPress(KeyEvent.VK_ALT);
      robot.keyPress(KeyEvent.VK_D);
      robot.keyRelease(KeyEvent.VK_D);
      robot.keyPress(KeyEvent.VK_N);
      robot.keyRelease(KeyEvent.VK_N);
      robot.keyRelease(KeyEvent.VK_ALT);

      log.writeDebug("Snapping in 3 seconds!");
      sleep(3000);
   }

   /** */
   void resultsPaneScreenshot(File file) 
      throws Exception {
      robot.keyPress(KeyEvent.VK_ESCAPE);
      robot.keyRelease(KeyEvent.VK_ESCAPE);
      robot.keyPress(KeyEvent.VK_ESCAPE);
      robot.keyRelease(KeyEvent.VK_ESCAPE);
    
      String sql="select * from lookup_value\n"+
      "where type like 'ticket%'";
      
      databrowser.editorTabs.setSelectedIndex(0);
      databrowser.getSession().setEditorText(sql);
      databrowser.getSession().executeQuery();
      sleep(2000);

      rootWindowScreenshot(file);
   }

   /** */
   void editDataScreenshot(File file) 
      throws Exception {
      
      String sql="select * from notes";
      
      databrowser.editorTabs.setSelectedIndex(0);
      databrowser.getSession().setEditorText(sql);
      databrowser.getSession().executeQuery();
      sleep(2000);

      RSTablePanel rstp=(RSTablePanel)databrowser.resultsTabPane.getSelectedComponent();
      rstp.getTable().setRowSelectionInterval(1, 1);
      
      SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               RSTablePanel rstp=(RSTablePanel)databrowser.resultsTabPane.getSelectedComponent();
               rstp.processEdit();
            }
         });
      sleep(1500);

      dialogScreenshot(file);

      // close the dialog
      robot.keyPress(KeyEvent.VK_ALT);
      robot.keyPress(KeyEvent.VK_C);
      robot.keyRelease(KeyEvent.VK_C);
      robot.keyRelease(KeyEvent.VK_ALT);
   }

   /** */
   void insertDataScreenshot(File file) 
      throws Exception {
      
      sleep(1000);

      RSTablePanel rstp=(RSTablePanel)databrowser.resultsTabPane.getSelectedComponent();
      rstp.getTable().setRowSelectionInterval(1, 1);
      
      SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               RSTablePanel rstp=(RSTablePanel)databrowser.resultsTabPane.getSelectedComponent();
               rstp.processInsert();
            }
         });
      sleep(1500);

      dialogScreenshot(file);

      // close the dialog
      robot.keyPress(KeyEvent.VK_ALT);
      robot.keyPress(KeyEvent.VK_C);
      robot.keyRelease(KeyEvent.VK_C);
      robot.keyRelease(KeyEvent.VK_ALT);
   }


   /** */
   void tableEditorScreenshot(File file) 
      throws Exception {
      
      SQLTable notesTable=
      databrowser.getSession().getSchemaUtil().getTable("notes");

      TableEditor te=TableEditor.showTable(databrowser.getSession(),
                                           notesTable);
      sleep(1000);

      windowScreenshot(te, file);

      te.dispose();
   }

   /** */
   void rootWindowScreenshot(File file) 
      throws Exception {
      windowScreenshot(databrowser, file);
   }

   /** */
   void windowScreenshot(JFrame frame, File file) 
      throws Exception {
      Rectangle dbRect=new Rectangle(frame.getX(), 
                                     frame.getY(),
                                     frame.getWidth(),
                                     frame.getHeight());
      
      BufferedImage image=robot.createScreenCapture(dbRect);
      
      ImageIO.write(image, "png", file);
   }

   /** */
   void dialogScreenshot(File file)
      throws Exception {
      JDialog dialog=databrowser.getCurrentDialog();
      
      
      Rectangle dbRect=new Rectangle(dialog.getX(), 
                                     dialog.getY(),
                                     dialog.getWidth(),
                                     dialog.getHeight());
      
      BufferedImage image=robot.createScreenCapture(dbRect);
      
      ImageIO.write(image, "png", file);
   }
}