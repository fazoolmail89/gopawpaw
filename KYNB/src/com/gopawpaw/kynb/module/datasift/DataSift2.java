/**
 * 
 */
package com.gopawpaw.kynb.module.datasift;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.dev.common.GppJarRunableInterface;
import com.gopawpaw.frame.log.GLog;
import com.gopawpaw.javax.swing.GppJComboBox;
import com.gopawpaw.javax.swing.GppJTable;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.GppStyleTable;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.module.datasift.PoiOperatXls2.ReadXlsListener;
import com.gopawpaw.kynb.module.datasift.PoiOperatXls2.WriteXlsListener;
import com.gopawpaw.kynb.utils.DateUtils;

/**
 * @version 2012-3-27
 * @author Jason
 */
public class DataSift2 extends BaseModuleFrame implements
		GppJarRunableInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JScrollPane jScrollPane1 = null;
	private JScrollPane jScrollPane2 = null;
	private JScrollPane jScrollPane3 = null;
	private JScrollPane jScrollPane4 = null;
	private JScrollPane jScrollPane5 = null;
	private JScrollPane jScrollPane6 = null;

	private JProgressBar progressBar1 = new JProgressBar();
	private JProgressBar progressBar2 = new JProgressBar();

	private JProgressBar progressBar3 = new JProgressBar();
	private JProgressBar progressBar4 = new JProgressBar();
	private JProgressBar progressBar5 = new JProgressBar();
	private JProgressBar progressBar6 = new JProgressBar();
	
	private JProgressBar progressBar7 = new JProgressBar();

	private GppJComboBox jComboBox1 = null;
	private GppJComboBox jComboBox2 = null;

	private JComboBoxItem mJComboBoxItem1;
	private JComboBoxItem mJComboBoxItem2;

	/**
	 * 第一个表的标题
	 */
	private Object[] mTableTitle1;
	/**
	 * 第一个表的数据
	 */
	private Object[][] mTableData1;

	/**
	 * 第二个表的标题
	 */
	private Object[] mTableTitle2;
	/**
	 * 第二个表的数据
	 */
	private Object[][] mTableData2;

	/**
	 * 导出表的数据
	 */
	private Object[][] exportTable1 = null;
	private Object[][] exportTable2 = null;
	private Object[][] exportTable3 = null;
	private Object[][] exportTable4 = null;
	
	private JLabel jLableExportCount1 = new JLabel();
	private JLabel jLableExportCount2 = new JLabel();
	private JLabel jLableExportCount3 = new JLabel();
	private JLabel jLableExportCount4 = new JLabel();

	private JButton jButtonActionSift;
	
	public DataSift2() {
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(900, 600);
		this.setLocation(200, 100);
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		JPanel jContentPane = new JPanel();
		jContentPane.setLayout(new BorderLayout());

		jContentPane.add(getJPanelCenter(), BorderLayout.CENTER);
		jContentPane.add(progressBar7, BorderLayout.NORTH);
		
		return jContentPane;
	}

	/**
	 * 中间面板
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JSplitPane
	 */
	private JSplitPane getJPanelCenter() {

		jScrollPane1 = new JScrollPane();
		jScrollPane2 = new JScrollPane();
		jScrollPane3 = new JScrollPane();
		jScrollPane4 = new JScrollPane();
		jScrollPane5 = new JScrollPane();
		jScrollPane6 = new JScrollPane();

		jComboBox1 = new GppJComboBox();
		jComboBox2 = new GppJComboBox();

		jComboBox1.setEditable(false);
		jComboBox2.setEditable(false);

		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				mJComboBoxItem1 = (JComboBoxItem) jComboBox1.getSelectedItem();

			}
		});

		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				mJComboBoxItem2 = (JComboBoxItem) jComboBox2.getSelectedItem();
			}
		});

		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new BorderLayout());
		JPanel jPanel11 = new JPanel();
		jPanel11.setLayout(new BoxLayout(jPanel11, BoxLayout.X_AXIS));
		jPanel11.add(getJButtonSelect1());
		jPanel11.add(progressBar1);
		jPanel11.add(jComboBox1);
		jPanel1.add(jScrollPane1, BorderLayout.CENTER);
		jPanel1.add(jPanel11, BorderLayout.NORTH);

		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new BorderLayout());
		JPanel jPanel21 = new JPanel();
		jPanel21.setLayout(new BoxLayout(jPanel21, BoxLayout.X_AXIS));
		jPanel21.add(getJButtonSelect2());
		jPanel21.add(progressBar2);
		jPanel21.add(jComboBox2);
		jPanel21.add(getJButtonActionSift());

		jPanel2.add(jScrollPane2, BorderLayout.CENTER);
		jPanel2.add(jPanel21, BorderLayout.NORTH);

		JPanel jPanel3 = new JPanel();
		jPanel3.setLayout(new BorderLayout());
		JPanel jPanel31 = new JPanel();
		jPanel31.setLayout(new BoxLayout(jPanel31, BoxLayout.X_AXIS));
		jPanel31.add(getJButtonExport1());
		jPanel31.add(progressBar3);
		jPanel3.add(jScrollPane3, BorderLayout.CENTER);
		jPanel3.add(jPanel31, BorderLayout.SOUTH);
		jPanel3.add(jLableExportCount1, BorderLayout.NORTH);
		
		JPanel jPanel4 = new JPanel();
		jPanel4.setLayout(new BorderLayout());
		JPanel jPanel41 = new JPanel();
		jPanel41.setLayout(new BoxLayout(jPanel41, BoxLayout.X_AXIS));
		jPanel41.add(getJButtonExport2());
		jPanel41.add(progressBar4);
		jPanel4.add(jScrollPane4, BorderLayout.CENTER);
		jPanel4.add(jPanel41, BorderLayout.SOUTH);
		jPanel4.add(jLableExportCount2, BorderLayout.NORTH);

		JPanel jPanel5 = new JPanel();
		jPanel5.setLayout(new BorderLayout());
		JPanel jPanel51 = new JPanel();
		jPanel51.setLayout(new BoxLayout(jPanel51, BoxLayout.X_AXIS));
		jPanel51.add(getJButtonExport3());
		jPanel51.add(progressBar5);
		jPanel5.add(jScrollPane5, BorderLayout.CENTER);
		jPanel5.add(jPanel51, BorderLayout.SOUTH);
		jPanel5.add(jLableExportCount3, BorderLayout.NORTH);

		JPanel jPanel6 = new JPanel();
		jPanel6.setLayout(new BorderLayout());
		JPanel jPanel61 = new JPanel();
		jPanel61.setLayout(new BoxLayout(jPanel61, BoxLayout.X_AXIS));
		jPanel61.add(getJButtonExport4());
		jPanel61.add(progressBar6);
		jPanel6.add(jScrollPane6, BorderLayout.CENTER);
		jPanel6.add(jPanel61, BorderLayout.SOUTH);
		jPanel6.add(jLableExportCount4, BorderLayout.NORTH);

		// 左边三个面板============start

		JSplitPane jSplitPane11 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				jPanel3, jPanel4);
		jSplitPane11.setDividerLocation(225);
		jSplitPane11.setOneTouchExpandable(true);
		jSplitPane11.setDividerSize(6);

		JSplitPane jSplitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
				jPanel1, jSplitPane11);
		jSplitPane1.setDividerLocation(300);
		jSplitPane1.setOneTouchExpandable(true);
		jSplitPane1.setDividerSize(10);
		// 左边三个面板============end

		// 右边三个面板============start
		JSplitPane jSplitPane21 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				jPanel5, jPanel6);
		jSplitPane21.setDividerLocation(225);
		jSplitPane21.setOneTouchExpandable(true);
		jSplitPane21.setDividerSize(6);

		JSplitPane jSplitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
				jPanel2, jSplitPane21);
		jSplitPane2.setDividerLocation(300);
		jSplitPane2.setOneTouchExpandable(true);
		jSplitPane2.setDividerSize(10);
		// 右边三个面板============end

		JSplitPane jSplitPaneCenter = new JSplitPane(
				JSplitPane.HORIZONTAL_SPLIT, jSplitPane1, jSplitPane2);
		jSplitPaneCenter.setDividerLocation(450);

		return jSplitPaneCenter;
	}

	private JButton getJButtonSelect1() {

		final JButton jButton = new JButton();
		jButton.setText("选择第一个Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				JFileChooser jFileChooser = new JFileChooser();

				jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				jFileChooser.showOpenDialog(null);

				if (jFileChooser.getSelectedFile() != null) {
					String ph = jFileChooser.getSelectedFile()
							.getAbsolutePath();
					System.out.println(ph);
					importExcel1(ph, jButton);
				}

			}
		});
		return jButton;
	}

	private JButton getJButtonSelect2() {

		final JButton jButton = new JButton();
		jButton.setText("选择第二个Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				JFileChooser jFileChooser = new JFileChooser();

				jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				jFileChooser.showOpenDialog(null);

				if (jFileChooser.getSelectedFile() != null) {
					String ph = jFileChooser.getSelectedFile()
							.getAbsolutePath();
					System.out.println(ph);
					importExcel2(ph, jButton);
				}

			}
		});

		return jButton;
	}

	private JButton getJButtonActionSift() {

		final JButton jButton = new JButton();
		jButton.setText("  执行筛选   ");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {

				actionSift();
			}
		});
		jButtonActionSift = jButton;
		
		return jButton;
	}

	private JButton getJButtonExport1() {

		final JButton jButton = new JButton();
		jButton.setText("A不同导出Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle1, exportTable2, progressBar3,
						"导出表A不同",jButton);
			}
		});

		return jButton;
	}

	private JButton getJButtonExport2() {

		final JButton jButton = new JButton();
		jButton.setText("A相同导出Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle1, exportTable1, progressBar4,
						"导出表A相同",jButton);
			}
		});

		return jButton;
	}

	private JButton getJButtonExport3() {

		final JButton jButton = new JButton();
		jButton.setText("B相同导出Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle2, exportTable3, progressBar5,
						"导出表B相同",jButton);
			}
		});

		return jButton;
	}

	private JButton getJButtonExport4() {

		final JButton jButton = new JButton();
		jButton.setText("B不同导出Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle2, exportTable4, progressBar6,
						"导出表B不同",jButton);
			}
		});

		return jButton;
	}

	/**
	 * 执行筛选
	 * 
	 * @version 2012-3-29
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void actionSift() {

		if (mJComboBoxItem1 == null || mJComboBoxItem2 == null) {
			return;
		}

		ProgressActionSiftListener lis = new ProgressActionSiftListener() {
			
			@Override
			public void onProgressActionSiftFinish(Object[][] table11,
					Object[][] table12, Object[][] table21, Object[][] table22) {
				// TODO Auto-generated method stub
				
				exportTable1 = table11;
				exportTable2 = table12;
				exportTable3 = table21;
				exportTable4 = table22;
				
				{// A
					jLableExportCount1.setText("A不同数量："+exportTable2.length);
					DefaultTableModel model = new DefaultTableModel(exportTable2,
							mTableTitle1);
					GppStyleTable jTable = new GppStyleTable(model);
					jTable.setRowHeight(22);

					jScrollPane3.setViewportView(jTable);
					jTable.updateUI();
				}

				{// AB
					jLableExportCount2.setText("A相同数量："+exportTable1.length);
					DefaultTableModel model = new DefaultTableModel(exportTable1,
							mTableTitle1);
					GppStyleTable jTable = new GppStyleTable(model);
					jTable.setRowHeight(22);

					jScrollPane4.setViewportView(jTable);
					jTable.updateUI();
				}

				{// BA
					jLableExportCount3.setText("B相同数量："+exportTable3.length);
					DefaultTableModel model = new DefaultTableModel(exportTable3,
							mTableTitle2);
					GppStyleTable jTable = new GppStyleTable(model);
					jTable.setRowHeight(22);

					jScrollPane5.setViewportView(jTable);
					jTable.updateUI();
				}

				{// B
					jLableExportCount4.setText("B不同数量："+exportTable4.length);
					DefaultTableModel model = new DefaultTableModel(exportTable4,
							mTableTitle2);
					GppStyleTable jTable = new GppStyleTable(model);
					jTable.setRowHeight(22);

					jScrollPane6.setViewportView(jTable);
					jTable.updateUI();
				}
			}
		};
		
		if(jButtonActionSift.isEnabled()){
			
			ProgressActionSift p = new ProgressActionSift(mTableData1, mTableData2,
					mJComboBoxItem1.index, mJComboBoxItem2.index,progressBar7,lis);
			p.setButton(jButtonActionSift);
			p.start();
		}
		


		
	}


	private void actionSaveToExce(Object[] exportTitle, Object[][] exportTable,
			final JProgressBar progressBar, String filename,JButton button) {

		ExportListener exportListener = new ExportListener(){

			@Override
			public void onExprotFinish(String path, int count) {
				// TODO Auto-generated method stub
				String tempMSG = "成功导出到："+path;
				 Toolkit.getDefaultToolkit().beep();
				 JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
				 JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
			}
			
		};
		Date date = new Date();
		
		 String excelFile = "OutPut\\" + filename + "-"
		 + DateUtils.DATA_FORMAT.format(date) + ".xls";
		 
		ProgressExportExcel p = new ProgressExportExcel(progressBar, button, excelFile);
		p.setExportListener(exportListener);
		p.setTitle(exportTitle);
		p.setData(exportTable);
		p.start();
		
		 
//		 String excelTempPath = "DBCenter\\emptyTemp.xls";
		//
		// progressBar.setStringPainted(true); // 显示提示信息
		// progressBar.setIndeterminate(false); // 确定进度的进度条
		// progressBar.setString("进度：" + 0 + "/" + 0);
		// progressBar.setValue(0); // 进度值
		//
		// ExcelWriter ew = new ExcelWriter(excelTempPath,excelFile);
		// ew.setmTableTitle(exportTitle);
		// ew.setmTableData(exportTable);
		// ew.setExportExcelListener(new ExportExcelListener() {
		//
		// private boolean flag = false;
		// @Override
		// public void onExportProgress(int total, int current, boolean isOk) {
		// // TODO Auto-generated method stub
		// if(!flag){
		// progressBar.setMaximum(total);
		// flag = true;
		// }else{
		// progressBar.setString("进度：" + current + "/" + total);
		// progressBar.setValue(current); // 进度值
		// }
		// }
		// });
		//
		// if(ew.actionSave()){
		// String tempMSG = "成功导出到："+excelFile;
		// Toolkit.getDefaultToolkit().beep();
		// JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
		// JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
		// }

	}

	/**
	 * 导入excle数据
	 * 
	 * @version 2012-3-28
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void importExcel1(String excelPath, JButton jButton) {

		progressBar1.setStringPainted(true); // 显示提示信息
		progressBar1.setIndeterminate(false); // 确定进度的进度条

		jComboBox1.removeAllItems();
		ProgressImportExcel p = new ProgressImportExcel(progressBar1, jButton, excelPath, jComboBox1);
		p.setImportListener(new ImportListener() {

			@Override
			public void onImprotFinish(Object[] title, Object[][] data,
					GppJTable table) {
				// TODO Auto-generated method stub
				mTableTitle1 = title;
				mTableData1 = data;
				jScrollPane1.setViewportView(table);
				table.updateUI();
			}
		});

		p.start();
	}

	/**
	 * 导入excle数据
	 * 
	 * @version 2012-3-28
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void importExcel2(String excelPath, JButton jButton) {

		progressBar2.setStringPainted(true); // 显示提示信息
		progressBar2.setIndeterminate(false); // 确定进度的进度条

		jComboBox2.removeAllItems();
		ProgressImportExcel p = new ProgressImportExcel(progressBar2, jButton, excelPath, jComboBox2);
		p.setImportListener(new ImportListener() {

			@Override
			public void onImprotFinish(Object[] title, Object[][] data,
					GppJTable table) {
				// TODO Auto-generated method stub
				mTableTitle2 = title;
				mTableData2 = data;
				jScrollPane2.setViewportView(table);
				table.updateUI();

			}
		});

		p.start();
	}

	interface ExportListener {
		void onExprotFinish(String path,int count);
	}
	
	interface ImportListener {
		void onImprotFinish(Object[] title, Object[][] data, GppJTable table);
	}

	interface ProgressActionSiftListener {
		void onProgressActionSiftFinish(Object[][] table11,Object[][] table12,Object[][] table21,Object[][] table22);
	}

	class ProgressActionSift extends Thread {// 自定义类progress,执行筛选用

		private Object[][] table1;
		private Object[][] table2;
		private int index1;
		private int index2;
		private JProgressBar progressBar;
		private ProgressActionSiftListener progressActionSiftListener;
		private JButton jButton;
		
		public ProgressActionSift(Object[][] table1, Object[][] table2,
				int index1, int index2) {
			this.table1 = table1;
			this.table2 = table2;
			this.index1 = index1;
			this.index2 = index2;
		}

		public ProgressActionSift(Object[][] table1, Object[][] table2,
				int index1, int index2, JProgressBar progressBar) {
			this.table1 = table1;
			this.table2 = table2;
			this.index1 = index1;
			this.index2 = index2;
			this.progressBar = progressBar;

		}

		public ProgressActionSift(Object[][] table1, Object[][] table2,
				int index1, int index2, JProgressBar progressBar,
				ProgressActionSiftListener progressActionSiftListener) {
			this.table1 = table1;
			this.table2 = table2;
			this.index1 = index1;
			this.index2 = index2;
			this.progressBar = progressBar;
			this.progressActionSiftListener = progressActionSiftListener;

		}

		@Override
		public void run() {
			if(jButton != null){
				jButton.setEnabled(false);
			}
			actionSift(table1,table2,index1,index2);
			if(jButton != null){
				jButton.setEnabled(true);
			}

		}
		
		/**
		 * 数据筛选
		 * @param table1	第一个表的数据
		 * @param table2	第二个表的数据
		 * @param index1	第一个表中，用来对比的列索引
		 * @param index2	第二个表中，用来对比的列索引
		 * @return	筛选结果的4个表数据（Object[][]）数组<br>
		 * 				0:在table1中相同部分的数据；<br>
		 * 				1:在table1中不同部分的数据；<br>
		 * 				2:在table2中相同部分的数据；<br>
		 * 				3:在table2中不同部分的数据；<br>
		 */
		private void actionSift(Object[][] table1, Object[][] table2,
				int index1, int index2){
			
			if(table1 == null || table2 == null){
				return;
			}
			
			ArrayList<Object[]> table11 = new ArrayList<Object[]>(); 
			ArrayList<Object[]> table12 = new ArrayList<Object[]>(); 
			ArrayList<Object[]> table21 = new ArrayList<Object[]>(); 
			ArrayList<Object[]> table22 = new ArrayList<Object[]>(); 
			
			for(int i=0;i<table2.length;i++){
				//复制第二个表
				table22.add(table2[i]);
				
			}
			
			
			int sizet1 = table1.length;
			progressBar.setMaximum(100);
			progressBar.setStringPainted(true); // 显示提示信息
			progressBar.setIndeterminate(false); // 确定进度的进度条
			
			for(int i1 = 0;i1<sizet1; i1++){
				
				int progr = (int)(((float)i1 / sizet1) * 100);
				progressBar.setString("筛选进度：" + progr + " % ");
				progressBar.setValue(progr); // 进度值
				
				Object[] v1 = table1[i1];
				
				if(v1 == null){
					continue;
				}
				
				String vTemp1 = (String) v1[index1];
				
				vTemp1 = (vTemp1 == null ? "" : vTemp1);
				
				boolean flag = false;
				
				int sizet2 = table2.length;
				
				for(int i2 = 0;i2<sizet2; i2++){
					Object[] v2 = table2[i2];
					
					if(v2 == null){
						continue;
					}
					
					String vTemp2 = (String) v2[index2];
					
					if(vTemp1.equals(vTemp2)){
						//AB两个表有相匹配的数据
						table11.add(v1);
						table21.add(v2);
						
						//将共同部分从B表移除，剩下的table22就是仅仅B表有的部分
						table22.remove(v2);
						flag = true;
						break;
					}
					
				}
				
				if(!flag){
					//在第二个表中没有找到此数据时，即仅仅A表有的部分
					table12.add(v1);
				}
			}
			
			int size12 = table22.size();
			
			for(int i=0;i<size12;i++){
				if(table22.get(i) == null){
					table22.remove(i);
					i--;
					size12--;
				}
			}
			
			if(progressActionSiftListener != null){
				Object[][] ok11 = new Object[table11.size()][];
				int ok11i = 0;
				for (Object[] objects : table11) {
					ok11[ok11i] = objects;
					ok11i++;
				};
				
				Object[][] ok12 = new Object[table12.size()][];
				int ok12i = 0;
				for (Object[] objects : table12) {
					ok12[ok12i] = objects;
					ok12i++;
				};
				
				Object[][] ok21 = new Object[table21.size()][];
				int ok21i = 0;
				for (Object[] objects : table21) {
					ok21[ok21i] = objects;
					ok21i++;
				};
				
				Object[][] ok22 = new Object[table22.size()][];
				int ok22i = 0;
				for (Object[] objects : table22) {
					ok22[ok22i] = objects;
					ok22i++;
				};
				progressActionSiftListener.onProgressActionSiftFinish(ok11, ok12, ok21, ok22);
				
				progressBar.setString("筛选进度：100 % ");
				progressBar.setValue(100); // 进度值
			}
			
		}

		public void setButton(JButton jButton) {
			this.jButton = jButton;
		}

	}

	class ProgressImportExcel extends Thread {// 自定义类progress,导入excel用

		private JProgressBar progressBar;
		private JButton button;
		private ImportListener mImportListener;
		private Object[] mTitle;
		private Object[][] mData;
		private JComboBox jComboBox;
		private String excelPath;

		public ProgressImportExcel(JProgressBar progressBar, JButton button,
				String excelPath) {
			this.progressBar = progressBar;
			this.button = button;
			this.excelPath = excelPath;
		}

		public ProgressImportExcel(JProgressBar progressBar, JButton button,
				String excelPath, JComboBox jComboBox) {
			this.progressBar = progressBar;
			this.button = button;
			this.excelPath = excelPath;
			this.jComboBox = jComboBox;

		}

		/**
		 * 设置监听器
		 * 
		 * @version 2012-3-28
		 * @author Jason
		 * @param
		 * @return void
		 */
		public void setImportListener(ImportListener listener) {
			mImportListener = listener;
		}

		public void run() {
			button.setEnabled(false);

			mData = PoiOperatXls2.readXlsRTA(new File(excelPath),
					new ReadXlsListener() {
						int size = 0;

						@Override
						public void onReadXlsPre(int size, Object[] title) {
							// TODO Auto-generated method stub
							this.size = size - 1;
							progressBar.setMaximum(size - 1);
							mTitle = title;
						}

						@Override
						public void onReadXlsProgress(int n) {
							// TODO Auto-generated method stub
							progressBar.setString("进度：" + (n) + "/" + size);
							progressBar.setValue(n); // 进度值
						}

					});

			progressBar.setIndeterminate(false);

			actionFinish();

			button.setEnabled(true); // 按钮可用

		}

		/**
		 * 完成后调用，在此进行回调
		 * 
		 * @version 2012-3-28
		 * @author Jason
		 * @param
		 * @return void
		 */
		private void actionFinish() {

			if (jComboBox != null && mTitle != null) {
				int size = mTitle.length;
				for (int i = 0; i < size; i++) {
					JComboBoxItem ji = new JComboBoxItem();
					ji.index = i;
					ji.name = (String) mTitle[i];
					jComboBox.addItem(ji);
				}
			}

			DefaultTableModel model = new DefaultTableModel(mData, mTitle);
			GppStyleTable jTable = new GppStyleTable(model);
			jTable.setRowHeight(22);
			if (mImportListener != null) {
				GLog.d("", "导入完成");
				mImportListener.onImprotFinish(mTitle, mData, jTable);
			}
		}
	}

	class ProgressExportExcel extends Thread {// 自定义类progress,导入excel用

		private JProgressBar progressBar;
		private JButton button;
		private ExportListener mExportListener;
		private Object[] mTitle;
		private Object[][] mData;
		private String excelPath;

		public ProgressExportExcel(JProgressBar progressBar, JButton button,
				String excelPath) {
			this.progressBar = progressBar;
			this.button = button;
			this.excelPath = excelPath;
		}
		
		public void setData(Object[][] mData) {
			this.mData = mData;
		}


		public void setTitle(Object[] mTitle) {
			this.mTitle = mTitle;
		}
		
		/**
		 * 设置监听器
		 * 
		 * @version 2012-3-28
		 * @author Jason
		 * @param
		 * @return void
		 */
		public void setExportListener(ExportListener listener) {
			mExportListener = listener;
		}

		public void run() {
			button.setEnabled(false);
			final int size = mData.length;
			progressBar.setMaximum(size);
			progressBar.setStringPainted(true); // 显示提示信息
			progressBar.setIndeterminate(false); // 确定进度的进度条
			
			WriteXlsListener writeXlsListener = new WriteXlsListener(){

				@Override
				public void onWriteXlsProgress(int n) {
					// TODO Auto-generated method stub
					progressBar.setString("进度：" + (n) + "/" + size);
					progressBar.setValue(n); // 进度值
				}

				@Override
				public void onWriteXlsFinish(int count, String path) {
					// TODO Auto-generated method stub
					if(mExportListener != null){
						mExportListener.onExprotFinish(path,count);
					}
				}
				
			};
			
			PoiOperatXls2.writeXls(mData, mTitle, excelPath, writeXlsListener);
			
			button.setEnabled(true); // 按钮可用

		}




		
	}
	
	class JComboBoxItem {
		int index;
		String name;

		@Override
		public String toString() {
			return "[" + index + "]" + "[" + name + "]";
		}
	}

	@Override
	public boolean runJar(String[] args) {
		DataSift2.main(args);
		return false;
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();

				DataSift2 thisClass = new DataSift2();
				thisClass.setVisible(true);
			}
		});
	}

}
