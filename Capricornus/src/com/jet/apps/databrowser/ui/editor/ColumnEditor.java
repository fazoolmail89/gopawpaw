package com.jet.apps.databrowser.ui.editor;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import com.jet.database.*;

import java.util.*;
import java.util.Date;

import java.sql.Timestamp;
import java.sql.Types;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.jet.log.Logger;

// DateTimeField
import com.jet.utils.ui.*;

import com.jet.apps.databrowser.database.Null;

/** 
 * This is a UI component able to edit a single column within a 
 * JDBC based table - if this table has 'simple' type - ie, no
 * BLOBs or strange data types.
 *
 * @author Paul Bemowski
 */
public class ColumnEditor 
   implements ActionListener, DataEditorConstants, Logger
{
   SQLColumn column=null;
   SQLType type=null;
   JLabel label=null;
   JTextComponent field=null;      

   int fieldType=UNKNOWN;

   JCheckBox nullCheck=null;

   int mode=-1;

   /** This is the initial value object. */
   Object initialValue=null;

   /** */
   public ColumnEditor(SQLColumn col, int mo, Object ival) {
      column=col;
      mode=mo;
      initialValue=ival;

      type=col.getType();
         
      setFieldType(type);

      nullCheck=new JCheckBox("NULL");
      nullCheck.addActionListener(this); // disables the field if NULL==true

      label=new JLabel(col.getName());
         
      if (mode == UPDATE) {
         // Object value=editingData.get(col.getName());

         //if (mode == UPDATE)
         //   initialValue=value;


         if (initialValue instanceof String) {
            String s=(String)initialValue;
            if (s.indexOf("\n") != -1)
               field=new PopupTextArea(3, 20);
            else
               field=new PopupTextField(20);
            field.setText(s);
         }
         else if (initialValue instanceof java.sql.Date) {
            field=new DateTimeField(DateTimeField.DATE_MODE);
            DateTimeField dtf=(DateTimeField)field;
            dtf.setDate((java.util.Date)initialValue);
         }
         else if (initialValue instanceof java.sql.Time) {
            field=new DateTimeField(DateTimeField.TIME_MODE);               
            DateTimeField dtf=(DateTimeField)field;
            dtf.setDate((java.util.Date)initialValue);
         }
         else if (initialValue instanceof java.sql.Timestamp) {
            field=new DateTimeField(DateTimeField.TIMESTAMP_MODE);
            DateTimeField dtf=(DateTimeField)field;
            dtf.setDate((java.sql.Timestamp)initialValue);
            dtf.setNanos(((java.sql.Timestamp)initialValue).getNanos());
         }
         else if (initialValue instanceof java.util.Date) {
            field=new DateTimeField(DateTimeField.DATE_TIME_MODE);
            DateTimeField dtf=(DateTimeField)field;
            dtf.setDate((java.util.Date)initialValue);
         }
         else if (initialValue instanceof Null) {
            // FIXME: ok, now we have to guess the field type based on the
            // insert method shown below.
            field=fieldByType();
            field.setEnabled(false);
            nullCheck.setSelected(true);
         }
         else {
            field=new PopupTextField(20);
            if (initialValue != null) 
               field.setText(initialValue.toString());
            // else - it is empty (if initialValue is null)
            // this is to fix ticket 1185 - where this was causing an NPE, 
            // but I don't know how this could have been null.  
         }

      }
      else { // INSERT MODE
         field=fieldByType();
      }
         
      // sets the color of the label.
      if (mode == INSERT) {
         if (col.isPrimaryKey()) {
            label.setForeground(Color.red);
            label.setToolTipText("PRIMARY KEY");
            nullCheck.setEnabled(false);
         }
         else if (!col.isNullable()) {
            label.setForeground(Color.blue);
            label.setToolTipText("NON NULL");
            nullCheck.setEnabled(false);
         }
         else
            label.setForeground(Color.black);
      }
      else if (mode == UPDATE) {
         if (col.isPrimaryKey()) {
            label.setForeground(Color.red);
            label.setToolTipText("PRIMARY KEY");
            field.setEnabled(false);
            nullCheck.setEnabled(false);
         }
         else if (!col.isNullable()) {
            label.setForeground(Color.blue);
            label.setToolTipText("NON NULL");
            nullCheck.setEnabled(false);
         }
         else
            label.setForeground(Color.black);
      }

      field.setToolTipText("SQL TYPE: "+type.getName());
   }

   /** */
   public JTextComponent fieldByType() {
      JTextComponent f=null;
      switch(fieldType) {
         case STRING_FIELD:
         case NUMERIC_FIELD:
            f=new PopupTextField(20);
            break;
         case DATE_FIELD:
            f=new DateTimeField(DateTimeField.DATE_MODE);
            break;
         case TIME_FIELD:
            f=new DateTimeField(DateTimeField.TIME_MODE);
            break;
         case DATE_TIME_FIELD:
            f=new DateTimeField(DateTimeField.DATE_TIME_MODE);
            break;
         case TIMESTAMP_FIELD:
            f=new DateTimeField(DateTimeField.TIMESTAMP_MODE);
            break;
         default:
            f=new PopupTextField(20);
      }
      return f;
   }

   /** */
   public void setFieldType(SQLType type) {
      fieldType=type.getFieldType();

//       String typename=type.getName();
//       int itype=type.getIType();
//       log.writeDebug(5, "Setting field type: typename='"+
//                      typename+"' itype="+itype);
         
//       if (typename.equalsIgnoreCase("char") ||
//           typename.equalsIgnoreCase("varchar") ||
//           typename.equalsIgnoreCase("varchar2") ||
//           itype == Types.CHAR ||
//           itype == Types.LONGVARCHAR ||
//           itype == Types.VARCHAR) 
//          fieldType=STRING_FIELD;
//       else if (itype == Types.DATE) 
//          fieldType=DATE_FIELD;
//       else if (itype == Types.TIME)
//          fieldType=TIME_FIELD;
//       else if (itype == Types.TIMESTAMP)
//          fieldType=TIMESTAMP_FIELD;
//       else if (itype == Types.DECIMAL ||
//                itype == Types.DOUBLE ||
//                itype == Types.FLOAT ||
//                itype == Types.INTEGER ||
//                itype == Types.REAL ||
//                itype == Types.SMALLINT ||
//                itype == Types.TINYINT) {
//          fieldType=NUMERIC_FIELD;
//       }
//       else
//          fieldType=UNKNOWN;
//       log.writeDebug(5, "  Type set to "+DataEditor.typeToString(fieldType));
   }

   /** */
   public int getFieldType() {return fieldType;}

   public JLabel getLabel() {return label;}
      
   public JTextComponent getField() {return field;}
      
   public JCheckBox getNullCheck() {return nullCheck;}

   public SQLColumn getColumn() {return column;}

   public String getString() {return field.getText();}
      
   public Object getInitialValue() {return initialValue;}

   /** */
   public Object getValue() {
      if (isNullChecked()) 
         return new Null();
      else if (field instanceof DateTimeField) {
         DateTimeField dtf=(DateTimeField)field;
         if (dtf.getMode() == DateTimeField.TIMESTAMP_MODE)
            return getTimestamp();
         else
            return getDate();
      } 
      else {
         // return a string
         return field.getText();
      }
   }

   public Date getDate() {
      if (field instanceof DateTimeField) {
         DateTimeField dtf=(DateTimeField)field;
         return dtf.getDate();
      }
      else {
         return null;
      }
   }

   public Timestamp getTimestamp() {
      Date d=getDate();
      if (d == null)
         return null;
      if (field instanceof DateTimeField) {
         DateTimeField dtf=(DateTimeField)field;
         Timestamp ts=new Timestamp(d.getTime());
         ts.setNanos(dtf.getNanos());
         return ts;
      } else {
         throw new RuntimeException("ERROR: DataEditor state error: "+
                                    "Date value required but fiels not "+
                                    "instanceof DateTimeField");
      }
   }

   public int getWidth() {
      log.writeDebug(25, "field: "+field.getSize().width+" label: "+
                     label.getSize().width+" width: "+
                        
                     (field.getSize().width+label.getSize().width+
                      nullCheck.getSize().width));
      return field.getWidth()+label.getWidth()+nullCheck.getSize().width;
   }
      
   public boolean isModified() {
      if (initialValue != null) {

         if (initialValue instanceof Null) {
            if (nullCheck.isSelected())
               return false;
            else 
               return true;
         } else if (initialValue instanceof java.sql.Timestamp) {
            if (nullCheck.isSelected())
               return true;

            if (field instanceof DateTimeField) {
               DateTimeField dtf=(DateTimeField)field;
               Date d=dtf.getDate();
               int nanos=dtf.getNanos();
                  
               if (d != null) {
                  DateFormat formatter=
                  new SimpleDateFormat("MMddyyyyHHmmss");
                  java.sql.Timestamp ts=(java.sql.Timestamp)initialValue;
                  if (formatter.format(d).equals(formatter.format(ts)) &&
                      nanos==ts.getNanos())
                     return false;
                  else 
                     return true;
               } 
               else 
                  return false;
            }
            else {
               throw new RuntimeException("Field-Data mismatch in column "+
                                          column);
            }
         } else if (initialValue instanceof java.util.Date) {
            if (nullCheck.isSelected())
               return true;

            if (field instanceof DateTimeField) {
               DateTimeField dtf=(DateTimeField)field;
               Date d=dtf.getDate();
               if (d != null) {
                  if (initialValue.equals(d))
                     return false;
                  else {
                     if (initialValue instanceof java.sql.Timestamp) {
                        Date temp=new java.util.Date(((java.sql.Timestamp)initialValue).getTime());
                        if (!temp.equals(d))
                           return true;
                        else 
                           return false;
                     }
                     else {
                        //System.out.println ("iv ("+
                        //                    initialValue.getClass().getName()+
                        //                    ") "+
                        //                    initialValue+
                        //                    " != java.util.date "+d);
                        return true;
                     }
                  }
               }
            }
            else {
               throw new RuntimeException("Field-Data mismatch in column "+
                                          column);
            }
         }
         else {
            if (nullCheck.isSelected())
               return true;

            String value=field.getText();
            String iv=initialValue.toString();
            // System.out.println ("iv instance of "+initialValue.getClass().getName());
            //System.out.println ("iv vs txt: "+iv+" txt: "+value);
            if (value==null)
               value="";
            if (iv.equals(value))
               return false;
            else
               return true;
         }
      }
      return true;
   }


   public String toString() {
      return 
      "\nColumn: "+column.getName()+"\n"+
      "      PK:"+column.isPrimaryKey()+"\n"+
      "    Null:"+isNull()+"\n"+
      "     mod:"+isModified()+"\n"+
      "    type:"+DataEditor.typeToString(fieldType)+"\n"+
      "   value:"+field.getText()+"\n"+
      " IVClass:"+(initialValue == null ? 
                   "null":initialValue.getClass().getName());
   }

   public boolean isPrimaryKey() {
      return column.isPrimaryKey();
   }
      
   public boolean isNullChecked() {
      return nullCheck.isSelected();
   }
      
   public boolean isNull() {return isNullChecked();}

   public void disable() {label.setEnabled(false); field.setEnabled(false);}
   public void enable() {label.setEnabled(true); field.setEnabled(true);}
   public void clear() {field.setText("");}

   public void actionPerformed (ActionEvent ae) {
      // nullCheck is the only one listening right now.
      if (nullCheck.isSelected())
         field.setEnabled(false);
      else
         field.setEnabled(true);
   }
}
