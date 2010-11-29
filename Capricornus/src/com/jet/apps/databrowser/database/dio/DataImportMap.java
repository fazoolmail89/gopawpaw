package com.jet.apps.databrowser.database.dio;

import com.jet.database.*;

import java.util.*;
import com.jet.utils.*;

/**
 *
 *
 */
public class DataImportMap implements com.jet.log.Logger
{
   Vector fileColumns=null;
   SQLTable sqlTable=null;

   // represents a row in the table model.
   Vector colMaps=new Vector();
   
   public DataImportMap(Vector fc, SQLTable st)
   {
      fileColumns=fc;
      sqlTable=st;

      for (int i=0; i<st.size(); i++) {
         SQLColumn col=sqlTable.columnAt(i);
         int index=fileColumns.indexOf(col.getName());
         
         String fileColName=null;
         if (index > -1)
            fileColName=(String)fileColumns.elementAt(index);

         ColumnMap cm=new ColumnMap(col, fileColName, index);
         colMaps.addElement(cm);
      }
   }

   public int size() {return colMaps.size();}

   public boolean getIsMapped(int i) {
      ColumnMap cm=(ColumnMap)colMaps.elementAt(i);
      if (cm.getFileColumn() != null &&
          cm.isMappable())
         return true;
      else
         return false;
   }

   public void setIsMappable(int i, boolean b) {
      ColumnMap cm=(ColumnMap)colMaps.elementAt(i);
      cm.setMappable(b);
   }

   public boolean getIsMappable(int i) {
      ColumnMap cm=(ColumnMap)colMaps.elementAt(i);
      return cm.isMappable();
   }

   public void setColMap(int i, String tc) {
      ColumnMap cm=(ColumnMap)colMaps.elementAt(i);
      SQLColumn col=sqlTable.getColumn(tc);
      cm.setTableColumn(col);
   }

   public void setFileColumn(int i, String fc) {
      ColumnMap cm=(ColumnMap)colMaps.elementAt(i);
      int fci=fileColumns.indexOf(fc);
      cm.setFileColumn(fc, fci);
   }

   public void setDefaultValue(int i, String def){
      ColumnMap cm=(ColumnMap)colMaps.elementAt(i);
      cm.setDefaultValue(def);
   }

   public String getDefaultValue(int i){
      ColumnMap cm=(ColumnMap)colMaps.elementAt(i);
      return cm.getDefaultValue();
   }

   public String getFileColumn(int i) {
      ColumnMap cm=(ColumnMap)colMaps.elementAt(i);
      return cm.getFileColumn();
   }

   public SQLColumn getTableColumn(int i) {
      ColumnMap cm=(ColumnMap)colMaps.elementAt(i);
      return cm.getTableColumn();
   }

   public ColumnMap getColumnMap(int i) {
      return (ColumnMap)colMaps.elementAt(i);
   }

   /** */
   public ColumnMap getColumnMap(String name) {
      ColumnMap cm=null;
      for (int i=0; i<colMaps.size(); i++) {
         cm=(ColumnMap)colMaps.elementAt(i);
         if (cm.getColumnName().equals(name))
            return cm;
      }
      return null;
   }
   
   public Vector getMappedColumns() {
      Vector v=new Vector();
      for (int i=0; i<colMaps.size(); i++) {
         ColumnMap cm=(ColumnMap)colMaps.elementAt(i);
         if (cm.isMapped()){
            v.add(cm.getColumnName());

            // log.writeDebug("added mapped "+cm+" to mapped columns");
         } else if (cm.isDefaulted()){
            v.add(cm.getColumnName());
            // log.writeDebug("added defaulted "+cm+" to mapped columns");
         }
      }
      return v;
   }

   public String toString() {
      StringBuffer sb=new StringBuffer();
      for (int i=0; i<colMaps.size(); i++) {
         sb.append(((ColumnMap)colMaps.elementAt(i)).toString()+"\n");
      }
      return sb.toString();
   }
}
