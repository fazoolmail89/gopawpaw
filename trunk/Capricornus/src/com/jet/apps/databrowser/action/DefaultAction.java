package com.jet.apps.databrowser.action;

import java.awt.Component;

import javax.swing.*;
import java.awt.event.*;

import com.jet.log.Logger;
import com.jet.utils.ui.WinUtil;
import com.jet.apps.databrowser.model.DBSession;

import java.util.*;

/*
 * $Log: DefaultAction.java,v $
 * Revision 1.3  2007/02/18 18:00:58  bemocvs
 * *** empty log message ***
 *
 * Revision 1.2  2003/08/21 20:25:45  bemocvs
 * Fixes for comments in SQL, save
 *
 * Revision 1.1.1.1  2002/12/05 00:08:00  bemocvs
 * initial checkin
 *
 * Revision 1.3  2002/10/21 21:53:26  bemocvs
 * Fixed xml export
 *
 * Revision 1.2  2002/05/01 21:19:37  bemocvs
 * atl weekend work.
 *
 * Revision 1.1  2002/04/21 00:55:29  bemocvs
 * db3 initial checkin
 *
 */

/**
 * This is the 'DefaultAction'.
 * @author Paul Bemowski
 */
public class DefaultAction extends AbstractAction 
   implements Logger, Observer
{
   protected static final int h=24;
   protected static final int w=24;

   protected JFrame parent=null;
   protected DBSession session=null;

   /** */
   public DefaultAction(String s) {
      super(s);
   }

   /** */
   public DefaultAction(String s, DBSession session) {
      this(s);
      this.session=session;
   }

   /** */
   public DefaultAction(String s, JFrame p) {
      super(s);
      parent=p;
   }

   /** */
   public DefaultAction(String s, DBSession session, JComponent c) {
      super(s);
      this.session=session;
      parent=WinUtil.findParentJFrame(c);
   }
   
   /** */
   public DefaultAction(String s, DBSession session, JFrame p) {
      super(s);
      this.session=session;
      this.parent=p;
   }
   
   /** */
   public DefaultAction(Icon i, DBSession session) {
      super("", i);
      this.session=session;
   }

   /** */
   public DefaultAction(Icon i) {
      super("", i);
   }

   /** */
   public DefaultAction(String s, Icon i) {
      super(s, i);
   }

   /** */
   public DefaultAction(Icon i, DBSession session, JFrame parent) {
      super("", i);
      this.session=session;
      this.parent=parent;
   }

   /** */
   public DefaultAction(JFrame parent) {
      super("");
      this.parent=parent;
   }

   public void actionPerformed(ActionEvent ae) {
      System.out.println ("DefaultAction: "+ae);
   }
   
   /** */
   public void update(Observable o, Object obj) {}
}
