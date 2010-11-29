package com.jet.apps.databrowser.ui;

import javax.swing.*;
import java.io.Writer;
import java.awt.BorderLayout;

import com.jet.log.*;

import com.jet.utils.ui.WinUtil;
import com.jet.utils.ui.MemoryMonitorPanel;
import com.jet.utils.icons.*;

/**
 * A system console frame that contains things like the log output, 
 * memory plots, or thread info.
 *
 * @author Paul Bemowski
 */
public class SystemConsoleFrame extends JFrame
{
   SwingLogPanel logPanel=null;
   
   MemoryMonitorPanel memoryMonitorPanel=null;

   JTabbedPane tabPane=null;

   /** */
   public SystemConsoleFrame() {
      super();
      setSize(550, 290);
      setTitle("DB System Console");
      //WinUtil.setParentIcon(this);

      ImageIcon icon=IconFactory.
      findIcon("resources/icons/log_16x16x16.gif");
      if (icon != null){
         setIconImage(icon.getImage());
      }


      tabPane=new JTabbedPane();

      getContentPane().setLayout(new BorderLayout());
      getContentPane().add (tabPane, "Center");
      
      logPanel=new SwingLogPanel();

      tabPane.add("Log", logPanel);

      memoryMonitorPanel=new MemoryMonitorPanel();
      tabPane.add("Memory", memoryMonitorPanel);
   }

   /** */
   public Writer getLogWriter() {
      return logPanel.getWriter();
   }
}