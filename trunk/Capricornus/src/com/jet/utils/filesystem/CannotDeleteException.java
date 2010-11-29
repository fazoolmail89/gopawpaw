package com.jet.utils.filesystem;
import java.io.File;
/**
 * Thrown when FileUtil.rmRF cannot delete a file or directory.
 */
public class CannotDeleteException extends java.io.IOException 
{
   public CannotDeleteException(File f) {
      super("Cannot delete "+
            (f == null ? "a null file.":f.getAbsolutePath()));
   }
}
