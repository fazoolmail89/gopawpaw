package com.gopawpaw.kynb.module.datascan;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import com.gopawpaw.dev.common.GppJarRunableInterface;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.module.BaseModuleFrame;

public class DataScanFrame extends BaseModuleFrame implements
GppJarRunableInterface {
	private static final long serialVersionUID = 3688309249432143888L;
	
	private static DataScanFrame thisClass;
	private static ExcelDataTablePane excelDataTablePane = null;
	private static OptBtnsPanel optBtnsPanel = null;
	private static List<ScanItem> siList = new ArrayList<ScanItem>();

	//文件选择控件
	private static JFileChooser fileChooser = new JFileChooser();
	
	/**
	 * 静态代码段
	 * 1、为扫描项列表赋初始值
	 * 2、为文件选择对话框设置文件过滤器
	 */
	static {
		ScanItem si = new ScanItem();
		si.setDbtColumnName("v_ic");
		si.setExlColumnName("身份证号");
		siList.add(si);
		
		//设置文件过滤器
		fileChooser.setFileFilter(new ExcelFileFilter());
	}
	
	public DataScanFrame() {
		excelDataTablePane = new ExcelDataTablePane();
		optBtnsPanel = new OptBtnsPanel();
		setLayout(new BorderLayout());
		add(excelDataTablePane, BorderLayout.CENTER);
		add(optBtnsPanel, BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				// IdnoUpgrade thisClass = new IdnoUpgrade();
				thisClass = new DataScanFrame();
				// thisClass.setVisible(true);
				thisClass.setVisible(true);
				optBtnsPanel.setMainFrame(thisClass);
			}
		});
	}

	@Override
	public boolean runJar(String[] args) {
		DataScanFrame.main(args);
		return false;
	}

	public static DataScanFrame getThisClass() {
		return thisClass;
	}

	public static void setThisClass(DataScanFrame thisClass) {
		DataScanFrame.thisClass = thisClass;
	}

	public ExcelDataTablePane getExcelDataTablePane() {
		return excelDataTablePane;
	}

	public void setExcelDataTablePane(ExcelDataTablePane excelDataTablePane) {
		this.excelDataTablePane = excelDataTablePane;
	}

	public OptBtnsPanel getOptBtnsPanel() {
		return optBtnsPanel;
	}

	public void setOptBtnsPanel(OptBtnsPanel optBtnsPanel) {
		this.optBtnsPanel = optBtnsPanel;
	}

	public JFileChooser getFilechooser() {
		return fileChooser;
	}

	public static List<ScanItem> getSiList() {
		return siList;
	}
}
