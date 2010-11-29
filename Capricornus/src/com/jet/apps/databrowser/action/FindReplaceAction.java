package com.jet.apps.databrowser.action;

import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.ui.*;

/*
 * $Log: FindReplaceAction.java,v $
 * Revision 1.3  2006/05/25 17:42:07  barney
 * removed 'import com.jet.utils.ui.EditorPane' line
 *
 * Revision 1.2  2004/10/20 02:56:09  bemocvs
 * *** empty log message ***
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class FindReplaceAction extends DefaultAction
{
   DataBrowser databrowser=null;

   /** */
   public FindReplaceAction(DataBrowser databrowser) {
      super("FindReplace...", databrowser);
      this.databrowser=databrowser;
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      log.writeDebug(4, "FindReplaceAction");

      // all disconnect logic goes here.
      FindReplace frd=new FindReplace(databrowser);
      frd.show();
   }
}
