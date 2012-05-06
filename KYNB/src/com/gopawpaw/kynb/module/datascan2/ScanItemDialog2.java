package com.gopawpaw.kynb.module.datascan2;

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

import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.common.DialogUtil;

public class ScanItemDialog2 extends JDialog {

	private static final long serialVersionUID = -5278013924047489607L;
	private DataScanFrame2 mainFrame = null;
	
	private static String[] cbbItem = new String[0];
	
	private JPanel pnlBGBox = null;

	private JPanel pnlItem_A = new JPanel();
	private JCheckBox ckbItem_A =  new JCheckBox();
	private JLabel lblItem_A = new JLabel("扫描数据库表 A 列，对应表格列名：");
	private JComboBox cbbItem_A;	
	
	private JPanel pnlItem_B = new JPanel();
	private JCheckBox ckbItem_B =  new JCheckBox();
	private JLabel lblItem_B = new JLabel("扫描数据库表 B 列，对应表格列名：");
	private JComboBox cbbItem_B;	
	
	private JPanel pnlItem_C = new JPanel();
	private JCheckBox ckbItem_C =  new JCheckBox();
	private JLabel lblItem_C = new JLabel("扫描数据库表 C 列，对应表格列名：");
	private JComboBox cbbItem_C;	
	
	private JPanel pnlItem_D = new JPanel();
	private JCheckBox ckbItem_D =  new JCheckBox();
	private JLabel lblItem_D = new JLabel("扫描数据库表 D 列，对应表格列名：");
	private JComboBox cbbItem_D;	
	
	private JPanel pnlItem_E = new JPanel();
	private JCheckBox ckbItem_E =  new JCheckBox();
	private JLabel lblItem_E = new JLabel("扫描数据库表 E 列，对应表格列名：");
	private JComboBox cbbItem_E;	
	
	private JPanel pnlItem_F = new JPanel();
	private JCheckBox ckbItem_F =  new JCheckBox();
	private JLabel lblItem_F = new JLabel("扫描数据库表 F 列，对应表格列名：");
	private JComboBox cbbItem_F;	
	
	private JPanel pnlItem_G = new JPanel();
	private JCheckBox ckbItem_G =  new JCheckBox();
	private JLabel lblItem_G = new JLabel("扫描数据库表 G 列，对应表格列名：");
	private JComboBox cbbItem_G;	
	
	private JPanel pnlItem_H = new JPanel();
	private JCheckBox ckbItem_H =  new JCheckBox();
	private JLabel lblItem_H = new JLabel("扫描数据库表 H 列，对应表格列名：");
	private JComboBox cbbItem_H;	
	
	private JPanel pnlItem_I = new JPanel();
	private JCheckBox ckbItem_I =  new JCheckBox();
	private JLabel lblItem_I = new JLabel("扫描数据库表 I 列，对应表格列名：");
	private JComboBox cbbItem_I;	
	
	private JPanel pnlItem_J = new JPanel();
	private JCheckBox ckbItem_J =  new JCheckBox();
	private JLabel lblItem_J = new JLabel("扫描数据库表 J 列，对应表格列名：");
	private JComboBox cbbItem_J;	
	
	private JPanel pnlButton = null;
	private JButton btnOk = null;
	private JButton btnQuit = null;

	public ScanItemDialog2(DataScanFrame2 mainFrame) {
		this.mainFrame = mainFrame;
		
		//初始下拉框数据集
		initCbbItem();
		
		setTitle("扫描项选择对话框");
		setContentPane(getPnlBGBox());

		// 初始化默认值
		initDefaultValue();

		setSize(500, 430);
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		setModal(true);
		setVisible(true);

	}

	private JPanel getPnlBGBox() {
		pnlBGBox = new JPanel();

		Box box = Box.createVerticalBox();
		box.add(Box.createHorizontalStrut(10));

		box.add(getPanelItem_A());
		box.add(getPanelItem_B());
		box.add(getPanelItem_C());
		box.add(getPanelItem_D());
		box.add(getPanelItem_E());
		box.add(getPanelItem_F());
		box.add(getPanelItem_G());
		box.add(getPanelItem_H());
		box.add(getPanelItem_I());
		box.add(getPanelItem_J());
		box.add(getPnlButton());

		pnlBGBox.add(box);

		return pnlBGBox;
	}
	
	private JPanel getPanelItem_A() {
		ckbItem_A.setSelected(true);
		pnlItem_A.add(ckbItem_A);
		pnlItem_A.add(lblItem_A);
		cbbItem_A = new JComboBox(cbbItem);
		pnlItem_A.add(cbbItem_A);
		return pnlItem_A;
	}
	
	private JPanel getPanelItem_B() {
		pnlItem_B.add(ckbItem_B);
		pnlItem_B.add(lblItem_B);
		cbbItem_B = new JComboBox(cbbItem);
		pnlItem_B.add(cbbItem_B);
		return pnlItem_B;
	}
	
	private JPanel getPanelItem_C() {
		pnlItem_C.add(ckbItem_C);
		pnlItem_C.add(lblItem_C);
		cbbItem_C = new JComboBox(cbbItem);
		pnlItem_C.add(cbbItem_C);
		return pnlItem_C;
	}
	
	private JPanel getPanelItem_D() {
		pnlItem_D.add(ckbItem_D);
		pnlItem_D.add(lblItem_D);
		cbbItem_D = new JComboBox(cbbItem);
		pnlItem_D.add(cbbItem_D);
		return pnlItem_D;
	}
	
	private JPanel getPanelItem_E() {
		pnlItem_E.add(ckbItem_E);
		pnlItem_E.add(lblItem_E);
		cbbItem_E = new JComboBox(cbbItem);
		pnlItem_E.add(cbbItem_E);
		return pnlItem_E;
	}
	
	private JPanel getPanelItem_F() {
		pnlItem_F.add(ckbItem_F);
		pnlItem_F.add(lblItem_F);
		cbbItem_F = new JComboBox(cbbItem);
		pnlItem_F.add(cbbItem_F);
		return pnlItem_F;
	}
	
	private JPanel getPanelItem_G() {
		pnlItem_G.add(ckbItem_G);
		pnlItem_G.add(lblItem_G);
		cbbItem_G = new JComboBox(cbbItem);
		pnlItem_G.add(cbbItem_G);
		return pnlItem_G;
	}
	
	private JPanel getPanelItem_H() {
		pnlItem_H.add(ckbItem_H);
		pnlItem_H.add(lblItem_H);
		cbbItem_H = new JComboBox(cbbItem);
		pnlItem_H.add(cbbItem_H);
		return pnlItem_H;
	}
	
	private JPanel getPanelItem_I() {
		pnlItem_I.add(ckbItem_I);
		pnlItem_I.add(lblItem_I);
		cbbItem_I = new JComboBox(cbbItem);
		pnlItem_I.add(cbbItem_I);
		return pnlItem_I;
	}
	
	private JPanel getPanelItem_J() {
		pnlItem_J.add(ckbItem_J);
		pnlItem_J.add(lblItem_J);
		cbbItem_J = new JComboBox(cbbItem);
		pnlItem_J.add(cbbItem_J);
		return pnlItem_J;
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
				int rv = JOptionPane.showConfirmDialog(ScanItemDialog2.this,
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
		if (ckbItem_A.isSelected()) {
			mainFrame.getScanMap().put(OtherData.ACOL,
					cbbItem_A.getSelectedIndex());
		} else {
			mainFrame.getScanMap().remove(OtherData.ACOL);
		}
		
		if (ckbItem_B.isSelected()) {
			mainFrame.getScanMap().put(OtherData.BCOL,
					cbbItem_B.getSelectedIndex());
		} else {
			mainFrame.getScanMap().remove(OtherData.BCOL);
		}
		
		if (ckbItem_C.isSelected()) {
			mainFrame.getScanMap().put(OtherData.CCOL,
					cbbItem_C.getSelectedIndex());
		} else {
			mainFrame.getScanMap().remove(OtherData.CCOL);
		}
		
		if (ckbItem_D.isSelected()) {
			mainFrame.getScanMap().put(OtherData.DCOL,
					cbbItem_D.getSelectedIndex());
		} else {
			mainFrame.getScanMap().remove(OtherData.DCOL);
		}
		
		if (ckbItem_E.isSelected()) {
			mainFrame.getScanMap().put(OtherData.ECOL,
					cbbItem_E.getSelectedIndex());
		} else {
			mainFrame.getScanMap().remove(OtherData.ECOL);
		}
		
		if (ckbItem_F.isSelected()) {
			mainFrame.getScanMap().put(OtherData.FCOL,
					cbbItem_F.getSelectedIndex());
		} else {
			mainFrame.getScanMap().remove(OtherData.FCOL);
		}
		
		if (ckbItem_G.isSelected()) {
			mainFrame.getScanMap().put(OtherData.GCOL,
					cbbItem_G.getSelectedIndex());
		} else {
			mainFrame.getScanMap().remove(OtherData.GCOL);
		}
		
		if (ckbItem_H.isSelected()) {
			mainFrame.getScanMap().put(OtherData.HCOL,
					cbbItem_H.getSelectedIndex());
		} else {
			mainFrame.getScanMap().remove(OtherData.HCOL);
		}
		
		if (ckbItem_I.isSelected()) {
			mainFrame.getScanMap().put(OtherData.ICOL,
					cbbItem_I.getSelectedIndex());
		} else {
			mainFrame.getScanMap().remove(OtherData.ICOL);
		}
		
		if (ckbItem_J.isSelected()) {
			mainFrame.getScanMap().put(OtherData.JCOL,
					cbbItem_J.getSelectedIndex());
		} else {
			mainFrame.getScanMap().remove(OtherData.JCOL);
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
			if (mainFrame.getScanMap().get(OtherData.ACOL) != null) {
				ckbItem_A.setSelected(true);
				cbbItem_A.setSelectedIndex(mainFrame.getScanMap().get(
						OtherData.ACOL));
			}
			
			if (mainFrame.getScanMap().get(OtherData.BCOL) != null) {
				ckbItem_B.setSelected(true);
				cbbItem_B.setSelectedIndex(mainFrame.getScanMap().get(
						OtherData.BCOL));
			}
			
			if (mainFrame.getScanMap().get(OtherData.CCOL) != null) {
				ckbItem_C.setSelected(true);
				cbbItem_C.setSelectedIndex(mainFrame.getScanMap().get(
						OtherData.CCOL));
			}
			
			if (mainFrame.getScanMap().get(OtherData.DCOL) != null) {
				ckbItem_D.setSelected(true);
				cbbItem_D.setSelectedIndex(mainFrame.getScanMap().get(
						OtherData.DCOL));
			}
			
			if (mainFrame.getScanMap().get(OtherData.ECOL) != null) {
				ckbItem_E.setSelected(true);
				cbbItem_E.setSelectedIndex(mainFrame.getScanMap().get(
						OtherData.ECOL));
			}
			
			if (mainFrame.getScanMap().get(OtherData.FCOL) != null) {
				ckbItem_F.setSelected(true);
				cbbItem_F.setSelectedIndex(mainFrame.getScanMap().get(
						OtherData.FCOL));
			}
			
			if (mainFrame.getScanMap().get(OtherData.GCOL) != null) {
				ckbItem_G.setSelected(true);
				cbbItem_G.setSelectedIndex(mainFrame.getScanMap().get(
						OtherData.GCOL));
			}
			
			if (mainFrame.getScanMap().get(OtherData.HCOL) != null) {
				ckbItem_H.setSelected(true);
				cbbItem_H.setSelectedIndex(mainFrame.getScanMap().get(
						OtherData.HCOL));
			}
			
			if (mainFrame.getScanMap().get(OtherData.ICOL) != null) {
				ckbItem_I.setSelected(true);
				cbbItem_I.setSelectedIndex(mainFrame.getScanMap().get(
						OtherData.ICOL));
			}
			
			if (mainFrame.getScanMap().get(OtherData.JCOL) != null) {
				ckbItem_J.setSelected(true);
				cbbItem_J.setSelectedIndex(mainFrame.getScanMap().get(
						OtherData.JCOL));
			}
		}
	}
}
