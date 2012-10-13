/**
 * 
 */
package com.gopawpaw.kynb.module.search;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.frame.widget.GJComboBox;
import com.gopawpaw.frame.widget.GJTextField;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.common.ExcelExportListener;
import com.gopawpaw.kynb.common.ProgressExportExcel;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.utils.DateUtils;
import com.gopawpaw.kynb.utils.Tools;
import com.gopawpaw.kynb.widget.GppStyleTable;

/**
 * @version 2012-8-9
 * @author Jason
 */
public class SearchFrame extends BaseModuleFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JScrollPane jScrollPane1 = null;

	
	private JTextField mJTextICEdit;
	private JTable jTableVillager = null;
	private DefaultTableModel mVillagerModel;
	private String[] mVillagerTableTitle;
	private String[][] mVillagerData;
	private Object[][] mVillagerDataObj;
	private DataOpertor mXXDB = new DataOpertor();
	
	private JLabel jLabelResultCount = new JLabel("");
	
	private int mSelectItem = 0;
	
	private JProgressBar progressBar = new JProgressBar();
	public SearchFrame() {
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
		this.setTitle("�������ݲ�ѯ");
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
	private JPanel getJPanelCenter() {

		jScrollPane1 = new JScrollPane();
		
		jScrollPane1.setViewportView(getJTableVillager());
		
		mJTextICEdit = new GJTextField() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean actionF4() {
				mJTextICEdit.setText("");
				return true;
			};

			public boolean actionEnter() {
				refreshTableVillager(mSelectItem,mJTextICEdit.getText());
				return true;
			};
		};
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new BorderLayout());
		JPanel jPanel11 = new JPanel();
		jPanel11.setLayout(new BoxLayout(jPanel11, BoxLayout.X_AXIS));
		jPanel11.add(new JLabel("��ѡ���ѯ���ͣ�"));
		jPanel11.add(getTypeComboBox());
		jPanel11.add(new JLabel("�������ѯ���ݣ�"));
		jPanel11.add(mJTextICEdit);
		jPanel11.add(jLabelResultCount);
		jPanel11.add(getJButtonSearch());
		
		jPanel1.add(jScrollPane1, BorderLayout.CENTER);
		jPanel1.add(jPanel11, BorderLayout.NORTH);
		jPanel1.add(progressBar, BorderLayout.SOUTH);
		

		return jPanel1;
	}

	private GJComboBox getTypeComboBox() {
		final GJComboBox jComboBox = new GJComboBox();
		jComboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String item = (String) jComboBox.getSelectedItem();
				if("����ݺ�".equals(item)){
					mSelectItem = DataOpertor.KEY_IC;
				}else if("������".equals(item)){
					mSelectItem = DataOpertor.KEY_NAME;
				}else if("��ַ".equals(item)){
					mSelectItem = DataOpertor.KEY_ADDRESS;
				}
			}
		});
		
		jComboBox.addItem("����ݺ�");
		jComboBox.addItem("������");
		jComboBox.addItem("��ַ");
		return jComboBox;
	}
	
	private JButton getJButtonExport() {

		final JButton jButton = new JButton();
		jButton.setText("�������");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {

				JFileChooser jFileChooser = new JFileChooser();
				
				int returnVal = jFileChooser.showSaveDialog(jButton);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					// ��ȡҪ������ļ�
					File file = jFileChooser.getSelectedFile();
					if(file == null || !file.isFile()){
						JOptionPane.showConfirmDialog(jButton, "�����뱣���ļ�����");
						return;
					}
					actionSaveToExce(mVillagerTableTitle,mVillagerDataObj,progressBar,file.getPath(),jButton);
				}
				
			}
		});
		return jButton;
	}
	
	private JButton getJButtonSearch() {

		final JButton jButton = new JButton();
		jButton.setText("��ѯ");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				refreshTableVillager(mSelectItem,mJTextICEdit.getText());
			}
		});
		return jButton;
	}
	
	private JTable getJTableVillager() {
		if (jTableVillager == null) {

			// �����б���(��ͷ)
			// String[] columnName = {
			// "���","����","�Ա�","���֤��","����","��������","�־�ס��ַ","��������","�����˻�","����ɷѵ���","��Ա���","�α�ʱ��","�������λ��","��ũ���ʻ����","�μ���ũ����־","��������","�������֤��","�뻧�����ϵ","�Ļ��̶�","��60�겻��15��ɷѱ�־","��ϵ�绰","����״��","������ò","��ϵ��","ͨѶ��ַ","��������","��ת��Ա��־","�Ͷ�ģ��","�籣�˺�","��������","״̬","��ע"};
			mVillagerTableTitle = new String[] {
					Villager.tab_v_id, 
					Villager.tab_v_name, 
					Villager.tab_v_sex,
					Villager.tab_v_ic, 
					Villager.tab_v_nation, 
					Villager.tab_v_birthday,
					Villager.tab_v_address_live,
					Villager.tab_v_bank_name,
					Villager.tab_v_bank_account,
					Villager.tab_v_bank_account_name,
					Villager.tab_v_bank2_name,
					Villager.tab_v_bank2_account,
					Villager.tab_v_bank2_account_name,
					Villager.tab_v_capture_expend_calss,
					Villager.tab_v_type,
					Villager.tab_v_join_time,
					Villager.tab_v_archival_location,
					Villager.tab_v_old_balance,
					Villager.tab_v_old_balance_flag,
					Villager.tab_v_householder_name,
					Villager.tab_v_householder_ic,
					Villager.tab_v_householder_relation,
					Villager.tab_v_standard_culture,
					Villager.tab_v_60not_enough15_flag,
					Villager.tab_v_phone_num,
					Villager.tab_v_marital_status,
					Villager.tab_v_politics_status,
					Villager.tab_v_contact_name,
					Villager.tab_v_address_com,
					Villager.tab_v_address_zip_code,
					Villager.tab_v_soldie_flag,
					Villager.tab_v_model_worker,
					Villager.tab_v_social_security_num,
					Villager.tab_v_begin_get_date,
					Villager.tab_v_status,
					Villager.tab_v_mark,
					Villager.tab_v_mark2,
					Villager.tab_t_name};
			
			// ��ʼ�����
			mVillagerModel = new DefaultTableModel(mVillagerData,
					mVillagerTableTitle);
			jTableVillager = new GppStyleTable(mVillagerModel);
			jTableVillager.setRowHeight(22);

//			refreshTableVillager();
		}
		return jTableVillager;
	}
	
	private void refreshTableVillager() {
		refreshTableVillager(DataOpertor.KEY_ALL,"");
	}

	private void refreshTableVillager(int key , String str) {
		try {

			mVillagerData = mXXDB.getVillagerAll(key, str);

			if (mVillagerData == null) {
				return;
			}
			mVillagerDataObj = getVilagerData(mVillagerData);

			DefaultTableModel model = new DefaultTableModel(mVillagerDataObj,
					mVillagerTableTitle);
			((GppStyleTable) jTableVillager).updateModel(model);

			jLabelResultCount.setText("����" + mVillagerData.length + "��");
			jTableVillager.repaint();
			jTableVillager.updateUI();
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * �ڵ�һ�м��� ѡ�����
	 * 
	 * @version 2012-5-8
	 * @author Jason
	 * @param
	 * @return Object[][]
	 */
	private Object[][] getVilagerData(String[][] objects) {
		
		if(true){
			return objects;
		}
		Object[][] ret = new Object[objects.length][];

		for (int row = 0; row < objects.length; row++) {

			String[] ss = objects[row];
			Object[] m = new Object[ss.length + 1];

			m[0] = Boolean.FALSE;
			for (int i = 0; i < ss.length; i++) {
				m[i + 1] = ss[i];
			}

			ret[row] = m;
		}
		return ret;
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
		
		 
		 //����excel����
		ProgressExportExcel p = new ProgressExportExcel(progressBar, button, filename);
		p.setExportListener(exportListener);
		p.setTitle(exportTitle);
		p.setData(exportTable);
		p.start();


	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();

				SearchFrame thisClass = new SearchFrame();
				thisClass.showWithFrame();
			}
		});
	}

}
