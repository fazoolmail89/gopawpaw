package com.jet.apps.sqlminus;

import com.jet.utils.*;
import com.jet.utils.properties.*;

import com.jet.log.*;

/**
 * SQLMinus is a sql command tool, similar to Oracle's sqlplus.  It is
 * database agnostic, 
 *
 */
public class SQLMinus implements Logger
{
   /** Entry point. */
   public static void main(String args[]) {
      ArgParser ap=new ArgParser(args);

      try {
         String config=ap.getStringArg("-config");
         if (config == null) 
            config="../config/dbnames.properties";

         EProperties props=new EProperties();
         props.load(config);

         Splash splash=new Splash();
         splash.print();

         CommandProcessor cp=new CommandProcessor(props); 

         log.writeDebug("Trainsferring control to the command processor.");
         cp.start();
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}
