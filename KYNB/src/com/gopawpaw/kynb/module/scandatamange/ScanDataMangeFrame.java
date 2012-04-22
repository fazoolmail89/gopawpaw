package com.gopawpaw.kynb.module.scandatamange;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class ScanDataMangeFrame extends JFrame {

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
		optBtnsPanel.setSize(new Dimension(100, 600));
		optBtnsPanel.setPreferredSize(new Dimension(100, 600));
		
		setLayout(new BorderLayout());
		add(spnTable, BorderLayout.CENTER);
		add(optBtnsPanel, BorderLayout.EAST);
		setSize(900, 600);
		
		//--------------------------------------------
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ScanDataMangeFrame();
	}
}
