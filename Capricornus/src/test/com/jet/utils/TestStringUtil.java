package test.com.jet.utils;

import java.io.*;

import com.jet.utils.StringUtil;

import junit.framework.*;

/* 
 * $Log: TestStringUtil.java,v $
 * Revision 1.2  2003/01/15 01:30:35  bemocvs
 * incremental checking from redsite.
 *
 * Revision 1.1  2002/12/31 17:56:01  bemocvs
 * StringUtil replace fix and unit tests, DataEditor clean
 *
 */

/**
 *
 *
 */
public class TestStringUtil extends TestCase
{
   /** */
   public TestStringUtil(String name) {
      super(name);
   }

   public static Test suite() {
      return new TestSuite(TestStringUtil.class);
   }
   
   public void setUp() { }

   public void tearDown() { }

   public void testReplace() 
      throws Exception
   {
      String target="now is the time. is->was";
      String key="is";
      String val="was";
      String expectedresult="now was the time. was->was";

      String result=StringUtil.replace(key, val, target);
      assertTrue("Error replacing "+key+" with "+val+" in '"+target+"' \n"+
                 "'"+result+"' != '"+expectedresult+"'", 
                 result.equals(expectedresult));      

      target="O'Donnell, O'Grady, and O'Connell are mics.";
      key="'";
      val="''";
      expectedresult="O''Donnell, O''Grady, and O''Connell are mics.";
      result=StringUtil.replace(key, val, target);
      assertTrue("Error replacing "+key+" with "+val+" in '"+target+"' \n"+
                 "'"+result+"' != '"+expectedresult+"'", 
                 result.equals(expectedresult));      

      target="x'''y''z'";
      key="'";
      val="''";
      expectedresult="x''''''y''''z''";
      result=StringUtil.replace(key, val, target);
      assertTrue("Error replacing "+key+" with "+val+" in '"+target+"' \n"+
                 "'"+result+"' != '"+expectedresult+"'", 
                 result.equals(expectedresult));      

      // this was the test that would fail!!
      target="yo baby yo baby yo baby yo";
      key="yo";
      val="yoyoyo";
      expectedresult="yoyoyo baby yoyoyo baby yoyoyo baby yoyoyo";
      result=StringUtil.replace(key, val, target);
      assertTrue("Error replacing "+key+" with "+val+" in '"+target+"' \n"+
                 "'"+result+"' != '"+expectedresult+"'", 
                 result.equals(expectedresult));      
   }

   public void testReplaceInsensitive() 
      throws Exception
   {
      String target="now IS the time. IS->was";
      String key="is";
      String val="wasn't";
      String expectedresult="now wasn't the time. wasn't->was";

      String result=StringUtil.replaceInsensitive(key, val, target);
      assertTrue("Error replacing "+key+" with "+val+" in '"+target+"' \n"+
                 "'"+result+"' != '"+expectedresult+"'", 
                 result.equals(expectedresult));      

//        target="O'Donnell, O'Grady, and O'Connell are mics.";
//        key="'";
//        val="''";
//        expectedresult="O''Donnell, O''Grady, and O''Connell are mics.";
//        result=StringUtil.replace(key, val, target);
//        assertTrue("Error replacing "+key+" with "+val+" in '"+target+"' \n"+
//                   "'"+result+"' != '"+expectedresult+"'", 
//                   result.equals(expectedresult));      
   }

   /** */
   public static void main(String args[]) {
      junit.textui.TestRunner.run(suite());
   }
}





