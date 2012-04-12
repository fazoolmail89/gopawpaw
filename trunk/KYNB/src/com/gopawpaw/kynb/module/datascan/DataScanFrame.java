package com.gopawpaw.kynb.module.datascan;

import java.awt.BorderLayout;

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
	
	//文件选择控件
	private final JFileChooser fileChooser = new JFileChooser();
	
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
}
