package com.gopawpaw.kynb.module.datascan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.common.*;

public class DataScanFrame extends BaseModuleFrame {
	private static final long serialVersionUID = 3688309249432143888L;

	//private static DataScanFrame thisClass;
	private static ExcelDataTablePane excelDataTablePane;
	private static OptBtnsPanel optBtnsPanel;
	private ProgressBarPanel pnlProgressBar;
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
		setTitle("数据扫描<一>");

		// 创建线形边框
		LineBorder lineBorder = (LineBorder)BorderFactory.createLineBorder(Color.black);
		//创建Excel数据面板的边框
		TitledBorder edpBorder = BorderFactory.createTitledBorder(lineBorder, "Excel表格数据");
		
		excelDataTablePane = new ExcelDataTablePane();
		excelDataTablePane.setBorder(edpBorder);
		pnlProgressBar = new ProgressBarPanel();
		optBtnsPanel = new OptBtnsPanel(this);
		optBtnsPanel.setSize(new Dimension(100, 600));
		optBtnsPanel.setPreferredSize(new Dimension(100, 600));
		setLayout(new BorderLayout());
		add(excelDataTablePane, BorderLayout.CENTER);
		add(optBtnsPanel, BorderLayout.EAST);
		add(pnlProgressBar, BorderLayout.SOUTH);
		setSize(900, 600);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				DataScanFrame thisClass = new DataScanFrame();
				thisClass.showWithFrame();
			}
		});
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
		ImportExcelProgree iep = new ImportExcelProgree(pnlProgressBar, file);
		iep.start();
	}

	/**
	 * 执行导入Excel文件
	 * 
	 * @param file
	 */
	public void executScanning() {
		ScanningProgress sp = new ScanningProgress(pnlProgressBar);
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
		ExportExcelProgress eep = new ExportExcelProgress(pnlProgressBar, file);
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

		public ImportExcelProgree(ProgressBarPanel pnlProgressBar, File file) {
			super(pnlProgressBar);
			this.file = file;
		}

		@Override
		public void execut() {
			Object[][] excelData = PoiOperatXls.readXlsRTA(file, super.getListener());
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
		public ScanningProgress(ProgressBarPanel pnlProgressBar) {
			super(pnlProgressBar);
		}

		public void execut() {
			DataScanning ds = new DataScanning();
			// 获得表格原始数据，并扫描数据
			Object[][] sranResult = ds.scanning(scanMap,
					getExcelDataTablePane().getOriginalData(), super.getListener());
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

		public ExportExcelProgress(ProgressBarPanel pnlProgressBar, File file) {
			super(pnlProgressBar);
			this.file = file;
		}

		public void execut() {
			// 获取文件保存的表格数据
			Object[][] excelData = getExcelDataTablePane().getHaveTitleData();

			// 保存文件
			boolean rv = PoiOperatXls.writeXls(excelData, file.getPath(), super.getListener());

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
}
