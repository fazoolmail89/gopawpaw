package com.jet.utils.rmi;


import java.awt.*;

import javax.swing.*;
import javax.swing.tree.*;

import java.rmi.*;
import java.rmi.registry.*;

import java.util.*;

import java.lang.reflect.*;

/**
 *
 *
 */
public class RBTree extends JPanel
{
   JTree tree=null;
   RootNode rootNode=null;

   DefaultTreeModel model=null;

   /**
    */
   public RBTree()
   {
      setLayout(new GridLayout(1, 1));

      rootNode=new RootNode();
      model=new DefaultTreeModel(rootNode);
      tree=new JTree(rootNode);
      JScrollPane sp=new JScrollPane(tree);

      this.add(sp);
   }

   /**
    *
    */
   public void addServer(String host, int port)
      throws Exception
   {
      rootNode.addServer(host, port);
      System.out.println ("Server added, firing event");
      // model.nodeStructureChanged(rootNode);

      model=new DefaultTreeModel(rootNode);
      tree.setModel(model);
      System.out.println ("Done");
   }
   
   /**
    *
    */
   class RootNode implements TreeNode
   {
      Vector servers=new Vector();

      public void addServer(String host, int port)
         throws Exception 
      {
         ServerNode sn=new ServerNode(host, port, this);
         System.out.println ("Adding "+sn);
         servers.addElement(sn);
         // fire update
      }

      public String toString() {
         return "Servers";
      }

      /** */
      public Enumeration children(){
         System.out.println ("children "+servers);
         return servers.elements();
      }
      /** */
      public boolean getAllowsChildren() {
         return true;
      }
      /** */
      public TreeNode getChildAt(int index) {
         return (TreeNode)servers.elementAt(index);
      }
      /** */
      public int getChildCount() {
         System.out.println("getChildCount "+servers.size());
         return servers.size();
      }
      /** */
      public int getIndex(TreeNode n) {
         return servers.indexOf(n);
      }
      /** */
      public TreeNode getParent() {
         return null;
      }
      /** */
      public boolean isLeaf() {
         return false;
      }
   }

   /**
    *
    */
   class ServerNode implements TreeNode
   {
      String host=null;
      int port=1099;

      Vector services=new Vector();

      TreeNode parent=null;
      
      Registry registry=null;
      
      /**
       *
       */
      public ServerNode(String h, int p, TreeNode pa)
         throws Exception {
         host=h;
         port=p;
         parent=pa;

         buildChildren();
      }

      /**
       *
       */
      public ServerNode(String h, TreeNode pa)
         throws Exception {
         this(h, 1099, pa);
      }

      /** */
      void buildChildren()
         throws Exception
      {
         // bind to the host and port, and get a list of the
         // objects in the registry.
         registry=LocateRegistry.getRegistry(host, port);
         String list[]=registry.list();
         
         for (int i=0; i<list.length; i++)
         {
            services.addElement(new ServiceNode(list[i], this));
         }
      }

      public String toString() 
      {
         return host+"("+port+")";
      }

      /** */
      public Registry getRegistry()
         throws Exception
      {
         return registry;
      }

      /** */
      public Enumeration children(){
         return services.elements();
      }
      /** */
      public boolean getAllowsChildren() {
         return true;
      }
      /** */
      public TreeNode getChildAt(int index) {
         return (TreeNode)services.elementAt(index);
      }
      /** */
      public int getChildCount() {
         return services.size();
      }
      /** */
      public int getIndex(TreeNode n) {
         return services.indexOf(n);
      }
      /** */
      public TreeNode getParent() {
         return parent;
      }
      /** */
      public boolean isLeaf() {
         return false;
      }
   }
      

   /**
    *
    */
   class ServiceNode implements TreeNode
   {
      Vector methods=null;

      String name=null;

      ServerNode parent=null;

      public ServiceNode(String n, ServerNode pa) {
         name=n;
         parent=pa;
      }

      void buildChildren() {
         methods=new Vector();
         System.out.println ("Building service children");
         try {
            // bind to the service
            Registry reg=parent.getRegistry();
            
            Remote stub=reg.lookup(name);
            
            System.out.println ("Got Stub: "+stub.getClass().getName());
            Method m[]=stub.getClass().getDeclaredMethods();
            for (int i=0; i<m.length; i++) {
               methods.add(new MethodNode(m[i], this));
            }
         }
         catch (Exception ex)
         {
            ex.printStackTrace();
         }
      }
      

      public String toString() {
         return name;
      }

      /** */
      public Enumeration children(){
         if (methods == null) 
            buildChildren();

         return methods.elements();
      }
      /** */
      public boolean getAllowsChildren() {
         return true;
      }
      /** */
      public TreeNode getChildAt(int index) {
         return (TreeNode)methods.elementAt(index);
      }
      /** */
      public int getChildCount() {
         if (methods == null) 
            buildChildren();
         
         return methods.size();
      }
      /** */
      public int getIndex(TreeNode n) {
         return methods.indexOf(n);
      }
      /** */
      public TreeNode getParent() {
         return parent;
      }
      /** */
      public boolean isLeaf() {
         return false;
      }
   }

   /**
    *
    */
   class MethodNode implements TreeNode
   {
      Method method=null;

      TreeNode parent=null;

      public MethodNode(Method m, TreeNode pa) {
         method=m;
         parent=pa;
      }

      public String toString() {
         return method.getName();
      }

      /** */
      public Enumeration children(){
         return null;
      }
      /** */
      public boolean getAllowsChildren() {
         return false;
      }
      /** */
      public TreeNode getChildAt(int index) {
         return null;
      }
      /** */
      public int getChildCount() {
         return 0;
      }
      /** */
      public int getIndex(TreeNode n) {
         return 0;
      }
      /** */
      public TreeNode getParent() {
         return parent;
      }
      /** */
      public boolean isLeaf() {
         return true;
      }
   }
}
