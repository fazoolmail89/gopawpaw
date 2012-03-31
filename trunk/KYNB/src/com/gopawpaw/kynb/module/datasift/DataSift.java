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
	 * ��һ����ı���
	 */
	private Vector<String> mTableTitle1;
	/**
	 * ��һ���������
	 */
	private Vector<Vector<String>> mTableData1;

	/**
	 * �ڶ�����ı���
	 */
	private Vector<String> mTableTitle2;
	/**
	 * �ڶ����������
	 */
	private Vector<Vector<String>> mTableData2;

	/**
	 * �����������
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
	 * �м����
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

		// ����������============start

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
		// ����������============end

		// �ұ��������============start
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
		// �ұ��������============end

		JSplitPane jSplitPaneCenter = new JSplitPane(
				JSplitPane.HORIZONTAL_SPLIT, jSplitPane1, jSplitPane2);
		jSplitPaneCenter.setDividerLocation(450);

		return jSplitPaneCenter;
	}

	private JButton getJButtonSelect1() {

		final JButton jButton = new JButton();
		jButton.setText("ѡ���һ��Excel");
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
		jButton.setText("ѡ��ڶ���Excel");
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
		jButton.setText("A��ͬ����Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle1,exportTable2,progressBar3,"������A��ͬ");
			}
		});

		return jButton;
	}

	private JButton getJButtonExport2() {

		JButton jButton = new JButton();
		jButton.setText("A��ͬ����Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle1,exportTable1,progressBar4,"������A��ͬ");
			}
		});

		return jButton;
	}

	private JButton getJButtonExport3() {

		JButton jButton = new JButton();
		jButton.setText("B��ͬ����Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle2,exportTable3,progressBar5,"������B��ͬ");
			}
		});

		return jButton;
	}

	private JButton getJButtonExport4() {

		JButton jButton = new JButton();
		jButton.setText("B��ͬ����Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle2,exportTable4,progressBar6,"������B��ͬ");
			}
		});

		return jButton;
	}

	/**
	 * ִ��ɸѡ
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
	 * ����ɸѡ
	 * @param table1	��һ���������
	 * @param table2	�ڶ����������
	 * @param index1	��һ�����У������Աȵ�������
	 * @param index2	�ڶ������У������Աȵ�������
	 * @return	ɸѡ�����4�������ݣ�Vector<Vector<String>>[]������<br>
	 * 				0:��table1����ͬ���ֵ����ݣ�<br>
	 * 				1:��table1�в�ͬ���ֵ����ݣ�<br>
	 * 				2:��table2����ͬ���ֵ����ݣ�<br>
	 * 				3:��table2�в�ͬ���ֵ����ݣ�<br>
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
			//�Ż��㷨������λ��Ч�ʻ��һЩ
			Vector<Vector<String>> temp = table1;
			table1 = table2;
			table2 = temp;
			objectArray = new Object[]{table21,table22,table11,table12};
		}else{
			objectArray = new Object[]{table11,table12,table21,table22};
		}
		
		//���Ƶڶ�����
		table22.addAll(table2);
		
		Iterator<Vector<String>> it1 = table1.iterator();
		
		while (it1.hasNext()) {
			//����ȡ����һ��������ݽ��жԱ�
			Vector<String> v1 = (Vector<String>) it1.next();
			String vTemp1 = v1.get(index1);
			
			vTemp1 = (vTemp1 == null ? "" : vTemp1);
			
			Iterator<Vector<String>> it2 = table2.iterator();
			
			boolean flag = false;
			while (it2.hasNext()) {
				//����һ�����һ������������ڶ���������ݽ��жԱ�
				Vector<String> v2 = (Vector<String>) it2.next();
				String vTemp2 = v2.get(index2);
				if(vTemp1.equals(vTemp2)){
					//AB����������ƥ�������
					table11.add(v1);
					table21.add(v2);
					
					//����ͬ���ִ�B���Ƴ���ʣ�µ�table22���ǽ���B���еĲ���
					table22.remove(v2);
					flag = true;
					break;
				}
			}
			
			if(!flag){
				//�ڵڶ�������û���ҵ�������ʱ��������A���еĲ���
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
		
		progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBar.setIndeterminate(false); // ȷ�����ȵĽ�����
		progressBar.setString("���ȣ�" + 0 + "/" + 0);
		progressBar.setValue(0); // ����ֵ
		
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
					progressBar.setString("���ȣ�" + current + "/" + total);
					progressBar.setValue(current); // ����ֵ
				}
			}
		});
		
		if(ew.actionSave()){
			String tempMSG = "�ɹ���������"+excelFile;
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
					JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
		}
		
		
	}
	
	/**
	 * ����excle����
	 * 
	 * @version 2012-3-28
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void importExcel1(String excelPath, JButton jButton) {

		progressBar1.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBar1.setIndeterminate(false); // ȷ�����ȵĽ�����

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
	 * ����excle����
	 * 
	 * @version 2012-3-28
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void importExcel2(String excelPath, JButton jButton) {

		progressBar2.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBar2.setIndeterminate(false); // ȷ�����ȵĽ�����

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

	class Progress extends Thread {// �Զ�����progress

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
		 * ���ü�����
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

				// ===================================������ begin
				GppCommonDBAccess commonsql = mExcelDBAccess.getCommonSQL();
				String sql = "select * from [Sheet1$] ";

				if (!commonsql.query(sql)) {
					return;
				}

				if (commonsql != null && commonsql.getrowcount() > 0) {

					int size = (int) commonsql.getrowcount();
					progressBar.setMaximum(size);

					// �������
					int colum = 1;
					int i = 0;
					while (commonsql.nextrecord()) {
						i++;
						if (i == 1) {
							// ���ǵ�һ��ʱ��������һ�й��ж����У����Դ������������
							String c = null;
							String c2 = null;
							String c20 = "";
							boolean flag = false;
							while ((c = commonsql.getString(colum)) != null || (c2 = commonsql.getString(colum+1)) != null) {
								//��������һ��δnullʱ���ڶ����Ժ�������
								String temp = c;
								if(flag){
									temp = c20;
									c20 = c2;
								}
								
								if(temp == null){
									temp = "<����δ֪>";
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
							// ������
							Vector<String> row = new Vector<String>();
							for (int c = 1; c < colum; c++) {
								String v = commonsql.getString(c);
								// GLog.d("==", v);
								row.add(v);
							}
							mData.add(row);
						}

						progressBar.setString("���ȣ�" + (i) + "/" + size);
						progressBar.setValue(i); // ����ֵ
					}

					commonsql.close();

					progressBar.setIndeterminate(false);

					actionFinish();
				}
				// ==========================������ end

			} catch (DBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			button.setEnabled(true); // ��ť����

		}

		/**
		 * ��ɺ���ã��ڴ˽��лص�
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
				GLog.d("", "�������");
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
