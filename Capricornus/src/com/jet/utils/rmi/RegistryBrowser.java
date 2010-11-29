package com.jet.utils.rmi;


/**
 * Requires java 1.2 or 1.3.
 *
 */
public class RegistryBrowser
{


   /**
    *
    */
   public static void main(String args[])
   {
      
      RBFrame frame=new RBFrame();

      
      try {
         frame.addServer("localhost", 52372);
      }
      catch (Exception ex) {
         ex.printStackTrace();
      }
      
      frame.setVisible(true);
  }

}
