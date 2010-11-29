package com.jet.utils.inspector;


import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.lang.reflect.*;
import java.awt.event.*;
import java.util.*;

/**
Class inspector using reflection.
<p>
Lists all declared fields and methods. Shows values of public fields. Allows invokation
and result display for methods that require no parameters. Lists arrays and Enumerations.
<p>
Inspector i = Inspector.inspect(someObj);
<p>
Frame is returned so it can be disposed from code. Non-relection exceptions thrown during
method invokation are displayed (see line 154). 
*
**/

public class Inspector extends JFrame
{
   public Class mInspectedClass;
   public Object mInspectedInstance;
   
   public JList mFields;
   public JList mMethods;
   public JPanel mDataPanel;
   
   public Inspector(String title,Object toInspect)
   {
      super(title);
      mInspectedInstance=toInspect;
      mInspectedClass=mInspectedInstance.getClass();
      
      mFields = new JList(mInspectedClass.getDeclaredFields());
      mMethods = new JList(mInspectedClass.getDeclaredMethods());
      
      //System.out.println(mInspected.getDeclaredFields().length);
      this.getContentPane().setLayout(new GridLayout(1,2));
      JPanel leftPane = new JPanel(new GridLayout(2,1));
      leftPane.add(new JScrollPane(mFields));
      leftPane.add(new JScrollPane(mMethods));
      this.getContentPane().add(leftPane);
      
      mFields.addListSelectionListener(new FieldListener());
      mMethods.addListSelectionListener(new MethodListener());
      
      mDataPanel = new JPanel();
      mDataPanel.add(new JLabel("Select a Field"));
      this.getContentPane().add(mDataPanel);
      
      this.setSize(800,500);
   }
   
   public static Inspector inspect(Object anObj)
   {
      Inspector i = new Inspector("Inspecting (" + anObj.getClass().getName() +
         ") " + anObj.toString(),anObj);
      i.show();
      return i;
   }
   
   protected void replaceDataPanel(JPanel newPanel)
   {
      this.getContentPane().remove(1);
      this.getContentPane().add(newPanel);
      newPanel.repaint();
      newPanel.revalidate();
   }
   
   private class FieldListener implements ListSelectionListener 
   {
      public void valueChanged(ListSelectionEvent e)
      {
         if(!e.getValueIsAdjusting())
         {
            System.out.println("Field Listener called");
            try
            {
               
               Field f = (Field) mFields.getSelectedValue();
               if(f.getType().isInterface())
               {
                  mDataPanel = new JPanel();
                  mDataPanel.add(new JLabel("Field is an Interface"));
               }
               else if(f.getType().isArray())
               {
                  mDataPanel = new ArrayPanel((Object[]) f.get(mInspectedInstance));
               }
               else
               {
                  mDataPanel = new JPanel(new BorderLayout());
                  mDataPanel.add(new JScrollPane(
                     new JLabel(f.get(mInspectedInstance).toString())),"Center");
                  JButton aBut=new JButton("Inspect");
                  aBut.addActionListener(new InspectIt(f.get(mInspectedInstance)));
                  mDataPanel.add(aBut,"South");
               }
            }
            catch(Exception ex)
            {
               mDataPanel = new JPanel(new BorderLayout());
               mDataPanel.add(new JScrollPane(new JLabel(ex.toString())),"Center");
            }
            replaceDataPanel(mDataPanel);
         }
      }
   }
   
   private class MethodListener implements ListSelectionListener 
   {
      private Throwable mTargetException;
      
      public void valueChanged(ListSelectionEvent e)
      {
         if(!e.getValueIsAdjusting())
         {
            System.out.println("Method Listener called");
            try
            {
               
               Method m = (Method) mMethods.getSelectedValue();
               
               Object returned = m.invoke(mInspectedInstance,null);
               
               //special consideration for Enumerations
               if(returned.getClass().isArray())
               {
                  mDataPanel = new ArrayPanel((Object[]) returned);
               }
               else if(returned instanceof Enumeration)
               {
                  System.out.println("Its an Enumeration");
                  //cram the Enumeration into a vector so we can see how big to make the array
                  Vector enumHolder = new Vector();
                  while(((Enumeration)returned).hasMoreElements())
                     enumHolder.addElement(((Enumeration)returned).nextElement());
                  
                  Object[] objs = new Object[enumHolder.size()];
                  enumHolder.copyInto(objs);
                  mDataPanel = new ArrayPanel(objs);
               }
               else
               {
                  mDataPanel = new JPanel(new BorderLayout());
                  mDataPanel.add(new JScrollPane(new JLabel(returned.toString())),"Center");
                  JButton aBut=new JButton("Inspect");
                  aBut.addActionListener(new InspectIt(returned));
                  mDataPanel.add(aBut,"South");
               }
            }
            /*if you have an exception debugger
            catch(InvocationTargetException ite)
            {
               mTargetException=ite.getTargetException();
               
               mDataPanel = new JPanel(new BorderLayout());
               mDataPanel.add(new JScrollPane(
                  new JLabel(mTargetException.toString())),"Center");
               JButton b = new JButton("Debug");
               mDataPanel.add(b,"South");
               
               ActionListener al = new ActionListener()
               {
                  public void actionPerformed(ActionEvent e)
                  {	
                     System.out.println("Exception Debug Listener called");
                     ExceptionDebugger.debug(null,mTargetException);
                  }
               };
               
               b.addActionListener(al);
            }*/
            //rem out if you have ExceptionDebugger
            catch(InvocationTargetException ite)
            {
               mDataPanel = new JPanel(new BorderLayout());
               mDataPanel.add(new JScrollPane(
                  new JLabel(ite.getTargetException().toString())),"Center");
            }
            catch(Exception ex)
            {
               mDataPanel = new JPanel(new BorderLayout());
               mDataPanel.add(new JScrollPane(new JLabel(ex.toString())),"Center");
            }
            replaceDataPanel(mDataPanel);
         }
      }
   }
   
   
   private class ArrayPanel extends JPanel
   {
      JButton mBut = new JButton("Inspect");
      
      public ArrayPanel(Object[] array)
      {
         super(new BorderLayout());
         JList aList = new JList(array);
         aList.addListSelectionListener(new ChooseIt(aList));
         this.add(new JScrollPane(aList),"Center");
         this.add(mBut,"South");
      }
      
      private class ChooseIt implements ListSelectionListener
      {
         private JList mChooseFrom;
         public ChooseIt(JList from)
         {
            mChooseFrom=from;
         }
         
         public void valueChanged(ListSelectionEvent e)
         {
            if(!e.getValueIsAdjusting())
            {
               System.out.println("Array Listener called");
               mBut.addActionListener(new InspectIt(mChooseFrom.getSelectedValue()));
            }
         }
      }
   }
   
   private class InspectIt implements ActionListener
   {
      private Object mToInspect;
      public InspectIt(Object toInspect)
      {
         mToInspect=toInspect;
      }
      
      public void actionPerformed(ActionEvent e)
      {	
         System.out.println("Array Listener called");
         Inspector i = new Inspector("Inspecting (" + mToInspect.getClass().getName() +
            ") " + mToInspect.toString(),mToInspect);
         i.show();
      }
   }
} // Inspector

