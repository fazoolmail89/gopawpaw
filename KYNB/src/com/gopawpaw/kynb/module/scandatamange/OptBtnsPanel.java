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
		btnImport = new JButton("导入");
		btnExport = new JButton("导出");
		btnCleare = new JButton("清空");
		btnQuery = new JButton("查询");
		btnAdd = new JButton("新增");
		btnUpate = new JButton("修改");
		btnDelete = new JButton("删除");
		
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
