package com.jet.utils.ui;


/**
 *
 *
 */
public interface ProgressWatcher
{
   public static final int SINGLE=1;
   public static final int DUAL=2;

   public void setType(int i);
   public void done();
   public void done(String s);
   public void interrupted(String s);
   public boolean isStopped();

   public int setPrimaryRange(int min, int max);
   public void setPrimaryValue(int i);
   public void setPrimaryText(String s);
   public void setPrimaryProgress(int i, String s);

   public int setSecondaryRange(int min, int max);
   public void setSecondaryValue(int i);
   public void setSecondaryText(String s);
}
