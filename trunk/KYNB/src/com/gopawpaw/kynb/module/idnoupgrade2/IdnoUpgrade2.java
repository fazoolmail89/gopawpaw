/**
 * 
 */
package com.gopawpaw.kynb.module.idnoupgrade2;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

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
import com.gopawpaw.kynb.IDNumberChecker;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.ExcelDBAccess;
import com.gopawpaw.kynb.db.ExcelWriter;
import com.gopawpaw.kynb.db.ExportExcelListener;
import com.gopawpaw.kynb.db.GppCommonDBAccess;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.utils.DateUtils;

/**
 * 
 * @version 2012-4-2
 * @author Jason
 */
public class IdnoUpgrade2 extends BaseModuleFrame implements GppJarRunableInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JScrollPane jScrollPane1 = null;
	private JScrollPane jScrollPane3 = null;
	private JScrollPane jScrollPane4 = null;
	private JScrollPane jScrollPane5 = null;

	private JProgressBar progressBar1 = new JProgressBar();
	
	private JProgressBar progressBar3 = new JProgressBar();
	private JProgressBar progressBar4 = new JProgressBar();
	private JProgressBar progressBar5 = new JProgressBar();

	private GppJComboBox jComboBox1 = null;

	private JComboBoxItem mJComboBoxItem1;

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
	private Vector<String> mTableTitle15To18;
	
	/**
	 * 第三个表的标题
	 */
	private Vector<String> mTableTitleError;
	
	

	/**
	 * 导出表的数据
	 */
	private Vector<Vector<String>> exportTable1 = null;
	private Vector<Vector<String>> exportTable2 = null;
	private Vector<Vector<String>> exportTable3 = null;
	
	private JLabel jLableDataNormal = new JLabel();
	private JLabel jLableDataUpgrade = new JLabel();
	private JLabel jLableDataError = new JLabel();
	public IdnoUpgrade2() {
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
		jScrollPane3 = new JScrollPane();
		jScrollPane4 = new JScrollPane();
		jScrollPane5 = new JScrollPane();

		jComboBox1 = new GppJComboBox();

		jComboBox1.setEditable(false);

		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				mJComboBoxItem1 = (JComboBoxItem) jComboBox1.getSelectedItem();

			}
		});

		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new BorderLayout());
		JPanel jPanel11 = new JPanel();
		jPanel11.setLayout(new BoxLayout(jPanel11, BoxLayout.X_AXIS));
		jPanel11.add(getJButtonSelect1());
		jPanel11.add(progressBar1);
		jPanel11.add(new JLabel("选择身份证列："));
		jPanel11.add(jComboBox1);
		jPanel11.add(getJButtonActionCheck());
		
		jPanel1.add(jScrollPane1, BorderLayout.CENTER);
		jPanel1.add(jPanel11, BorderLayout.NORTH);

		JPanel jPanel3 = new JPanel();
		jPanel3.setLayout(new BorderLayout());
		JPanel jPanel31 = new JPanel();
		jPanel31.setLayout(new BoxLayout(jPanel31, BoxLayout.X_AXIS));
		jPanel31.add(getJButtonExport1());
		jPanel31.add(progressBar3);
		JPanel jPanel32 = new JPanel();
		jPanel32.setLayout(new BoxLayout(jPanel32, BoxLayout.X_AXIS));
		jPanel32.add(new JLabel("身份证正常数据："));
		jPanel32.add(jLableDataNormal);
		jPanel3.add(jScrollPane3, BorderLayout.CENTER);
		jPanel3.add(jPanel31, BorderLayout.SOUTH);
		jPanel3.add(jPanel32, BorderLayout.NORTH);

		JPanel jPanel4 = new JPanel();
		jPanel4.setLayout(new BorderLayout());
		JPanel jPanel41 = new JPanel();
		jPanel41.setLayout(new BoxLayout(jPanel41, BoxLayout.X_AXIS));
		jPanel41.add(getJButtonExport2());
		jPanel41.add(progressBar4);
		JPanel jPanel42 = new JPanel();
		jPanel42.setLayout(new BoxLayout(jPanel42, BoxLayout.X_AXIS));
		jPanel42.add(new JLabel("身份证15位升级数据："));
		jPanel42.add(jLableDataUpgrade);
		jPanel4.add(jScrollPane4, BorderLayout.CENTER);
		jPanel4.add(jPanel41, BorderLayout.SOUTH);
		jPanel4.add(jPanel42, BorderLayout.NORTH);
		
		JPanel jPanel5 = new JPanel();
		jPanel5.setLayout(new BorderLayout());
		JPanel jPanel51 = new JPanel();
		jPanel51.setLayout(new BoxLayout(jPanel51, BoxLayout.X_AXIS));
		jPanel51.add(getJButtonExport3());
		jPanel51.add(progressBar5);
		JPanel jPanel52 = new JPanel();
		jPanel52.setLayout(new BoxLayout(jPanel52, BoxLayout.X_AXIS));
		jPanel52.add(new JLabel("身份证错误数据："));
		jPanel52.add(jLableDataError);
		jPanel5.add(jScrollPane5, BorderLayout.CENTER);
		jPanel5.add(jPanel51, BorderLayout.SOUTH);
		jPanel5.add(jPanel52, BorderLayout.NORTH);


		// 底部三个面板============start

		JSplitPane jSplitPane11 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				jPanel3, jPanel4);
		jSplitPane11.setDividerLocation(300);
		jSplitPane11.setOneTouchExpandable(true);
		jSplitPane11.setDividerSize(6);

		JSplitPane jSplitPane12 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				jSplitPane11, jPanel5);
		jSplitPane12.setDividerLocation(600);
		jSplitPane12.setOneTouchExpandable(true);
		jSplitPane12.setDividerSize(6);
		
		// 底部三个面板============end

		

		JSplitPane jSplitPaneCenter = new JSplitPane(
				JSplitPane.VERTICAL_SPLIT, jPanel1, jSplitPane12);
		jSplitPaneCenter.setDividerLocation(300);

		return jSplitPaneCenter;
	}

	private JButton getJButtonSelect1() {

		final JButton jButton = new JButton();
		jButton.setText("打开Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				JFileChooser jFileChooser = new JFileChooser();

				jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				jFileChooser.showOpenDialog(null);

				if (jFileChooser.getSelectedFile() != null) {
					String ph = jFileChooser.getSelectedFile()
							.getAbsolutePath();
					importExcel1(ph, jButton);
				}

			}
		});
		return jButton;
	}

	
	private JButton getJButtonActionCheck() {

		final JButton jButton = new JButton();
		jButton.setText("执行检查身份证升级");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				//在此处进行身份证检查和升级工作
				actionIDNoCheck();
			}
		});

		return jButton;
	}

	private JButton getJButtonExport1() {

		JButton jButton = new JButton();
		jButton.setText("导出正常数据");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle1,exportTable1,progressBar3,"身份证核对-导出正常数据");
			}
		});

		return jButton;
	}

	private JButton getJButtonExport2() {

		JButton jButton = new JButton();
		jButton.setText("导出15位升级数据");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle15To18,exportTable2,progressBar4,"身份证核对-导出15位升级数据");
			}
		});

		return jButton;
	}

	private JButton getJButtonExport3() {

		JButton jButton = new JButton();
		jButton.setText("导出错误数据");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitleError,exportTable3,progressBar5,"身份证核对-导出错误数据");
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
	private void actionIDNoCheck() {

		if (mJComboBoxItem1 == null ) {
			return;
		}
		
		Object[] obj = actionIdNoCheck(mTableData1,mJComboBoxItem1.index);
		
		if(obj == null){
			return;
		}
		exportTable1 = (Vector<Vector<String>>)obj[0];
		exportTable2 = (Vector<Vector<String>>)obj[1];
		exportTable3 = (Vector<Vector<String>>)obj[2];
		ArrayList array15to18 = (ArrayList)obj[3];
		ArrayList arrayerror = (ArrayList)obj[4];
		
		if(mTableTitle15To18 == null){
			mTableTitle15To18 = new Vector<String>();
			mTableTitle15To18.addAll(mTableTitle1);
			mTableTitle15To18.add("升级后的号码");
		}
		
		if(mTableTitleError == null){
			mTableTitleError = new Vector<String>();
			mTableTitleError.addAll(mTableTitle1);
			mTableTitleError.add("错误信息");
		}
		
		jLableDataNormal.setText("共 "+exportTable1.size() + " 条");
		jLableDataUpgrade.setText("共 "+exportTable2.size() + " 条");
		jLableDataError.setText("共 "+exportTable3.size() + " 条");
		
		{//原来表的数据
			DefaultTableModel model = new DefaultTableModel(mTableData1,
					mTableTitle1);
			GppStyleTable jTable = new GppStyleTable(model);
			jTable.setRowHeight(22);

			jScrollPane1.setViewportView(jTable);
			jTable.updateUI();
		}
		
		{//正常表的数据
			
			DefaultTableModel model = new DefaultTableModel(exportTable1,
					mTableTitle1);
			GppStyleTable jTable = new GppStyleTable(model);
			jTable.setRowHeight(22);

			jScrollPane3.setViewportView(jTable);
			jTable.updateUI();
		}
		
		{//升级15位到18位的数据
			DefaultTableModel model = new DefaultTableModel(exportTable2,
					mTableTitle15To18);
			GppStyleTable jTable = new GppStyleTable(model);
			jTable.setRowHeight(22);

			jScrollPane4.setViewportView(jTable);
			jTable.updateUI();
		}
		
		{//错误数据表
			DefaultTableModel model = new DefaultTableModel(exportTable3,
					mTableTitleError);
			GppStyleTable jTable = new GppStyleTable(model);
			jTable.setRowHeight(22);

			jScrollPane5.setViewportView(jTable);
			jTable.updateUI();
		}
	}

	/**
	 * 身份证检查，可区分错误的身份证号码和15位升级为18位身份证和正常的身份证号码
	 * @version 2012-4-3
	 * @author Jason
	 * @param
	 * @return Object[]
	 */
	private Object[] actionIdNoCheck(Vector<Vector<String>> table,int index){
		Vector<Vector<String>> table11 = new Vector<Vector<String>>();
		Vector<Vector<String>> table12 = new Vector<Vector<String>>();
		Vector<Vector<String>> table13 = new Vector<Vector<String>>();
		
		//存放15升级为18位的索引
		ArrayList switch15to18index = new ArrayList(); 
		//存放错误的索引
		ArrayList errorindex = new ArrayList();
		
		Object[] objectArray = null;
		if(table == null){
			return objectArray;
		}
		
		objectArray = new Object[]{table11,table12,table13,switch15to18index,errorindex};
		
		
		Iterator<Vector<String>> it1 = table.iterator();
		
		int indexCount = -1;
		while (it1.hasNext()) {
			//依次取出第一个表的数据进行对比
			indexCount++;
			
			Vector<String> v1 = (Vector<String>) it1.next();
			String vTemp1 = v1.get(index);
			
			vTemp1 = (vTemp1 == null ? "" : vTemp1);
			
			try {
				int checkCode = IDNumberChecker.checkIDCard(vTemp1);
				if(IDNumberChecker.IDCARD_IS_OK == checkCode){
					//合法的18位身份证
					table11.add(v1);
				}else if(IDNumberChecker.IDCARD_IS_OK_15 == checkCode){
					//合法的15位身份证，需要进行升级
					Vector<String> v10 = new Vector<String>();
					v10.addAll(v1);
					v10.add(IDNumberChecker.SwitchIDCard15To18(vTemp1));
					table12.add(v10);
					
					switch15to18index.add(indexCount);
				}else{
					//错误的身份证，需要显示错误信息
					Vector<String> v10 = new Vector<String>();
					v10.addAll(v1);
					v10.add(IDNumberChecker.getIDCardErrorInfo(checkCode));
					table13.add(v10);
					errorindex.add(indexCount);
				}
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
		IdnoUpgrade2.main(args);
		return false;
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();

				IdnoUpgrade2 thisClass = new IdnoUpgrade2();
				thisClass.setVisible(true);
			}
		});
	}

}
