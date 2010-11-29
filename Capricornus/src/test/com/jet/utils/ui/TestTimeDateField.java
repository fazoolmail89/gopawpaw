package test.com.jet.utils.ui;

import java.util.*;
import java.text.*;

import com.jet.utils.ui.*;

import junit.framework.*;

/**
 *
 *
 */
public class TestTimeDateField extends TestCase
{
   /** */
   public TestTimeDateField(String name) {
      super(name);
   }

   public static Test suite() {
      return new TestSuite(TestTimeDateField.class);
   }
   
   public void setUp() { }

   public void tearDown() { }

   public void testTimestamp()
      throws Exception
   {
      DateTimeField dtf=new DateTimeField(DateTimeField.TIMESTAMP_MODE);
      Date date=new Date();
      int nanos=98723;

      dtf.setDate(date);
      dtf.setNanos(nanos);

      int testnanos=dtf.getNanos();
      Date testdate=dtf.getDate();
      if (testdate == null){
         fail("Date returned from field is null");
         return;
      }
      DateFormat format=new SimpleDateFormat("MMddyyyy HH:mm:ss");


      assertTrue("Dates do not match", 
                 format.format(date).equals(format.format(testdate)));
      assertTrue("nanos do not match", nanos == testnanos);
   }
}
