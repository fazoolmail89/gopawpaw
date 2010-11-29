package com.jet.apps.databrowser.action;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import com.jet.apps.databrowser.model.TreePanelModel;
import com.jet.apps.databrowser.ui.misc.IconManager;
import com.jet.utils.icons.*;

/*
 * $Log: TreeRefreshAction.java,v $
 * Revision 1.3  2004/10/07 22:50:29  bemocvs
 * Working on actions.
 *
 * Revision 1.2  2004/10/07 21:11:37  bemocvs
 * Editor actions
 *
 * Revision 1.1.1.1  2002/12/05 00:08:01  bemocvs
 * initial checkin
 *
 * Revision 1.2  2002/05/04 18:43:18  bemocvs
 * changed icon
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * @author Paul Bemowski
 */
public class TreeRefreshAction extends AbstractAction
{   
   static Icon icon=IconManager.getInstance().getIcon("db_refresh");

   TreePanelModel tpm=null;
   /** */
   public TreeRefreshAction(TreePanelModel m) {
      super("", icon);
      tpm=m;
   }

   /** */
   public void actionPerformed(ActionEvent ae) {
      tpm.reload();
   }
}
