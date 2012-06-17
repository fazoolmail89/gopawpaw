/**
 * 
 */
package com.gopawpaw.kynb.module.idnoupgrade2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;
import java.util.Date;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
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

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.utils.GppJarRunableInterface;
import com.gopawpaw.frame.widget.GJComboBox;
import com.gopawpaw.frame.widget.GJTable;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.bean.JComboBoxItem;
import com.gopawpaw.kynb.common.ExcelExportListener;
import com.gopawpaw.kynb.common.ExcelFileFilter;
import com.gopawpaw.kynb.common.ExcelImportListener;
import com.gopawpaw.kynb.common.ProgressExportExcel;
import com.gopawpaw.kynb.common.ProgressImportExcel;
import com.gopawpaw.kynb.db.ExcelWriter;
import com.gopawpaw.kynb.db.ExportExcelListener;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.module.blacklist.BlackList;
import com.gopawpaw.kynb.utils.DateUtils;
import com.gopawpaw.kynb.utils.StringConstant;
import com.gopawpaw.kynb.widget.GppStyleTable;

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

	private JProgressBar progressBar6 = new JProgressBar();
	
	private GJComboBox jComboBox1 = null;

	private JComboBoxItem mJComboBoxItem1;

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
	private Object[] mTableTitle15To18;
	
	/**
	 * 第三个表的标题
	 */
	private Object[] mTableTitleError;
	
	

	/**
	 * 导出表的数据
	 */
	private Object[][] exportTable1 = null;
	private Object[][] exportTable2 = null;
	private Object[][] exportTable3 = null;
	
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
		
		if(!GlobalParameter.isAuthModuls){
			//非法授权
			JOptionPane.showConfirmDialog(null, StringConstant.isNotAuthMsg,
					"系统提示", JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		this.setSize(900, 600);
		this.setLocation(200, 100);
		this.setTitle("身份证升级验证（表格）");
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
		jContentPane.add(progressBar6, BorderLayout.NORTH);
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

		jComboBox1 = new GJComboBox();

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

	
	private JButton getJButtonActionCheck() {

		final JButton jButton = new JButton();
		jButton.setText("执行检查身份证升级");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				//在此处进行身份证检查和升级工作
				actionIDNoCheck(jButton);
			}
		});

		return jButton;
	}

	private JButton getJButtonExport1() {

		final JButton jButton = new JButton();
		jButton.setText("导出正常数据");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle1,exportTable1,progressBar3,"身份证核对-导出正常数据",jButton);
			}
		});

		return jButton;
	}

	private JButton getJButtonExport2() {

		final JButton jButton = new JButton();
		jButton.setText("导出15位升级数据");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle15To18,exportTable2,progressBar4,"身份证核对-导出15位升级数据",jButton);
			}
		});

		return jButton;
	}

	private JButton getJButtonExport3() {

		final JButton jButton = new JButton();
		jButton.setText("导出错误数据");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitleError,exportTable3,progressBar5,"身份证核对-导出错误数据",jButton);
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
	private void actionIDNoCheck(JButton jButton) {

		if (mJComboBoxItem1 == null ) {
			return;
		}
		
		if(jButton.isEnabled()){
			
			
			ProgressUpgradeIdnoListener progressUpgradeIdnoListener = new ProgressUpgradeIdnoListener(){

				@Override
				public void onProgressUpgradeFinish(Object[][] tableOK,
						Object[][] tableUP, Object[][] tableErr) {
					// TODO Auto-generated method stub
					exportTable1 = tableOK;
					exportTable2 = tableUP;
					exportTable3 = tableErr;
					
					if(mTableTitle15To18 == null){
						//复制表头
						mTableTitle15To18 = new Object[mTableTitle1.length+1];
						for(int i=0;i<mTableTitle1.length;i++){
							mTableTitle15To18[i] = mTableTitle1[i];
						}
						mTableTitle15To18[mTableTitle1.length] = "升级后的号码";
					}
					
					if(mTableTitleError == null){
						//复制表头
						mTableTitleError = new Object[mTableTitle1.length+1];
						for(int i=0;i<mTableTitle1.length;i++){
							mTableTitleError[i] = mTableTitle1[i];
						}
						mTableTitleError[mTableTitle1.length] = "错误信息";
					}
					
					jLableDataNormal.setText("共 "+exportTable1.length + " 条");
					jLableDataUpgrade.setText("共 "+exportTable2.length + " 条");
					jLableDataError.setText("共 "+exportTable3.length + " 条");
					
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
				
			};
			
			//执行身份证升级进度
			ProgressUpgradeIdno p = new ProgressUpgradeIdno(mTableData1,mJComboBoxItem1.index,progressBar6,progressUpgradeIdnoListener);
			p.setButton(jButton);
			p.setTableColumn(mTableTitle1.length);
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

		jComboBox1.removeAllItems();
		
		//导入excel进度
		ProgressImportExcel p = new ProgressImportExcel(progressBar1, jButton, excelPath, jComboBox1);
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
				thisClass.showWithFrame();
			}
		});
	}

}
