package com.jet.apps.databrowser.ui;

import javax.swing.*;
import javax.swing.border.*;
import com.jet.apps.databrowser.Main;
import com.jet.utils.ui.WinUtil;
import com.jet.utils.icons.*;
import java.awt.*;
import com.jet.core.*;

import java.util.Vector;

/*
 * $Log: Splash.java,v $
 * Revision 1.2  2004/11/17 18:08:44  bemocvs
 * 3.3.0beta cleanup
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.3  2002/05/04 18:51:52  bemocvs
 * working
 *
 * Revision 1.2  2002/05/01 21:21:30  bemocvs
 * atl weekend work.
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 * Revision 1.6  2002/04/10 18:32:42  bemocvs
 * Added line item for JavaWebStartEdition.
 *
 */

/**
 * DataBrowser splash screen.
 */
public class Splash extends JWindow
{
   JLabel status=null;   
   JLabel init=null;

   /**
    * The constructor should be capable, but thin.  We don't want to spend
    * all the startup time initializing the splash screen!
    */
   public Splash()
   {
      this.getContentPane().setLayout(new GridLayout(1,1));

      JPanel splashPanel=getSplashPanel();

      this.getContentPane().add(splashPanel);

      pack();
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      setLocation(screenSize.width/2 - this.getSize().width/2,
                  screenSize.height/2 - this.getSize().height/2);
   }

   /** */
   public JPanel getSplashPanel() {
      JPanel outerPanel=new JPanel(new GridBagLayout());
      outerPanel.setBackground(Color.white);
      outerPanel.setOpaque(true);
      GridBagConstraints c=new GridBagConstraints();

      Icon co_logo=IconFactory.findIcon("resources/icons/jet/250pxLogo.gif");
      
      JLabel logo=new JLabel(co_logo);

      Font font=new Font("Arial", Font.PLAIN, 20);
      Font bigfont=new Font("Arial", Font.BOLD, 32);
      Font smallfont=new Font("Arial", Font.PLAIN, 14);

      JLabel databrowser=new JLabel("DataBrowser "+Main.version);
      databrowser.setForeground(Color.black); 
      databrowser.setFont(font);
      // JLabel version=new JLabel(Main.version);

      // version.setFont(font);

      JLabel webaddress=new JLabel("http://jmatrix.net");
      webaddress.setFont(smallfont);
      webaddress.setForeground(Color.black);

      JLabel buildDate=new JLabel("Build: "+BuildID.getBuildDate());
      buildDate.setFont(font);

      init=new JLabel("");
      init.setFont(font);
      
      outerPanel.setBorder(new EtchedBorder(EtchedBorder.RAISED));

      c.gridx=0; c.gridy=0; c.anchor=c.CENTER;
      c.gridheight=2; c.gridwidth=1; c.insets=new Insets(2, 2, 2, 2);
      outerPanel.add(logo, c);

      JPanel prodLabelPanel=new JPanel();
      prodLabelPanel.setBackground(Color.white);
      c.gridx=1; c.gridheight=1; c.anchor=c.SOUTH;
      c.gridy=0;
      outerPanel.add(prodLabelPanel, c);


      Vector splashVersions=new Vector();
      splashVersions.add(databrowser);

//       if (MainWin.jbuilder) {
//          // prodLabelPanel.setLayout(new GridLayout(2, 1));
//          JLabel jbuilder=new JLabel("JBuilder Embedded");
//          jbuilder.setForeground(Color.black);
//          jbuilder.setFont(font);
//          splashVersions.addElement(jbuilder);
//       }
      if (System.getProperty("javawebstart.version") != null) {
         JLabel l=new JLabel("Java Web Start Edition");
         l.setForeground(Color.blue);
         l.setFont(font);
         splashVersions.addElement(l);
      }
      
      
      prodLabelPanel.setLayout(new GridLayout(splashVersions.size(), 1));
      for (int k=0; k<splashVersions.size(); k++) {
         JLabel l=(JLabel)splashVersions.elementAt(k);
         prodLabelPanel.add(l);
      }

      c.gridy=1; c.anchor=c.NORTH;
      // outerPanel.add(version, c);

      c.gridwidth=2;
      c.gridx=0; c.gridy=2; c.anchor=c.WEST;
      outerPanel.add(webaddress, c);

      c.gridy=3;
      outerPanel.add(buildDate, c);

      c.gridy=4; 
      outerPanel.add(init, c);

      status=new JLabel();
      status.setFont(font);
      c.gridy=5; c.anchor=c.WEST;
      outerPanel.add(status, c);
      
      return outerPanel;
   }

   /** */
   public void show() {
      super.show();
   }

   /** */
   public void setStatus(String s) {
      setStatus(s, null);
   }
   
   /** */
   public void setStatus(String s, Color c) {
      Color color=c;
      if (color == null)
         color=Color.black;
      init.setText("Initializing: ");
      status.setForeground(color);
      status.setText(s);
      pack();
   }

   /** */
   public void dispose() {
      super.dispose();
   }

   /** */
   public static void main(String args[])
      throws Exception
   {
      Splash sp=new Splash();
      sp.show();

      for (int i=0; i<10; i++) {
         sp.setStatus("Init status "+i);
         Thread.currentThread().sleep(1000);
      }
   }
}
