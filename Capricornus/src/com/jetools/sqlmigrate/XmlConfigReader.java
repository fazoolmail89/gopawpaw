package com.jetools.sqlmigrate;

import java.io.*;
import java.util.*;

import org.jdom.*;
import org.jdom.input.*;

import org.jdom.*;
import org.jdom.input.*;

/**
 * Reads the xml file defining a migration job.
 */
public class XmlConfigReader
{
   /** */
   File configFile=null;

   /** */
   DatabaseConnection sourceDb=null;

   /** */
   DatabaseConnection destDb=null;

   /** */
   ArrayList tasks=null;

   Document document=null;

   public XmlConfigReader(File f) 
      throws IOException, JDOMException  {
      configFile=f;
      SAXBuilder saxBuilder=new SAXBuilder();
      document=saxBuilder.build(configFile);
   }
   
   public XmlConfigReader(InputStream is) 
      throws IOException, JDOMException  {
      SAXBuilder saxBuilder=new SAXBuilder(false);
      document=saxBuilder.build(is);
   }

   public void parse() 
      throws JDOMException, IOException {


      Element rootElement=document.getRootElement();

      // ok, we have a document, now build the various components.
      String driver, url, user, password=null;
      
      // Build source database
      Element sourceDbEle=rootElement.getChild("source_db");
      driver=sourceDbEle.getChild("driver").getText();      
      url=sourceDbEle.getChild("url").getText();
      user=sourceDbEle.getChild("user").getText();
      password=sourceDbEle.getChild("password").getText();
      sourceDb=new DatabaseConnection(driver, url, user, password);

      // Build dest database
      Element destDbEle=rootElement.getChild("dest_db");
      driver=destDbEle.getChild("driver").getText();      
      url=destDbEle.getChild("url").getText();
      user=destDbEle.getChild("user").getText();
      password=destDbEle.getChild("password").getText();
      destDb=new DatabaseConnection(driver, url, user, password);

      
      buildTasks(document);
   }


   private void buildTasks(Document document) 
      throws JDOMException {
      tasks=new ArrayList();
      Element rootElement=document.getRootElement();
      
      Element tasksElement=rootElement.getChild("tasks");
      List taskChildren=tasksElement.getChildren();

      for (int i=0; i<taskChildren.size(); i++) {
         Element child=(Element)taskChildren.get(i);
         String name=child.getName();

         Task task=null;
         if (name.equals("sqltask"))
            task=buildSqlTask(child);
         else if (name.equals("table_join_task"))
            task=buildTableJoinTask(child);
         else 
            System.out.println ("PARSE ERROR: Don't understand element "+
                                name+" in <tasks>");

         if (task != null)
            tasks.add(task);
      }
   }

   Task buildSqlTask(Element sqlTaskElement) {
      String target=sqlTaskElement.getAttributeValue("target");
      String sql=sqlTaskElement.getChild("sql").getText();

      Task task=null;
      if (target.equals("source")) {
         task=new SQLTask(sql, SQLTask.SOURCE);
      } else if (target.equals("dest")) {
         task=new SQLTask(sql, SQLTask.DEST);
      } else {
         System.out.println ("ERROR: target='"+target+"' however target "+
                             "must be in [source,dest]");
      }
      return task;
   }

   Task buildTableTask(Element tableTaskElement) {
      return null;
   }

   Task buildTableJoinTask(Element tableJoinElement) 
      throws JDOMException {
      String sourceTable=tableJoinElement.getChild("source_table").getText();
      String destTable=tableJoinElement.getChild("dest_table").getText();
      String pkey=tableJoinElement.getChild("pkey").getText();
      String where=tableJoinElement.getChild("where").getText();
      Attribute chunkSizeAttribute=tableJoinElement.getAttribute("chunkSize");
      int chunkSize=chunkSizeAttribute.getIntValue();

      List mapElements=tableJoinElement.getChildren("columnmap");
      
      ArrayList maps=new ArrayList();
      for (int i=0; i<mapElements.size(); i++) {
         Element colMapEle=(Element)mapElements.get(i);
         String scol=colMapEle.getAttributeValue("source");
         String dcol=colMapEle.getAttributeValue("dest");
         String type=colMapEle.getAttributeValue("type");
         Attribute trimAttribute=colMapEle.getAttribute("trim");
         
         ColumnMap colMap=null;
         if (trimAttribute != null)
            colMap=new ColumnMap(scol, dcol, getType(type), 
                                 trimAttribute.getBooleanValue());
         else 
            colMap=new ColumnMap(scol, dcol, getType(type));
         maps.add(colMap);
      }

      TableJoinTask join=new TableJoinTask(destTable, maps,
                                           sourceTable, pkey, where, 
                                           chunkSize);
      return join;
   }

   String getType(String type) {
      if (type.equalsIgnoreCase("STRING"))
         return ColumnMap.STRING;

      else if (type.equalsIgnoreCase("INT"))
         return ColumnMap.INT;

      else if (type.equalsIgnoreCase("LONG"))
         return ColumnMap.LONG;
      
      else if (type.equalsIgnoreCase("DOUBLE"))
         return ColumnMap.DOUBLE;

      else if (type.equalsIgnoreCase("DATETIME"))
         return ColumnMap.DATETIME;
      
      // log an error here?? probably.
      return ColumnMap.STRING;
   }


   public static void main(String args[]) 
      throws Exception {
      // InputStream is=XmlConfigReader.class.getResourceAsStream("x.xml");
      XmlConfigReader reader=new XmlConfigReader(new File("../config/x.xml"));
      reader.parse();

      System.out.println (reader.sourceDb);
      System.out.println (reader.destDb);
      
      for (int i=0; i<reader.tasks.size(); i++) {
         Task t=(Task)reader.tasks.get(i);
         System.out.println(t);
      }
   }
}
