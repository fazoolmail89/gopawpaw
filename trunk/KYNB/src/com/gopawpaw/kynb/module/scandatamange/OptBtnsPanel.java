package com.gopawpaw.kynb.module.scandatamange;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OptBtnsPanel extends JPanel {
	
	private ScanDataMangeFrame mainFrame = null;
	private JButton btnImport = null;
	private JButton btnExport = null;
	private JButton btnCleare = null;
	private JButton btnQuery = null;
	private JButton btnAdd = null;
	private JButton btnUpate = null;
	private JButton btnDelete = null;
	
	public OptBtnsPanel() {
		btnImport = new JButton("����");
		btnExport = new JButton("����");
		btnCleare = new JButton("���");
		btnQuery = new JButton("��ѯ");
		btnAdd = new JButton("����");
		btnUpate = new JButton("�޸�");
		btnDelete = new JButton("ɾ��");
		
		setLayout(new FlowLayout());
		add(btnImport);
		add(btnCleare);
		add(btnQuery);
		add(btnAdd);
		add(btnUpate);
		add(btnDelete);
	}

	public void setMainFrame(ScanDataMangeFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
}
