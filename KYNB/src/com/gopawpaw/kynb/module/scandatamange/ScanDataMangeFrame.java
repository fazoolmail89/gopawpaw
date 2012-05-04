package com.gopawpaw.kynb.module.scandatamange;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.gopawpaw.frame.dev.common.GppJarRunableInterface;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.common.*;
import com.gopawpaw.kynb.module.BaseModuleFrame;

public class ScanDataMangeFrame extends BaseModuleFrame implements
GppJarRunableInterface {

	private static final long serialVersionUID = -1184641427476379004L;

	private static ScanDataMangeFrame mainFrame = null;
	
	private static QueryPanel pnlQuery = null;
	private TableScrollPane spnTable = null;
	private static OptBtnsPanel optBtnsPanel = null;
	
	// 文件选择控件
	private static final JFileChooser fileChooser = new JFileChooser();

	/**
	 * 静态代码段 1、为扫描项列表赋初始值 2、为文件选择对话框设置文件过滤器
	 */
	static {
		// 设置文件过滤器
		fileChooser.setFileFilter(new ExcelFileFilter());
	}
	
	public ScanDataMangeFrame() {
		pnlQuery = new QueryPanel(this);
		spnTable = new TableScrollPane();
		optBtnsPanel = new OptBtnsPanel(this);
		
/*		pnlQuery.setSize(new Dimension(900, 50));
		pnlQuery.setPreferredSize(new Dimension(900, 50));*/
		optBtnsPanel.setSize(new Dimension(70, 600));
		optBtnsPanel.setPreferredSize(new Dimension(70, 600));
		
		setLayout(new BorderLayout());
		add(pnlQuery, BorderLayout.NORTH);
		add(spnTable, BorderLayout.CENTER);
		add(optBtnsPanel, BorderLayout.EAST);
		setSize(900, 600);
		
		//--------------------------------------------
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				// IdnoUpgrade thisClass = new IdnoUpgrade();
				mainFrame = new ScanDataMangeFrame();
				// thisClass.setVisible(true);
				mainFrame.setVisible(true);
			}
		});
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
		iep.getProgressBar().setString("正在导入数据，请耐心等待。。。。");
		iep.getProgressBar().setIndeterminate(true);
		iep.start();
	}
	
	@Override
	public boolean runJar(String[] args) {
		ScanDataMangeFrame.main(args);
		return false;
	}
	
	public static void setDialogLocaltion(JDialog dialog) {
		JFrame owner = mainFrame;
		int left = (owner.getWidth() - dialog.getWidth()) / 2 + owner.getX();
		int top = (owner.getHeight() - dialog.getHeight()) / 2 + owner.getY();
		dialog.setLocation(left, top);
	}	
	
	public JFileChooser getFilechooser() {
		return fileChooser;
	}
	
	public TableScrollPane getSpnTable() {
		return spnTable;
	}
	
	public QueryPanel getPnlQuery() {
		return pnlQuery;
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
			super(ScanDataMangeFrame.this);
			this.file = file;
		}

		@Override
		public void execut() {
			Object[][] excelData = PoiOperatXls.readXlsRTA(file);
			Object[][] tableData = new Object[excelData.length - 1][];
			List<OtherData> list = new ArrayList<OtherData>();
			OtherData odata = null;
			for(int i = 1; i < excelData.length ; i++) {
				tableData[i - 1] = excelData[i];
				odata = new OtherData();
				odata.setAcol("");
				odata.setBcol("");
				odata.setCcol("");
				odata.setDcol("");
				odata.setEcol("");
				odata.setFcol("");
				odata.setGcol("");
				odata.setHcol("");
				odata.setIcol("");
				odata.setJcol("");
				
				for(int j = 0; j < excelData[i].length; j++) {
					switch (j) {
					case 0:
						odata.setAcol((String)excelData[i][j]);
						break;
					case 1:
						odata.setBcol((String)excelData[i][j]);
						break;
					case 2:
						odata.setCcol((String)excelData[i][j]);
						break;
					case 3:
						odata.setDcol((String)excelData[i][j]);
						break;
					case 4:
						odata.setEcol((String)excelData[i][j]);
						break;
					case 5:
						odata.setFcol((String)excelData[i][j]);
						break;
					case 6:
						odata.setGcol((String)excelData[i][j]);
						break;
					case 7:
						odata.setHcol((String)excelData[i][j]);
						break;
					case 8:
						odata.setIcol((String)excelData[i][j]);
						break;
					case 9:
						odata.setJcol((String)excelData[i][j]);
						break;
					default:
						break;
					}
				}
				list.add(odata);
			}
			
			DataOpertor dot = new DataOpertor();
			if(dot.batSave(list)) {
				dot = new DataOpertor();
				spnTable.refreshTable(dot.findListAll());
				JOptionPane.showMessageDialog(null, "导入数据成功！", "导入Excel提示！",
						JOptionPane.PLAIN_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "导入数据失败！", "导入Excel提示！",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
