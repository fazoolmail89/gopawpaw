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
	
	private String mStatusInfoEdit = "Enter=下一个字段；Esc=上一个字段；Up/Down=选择预订值；F2/pageDown/+=修改保存";

	
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
		
		//右边表格面板
		JScrollPane jScrollPaneRight = new JScrollPane();
		jScrollPaneRight.setViewportView(getJTableVillager());

		jScrollPaneRight.setAutoscrolls(true);
		jScrollPaneRight
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		//左边编辑面板
		JScrollPane jScrollPaneLeft = new JScrollPane();
		jScrollPaneLeft.setViewportView(getJPanelDataEdit());

		jScrollPaneLeft.setAutoscrolls(true);
		jScrollPaneLeft
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		//分割面板
			JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
					jScrollPaneLeft, jScrollPaneRight);
			jSplitPane.setDividerLocation(300);
			jSplitPane.setOneTouchExpandable(true);
			jSplitPane.setDividerSize(10);

		return jSplitPane;
	}
	
	private JTable getJTableVillager() {
		if (jTableVillager == null) {

			// 设置列标题(表头)
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
			// 初始化表格

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

			jLabelVillagerNormalCount.setText("总数：" + list.size());
			jTableVillager.repaint();
			jTableVillager.updateUI();
		} catch (DBException e) {
			// TODO 自动生成 catch 块
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
	 * 数据编辑面板
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

			
			// 设置默认值为正常数据
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

			// 设置Enter键顺序
			jComboBox_ic.setFocusetNext(jComboBox_name);
			jComboBox_name.setFocusetNext(jComboBox_bank_name);
			jComboBox_bank_name.setFocusetNext(jComboBox_bank_account);
			jComboBox_bank_account.setFocusetNext(jComboBox_bank_account_name);
			jComboBox_bank_account_name.setFocusetNext(jComboBox_bank2_name);
			jComboBox_bank2_name.setFocusetNext(jComboBox_bank2_account);
			jComboBox_bank2_account.setFocusetNext(jComboBox_bank2_account_name);
			jComboBox_bank2_account_name.setFocusetNext(jComboBox_mark);
			jComboBox_mark.setFocusetNext(jComboBox_ic);

			// 设置Esc键顺序
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
	 * 获取新的面板
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JPanel
	 */
	private JPanel getJPanelNew(String tab, final JComboBox jComboBox) {

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
		// 上边距，左边距，下边距，右边距
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
			// 将身份证最后一位小写x转为大写X
			v_ic = v_ic.subSequence(0, 17) + "X";
		}

		
		try {
			String ic_msg = IDNumberChecker.IDCardValidate(v_ic);
			if (!"".equals(ic_msg)) {
				String tempMSG = ic_msg;

				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();
				return;
			}else{
				
				if (mXXDB.isExistVillager(v_ic)) {
					mCurrentVillager = mXXDB.getVillagerByIc(v_ic);

					clearEditVillager(false, true);
				} else {
					// 数据库中不存在该身份证号码
					String tempMSG = "数据库中不存在该身份证号码，若需要，请先去创建一个新的档案。";

					JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
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
			//若缴费开户名为空，则默认使用本人名字
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
			//若支付开户名为空，则默认使用本人名字
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
	 * 执行修改
	 * 
	 * @author 李锦华
	 * @since:2011-11-15
	 */
	private void actionUpdateVillager() {

		try {

			Villager tempVillager = putCurrentVillager();

			if (tempVillager.getV_ic() == null
					|| "".equals(tempVillager.getV_ic())) {
				String tempMSG = "该身份证号不能为空，请重新输入！";

				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();

				return;
			}

			if (!mXXDB.isExistVillager(tempVillager.getV_ic())) {
				String tempMSG = "该身份证号（" + tempVillager.getV_ic()
						+ "）不存在系统中，请先添加！";

				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();

				return;
			}

			String cheak = cheakData(tempVillager);
			if (cheak != null) {
				// 数据不合法
				JOptionPane.showConfirmDialog(null, cheak, "系统提示",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
			} else {
				
				System.out.println(tempVillager);
				// 数据合法
				if (mXXDB.updateVillagerBank(tempVillager)) {
					// 更新成功
					String tempMSG = "数据（" + tempVillager.getV_ic()+ "）修改成功！";
					JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
							JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
					// clearEditVillager(false,false);
					jComboBox_ic.requestFocus();
					refreshTableVillager();
					
					mCurrentVillager = tempVillager;
				} else {
					// 更新失败
					String tempMSG = "数据修改失败！";
					JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
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
	 * 检测数据合法性
	 * 
	 * @version 2011-11-15
	 * @author Jason
	 * @param
	 * @return String null表示合法，否则是错误信息
	 */
	private String cheakData(Villager villager) {
		String vic = villager.getV_ic();
		try {
			String ic_msg = IDNumberChecker.IDCardValidate(vic);
			if (!"".equals(ic_msg)) {
				return "身份证号码不合法，"+ic_msg;
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
		jButtonSaveToExcel.setText("保存信息");
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
		jButtonSaveToExcel.setText("导出银行信息");
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

		String excelFile = this.mThorp.getT_name() + "-参保人员银行数据-"
				+ DateUtils.DATA_FORMAT.format(date) + ".xls";

		ExcelAccess ea = new ExcelAccess(excelFile);
		ea.setThorp(mThorp);
		try {
			List<Villager> list = mXXDB.getVillagerByThorp(
					mThorp.getT_id(), "a");
			ea.setVillagerList(list);
			if (ea.saveExcel(ExcelAccess.SAVE_BANK)) {
				// 导出成功
				String tempMSG = "成功导出到文件:" + excelFile + " ";
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

			} else {
				// 导出失败
				String tempMSG = "导出到文件:" + excelFile + " 失败！";
				JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
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
			// 滚动到指定位置
//			Point p = this.getParent().getLocation();
//
//			// 获取JScrollPane中的纵向JScrollBar
//			JScrollBar sBar = jScrollPaneCenterLeft.getVerticalScrollBar();
//
//			// 设置滚动到button[12]所在位置
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
			// 滚动到指定位置
//			Point p = this.getParent().getLocation();
//
//			// 获取JScrollPane中的纵向JScrollBar
//			JScrollBar sBar = jScrollPaneCenterLeft.getVerticalScrollBar();
//
//			// 设置滚动到button[12]所在位置
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
				// 使用对象替换值
				this.setSelectedItem(((DefultData) obj).getValuse());
			} else {
				boolean flag = false;
				for (DefultData d : mDefData) {
					if (d.getKey().equals(obj)) {
						// 使用关键字替换值
						this.setSelectedItem((d).getValuse());
						flag = true;
					}
				}

				if (!flag) {
					// 都不满足时，使用原本数据
					String str = obj.toString();
					if (!str.equals("")) {
						int i = str.indexOf(".");
						if (i > 0) {
							String pre = str.substring(0, i);
							String suffixal = str.substring(i + 1);

							for (DefultData d : mDefData) {
								if (d.getKey().equals(pre)) {
									// 使用关键字替换值
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

			// 滚动到指定位置
//			Point p = this.getParent().getLocation();
//
//			// 获取JScrollPane中的纵向JScrollBar
//			JScrollBar sBar = jScrollPaneCenterLeft.getVerticalScrollBar();
//			System.out.println(jScrollPaneCenterLeft.getHeight() + ":" + p.y
//					+ ":" + sBar.getY());
//			// 设置滚动到button[12]所在位置
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
			// 滚动到指定位置
//			Point p = this.getParent().getLocation();
//
//			// 获取JScrollPane中的纵向JScrollBar
//			JScrollBar sBar = jScrollPaneCenterLeft.getVerticalScrollBar();
//
//			// 设置滚动到button[12]所在位置
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
				// 加号键
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
