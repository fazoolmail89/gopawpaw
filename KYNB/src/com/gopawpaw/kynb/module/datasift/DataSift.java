/**
 * 
 */
package com.gopawpaw.kynb.module.datasift;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.frame.log.GLog;
import com.gopawpaw.frame.utils.GppJarRunableInterface;
import com.gopawpaw.frame.widget.GJTable;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.common.ExcelExportListener;
import com.gopawpaw.kynb.common.ExcelImportListener;
import com.gopawpaw.kynb.common.ProgressExportExcel;
import com.gopawpaw.kynb.common.ProgressImportExcel;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.utils.DateUtils;
import com.gopawpaw.kynb.widget.GppStyleTable;

/**
 * @version 2012-3-27
 * @author Jason
 */
public class DataSift extends BaseModuleFrame implements
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

//	private GppJComboBox jComboBox1 = null;
//	private GppJComboBox jComboBox2 = null;

//	private JComboBoxItem mJComboBoxItem1;
//	private JComboBoxItem mJComboBoxItem2;

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
	
	/**
	 * 选择的条件
	 */
	private int[][] mCondition;
	
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
		this.setTitle("数据筛选");
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

		JPanel jPanel11 = new JPanel();
		jPanel11.setLayout(new BoxLayout(jPanel11, BoxLayout.X_AXIS));
		jPanel11.add(progressBar7);
		jPanel11.add(getJButtonCondition());
		jPanel11.add(getJButtonActionSift());
		
		jContentPane.add(getJPanelCenter(), BorderLayout.CENTER);
		jContentPane.add(jPanel11, BorderLayout.NORTH);
		
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

//		jComboBox1 = new GppJComboBox();
//		jComboBox2 = new GppJComboBox();
//
//		jComboBox1.setEditable(false);
//		jComboBox2.setEditable(false);
//
//		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//				mJComboBoxItem1 = (JComboBoxItem) jComboBox1.getSelectedItem();
//
//			}
//		});
//
//		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//				mJComboBoxItem2 = (JComboBoxItem) jComboBox2.getSelectedItem();
//			}
//		});

		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new BorderLayout());
		JPanel jPanel11 = new JPanel();
		jPanel11.setLayout(new BoxLayout(jPanel11, BoxLayout.X_AXIS));
		jPanel11.add(getJButtonSelect1());
		jPanel11.add(progressBar1);
//		jPanel11.add(jComboBox1);
		jPanel1.add(jScrollPane1, BorderLayout.CENTER);
		jPanel1.add(jPanel11, BorderLayout.NORTH);

		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new BorderLayout());
		JPanel jPanel21 = new JPanel();
		jPanel21.setLayout(new BoxLayout(jPanel21, BoxLayout.X_AXIS));
		jPanel21.add(getJButtonSelect2());
		jPanel21.add(progressBar2);
//		jPanel21.add(jComboBox2);
//		jPanel21.add(getJButtonActionSift());

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

	private JButton getJButtonCondition() {

		JButton jButton = new JButton();
		jButton.setText("  选择条件   ");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				ConditionSelectorDialog csd = new ConditionSelectorDialog();
				csd.setTitleA(mTableTitle1);
				csd.setTitleB(mTableTitle2);
				
				ConditionSelectedListener c = new ConditionSelectedListener(){

					@Override
					public void onConditionSelected(int[][] condition) {
						// TODO Auto-generated method stub
						GLog.d("", "contition:"+condition);
						mCondition = condition;
						if(condition != null){
							int size = condition.length;
							for(int i=0;i<size;i++){
								GLog.d("", ""+condition[i][0]+ " = "+condition[i][1]);
							}
						}
					}
					
				};
				
				csd.setConditionSelectedListener(c);
				
				csd.setVisible(true);
				
//				JDialog jd = new JDialog();
//				jd.setModal(true);
//				
//				jd.setVisible(true);
			}
		});
		
		return jButton;
	}
	
	private JButton getJButtonActionSift() {

		JButton jButton = new JButton();
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

		if (mCondition == null) {
			//没有选择条件
			String tempMSG = "您没有选择筛选条件，请重新选择！";
			//声音提示
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
					JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
			
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
					mCondition,progressBar7,lis);
			p.setButton(jButtonActionSift);
			p.start();
		}
		
	}


	private void actionSaveToExce(Object[] exportTitle, Object[][] exportTable,
			final JProgressBar progressBar, String filename,JButton button) {

		ExcelExportListener exportListener = new ExcelExportListener(){

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
		 
		 //导出excel进度
		ProgressExportExcel p = new ProgressExportExcel(progressBar, button, excelFile);
		p.setExportListener(exportListener);
		p.setTitle(exportTitle);
		p.setData(exportTable);
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
	private void importExcel1(String excelPath, JButton jButton) {

		progressBar1.setStringPainted(true); // 显示提示信息
		progressBar1.setIndeterminate(false); // 确定进度的进度条

//		jComboBox1.removeAllItems();
		
		//导入excel进度
		ProgressImportExcel p = new ProgressImportExcel(progressBar1, jButton, excelPath);
		p.setImportListener(new ExcelImportListener() {

			@Override
			public void onImprotFinish(Object[] title, Object[][] data,
					GJTable table) {
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

//		jComboBox2.removeAllItems();
		ProgressImportExcel p = new ProgressImportExcel(progressBar2, jButton, excelPath);
		p.setImportListener(new ExcelImportListener() {

			@Override
			public void onImprotFinish(Object[] title, Object[][] data,
					GJTable table) {
				// TODO Auto-generated method stub
				mTableTitle2 = title;
				mTableData2 = data;
				jScrollPane2.setViewportView(table);
				table.updateUI();

			}
		});

		p.start();
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
				thisClass.showWithFrame();
			}
		});
	}

}
