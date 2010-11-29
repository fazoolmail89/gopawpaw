package com.jet.utils.icons;


import javax.swing.*;
import java.awt.*;

/**
 *
 *
 *
 */
public class ActionLabel extends JLabel
{
   boolean oneMore=true;
   Image animation=null;
   ImageIcon runningImage=null;
   ImageIcon stoppedImage=null;
   

   boolean running=false;

   public ActionLabel(ImageIcon ri, ImageIcon si)
   {
      super(si);

      runningImage=ri;
      stoppedImage=si;

      animation=runningImage.getImage();
      animation.flush();
   }

   public void start()
   {
      running=true;
      this.setIcon(runningImage);
      this.revalidate();
   }


   public void stop()
   {
      running=false;
      this.setIcon(stoppedImage);
      animation.flush();
   }

   public boolean isRunning() {return running;}
}





