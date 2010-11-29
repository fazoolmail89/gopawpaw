package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;
import java.net.URL;

import com.jet.log.Logger;
import com.jet.apps.databrowser.model.UIModel;
import com.jet.apps.databrowser.ui.*;
import com.jet.apps.databrowser.ui.misc.*;

/*
 * $Log: WhyIsMyConnectorDisabled.java,v $
 * Revision 1.1  2007/02/18 18:02:27  bemocvs
 * Support for Java Web Start and SQL Log
 *
 * Revision 1.2  2004/10/20 02:56:09  bemocvs
 * *** empty log message ***
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/05/01 21:19:37  bemocvs
 * atl weekend work.
 *
 * Revision 1.1  2002/04/21 19:54:57  bemocvs
 * db3 work
 *
 */

/**
 * Shows the log window.
 * @author Paul Bemowski
 */
public class WhyIsMyConnectorDisabled extends DefaultAction implements Logger
{
   static Icon icon=IconManager.getInstance().getIcon("button_quickhelp");

   static URL CONNECTOR_HELP=
   ClassLoader.getSystemResource("resources/help/connector/connector.html");
   

   /** */
   public WhyIsMyConnectorDisabled() {
      super("Why Is My Connector Disabled?", icon);
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      UIModel.setHelpURL(CONNECTOR_HELP);
   }
}








