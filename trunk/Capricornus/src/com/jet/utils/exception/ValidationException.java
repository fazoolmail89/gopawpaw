package com.jet.utils.exception;

import java.util.Vector;

/**
 * Description of the class
 *
 * @author Paul Bemowski
 */
public class ValidationException extends NestedException
{
   private int mErrorCount=0;
   private Vector mFields;
   private Vector mCorrections;

   public ValidationException ()
   {
      super("Validation Exception", null);
      mFields=new Vector();
      mCorrections=new Vector();
   }
   
   public ValidationException (String field, String correction)
   {
      this(field, correction, null);
   }

   public ValidationException (String field, String correction,
                               Exception nested)
   {
      super ("Validation exception", nested);
      mFields=new Vector();
      mCorrections=new Vector();

      this.addValidation (field, correction);
   }

   /**
    * Merges one validation exception into another.  Useful for nested validations.
    */
   public void add(ValidationException ex)
   {
      for (int i=0; i<ex.getErrorCount(); i++)
      {
         this.addValidation(ex.getField(i), ex.getCorrection(i));
      }
   }

   public void addValidation (String field, String correction)
   {
      mErrorCount++;

      // deal with possible null parms.
      if (field == null)
         field="Not defined.";
      if (correction == null)
         correction = "Not defined.";

      mFields.addElement(field);
      mCorrections.addElement(correction);
   }

   public int getErrorCount() {return mErrorCount;}

   public String getField(int i)
   {
      if (i < mFields.size())
         return (String)mFields.elementAt(i);
      else
         return "Out of range.";
   }
   
   public String getCorrection (int i)
   {
      if (i < mFields.size() && i >= 0)
         return (String)mCorrections.elementAt(i);
      else
         return "Out of range.";
   }

   public String toString()
   {
      return "Fields: "+mFields.toString()+" Corrections: "+
      mCorrections.toString();
   }
}




