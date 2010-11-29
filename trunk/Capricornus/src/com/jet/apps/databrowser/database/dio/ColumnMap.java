package com.jet.apps.databrowser.database.dio;

import com.jet.database.*;


/** */
public class ColumnMap
{
   /** The SQLColumn.  This cannot be null. */
   SQLColumn tableColumn=null;

   String fileColumn;
   int fileColumnIndex=-1;
   String defaultValue=null;

   boolean mappable=true;

   /** */
   ColumnMap(SQLColumn col, String fc, int fci) {
      tableColumn=col;
      fileColumn=fc;
      fileColumnIndex=fci;
   }

   public String getColumnName() {return tableColumn.getName();}

   public void setTableColumn(SQLColumn s) {tableColumn=s;}
   public SQLColumn getTableColumn() {return tableColumn;}

   public void setFileColumn (String fc, int fci) {
      fileColumn=fc;
      fileColumnIndex=fci;
   }

   public String getFileColumn() {return fileColumn;}
   public int getFileColumnIndex() {return fileColumnIndex;}
      
   public boolean isMappable() {return mappable;}
   public void setMappable(boolean b) {mappable=b;};

   public void setDefaultValue(String def) {defaultValue=def;}
   public String getDefaultValue() {return defaultValue;}

   public boolean isMapped() {
      if (fileColumnIndex > -1)
         return true;
      return false;
   }

   public boolean isDefaulted() {
      if (defaultValue != null)
         return true;
      return false;
   }

   public String toString() {
      StringBuffer sb=new StringBuffer();
      sb.append(tableColumn.getName()+"{"+tableColumn.getType()+
                "} fci:"+fileColumnIndex+" ->");

      if (fileColumn != null && fileColumnIndex > -1)
         sb.append(" File: "+fileColumn+"["+fileColumnIndex+"]");
      else if (defaultValue != null)
         sb.append(" Default: '"+defaultValue+"'");
      else 
         sb.append(" UNMAPPED");
      return sb.toString();
   }
}
