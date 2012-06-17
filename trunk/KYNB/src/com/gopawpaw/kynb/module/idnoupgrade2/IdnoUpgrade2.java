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
	 * ��һ����ı���
	 */
	private Object[] mTableTitle1;
	/**
	 * ��һ���������
	 */
	private Object[][] mTableData1;

	/**
	 * �ڶ�����ı���
	 */
	private Object[] mTableTitle15To18;
	
	/**
	 * ��������ı���
	 */
	private Object[] mTableTitleError;
	
	

	/**
	 * �����������
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
			//�Ƿ���Ȩ
			JOptionPane.showConfirmDialog(null, StringConstant.isNotAuthMsg,
					"ϵͳ��ʾ", JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		this.setSize(900, 600);
		this.setLocation(200, 100);
		this.setTitle("���֤������֤�����");
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
	 * �м����
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
		jPanel11.add(new JLabel("ѡ�����֤�У�"));
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
		jPanel32.add(new JLabel("���֤�������ݣ�"));
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
		jPanel42.add(new JLabel("���֤15λ�������ݣ�"));
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
		jPanel52.add(new JLabel("���֤�������ݣ�"));
		jPanel52.add(jLableDataError);
		jPanel5.add(jScrollPane5, BorderLayout.CENTER);
		jPanel5.add(jPanel51, BorderLayout.SOUTH);
		jPanel5.add(jPanel52, BorderLayout.NORTH);


		// �ײ��������============start

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
		
		// �ײ��������============end

		

		JSplitPane jSplitPaneCenter = new JSplitPane(
				JSplitPane.VERTICAL_SPLIT, jPanel1, jSplitPane12);
		jSplitPaneCenter.setDividerLocation(300);

		return jSplitPaneCenter;
	}

	private JButton getJButtonSelect1() {

		final JButton jButton = new JButton();
		jButton.setText("��Excel");
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
		jButton.setText("ִ�м�����֤����");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				//�ڴ˴��������֤������������
				actionIDNoCheck(jButton);
			}
		});

		return jButton;
	}

	private JButton getJButtonExport1() {

		final JButton jButton = new JButton();
		jButton.setText("������������");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle1,exportTable1,progressBar3,"���֤�˶�-������������",jButton);
			}
		});

		return jButton;
	}

	private JButton getJButtonExport2() {

		final JButton jButton = new JButton();
		jButton.setText("����15λ��������");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitle15To18,exportTable2,progressBar4,"���֤�˶�-����15λ��������",jButton);
			}
		});

		return jButton;
	}

	private JButton getJButtonExport3() {

		final JButton jButton = new JButton();
		jButton.setText("������������");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSaveToExce(mTableTitleError,exportTable3,progressBar5,"���֤�˶�-������������",jButton);
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
						//���Ʊ�ͷ
						mTableTitle15To18 = new Object[mTableTitle1.length+1];
						for(int i=0;i<mTableTitle1.length;i++){
							mTableTitle15To18[i] = mTableTitle1[i];
						}
						mTableTitle15To18[mTableTitle1.length] = "������ĺ���";
					}
					
					if(mTableTitleError == null){
						//���Ʊ�ͷ
						mTableTitleError = new Object[mTableTitle1.length+1];
						for(int i=0;i<mTableTitle1.length;i++){
							mTableTitleError[i] = mTableTitle1[i];
						}
						mTableTitleError[mTableTitle1.length] = "������Ϣ";
					}
					
					jLableDataNormal.setText("�� "+exportTable1.length + " ��");
					jLableDataUpgrade.setText("�� "+exportTable2.length + " ��");
					jLableDataError.setText("�� "+exportTable3.length + " ��");
					
					{//ԭ���������
						DefaultTableModel model = new DefaultTableModel(mTableData1,
								mTableTitle1);
						GppStyleTable jTable = new GppStyleTable(model);
						jTable.setRowHeight(22);

						jScrollPane1.setViewportView(jTable);
						jTable.updateUI();
					}
					
					{//�����������
						
						DefaultTableModel model = new DefaultTableModel(exportTable1,
								mTableTitle1);
						GppStyleTable jTable = new GppStyleTable(model);
						jTable.setRowHeight(22);

						jScrollPane3.setViewportView(jTable);
						jTable.updateUI();
					}
					
					{//����15λ��18λ������
						DefaultTableModel model = new DefaultTableModel(exportTable2,
								mTableTitle15To18);
						GppStyleTable jTable = new GppStyleTable(model);
						jTable.setRowHeight(22);

						jScrollPane4.setViewportView(jTable);
						jTable.updateUI();
					}
					
					{//�������ݱ�
						DefaultTableModel model = new DefaultTableModel(exportTable3,
								mTableTitleError);
						GppStyleTable jTable = new GppStyleTable(model);
						jTable.setRowHeight(22);

						jScrollPane5.setViewportView(jTable);
						jTable.updateUI();
					}
				}
				
			};
			
			//ִ�����֤��������
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
				String tempMSG = "�ɹ���������"+path;
				 Toolkit.getDefaultToolkit().beep();
				 JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
				 JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
			}
			
		};
		Date date = new Date();
		
		 String excelFile = "OutPut\\" + filename + "-"
		 + DateUtils.DATA_FORMAT.format(date) + ".xls";
		 
		 //����excel����
		ProgressExportExcel p = new ProgressExportExcel(progressBar, button, excelFile);
		p.setExportListener(exportListener);
		p.setTitle(exportTitle);
		p.setData(exportTable);
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
	private void importExcel1(String excelPath, JButton jButton) {

		progressBar1.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBar1.setIndeterminate(false); // ȷ�����ȵĽ�����

		jComboBox1.removeAllItems();
		
		//����excel����
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
