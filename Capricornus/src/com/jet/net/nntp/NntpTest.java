package com.jet.net.nntp;

// import sun.net.nntp.*;

import java.io.*;

/**
 *
 *
 */
public class NntpTest
{
   public static void main(String s[]) throws Exception
   {
      String server="news.telocity.com";
      String groupname="atl.jobs";
      
      NntpConnection connection=new NntpConnection(server);

      Newsgroup group=connection.setGroup(groupname);

      // Article article=connection.getArticle(group.firstMessage());
      
      // article.toStream(System.out);
      

      connection.dumpToFilesystem(new File("temp"));
   }

   


   static void dump(InputStream is) throws Exception {
      BufferedReader br=new BufferedReader(new InputStreamReader(is));
      String line=null;
      while ((line=br.readLine())!=null) 
         System.out.println(line);
   }


}
