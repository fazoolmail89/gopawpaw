package com.jet.utils.ui;

import javax.swing.*;
import javax.swing.table.*;


import java.util.*;
import java.awt.*;

public class UtilTablePanel extends JPanel
{
  private Vector rows;
  private VectorTableModel model;
  private JTable table;
  private String panelTitle;
  private boolean autoSizeCols=false;
  private String titles[] = null;
  
  public  UtilTablePanel (Object data)
  {
    this ("Untitled", data, false);
  }

  public UtilTablePanel (String title, Object data)
  {
    this (title, data, false);
  }

  public UtilTablePanel (String title, Object data, boolean autoSize)
  {
    setTableData(data);
    panelTitle=title;
    autoSizeCols=autoSize;
    layoutPanel();
  }

  /**
   * Sets the table data.
   */
  public void setTableData(Object data) //throws Exception
  {
    if (data instanceof Hashtable)
      rows=hashToVector((Hashtable)data);
    else if (data instanceof Vector)
      rows=(Vector)data;

    if (titles != null)
      setTitles(titles);
    //    else
    //throw (new Exception ("Not supported data type"));
    
    if (model != null)
      model.updateTable();
  }
  
  private void layoutPanel()
  {
    this.setLayout (new BorderLayout ());
    model=new VectorTableModel();
    table=new JTable (model);
    
    autosizeCols();
    
    JScrollPane sp=new JScrollPane(table);
    
    Dimension minSize=new Dimension (150, 80);
    this.setMinimumSize(minSize);
    this.setPreferredSize(minSize);
    
    this.add(sp, "Center");

    this.add(new JLabel(panelTitle), "North");
  }

  public void setTitles(String t[])
  {
    titles = t;
    
    if (titles.length != model.getColumnCount())
    {
      System.out.println ("Titles length and model don't match: "+
                          titles.length+" != "+model.getColumnCount());
      return;
    }
    else
    {
      Vector titlesVector=new Vector();
      for (int i=0; i<titles.length; i++)
      {
        titlesVector.addElement(titles[i]);
      }
      
      rows.removeElementAt(0);
      rows.insertElementAt(titlesVector,0);
      model.updateTable();
    }
  }
  
  /**
   *
   */
  private void autosizeCols()
  {
    if (autoSizeCols)
    {
      table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
      //table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
      
      FontMetrics metrics=table.getFontMetrics(table.getFont());
      
      TableColumn column=null;
      for (int i=0; i<model.getColumnCount(); i++)
      {
        column=table.getColumnModel().getColumn(i);

        int maxWidth=0;
        for (int j=0; j<model.getRowCount(); j++)
        {
          String val=(model.getValueAt(j, i)).toString();
          if (metrics.stringWidth(val) > maxWidth)
            maxWidth=metrics.stringWidth(val);
        }
        if (metrics.stringWidth(model.getColumnName(i)) > maxWidth)
          maxWidth=metrics.stringWidth(model.getColumnName(i));

        if (maxWidth == 0)
          maxWidth = 20;
        else
          maxWidth=maxWidth+15;
        
        if (false)System.out.println ("Setting col "+i+" width to "+maxWidth);
        column.setMinWidth(maxWidth);
      }
    }
  }
  
  /**
   *
   */
  private class VectorTableModel extends AbstractTableModel
  {
    public VectorTableModel()
    {
    }
    
    public int getColumnCount()
    {
      Vector cols=(Vector)rows.elementAt(0);
      return cols.size();
    }

    public String getColumnName(int col)
    {
      Vector colNames=(Vector)rows.elementAt(0);
      return (String)colNames.elementAt(col);
    }

    public int getRowCount () {return (rows.size() - 1);}

    public Object getValueAt (int row, int col)
    {
      Vector thisRow=(Vector)rows.elementAt(row+1);
      return thisRow.elementAt(col);
    }

    public void updateTable()
    {
      this.fireTableStructureChanged();
      autosizeCols();

    }
  }

  /**
   * Converts a hashtable to a 2-d vector for display in a table panel.
   */
  private Vector hashToVector (Hashtable hash)
  {
    Vector ret=new Vector();
    
    Vector titles=new Vector();
    titles.addElement("Keys");
    titles.addElement("Elements");

    ret.addElement(titles);
    
    Enumeration keys, elements;
    for (keys=hash.keys(), elements=hash.elements(); keys.hasMoreElements(); )
    {
      Vector row=new Vector();
      row.addElement(keys.nextElement());
      row.addElement(elements.nextElement());
      ret.addElement(row);
    }
    if (false) System.out.println (ret);
    return ret;
  }
  
}
