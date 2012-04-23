package com.gopawpaw.kynb.module.datascan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.gopawpaw.frame.dev.common.GppJarRunableInterface;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.module.BaseModuleFrame;

public class DataScanFrame extends BaseModuleFrame implements
		GppJarRunableInterface {
	private static final long serialVersionUID = 3688309249432143888L;

	private static DataScanFrame thisClass;
	private static ExcelDataTablePane excelDataTablePane = null;
	private static OptBtnsPanel optBtnsPanel = null;
	// private static List<ScanItem> siList = new ArrayList<ScanItem>();
	private static Map<String, Integer> scanMap = null;

	// 文件选择控件
	private static final JFileChooser fileChooser = new JFileChooser();

	/**
	 * 静态代码段 1、为扫描项列表赋初始值 2、为文件选择对话框设置文件过滤器
	 */
	static {
		scanMap = new HashMap<String, Integer>();
		scanMap.put(ScanItem.V_IC, 0);

		// 设置文件过滤器
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

	public Map<String, Integer> getScanMap() {
		return scanMap;
	}

	/**
	 * 执行导入Excel文件
	 * 
	 * @param file
	 */
	public void executImportExcel(File file) {
		if (file == null)
			return;
		ImportExcelProgree iep = new ImportExcelProgree(file);
		iep.getProgressBar().setString("正在加载数据，请耐心等待。。。。");
		iep.getProgressBar().setIndeterminate(true);
		iep.start();
	}

	/**
	 * 执行导入Excel文件
	 * 
	 * @param file
	 */
	public void executlScanning() {
		ScanningProgress sp = new ScanningProgress();
		//sp.getProgressBar().setString("正在扫描数据，请耐心等待。。。。");
		sp.getProgressBar().setIndeterminate(false);
		sp.start();
	}

	/**
	 * 执行导出Excel文件
	 * 
	 * @param file
	 */
	public void executExportExcel(File file) {
		if (file == null)
			return;
		ExportExcelProgress eep = new ExportExcelProgress(file);
		eep.getProgressBar().setString("正在导出数据，请耐心等待。。。。");
		eep.getProgressBar().setIndeterminate(true);
		eep.start();
	}

	/**
	 * 导入Excel线程类，显示进度条
	 * 
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
		}
	}

	/**
	 * 扫描数据线程类，显示进度条
	 * 
	 * @author lxq
	 * 
	 */
	class ScanningProgress extends Progress {
		public ScanningProgress() {
			super(DataScanFrame.this);
		}

		public void execut() {
			ScanningListener sl = new ScanningListener() {
				@Override
				public void onScanningPre(int size) {
					getProgressBar().setMaximum(size);
				}

				@Override
				public void onScanningProgress(int n) {
					getProgressBar().setString("");
					getProgressBar().setValue(n);
					getProgressBar().setString("进度："+ n + "/"+getProgressBar().getMaximum());
				}
			};
			
			DataScanning ds = new DataScanning();
			// 获得表格原始数据，并扫描数据
			Object[][] sranResult = ds.scanning(scanMap,
					getExcelDataTablePane().getOriginalData(), sl);
			// 刷新表格
			getExcelDataTablePane().refreshTable(sranResult);
		}
	}

	/**
	 * 导出Excel线程类，显示进度条
	 * 
	 * @author lxq
	 * 
	 */
	class ExportExcelProgress extends Progress {
		private String message = "";
		private File file = null;

		public ExportExcelProgress(File file) {
			super(DataScanFrame.this);
			this.file = file;
		}

		public void execut() {
			// 获取文件保存的表格数据
			Object[][] excelData = getExcelDataTablePane().getHaveTitleData();

			// 保存文件
			boolean rv = PoiOperatXls.writeXls(excelData, file.getPath());

			Toolkit.getDefaultToolkit().beep();
			if (rv) {
				message = "成功保存文件：" + file.getPath();
				JOptionPane.showMessageDialog(null, message, "保存文件提示！",
						JOptionPane.PLAIN_MESSAGE);
			} else {
				message = "无法保存文件：" + file.getPath();
				JOptionPane.showMessageDialog(null, message, "保存文件提示！",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void setDialogLocaltion(JDialog dialog) {
		JFrame owner = thisClass;
		int left = (owner.getWidth() - dialog.getWidth()) / 2 + owner.getX();
		int top = (owner.getHeight() - dialog.getHeight()) / 2 + owner.getY();
		dialog.setLocation(left, top);
	}
}
