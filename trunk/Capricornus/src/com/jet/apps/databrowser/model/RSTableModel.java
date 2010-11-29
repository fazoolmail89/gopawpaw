package com.jet.apps.databrowser.model;

import javax.swing.table.*;
import java.util.ArrayList;

import java.sql.*;
import java.util.*;

import com.jet.log.Logger;

import com.jet.apps.databrowser.database.*;

import com.jet.utils.ui.Swinger;

/*
 * $Log: RSTableModel.java,v $
 * Revision 1.3  2004/09/08 20:19:21  bemocvs
 * Ticket 1069, no headers on csv export
 *
 * Revision 1.2  2003/09/02 00:32:34  bemocvs
 * added some debugging
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.3  2001/10/11 23:17:17  bemocvs
 * table paging interface
 *
 * Revision 1.2  2001/10/03 11:32:23  bemocvs
 * xxx
 *
 * Revision 1.1  2001/10/03 00:47:59  bemocvs
 * changes for new RSTableModel
 *
 */

/**
 * The RSTable model is a stateful view of a database result set.  It will
 * hold a reference to the statment that created it, and provide provisions
 * for paging, moving forward and backward in the result set. <p>
 *
 * This model was originally an inner class within the RSTablePanel, 
 * however the paging api will require a significant amount of code, and
 * it is the primary reason for splitting this data out.
 *
 * @author Paul Bemowski
 */
public class RSTableModel extends AbstractTableModel implements Logger
{
   /** */
   ArrayList observers=new ArrayList();

   /** Represents the column headers. */
   ArrayList headers=null;

   /** The statement holding the result set. */
   Statement statement=null;

   /** The result set. */
   ResultSet resultSet=null;

   /** */
   int displayRows=10;

   /** */
   ArrayList pages=new ArrayList();

   /** */
   Page currentPage=null;

   /** */
   int pageIndex=0;

   /** */
   private int lastColumnCount=-1;

   /** */
   public RSTableModel(int rpp) {
      displayRows=rpp;
   }

//    /** */
//    public RSTableModel(ResultSet rs, int rpp) 
//       throws SQLException {
//       displayRows=rpp; // rows per page
//       setModelResults(rs);
//    }

//    /** */
//    public RSTableModel(Statement s, ResultSet rs, int rpp) 
//       throws SQLException {
//       displayRows=rpp; // rows per page
//       setModelResults(s, rs);
//    }

   /** */
   public void setModelResults(ResultSet rs) 
      throws SQLException {
      setModelResults(null, rs);
   }

   /** WARNING: This method is may be called from the 
    * QueryThread, or awt event queue.  Watch your Threads. */
   public void setModelResults(Statement s, ResultSet rs) 
      throws SQLException {
      this.statement=s;
      this.resultSet=rs;

      headers=DBUtils.getHeaders(rs);
      pages=new ArrayList();
      pageIndex=0;

      ArrayList rows=DBUtils.getRows(rs, displayRows);
      currentPage=new Page(rows, displayRows);
      pages.add(currentPage);

      
      class updater implements Runnable {
         public void run() {
            updateTable();
         }
      }
      Swinger.invokeLaterIfNecessary(new updater());
   }

   /** */
   public void close() {
      log.writeDebug("Closing RSTableModel...");
      currentPage=null;
      headers=null;
      updateTable();
      if (resultSet != null) {
         try {resultSet.close();}
         catch (Exception ex) {log.writeError(2, ex);}
      }
      if (statement != null) {
         try {statement.close();}
         catch (Exception ex) {log.writeError(2, ex);}
      }
   }

   /** */
   public ArrayList getRows() {return currentPage.getRows();}

   /** */
   public ArrayList getHeaders() {return headers;}

   /** */
   public ArrayList getRowsWithHeaders() {
      ArrayList rows=currentPage.getRows();
      ArrayList newList=new ArrayList(rows.size());
      newList.add(getHeaders());
      newList.addAll(rows);
      return newList;
   }

   /** */
   Page getLastPage() {
      return (Page)pages.get(pages.size()-1);
   }
   
   /** */
   Page getNextPage() 
      throws SQLException {
      if (pageIndex < pages.size() - 1) {
         pageIndex++;
         return (Page)pages.get(pageIndex);
      }
      else {
         // go get it from the resultSet
         if (resultSet != null &&
             statement != null) {
            Page page=new Page(DBUtils.getRows(resultSet, displayRows), 
                               displayRows);
            pages.add(page);
            pageIndex=pages.size() - 1;
            return page;
         }
         return new Page(new ArrayList(), displayRows);
      }
   }

   public int getPageIndex() {return pageIndex;}

   public int getPageCount() {return pages.size();}

   public int getRowsPerPage() {return displayRows;}

   /////////////////////////////////////////////////////////////////
   ////////////////////  Paging Methods, model state change  ///////
   /////////////////////////////////////////////////////////////////   
   /** */
   public boolean hasPagesDown() {
      if (currentPage == null)
         return false;

      log.writeDebug(3, "CurrentPage: "+currentPage);
      log.writeDebug(3, "Pages: \n"+pages);
      if (!currentPage.equals(getLastPage())){
         log.writeDebug(1, "Current page is NOT last page, so more pages.");
         return true;
      }
      // ok, the current page is the last page
      else if (!currentPage.isLastPage() &&
               statement != null && resultSet != null) {
         log.writeDebug(1, "CurrentPage is last page, RS and ST != null, "+
                        "so, more pages.");
         return true;
      }
      log.writeDebug(1, "currentPage.equals(getLastPage()) = "+
                     currentPage.equals(getLastPage()));
      log.writeDebug(1, "currentPage = "+currentPage);
      return false;      
   }

   /** */
   public boolean hasPagesUp() {
      if (pageIndex > 0)
         return true;
      return false;
   }

   /** */
   public void pageDown() 
      throws SQLException {
      currentPage=getNextPage();

      updateTable();
   }

   /** */
   public void pageUp() {
      pageIndex --;
      currentPage=(Page)pages.get(pageIndex);
      updateTable();
   }

   /////////////////////////////////////////////////////////////////
   ////////////////////  Abstract Table Model interface ////////////
   /////////////////////////////////////////////////////////////////
   /** */
   public int getColumnCount() { 
      int columnCount=-1;

      if (headers == null)
         columnCount=0;
      else 
         columnCount=headers.size();
      // lastColumnCount=columnCount;
      return columnCount;
   }
   
   /** */
   public String getColumnName(int col) {
      return (String)headers.get(col);
   }

   /** */
   public int getRowCount() {
      if (currentPage == null)
         return 0;
      return currentPage.getRowCount();
   }

   /** */
   public Object getValueAt(int row, int col) {
      return currentPage.getValueAt(row, col);
   }

   /** */
   public void setValueAt(int row, int col, Object val) {
      currentPage.setValueAt(row, col, val);
   }

   /** */
   int getColumn(String name) {
      return headers.indexOf(name);
   }
      
   /** */
   public void removeRow(int row) {
      currentPage.removeRow(row);
   }

   public void updateTable()
   {
      // when we fire tableStructureChanged(), and we've re-sized columns,
      // the column re-sizing goes away...  Kevin Slater has requested
      // a fix for this.  
      // this will fail if the number of columns in the query has
      // changed, which should be very rare.
      // PAB, 5/20/2001
      //this.fireTableStructureChanged();
      log.writeDebug("Updating table with "+getRowCount()+" rows");
      log.writeDebug("Headers shows "+getColumnCount()+" columns.");
      
      if (lastColumnCount != getColumnCount()) {
         log.writeDebug("Updating table structure");
         lastColumnCount=getColumnCount();
         this.fireTableStructureChanged();
      }
      else {
         log.writeDebug("Updating table data");
         this.fireTableDataChanged();
      }
   }

   public void updateTableStructure() {
      log.writeDebug("Updating table structure with "+
                     currentPage.getRows().size()+" rows");
      this.fireTableStructureChanged();
   }   

   //////////////////////////////////////////////////////////////////////////
   /** A page represents the necessary pointers into the rows internal
    * data structure to present a page of data for display. */
   class Page {
      ArrayList rows=null;
      int size;

      /** */
      public Page(ArrayList r, int s) {
         rows=r;
         size=s;
      }
      
      /** */
      public String toString() {return "Page: index="+
                                pages.indexOf(this)+
                                " size="+size+" rows.size="+
                                rows.size()+
                                " isLastPage()="+isLastPage();}

      /** */
      public boolean isLastPage() {
         if (rows.size() < size) 
            return true;
         return false;
      }
           
      /** */
      public int getRowCount() {
         return rows.size();
      }

      /** */
      public int getPageSize() {
         return size;
      }
      
      /** */
      public Object getValueAt(int row, int col) {
         ArrayList thisRow=(ArrayList)rows.get(row);
         return thisRow.get(col);
      }
      
      /** */
      public void setValueAt(int row, int col, Object val) {
         ArrayList thisRow=(ArrayList)rows.get(row);
         thisRow.set(col, val);
      }

      /** */
      public void removeRow(int row) {
         rows.remove(row);
      }
      
      /** */
      public ArrayList getRows() {return rows;}
   }

   //////////////////// Observable  ////////////////////////////////
   public void addObserver(Observer obs) {
      observers.add(obs);
   }
   public void deleteObserver(Observer obs) {
      observers.remove(obs);
   }
   public void removeAllObservers() {
      for (int i=observers.size()-1; i>=0; i--) {
         observers.remove(i);
      }
   }

   public void notifyObservers(Object obj) {
      for (int i=0; i<observers.size(); i++) {
         Observer obs=(Observer)observers.get(i);
         obs.update(null, obj);
      }
   }
}



