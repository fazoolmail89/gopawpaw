package com.jet.apps.sqlminus;

import java.util.*;
import java.io.*;

import java.text.*;

import com.jet.utils.properties.*;

/**
 * The command processor reads and interprets commands.
 */
public class CommandProcessor extends Thread
{
   BufferedReader promptReader=null;

   StringBuffer lineBuffer=null;

   ArrayList commandHistory=null;

   boolean shutdown=false;

   int lineBufferCount=0;

   DecimalFormat df=null;

   DBSession session=null;

   EProperties props=null;
   
   /** */
   public CommandProcessor(EProperties p) 
      throws IOException {
      props=p;
      promptReader=new BufferedReader(new InputStreamReader(System.in), 1);
      df=new DecimalFormat("00");
      lineBuffer=new StringBuffer();
      commandHistory=new ArrayList();
   }

   /** */
   public void setDBSession(DBSession session) {
      this.session=session;
   }

   /** */
   public void run() {
      try {
         String line=null;

         while (!shutdown) {
            System.out.print (prompt());
            line=promptReader.readLine();
            try {
               processCommand(line);
            } catch (Throwable t) {
               t.printStackTrace();
               System.out.println ();
            }
         }
      } catch (Throwable t) {
         t.printStackTrace();
      }
   }

   /** */
   public String prompt() {
      return "sqlminus "+df.format(lineBufferCount)+"> ";
   }

   /** 
    *
    */
   public void processCommand(String line) 
      throws Exception {
      if (!systemCommand(line)) {
         if (!line.endsWith(";")){

            if (line.length() > 0) {
               lineBufferCount++;
               lineBuffer.append(line+"\n");
            }
         } else {
            lineBuffer.append(line+"\n");

            processSQL(lineBuffer.toString());
            commandHistory.add(lineBuffer);
            lineBuffer=new StringBuffer();
            lineBufferCount=0;
         }            
      }
   }

   /** */
   boolean systemCommand(String line) throws Exception {
      boolean sysCmd=false;

      if (line.equals("exit") || line.equals("quit")) {
         System.exit(0);
      } else if (line.startsWith("open")) {
         sysCmd=true;
         String parms=line.substring(5);

         EProperties databases=props.getProperties("databases");
         
         EProperties db=databases.getProperties(parms);
         
         if (db == null) {
            System.out.println ("No properties available for database '"+
                                parms+"'");
         }
         
         // get username and password
         String user=getParam("username >");
         String pass=getParam("password >");

         DBSession session=new DBSession(db.getProperty("driver"),
                                         db.getProperty("url"), 
                                         user, pass);
         try {
            session.open();
            setDBSession(session);
         } catch (Exception ex) {
            ex.printStackTrace();
         }
      } else if (line.startsWith("describe")) {
         sysCmd=true;

         ArrayList data=session.describe(line.substring(line.indexOf(" ")).trim());
         OutputFormatter formatter=new OutputFormatter(data);
         formatter.setColumnWidth(0, 25);
         while (formatter.displayNextPage()); 
      } else if (line.startsWith("set")) {
         sysCmd=true;
         
         int spindex=line.indexOf(" ");
         if (spindex == -1 ||
             line.substring(spindex).trim().length() == 0) {
            HashMap props=session.getProperties();
            Iterator iter=props.keySet().iterator();
            while (iter.hasNext()) {
               String key=(String)iter.next();
               System.out.println (key+"= '"+session.get(key)+"'");
            }
            
            return sysCmd;
         }

         String kvp=line.substring(spindex).trim();
         int eqindex=kvp.indexOf("=");
         if (eqindex == -1){
            System.out.println ("Systax error: '"+line+"'");
            System.out.println ("  Format: 'set key=value'");
         } else {
            String key=kvp.substring(0, eqindex);
            String val=kvp.substring(eqindex+1);
            session.set(key, val);
         }         
      } else if (line.startsWith("unset")) {
         sysCmd=true;
         session.unset(line.substring(line.indexOf(" ")).trim());
      } else if (line.startsWith("listtables")) {
         sysCmd=true;
         int spindex=line.indexOf(" ");
         String pattern=null;
         if (spindex != -1 &&
             line.substring(spindex).trim().length() != 0) {
            pattern=line.substring(spindex).trim();
         }

         ArrayList list=session.getTables(pattern);

         OutputFormatter formatter=new OutputFormatter(list);
         formatter.setDefaultColumnWidth(18);
         while (formatter.displayNextPage(true)); 
      }

      return sysCmd;
   }

   /** */
   public String getParam(String prompt) 
      throws IOException {
      System.out.print (prompt);
      return promptReader.readLine();
   }


   /** */
   void processSQL(String sql) 
      throws Exception {
      if (session == null) {
         System.out.println ("Not connected.  Connect w/ 'open <database>'");
      }
      else {
         try {
            sql=sql.trim();
            if (sql.endsWith(";"))
               sql=sql.substring(0, sql.length()-1);

            if (sql.length() < 2)
               return;

            System.out.println ("Executing: \n"+sql);


            ArrayList data=session.executeSQL(sql);
            System.out.println ("Retrieved "+data.size()+" rows.");
         
            OutputFormatter formatter=new OutputFormatter(data);

            boolean more=formatter.displayNextPage();
         
            if (more) {
               System.out.println ("More (quit=q)?");
               char b=(char)promptReader.read();
               while (b != 'q' && more) {
                  more=formatter.displayNextPage();
                  System.out.println ("More (quit=q)?");
                  b=(char)promptReader.read();
               }
            }
         } catch (Throwable t) {
            t.printStackTrace();
         }
      } 
   }
}
