/**
 * 
 */
package com.gopawpaw.dev.test;
import javax.swing.*;   
import java.awt.*;   
import java.util.Arrays;   
import java.util.ArrayList;
/**
 * @version 2009-10-18
 * @author Àî½õ»ª
 */
public class BorderFocus {   
	  public static void main(String args[]) {   
	    JFrame frame = new JFrame("Focus Cycling");   
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	    Container contentPane = frame.getContentPane();   
	    JButton north = new JButton("North");   
	    contentPane.add(north, BorderLayout.NORTH);   
	    JButton south = new JButton("South");   
	    contentPane.add(south, BorderLayout.SOUTH);   
	    JButton east = new JButton("East");   
	    contentPane.add(east, BorderLayout.EAST);   
	    JButton west = new JButton("West");   
	    contentPane.add(west, BorderLayout.WEST);   
	    JButton center = new JButton("Center");   
	    contentPane.add(center, BorderLayout.CENTER);   
	    contentPane.setFocusable(false);   
	     ArrayList<Component> list = new ArrayList<Component>();   
	         
	     list.add(north);   
	     list.add(east);
	     list.add(south);   
	     list.add(west);   
	     list.add(center);   
	     final ArrayList<Component> comList = list;   
	    FocusTraversalPolicy policy = new FocusTraversalPolicy() {   
	      public Component getFirstComponent(Container focusCycleRoot) {   
	        return  (Component)comList.get(0);   
	      }   
	      public Component getLastComponent(Container focusCycleRoot) {   
	        return (Component) comList.get(comList.size()-1);   
	      }   
	      public Component getComponentAfter(Container focusCycleRoot,    
	          Component aComponent) {   
	        int index = comList.indexOf(aComponent);   
	           
	        return (Component) comList.get((index + 1) % comList.size());   
	      }   
	      public Component getComponentBefore(Container focusCycleRoot,    
	          Component aComponent) {   
	        int index = comList.indexOf(aComponent);   
	        return (Component) comList.get((index - 1 + comList.size()) % comList.size());   
	      }   
	      public Component getDefaultComponent(Container focusCycleRoot) {   
	        return (Component) comList.get(0);   
	      }   
	    };   
	    frame.setFocusTraversalPolicy(policy);   
	    frame.pack();   
	    frame.show();   
	   }   
	} 