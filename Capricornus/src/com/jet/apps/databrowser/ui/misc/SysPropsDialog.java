package com.jet.apps.databrowser.ui.misc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.jet.utils.ui.PopupTextArea;

/*
 * $Log: SysPropsDialog.java,v $
 * Revision 1.2  2006/05/25 17:41:24  barney
 * made SysPropsDialog into a singleton
 *
 * Revision 1.1  2006/05/24 17:43:43  barney
 * added SysPropsDialog
 *
 */
/**
 * Display a list of System properties in a dialog box.
 * 
 * @author barney
 * @since 3.3.3
 */
public class SysPropsDialog extends JDialog implements ActionListener{

	/**	stop eclipse warning: */
	private static final long serialVersionUID = 1L;
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 600;

	private static SysPropsDialog _inst = null; 

	
	public static SysPropsDialog getInst() {
		if ( _inst == null)	_inst = new SysPropsDialog();			
		return _inst;		
	}
	
	private SysPropsDialog() {
		initGui();
	}

	private void initGui() {
		this.setTitle("System Properties");
		this.setSize(new Dimension(WIDTH, HEIGHT));
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel btnPanel = new JPanel(new BorderLayout()); 
		
		JButton closeBtn = new JButton("Close");
		closeBtn.addActionListener(this);
		
		Vector propV = new Vector();
        String sysPropName;
        for (Enumeration e = System.getProperties().propertyNames() ; e.hasMoreElements() ;) {
            sysPropName = (String)e.nextElement();
            propV.add(sysPropName+" = "+System.getProperties().getProperty(sysPropName)+"\n");
        }
        Collections.sort(propV);
        StringBuffer sb = new StringBuffer();
        for (Iterator iter = propV.iterator(); iter.hasNext();)
			sb.append((String) iter.next());	        
        PopupTextArea propsArea = new PopupTextArea(sb.toString());
		
		btnPanel.add(closeBtn, BorderLayout.EAST);	
		mainPanel.add(new JScrollPane(propsArea), BorderLayout.CENTER);
		mainPanel.add(btnPanel, BorderLayout.SOUTH);
		
		this.setContentPane(mainPanel);
		//this.pack();
		//put in middle of screen 
		Dimension scrD = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((scrD.width-WIDTH)/2, (scrD.height-HEIGHT)/2);		
		
	}

	public void actionPerformed(ActionEvent e) {
		if ("close".equals(e.getActionCommand().toLowerCase()) ) 
			this.dispose();		
	}


}
