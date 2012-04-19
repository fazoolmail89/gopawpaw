package com.gopawpaw.kynb.module.datascan;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ScanItemDialog extends JDialog {

	private static final long serialVersionUID = -5278013924047489607L;
	private DataScanFrame mainFrame = null;

	private JPanel pnlBGBox = null;

	private JPanel pnlItemFirst = null;
	private JCheckBox ckbItemFirst = null;
	private JLabel lblItemFirst = null;
	private JComboBox cbbItemFirst = null;

	private JPanel pnlItemSecond = null;
	private JCheckBox ckbItemSecond = null;
	private JLabel lblItemSecond = null;
	private JComboBox cbbItemSecond = null;

	private JPanel pnlItemThird = null;
	private JCheckBox ckbItemThird = null;
	private JLabel lblItemThird = null;
	private JComboBox cbbItemThird = null;

	private JPanel pnlButton = null;
	private JButton btnOk = null;
	private JButton btnQuit = null;

	private String[] cbbItem = null;

	public ScanItemDialog(DataScanFrame mainFrame) {
		this.mainFrame = mainFrame;
		initCbbItem();
		setTitle("扫描项选择对话框");
		setContentPane(getPnlBGBox());

		// 初始化默认值
		initDefaultValue();

		setSize(500, 200);
		DataScanFrame.setDialogLocaltion(this);
		setModal(true);
		setVisible(true);

	}

	private JPanel getPnlBGBox() {
		pnlBGBox = new JPanel();

		Box box = Box.createVerticalBox();
		box.add(Box.createHorizontalStrut(10));

		box.add(getPnlItemFirst());
		box.add(getPnlItemSecond());
		box.add(getPnlItemThird());
		box.add(getPnlButton());

		pnlBGBox.add(box);

		return pnlBGBox;
	}

	private JPanel getPnlItemFirst() {
		pnlItemFirst = new JPanel();

		ckbItemFirst = new JCheckBox();
		ckbItemFirst.setSelected(true);
		ckbItemFirst.setEnabled(false);
		lblItemFirst = new JLabel("扫描身份证号码，对应表格列名：");
		cbbItemFirst = new JComboBox(cbbItem);

		pnlItemFirst.add(ckbItemFirst);
		pnlItemFirst.add(lblItemFirst);
		pnlItemFirst.add(cbbItemFirst);

		ckbItemFirst.setSize(500, 50);
		return pnlItemFirst;
	}

	private JPanel getPnlItemSecond() {
		pnlItemSecond = new JPanel();

		ckbItemSecond = new JCheckBox();
		lblItemSecond = new JLabel("扫描参保人姓名，对应表格列名：");
		cbbItemSecond = new JComboBox(cbbItem);

		pnlItemSecond.add(ckbItemSecond);
		pnlItemSecond.add(lblItemSecond);
		pnlItemSecond.add(cbbItemSecond);

		ckbItemSecond.setSize(500, 50);
		return pnlItemSecond;
	}

	private JPanel getPnlItemThird() {
		pnlItemThird = new JPanel();

		ckbItemThird = new JCheckBox();
		lblItemThird = new JLabel("扫描参保人账户，对应表格列名：");
		cbbItemThird = new JComboBox(cbbItem);

		pnlItemThird.add(ckbItemThird);
		pnlItemThird.add(lblItemThird);
		pnlItemThird.add(cbbItemThird);

		ckbItemThird.setSize(500, 50);
		return pnlItemThird;
	}

	private JPanel getPnlButton() {
		pnlButton = new JPanel();
		btnOk = new JButton("确定");
		btnQuit = new JButton("取消");

		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 回写主界面的ScanMap
				returnWriteScanMap();
				dispose();
			}
		});

		btnQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(ScanItemDialog.this,
						"是否取消操作？", "退出提示！", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.WARNING_MESSAGE);
				if (rv == 0) {
					dispose();
				}
			}
		});
		pnlButton.add(btnOk);
		pnlButton.add(btnQuit);

		return pnlButton;
	}

	private void returnWriteScanMap() {
		// 清空选项列表

		if (ckbItemFirst.isSelected()) {
			mainFrame.getScanMap().put(ScanItem.V_IC,
					cbbItemFirst.getSelectedIndex());
		}

		if (ckbItemSecond.isSelected()) {
			mainFrame.getScanMap().put(ScanItem.V_NAME,
					cbbItemSecond.getSelectedIndex());
		} else {
			mainFrame.getScanMap().remove(ScanItem.V_NAME);
		}

		if (ckbItemThird.isSelected()) {
			mainFrame.getScanMap().put(ScanItem.V_BANK_ACCOUNT,
					cbbItemThird.getSelectedIndex());
		} else {
			mainFrame.getScanMap().remove(ScanItem.V_BANK_ACCOUNT);
		}
	}

	private void initCbbItem() {
		if (mainFrame.getExcelDataTablePane().getColumnNames() != null) {
			Object[] temp = mainFrame.getExcelDataTablePane().getColumnNames();
			cbbItem = new String[temp.length];
			for (int i = 0; i < temp.length; i++) {
				cbbItem[i] = temp[i].toString();
			}
		} else
			cbbItem = new String[0];
	}

	/**
	 * 初始化默认值
	 */
	private void initDefaultValue() {
		// 设置默认值
		if (cbbItem.length > 0) {
			if (mainFrame.getScanMap().get(ScanItem.V_IC) != null) {
				ckbItemFirst.setSelected(true);
				cbbItemFirst.setSelectedIndex(mainFrame.getScanMap().get(
						ScanItem.V_IC));
			}

			if (mainFrame.getScanMap().get(ScanItem.V_NAME) != null) {
				ckbItemSecond.setSelected(true);
				cbbItemSecond.setSelectedIndex(mainFrame.getScanMap().get(
						ScanItem.V_NAME));
			}

			if (mainFrame.getScanMap().get(ScanItem.V_BANK_ACCOUNT) != null) {
				ckbItemThird.setSelected(true);
				cbbItemThird.setSelectedIndex(mainFrame.getScanMap().get(
						ScanItem.V_BANK_ACCOUNT));
			}
		}
		/*
		 * if(cbbItem.length > 0 && mainFrame.getSiList().size() > 0) { for(int
		 * i = 0; i < mainFrame.getSiList().size(); i++) { ScanItem si =
		 * mainFrame.getSiList().get(i);
		 * if(si.getDbtColumnName().equals(equalsStr)) { for(int j = 0; j <
		 * cbbItem.length; j++) { if(si.getExlColumnName().equals(cbbItem[j])) {
		 * ckb.setSelected(true); cbb.setSelectedIndex(j); break; } } } } }
		 */
	}
}
