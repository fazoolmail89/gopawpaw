/**
 * 
 */
package com.gopawpaw.kynb.module.datasift;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
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
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.ExcelDBAccess;
import com.gopawpaw.kynb.db.ExcelWriter;
import com.gopawpaw.kynb.db.ExportExcelListener;
import com.gopawpaw.kynb.db.GppCommonDBAccess;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.utils.DateUtils;

/**
 * @version 2012-3-27
 * @author Jason
 */
public class DataSift extends BaseModuleFrame implements GppJarRunableInterface {

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

	private GppJComboBox jComboBox1 = null;
	private GppJComboBox jComboBox2 = null;

	private JComboBoxItem mJComboBoxItem1;
	private JComboBoxItem mJComboBoxItem2;

	/**
	 * 第一个表的标题
	 */
	private Vector<String> mTableTitle1;
	/**
	 * 第一个表的数据
	 */
	private Vector<Vector<String>> mTableData1;

	/**
	 * 第二个表的标题
	 */
	private Vector<String> mTableTitle2;
	/**
	 * 第二个表的数据
	 */
	private Vector<Vector<String>> mTableData2;

	/**
	 * 导出表的数据
	 */
	private Vector<Vector<String>> exportTable1 = null;
	private Vector<Vector<String>> exportTable2 = null;
	private Vector<Vector<String>> exportTable3 = null;
	private Vector<Vector<String>> exportTable4 = null;
	
	public DataSift() {
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

				actionSift();
			}
		});

		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				mJComboBoxItem2 = (JComboBoxItem) jComboBox2.getSelectedItem();
				actionSift();
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

		JPanel jPanel4 = new JPanel();
		jPanel4.setLayout(new BorderLayout());
		JPanel jPanel41 = new JPanel();
		jPanel41.setLayout(new BoxLayout(jPanel41, BoxLayout.X_AXIS));
		jPanel41.add(getJButtonExport2());
		jPanel41.add(progressBar4);
		jPanel4.add(jScrollPane4, BorderLayout.CENTER);
		jPanel4.add(jPanel41, BorderLayout.SOUTH);

		JPanel jPanel5 = new JPanel();
		jPanel5.setLayout(new BorderLayout());
		JPanel jPanel51 = new JPanel();
		jPanel51.setLayout(new BoxLayout(jPanel51, BoxLayout.X_AXIS));
		jPanel51.add(getJButtonExport3());
		jPanel51.add(progressBar5);
		jPanel5.add(jScrollPane5, BorderLayout.CENTER);
		jPanel5.add(jPanel51, BorderLayout.SOUTH);

		JPanel jPanel6 = new JPanel();
		jPanel6.setLayout(new BorderLayout());
		JPanel jPanel61 = new JPanel();
		jPanel61.setLayout(new BoxLayout(jPanel61, BoxLayout.X_AXIS));
		jPanel61.add(getJButtonExport4());
		jPanel61.add(progressBar6);
		jPanel6.add(jScrollPane6, BorderLayout.CENTER);
		jPanel6.add(jPanel61, BorderLayout.SOUTH);

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

	private JButton getJButtonExport1() {

		JButton jButton = new JButton();
		jButton.setText("A不同导出Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle1,exportTable2,progressBar3,"导出表A不同");
			}
		});

		return jButton;
	}

	private JButton getJButtonExport2() {

		JButton jButton = new JButton();
		jButton.setText("A相同导出Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle1,exportTable1,progressBar4,"导出表A相同");
			}
		});

		return jButton;
	}

	private JButton getJButtonExport3() {

		JButton jButton = new JButton();
		jButton.setText("B相同导出Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle2,exportTable3,progressBar5,"导出表B相同");
			}
		});

		return jButton;
	}

	private JButton getJButtonExport4() {

		JButton jButton = new JButton();
		jButton.setText("B不同导出Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle2,exportTable4,progressBar6,"导出表B不同");
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
	@SuppressWarnings("unchecked")
	private void actionSift() {

		if (mJComboBoxItem1 == null || mJComboBoxItem2 == null) {
			return;
		}
		
		Object[] obj = actionSift(mTableData1,mTableData2,mJComboBoxItem1.index,mJComboBoxItem2.index);
		
		if(obj == null){
			return;
		}
		exportTable1 = (Vector<Vector<String>>)obj[0];
		exportTable2 = (Vector<Vector<String>>)obj[1];
		exportTable3 = (Vector<Vector<String>>)obj[2];
		exportTable4 = (Vector<Vector<String>>)obj[3];
		
		{//A
			DefaultTableModel model = new DefaultTableModel(exportTable2,
					mTableTitle1);
			GppStyleTable jTable = new GppStyleTable(model);
			jTable.setRowHeight(22);

			jScrollPane3.setViewportView(jTable);
			jTable.updateUI();
		}
		
		{//AB
			
			DefaultTableModel model = new DefaultTableModel(exportTable1,
					mTableTitle1);
			GppStyleTable jTable = new GppStyleTable(model);
			jTable.setRowHeight(22);

			jScrollPane4.setViewportView(jTable);
			jTable.updateUI();
		}
		
		{//BA
			DefaultTableModel model = new DefaultTableModel(exportTable3,
					mTableTitle2);
			GppStyleTable jTable = new GppStyleTable(model);
			jTable.setRowHeight(22);

			jScrollPane5.setViewportView(jTable);
			jTable.updateUI();
		}
		
		{//B
			DefaultTableModel model = new DefaultTableModel(exportTable4,
					mTableTitle2);
			GppStyleTable jTable = new GppStyleTable(model);
			jTable.setRowHeight(22);

			jScrollPane6.setViewportView(jTable);
			jTable.updateUI();
		}
	}

	/**
	 * 数据筛选
	 * @param table1	第一个表的数据
	 * @param table2	第二个表的数据
	 * @param index1	第一个表中，用来对比的列索引
	 * @param index2	第二个表中，用来对比的列索引
	 * @return	筛选结果的4个表数据（Vector<Vector<String>>[]）数组<br>
	 * 				0:在table1中相同部分的数据；<br>
	 * 				1:在table1中不同部分的数据；<br>
	 * 				2:在table2中相同部分的数据；<br>
	 * 				3:在table2中不同部分的数据；<br>
	 */
	private Object[] actionSift(Vector<Vector<String>> table1,Vector<Vector<String>> table2,int index1,int index2){
		Vector<Vector<String>> table11 = new Vector<Vector<String>>();
		Vector<Vector<String>> table12 = new Vector<Vector<String>>();
		Vector<Vector<String>> table21 = new Vector<Vector<String>>();
		Vector<Vector<String>> table22 = new Vector<Vector<String>>();
		
		Object[] objectArray = null;
		if(table1 == null || table2 == null){
			return objectArray;
		}
		
		if(table1.size() > table2.size()){
			//优化算法，调换位置效率会高一些
			Vector<Vector<String>> temp = table1;
			table1 = table2;
			table2 = temp;
			objectArray = new Object[]{table21,table22,table11,table12};
		}else{
			objectArray = new Object[]{table11,table12,table21,table22};
		}
		
		//复制第二个表
		table22.addAll(table2);
		
		Iterator<Vector<String>> it1 = table1.iterator();
		
		while (it1.hasNext()) {
			//依次取出第一个表的数据进行对比
			Vector<String> v1 = (Vector<String>) it1.next();
			String vTemp1 = v1.get(index1);
			
			vTemp1 = (vTemp1 == null ? "" : vTemp1);
			
			Iterator<Vector<String>> it2 = table2.iterator();
			
			boolean flag = false;
			while (it2.hasNext()) {
				//将第一个表的一条数据依次与第二个表的数据进行对比
				Vector<String> v2 = (Vector<String>) it2.next();
				String vTemp2 = v2.get(index2);
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
		
		return objectArray;
	}
	
	private void actionSaveToExce(Vector<String> exportTitle,Vector<Vector<String>> exportTable,final JProgressBar progressBar,String filename) {

		Date date = new Date();

		String excelFile = "OutPut\\" + filename + "-"
				+ DateUtils.DATA_FORMAT.format(date) + ".xls";
		String excelTempPath = "DBCenter\\emptyTemp.xls";
		
		progressBar.setStringPainted(true); // 显示提示信息
		progressBar.setIndeterminate(false); // 确定进度的进度条
		progressBar.setString("进度：" + 0 + "/" + 0);
		progressBar.setValue(0); // 进度值
		
		ExcelWriter ew = new ExcelWriter(excelTempPath,excelFile);
		ew.setmTableTitle(exportTitle);
		ew.setmTableData(exportTable);
		ew.setExportExcelListener(new ExportExcelListener() {
			
			private boolean flag = false;
			@Override
			public void onExportProgress(int total, int current, boolean isOk) {
				// TODO Auto-generated method stub
				if(!flag){
					progressBar.setMaximum(total);
					flag = true;
				}else{
					progressBar.setString("进度：" + current + "/" + total);
					progressBar.setValue(current); // 进度值
				}
			}
		});
		
		if(ew.actionSave()){
			String tempMSG = "成功导出到："+excelFile;
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
					JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
		}
		
		
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
		Progress p = new Progress(progressBar1, jButton, excelPath, jComboBox1);
		p.setImportListener(new ImportListener() {

			@Override
			public void onImprotFinish(Vector<String> title, Vector<Vector<String>> data,
					GppJTable table) {
				// TODO Auto-generated method stub
				mTableTitle1 = title;
				mTableData1 = data;
				jScrollPane1.setViewportView(table);
				table.updateUI();
				actionSift();
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
		Progress p = new Progress(progressBar2, jButton, excelPath, jComboBox2);
		p.setImportListener(new ImportListener() {

			@Override
			public void onImprotFinish(Vector<String> title, Vector<Vector<String>> data,
					GppJTable table) {
				// TODO Auto-generated method stub
				mTableTitle2 = title;
				mTableData2 = data;
				jScrollPane2.setViewportView(table);
				table.updateUI();
				actionSift();
			}
		});

		p.start();
	}

	interface ImportListener {
		void onImprotFinish(Vector<String> title, Vector<Vector<String>> data, GppJTable table);
	}

	class Progress extends Thread {// 自定义类progress

		private JProgressBar progressBar;
		private JButton button;
		private ExcelDBAccess mExcelDBAccess;
		private ImportListener mImportListener;
		private Vector<String> mTitle = new Vector<String>();
		private Vector<Vector<String>> mData = new Vector<Vector<String>>();
		private JComboBox jComboBox;

		public Progress(JProgressBar progressBar, JButton button,
				String excelPath) {
			this.progressBar = progressBar;
			this.button = button;

			mExcelDBAccess = new ExcelDBAccess(excelPath);

		}

		public Progress(JProgressBar progressBar, JButton button,
				String excelPath, JComboBox jComboBox) {
			this.progressBar = progressBar;
			this.button = button;

			mExcelDBAccess = new ExcelDBAccess(excelPath);
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
			try {
				button.setEnabled(false);

				// ===================================方案二 begin
				GppCommonDBAccess commonsql = mExcelDBAccess.getCommonSQL();
				String sql = "select * from [Sheet1$] ";

				if (!commonsql.query(sql)) {
					return;
				}

				if (commonsql != null && commonsql.getrowcount() > 0) {

					int size = (int) commonsql.getrowcount();
					progressBar.setMaximum(size);

					// 表的列数
					int colum = 1;
					int i = 0;
					while (commonsql.nextrecord()) {
						i++;
						if (i == 1) {
							// 当是第一行时，遍历第一行共有多少列，并以此列数来做表格
							String c = null;
							String c2 = null;
							String c20 = "";
							boolean flag = false;
							while ((c = commonsql.getString(colum)) != null || (c2 = commonsql.getString(colum+1)) != null) {
								//允许其中一列未null时，第二列以后还有数据
								String temp = c;
								if(flag){
									temp = c20;
									c20 = c2;
								}
								
								if(temp == null){
									temp = "<列名未知>";
									c20 = c2;
									flag = true;
								}
								
									
								GLog.d("colum:" + colum, temp);
								mTitle.add(temp);

								if (jComboBox != null) {
									JComboBoxItem ji = new JComboBoxItem();
									ji.index = colum-1;
									ji.name = temp;
									jComboBox.addItem(ji);
								}
								colum++;
							}
						} else {
							// 表内容
							Vector<String> row = new Vector<String>();
							for (int c = 1; c < colum; c++) {
								String v = commonsql.getString(c);
								// GLog.d("==", v);
								row.add(v);
							}
							mData.add(row);
						}

						progressBar.setString("进度：" + (i) + "/" + size);
						progressBar.setValue(i); // 进度值
					}

					commonsql.close();

					progressBar.setIndeterminate(false);

					actionFinish();
				}
				// ==========================方案二 end

			} catch (DBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

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
			DefaultTableModel model = new DefaultTableModel(mData, mTitle);
			GppStyleTable jTable = new GppStyleTable(model);
			jTable.setRowHeight(22);
			if (mImportListener != null) {
				GLog.d("", "导入完成");
				mImportListener.onImprotFinish(mTitle, mData, jTable);
			}
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
		DataSift.main(args);
		return false;
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();

				DataSift thisClass = new DataSift();
				thisClass.setVisible(true);
			}
		});
	}

}
