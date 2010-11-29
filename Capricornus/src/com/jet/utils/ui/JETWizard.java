package com.jet.utils.ui;

import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.*;

import com.jet.log.*;

import com.jet.utils.exception.ValidationException;
import com.jet.utils.properties.*;

/**
 * Superclass for all wizard interfaes.  Provides wizard style navigation
 * etc.
 *
 */
public abstract class JETWizard extends JDialog
   implements ActionListener, Logger
{
   protected Frame owner;
   
   Vector panels=new Vector();

   JButton nextButton, prevButton, finishButton, cancelButton;

   JPanel contentPanel=null;

   int index=0;

   /**
    *
    */
   public JETWizard(Frame frame) {
      // if you change this to non-blocking (non-modal) there could
      // be problems in MainWin running the configuration wizard
      // at startup.
      // pab, 10/20/2001.  6:52 pm saturday.
      super(frame, true); 
      owner=frame;
      Container cp=getContentPane();
      cp.setLayout(new BorderLayout());
      
      nextButton=new JButton("Next >");
      nextButton.setActionCommand("next");
      nextButton.addActionListener(this);

      prevButton=new JButton("< Previous");
      prevButton.setActionCommand("prev");
      prevButton.addActionListener(this);

      finishButton=new JButton("Finish");
      finishButton.setActionCommand("finish");
      finishButton.addActionListener(this);

      cancelButton=new JButton("Cancel");
      cancelButton.setActionCommand("cancel");
      cancelButton.addActionListener(this);

      JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
      buttonPanel.add(prevButton);
      buttonPanel.add(nextButton);
      buttonPanel.add(finishButton);
      buttonPanel.add(cancelButton);

      cp.add(buttonPanel, "South");

      contentPanel=new JPanel(new GridLayout(1,1));

      cp.add(contentPanel, "Center");
   }

   public void show()
   {
      // set the first panel
      index=0;
      JPanel p=(JPanel)panels.elementAt(index);
      contentPanel.removeAll();
      contentPanel.add(p);
      enableButtons();
      super.show();
   }
   
   protected void addWizardPanel(JETWizardPanel p)
   {
      panels.addElement(p);
   }


   /** */
   public void setWaitCursor(){
      setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
   }
    
   /** */
   public void setNormalCursor(){
      setCursor(Cursor.getDefaultCursor());
   }

   /**
    * Subclassers must override.  Called when the finish button is finally
    * pressed.  Before finish is called, however, next() is called on
    * the final panel to support validation, and completing the 
    * wizard process.
    */
   public abstract void finish();

   /**
    *
    */
   public void actionPerformed(ActionEvent ae)
   {
      String action=ae.getActionCommand();
      log.writeDebug ("Action performed :"+action);
      if (action.equals("cancel"))
      {
         this.dispose();
      }
      else if (action.equals("finish"))
      {
         // get properties for return, then exit
         JETWizardPanel current=(JETWizardPanel)panels.elementAt(index);
         try {
            log.writeDebug ("JETWizard moving next");
            current.next();
         } catch (ValidationException ex) {
            ValidationDialog.showValidation(this, ex);
            return;
         }

         this.dispose();

         finish();
      }
      else if (action.equals("next"))
      {
         JETWizardPanel current=(JETWizardPanel)panels.elementAt(index);
         JETWizardPanel next=(JETWizardPanel)panels.elementAt(index+1);
         try {
            log.writeDebug ("JETWizard moving next");
            current.next();
         } catch (ValidationException ex) {
            ValidationDialog.showValidation(this, ex);
            return;
         }

         next.onEnter();
         index++;
         contentPanel.removeAll();
         contentPanel.add(next);
         next.revalidate();
         contentPanel.revalidate(); // invalidate();
         this.repaint();
      }
      else if (action.equals("prev"))
      {
         index--;
         JPanel p=(JPanel)panels.elementAt(index);
         contentPanel.removeAll();
         contentPanel.add(p);
         p.revalidate();
         contentPanel.revalidate(); // invalidate();
         this.repaint();
      }

      enableButtons();
   }
   
   /** */
   private void enableButtons()
   {
      if (index == 0 && panels.size() > 1)
      {
         nextButton.setEnabled(true);
         prevButton.setEnabled(false);
      }
      else
      {
         nextButton.setEnabled(false);
         prevButton.setEnabled(true);
      }
      
      if (index == panels.size()-1)
      {
         finishButton.setEnabled(true);
         nextButton.setEnabled(false);
      }
      else
      {
         finishButton.setEnabled(false);
         nextButton.setEnabled(true);
      }
   }
}
