package test.com.jet.utils.filesystem;

import java.io.*;

import com.jet.utils.filesystem.*;

import junit.framework.*;

/**
 *
 *
 */
public class TestFileUtil extends TestCase
{
   /** */
   public TestFileUtil(String name) {
      super(name);
   }

   public static Test suite() {
      return new TestSuite(TestFileUtil.class);
   }
   
   public void setUp() { }

   public void tearDown() { }

   public void testRm() 
      throws Exception
   {
      File tempRoot=new File("./file_util_unit_test");
      StringBuffer sb=new StringBuffer("ljkljlkjlkj");
      
      System.out.println ("Making tree in "+tempRoot.getAbsolutePath());
      File temp1=new File(tempRoot, "a/b/c/d");
      temp1.mkdirs();

      FileUtil.saveToFile(new File(temp1, "testa"), sb);
      FileUtil.saveToFile(new File(temp1, "testb"), sb);
      FileUtil.saveToFile(new File(temp1, "testc.txt"), sb);
      
      File temp2=new File(tempRoot, "x/y/z");
      temp2.mkdirs();
      File temp3=new File(tempRoot, "hidden/.hiddendir");
      temp3.mkdirs();
      FileUtil.saveToFile(new File(temp3, "testfile"), sb);
      FileUtil.saveToFile(new File(temp3, ".hiddenfile"), sb);
      
      File temp4=new File(temp3, "another");
      temp4.mkdirs();

      // ok, now remove it
      System.out.println ("Removing "+tempRoot.getAbsolutePath());
      FileUtil.rmRF(tempRoot, true);
      assertTrue("rmRF didn't remove root", !tempRoot.exists());
   }

   public void testCopy() 
      throws IOException, FileExistsException {
      File temp=File.createTempFile("fileutiltest", null);
      FileUtil.saveToFile(temp, new StringBuffer("lknlkjlja"));
      
      File temp2=File.createTempFile("fileutiltest", null);
      // boolean success=temp2.delete();
      // assertTrue("Could not delete second temp file", success);
      

      FileUtil.copy(temp, temp2, true);
      assertTrue("File sizes are equal", temp2.length() == temp.length());
   }

   /** */
   public static void main(String args[]) {
      junit.textui.TestRunner.run(suite());
   }
}





