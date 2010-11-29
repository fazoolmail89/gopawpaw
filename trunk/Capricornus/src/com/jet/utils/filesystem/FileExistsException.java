package com.jet.utils.filesystem;
import java.io.File;
/**
 * Thrown when FileUtil.rmRF cannot delete a file or directory.
 */
public class FileExistsException extends Exception 
{
   public FileExistsException(File f) {
      super("File exists: "+
            (f == null ? "a null file.":f.getAbsolutePath()));
   }
}
