package com.jet.apps.databrowser.ui.editor;

import javax.swing.*;
import java.awt.*;

import java.sql.SQLException;

import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;

import java.util.*;
import java.util.List;

import com.jet.log.Logger;

import com.jet.utils.ui.WinUtil;

import com.jet.database.*;

import com.jet.apps.databrowser.model.DBSession;
import com.jet.apps.databrowser.ui.DataBrowser;

/**
 * This is an abstract superclass for and Insert or Update editor.
 *
 * @author Paul Bemowski
 */
public abstract class DataEditor extends JDialog
   implements DataEditorConstants, Logger, FocusListener
{
   /** This component's parent. */
   JFrame parent=null;

   /** A map of the data that is being edited. */
   HashMap currentData=null;

   /** The enclosing scroll pane. */
   JScrollPane colEdScroller=null;

   /** This is the list of ColumnEditor UI components. */
   ArrayList columnEditors=new ArrayList();

   /** This is the number of rows displayed initially (without the 
    * user resizing the window. */
   int DISPLAY_ROWS=8;

   /** The SQLTable object representation of the JDBC table. */
   SQLTable sqlTable=null;

   /** */
   DBSession session=null;
   
   /** */
   boolean success=false;

   /** */
   protected DataEditor(JComponent p, SQLTable t, HashMap data, 
                        DBSession ses) {
      this(WinUtil.findParentJFrame(p), t, data, ses);
   }

   /** */
   protected DataEditor(JFrame p, SQLTable t, HashMap data, DBSession ses) {
      super(p, true);  // modal
      parent=p;
      sqlTable=t;
      session=ses;
      currentData=data;

      Container contentPane=getContentPane();
      contentPane.setLayout(new BorderLayout());

      JPanel colEdPanel=new JPanel(new GridBagLayout());

      GridBagConstraints lc=new GridBagConstraints(); // label constraints
      GridBagConstraints fc=new GridBagConstraints(); // field constraints
      GridBagConstraints nc=new GridBagConstraints(); // null constraints
      
      lc.gridx=0; lc.gridy=GridBagConstraints.RELATIVE;
      lc.anchor=GridBagConstraints.WEST;

      fc.gridx=1; fc.gridy=GridBagConstraints.RELATIVE;
      fc.weightx=1; fc.fill=GridBagConstraints.HORIZONTAL;

      nc.gridx=2; nc.gridy=GridBagConstraints.RELATIVE;
      nc.weightx=.05; nc.fill=GridBagConstraints.NONE;
      
      int size=sqlTable.size();

      colEdScroller=new JScrollPane(colEdPanel);

      colEdScroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

      // Increase the scroll incriment
      JScrollBar scrollBar=colEdScroller.getVerticalScrollBar();
      scrollBar.setUnitIncrement(10);

      contentPane.add(colEdScroller, BorderLayout.CENTER);
      
      JToolBar nTools=getNorthToolbar();
      if (nTools != null)
         contentPane.add(nTools, BorderLayout.NORTH);
      JToolBar sTools=getSouthToolbar(); 
      if (sTools != null) 
         contentPane.add(sTools, BorderLayout.SOUTH);
      
      // Add the column editors
      for (int i=0; i<size; i++) {
         SQLColumn col=sqlTable.columnAt(i);

         ColumnEditor ce=null;

         if (currentData != null) {
            ce=new ColumnEditor(col, getMode(), currentData.get(col.getName()));
         }
         else {
            ce=new ColumnEditor(col, getMode(), null);
         }
         columnEditors.add(ce);

         // this should give us a window sized to DISPLAY_ROWS rows, and 
         // packed for and os/font combination.
         if (i == DISPLAY_ROWS)
            pack();

         colEdPanel.add(ce.getLabel(), lc);
         colEdPanel.add(ce.getField(), fc);
         colEdPanel.add(ce.getNullCheck(), nc);
         ce.getField().addFocusListener(this);
      }

      if (size <= DISPLAY_ROWS)
         pack();
      else {
         validate();
         int maxwidth=0;
         for (int i=0; i<size; i++) {
            ColumnEditor ce=(ColumnEditor)columnEditors.get(i);
            if (ce.getWidth() > maxwidth) {
               maxwidth=ce.getWidth();
            }
         }
         setSize(maxwidth+30, getHeight());
         log.writeDebug("Setting window size to: "+(maxwidth+30)+
                        ", "+getHeight());
      }

      if (getWidth() > 600 ||
          getHeight() > 420) {
         colEdScroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
         colEdScroller.getViewport().setViewPosition(new Point(0, 0));
         setSize(600, 420);
      }
      
      setLocation(WinUtil.alignCenter(this));
      colEdScroller.getViewport().setViewPosition(new Point(0, 0));

      //colEdScroller.getHorizontalScrollBar().setValue(0);
      // scrollToBegining();
      (new ScrollThread()).start();

      ((DataBrowser)parent).setCurrentDialog(this);

      init();
   }
   
   class ScrollThread extends Thread {
      public void run() {
         try {this.sleep(100);} catch (Exception ex) {}
         log.writeDebug("scrolling");
         try {
         SwingUtilities.invokeAndWait(new Runnable() {
               public void run() {
                  colEdScroller.getHorizontalScrollBar().setValue(0);
               }
            });
         } catch (Exception ex) {
            log.writeError(3, "Error updating scroller.", ex);
         }
      }
   }


   ////////////////////// Focus Listener //////////////////////////
   /** */
   public void focusGained(FocusEvent fe) {
      //colEdScroller.getViewport().scrollRectToVisible(((JComponent)fe.getComponent()).getBounds(new Rectangle()));
   }

   /** */
   public void focusLost(FocusEvent fe){}
   

   /** Utility method to print a string representing some constants. */
   static final String typeToString(int type) {
      switch (type) {
         case (UNKNOWN): return "UNKNOWN";
         case (STRING_FIELD): return "STRING_FIELD";
         case (NUMERIC_FIELD): return "NUMERIC_FIELD";
         case (DATE_FIELD): return "DATE_FIELD";
         case (TIME_FIELD): return "TIME_FIELD";
         case (DATE_TIME_FIELD): return "DATE_TIME_FIELD";
         case (TIMESTAMP_FIELD): return "TIMESTAMP_FIELD";
         default: return "NOT_DEFINED";
      }
   }
   
   // accessors
   public DBSession getDBSession() {return session;}
   public List getColumnEditors() {return columnEditors;}
   public SQLTable getTable() {return sqlTable;}
   
   public void setSuccess(boolean b) {success=b;}
   public boolean isSuccess() {return success;}

   /** */
   public static void main(String args[]) {
      SQLTable table=new SQLTable("customer");
      
      SQLColumn col=new SQLColumn("cust_id");
      col.setPrimaryKey(true);
      
      table.addColumn(col);
      table.addColumn(new SQLColumn("first_name"));
      table.addColumn(new SQLColumn("last_name"));
      table.addColumn(new SQLColumn("address"));
      table.addColumn(new SQLColumn("address1"));
      table.addColumn(new SQLColumn("address2"));
      table.addColumn(new SQLColumn("address3"));
      table.addColumn(new SQLColumn("address4"));
      table.addColumn(new SQLColumn("address5"));
      table.addColumn(new SQLColumn("address6"));
      table.addColumn(new SQLColumn("address7"));
      
      HashMap dummydata = new HashMap();
      
      for (Iterator iter = table.getColumnNames().iterator(); iter.hasNext();) {
         dummydata.put((String)iter.next(), "[dummy data]");	
      }
      
      InsertDataEditor ide=new InsertDataEditor((JFrame)null, table, null);
      ide.show();

      UpdateDataEditor ude=new UpdateDataEditor((JFrame)null, table, dummydata, null);
      ude.show();
   }   
   
   /////////////////////////// Abstract Methods //////////////////////////
   protected abstract JToolBar getNorthToolbar();
   protected abstract JToolBar getSouthToolbar();
   protected abstract void init();
   public abstract int getMode(); 
   public abstract String getSQL()
      throws SQLException;
}