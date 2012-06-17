/**
 * 
 */
package com.gopawpaw.kynb.module.basicdataimport;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.BorderFactory;
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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.widget.GJComboBox;
import com.gopawpaw.frame.widget.GJTable;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.common.ExcelExportListener;
import com.gopawpaw.kynb.common.ExcelFileFilter;
import com.gopawpaw.kynb.common.ExcelImportListener;
import com.gopawpaw.kynb.common.ProgressExportExcel;
import com.gopawpaw.kynb.common.ProgressImportExcel;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.utils.StringConstant;
import com.gopawpaw.kynb.widget.GppStyleTable;

/**
 * �������ݵ���ģ��
 * @version 2012-5-9
 * @author Jason
 */
public class BasicDataImport extends BaseModuleFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * ִ�е������
	 */
	private JProgressBar progressBarImport = new JProgressBar();
	
	/**
	 * ���ݿ��
	 */
	private JTable jTableDB = null;
	
	/**
	 * excel��
	 */
	private JTable jTableExcel = null;
	
	/**
	 * �������
	 */
	private JPanel jPanelCondition = null;
	
	/**
	 * ѡ�����ݿ��
	 */
	private GJComboBox jComboBoxDBTable = null;
	
	private JTextField mJTextExcelPath = new JTextField();
	
	private JScrollPane jScrollPane11 = new JScrollPane();
	private JScrollPane jScrollPane12 = new JScrollPane();
	private JScrollPane jScrollPane2 = new JScrollPane();
	private JScrollPane jScrollPane3 = new JScrollPane();
	
	private Object[] mTableTitle ;
	private Object[][] mTableData ;
	
	private HashMap<String,GJComboBox> mMap = new HashMap<String,GJComboBox>();
	
	/**
	 * ��ǰ��excel�ֶ��б�
	 */
	private ArrayList<ExcelFieldItem> mExcelFieldItemList;
	
	/**
	 * ��ǰѡ������ݿ�����
	 */
	private DBTableItem mDBTableItem;
	
	/**
	 * ִ�е��밴ť
	 */
	private JButton jButtonActionImport;
	
	private JPanel mJPanelSelectTop;
	
	private JPanel jPanelOK = new JPanel();
	
	private JPanel jPanelError = new JPanel();
	
	private Object[][] errorData;
	
	private Object[][] okData;
	
	public BasicDataImport() {
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
		this.setTitle("�������ݵ���");
		this.setContentPane(getJContentPanel());
	}
	
	private JPanel getJContentPanel() {
		JPanel jContentPane = new JPanel();
		jContentPane.setLayout(new BorderLayout());
		
		jContentPane.add(getJPanelCenter(), BorderLayout.CENTER);
		jContentPane.add(progressBarImport, BorderLayout.SOUTH);
		
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
	private JPanel getJPanelCenter() {
		
		
		
		jScrollPane2.setViewportView(getjPanelCondition());
		jScrollPane3.setViewportView(getjTableExcel());
		//===========================
		//�ɹ��������
		JPanel jPanel11 = new JPanel();
		jPanel11.setLayout(new BorderLayout());
		//ʧ���������
		JPanel jPanel12 = new JPanel();
		jPanel12.setLayout(new BorderLayout());
		
		jPanelOK.setLayout(new BoxLayout(jPanelOK, BoxLayout.X_AXIS));
		jPanelOK.setVisible(false);
		
		jPanelError.setLayout(new BoxLayout(jPanelError, BoxLayout.X_AXIS));
		jPanelError.setVisible(false);
		
		jPanel11.add(new JLabel("�ɹ������б�"), BorderLayout.NORTH);
		jPanel11.add(jScrollPane11, BorderLayout.CENTER);
		jPanel11.add(jPanelOK, BorderLayout.SOUTH);
		
		jPanel12.add(new JLabel("ʧ�������б�"), BorderLayout.NORTH);
		jPanel12.add(jScrollPane12, BorderLayout.CENTER);
		jPanel12.add(jPanelError, BorderLayout.SOUTH);
		
		//�ɹ�ʧ��Split���
		JSplitPane jSplitPane0 = new JSplitPane(
				JSplitPane.VERTICAL_SPLIT, jPanel11, jPanel12);
		jSplitPane0.setDividerLocation(250);
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new BorderLayout());
		jPanel1.add(jSplitPane0, BorderLayout.CENTER);
		JPanel jPanelC1 = new JPanel();
		jPanel1.add(jPanelC1, BorderLayout.NORTH);
		jPanelC1.setLayout(new BoxLayout(jPanelC1, BoxLayout.X_AXIS));
		jPanelC1.setAlignmentX(0);
		jPanelC1.add(new JLabel("  ѡ��������ݿ��"));
		jPanelC1.add(getjComboBoxDBTable());
		
		final JButton button00 = new JButton("�������ɹ����ݵ�Excel");
		button00.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				JFileChooser jFileChooser = new JFileChooser();
				
				int returnVal = jFileChooser.showSaveDialog(button00);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					// ��ȡҪ������ļ�
					File file = jFileChooser.getSelectedFile();
					actionSaveOK(file.getPath());
				}
			}
		});
		jPanelOK.add(button00);
		
		final JButton button0 = new JButton("�������ʧ�����ݵ�Excel");
		button0.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				JFileChooser jFileChooser = new JFileChooser();
				
				int returnVal = jFileChooser.showSaveDialog(button0);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					// ��ȡҪ������ļ�
					File file = jFileChooser.getSelectedFile();
					actionSaveError(file.getPath());
				}
			}
		});
		jPanelError.add(button0);
		//===========================
		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new BorderLayout());
		jPanel2.add(jScrollPane2, BorderLayout.CENTER);
		
		//===========================
		JPanel jPanel3 = new JPanel();
		jPanel3.setLayout(new BorderLayout());
		jPanel3.add(jScrollPane3, BorderLayout.CENTER);
		// ѡ���ļ�
		JPanel jPanelC2 = new JPanel();
		jPanel3.add(jPanelC2, BorderLayout.NORTH);
		
		jPanelC2.setLayout(new BoxLayout(jPanelC2, BoxLayout.X_AXIS));
		jPanelC2.setAlignmentX(0);

		JButton button = new JButton("��excel");
		button.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				JFileChooser jFileChooser = new JFileChooser();

				jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				jFileChooser.setFileFilter(new ExcelFileFilter());
				jFileChooser.showOpenDialog(null);

				if (jFileChooser.getSelectedFile() != null) {
					String ph = jFileChooser.getSelectedFile()
							.getAbsolutePath();

					mJTextExcelPath.setText(ph);
					openExcel(ph);
				}
			}
		});
		jPanelC2.add(button);
		jPanelC2.add(mJTextExcelPath);
		//===========================
		
		JSplitPane jSplitPaneCenter = new JSplitPane(
				JSplitPane.HORIZONTAL_SPLIT, jPanel1, jPanel2);
		jSplitPaneCenter.setDividerLocation(400);
		
		JSplitPane jSplitPaneCenter2 = new JSplitPane(
				JSplitPane.HORIZONTAL_SPLIT, jSplitPaneCenter, jPanel3);
		jSplitPaneCenter2.setDividerLocation(600);
		
		JPanel jContentPane = new JPanel();
		jContentPane.setLayout(new BorderLayout());
		
		jContentPane.add(jSplitPaneCenter2, BorderLayout.CENTER);
		
		return jContentPane;
	}
	
	public JTable getjTableDB() {
		if (jTableDB == null) {

			jTableDB = new GppStyleTable();
		}
		return jTableDB;
	}
	
	public JTable getjTableExcel() {
		if (jTableExcel == null) {
			jTableExcel = new GppStyleTable();
		}
		return jTableExcel;
	}
	
	public JPanel getjPanelCondition() {
		if(jPanelCondition == null){
			
			jPanelCondition = new JPanel();
			jPanelCondition.setLayout(new BorderLayout());
			
			jButtonActionImport = new JButton(" ִ�е��� ");
			jButtonActionImport.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					actionImportDB();
				}
			});
			
			mJPanelSelectTop = new JPanel();
			mJPanelSelectTop.setLayout(new BoxLayout(mJPanelSelectTop, BoxLayout.Y_AXIS));
			mJPanelSelectTop.add(new JLabel("�����Ӧ��ϵ��"));
			mJPanelSelectTop.add(new JLabel("�����ݿ��ֶΡ� = ��Excel�е��ֶΡ�"));
			mJPanelSelectTop.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
			jPanelCondition.add(mJPanelSelectTop, BorderLayout.NORTH);
			jPanelCondition.add(jButtonActionImport, BorderLayout.SOUTH);
		}
		return jPanelCondition;
	}
	
	/**
	 * ��excel
	 * @version 2012-5-9
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void openExcel(String excelPath) {

		progressBarImport.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBarImport.setIndeterminate(false); // ȷ�����ȵĽ�����
		//����excel����
		ProgressImportExcel p = new ProgressImportExcel(progressBarImport,excelPath);
		p.setImportListener(new ExcelImportListener() {

			@Override
			public void onImprotFinish(Object[] title, Object[][] data,
					GJTable table) {
				// TODO Auto-generated method stub
				mTableTitle = title;
				mTableData = data;
				jScrollPane3.setViewportView(table);
				table.updateUI();
				initExcelFieldItemList();
				refreshTablePanel();
			}
		});

		p.start();
	}
	
	/**
	 * ִ�б��浼��
	 * @version 2012-5-11
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void actionSaveOK(String path){
		if(!path.endsWith(".xls")){
			path = path+".xls";
		}
		ProgressExportExcel pee = new ProgressExportExcel(progressBarImport,path);
		pee.setExportListener(new ExcelExportListener() {
			
			@Override
			public void onExprotFinish(String path, int count) {
				// TODO Auto-generated method stub
				String tempMSG = "�ɹ����浽��"+path;
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
			}
		});
		pee.setTitle(mTableTitle);
		pee.setData(okData);
		pee.start();
	}
	
	/**
	 * ִ�б��浼��
	 * @version 2012-5-11
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void actionSaveError(String path){
		if(!path.endsWith(".xls")){
			path = path+".xls";
		}
		ProgressExportExcel pee = new ProgressExportExcel(progressBarImport,path);
		pee.setExportListener(new ExcelExportListener() {
			
			@Override
			public void onExprotFinish(String path, int count) {
				// TODO Auto-generated method stub
				String tempMSG = "�ɹ����浽��"+path;
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
			}
		});
		pee.setTitle(mTableTitle);
		pee.setData(errorData);
		pee.start();
	}
	/**
	 * ��ʼ��excel�ֶ����б�
	 * @version 2012-5-10
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void initExcelFieldItemList(){
		if(mTableTitle == null || mTableTitle.length<=0){
			return;
		}
		
		if(mExcelFieldItemList == null){
			mExcelFieldItemList = new ArrayList<ExcelFieldItem>();
		}
		mExcelFieldItemList.clear();
		for(int i=0;i<mTableTitle.length;i++){
			
			ExcelFieldItem efi = new ExcelFieldItem();
			efi.index = i;
			efi.name = (String) mTableTitle[i];
			mExcelFieldItemList.add(efi);
		}
		
	}
	
	/**
	 * @version 2012-5-9
	 * @author Jason
	 * @param
	 * @return void
	 */
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				
				BasicDataImport thisClass = new BasicDataImport();
				thisClass.showWithFrame();
			}
		});
	}

	public GJComboBox getjComboBoxDBTable() {
		
		if(jComboBoxDBTable == null){
			jComboBoxDBTable = new GJComboBox();
			jComboBoxDBTable.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					mDBTableItem = (DBTableItem) jComboBoxDBTable.getSelectedItem();
					refreshTablePanel();
				}
			});
			List<DBTableItem> list = DBOpertor.getImportTableItem();
			for(DBTableItem table:list){
				
				jComboBoxDBTable.addItem(table);
			}
		}
		return jComboBoxDBTable;
	}

	/**
	 * ˢ�±��ֶ�ѡ�����
	 * @version 2012-5-10
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void refreshTablePanel(){
		if(mDBTableItem == null){
			return;
		}
		
		if(mExcelFieldItemList == null || mExcelFieldItemList.size()<=0){
			return;
		}
		mMap.clear();
		
		JPanel jPanelC = new JPanel();
		jPanelC.setLayout(new BoxLayout(jPanelC, BoxLayout.Y_AXIS));
		jPanelCondition.removeAll();
		
		List<String> listS = mDBTableItem.getTableFieldSelect();
		for(String name:listS){
			
			String display = mDBTableItem.getFieldDisplay(name);
			jPanelC.add(getJPanelForFieldSelect(name,display));
		}
		
		jPanelC.add(mJPanelSelectTop);
		List<String> list = mDBTableItem.getTableFieldImport();
		for(String name:list){
			String display = mDBTableItem.getFieldDisplay(name);
			jPanelC.add(getJPanelForField(name,display));
		}
		
		
		
		jPanelCondition.add(jPanelC, BorderLayout.NORTH);
		jPanelCondition.add(jButtonActionImport, BorderLayout.SOUTH);
		jPanelCondition.updateUI();
	}
	
	/**
	 * ��ȡѡ���������
	 * @version 2012-6-17
	 * @author Jason
	 * @param
	 * @return JPanel
	 */
	private JPanel getJPanelForFieldSelect(String fieldName,String fieldDisplay){
		JPanel jPanelC1 = new JPanel();
		jPanelC1.setLayout(new BoxLayout(jPanelC1, BoxLayout.X_AXIS));
		jPanelC1.add(new JLabel(fieldDisplay+" = "));
		jPanelC1.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		
		if("printData".equals(mDBTableItem.getTableName())){
			jPanelC1.add(getJComboBoxThorp(fieldName));
		}
		
		return jPanelC1;
	}
	
	/**
	 * ��ȡ�����Ӧ�������
	 * @version 2012-6-17
	 * @author Jason
	 * @param
	 * @return JPanel
	 */
	private JPanel getJPanelForField(String fieldName,String fieldDisplay){
		JPanel jPanelC1 = new JPanel();
		jPanelC1.setLayout(new BoxLayout(jPanelC1, BoxLayout.X_AXIS));
		jPanelC1.add(new JLabel(fieldDisplay+" = "));
		jPanelC1.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		GJComboBox comb = new GJComboBox();
		mMap.put(fieldName, comb);
		
		ExcelFieldItem efi = new ExcelFieldItem();
		efi.index = -1;
		efi.name = "";
		comb.addItem(efi);
		for(ExcelFieldItem item:mExcelFieldItemList){
			comb.addItem(item);
		}
		
		jPanelC1.add(comb);
		
		return jPanelC1;
	}
	
	class ExcelFieldItem{
		int index;
		String name;
		@Override
		public String toString() {
			if(index == -1){
				return "";
			}
			return "[" + index +"]" + "[" + name +"]";
		}
		
	}
	
	/**
	 * ִ�е������ݿ�
	 * @version 2012-5-10
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void actionImportDB(){
		if(mMap == null || mMap.isEmpty()){
			return;
		}
		
		List<String> list = mDBTableItem.getTableFieldImport();
		for(String name:list){
			//�����ֶζ�Ӧ������ϵ
			GJComboBox combo = (GJComboBox)mMap.get(name);
			ExcelFieldItem efi = (ExcelFieldItem)combo.getSelectedItem();
			mDBTableItem.putFieldToIndex(name, efi.index);
		}
		
		progressBarImport.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBarImport.setIndeterminate(false); // ȷ�����ȵĽ�����
		progressBarImport.setMaximum(mTableData.length);
		DBOpertor db = new DBOpertor();
		db.importToBasicData(mDBTableItem, mTableData, mDataImportListener);
		
	}
	
	/**
	 * ѡ���
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JComboBox
	 */
	private JComboBox getJComboBoxThorp(final String fieldName) {
		final JComboBox	jComboBoxThorp = new GJComboBox();
			// jComboBoxThorp.setPreferredSize(new Dimension(200,20));
			// jComboBoxThorp.setMinimumSize(new Dimension(200,20));
			jComboBoxThorp.setEditable(false);

			jComboBoxThorp
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							Thorp currThorp = (Thorp) jComboBoxThorp
									.getSelectedItem();
							mDBTableItem.putTableFiledDef(fieldName,currThorp.getT_id());

						}
					});

			XXNCYLBXDBAccess mXXDB = new XXNCYLBXDBAccess();
			List<Thorp> list = null;
			try {
				jComboBoxThorp.removeAllItems();
				list = mXXDB.getThorpAll();
				for (Thorp th : list) {
					jComboBoxThorp.addItem(th);
				}
			} catch (DBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		return jComboBoxThorp;
	}
	
	private DataImportListener mDataImportListener = new DataImportListener(){
		int ok_count = 0;
		int false_count = 0;
		ArrayList<Object[]> listOK = new ArrayList<Object[]>();
		ArrayList<Object[]> listError = new ArrayList<Object[]>();
		@Override
		public void onImportProgress(int i, Object[] data, int state) {
			// TODO Auto-generated method stub
			i=i+1;
			if(i == 1){
				ok_count = 0;
				false_count = 0;
				listOK.clear();
				listError.clear();
				jPanelOK.setVisible(false);
				jPanelError.setVisible(false);
			}
			if(state == STATE_OK){
				ok_count++;
				listOK.add(data);
			}else if(state == STATE_FLASE){
				false_count++;
				listError.add(data);
			}
			
			progressBarImport.setString("���ȣ�" + (i) + "/" + mTableData.length + " �ɹ���"+ok_count + " ʧ�ܣ�"+false_count);
			progressBarImport.setValue(i); // ����ֵ
			
			if(i == mTableData.length){
				finish();
				
			}
		}
		
		public void finish(){
			
			String tempMSG = "������ɣ�";
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
					JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
			
			if(false_count > 0){
				
				jPanelError.setVisible(true);
			}
			
			if(ok_count > 0){
				
				jPanelOK.setVisible(true);
			}
			
			int size0 = listOK.size();
			okData = new Object[size0][];
			
			for(int i=0;i<size0;i++){
				okData[i] = listOK.get(i);
			}
			
			int size = listError.size();
			errorData = new Object[size][];
			
			for(int i=0;i<size;i++){
				errorData[i] = listError.get(i);
			}
			
			DefaultTableModel modelOK = new DefaultTableModel(okData, mTableTitle);
			GppStyleTable jTableOK = new GppStyleTable(modelOK);
			jTableOK.setRowHeight(22);
			
			jScrollPane11.setViewportView(jTableOK);
			
			DefaultTableModel model = new DefaultTableModel(errorData, mTableTitle);
			GppStyleTable jTable = new GppStyleTable(model);
			jTable.setRowHeight(22);
			
			jScrollPane12.setViewportView(jTable);

		}
		
	};
}
