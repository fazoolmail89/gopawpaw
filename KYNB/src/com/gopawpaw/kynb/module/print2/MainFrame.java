package com.gopawpaw.kynb.module.print2;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;

import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.module.BaseModuleFrame;

public class MainFrame extends BaseModuleFrame {
	private static final long serialVersionUID = -7850040792130935086L;
	
	private QueryPanel pnlQuery;
	private BaseDataTable spnBDT;
	private OptBtnsPanel pnlOptBtns;
	
	public MainFrame() {
		//读取打印配置文件
		PrintInit.readInitFile();
		
		setTitle("打印管理");
		
		pnlQuery = new QueryPanel(this);
		pnlQuery.setBorder(BorderFactory.createTitledBorder("查询条件"));
		
		spnBDT = new BaseDataTable();
		spnBDT.setBorder(BorderFactory.createTitledBorder("数据列表"));
		
		pnlOptBtns = new OptBtnsPanel(this);
		pnlOptBtns.setBorder(BorderFactory.createTitledBorder("操作项"));
		
		setLayout(new BorderLayout());
		add(pnlQuery, BorderLayout.NORTH);
		add(spnBDT, BorderLayout.CENTER);
		add(pnlOptBtns, BorderLayout.EAST);
		
		setSize(1400, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		com.gopawpaw.frame.GlobalParameter.isAuthModuls = true;

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				MainFrame thisClass = new MainFrame();
				thisClass.showWithFrame();
			}
		});
	}
	
	public BaseDataTable getSpnBDT() {
		return spnBDT;
	}
	
	public QueryPanel getPnlQuery() {
		return pnlQuery;
	}
}
