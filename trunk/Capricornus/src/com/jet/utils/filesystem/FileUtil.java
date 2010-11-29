package com.jet.utils.filesystem;

import java.io.*;
import java.util.*;

import com.jet.utils.io.StreamUtil;

/**
 * This class contains a number of static methods that add a further layer 
 * of abstraction on top of the Java File API.  There are numerous 
 * differences and incompatabilities between the file API on Java 1.1 and 1.2,
 * this class should behave the same on either VM.
 *
 * @author Paul Bemowski
 */
public class FileUtil
{
   private static final Random random=new Random(System.currentTimeMillis());

   private static String vmVersion=null;
   static
   {
      // vmVersion=System.getProperty("java.version");
      try {
         vmVersion="1.1";
         Class.forName("java.lang.ThreadLocal");
         vmVersion="1.2";
         Class.forName("java.lang.StrictMath");
         vmVersion="1.3";
      }
      catch (Exception ex) 
      {}
   }

   /**
    *
    */
   public static File unixSlashify(File file)
   {
      String temp=file.getAbsolutePath();
      temp=temp.replace('\\', '/');
      return new File(temp);
   }

   /**
    *
    */
   public static String unixSlashify(String s)
   {
      return s.replace('\\', '/');
   }

   /**
    * This is necessary under 1.1.
    */
   public static File slashify(File file)
   {
      String temp=file.getAbsolutePath();
      String separator=File.separator;
      
      if (separator.equals("/")) // on unix
      {
         temp.replace('\\', '/');
      }
      else if (separator.equals("\\")) // windows
      {
         temp.replace('/', '\\');
      }
      else 
         throw new RuntimeException ("I don't know what kind of "+
                                     "system this is.");
      return new File(temp);
   }

   /**
    *
    */
   public static File getPath(File file)
   {
      if (vmVersion.startsWith("1.1"))
      {
         String temp=unixSlashify(file).getAbsolutePath();
         
         String path=temp.substring(0, temp.lastIndexOf("/"));
         return new File(path);
      }
      else // 1.2
      {
         return new File(file.getParent());
      }
   }

   /**
    *
    */
   public static String getPath(String file)
   {
      if (file == null)
         return null;
      String temp=unixSlashify(file);
      if (temp.indexOf("/") == -1)
         return null;
      else
      {
         temp=temp.substring(0, temp.lastIndexOf("/"));
      }
      return temp;
   }

   /**
    * This will return the file name on Java 1.1 or 1.2.
    */
   public static String getName(String file)
   {
      String temp=null;
      if (vmVersion.startsWith("1.1"))
      {
         temp=unixSlashify(file);
         temp=temp.substring(temp.lastIndexOf("/")+1, temp.length());
      }
      else if (vmVersion.startsWith("1.2") || vmVersion.startsWith("1.3"))
      {
         File tempFile=new File(file);
         temp=tempFile.getName();
      }
      else
         throw new RuntimeException("Don't understand vm version: "+vmVersion);

      return temp;
   }

   /**
    *
    */
   public static File getTempFile()
      throws IOException
   {
      return getTempFile("tmp");
   }

   /**
    *
    */
   public static File getTempFile(String extension)
      throws IOException 
   {
//        int rand=random.nextInt();
//        if (rand < 0)
//           rand=-rand;

//        String filename="db_"+rand+"."+extension;

//        Environment env=Environment.getEnvironment();
//        File tempdir=env.getTempDir();

//        return new File(tempdir, filename);
     
      File tempfile=File.createTempFile("fu.", "."+extension);
      tempfile.deleteOnExit();
      return tempfile;
   }


   /** 
    * Reads the contents of a file into a StringBuffer.
    */
   public static StringBuffer readFromFile(String filename) 
      throws IOException {
      return readFromFile(new File(filename));
   }

   /**
    * Reads the contents of a file into a StringBuffer.
    */
   public static StringBuffer readFromFile(File file)
      throws IOException 
   {
      StringBuffer buf=new StringBuffer();

      FileInputStream fis=new FileInputStream(file);
      BufferedReader br=new BufferedReader(new InputStreamReader(fis));

      String line=br.readLine();
      while (line != null)
      {
         buf.append(line+"\n");
         line=br.readLine();
      }
      br.close();
      fis.close();

      return buf;
   }

   /** */
   public static boolean saveToFile(String filename, StringBuffer buf)
      throws IOException {
      File file=new File(filename);
      return saveToFile(file, buf);
   }

   /** */
   public static boolean saveToFile(File file, StringBuffer buf)
      throws IOException
   {
      FileOutputStream fos=new FileOutputStream(file);

      fos.write(buf.toString().getBytes());
      
      fos.flush();
      fos.close();
      return true;
   }

   /** */
   public static void rmRF(File dir, boolean verbose) 
      throws CannotDeleteException {
      deleteAllFilesThenDirectories(dir, verbose);
      if (!dir.delete())
         throw new CannotDeleteException(dir);
   }

   public static void rmRF(File dir) 
      throws CannotDeleteException {
      rmRF(dir,false);
   }

   /** 
    * Recursive function to delete all files and directories.
    * 
    * Because of the recursion, on an unix system with a recursive
    * soft link, this could be infinite?? 
    */
   public static final void deleteAllFilesThenDirectories(File dir, 
                                                          boolean verbose) 
      throws CannotDeleteException {
      if (verbose)
         System.out.println ("Removing "+dir.getAbsolutePath());
      File files[]=dir.listFiles();
      if (files == null)
         return;

      ArrayList dirs=new ArrayList();
      for (int i=0; i<files.length; i++) {
         if (files[i].isDirectory()) { // save for later
            dirs.add(files[i]);
         } else {
            boolean success=files[i].delete();
            if (!success) 
               throw new CannotDeleteException(files[i]);
         }
      }
      // all the files are gone, now recurse
      for (int i=dirs.size()-1; i>=0; i--) {
         File nextdir=(File)dirs.get(i);
         deleteAllFilesThenDirectories(nextdir, 
                                       verbose); // watchout, recursion.
         boolean success=nextdir.delete();
         if (!success) 
            throw new CannotDeleteException(files[i]);
         dirs.remove(i);
      }
   }
   
   /** 
    *
    */
   public static void copy(File src, File dest) 
      throws FileExistsException, IOException {
      copy(src, dest, false);
   }

   /**
    * Makes a binary copy of the file src in the file dest.  If 
    * the overwrite flag exists, it will attempt to overwrite.  Otherwise
    * it will throw FileExistsException. 
    */
   public static void copy(File src, File dest, boolean overwrite) 
      throws FileExistsException, IOException {
      if (!src.exists()) {
         throw new FileNotFoundException("File "+src.getAbsolutePath()+
                                         " does not exist");
      }
      
      if (dest.exists() && !overwrite) {
         throw new FileExistsException(dest);
      }
      // ok, src.exists() == true && (!des.exists() || overwrite)
      InputStream is=new FileInputStream(src);
      OutputStream os=new FileOutputStream(dest);
      StreamUtil.pump(is, os);
   }

   /** 
    * Returns the path of a file relative to the root passed in.
    * 
    * So, for instance give a root of /home/bemo and a file of
    * /home/bemo/test/afile.txt, passing these in respectively
    * will return test/afile.txt
    **/
   public static final String getRelativePath(File root, File file) 
      throws IOException {
      String sroot=root.getCanonicalPath();
      String sfile=file.getCanonicalPath();
      
      String relative=sfile.substring(sroot.length()+1);
      relative=unixSlashify(relative);

      if (file.isDirectory() && 
          !relative.endsWith("/"))
         relative=relative+"/";

      return relative;
   }


   public static void main(String args[]){
      try {
         //testRm(); 
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}

