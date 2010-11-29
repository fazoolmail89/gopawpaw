package com.jet.apps.databrowser;

import java.net.*;
import java.io.*;
import java.awt.Point;


import com.jet.log.Logger;

import com.jet.apps.databrowser.ui.DataBrowser;

/** 
 *
 *
 */
public class DBListener extends Thread implements Logger
{
   static int port=10444;

   ServerSocket serverSocket=null;

   static int handlerCount=0;

   static DBListener _instance=null;

   /** */
   private DBListener() 
      throws IOException {
      serverSocket =new ServerSocket(port, 10, 
                                     InetAddress.getLocalHost());
      this.setName("DBListener");
   }

   /** */
   public static void startup() {
      try {
         _instance=new DBListener();
         _instance.start();
      } catch (Exception ex) {
         System.out.println ("Error creating DBListener - another DataBrowser is running?");
         ex.printStackTrace();

         System.out.println ("Attempting to open new window on existing DataBrowser");
         // if we cannot startup, try to connect and start 
         // another window.
         try {
            Socket socket=new Socket(InetAddress.getLocalHost(), port);
            OutputStream os=socket.getOutputStream();
            os.write("newdb\n".getBytes());
            os.flush();
         } catch (Exception exx) {
            exx.printStackTrace();
         }
         
         System.exit(3);
      }
   }

   /** */
   public void run() {
      while (true) {
         try {
            Socket socket=serverSocket.accept();

            HandlerThread ht=new HandlerThread(socket);
            ht.start();
         } catch (Exception ex) {
            log.writeError(1, ex);
         }
      }
   }

   class HandlerThread extends Thread {
      Socket socket=null;
      public HandlerThread (Socket soc) {
         socket=soc;
         setName("DBListener.HandlerThread("+(handlerCount++)+")");

      }

      /** */
      public void run() {
         try {
            InputStream is=socket.getInputStream(); 
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            
            String line=br.readLine(); 

            while (line != null) {
               log.writeDebug(2, line);
               
               if (line.startsWith("newdb")) {
                  DataBrowser db=new DataBrowser();
                  
                  Point p=db.getLocation();
                  db.setLocation(p.x+20, p.y+20);

                  db.show();
               } else if (line.startsWith("exit")) {
                  socket.close();
                  break;
               }
               line=br.readLine();
            } 
         } catch (Exception ex) {
            log.writeError(1, ex);
         }
      }
   }
}