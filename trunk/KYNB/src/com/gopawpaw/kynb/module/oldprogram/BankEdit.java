/**
 * 
 */
package com.gopawpaw.kynb.module.oldprogram;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.frame.widget.GJCheckBox;
import com.gopawpaw.frame.widget.GJComboBox;
import com.gopawpaw.kynb.bean.DefultData;
import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.common.DataDefultManager;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.ExcelAccess;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;
import com.gopawpaw.kynb.utils.DateUtils;
import com.gopawpaw.kynb.utils.IDNumberChecker;
import com.gopawpaw.kynb.widget.GppStyleTable;

/**
 * @version 2011-12-3
 * @author Jason
 */
public class BankEdit extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private XXNCYLBXDBAccess mXXDB = new XXNCYLBXDBAccess();
	
	private Thorp mThorp;
	private HashMap<String, Boolean> mDefultEditShow = DataDefultManager
	.getInstance().getmDefultEditShow();
	
	private Vector<String> mVillagerTableTitle = new Vector<String>(11);
	private Vector<Vector<Object>> mVillagerData = new Vector<Vector<Object>>(
			11);
	
	private JTable jTableVillager = null;
	private JLabel jLabelVillagerNormalCount = new JLabel();
	
	private GppJComboBoxExp jComboBox_ic = null;
	private GppJComboBoxExp jComboBox_name = null;
	private GppJComboBoxExp jComboBox_bank_name = null;
	private GppJComboBoxExp jComboBox_bank_account = null;
	private GppJComboBoxExp jComboBox_bank_account_name = null;
	private GppJComboBoxExp jComboBox_bank2_name = null;
	private GppJComboBoxExp jComboBox_bank2_account = null;
	private GppJComboBoxExp jComboBox_bank2_account_name = null;
	private GppJComboBoxExp jComboBox_mark = null;
	
	private JLabel jLabelStatusInfo = new JLabel();
	
	private Villager mCurrentVillager = new Villager();
	
	private String mStatusInfoEdit = "Enter=��һ���ֶΣ�Esc=��һ���ֶΣ�Up/Down=ѡ��Ԥ��ֵ��F2/pageDown/+=�޸ı���";

	
	public BankEdit( Thorp thorp) {
		mThorp = thorp;
		
		JPanel jPaneTop = new JPanel();
		jPaneTop.setLayout(new BoxLayout(jPaneTop, BoxLayout.X_AXIS));
		jPaneTop.add(getJButtonSaveBank());
		jPaneTop.add(getJButtonSaveToExcel0());
		
		JPanel jContentPane = new JPanel();
		jContentPane.setLayout(new BorderLayout());

		jContentPane.add(jPaneTop, BorderLayout.NORTH);
		jContentPane.add(getJPanelCenter(), BorderLayout.CENTER);
		jContentPane.add(jLabelStatusInfo, BorderLayout.SOUTH);
		
		setContentPane(jContentPane);
	}

	

	private JSplitPane getJPanelCenter() {
		
		//�ұ߱�����
		JScrollPane jScrollPaneRight = new JScrollPane();
		jScrollPaneRight.setViewportView(getJTableVillager());

		jScrollPaneRight.setAutoscrolls(true);
		jScrollPaneRight
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		//��߱༭���
		JScrollPane jScrollPaneLeft = new JScrollPane();
		jScrollPaneLeft.setViewportView(getJPanelDataEdit());

		jScrollPaneLeft.setAutoscrolls(true);
		jScrollPaneLeft
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		//�ָ����
			JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
					jScrollPaneLeft, jScrollPaneRight);
			jSplitPane.setDividerLocation(300);
			jSplitPane.setOneTouchExpandable(true);
			jSplitPane.setDividerSize(10);

		return jSplitPane;
	}
	
	private JTable getJTableVillager() {
		if (jTableVillager == null) {

			// �����б���(��ͷ)
			mVillagerTableTitle.add(Villager.tab_v_id);
			mVillagerTableTitle.add(Villager.tab_v_name);
			mVillagerTableTitle.add(Villager.tab_v_ic);
			mVillagerTableTitle.add(Villager.tab_v_bank_name);
			mVillagerTableTitle.add(Villager.tab_v_bank_account);
			mVillagerTableTitle.add(Villager.tab_v_bank_account_name);
			mVillagerTableTitle.add(Villager.tab_v_bank2_name);
			mVillagerTableTitle.add(Villager.tab_v_bank2_account);
			mVillagerTableTitle.add(Villager.tab_v_bank2_account_name);
			mVillagerTableTitle.add(Villager.tab_v_mark);
			// ��ʼ�����

			DefaultTableModel model = new DefaultTableModel(mVillagerData,
					mVillagerTableTitle);
			jTableVillager = new GppStyleTable(model) {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;


				public boolean actionUp() {
					int rowS = jTableVillager.getSelectedRow();
					if (rowS > 0) {
						rowS--;
					}
//					actionTableVillagerEdit(jTableVillager, rowS);

					return true;
				};

				public boolean actionDown() {
					int max = jTableVillager.getRowCount() - 1;
					int rowS = jTableVillager.getSelectedRow();
					if (rowS < max) {
						rowS++;
					}
//					actionTableVillagerEdit(jTableVillager, rowS);

					return true;
				};

			};
			jTableVillager.setRowHeight(22);

			jTableVillager.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					// System.out.println("mouseClicked()"); // TODO
					// Auto-generated Event stub mouseClicked()
					int rowS = jTableVillager.getSelectedRow();
					actionTableVillagerEdit(jTableVillager, rowS);
//					jLabelStatusInfo.setText(mStatusInfoTableNormal);
				}
			});

			refreshTableVillager();
		}
		return jTableVillager;
	}
	
	private void refreshTableVillager() {
		try {
			List<Villager> list = mXXDB.getVillagerByThorp(
					mThorp.getT_id(), "a");

			mVillagerData.removeAllElements();
			for (Villager v : list) {
				System.out.println(v);
				mVillagerData.add(getVillagerVector(v));
			}

			DefaultTableModel model = new DefaultTableModel(mVillagerData,
					mVillagerTableTitle);
			((GppStyleTable) jTableVillager).updateModel(model);

			jLabelVillagerNormalCount.setText("������" + list.size());
			jTableVillager.repaint();
			jTableVillager.updateUI();
		} catch (DBException e) {
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}
	}
	
	private Vector<Object> getVillagerVector(Villager v) {
		Vector<Object> rowdata = new Vector<Object>(33);
		rowdata.add("" + v.getV_id());
		rowdata.add(v.getV_name());
		rowdata.add(v.getV_ic());
		rowdata.add(v.getV_bank_name());
		rowdata.add(v.getV_bank_account());
		rowdata.add(v.getV_bank_account_name());
		rowdata.add(v.getV_bank2_name());
		rowdata.add(v.getV_bank2_account());
		rowdata.add(v.getV_bank2_account_name());
		rowdata.add(v.getV_mark());
		return rowdata;
	}
	
	/**
	 * ���ݱ༭���
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JPanel
	 */
	private JPanel getJPanelDataEdit() {
		JPanel jPanelDataEdit = new JPanel();
		jPanelDataEdit.setLayout(new BoxLayout(jPanelDataEdit,
					BoxLayout.Y_AXIS));

			jComboBox_ic = new GppJComboBoxExp(DataDefultManager.getInstance()
					.getDefultData(Villager.tab_v_ic)) {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public boolean actionEnter() {
					// TODO Auto-generated method stub
					super.actionEnter();
					String ic = getEditor().getItem().toString();

					selectEditVillager(ic);

					return true;
				}

			};

			jComboBox_name = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_name));
			jComboBox_bank_name = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_bank_name));
			jComboBox_bank_account = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_bank_account));
			jComboBox_bank_account_name = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_bank_account_name));
			jComboBox_bank2_name = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_bank2_name));
			jComboBox_bank2_account = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_bank2_account));
			jComboBox_bank2_account_name = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_bank2_account_name));
			jComboBox_mark = new GppJComboBoxExp(DataDefultManager
					.getInstance().getDefultData(Villager.tab_v_mark));

			
			// ����Ĭ��ֵΪ��������
			jPanelDataEdit.add(getJPanelNew(Villager.tab_v_ic, jComboBox_ic),
					null);
			jPanelDataEdit.add(
					getJPanelNew(Villager.tab_v_name, jComboBox_name), null);
			jPanelDataEdit
					.add(getJPanelNew(Villager.tab_v_bank_name,
							jComboBox_bank_name), null);
			jPanelDataEdit.add(
					getJPanelNew(Villager.tab_v_bank_account,
							jComboBox_bank_account), null);
			jPanelDataEdit.add(
					getJPanelNew(Villager.tab_v_bank_account_name,
							jComboBox_bank_account_name), null);
			jPanelDataEdit
					.add(getJPanelNew(Villager.tab_v_bank2_name,
							jComboBox_bank2_name), null);
			jPanelDataEdit.add(
					getJPanelNew(Villager.tab_v_bank2_account,
							jComboBox_bank2_account), null);
			jPanelDataEdit.add(
					getJPanelNew(Villager.tab_v_bank2_account_name,
							jComboBox_bank2_account_name), null);
			jPanelDataEdit.add(
					getJPanelNew(Villager.tab_v_mark, jComboBox_mark), null);

			// ����Enter��˳��
			jComboBox_ic.setFocusetNext(jComboBox_name);
			jComboBox_name.setFocusetNext(jComboBox_bank_name);
			jComboBox_bank_name.setFocusetNext(jComboBox_bank_account);
			jComboBox_bank_account.setFocusetNext(jComboBox_bank_account_name);
			jComboBox_bank_account_name.setFocusetNext(jComboBox_bank2_name);
			jComboBox_bank2_name.setFocusetNext(jComboBox_bank2_account);
			jComboBox_bank2_account.setFocusetNext(jComboBox_bank2_account_name);
			jComboBox_bank2_account_name.setFocusetNext(jComboBox_mark);
			jComboBox_mark.setFocusetNext(jComboBox_ic);

			// ����Esc��˳��
			jComboBox_name.setFocusetPre(jComboBox_ic);
			jComboBox_bank_name.setFocusetPre(jComboBox_name);
			jComboBox_bank_account.setFocusetPre(jComboBox_bank_name);
			jComboBox_bank_account_name.setFocusetPre(jComboBox_bank_account);
			jComboBox_bank2_name.setFocusetPre(jComboBox_bank_account_name);
			jComboBox_bank2_account.setFocusetPre(jComboBox_bank2_name);
			jComboBox_bank2_account_name.setFocusetPre(jComboBox_bank2_account);
			jComboBox_mark.setFocusetPre(jComboBox_bank2_account_name);
			
		return jPanelDataEdit;
	}
	
	/**
	 * ��ȡ�µ����
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JPanel
	 */
	private JPanel getJPanelNew(String tab, final JComboBox jComboBox) {

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
		// �ϱ߾࣬��߾࣬�±߾࣬�ұ߾�
		jPanel.setBorder(BorderFactory.createEmptyBorder(4, 0, 4, 0));

		Boolean flagPop = mDefultEditShow.get(tab);
		if(flagPop == null){
			flagPop = false;
		}
		final GJCheckBox gcb = new GJCheckBox(tab, flagPop);
		gcb.setHorizontalAlignment(SwingConstants.RIGHT);
		gcb.setPreferredSize(new Dimension(150, 25));

		if (jComboBox instanceof GppJComboBoxExp) {
			((GppJComboBoxExp) jComboBox).setAutoPopup(flagPop);
		}
		gcb.addItemListener(new java.awt.event.ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				if (jComboBox instanceof GppJComboBoxExp) {
//					System.out.println(gcb.getText()+"=="+e.getStateChange());
					if (e.getStateChange() == 1) {
						((GppJComboBoxExp) jComboBox).setAutoPopup(true);
						DataDefultManager.getmGppConfigurationIni().setValue(
								gcb.getText(), "1");
						DataDefultManager.getmGppConfigurationIni().saveFile();
						
					} else {
						((GppJComboBoxExp) jComboBox).setAutoPopup(false);
						DataDefultManager.getmGppConfigurationIni().setValue(
								gcb.getText(), "0");
						DataDefultManager.getmGppConfigurationIni().saveFile();
					}

				}
			}

		});

		jPanel.add(gcb, null);
		jPanel.add(jComboBox, null);
		// jPanel.add(jPanel2,null);
		return jPanel;
	}
	
	private void selectEditVillager(String v_ic) {

		if (v_ic != null && v_ic.length() == 18 && v_ic.charAt(17) == 'x') {
			// �����֤���һλСдxתΪ��дX
			v_ic = v_ic.subSequence(0, 17) + "X";
		}

		
		try {
			String ic_msg = IDNumberChecker.IDCardValidate(v_ic);
			if (!"".equals(ic_msg)) {
				String tempMSG = ic_msg;

				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();
				return;
			}else{
				
				if (mXXDB.isExistVillager(v_ic)) {
					mCurrentVillager = mXXDB.getVillagerByIc(v_ic);

					clearEditVillager(false, true);
				} else {
					// ���ݿ��в����ڸ����֤����
					String tempMSG = "���ݿ��в����ڸ����֤���룬����Ҫ������ȥ����һ���µĵ�����";

					JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
							JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);

					clearEditVillager(false, false);
					jComboBox_ic.setSelectedItem(v_ic);
				}
			}
			
		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void clearEditVillager(boolean clearEmpty,
			boolean fromCurrentVillager) {

		initEditComboBox(jComboBox_ic, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_ic());
		initEditComboBox(jComboBox_name, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_name());
		initEditComboBox(jComboBox_bank_name, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_bank_name());
		initEditComboBox(jComboBox_bank_account, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_bank_account());
		
		String tempName = "";
		if(mCurrentVillager.getV_bank_account_name() == null || "".equals(mCurrentVillager.getV_bank_account_name())){
			//���ɷѿ�����Ϊ�գ���Ĭ��ʹ�ñ�������
			tempName = mCurrentVillager.getV_name();
		}else{
			tempName = mCurrentVillager.getV_bank_account_name();
		}
		initEditComboBox(jComboBox_bank_account_name, clearEmpty,
				fromCurrentVillager,tempName);
		
		
		initEditComboBox(jComboBox_bank2_name, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_bank2_name());
		initEditComboBox(jComboBox_bank2_account, clearEmpty,
				fromCurrentVillager, mCurrentVillager.getV_bank2_account());
		
		
		if(mCurrentVillager.getV_bank2_account_name() == null || "".equals(mCurrentVillager.getV_bank2_account_name())){
			//��֧��������Ϊ�գ���Ĭ��ʹ�ñ�������
			tempName = mCurrentVillager.getV_name();
		}else{
			tempName = mCurrentVillager.getV_bank2_account_name();
		}
		initEditComboBox(jComboBox_bank2_account_name, clearEmpty,
				fromCurrentVillager,tempName);
		
		initEditComboBox(jComboBox_mark, clearEmpty, fromCurrentVillager,
				mCurrentVillager.getV_mark());

		mCurrentVillager = new Villager();
	}

	private void initEditComboBox(JComboBox jb, boolean clearEmpty,
			boolean fromCurrentVillager, String values) {

		if (fromCurrentVillager && values != null && !"".equals(values)) {
			jb.setSelectedItem(values);
			return;
		}

		if (clearEmpty) {
			jb.setSelectedItem("");
			return;
		}

		if (jb.getItemCount() > 0) {
			DefultData dd = (DefultData) jb.getItemAt(0);
			jb.setSelectedItem(dd.getValuse());
		} else {
			jb.setSelectedItem("");
		}
	}
	
	private void actionTableVillagerEdit(JTable jTableVillager, int rowS) {
		jComboBox_ic.setSelectedItem(jTableVillager.getValueAt(rowS, 2));
		jComboBox_name.setSelectedItem(jTableVillager.getValueAt(rowS, 1));
		jComboBox_bank_name.setSelectedItem(jTableVillager.getValueAt(rowS, 3));
		jComboBox_bank_account.setSelectedItem(jTableVillager.getValueAt(rowS,
				4));
		jComboBox_bank_account_name.setSelectedItem(jTableVillager.getValueAt(rowS,
				5));
		jComboBox_bank2_name.setSelectedItem(jTableVillager.getValueAt(rowS, 6));
		jComboBox_bank2_account.setSelectedItem(jTableVillager.getValueAt(rowS,
				7));
		jComboBox_bank2_account_name.setSelectedItem(jTableVillager.getValueAt(rowS,
				8));
		jComboBox_mark.setSelectedItem(jTableVillager.getValueAt(rowS,
				9));
	}
	
	
	/**
	 * ִ���޸�
	 * 
	 * @author �����
	 * @since:2011-11-15
	 */
	private void actionUpdateVillager() {

		try {

			Villager tempVillager = putCurrentVillager();

			if (tempVillager.getV_ic() == null
					|| "".equals(tempVillager.getV_ic())) {
				String tempMSG = "�����֤�Ų���Ϊ�գ����������룡";

				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();

				return;
			}

			if (!mXXDB.isExistVillager(tempVillager.getV_ic())) {
				String tempMSG = "�����֤�ţ�" + tempVillager.getV_ic()
						+ "��������ϵͳ�У�������ӣ�";

				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();

				return;
			}

			String cheak = cheakData(tempVillager);
			if (cheak != null) {
				// ���ݲ��Ϸ�
				JOptionPane.showConfirmDialog(null, cheak, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
			} else {
				
				System.out.println(tempVillager);
				// ���ݺϷ�
				if (mXXDB.updateVillagerBank(tempVillager)) {
					// ���³ɹ�
					String tempMSG = "���ݣ�" + tempVillager.getV_ic()+ "���޸ĳɹ���";
					JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
							JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
					// clearEditVillager(false,false);
					jComboBox_ic.requestFocus();
					refreshTableVillager();
					
					mCurrentVillager = tempVillager;
				} else {
					// ����ʧ��
					String tempMSG = "�����޸�ʧ�ܣ�";
					JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
							JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				}
			}

		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}
	
	private Villager putCurrentVillager() {
		Villager tempVillager = new Villager();
		tempVillager.setV_ic(jComboBox_ic.getEditor().getItem().toString());
		tempVillager.setV_name(jComboBox_name.getEditor().getItem()
				.toString());
		tempVillager.setV_bank_name(jComboBox_bank_name.getEditor()
				.getItem().toString());
		tempVillager.setV_bank_account(jComboBox_bank_account.getEditor()
				.getItem().toString());
		tempVillager.setV_bank_account_name(jComboBox_bank_account_name.getEditor()
				.getItem().toString());
		tempVillager.setV_bank2_name(jComboBox_bank2_name.getEditor()
				.getItem().toString());
		tempVillager.setV_bank2_account(jComboBox_bank2_account.getEditor()
				.getItem().toString());
		tempVillager.setV_bank2_account_name(jComboBox_bank2_account_name.getEditor()
				.getItem().toString());
		tempVillager.setV_mark(jComboBox_mark.getEditor().getItem()
				.toString());
		return tempVillager;
	}
	
	
	/**
	 * ������ݺϷ���
	 * 
	 * @version 2011-11-15
	 * @author Jason
	 * @param
	 * @return String null��ʾ�Ϸ��������Ǵ�����Ϣ
	 */
	private String cheakData(Villager villager) {
		String vic = villager.getV_ic();
		try {
			String ic_msg = IDNumberChecker.IDCardValidate(vic);
			if (!"".equals(ic_msg)) {
				return "���֤���벻�Ϸ���"+ic_msg;
			}
		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}

		return null;
	}
	
	private JButton getJButtonSaveBank() {
		JButton jButtonSaveToExcel = new JButton();
		jButtonSaveToExcel.setText("������Ϣ");
		jButtonSaveToExcel
				.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						actionUpdateVillager();
					}
				});
	return jButtonSaveToExcel;
	}
	
	private JButton getJButtonSaveToExcel0() {
		JButton jButtonSaveToExcel = new JButton();
		jButtonSaveToExcel.setText("����������Ϣ");
		jButtonSaveToExcel
				.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent e) {
						actionSaveToExcel();
					}
				});
	return jButtonSaveToExcel;
	}
	private void actionSaveToExcel() {

		Date date = new Date();

		String excelFile = this.mThorp.getT_name() + "-�α���Ա��������-"
				+ DateUtils.DATA_FORMAT.format(date) + ".xls";

		ExcelAccess ea = new ExcelAccess(excelFile);
		ea.setThorp(mThorp);
		try {
			List<Villager> list = mXXDB.getVillagerByThorp(
					mThorp.getT_id(), "a");
			ea.setVillagerList(list);
			if (ea.saveExcel(ExcelAccess.SAVE_BANK)) {
				// �����ɹ�
				String tempMSG = "�ɹ��������ļ�:" + excelFile + " ";
				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

			} else {
				// ����ʧ��
				String tempMSG = "�������ļ�:" + excelFile + " ʧ�ܣ�";
				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			}
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	class GppJComboBoxExp extends GJComboBox {

		private GppJComboBoxExp mFocuseNext = null;

		private GppJComboBoxExp mFocusePre = null;

		private List<DefultData> mDefData = null;

		private boolean isAutoPopup = false;
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public GppJComboBoxExp(List<DefultData> data) {
			super();
			this.setEditable(true);
			mDefData = data;
			init();
		}

		private void init() {
			if (mDefData != null) {
				for (DefultData d : mDefData) {
					addItem(d);
				}
			}
			setSelectedItem("");

			Component[] comps = this.getComponents();
			for (int i = 0; i < comps.length; i++) {

				if (comps[i] instanceof com.jgoodies.looks.common.ComboBoxEditorTextField) {
					comps[i].addFocusListener(new FocusListener() {

						@Override
						public void focusLost(FocusEvent e) {
							// TODO Auto-generated method stub
//							jLabelStatusInfo.setText("");

						}

						@Override
						public void focusGained(FocusEvent e) {
							// TODO Auto-generated method stub
							jLabelStatusInfo.setText(mStatusInfoEdit);

							if (isAutoPopup) {
								GppJComboBoxExp.this.showPopup();
							}

						}
					});
				}

			}

			updateGppKeyListener();
		}

		@Override
		public boolean actionUp() {
			// TODO Auto-generated method stub
			// ������ָ��λ��
//			Point p = this.getParent().getLocation();
//
//			// ��ȡJScrollPane�е�����JScrollBar
//			JScrollBar sBar = jScrollPaneCenterLeft.getVerticalScrollBar();
//
//			// ���ù�����button[12]����λ��
//			sBar.setValue(p.y - 75);
//
			if (mFocusePre != null) {
				mFocusePre.requestFocus();
			}
			return super.actionUp();
		}

		@Override
		public boolean actionDown() {
			// TODO Auto-generated method stub
			// ������ָ��λ��
//			Point p = this.getParent().getLocation();
//
//			// ��ȡJScrollPane�е�����JScrollBar
//			JScrollBar sBar = jScrollPaneCenterLeft.getVerticalScrollBar();
//
//			// ���ù�����button[12]����λ��
//
//			int offset = jScrollPaneCenterLeft.getHeight() - p.y;
//			if (offset < 80) {
//				sBar.setValue(p.y - 429);
//			}
//
			if (mFocuseNext != null) {
				mFocuseNext.requestFocus();
			}
			return super.actionDown();
		}

		@Override
		public boolean actionEnter() {

			Object obj = this.getEditor().getItem();

			if (obj instanceof DefultData) {
				// ʹ�ö����滻ֵ
				this.setSelectedItem(((DefultData) obj).getValuse());
			} else {
				boolean flag = false;
				for (DefultData d : mDefData) {
					if (d.getKey().equals(obj)) {
						// ʹ�ùؼ����滻ֵ
						this.setSelectedItem((d).getValuse());
						flag = true;
					}
				}

				if (!flag) {
					// ��������ʱ��ʹ��ԭ������
					String str = obj.toString();
					if (!str.equals("")) {
						int i = str.indexOf(".");
						if (i > 0) {
							String pre = str.substring(0, i);
							String suffixal = str.substring(i + 1);

							for (DefultData d : mDefData) {
								if (d.getKey().equals(pre)) {
									// ʹ�ùؼ����滻ֵ
									this.setSelectedItem((d).getValuse()
											+ suffixal);
									flag = true;
								}
							}
						}
					}

					if (!flag) {
						this.setSelectedItem(obj);
					}

				}
			}

			// ������ָ��λ��
//			Point p = this.getParent().getLocation();
//
//			// ��ȡJScrollPane�е�����JScrollBar
//			JScrollBar sBar = jScrollPaneCenterLeft.getVerticalScrollBar();
//			System.out.println(jScrollPaneCenterLeft.getHeight() + ":" + p.y
//					+ ":" + sBar.getY());
//			// ���ù�����button[12]����λ��
//
//			int offset = jScrollPaneCenterLeft.getHeight() - p.y;
//			if (offset < 80) {
//				sBar.setValue(p.y - 429);
//			}

			if (mFocuseNext != null) {
				mFocuseNext.requestFocus();
			}
			return super.actionEnter();
		}

		@Override
		public boolean actionEscape() {
			// ������ָ��λ��
//			Point p = this.getParent().getLocation();
//
//			// ��ȡJScrollPane�е�����JScrollBar
//			JScrollBar sBar = jScrollPaneCenterLeft.getVerticalScrollBar();
//
//			// ���ù�����button[12]����λ��
//			sBar.setValue(p.y - 75);
//
			if (mFocusePre != null) {
				mFocusePre.requestFocus();
			}
			return super.actionEscape();
		}

		@Override
		public boolean actionF1() {
			// TODO Auto-generated method stub
//			actionAddVillager();
			return super.actionF1();
		}

		@Override
		public boolean actionF2() {
			// TODO Auto-generated method stub
			actionUpdateVillager();
			return super.actionF2();
		}

		@Override
		public boolean actionF3() {
			// TODO Auto-generated method stub
//			actionEditReset();
			return super.actionF3();
		}

		@Override
		public boolean actionF4() {
			// TODO Auto-generated method stub
//			actionEditClear();
			return super.actionF4();
		}

		@Override
		public boolean actionF5() {
			// TODO Auto-generated method stub
//			actionDeleteVillager();
			return super.actionF5();
		}

		@Override
		public boolean actionKey(int keyCode) {
			// TODO Auto-generated method stub
//			System.out.println(keyCode);
			if (keyCode == 34) {
				// pageDown
				actionUpdateVillager();
			} else if (keyCode == 33) {
				// pageUp
			} else if (keyCode == 36) {
				// Home
			} else if (keyCode == 35) {
				// end
			} else if (keyCode == 61 || keyCode == 107) {
				// �Ӻż�
				actionUpdateVillager();
			}

			return super.actionKey(keyCode);
		}

		public void setFocusetNext(GppJComboBoxExp next) {
			mFocuseNext = next;
		}

		public void setFocusetPre(GppJComboBoxExp pre) {
			mFocusePre = pre;
		}

		public boolean isAutoPopup() {
			return isAutoPopup;
		}

		public void setAutoPopup(boolean isAutoPopup) {
			this.isAutoPopup = isAutoPopup;
		}
	}
}
