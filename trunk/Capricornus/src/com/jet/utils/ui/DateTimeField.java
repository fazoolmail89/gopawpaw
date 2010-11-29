package com.jet.utils.ui;

import java.awt.*;
import java.awt.event.*;

import java.text.*;
import java.util.*;

import javax.swing.*;
import javax.swing.text.*;

import com.jet.log.Logger;

/*
 * $Log: DateTimeField.java,v $
 * Revision 1.7  2006/12/07 14:42:11  bemocvs
 * Added now popup
 *
 * Revision 1.6  2003/01/14 15:41:24  bemocvs
 * Removed debugging
 *
 * Revision 1.5  2003/01/14 15:31:08  bemocvs
 * Changed format a bit.
 *
 * Revision 1.4  2003/01/14 13:37:52  bemocvs
 * date field, guid.
 *
 * Revision 1.3  2003/01/03 03:20:45  bemocvs
 * 3.1.0
 *
 * Revision 1.2  2002/12/20 21:04:50  bemocvs
 * added timestamp functionality to mask
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2001/08/14 00:31:38  bemocvs
 * Fixed typo.
 *
 * Revision 1.1  2001/08/14 00:26:54  bemocvs
 * Initial checkin.
 *
 */

/**
 * This is a date, time, and datetime field.
 */
public class DateTimeField extends JTextField implements Logger, MouseListener, ActionListener
{
   public static final int TIME_MODE=0;
   public static final int DATE_MODE=1;
   public static final int DATE_TIME_MODE=2;
   public static final int TIMESTAMP_MODE=3;

   protected int mode=DATE_TIME_MODE;

   static final char date_time_mask[]=
   {'*','*','/','*','*','/','*','*','*','*',' ',
    '-','-',':','-','-',':','-','-'};
   static final char date_mask[]=
   {'*','*','/','*','*','/','*','*','*','*'};
   static final char time_mask[]=
   {'-','-',':','-','-',':','-','-'};
   static final char timestamp_mask[]=
   {'*','*','/','*','*','/','*','*','*','*',' ',
    '-','-',':','-','-',':','-','-',
    '.','-','-','-','-','-','-', '-', '-', '-'};  // 9 decimals

   static final DateFormat date_time_format=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
   static final DateFormat date_format=new SimpleDateFormat("MM/dd/yyyy");
   static final DateFormat time_format=new SimpleDateFormat("HH:mm:ss");
   static final DateFormat timestamp_format=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
   static final DecimalFormat nano_format=new DecimalFormat("000000000");

   /** */
   protected char mask[]=null;

   /** */
   protected DateFormat format=null;

   JPopupMenu mPopup=null;

   /** */
   public DateTimeField(int mode) {
      super(new DateDocument(mode), 
            null, 0);

      if (mode < TIME_MODE ||
          mode > TIMESTAMP_MODE)
         throw new RuntimeException("Invalid mode.  Mode must be DATE_MODE, "+
                                    "TIME_MODE, or DATE_TIME_MODE");
      this.mode=mode;
      switch (mode) {
         case(DATE_MODE):
            mask=date_mask;
            format=date_format;
            break;
         case (TIME_MODE):
            mask=time_mask;
            format=time_format;
            break;
         case (DATE_TIME_MODE):
            mask=date_time_mask;
            format=date_time_format;
            break;
         case (TIMESTAMP_MODE):
            mask=timestamp_mask;
            format=timestamp_format;
         default:
      }


      DateDocument dd=(DateDocument)getDocument();
      dd.setCaret(getCaret());
      dd.setMask(mask);
      
      initPopup();
   }

   private void initPopup()
   {
      JMenuItem now = new JMenuItem ("Now");
      now.setActionCommand("setNow");
      now.addActionListener(this);

      mPopup=new JPopupMenu();
      mPopup.add(now);

      this.addMouseListener(this);
   }

   /** windows */
   public void mouseReleased (MouseEvent me) {
      if (me.isPopupTrigger()) {
         showPopup(me.getPoint());
      }
   }
   /** unix */
   public void mousePressed(MouseEvent me) {
      if (me.isPopupTrigger()) {
         showPopup(me.getPoint());
      }
   }

   /** */
   public void mouseClicked(MouseEvent me) {}
   /** */
   public void mouseEntered(MouseEvent me) {}
   /** */
   public void mouseExited(MouseEvent me) {}

   /**  */
   public void actionPerformed(ActionEvent ae) {
      // We want to get the component that has focus.
      String action =ae.getActionCommand();
      // System.out.println ("Edit action: "+action);
      if (action.equals("setNow")){
         // this.copy();
         this.setDate(new Date());
         this.setNanos(0);
      }
   }


   /** */
   private void showPopup(Point p) {
      Point scrollTopLeft=new Point(0, 0);  // Tex

      Point topLeft=new Point(0, 0);
      
      topLeft.x=topLeft.x+scrollTopLeft.x;
      topLeft.y=topLeft.y+scrollTopLeft.y;
      mPopup.show(this, p.x+topLeft.x, p.y-topLeft.y);
   }
   
   /** */
   protected Document createDefaultModel() {
      return null;
   }
   
   /** */
   public int getMode() {
      return mode;
   }

   
   static class DateDocument extends PlainDocument
   {
      Caret caret=null;
      char mask[]=null;
      
      public DateDocument(int mode){
         super();
         

         //caret=c;
//           try {
//              super.insertString(0, new String (mask, 0, mask.length), null);
//           } catch (BadLocationException ex) {ex.printStackTrace();}
      }
      
      public void setCaret(Caret c){caret=c;}

      public void setMask(char mask[]) {
         this.mask=mask;
         try {
            super.insertString(0, new String (mask, 0, mask.length), null);
         } catch (BadLocationException ex) {ex.printStackTrace();}         
      }
      
      public void insertString(int offs, String str, AttributeSet a)
         throws BadLocationException {
         // System.out.println ("inserting string "+str+" at offset "+offs);
         if (str != null) {
            char chars[]=str.toCharArray();
            for (int i=0; i<chars.length; i++) {
               int pos=offs+i;
               
               if (Character.isDigit(chars[i]) &&
                   pos <= mask.length-1) {
                  if (mask[pos] != '/' &&
                      mask[pos] != ' ' &&
                      mask[pos] != ':' &&
                      mask[pos] != '.') {
                     super.remove(pos, 1);
                     super.insertString(pos, new String(chars, i, 1), a);
                  }
                  else {
                     super.remove(pos+1, 1);
                     super.insertString(pos+1, new String(chars, i, 1), a);
                  }
               }

               if (pos+1 < (mask.length - 1) &&
                   (mask[pos+1] == '/' ||
                    mask[pos+1] == ' ' ||
                    mask[pos+1] == ':' ||
                    mask[pos+1] == '.'))
               {
                  caret.setDot(pos+2);
                  i++;
               }
            }
         }
      }
         
      public void remove(int offset, int len)
         throws BadLocationException {
         super.remove(offset, len);
         super.insertString(offset, new String(mask, offset, len), null);
         caret.setDot(caret.getDot() - len);
         
         if (offset - 1 > 0 &&
             mask[offset - 1] == '/')
            caret.setDot(caret.getDot() -1);
      }
   }

   public Date getDate() {
      Date d=null;
      try {
         if (mode==TIMESTAMP_MODE) {
            d=format.parse(getText().substring(0, 20));
         }
         else {
            d=format.parse(getText());
         }
      } catch (Exception ex) {
         log.writeError(1,"Unable to parse date from "+
                        getText()+" returning null.", ex);}
      return d;
   }

   public void setDate(Date d) {
      if (mode == TIMESTAMP_MODE) {
         setText(format.format(d)+getText().substring(21));
      } else {
         setText(format.format(d));
      }
   }

   public int getNanos() {
      if (mode==TIMESTAMP_MODE) {
         String tmp=getText().substring(20);
         //System.out.println ("0123456789012345678901234567890");
         //System.out.println ("'"+getText()+"' tmp '"+tmp+"'");
         try {return Integer.parseInt(tmp);}
         catch (Exception ex) {
            ex.printStackTrace();
            return 0;
         }
      }
      return 0;
   }
   
   public void setNanos(int nanos) {
      if (mode == TIMESTAMP_MODE) {
         setText(getText().substring(0, 20)+nano_format.format(nanos));
      }
   }

   public static void main(String args[]) throws Exception {
      JFrame frame=new JFrame();
      JButton b=new JButton("dump");
      DateTimeField d=new DateTimeField(DATE_MODE);
      DateTimeField t=new DateTimeField(TIME_MODE);
      DateTimeField dt=new DateTimeField(DATE_TIME_MODE);
      DateTimeField ts=new DateTimeField(TIMESTAMP_MODE);
      b.addActionListener(new dal(d, t, dt, ts));
      
      dt.setDate(date_time_format.parse("08/10/2001 09:30:00"));
      frame.getContentPane().setLayout(new GridLayout(4, 1));
      frame.getContentPane().add(d);
      frame.getContentPane().add(t);
      frame.getContentPane().add(dt);
      frame.getContentPane().add(ts);
      ts.setNanos(232);
      frame.getContentPane().add(b);
      frame.pack();


      WinUtil.alignCenter(frame);
      frame.show();
   }
   static class dal implements ActionListener
   {
      DateTimeField t=null;
      DateTimeField d=null;
      DateTimeField dt=null;
      DateTimeField ts=null;
      public dal(DateTimeField t,DateTimeField d,DateTimeField dt,
                 DateTimeField ts) {
         this.t=t;
         this.d=d;
         this.dt=dt;
         this.ts=ts;
      }
      public void actionPerformed(ActionEvent ae) {
         System.out.println (date_time_format.format(t.getDate()));
         System.out.println (date_time_format.format(d.getDate()));
         System.out.println (date_time_format.format(dt.getDate()));
         System.out.println (date_time_format.format(ts.getDate())+"."+
                             nano_format.format(ts.getNanos()));
      }
   }
}








