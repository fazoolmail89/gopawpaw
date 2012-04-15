package com.gopawpaw.kynb.module.datascan;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScanItemDialog extends JDialog {
	
	private static final long serialVersionUID = -5278013924047489607L;
	private DataScanFrame mainFrame = null;
	
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
	
	private String[] cbbItem = null;
	
	public ScanItemDialog(DataScanFrame mainFrame) {
		this.mainFrame = mainFrame;
		initCbbItem();
		setTitle("扫描项选择对话框");
		setLayout(new FlowLayout());
		add(getPnlItemFirst());
		add(getPnlItemSecond());
		add(getPnlItemThird());
		
		setSize(500, 200);
		DataScanFrame.setDialogLocaltion(this);
		setModal(true);
		setVisible(true);
		
		//回写主界面的ScanItemArray数组
		returnScanItemArray();
	}
	
	private JPanel getPnlItemFirst() {
		pnlItemFirst = new JPanel();
		
		ckbItemFirst = new JCheckBox();
		ckbItemFirst.setSelected(true);
		ckbItemFirst.setEnabled(false);
		lblItemFirst = new JLabel("扫描身份证号码，对应表格列名：");
		cbbItemFirst = new JComboBox(cbbItem);	
		
		setDefault(ckbItemFirst, cbbItemFirst, ScanItem.SI_V_IC);
		
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
		
		setDefault(ckbItemSecond, cbbItemSecond, ScanItem.SI_V_NAME);
		
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
		
		setDefault(ckbItemThird, cbbItemThird, ScanItem.SI_V_BANK_ACCOUNT);
		
		pnlItemThird.add(ckbItemThird);
		pnlItemThird.add(lblItemThird);
		pnlItemThird.add(cbbItemThird);
		
		ckbItemThird.setSize(500, 50);
		return pnlItemThird;
	}
	
	private void returnScanItemArray() {
		//清空选项列表
		mainFrame.getSiList().clear();
		
		if(ckbItemFirst.isSelected()) {
			ScanItem siF = new ScanItem();
			siF.setDbtColumnName(ScanItem.SI_V_IC);
			siF.setExlColumnName((String)cbbItemFirst.getSelectedItem());
			mainFrame.getSiList().add(siF);
		}
		
		if(ckbItemSecond.isSelected()) {
			ScanItem siS = new ScanItem();
			siS.setDbtColumnName("v_name");
			siS.setExlColumnName((String)cbbItemSecond.getSelectedItem());
			mainFrame.getSiList().add(siS);
		}
		
		if(ckbItemThird.isSelected()) {
			ScanItem siT = new ScanItem();
			siT.setDbtColumnName("v_bank_account");
			siT.setExlColumnName((String)cbbItemThird.getSelectedItem());
			mainFrame.getSiList().add(siT);
		}
	}
	
	private void initCbbItem() {
		if(mainFrame.getExcelDataTablePane().getColumnNames() != null){
			Object[] temp = mainFrame.getExcelDataTablePane().getColumnNames();
			cbbItem = new String[temp.length];
			for(int i = 0; i < temp.length; i++) {
				cbbItem[i] = temp[i].toString();
			}
		}
		else 
			cbbItem = new String[0];
	}
	
	/**
	 * 设置默认值
	 * @param ckb
	 * @param cbb
	 * @param equalsStr
	 */
	private void setDefault(JCheckBox ckb, JComboBox cbb, String equalsStr) {
		//设置默认值
		if(cbbItem.length > 0 && mainFrame.getSiList().size() > 0) {
			for(int i = 0; i < mainFrame.getSiList().size(); i++) {
				ScanItem si = mainFrame.getSiList().get(i);
				if(si.getDbtColumnName().equals(equalsStr)) {
					for(int j = 0; j < cbbItem.length; j++) {
						if(si.getExlColumnName().equals(cbbItem[j])) {
							ckb.setSelected(true);
							cbb.setSelectedIndex(j);
							break;
						}
					}
				}
			}
		}		
	}
}
