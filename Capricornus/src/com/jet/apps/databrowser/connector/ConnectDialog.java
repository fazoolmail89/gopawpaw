package com.jet.apps.databrowser.connector;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import com.jet.apps.databrowser.database.ConnectionInfo;
import com.jet.utils.ui.*;

import java.util.*;
import java.io.*;

/**
 * Connector superclass.
 *
 * @author Paul Bemowski
 */
abstract public class ConnectDialog extends JDialog
{
   protected Frame parent=null;

   protected boolean ok=false;

   /**
    *
    */
   public ConnectDialog(Frame p)
   {
      super (p, true);
      parent=p;
   }
}
