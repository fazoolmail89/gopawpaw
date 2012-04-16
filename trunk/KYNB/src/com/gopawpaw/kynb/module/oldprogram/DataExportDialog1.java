/**
 * 
 */
package com.gopawpaw.kynb.module.oldprogram;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import com.gopawpaw.java.awt.GppDialog;
import com.gopawpaw.javax.swing.GppJCheckBox;
import com.gopawpaw.javax.swing.GppJComboBox;
import com.gopawpaw.kynb.bean.DefultData;
import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.ExcelAccess;
import com.gopawpaw.kynb.db.ExportExcelListener;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;
import com.gopawpaw.kynb.utils.DateUtils;

/**
 * @version 2011-12-17
 * @author Jason
 */
public class DataExportDialog1 extends GppDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private GppJComboBox jComboBoxThorp;

	private Thorp mCurrentThorp;

	private XXNCYLBXDBAccess mXXDB = new XXNCYLBXDBAccess();

	private JProgressBar progressBar = new JProgressBar();

	private JButton jButtonConfirm;

	private HashMap<String, Object> hashMap;
	
	private String dataType = "a";

	public DataExportDialog1(Frame owner, Thorp currentThorp) {
		super(owner);
		this.mCurrentThorp = currentThorp;
		init();
	}

	private void init() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				DataExportDialog1.this.setVisible(false);
			}
		});

		this.setModal(true);
	}

	@Override
	public void setVisible(boolean arg0) {
		super.setTitle("������" + mCurrentThorp.getT_name());
		this.setSize(400, 400);

		this.setLocation(this.getOwner().getLocation().x
				+ this.getOwner().getSize().width / 3, this.getOwner()
				.getLocation().y + this.getOwner().getSize().height / 4);

		this.add(getJContentPane());

		super.setVisible(arg0);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		JPanel jContentPane = new JPanel();
		jContentPane.setLayout(new BorderLayout());
		JPanel jPanelBottom = new JPanel();
		jPanelBottom.setLayout(new BoxLayout(jPanelBottom, BoxLayout.Y_AXIS));
		jPanelBottom.add(getJButtonExport());
		jPanelBottom.add(progressBar);

		jContentPane.add(getJPanelTop(), BorderLayout.NORTH);
		jContentPane.add(getJScrollView(), BorderLayout.CENTER);
		jContentPane.add(jPanelBottom, BorderLayout.SOUTH);

		return jContentPane;
	}

	/**
	 * �������
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JSplitPane
	 */
	private JPanel getJPanelTop() {
		JPanel jPanelTop = new JPanel();
		jPanelTop.setLayout(new BoxLayout(jPanelTop, BoxLayout.X_AXIS));
		jPanelTop.setBorder(BorderFactory.createEmptyBorder(4, 0, 4, 0));

		JLabel jLabel = new JLabel("ѡ�����:   ");

		// JLabel jLabel2 = new JLabel("ѡ�񵼳����ݣ�");
		// jLabel2.setPreferredSize(new Dimension(30, 20));

		jPanelTop.add(jLabel);
		jPanelTop.add(getJComboBoxThorp());
		// jPanelTop.add(jLabel2);
		return jPanelTop;
	}

	/**
	 * ѡ���
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JComboBox
	 */
	private JComboBox getJComboBoxThorp() {
		if (jComboBoxThorp == null) {
			jComboBoxThorp = new GppJComboBox();
			// jComboBoxThorp.setPreferredSize(new Dimension(200,20));
			// jComboBoxThorp.setMinimumSize(new Dimension(200,20));
			jComboBoxThorp.setEditable(false);

			jComboBoxThorp
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							mCurrentThorp = (Thorp) jComboBoxThorp
									.getSelectedItem();
							DataExportDialog1.this.setTitle("������" + mCurrentThorp.getT_name());
						}
					});

			refreshThorpList();

			jComboBoxThorp.updateGppKeyListener();
		}

		return jComboBoxThorp;
	}

	private void refreshThorpList() {
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

		if (mCurrentThorp == null && list != null && list.size() > 0) {
			jComboBoxThorp.setSelectedIndex(0);
			mCurrentThorp = list.get(0);
		}

	}

	private JScrollPane getJScrollView() {
		JScrollPane jScrollPaneCenterLeft = new JScrollPane();

		jScrollPaneCenterLeft.setAutoscrolls(true);
		jScrollPaneCenterLeft
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		jScrollPaneCenterLeft.setAlignmentY(100);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
		jScrollPaneCenterLeft.setViewportView(jPanel);

		hashMap = new HashMap<String, Object>();
		 hashMap.put(Villager.tab_v_name,
		 getGppJCheckBoxNew(Villager.tab_v_name));
		hashMap.put(Villager.tab_v_sex, getGppJCheckBoxNew(Villager.tab_v_sex));
		hashMap.put(Villager.tab_v_birthday,
				getGppJCheckBoxNew(Villager.tab_v_birthday));
		
		hashMap.put(Villager.tab_v_address_live,
				getGppJCheckBoxNew(Villager.tab_v_address_live));
		hashMap.put(Villager.tab_v_nation,
				getGppJCheckBoxNew(Villager.tab_v_nation));
		hashMap.put(Villager.tab_v_bank2_name,
				getGppJCheckBoxNew(Villager.tab_v_bank2_name));
		hashMap.put(Villager.tab_v_bank2_account,
				getGppJCheckBoxNew(Villager.tab_v_bank2_account));
//		hashMap.put(Villager.tab_v_bank_account_name,
//				getGppJCheckBoxNew(Villager.tab_v_bank_account_name));
//		hashMap.put(Villager.tab_v_bank2_name,
//				getGppJCheckBoxNew(Villager.tab_v_bank2_name));
//		hashMap.put(Villager.tab_v_bank2_account,
//				getGppJCheckBoxNew(Villager.tab_v_bank2_account));
//		hashMap.put(Villager.tab_v_bank2_account_name,
//				getGppJCheckBoxNew(Villager.tab_v_bank2_account_name));
		hashMap.put(Villager.tab_v_capture_expend_calss,
				getGppJCheckBoxNew(Villager.tab_v_capture_expend_calss));
		hashMap.put(Villager.tab_v_type,
				getGppJCheckBoxNew(Villager.tab_v_type));
		hashMap.put(Villager.tab_v_join_time,
				getGppJCheckBoxNew(Villager.tab_v_join_time));
		hashMap.put(Villager.tab_v_archival_location,
				getGppJCheckBoxNew(Villager.tab_v_archival_location));
		hashMap.put(Villager.tab_v_old_balance,
				getGppJCheckBoxNew(Villager.tab_v_old_balance));
		hashMap.put(Villager.tab_v_old_balance_flag,
				getGppJCheckBoxNew(Villager.tab_v_old_balance_flag));
		hashMap.put(Villager.tab_v_householder_name,
				getGppJCheckBoxNew(Villager.tab_v_householder_name));
		hashMap.put(Villager.tab_v_householder_ic,
				getGppJCheckBoxNew(Villager.tab_v_householder_ic));
		hashMap.put(Villager.tab_v_householder_relation,
				getGppJCheckBoxNew(Villager.tab_v_householder_relation));
		hashMap.put(Villager.tab_v_standard_culture,
				getGppJCheckBoxNew(Villager.tab_v_standard_culture));
		hashMap.put(Villager.tab_v_60not_enough15_flag,
				getGppJCheckBoxNew(Villager.tab_v_60not_enough15_flag));
		hashMap.put(Villager.tab_v_phone_num,
				getGppJCheckBoxNew(Villager.tab_v_phone_num));
		hashMap.put(Villager.tab_v_marital_status,
				getGppJCheckBoxNew(Villager.tab_v_marital_status));
		hashMap.put(Villager.tab_v_politics_status,
				getGppJCheckBoxNew(Villager.tab_v_politics_status));
		hashMap.put(Villager.tab_v_contact_name,
				getGppJCheckBoxNew(Villager.tab_v_contact_name));
		hashMap.put(Villager.tab_v_address_com,
				getGppJCheckBoxNew(Villager.tab_v_address_com));
		hashMap.put(Villager.tab_v_address_zip_code,
				getGppJCheckBoxNew(Villager.tab_v_address_zip_code));
		hashMap.put(Villager.tab_v_soldie_flag,
				getGppJCheckBoxNew(Villager.tab_v_soldie_flag));
		hashMap.put(Villager.tab_v_model_worker,
				getGppJCheckBoxNew(Villager.tab_v_model_worker));
//		hashMap.put(Villager.tab_v_social_security_num,
//				getGppJCheckBoxNew(Villager.tab_v_social_security_num));
//		hashMap.put(Villager.tab_v_begin_get_date,
//				getGppJCheckBoxNew(Villager.tab_v_begin_get_date));
		hashMap.put(Villager.tab_v_mark,
				getGppJCheckBoxNew(Villager.tab_v_mark));
//		hashMap.put(Villager.tab_v_mark2,
//				getGppJCheckBoxNew(Villager.tab_v_mark2));

		ArrayList<DefultData> list = DataDefultManager.getInstance()
				.getEditOrder(hashMap);
		int size = list.size();
		for (int i = 0; i < size; i++) {
			DefultData dd = list.get(i);
			if (dd.getObj() instanceof GppJCheckBox) {
				GppJCheckBox temp = (GppJCheckBox) dd.getObj();
				jPanel.add(temp);
			}

		}

		return jScrollPaneCenterLeft;
	}

	private GppJCheckBox getGppJCheckBoxNew(String tab) {

		GppJCheckBox gcb = new GppJCheckBox(tab, true);
		gcb.setHorizontalAlignment(SwingConstants.RIGHT);
		gcb.setPreferredSize(new Dimension(150, 25));
		return gcb;
	}

	private JButton getJButtonExport() {

		jButtonConfirm = new JButton();
		jButtonConfirm.setText("����ѡ������");
		jButtonConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actoinExport();
			}
		});

		progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBar.setIndeterminate(false); // ȷ�����ȵĽ�����
		
		return jButtonConfirm;
	}

	private void actoinExport() {
		new Progress(progressBar, jButtonConfirm).start();
	}

	private List<Villager> selectExport(List<Villager> list){
		
		for(Villager v :list){
			
			Object obj = null;
			obj = hashMap.get(Villager.tab_v_name);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_name("");
			}
			
			obj = hashMap.get(Villager.tab_v_sex);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_sex("");
			}
			
			obj = hashMap.get(Villager.tab_v_birthday);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_birthday("");
			}
			
			obj = hashMap.get(Villager.tab_v_address_live);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_address_live("");
			}
			
			obj = hashMap.get(Villager.tab_v_nation);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_nation("");
			}
			
			obj = hashMap.get(Villager.tab_v_bank2_name);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_bank2_name("");
			}
			
			obj = hashMap.get(Villager.tab_v_bank2_account);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_bank2_account("");
			}
			
			obj = hashMap.get(Villager.tab_v_capture_expend_calss);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_capture_expend_calss("");
			}
			
			obj = hashMap.get(Villager.tab_v_type);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_type("");
			}
			
			obj = hashMap.get(Villager.tab_v_join_time);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_join_time("");
			}
			
			obj = hashMap.get(Villager.tab_v_archival_location);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_archival_location("");
			}
			
			obj = hashMap.get(Villager.tab_v_old_balance);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_old_balance("");
			}
			
			obj = hashMap.get(Villager.tab_v_old_balance_flag);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_old_balance_flag("");
			}
			
			obj = hashMap.get(Villager.tab_v_householder_name);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_householder_name("");
			}
			
			obj = hashMap.get(Villager.tab_v_householder_ic);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_householder_ic("");
			}
			
			obj = hashMap.get(Villager.tab_v_householder_relation);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_householder_relation("");
			}
			
			obj = hashMap.get(Villager.tab_v_standard_culture);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_standard_culture("");
			}
			
			obj = hashMap.get(Villager.tab_v_60not_enough15_flag);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_60not_enough15_flag("");
			}
			
			obj = hashMap.get(Villager.tab_v_phone_num);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_phone_num("");
			}
			
			obj = hashMap.get(Villager.tab_v_marital_status);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_marital_status("");
			}
			
			obj = hashMap.get(Villager.tab_v_politics_status);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_politics_status("");
			}
			
			obj = hashMap.get(Villager.tab_v_contact_name);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_contact_name("");
			}
			
			obj = hashMap.get(Villager.tab_v_address_com);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_address_com("");
			}
			
			obj = hashMap.get(Villager.tab_v_address_zip_code);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_address_zip_code("");
			}
			
			obj = hashMap.get(Villager.tab_v_soldie_flag);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_soldie_flag("");
			}
			
			obj = hashMap.get(Villager.tab_v_model_worker);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_model_worker("");
			}
			
			obj = hashMap.get(Villager.tab_v_mark);
			if(!((GppJCheckBox)obj).isSelected()){
				v.setV_mark("");
			}
			
		}
		
		return list;
	}

	class Progress extends Thread {// �Զ�����progress

		private JProgressBar progressBar;
		private JButton button;
		String excelFile;
		ExportExcelListener mExportExcelListener;
		public Progress(JProgressBar progressBar, JButton button) {
			this.progressBar = progressBar;
			this.button = button;

			Date date = new Date();

			if("a".equals(dataType)){
				excelFile = mCurrentThorp.getT_name() + "-��������-"
				+ DateUtils.DATA_FORMAT.format(date) + ".xls";
			}else{
				excelFile = mCurrentThorp.getT_name() + "-����������-"
				+ DateUtils.DATA_FORMAT.format(date) + ".xls";
			}
			
		}

		public void run() {
			try {
				button.setEnabled(false);
				List<Villager> list = mXXDB.getVillagerByThorp(
						mCurrentThorp.getT_id(), dataType);
				progressBar.setMaximum(list.size());
				
				mExportExcelListener = new ExportExcelListener(){

					@Override
					public void onExportProgress(int total, int current,
							boolean isOk) {
						// TODO Auto-generated method stub
						progressBar.setString("���ȣ�"+current+"/"+total);
						progressBar.setValue(1); // ����ֵ
						
						System.out.println(current);
					}
					
				};
				
				//����ѡ�е���������
				list = selectExport(list);
				
				ExcelAccess ea = new ExcelAccess(excelFile);
				ea.setExportExcelListener(mExportExcelListener);
				ea.setThorp(mCurrentThorp);
				ea.setVillagerList(list);
				if (ea.saveExcel(ExcelAccess.SAVE_VILLAGER)) {
					// �����ɹ�
					String tempMSG = "�ɹ��������ļ�:" + excelFile + " ";
					//������ʾ
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.INFORMATION_MESSAGE);

				} else {
					// ����ʧ��
					String tempMSG = "�������ļ�:" + excelFile + " ʧ�ܣ�";
					//������ʾ
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.ERROR_MESSAGE);
				}
			} catch (DBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			button.setEnabled(true); // ��ť����

		}
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

}
