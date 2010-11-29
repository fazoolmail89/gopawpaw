package com.jet.apps.databrowser.ui;

import java.awt.*;
import java.awt.event.*;

import java.util.List;
import java.util.*;

import javax.swing.*;

import javax.swing.plaf.basic.*;

import com.jet.apps.databrowser.model.*;

/**
 *
 */
public class ResultsTabPane extends JTabbedPane
{
   DBSession session=null;

   List tabComponents=new ArrayList();

   ClosableTabbedPaneUI closableUI=null;
   
   /** */
   public ResultsTabPane(DBSession s) {
      super();
      session=s;
      
      closableUI=new ClosableTabbedPaneUI();
      this.setUI(closableUI);
   }

   /** */
   public void updateUI() {
      super.updateUI();
      this.setUI(closableUI);
   }

   /** */
   public void setSession(DBSession ses) {
      session=ses;
   }

   /** */
   public Component add(String title, Component c) {
      internalAdd(title, c, true, -1);
      return c;
   }

   /** */
   public void add(String title, Component c, boolean cl) {
      internalAdd(title, c, cl, -1);
   }

   /** */
   public void add(String title, Component c, int i) {
      internalAdd(title, c, true, i);
   }

   public void add(String title, Component c, boolean closable, int index) {
      internalAdd(title, c, closable, index);
   }
   
   //resultsTabPane.addTab("Query", null, tablePanel, tip);
   public void addTab(String title, Icon icon, Component c, String tip) {
      internalAdd(title, c, true, -1);
      setToolTipTextAt(tabComponents.size()-1, tip);
   }


   /** */
   void internalAdd(String title, Component c, boolean closable, int index) {
      TabComponent tc=new TabComponent(c, title, closable);

      if (index == -1) {
         tabComponents.add(tc);
         super.add(c, title);
      } else {
         tabComponents.add(index, tc);
         super.insertTab(title, null, c, null, index);
      }
   }

   /** */
   public void remove(int index) {
      Component comp=getComponentAt(index);
      super.remove(index);
      tabComponents.remove(index);
      close(comp);
   }

    public void remove(Component comp) {
       remove(indexOfComponent(comp));
    }

   /** */
   void close(Component comp) {
      if (comp instanceof RSTablePanel) {
         RSTablePanel rstp=(RSTablePanel)comp;
         rstp.close();
      }
   }

   /**  */
   class TabComponent {
      Component component=null;
      String title=null;
      boolean closable=true;
      
      public TabComponent(Component c, String t, boolean cl) {
         component=c;
         title=t;
         closable=cl;
      }

      boolean isClosable() {
         return closable;
      }
   }

   /** */
   public class ClosableTabbedPaneUI extends BasicTabbedPaneUI {
      
      // have protected access to tabPane which is a handle to the 
      // actual tabPane
      
      public ClosableTabbedPaneUI() {
         super();
      }
      
      protected void paintTab(Graphics g, int tabPlacement,
                              Rectangle[] rects, int tabIndex,
                              Rectangle iconRect, Rectangle textRect) {

         super.paintTab(g,tabPlacement,rects,tabIndex,iconRect,textRect);
         TabComponent tc=(TabComponent)tabComponents.get(tabIndex);
         
         if (tc.isClosable()) {
            Rectangle rect=rects[tabIndex];
            g.setColor(Color.black);
            g.drawRect(rect.x+5,rect.y+5,10,10);
            g.drawLine(rect.x+5,rect.y+5,rect.x+15,rect.y+15);
            g.drawLine(rect.x+15,rect.y+5,rect.x+5,rect.y+15);
         }
      }

      protected int calculateTabWidth(int tabPlacement, int tabIndex, 
                                      FontMetrics metrics) {
         TabComponent tc=(TabComponent)tabComponents.get(tabIndex);
         
         if (tc != null && tc.isClosable()) 
            return super.calculateTabWidth(tabPlacement,tabIndex,metrics)+20;
         else
            return super.calculateTabWidth(tabPlacement, tabIndex, metrics);
      }

      protected MouseListener createMouseListener() {
         return new MyMouseHandler();
      }

      class MyMouseHandler extends MouseHandler {
         public MyMouseHandler() {
            super();
         }
         public void mouseClicked(MouseEvent e) {
            int x=e.getX();
            int y=e.getY();
            int tabIndex=-1;
            int tabCount = tabPane.getTabCount();
            for (int i = 0; i < tabCount; i++) {
               if (rects[ i ].contains(x, y)) {
                  tabIndex= i;
                  break;
               }
            }

            if (tabIndex > -1) {
               TabComponent tc=(TabComponent)tabComponents.get(tabIndex);
               if (tc.isClosable()) {
                  Rectangle tabRect=rects[tabIndex];
                  x=x-tabRect.x;
                  y=y-tabRect.y;
                  if ((x>=5) && (x<=15) && (y>=5) && (y<=15)) {
                     tabPane.remove(tabIndex);
                  }
               }
            }
         }
      }
   }
}
