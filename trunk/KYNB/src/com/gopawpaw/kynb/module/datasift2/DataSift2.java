/**
 * 
 */
package com.gopawpaw.kynb.module.datasift2;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
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
import com.gopawpaw.kynb.common.ExcelFileFilter;
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
public class DataSift2 extends BaseModuleFrame implements
		GppJarRunableInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JScrollPane jScrollPane1 = null;
	private JScrollPane jScrollPane3 = null;
	private JScrollPane jScrollPane4 = null;

	//导入excel进度条
	private JProgressBar progressBar1 = new JProgressBar();

	private JProgressBar progressBar3 = new JProgressBar();
	private JProgressBar progressBar4 = new JProgressBar();
	
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
	 * 导出表的数据
	 */
	private Object[][] exportTable1 = null;
	private Object[][] exportTable2 = null;
	
	private JLabel jLableExportCount1 = new JLabel();
	private JLabel jLableExportCount2 = new JLabel();

	private JButton jButtonActionSift;
	
	/**
	 * 选择的条件
	 */
	private int[] mCondition;
	
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
		this.setTitle("同Excel表重复筛选");
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
		
		jPanel11.add(getJButtonSelect1());
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
		jScrollPane3 = new JScrollPane();
		jScrollPane4 = new JScrollPane();


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



		// 左边三个面板============start

		JSplitPane jSplitPane11 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				jPanel3, jPanel4);
		jSplitPane11.setDividerLocation(450);
		jSplitPane11.setOneTouchExpandable(true);
		jSplitPane11.setDividerSize(6);

		JSplitPane jSplitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
				jScrollPane1, jSplitPane11);
		jSplitPane1.setDividerLocation(300);
		jSplitPane1.setOneTouchExpandable(true);
		jSplitPane1.setDividerSize(10);
		// 左边三个面板============end

		

		return jSplitPane1;
	}

	private JButton getJButtonSelect1() {

		final JButton jButton = new JButton();
		jButton.setText("选择Excel");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				JFileChooser jFileChooser = new JFileChooser();

				jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				jFileChooser.setFileFilter(new ExcelFileFilter());
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


	private JButton getJButtonCondition() {

		JButton jButton = new JButton();
		jButton.setText("  选择条件   ");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				ConditionSelectorDialog csd = new ConditionSelectorDialog();
				csd.setTitleA(mTableTitle1);
				
				ConditionSelectedListener c = new ConditionSelectedListener(){

					@Override
					public void onConditionSelected(int[] condition) {
						// TODO Auto-generated method stub
						mCondition = condition;
						if(condition != null){
							int size = condition.length;
							for(int i=0;i<size;i++){
								GLog.d("", "condition:"+condition[i]);
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
		jButton.setText("不重复数据Excel导出");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle1, exportTable1, progressBar3,
						"不重复数据Excel导出",jButton);
			}
		});

		return jButton;
	}

	private JButton getJButtonExport2() {

		final JButton jButton = new JButton();
		jButton.setText("重复数据Excel导出");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle2, exportTable2, progressBar4,
						"重复数据Excel导出",jButton);
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
			public void onProgressActionSiftFinish(Object[][] table11,Object[][] table12) {
				// TODO Auto-generated method stub
				
				exportTable1 = table11;
				exportTable2 = table12;
				
				{// 
					jLableExportCount2.setText("重复数据："+exportTable2.length);
					DefaultTableModel model = new DefaultTableModel(exportTable2,
							mTableTitle2);
					GppStyleTable jTable = new GppStyleTable(model);
					jTable.setRowHeight(22);
					
					jScrollPane4.setViewportView(jTable);
					jTable.updateUI();
				}
				
				{// A
					jLableExportCount1.setText("不重复数据："+exportTable1.length);
					DefaultTableModel model = new DefaultTableModel(exportTable1,
							mTableTitle1);
					GppStyleTable jTable = new GppStyleTable(model);
					jTable.setRowHeight(22);

					jScrollPane3.setViewportView(jTable);
					jTable.updateUI();
				}


			}
		};
		
		if(jButtonActionSift.isEnabled()){
			
			ProgressActionSift p = new ProgressActionSift(mTableData1,
					mCondition,lis,progressBar7);
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

		
		//导入excel进度
		ProgressImportExcel p = new ProgressImportExcel(progressBar1, jButton, excelPath);
		p.setImportListener(new ExcelImportListener() {

			@Override
			public void onImprotFinish(Object[] title, Object[][] data,
					GJTable table) {
				// TODO Auto-generated method stub
				mTableTitle1 = title;
				mTableData1 = data;
				
				mTableTitle2 = new Object[title.length+1];
				for(int i=0;i<title.length;i++){
					mTableTitle2[i] = title[i];
				}
				mTableTitle2[title.length] = "重复数量";
				
				jScrollPane1.setViewportView(table);
				table.updateUI();
			}
		});

		p.start();
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
				thisClass.showWithFrame();
			}
		});
	}

}
