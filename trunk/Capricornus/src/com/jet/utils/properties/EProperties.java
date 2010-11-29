package com.jet.utils.properties;

import java.util.*;
import java.io.*;

import com.jet.utils.filesystem.*;

import com.jet.log.*;

/**
 * Extended Properties class is a more capable version of 
 * <pre>java.util.Properties</pre>.  This class has provisions for 
 * reading and writing vectors and hashtables.<p>
 *
 * @author Paul Bemowski
 * @see java.util.Properties
 */
public class EProperties extends Properties
   implements Logger
{
   private static final int EOF=-1;

   public static boolean debug=false;

   private static int sPropertyStreamCount=0;
   private static int sOutputWriterCount=0;

   private Vector mKeys=new Vector();

   private File sourceFile=null;

   private Vector observers=null;

   EProperties parent=null;

   /**
    * We are promoting environments all the time.  If the data
    * has not changed, we don't need to promote (it gives annoying
    * debugging when it promotes). So, we will hold a hash
    * of booleans indicating that a given environment has been
    * promoted since the last modification. Upon modification 
    * (via load or set) we will empty this hashmap so that if
    * the environments were touched, they will be re-promoted.
    */
   HashMap environsPromoted=new HashMap();

   private static final char escapeChars[]=
   {
      '\\',       // Possibly used in path description on nt.
      '\"',       // Defines string val
      //'\n',       // new line
      //'(', ')',   // Defines vector
      //'{', '}'    // Defines hashtable
   };

   static 
   {
      
   }


   /**
    *
    */
   public EProperties()
   {
      super();
   }

   /**
    *
    */
   public EProperties(Hashtable h) // This will cover properties too.
   {
      for (Enumeration keys=h.keys(); keys.hasMoreElements();)
      {
         Object key=keys.nextElement();
         Object val=h.get(key);

         put(key, val);
      }
   }

   /**
    *
    */
   public EProperties(Properties p)
   {
      this((Hashtable)p);
   }

   /** Resets the modification booleans. */
   private void setModified() {
      // System.out.println ("Resetting environsPromoted");
      environsPromoted=new HashMap();
   }

   /** */
   private void addKeysToVector()
   {

   }

   /**
    *
    */
   public File getSourceFile() {
     File f=sourceFile;
     EProperties next=parent;
     while (next != null && f == null) {
       f=next.sourceFile;
       next=next.parent;
     }
     return f;
   }

   /**
    *
    */
   public void setSourceFile(File file) 
   {
      sourceFile=new File(file.getAbsolutePath());
   }

   /** */
   public Object get(String key, Object def)
   {
      Object ret=super.get(key);
      if (ret == null)
         return def;
      else
         return ret;
   }

   /** */
   public Object get(String key)
   {
      return this.get(key, null);
   }

   /** */
   public Object get(int keyNum)
   {
      return super.get(getKey(keyNum));
   }

   /** */
   public Object put(Object key, Object val)
   {
      setModified();
      Key theKey=null;

      if (key instanceof String)
         theKey=new Key((String)key);
      else if (key instanceof Key) {
         theKey=(Key)key;
      }
      else {
         throw new IllegalArgumentException("Key must be a Key or String");
      }
      // Prevent duplicate keys, and preserve order
      if (mKeys.indexOf(theKey) == -1)
         mKeys.addElement(theKey);
      else {
         Key existingKey=(Key)mKeys.elementAt(mKeys.indexOf(theKey));
         existingKey.notifyObservers(val);
      }
      
      Object returnVal=super.put(theKey, val);

      if (this.observers != null) {
         notifyObservers(theKey, val);
      }

      return returnVal;
   }

   /**
    */
   public Object insert(Object key, Object val, int index)
   {
      setModified();
      Key theKey=null;

      if (key instanceof String)
         theKey=new Key((String)key);
      else if (key instanceof Key)
      {
         theKey=(Key)key;
      }
      else 
      {
         throw new IllegalArgumentException("Key must be a Key or String");
      }
      // Prevent duplicate keys, and preserve order
      if (mKeys.indexOf(theKey) == -1)
         mKeys.insertElementAt(theKey, index);
      else
      {
         Key existingKey=(Key)mKeys.elementAt(mKeys.indexOf(theKey));
         existingKey.notifyObservers(val);
      }
      
      Object returnVal=super.put(theKey, val);

      if (this.observers != null)
      {
         notifyObservers(theKey, val);
      }

      return returnVal;
   }

   /** */
   public Object remove(Object key)
   {
      setModified();
      Key theKey=null;

      if (key instanceof String)
         theKey=new Key((String)key);
      else if (key instanceof Key) {
         theKey=(Key)key;
      }
      else {
         throw new IllegalArgumentException("Key must be a Key or String");
      }

      boolean success=mKeys.removeElement(theKey);
      if (debug && !success)
         System.out.println ("Error removeing '"+key+"' from key vector.");

      Object returnVal=super.remove(theKey);

      if (this.observers != null) {
         notifyObservers(theKey, returnVal);
      }

      return returnVal;
   }

   /** */
   public String getProperty(String key) {return getProperty(key, null);}
   
   /** */
   public String getProperty(String key, String def)
   {
      Object val=get(key);
      if (val == null) 
         return def;
      if (val instanceof String)
         return (String)val;
      else
         return def;
   }

   /** */
   public String getString(String key) {return getProperty(key);}

   /** */
   public String getString(String key, String def) {
      return getProperty(key, def);
   }

  /** */
  public Vector getVector(String key) {
    Object val=get(key);
    if (val == null)
      return null;
    if (val instanceof Vector)
      return (Vector)val;
    return null;
  }

   private final File findSourceFile() {
      EProperties props=this;
      File f=sourceFile;
      while (f == null && props != null) {
         props=props.parent;
         f=props.sourceFile;
      }
      return f;
   }

  /** */
  public EProperties getProperties(int i) {
    return getProperties(""+getKey(i));
  }

   /** */
   public EProperties getProperties(String key)
   {
      Object val=get(key);
      if (val == null) return null;

      if (val instanceof String)
      {
         String sval=(String) val;

         if (sval.startsWith("[") &&
             sval.endsWith("]"))
         { // this is an include
            // try to load it
            String file=sval.substring(1, sval.length()-1);
            if (debug) log.writeDebug (VERBOSE, "Loading "+file);

            File sf=findSourceFile();

            if (sf == null)
               throw new RuntimeException("Source file is null, cannot load");

            String path=FileUtil.getPath(sf.getAbsolutePath());

            if (file.startsWith("./"))
               file=path+file.substring(1);
            else if (file.startsWith("/"))
               file=path+file;
            else
               file=path+"/"+file;

            log.writeDebug (VERBOSE, "Attempting to load from "+file);
            EProperties eprops=new EProperties();
            try
            {
               eprops.load(file);
               this.put(key, eprops);
               return eprops;
            }
            catch (FileNotFoundException ex)
            {
               log.writeError("Could not load properties from "+
                              file);
               return null;
            }
            catch (Exception ex)
            {
               log.printStackTrace(ex);
               return null;
            }
         }
         else 
            return null;
      }
      else if (val instanceof EProperties)
         return (EProperties)val;
      else 
         return null;
   }

   /** */
   public boolean getBoolean (String key) {return getBoolean(key, false);}

   /** */
   public boolean getBoolean (String key, boolean def)
   {
      Object val=get(key);
      if (val == null) 
         return def;
      if (val instanceof String)
      {
         String s=(String)val;
         if (s.indexOf("true") != -1 ||
             s.indexOf("on") != -1)
            return true;
         else
            return false;
      }
      else
         return def;
   }

   /** */
   public void putBoolean(String key, boolean value) {
      setModified();
      String val=null;
      if (value)
         val="true";
      else
         val="false";
      put(key, val);
   }

   /** */
   public void putInt(String key, int i) {
      setModified();
      String val=""+i;
      put(key, val);
   }

   /** */
   public void putLong(String key, long l) {
      setModified();
      String val=""+l;
      put(key, val);
   }
   /** */
   public int getInt (String key) {return getInt(key, -1);}
   
   /** */
   public int getInt (String key, int def)
   {
      Object val=get(key);
      if (val == null) {
         return def;
      }
      if (val instanceof String) {
         String s=(String)val;
         try {
            return Integer.parseInt(s.trim());
         }
         catch (NumberFormatException ex) {
            log.writeError(1, "Cannot parse int from "+s.trim()+
                           ", returning default of "+def);
            log.writeError(4, "", ex);
            return def;
         }
      }
      else
         return def;
   }

   /** */
   public long getLong (String key) {return getLong(key, -1);}
   
   /** */
   public long getLong (String key, long def)
   {
      Object val=get(key);
      if (val == null) 
         return def;
      if (val instanceof String)
      {
         String s=(String)val;
         try
         {
            return Long.parseLong(s.trim());
         }
         catch (NumberFormatException ex) {
            log.writeError(1, "Cannot parse long from "+s.trim()+
                           ", returning default of "+def);
            log.writeError(4, "", ex);
            return def;
         }
      }
      else
         return def;
   }

   /** */
   public float getFloat (String key) {return getFloat(key, 0.0f);}
   
   /** */
   public float getFloat (String key, float def)
   {
      Object val=get(key);
      if (val == null) {
         return def;
      }
      if (val instanceof String) {
         String s=(String)val;
         try {
            return Float.parseFloat(s.trim());
         }
         catch (NumberFormatException ex) {
            log.writeError(1, "Cannot parse float from "+s.trim()+
                           ", returning default of "+def);

            log.writeError(4, "", ex);
            return def;
         }
      }
      else
         return def;
   }

   /** */
   public double getDouble (String key) {return getDouble(key, 0.0f);}
   
   /** */
   public double getDouble (String key, double def)
   {
      Object val=get(key);
      if (val == null) {
         return def;
      }
      if (val instanceof String) {
         String s=(String)val;
         try {
            return Double.parseDouble(s.trim());
         }
         catch (NumberFormatException ex) {
            log.writeError(1, "Cannot parse double from "+s.trim()+
                           ", returning default of "+def);

            log.writeError(4, "", ex);
            return def;
         }
      }
      else
         return def;
   }

   /** 
    * This is a custom integer get.  It is much slowser than the 
    * String key lookup that defaults to the hashtable method. <p>
    *
    * This will be used to retrieve the properties in order again
    * after 
    */
   public Key getKey(int num)
   {
      return (Key)mKeys.elementAt(num);
   }

   /** */
   public Key getKey(String keystr)
   {
      Key akey=new Key(keystr);
      //System.out.println ("Lookin for "+keystr+" in keys vector ");
      int index=mKeys.indexOf(akey);
      //System.out.println ("Found at "+index);
      if (index > 0)
         return (Key)mKeys.elementAt(index);
      else return null;
   }

   /** 
    */
   public Vector getKeys() {return mKeys;}

   /**
    *
    */
   public void load(InputStream is)
      throws IOException
   {
      setModified();
      PropertyInputStream in=new PropertyInputStream(is);

      try
      {
         Key key=getKey(in);
         
         while (key != null)
         {
            if (debug) log.writeDebug (VERBOSE, "EPLoad: key = "+key);
            Object val=getVal(in);
            if (debug) log.writeDebug (VERBOSE, "EPLoad: val = "+
                                    val.toString());
            this.put(key, val);
            key=getKey(in);
         }
      }
      catch(PropertyException ex)
      {
         log.printStackTrace(ex);
      }
   }

   /**
    * This method depends on 2 factors:<br>
    * 1) there is a string propery called 'environment', which is a key
    *    in the environments section.<br>
    * 2) there is a nested props property called 'environments'<br>
    *
    * If these are true, the properties defined in the indicated environment
    * section are 'promoted' to top level properties.  Otherwise this does
    * nothing.
    */
   public String promoteEnvironment()
   {
      String filename="";
      if (sourceFile != null)
         filename=sourceFile.getName();
      
      String environment=getProperty("environment");

      Boolean promoted=(Boolean)environsPromoted.get(environment);
      if (promoted != null)
         return environment;
      else
         environsPromoted.put(environment, new Boolean(true));

      EProperties environments=getProperties("environments");
      if (environment != null &&
          environments != null) {

         EProperties env=environments.getProperties(environment);
         if (env == null)
            log.writeDebug (filename+": Environment '"+environment+
                            "' is not defined in "+
                            "environments. Promotion failed.");
         else {
            merge(env);
         }
      }
      else {
         log.writeDebug (filename+
                         ": No environment or environments defined.");
      }
      return environment;
   }

   /**
    * This method depends on 2 factors:<br>
    * 1) there is a string propery called 'environment', which is a key
    *    in the environments section.<br>
    * 2) there is a nested props property called 'environments'<br>
    *
    * If these are true, the properties defined in the indicated environment
    * section are 'promoted' to top level properties.  Otherwise this does
    * nothing.
    */
   public String promoteEnvironment(String environment)
   {
      String filename="";
      if (sourceFile != null)
         filename=sourceFile.getName();
      
      Boolean promoted=(Boolean)environsPromoted.get(environment);
      if (promoted != null)
         return environment;
      else
         environsPromoted.put(environment, new Boolean(true));


      EProperties environments=getProperties("environments");
      if (environment != null &&
          environments != null) {

         EProperties env=environments.getProperties(environment);
         if (env == null)
            log.writeDebug (filename+": Environment '"+environment+
                            "' is not defined in "+
                            "environments. Promotion failed.");
         else {
            log.writeDebug(filename+
                           ": Promoting environment '"+environment+"'");
            merge(env);
         }
      }
      else {
         //(new Exception()).printStackTrace();
         // System.out.println("environsPromoted: "+environsPromoted);

         log.writeDebug (filename+
                         ": No environment or environments defined.");
      }
      return environment;
   }

   /**
    *
    */
   public Properties toJavaUtilProperties()
   {
      Properties props=new Properties();

      for (int i=0; i<this.size(); i++)
      {
         Key key=this.getKey(i);
         Object val=this.get(key);

         props.put(key.toString(), val);
      }
      return props;
   }

   
   /**
    * Load properties from a file represented by a string.
    *
    * @param filestr The name of the file containing eproperties.
    */
   public void load(String filestr)
      throws IOException
   {
      load(new File(filestr));
   }

   /**
    * Load properties from a file.
    */
   public void load(File file)
      throws IOException
   {
      sourceFile=new File(file.getAbsolutePath());
      FileInputStream fis=null;
      try
      {
         fis=new FileInputStream(sourceFile);
         load(fis);
      }
      finally
      {
         if (fis != null)
            fis.close();
      }
   }


   /**
    *
    */
   protected Key getKey(PropertyInputStream in)
      throws IOException, PropertyException
   {
      Key key=null;

      StringBuffer keyString=new StringBuffer();
      StringBuffer comments=new StringBuffer();

      while (true)
      {
         int ch=in.read();
         switch(ch)
         {
            case '#':
            case '!':
               comments.append((char)ch);
               comments.append(skipLine(in));
               break;
            case '=': 
            case ':': 
               return new Key(keyString.toString().trim(), comments);
            case '\n':
            case '\r':
               // This screws up the output file, work on this later.
               //comments.append((char)ch);
               break;
            case EOF:
               if (keyString.toString().trim().length() == 0)
                  return null;
               else
               {
                  if (keyString.toString().trim().length() == 0)
                  {
                     // do nothing
                  }
                  else
                  {
                     throw new 
                        PropertyException ("Unexpected EOF in key="+
                                           keyString.toString());
                  }
               }
            default: 
               keyString.append((char)ch);
               break;
         }
      }
   }
  
   protected Object getVal(PropertyInputStream is)
      throws IOException, PropertyException
   {
      int firstChar=skipWhitespace(is);
      
      switch (firstChar)
      {
         case '{':
         {
            EProperties val=getEPropsVal(is);
            val.parent=this;
            return val;
         }
         case '(':
            return getVectorVal(new PropertyInputStream(is));
         case (EOF):
            throw new PropertyException("Unexpected EOF getting value.");
         default:
            String val=getStringVal(is, firstChar);
            return val;
      }
   }

   /**
    *
    */
   protected String getStringVal(PropertyInputStream is, int firstchar)
      throws IOException, PropertyException
   {
      StringBuffer val=new StringBuffer();

      boolean firstloop=true;
      // val.append((char)firstchar);
      boolean inString=false;
      boolean isEscaped=false;

      while (true)
      {
         int ch;
         if (firstloop)
         {
            ch=firstchar;
            firstloop=false;
         }
         else
            ch=is.read();

         if (isEscaped)
         {
            if (debug)System.out.println ("Excaped, next char is "+ch+
                                          " lf is "+(int)'\n'+
                                          " cr is "+(int)'\r');
            if (ch == '\n' || ch == '\r')
               val.append((char)skipWhitespace(is));
            else
               val.append((char)ch); // Append EXACTLY whatever is after escape.
            isEscaped=false;
         }
         else
         {
            switch (ch)
            {
               case '\\':
               {
                  isEscaped=true;
                  break;
               }
               case '\n':
                  skipWhiteSpace(is, false);  // does not take the firstchar off
                                              // of the intput stream.
               case '\r':
               case EOF:
               {
                  if (inString)
                     val.append((char)ch);
                  else
                  {
                     String ret=val.toString().trim();
               
                     if ( ret.length() > 1) { //FIX, to cope with a string that's a single '"' //rbw20060526
                    	 if (ret.startsWith("\""))	ret=ret.substring(1);
                    	 if (ret.endsWith("\""))	ret=ret.substring(0, ret.length()-1);
                     }
                     
                     return ret;
                  }
               }
               break;
               case '"':
            	   inString = !inString;
            	   if (debug) System.out.println ("Quote found, instring ="+inString);
                  break;
               default: 
                  //if (debug) System.out.println ("Adding "+(byte)ch+" to key");
                  val.append((char)ch);
                  break;
            }
         }
      }
   }

   /**
    *
    */
   protected EProperties getEPropsVal(InputStream is)
      throws IOException, PropertyException
   {
      EProperties eprops=new EProperties();
      eprops.load(is);
      return eprops;
   }

   /**
    *
    */
   protected Vector getVectorVal(InputStream is)
      throws IOException, PropertyException
   {
      Vector val=new Vector();
      boolean readingString=false;
      StringBuffer tempVal=new StringBuffer();

      while (true)
      {
         int ch=is.read();
         switch(ch)
         {
            case '"':
               if (!readingString)
               {
                  readingString=true;
                  tempVal=new StringBuffer();
               }
               else
               {
                  readingString=false;
                  val.addElement(tempVal.toString());
               }
               break;
            case (EOF): 
               if (!readingString)
                  return val;
               else 
                  throw new PropertyException ("Mismatched quotes in vector.");
            default:
               if (readingString)
                  tempVal.append((char)ch);
               else
               {
                  // do nothing
               }
         }
      }
   }

   /**
    *
    */
   protected int skipWhitespace(PropertyInputStream pis)
      throws IOException
   {
      return skipWhiteSpace(pis, true);
   }

   /**
    *
    */
   protected int skipWhiteSpace(PropertyInputStream is, boolean returnLastChar)
      throws IOException
   {
      int lastChar=-9999;
      while (lastChar == -9999)
      {
         int ch=is.read();
         if (Character.isWhitespace((char)ch))
            continue;
         else 
            lastChar=ch;
      }
      if (!returnLastChar)
         is.unread(lastChar);  // Push this back to the stream
      
      return lastChar;
   }

   /**
    *
    */
   protected String skipLine(InputStream is)
      throws IOException, PropertyException
   {
      StringBuffer comments=new StringBuffer();
      while (true)
      {
         int ch=is.read();
         switch (ch)
         {
            case '\r':
               comments.append((char)ch);
               int ch2=is.read();
               if (ch2 != '\n')
                  throw new PropertyException("\\r w/o \\n");
               else 
                  comments.append((char)ch2);
                  return comments.toString();
            case(EOF):
            case '\n':
               comments.append((char)ch);
               return comments.toString();
            default: 
               comments.append((char)ch);
         }
      }
   }

   /** Override and throw exception so people don't use this function.*/
   public void save(OutputStream os, String header)
   {
      throw new RuntimeException("Save with the saveOnStream()");
   }

   /** */
   public void saveOnStream(OutputStream os) 
      throws IOException {
      saveOnStream(os, null);
   }

   /**
    *
    */
   public void saveOnStream(OutputStream os, String header)
      throws IOException
   {
      // PropertyWriter pw=new PropertyWriter(os, true);

      PropertyOutputStream pw=new PropertyOutputStream(os);
      
      if (header != null)
         pw.println (header);

      int size=this.size();      
      for (int i=0; i<size; i++)
      {
         Key key=getKey(i);
         if (debug) System.out.println ("looking for key '"+key.keyString().trim()+"'");
         Object value=get(key);
         if (value instanceof String)
         {
            String val=addEscapeChars(value.toString());
            pw.println (key.keyString()+" = \""+val+"\"");
         }
         else if (value instanceof Vector)
         {
            Vector v=(Vector)value;
            int keySize=key.key.length();
            String spacer="";
            for (int j=0; j<keySize+4; j++)
               spacer=spacer+" ";
            
            int vsize=v.size();
            if (vsize == 0)
            { // Zero element vector
               String line=key.keyString()+" = (  )";
               pw.println (line);
            }
            else
            {
               for (int j=0; j<vsize; j++)
               {
                  String val=(String)v.elementAt(j);
                  val=addEscapeChars(val);
                  String line=null;

                  if (vsize == 1)
                     line=key.keyString()+" = (\""+val+"\")";
                  else if (j==0)
                     line=key.keyString()+" = (\""+val+"\"";
                  else if (j == vsize-1)
                     line=spacer+"\""+val+"\")";
                  else 
                     line=spacer+"\""+val+"\"";

                  // this code was added 9/4/01.  It was an oversight.  
                  // After looking at the readVectorVal method, the a vector
                  // is really defined as a set of " delimited strings.  
                  // _ANY_ chars between the quotes should be ignored.  So
                  // adding the commas here is really for human readability.
                  if (j < vsize - 1)
                     line=line+", ";
                  
                  pw.println (line);
               }
            }
         }
         else if (value instanceof EProperties)
         {
            EProperties eprops=(EProperties)value;
            if (eprops.sourceFile == null)
            {
               pw.println (key.keyString()+" = ");
               pw.println ("{");
               eprops.saveOnStream(os, null);
               pw.println("}");
            }
            else
            {
               pw.println (key.keyString()+" = ["+
                           eprops.sourceFile.getAbsolutePath()+
                           "]");
               try {
                  eprops.save(); // Let it save itself
               }
               catch (Exception ex)
               {
                  throw new RuntimeException ("Unable to save "+key+" to "+
                                              eprops.sourceFile.
                                              getAbsolutePath());
               }
            }
         }
      }
      
      // Done writing this EProps
      pw.done();
   }

   /** */
   private String addEscapeChars(String s)
   {
      StringBuffer outval=new StringBuffer();
      char chars[]=s.toCharArray();
      for (int i=0; i<chars.length; i++)
      {
         if (isEscapeChar((int)chars[i]))
            outval.append("\\");

         outval.append(chars[i]);
      }
      return outval.toString();
   }
   /** */
   private final boolean isEscapeChar(int val)
   {
      for (int i=0; i<escapeChars.length; i++)
      {
         if ((char)val == escapeChars[i])
            return true;
      }
      return false;
   }

   /**
    *
    */
   public void save()
      throws IOException
   {
      if (sourceFile != null) {
         backup(sourceFile);  // Save a backup copy.
         if (debug) 
            System.out.println ("Saveing to "+sourceFile.getAbsolutePath());
         FileOutputStream fos=null;
         try {
            fos=new FileOutputStream(sourceFile);
            saveOnStream(fos, null);
         }
         finally {
            if (fos != null) {
               fos.flush();
               fos.close();
            }
         }
      }
      else {
         // Walk up the stack, find the parent, and save it.
         if (parent != null)
            parent.save();
         else
            throw new RuntimeException ("Cannot save, no source file has "+
                                        "been set.");
      }
   }

   /** */
   public void save(File f) 
      throws IOException {
      FileOutputStream fos=null;
      try {
         fos=new FileOutputStream(f);
         saveOnStream(fos);
      } finally {
         if (fos != null)
            fos.close();
      }
   }

   /**
    *
    */
   private void backup(File file)
   {
      if (file.exists() && !file.isDirectory())
      {
         file.renameTo(new File(file.getAbsolutePath()+".backup"));
      }
   }

    /**
     * Prints this property list out to the specified output stream. 
     * This method is useful for debugging. 
     *
     * @param   out   an output stream.
     * @since   JDK1.0
     */
   public void list(PrintStream out) 
   {
      out.println("-- listing properties --");
      //Hashtable h = new Hashtable();
      //enumerate(h);
      for (Enumeration e = keys() ; e.hasMoreElements() ;) {
         Key key = (Key)e.nextElement();
         Object val = get(key);

         out.println(key.key + "=" + val.toString());
      }
      out.println("-- end list --");
      for (int i=0; i<size(); i++) {
         Key k=getKey(i);
         Object val=get(k);
         if (k == null)
            out.println ("key("+i+") is null.");
         else if (val == null)
            out.println ("val for key "+k+" is null");
         else
            out.println (k.key+"="+val.toString());
      }
      out.println ("-- end list --");
   }

   /**
    * Merges one set of properties into another.  The equivalent of an "ADD" 
    * function.  <p>
    *
    * If a property was defined, it will be overwritten.
    * 
    * @param p The properties to be merged into the current object.
    */
   public void merge(EProperties p)
   {
      Vector keys=p.getKeys();
      for (int i=0; i<keys.size(); i++)
      {
         Object key=keys.elementAt(i);
         Object val=p.get(key);
         
         this.put(key, val);
      }
   }

   /** 
    * 
    */
   public String asString() 
      throws IOException {
      ByteArrayOutputStream baos=new ByteArrayOutputStream();
      saveOnStream(baos, null);
      return baos.toString();
   }

   /** */
   public void fromString(String s) 
      throws IOException {
      StringBufferInputStream sbis=new StringBufferInputStream(s);
      load(sbis);
   }

   /**
    *
    */
   private class PropertyInputStream extends InputStream
   {
      InputStream in=null;
      byte[] temp=new byte[1];
      int lastChar=-1;

      int pushBackChar=-9999;

      boolean inString=false;
      /**
       *
       */
      public PropertyInputStream(InputStream is)
      {
         if (is instanceof PropertyInputStream)
         {
            PropertyInputStream pis=(PropertyInputStream)is;
            in=pis.in;
         }
         else
            in=is;

         sPropertyStreamCount++;
      }

      /**
       *
       */
      public int read()
         throws IOException
      {
         if (pushBackChar != -9999)
         {
            int temp=pushBackChar;
            pushBackChar = -9999;
            return temp;
         }
         
         int val=in.read();
         
         if (debug) 
         {
            temp[0]=(byte)val;
            //System.out.println ("ch("+val+") = "+ new String(temp));
         }

         if (val == '"')
         {
            if (lastChar != '\\')
            {
               if (inString)
                  inString=false;
               else 
                  inString=true;
            }
         }

         if (lastChar == '\\')
         {
            return val;
         }
         else
         {
            if (inString)
               return val;

            switch(val)
            {
               case '}':
               case ')':
                  sPropertyStreamCount--;
               case (-1): 
                  if (debug)System.out.println ("Remaining Property Streams = "+
                                                sPropertyStreamCount);
                  return EOF;
               default: 
                  return val;
            }
         }
      } // End read

      /** */
      public void unread(int i)
      {
         pushBackChar=i;
      }
   }


   /**
    *
    */
   private class PropertyOutputStream extends BufferedOutputStream
   {
      // OutputStream out=null;

      String ident="";
      String lineSeparator=null;
      int lineSeparatorLength=0;

      boolean inString=false;
      int lastChar=-1;
      

      public PropertyOutputStream(OutputStream os)
      {
         super(os);
         // out=os;
         sOutputWriterCount++;

         for (int i=0; i<sOutputWriterCount-1; i++)
         {
            ident=ident+"  ";
         }
         lineSeparator = System.getProperty("line.separator");
         lineSeparatorLength=lineSeparator.length();
      }

      /** 
       * This function prints a line of data.  BE VERY CAREFUL. This 
       * function uses some deep recursion.
       */
      public void println(String s) throws IOException
      {
         if (s.trim().length() == 0) 
            return; // Don't print lines of whitespace
         
         int start=s.indexOf(lineSeparator);
         int start2=s.indexOf("\n");
         if (start != -1)
         {
            println(s.substring(0, start));
            println(s.substring(start+lineSeparatorLength));
         }
         else if (start2 != -1)
         {
            println(s.substring(0, start2));
            println(s.substring(start2+1));
         }
         else
         {
            /*if (s.length() > 75)
            {
               String remainder=s.substring(75);
               String front=s.substring(0, 75);
               writeLine(front+"\\");
               println (remainder);
            }
            else
            writeLine(ident+s); // this is the only line that writes*/

            writeLine(ident+s);
         }
      }

      /*private void printLines(String s)
      {
         int start=0;
         int end=s.indexOf(lineSeparator);
         while (end != -1)
         {
            super.print (ident+s.substring(start, end)+"\n");
            start=end+lineSeparatorLength;
            end=s.indexOf(lineSeparator, start);
         }
         // write the last line
         super.print (ident+s.substring(start)+"\n");
         }*/

      private void writeLine(String line) throws IOException
      {
         line=line+lineSeparator;
         char chars[]=line.toCharArray();
         for (int i=0; i<chars.length; i++)
         {
            this.write((int)chars[i]);
         }
         flush(); // Buffer 1 line at a time.
      }

      public void write(int i) throws IOException
      {
         /*if (inString && isEscapeChar(i))
           super.write((int)'\\');*/

         if (i == '"' && lastChar != '\\')
         {
            if (!inString)
               inString = true;
            else 
               inString = false;
         }

         if (i == '\r')
            return; // don't write these

         //if (i == '\n' && inString)
         //   super.write('\\');

         lastChar=i;
         super.write(i);
      }


      public void close() throws IOException
      {
         super.close();
         sOutputWriterCount--;
      }

      public void done()
      {
         sOutputWriterCount--;
      }

   }


   /**
    *
    */
   public class PropertyException extends Exception 
   {
      public PropertyException() {super();}
      public PropertyException(String s) {super(s);}
   }

   /**
    *
    */
   public static void main(String args[])
   {
      debug=true;
      try 
      {
         EProperties eprops=new EProperties();

         eprops.load("test.properties");

         eprops.list(System.out);

         eprops.sourceFile=new File("test.out.properties");
         eprops.save();

      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }
   }

   /**
    *
    */
   public void addObserver(PropertyObserver obs)
   {
      //log.writeDebug ("Adding observer "+obs.getClass().getName()+" to "+this);
      if (observers == null)
         observers=new Vector();
      observers.removeElement(obs); // prevent duplicates
      observers.addElement(obs);
   }

   /**
    *
    */
   public void removeObserver(PropertyObserver obs)
   {
      if (observers == null) return;
      else
         observers.removeElement(obs);
   }

   /**
    *
    */
   void notifyObservers(Key key, Object value)
   {
      if (observers == null) return;  
      
      // generate the event
      PropertyChangeEvent evt=new PropertyChangeEvent(key, value);

      for (int i=0; i<observers.size(); i++)
      {
         PropertyObserver obs=(PropertyObserver)observers.elementAt(i);
         obs.propertyChange(evt);
      }
   }
}
