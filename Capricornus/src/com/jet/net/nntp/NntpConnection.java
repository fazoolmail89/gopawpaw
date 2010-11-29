package com.jet.net.nntp;

import java.net.*;
import java.io.*;
import java.util.*;

import com.jet.net.utils.*;

/*
 * $Log: NntpConnection.java,v $
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.3  2002/02/06 22:19:47  bemocvs
 * Attachment work
 *
 * Revision 1.2  2001/05/27 18:45:39  bemocvs
 * javadoc updates
 *
 * Revision 1.1  2001/05/22 21:03:58  bemocvs
 * Initial commit with full comments.
 *
 */

/** 
 * Encapsulates a connection to an NNTP Server.   This object is stateful
 * and therefore not suitable for multi-threaded access.  The connection 
 * is NOT thread safe, and it is left to the developer to ensure thread
 * synchronization. <p>
 *
 * The NntpConnection is stateful.  It tracks the current group, and also
 * keeps a pointer to the next article in the group.  This pointer is used for 
 * calls to the nextArticle() method.
 *
 * @author Paul Bemowski
 */
public class NntpConnection 
{
   private String server=null;
   private int port=119;
   private Newsgroup currentGroup=null;
   
   private int socketTimeout=60000;

   private Socket socket=null;
   private BufferedReader br=null;
   private OutputStream os=null;

   private int currentArticle=-1;

   public static boolean debug=true;

   /** Constructs a connection to a server on the default port (119). 
    * @param server The ip address or DNS valid name of the NNTP server. */
   public NntpConnection(String server) { this(server, 119); }
   
   /** Constructs a connection to a server on the specified port. 
    * @param server The IP address or DNS valid name of the NNTP server. 
    * @param port The port number the server is listening on. */
   public NntpConnection(String server, int port) {
      this.server=server;
      this.port=port;
   }

   /** Opens the connection to the NNTP server.  */
   public void open() 
      throws IOException, NntpException {
      socket=new Socket(server, port);

      socket.setSoTimeout(socketTimeout);
      br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
      os=socket.getOutputStream();
      String response=br.readLine();
      if (debug)
         Log.write(response);

      if (response.length() >=3) {
         String code=response.substring(0, 2);
         if (!code.startsWith("2")) {
            throw new NntpException("Connection to server "+
                                    server+":"+port+" un-successful: "+
                                    response);
         }
      }
      else {
         throw new NntpException ("Invalid initial response code from "+
                                  "server "+server+":"+port);
      }
   }

   /** Sets the socket timeout to the sepecified value in milliseconds.
    * this value defaults to 1 minute (60000). 0 is interpreted as an 
    * infinite timeout. 
    * @param timeout Socket timeout in milliseconds. */
   public void setSocketTimeout(int timeout) {
      socketTimeout=timeout;
   }

   /** Closes the socket connection to the NNTP server. */
   public void close() 
      throws IOException {
      socket.close();
   }

   /** Sets the current newsgroup.  The connection to an NNTP server is 
    * stateful.  Setting the current newsgroup returns a Newsgroup object
    * describing the state of the current group. <p>
    * 
    * This method can be called multiple times to view various 
    * newsgroups on the server. <p>
    *
    * This method also sets the state of the currentArticle to be the 
    * first article in the group.  So that a call to nextArticle() will 
    * return the first article in the group, and increment... 
    * 
    * @param name The name of the requested group. 
    * @return Returns a valid Newsgroup object, or throws an NntpException
    * indicating why the group name is not valid. */
   public Newsgroup setGroup(String name) 
      throws IOException, NntpException {
      if (socket == null) {
         open();
      }
      
      os.write(("group "+name+"\r\n").getBytes());
      
      String response=br.readLine();
      
      StringTokenizer st=new StringTokenizer(response, " ", false);
      String code=st.nextToken();
      
      Newsgroup group=null;

      if (code.equals("211")) {
         String tok=st.nextToken();
         group=new Newsgroup(name, Integer.parseInt(st.nextToken()),
                             Integer.parseInt(st.nextToken()));
         currentArticle=group.firstMessage();

         Log.write("Group: "+group);
      }
      else if (code.equals("411")) {
         throw new NntpException("Unknown group");
      }
      else 
         throw new NntpException("Unknown response: "+response);
      currentGroup=group;
      return group;
   }

   /** Retrieves an article from the current group.  You MUST first call
    * setGroup(name) before attempting to retrieve an article.  The article
    * number must be between the first and last article index as indicated
    * by the Newsgroup object returned from the setGroup() method.
    *
    * @param num The requested article number.
    * @return The requested Article object, or an NntpException if the
    * article is unavailable. */
   public Article getArticle(int num) 
      throws IOException, NntpException {
      if (socket == null) 
         open();

      os.write(("article "+num+"\r\n").getBytes());

      String response=br.readLine();
      Article article=null;
      if (response.startsWith("220")) {
         return articleFromStream(br, num);
      }
      else if (response.startsWith("423"))
         throw new NoSuchArticleException("No Such Article: "+response);
      else {
         throw new NntpException("Error retrieving article "+
                                 num+": "+response);
      }
   }

   /**
    *
    */
   public final Article articleFromStream(BufferedReader reader, 
                                          int num) 
      throws IOException, NntpException {
      MessageHeaderTokenizer mht=new MessageHeaderTokenizer(reader);
      Pair pair=mht.nextHeader();
      Vector headers=new Vector();
      while (pair != null) {
         headers.addElement(pair);
         pair=mht.nextHeader();
      }
      String body=readFully(reader);
      Article article=new Article(currentGroup.getName(), num, headers, body);
      return article;
   }


   /** Reads the complete body of an NNTP message. */
   public static final String readFully(BufferedReader reader) 
      throws IOException, NntpException  {
      StringBuffer body=new StringBuffer(100);
      String line=reader.readLine(); // .trim();
      while(line != null) {
         if (line.trim().equals("."))
            return body.toString();

         body.append(line+"\n");

         line=reader.readLine(); // .trim();
      }
      throw new NntpException ("Unexpected end of message.");
   }

   /** Stores all Articles from a given group (set by the setGroup() method)
    * to a specified location on a locally mounted file system.  Specify 
    * the location with the 'rootdir' parameter. 
    * 
    * @param rootdir Specifies the root directory in which to store the 
    * article files.  This method will create the necessary directories
    * based on the news group's name.  If you request to store 
    * comp.lang.java.programmer in the root dir of /news_store the articles
    * will be stored in /news_store/comp/lang/java/programmer/.  
    * @return The number of articles stored.  */
   public int dumpToFilesystem(File rootdir) 
   throws IOException, NntpException {
      if (currentGroup == null)
         throw new NntpException ("First call setGroup(String name)");
      
      String dir=currentGroup.getName().replace('.', '/');
      File storagedir=new File(rootdir, dir);
      if (!storagedir.exists()) {
         Log.write(storagedir.getAbsolutePath()+
                   " does not exist, creating...");
         boolean success=storagedir.mkdirs();
         if (!success) 
            throw new NntpException(storagedir.getAbsolutePath()+
                                   "does not exist, and I can't create it.");
      }

      int count=0;
      for (int i=currentGroup.firstMessage(); i<currentGroup.lastMessage(); 
           i++) {
         count++;
         File f=new File(storagedir, ""+i+".msg");
         try {
            Article article=getArticle(i);
            FileOutputStream fos=new FileOutputStream(f);
            article.toStream(fos);
         }
         catch (NntpException ex) {
            Log.write(ex);
         }
      }
      return count;
   }

   /** Sets the next article number that will be retrieved by the 
    * nextArticle() method.  This method MUST be called AFTER the 
    * setGroup() method, as the set group method will reset the
    * next article method. */
   public void setNextArticle(int i) 
      throws NntpException {
      
      if (currentGroup == null)
         throw new NntpException ("You must first set the group before setting "+
                                  "the next article!!");
      if (i <= currentGroup.lastMessage() &&
          i >= currentGroup.firstMessage())
         currentArticle=i;
      else
         throw new NntpException("Article "+i+" out of range.  "+
                                 "The group article range "+
                                 "for "+currentGroup.getName()+" is ["+
                                 currentGroup.firstMessage()+","+
                                 currentGroup.lastMessage()+"] inclusive.");
   }

   /** Returns the current article.
    * @return The current article pointer.  A call to nextArticle will
    * return this article -- if it's available on the server. */
   public int getCurrentArticle() {
      return currentArticle;
   }

   /** Returns the next article.  <p>
    *
    * A call to setGroup() will set the 'article pointer' to the first
    * article in the group.  You can also set the next article pointer by 
    * calling setNextArticle, after a call to setGroup().  <p>
    * 
    * After all articles are read (as indicated by last article on the 
    * current group), this method will return null.  <p>
    *
    * @return The next sequential article. */
   public Article nextArticle() 
      throws IOException, NntpException {
      if (currentArticle > currentGroup.lastMessage())
         return null;

      try {
         return getArticle(currentArticle);
      }
      finally {
         currentArticle++;
      }
   }
}

