package com.gopawpaw.kynb.module.scandatamange;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.gopawpaw.frame.dev.common.GppJarRunableInterface;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.module.BaseModuleFrame;

public class ScanDataMangeFrame extends BaseModuleFrame implements
GppJarRunableInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static ScanDataMangeFrame mainFrame = null;
	
	private TableScrollPane spnTable = null;
	private static OptBtnsPanel optBtnsPanel = null;
	
	public ScanDataMangeFrame() {
		spnTable = new TableScrollPane();
		optBtnsPanel = new OptBtnsPanel();
		optBtnsPanel.setSize(new Dimension(70, 600));
		optBtnsPanel.setPreferredSize(new Dimension(70, 600));
		
		setLayout(new BorderLayout());
		add(spnTable, BorderLayout.CENTER);
		add(optBtnsPanel, BorderLayout.EAST);
		setSize(900, 600);
		
		//--------------------------------------------
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				// IdnoUpgrade thisClass = new IdnoUpgrade();
				mainFrame = new ScanDataMangeFrame();
				// thisClass.setVisible(true);
				mainFrame.setVisible(true);
				optBtnsPanel.setMainFrame(mainFrame);
			}
		});
	}

	@Override
	public boolean runJar(String[] args) {
		ScanDataMangeFrame.main(args);
		return false;
	}
}
