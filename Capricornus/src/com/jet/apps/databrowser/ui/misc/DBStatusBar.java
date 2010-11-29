package com.jet.apps.databrowser.ui.misc;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.SQLException;

import com.jet.log.Logger;
import java.util.*;

import com.jet.apps.databrowser.event.*;
import com.jet.apps.databrowser.model.*;
import com.jet.apps.databrowser.database.*;

/**
 * Generic 3 window status bar with syncrhonized methods.
 *
 */
public class DBStatusBar extends JPanel implements Logger, Observer, DBEvents
{
   JPanel left, right, center;
   JLabel leftLabel, rightLabel, centerLabel;

   Color defaultForeground=null;

   JLabel autocommit=new JLabel();
   JLabel connected=new JLabel();
   
   DBSession dbSession=null;
   
   /** */
   public DBStatusBar(DBSession session) {
      dbSession=session;
      this.setLayout(new BorderLayout());
         
      left=new JPanel();
      //center=new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
      center=new JPanel(new BorderLayout());
      right=new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
         
      left.setBorder(new EtchedBorder(EtchedBorder.RAISED));
      center.setBorder(new EtchedBorder(EtchedBorder.RAISED));
      right.setBorder(new EtchedBorder(EtchedBorder.RAISED));
      
      leftLabel=new JLabel();
      leftLabel.setForeground(Color.black);
      left.add(leftLabel);
      
      centerLabel=new JLabel();
      centerLabel.setForeground(Color.black);
      center.add(centerLabel, "West");

      autocommit.setEnabled(false);
      autocommit.setIcon(IconManager.getInstance().getIcon("rollback"));
      autocommit.setToolTipText("not connected");

      connected.setEnabled(false);
      connected.setIcon(IconManager.getInstance().getIcon("database"));
      connected.setToolTipText("not connected");

      right.add(autocommit);
      right.add(connected);
//       rightLabel=new JLabel();
//       right.add(rightLabel);

         
      defaultForeground=leftLabel.getForeground();
      
      // this.add(left, "West");
      this.add(center, "Center");
      this.add(right, "East");
   }

   /** */
   public synchronized void setCenter(String txt) {
      setCenter(txt, null);
   }

   /** */
   public synchronized void setCenter(String txt, Color c) {
      Color color=c;
      if (color == null)
         color=defaultForeground;

      centerLabel.setForeground(color);
      centerLabel.setText(txt);
   }

   public synchronized void setLeft(String txt) {
      setLeft(txt, null);
   }

   public synchronized void setLeft(String txt, Color c) {
      Color color=c;
      if (color == null)
         color=defaultForeground;
      
      leftLabel.setForeground(color);
      leftLabel.setText(txt);
   }

   public synchronized void setRight(String txt) {
      setRight(txt, null);
   }

   public synchronized void setRight(String txt, Color c) {
      Color color=c;
      if (color == null)
         color=defaultForeground;
      
      rightLabel.setForeground(color);
      rightLabel.setText(txt);
      rightLabel.invalidate();
      rightLabel.repaint();
   }

   /** */
   public void update(Observable o, Object obj) {
      DBEvent event=(DBEvent)obj;
      int code=event.getCode();
      switch (code) {
         case (DATABASE_CONNECT): 
            autocommit.setEnabled(true);
            
            ConnectionInfo ci=dbSession.getConnectionInfo();
            ci.addObserver(this);

            HashMap iconsByDriver=DatabaseCustomization.getIconsByDriver();
            ImageIcon icon=(ImageIcon)iconsByDriver.get(ci.getDriver());
            if (icon != null) {
               connected.setIcon(icon);
            }
            else {
               connected.setIcon(IconManager.getInstance().
                                 getIcon("database"));
            }
            connected.setEnabled(true);
            connected.
            setToolTipText("<html><font face=\"Arial,Helvetica\">"+
                           ci.getName()+"<br>"+ci.getDriver()+
                           "</font></html>");

         case (CONNECTION_STATE): 
            ci=dbSession.getConnectionInfo();
            boolean autocommitMode=true;
            try {
               autocommitMode=ci.getAutocommit();
            } catch (SQLException ex) {
               log.writeDebug(1, "Unable to get AutoCommit mode, assuming on.");
            }
            if (autocommitMode) {
               autocommit.setToolTipText("Autocommit ON");
               autocommit.setIcon(IconManager.getInstance().getIcon("commit"));
            }else{
               autocommit.setToolTipText("Autocommit OFF");
               autocommit.setIcon(IconManager.getInstance().getIcon("rollback"));            
            }
            
            break;
         case (DATABASE_DISCONNECT): 
            autocommit.setEnabled(false);
            autocommit.setIcon(IconManager.getInstance().getIcon("rollback"));
            autocommit.setToolTipText(null);

            connected.setEnabled(false);
            connected.setIcon(IconManager.getInstance().getIcon("database"));
            connected.setToolTipText(null);
            break;
         default:      
      }
   }
}




