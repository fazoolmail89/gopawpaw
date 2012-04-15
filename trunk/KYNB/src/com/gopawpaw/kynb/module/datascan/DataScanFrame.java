package com.gopawpaw.kynb.module.datascan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		si.setDbtColumnName(ScanItem.SI_V_IC);
		si.setExlColumnName("身份证号");
		siList.add(si);
		
		//设置文件过滤器
		fileChooser.setFileFilter(new ExcelFileFilter());
	}
	
	public DataScanFrame() {
		excelDataTablePane = new ExcelDataTablePane();
		optBtnsPanel = new OptBtnsPanel();
		optBtnsPanel.setSize(new Dimension(100, 600));
		optBtnsPanel.setPreferredSize(new Dimension(100, 600));
		setLayout(new BorderLayout());
		add(excelDataTablePane, BorderLayout.CENTER);
		add(optBtnsPanel, BorderLayout.EAST);
		setSize(900, 600);
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
		DataScanFrame.excelDataTablePane = excelDataTablePane;
	}

	public OptBtnsPanel getOptBtnsPanel() {
		return optBtnsPanel;
	}

	public void setOptBtnsPanel(OptBtnsPanel optBtnsPanel) {
		DataScanFrame.optBtnsPanel = optBtnsPanel;
	}

	public JFileChooser getFilechooser() {
		return fileChooser;
	}

	public static List<ScanItem> getSiList() {
		return siList;
	}
	
	/**
	 * 执行导入Excel文件
	 * @param file
	 */
	public void executImportExcel(File file) {
		if(file == null) return;
		ImportExcelProgree iep = new ImportExcelProgree(file);
		iep.getProgressBar().setString("正在加载数据，请耐心等待。。。。");
		iep.getProgressBar().setIndeterminate(true);
		iep.start();
	}

	/**
	 * 执行导入Excel文件
	 * @param file
	 */
	public void executlScanning() {
		ScanningProgress sp = new ScanningProgress();
		sp.getProgressBar().setString("正在扫描数据，请耐心等待。。。。");
		sp.getProgressBar().setIndeterminate(true);
		sp.start();
	}
	
	/**
	 * 执行导入Excel文件
	 * @param file
	 */
	public void executExportExcel(File file) {
		if(file == null) return;
		ExportExcelProgress eep = new ExportExcelProgress(file);
		eep.getProgressBar().setString("正在导出数据，请耐心等待。。。。");
		eep.getProgressBar().setIndeterminate(true);
		eep.start();
	}
	
	/**
	 * 导入Excel线程类，显示进度条
	 * @author lxq
	 *
	 */
	class ImportExcelProgree extends Progress {
		private File file = null;
		public ImportExcelProgree(File file) {
			super(DataScanFrame.this);
			this.file = file;
		}
		
		@Override
		public void execut() {
			Object[][] excelData = PoiOperatXls.readXlsRTA(file);
			getExcelDataTablePane().refreshTableByOriginalData(excelData);
			
			//将导入表格的第一列做为默认扫描项
			getSiList().clear();
			ScanItem si = new ScanItem();
			si.setDbtColumnName(ScanItem.SI_V_IC);
			si.setExlColumnName(excelData[0][0].toString());
			getSiList().add(si);	
		}
	}

	/**
	 * 扫描数据线程类，显示进度条
	 * @author lxq
	 *
	 */
	class ScanningProgress extends Progress {
		public ScanningProgress() {
			super(DataScanFrame.this);
			// TODO Auto-generated constructor stub
		}
		public void execut() {
			DataScanning ds = new DataScanning();
			
			//获得表格原始数据，并扫描数据
			Object[][] sranResult = ds.scaning(getSiList(), getExcelDataTablePane().getOriginalData());
			//刷新表格
			getExcelDataTablePane().refreshTable(sranResult);
		}
	}

	/**
	 * 导出Excel线程类，显示进度条
	 * @author lxq
	 *
	 */
	class ExportExcelProgress extends Progress {
		private JLabel message = new JLabel();
		private File file = null;
		public ExportExcelProgress(File file) {
			super(DataScanFrame.this);
			this.file = file;
		}
		
		public void execut() {
			//获取文件保存的表格数据
			Object[][] excelData = getExcelDataTablePane().getHaveTitleData();
			
			if(excelData == null || excelData.length == 0) {
				message.setText("不能导出空数据表格！");
			} else {
				//保存文件
				boolean rv = PoiOperatXls.writeXls(excelData, file.getPath());
				if(rv) {
					message.setText("成功保存文件：" + file.getPath());
				} else {
					message.setText("无法保存文件：" + file.getPath());
				}				
			}
			
			JDialog md = new JDialog(DataScanFrame.this);
			md.setTitle("文件保存结果");
			message.setFont(new Font("宋体 ",java.awt.Font.BOLD,14));
			md.add(message);
			DataScanFrame.setDialogLocaltion(md);
			md.setSize(500, 100);
			md.setVisible(true);
			md.setModal(true);
		}
	}
	
	public static void setDialogLocaltion(JDialog dialog) {
		JFrame owner = thisClass;
		int	left = (owner.getWidth() - dialog.getWidth()) / 2 + owner.getX();
		int	top = (owner.getHeight() - dialog.getHeight()) / 2 + owner.getY();
		dialog.setLocation(left, top);
	}
}
