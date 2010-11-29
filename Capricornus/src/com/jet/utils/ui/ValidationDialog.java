package com.jet.utils.ui;

import javax.swing.*;
import javax.swing.table.*;

import java.awt.*;
import java.awt.event.*;

import com.jet.utils.exception.ValidationException;

/**
 * Description of the class
 *
 * @author Paul Bemowski
 */
public class ValidationDialog extends JDialog
{
   JTextArea fieldAreas[];
   JTextArea correctionAreas[];


   public ValidationDialog(Frame parent, ValidationException valEx)
   {
      super (parent, "Validation Information", true);
      this.setSize(400, 250);
      //this.setResizable(false);
      this.setLocation(WinUtil.alignCenter(this));
      fieldAreas=new JTextArea[valEx.getErrorCount()];
      correctionAreas=new JTextArea[valEx.getErrorCount()];
      layoutPanel(valEx);
   }


   
   private void layoutPanel(ValidationException valEx)
   {
      this.getContentPane().setLayout(new BorderLayout());
      JPanel centerPanel=new JPanel(new GridLayout(1,1));

      ScrollableTablePanel tablePanel;
      tablePanel=new ScrollableTablePanel(new GridBagLayout());

      GridBagConstraints c=new GridBagConstraints();
      c.weightx=c.weighty=.1;
      c.gridheight=c.gridwidth=1;
      c.gridx=c.gridy=0;
      c.fill=c.BOTH;
      c.anchor=c.CENTER;
      c.insets=new Insets(2, 2, 2, 2);
      
      JLabel fieldLabel=new JLabel("Field");
      JLabel correctionLabel=new JLabel("Corrective Action");

      fieldLabel.setHorizontalAlignment(JLabel.CENTER);
      correctionLabel.setHorizontalAlignment(JLabel.CENTER);

      JPanel topPanel=new JPanel(new GridLayout (1, 2));
      topPanel.add (fieldLabel);
      topPanel.add (correctionLabel);

      getContentPane().add(topPanel, "North");
      
      //tablePanel.add(fieldLabel, c);
      //c.gridx=1;
      //tablePanel.add(correctionLabel, c);
      c.weightx=c.weighty=.9;
      for (int i=0; i<valEx.getErrorCount(); i++)
      {
         String text;
         int rows;
         int cols=20;
         c.gridy=i+1; c.gridx=0;
         text=valEx.getField(i);
         rows=(int)(text.length()/cols);
         fieldAreas[i]=new JTextArea(text, rows, cols-4);
         fieldAreas[i].setLineWrap(true);
         fieldAreas[i].setWrapStyleWord(true);
         fieldAreas[i].setEditable(false);
         tablePanel.add(fieldAreas[i], c);

         c.gridx=1;
         
         text=valEx.getCorrection(i);
         rows=(int)(text.length()/cols);
         correctionAreas[i]=new JTextArea(text, rows, cols-4);
         correctionAreas[i].setLineWrap(true);
         correctionAreas[i].setWrapStyleWord(true);
         correctionAreas[i].setEditable(false);
         tablePanel.add(correctionAreas[i], c);

         // System.out.println ("CorrRows:"+correctionAreas[i].getRows());
         // System.out.println ("FieldRows: "+correctionAreas[i].getRows());
      }
      
      JScrollPane scroller=
      new JScrollPane(tablePanel,
                      ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                      ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      centerPanel.add(scroller);

      this.getContentPane().add(centerPanel, "Center");

      JPanel southPanel=new JPanel();

      JButton okButton=new JButton("OK");
      okButton.setActionCommand("ok");
      southPanel.add(okButton);
      
      this.getContentPane().add(southPanel, "South");

      ActionHandler ah=new ActionHandler();
      okButton.addActionListener(ah);
   }


   public class ScrollableTablePanel extends JPanel
   implements Scrollable
   {
      public ScrollableTablePanel(LayoutManager man)
      {
         super(man);//Never made any money, Savin' the world from Solomon Grundy
      }
      
      /**
       * Returns the preferred size of the viewport for a view component.
       */
      public java.awt.Dimension getPreferredScrollableViewportSize()
      {
         return this.getPreferredSize();
      }

      /**
        Components that display logical rows or columns should compute
        the scroll
        increment that will completely expose one block of rows or
        columns, depending on
        the value of orientation. 
        */
      public int getScrollableBlockIncrement(java.awt.Rectangle visibleRect,
                                             int orientation, int direction)
      {
         return 50;
      }

      /**
        Return true if a viewport should always force the height of
        this Scrollable to
        match the height of the viewport. 
       */
      public boolean getScrollableTracksViewportHeight()
      {
         return false;
      }

      /**
        Return true if a viewport should always force the width
        of this Scrollable to
        match the width of the viewport. 
       */
      public boolean getScrollableTracksViewportWidth()
      {
         return true;
      }

      /**
       Components that display logical rows or columns should
       compute the scroll
       increment that will completely expose one new row or column,
       depending on the
       value of orientation. 
       */
      public int getScrollableUnitIncrement(java.awt.Rectangle visibleRect,
                                            int orientation, int direction)
      {
         return 10;
      }
   }


   
   public static void showValidation(Component comp, ValidationException ex)
   {
      ValidationDialog vd=new ValidationDialog (WinUtil.findParentFrame(comp),
                                                ex);
      vd.show();  // this will block
   }


   private class ActionHandler implements ActionListener
   {
      public void actionPerformed (ActionEvent ae)
      {
         String action=ae.getActionCommand();
         if (action.equals("ok"))
         {
            dispose();
         }
      }
   }
}
