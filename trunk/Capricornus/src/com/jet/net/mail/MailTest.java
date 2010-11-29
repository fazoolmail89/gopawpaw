package com.jet.net.mail;

import com.jet.utils.ArgParser;


/** 
 *
 */
public class MailTest
{

   static final String usage=
   "MailTest -from <from> -to <to> -subject <subject> -body <body> -server <server> [-port <port>]";
   
   public static void main(String args[]) 
      throws Exception {
      ArgParser ap=new ArgParser(args);

      String from=ap.getStringArg("-from");
      String to=ap.getStringArg("-to");
      String subject=ap.getStringArg("-subject");
      String body=ap.getStringArg("-body");

      String server=ap.getStringArg("-server");
      int port=ap.getIntArg("-port", 25);

      if (from == null || to == null || subject == null ||
          body == null || server == null) {
         System.out.println (usage);
         System.exit(1);
      }

      EMailMessage message=new EMailMessage(from, to, subject, body);
      SMTPMailServer mailServer=new SMTPMailServer(server, port);

      mailServer.sendMessage(message);
   }

}
