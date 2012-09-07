package com.gopawpaw.kynb.module.datascan2;

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
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.common.ExcelFileFilter;
import com.gopawpaw.kynb.common.PoiOperatXls;
import com.gopawpaw.kynb.common.Progress;
import com.gopawpaw.kynb.common.ProgressBarPanel;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.utils.StringConstant;

public class DataScanFrame2 extends BaseModuleFrame {
	private static final long serialVersionUID = 3688309249432143888L;
	
	private JPanel pnlContent;
	private DBDataPane dbDataPane;
	private ExcelDataTablePane2 excelDataTablePane;
	private OptBtnsPanel2 optBtnsPanel;
	private ProgressBarPanel pnlProgressBar;

	private static Map<String, Integer> scanMap = null;

	// 文件选择控件
	private static final JFileChooser fileChooser = new JFileChooser();

	/**
	 * 静态代码段 1、为扫描项列表赋初始值 2、为文件选择对话框设置文件过滤器
	 */
	static {
		//设置初始默认扫描项
		scanMap = new HashMap<String, Integer>();
		scanMap.put(OtherData.ACOL, 0);
		
		// 设置文件过滤器
		fileChooser.setFileFilter(new ExcelFileFilter());
	}

	public DataScanFrame2() {
		
		if(!GlobalParameter.isAuthModuls){
			//非法授权
			JOptionPane.showConfirmDialog(null, StringConstant.isNotAuthMsg,
					"系统提示", JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		setTitle("数据扫描核对（自定数据库）");
		
		// 创建线形边框
		LineBorder lineBorder = (LineBorder)BorderFactory.createLineBorder(Color.black);
		//创建数据库数据面板的边框
		TitledBorder ddpBorder = BorderFactory.createTitledBorder(lineBorder, "数据库数据示例");
		//创建Excel数据面板的边框
		TitledBorder edpBorder = BorderFactory.createTitledBorder(lineBorder, "Excel表格数据");
		
		pnlContent = new JPanel();
		dbDataPane = new DBDataPane();
		dbDataPane.setBorder(ddpBorder);
		
		excelDataTablePane = new ExcelDataTablePane2();
		excelDataTablePane.setBorder(edpBorder);
		pnlContent.setLayout(new BorderLayout());
		pnlContent.add(excelDataTablePane, BorderLayout.NORTH);
		pnlContent.add(dbDataPane, BorderLayout.CENTER);
		
		//创建进度条面板
		pnlProgressBar = new ProgressBarPanel();
		
		optBtnsPanel = new OptBtnsPanel2(this);
		optBtnsPanel.setSize(new Dimension(100, 600));
		optBtnsPanel.setPreferredSize(new Dimension(100, 600));
		
		setLayout(new BorderLayout());
		add(pnlContent, BorderLayout.CENTER);
		add(optBtnsPanel, BorderLayout.EAST);
		add(pnlProgressBar, BorderLayout.SOUTH);
		setSize(900, 700);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				DataScanFrame2 thisClass = new DataScanFrame2();
				thisClass.showWithFrame();
			}
		});
	}
	
	public ProgressBarPanel getPnlProgressBar() {
		return pnlProgressBar;
	}
	
	public ExcelDataTablePane2 getExcelDataTablePane() {
		return excelDataTablePane;
	}

	public void setExcelDataTablePane(ExcelDataTablePane2 excelDataTablePane) {
		this.excelDataTablePane = excelDataTablePane;
	}

	public OptBtnsPanel2 getOptBtnsPanel() {
		return optBtnsPanel;
	}

	public void setOptBtnsPanel(OptBtnsPanel2 optBtnsPanel) {
		this.optBtnsPanel = optBtnsPanel;
	}

	public JFileChooser getFilechooser() {
		return fileChooser;
	}

	public Map<String, Integer> getScanMap() {
		return scanMap;
	}
	
	public DBDataPane getDbDataPane() {
		return dbDataPane;
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
	 * 执行扫描
	 * 
	 * @param file
	 */
	public void executlScanning() {
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
		//如果文件名已被占用，提示用户是否覆盖文件
		if(file.exists()) {
			int rv = JOptionPane.showConfirmDialog(DataScanFrame2.this,
					file.getName() + "文件已存在是否进行覆盖？",
					"操作提示！",
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.OK_CANCEL_OPTION);	
			if(rv != 0) return;
		}
		
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

		public ImportExcelProgree(ProgressBarPanel pbp, File file) {
			super(pbp);
			this.file = file;
		}

		@Override
		public void execut() {
			Object[][] excelData = PoiOperatXls.readXlsRTA(file,
					super.getListener());
			getExcelDataTablePane().refreshTableByOriginalData(excelData);
		}
	}

	/**
	 * 扫描数据线程类，显示进度条
	 * 
	 * @author lxq
	 * 
	 */
	class ScanningProgress extends com.gopawpaw.kynb.common.Progress {
		public ScanningProgress(ProgressBarPanel pbp) {
			super(pbp);
		}

		public void execut() {			
			DataScanning2 ds = new DataScanning2();
			// 获得表格原始数据，并扫描数据
			Object[][] sranResult = ds.scanning(scanMap,
					getExcelDataTablePane().getOriginalData(), 
					super.getListener());
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

		public ExportExcelProgress(ProgressBarPanel pbp, File file) {
			super(pbp);
			this.file = file;
		}

		public void execut() {
			// 获取文件保存的表格数据
			Object[][] excelData = getExcelDataTablePane().getHaveTitleData();

			// 保存文件
			boolean rv = PoiOperatXls.writeXls(
					excelData, 
					file.getPath(),
					super.getListener());

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
