package com.gopawpaw.frame.test;

import java.awt.BorderLayout;   
  
import javax.swing.JFrame;   
import javax.swing.JLabel;   
import javax.swing.JTree;   
import javax.swing.event.TreeSelectionEvent;   
import javax.swing.event.TreeSelectionListener;   
import javax.swing.tree.DefaultMutableTreeNode;   
import javax.swing.tree.DefaultTreeModel;   
import javax.swing.tree.TreePath;   
  
public class SimpleTree2 extends JFrame {   
  
      JTree tree;   
      DefaultTreeModel treeModel;   
  
      public SimpleTree2( ) {   
        super("Tree Test Example");   
        setSize(400, 300);   
        setDefaultCloseOperation(EXIT_ON_CLOSE);   
      }   
  
      public void init( ) {   
        // Build up a bunch of TreeNodes. We use DefaultMutableTreeNode because the   
        // DefaultTreeModel can use it to build a complete tree.   
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");   
        DefaultMutableTreeNode subroot = new DefaultMutableTreeNode("SubRoot");   
        DefaultMutableTreeNode leaf1 = new DefaultMutableTreeNode("Leaf 1");   
        DefaultMutableTreeNode leaf2 = new DefaultMutableTreeNode("Leaf 2");   
           
        // Build our tree model starting at the root node, and then make a JTree out   
        // of it.   
        treeModel = new DefaultTreeModel(root);   
        tree = new JTree(treeModel);   
  
        // Build the tree up from the nodes we created.   
        treeModel.insertNodeInto(subroot, root, 0);   
        // Or, more succinctly:   
        subroot.add(leaf1);   
        root.add(leaf2);   
  
        // Display it.   
        getContentPane( ).add(tree, BorderLayout.CENTER);   
           
        final JLabel messageLabel = new JLabel("Nothing selected.");   
        add(messageLabel, BorderLayout.SOUTH);   
           
//    Add our selection listener and have it report to   
        // our messageLabel.   
        tree.addTreeSelectionListener(new TreeSelectionListener( ) {   
          public void valueChanged(TreeSelectionEvent tse) {   
            TreePath tp = tse.getNewLeadSelectionPath( );   
            messageLabel.setText("Selected: " + tp.getLastPathComponent( ));   
          }   
        });   
  
  
      }   
  
      public static void main(String args[]) {   
        SimpleTree2 tt = new SimpleTree2( );   
        tt.init( );   
        tt.setVisible(true);   
      }   
  }  