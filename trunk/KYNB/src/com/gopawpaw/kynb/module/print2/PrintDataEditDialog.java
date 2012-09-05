/**     
 * @{#} PtintDataEditDialog.java Create on 2012-8-18 ����2:22:37     
 *     
 * Copyright (c) 2012 by ¬����.     
 */

package com.gopawpaw.kynb.module.print2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.gopawpaw.kynb.common.DialogUtil;
import com.gopawpaw.kynb.module.print2.dpmtmng.PrintThorp;
import com.gopawpaw.kynb.module.print2.dpmtmng.PrintThorpDAO;

/**
 * ���ݱ༭����
 * 
 * @author ¬���� luxiangqi521@gmail.com
 * @version 1.0
 */

public class PrintDataEditDialog extends JDialog {
	private static final long serialVersionUID = -198794430177043710L;
	private Dimension dimLbl = new Dimension(100, 20);
	private Dimension dimInp = new Dimension(200, 20);

	private MainFrame mainFrame;
	public static final int VIEW_OPT = 0;
	public static final int ADD_OPT = 1;
	public static final int UPTD_OPT = 2;
	private int opt;
	private PrintData printData;
	private PrintThorp[] ptArray = {};

	private JPanel pnlBody;
	private JLabel lblName = new JLabel("����");
	private JTextField ttfName = new JTextField();

	private JLabel lblSex = new JLabel("�Ա�");
	private JTextField ttfSex = new JTextField();

	private JLabel lblICCode = new JLabel("���֤��");
	private JTextField ttfICCode = new JTextField();

	private JLabel lblSerialNum = new JLabel("���˱��");
	private JTextField ttfSerialNum = new JTextField();

	private JLabel lblArea = new JLabel("��������");
	private JTextField ttfArea = new JTextField();

	private JLabel lblThorpId = new JLabel("���ڴ�");
	private JComboBox cbbThorpId;

	private JLabel lblThorpName = new JLabel("�����������");
	private JTextField ttfThorpName = new JTextField();

	private JLabel lblPhone = new JLabel("��ϵ�绰");
	private JTextField ttfPhone = new JTextField();

	private JLabel lblFamilyCode = new JLabel("��ͥ���");
	private JTextField ttfFamilyCode = new JTextField();

	private JLabel lblJ_Account = new JLabel("�ɷ������˺�");
	private JTextField ttfJ_Account = new JTextField();

	private JLabel lblJ_AccountName = new JLabel("�ɷ����л���");
	private JTextField ttfJ_AccountName = new JTextField();

	private JLabel lblZ_Account = new JLabel("֧�������˺�");
	private JTextField ttfZ_Account = new JTextField();

	private JLabel lblZ_AccountName = new JLabel("֧�����л���");
	private JTextField ttfZ_AccountName = new JTextField();

	private JLabel lblAge = new JLabel("����");
	private JTextField ttfAge = new JTextField();

	private JLabel lblAchieveDate = new JLabel("����ʱ��");
	private JTextField ttfAchieveDate = new JTextField();

	private JLabel lblBirthDate = new JLabel("��������");
	private JTextField ttfBirthDate = new JTextField();

	private JLabel lblRelationship = new JLabel("�뻧����ϵ");
	private JTextField ttfRelationship = new JTextField();

	private JLabel lblPayGrade = new JLabel("����ɷѵ���");
	private JTextField ttfPayGrade = new JTextField();

	private JLabel lblPersType = new JLabel("������Ա���");
	private JTextField ttfPersType = new JTextField();

	private JLabel lblAddress = new JLabel("��ͥסַ");
	private JTextField ttfAddress = new JTextField();

	private JLabel lblRemark = new JLabel("��ע");
	private JTextField ttfRemark = new JTextField();

	private JLabel lblTotalAcct = new JLabel("�ۼƸ����˻����");
	private JTextField ttfTotalAcct = new JTextField();

	private JLabel lblTotalPay = new JLabel("�ۼƸ��˽ɷѽ��");
	private JTextField ttfTotalPay = new JTextField();

	private JLabel lblTotalSubs = new JLabel("�ۼƲ�������");
	private JTextField ttfTotalSubs = new JTextField();

	private JLabel lblPrintFlag = new JLabel("��ӡ���");
	private JTextField ttfPrintFlag = new JTextField();

	private JLabel lblPrintDate = new JLabel("��ӡ����");
	private JTextField ttfPrintDate = new JTextField();

	private JPanel pnlBottom;
	private JCheckBox ckbContinue = new JCheckBox("�������");

	public PrintDataEditDialog(MainFrame mainFrame, String title,
			PrintData printData, int opt) {
		this.mainFrame = mainFrame;
		this.printData = printData;
		this.opt = opt;
		// ��ʼ������
		initPtArray();

		// ��ʼ������ؼ�
		createPnlBottom();
		createPnlBody();

		loadPrintData();

		// -----------------------------------
		// ���沼��
		pnlBody.setBorder(BorderFactory.createTitledBorder(title));

		setLayout(new BorderLayout());
		add(pnlBody, BorderLayout.CENTER);
		add(pnlBottom, BorderLayout.SOUTH);

		setTitle(title);
		setSize(800, 500);
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		setLocation(this.getLocation().x, 30);
		// �̶���С
		setResizable(false);
		setModal(true);
		setVisible(true);
	}

	private void createPnlBody() {
		pnlBody = new JPanel();

		cbbThorpId = new JComboBox(ptArray);

		Box boxBg = Box.createHorizontalBox();
		Box boxLeft = Box.createVerticalBox();
		Box boxRight = Box.createVerticalBox();

		boxLeft.add(getLayoutPanel(lblName, ttfName));
		boxRight.add(getLayoutPanel(lblSex, ttfSex));

		boxLeft.add(getLayoutPanel(lblICCode, ttfICCode));
		boxRight.add(getLayoutPanel(lblSerialNum, ttfSerialNum));

		boxLeft.add(getLayoutPanel(lblArea, ttfArea));
		boxRight.add(getLayoutPanel(lblThorpId, cbbThorpId));

		boxLeft.add(getLayoutPanel(lblThorpName, ttfThorpName));
		boxRight.add(getLayoutPanel(lblPhone, ttfPhone));

		boxLeft.add(getLayoutPanel(lblFamilyCode, ttfFamilyCode));
		boxRight.add(getLayoutPanel(lblRelationship, ttfRelationship));

		boxRight.add(getLayoutPanel(lblJ_Account, ttfJ_Account));
		boxLeft.add(getLayoutPanel(lblJ_AccountName, ttfJ_AccountName));

		boxRight.add(getLayoutPanel(lblZ_Account, ttfZ_Account));
		boxLeft.add(getLayoutPanel(lblZ_AccountName, ttfZ_AccountName));

		boxLeft.add(getLayoutPanel(lblAchieveDate, ttfAchieveDate));
		boxRight.add(getLayoutPanel(lblAge, ttfAge));

		boxLeft.add(getLayoutPanel(lblBirthDate, ttfBirthDate));
		boxRight.add(getLayoutPanel(lblPayGrade, ttfPayGrade));

		boxLeft.add(getLayoutPanel(lblPersType, ttfPersType));
		boxRight.add(getLayoutPanel(lblTotalAcct, ttfTotalAcct));

		boxLeft.add(getLayoutPanel(lblTotalPay, ttfTotalPay));
		boxRight.add(getLayoutPanel(lblTotalSubs, ttfTotalSubs));

		boxRight.add(getLayoutPanel(lblAddress, ttfAddress));
		boxLeft.add(getLayoutPanel(lblRemark, ttfRemark));

		boxLeft.add(getLayoutPanel(lblPrintFlag, ttfPrintFlag));
		ttfPrintFlag.setEditable(false);
		boxRight.add(getLayoutPanel(lblPrintDate, ttfPrintDate));
		ttfPrintDate.setEditable(false);

		boxBg.add(boxLeft);
		boxBg.add(boxRight);

		pnlBody.add(boxBg);
	}

	private JPanel getLayoutPanel(JLabel lbl, Component input) {
		JPanel layoutPanel = new JPanel();
		lbl.setPreferredSize(dimLbl);
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setPreferredSize(dimInp);
		layoutPanel.add(lbl);
		layoutPanel.add(input);
		return layoutPanel;
	}

	/**
	 * �����ײ����
	 */
	private void createPnlBottom() {
		pnlBottom = new JPanel();

		JButton btnOk = new JButton("ȷ��");
		JButton btnQuit = new JButton("ȡ��");
		JButton btnClose = new JButton("�ر�");

		JButton btnTest = new JButton("����");

		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean result = false;
				int rv = 0;
				if (validata()) {
					setPrintData();
					PrintDataDAO pddao = new PrintDataDAO();
					// ���Ϊ�޸����ݲ�����ѯ���û��Ƿ���и��²���
					if (opt == PrintDataEditDialog.UPTD_OPT) {
						rv = JOptionPane.showConfirmDialog(
								PrintDataEditDialog.this, "�Ƿ�ȷ�ϸ������ݣ�", "������ʾ��",
								JOptionPane.OK_CANCEL_OPTION,
								JOptionPane.OK_CANCEL_OPTION);
					}

					// ִ�����ݿ����
					if (rv == 0)
						result = pddao.saveOrUpdate(printData);

					// ��ʾ�û��������
					if (result) {
						// �������ݿ�ɹ�����ʾ�û�
						JOptionPane.showMessageDialog(null, "����ɹ���", "������ʾ��",
								JOptionPane.PLAIN_MESSAGE);
						//ˢ���������б�
						mainFrame.getPnlQuery().executQuery();
						if (ckbContinue.isSelected()) {
							// ���ѡ��������ӣ���ս��棬ͣ���ڵ�ǰ�Ի���
							clearData();
						} else
							// ����رնԻ���
							dispose();
					} else {
						// �������ʧ�ܣ��˳���ǰ����
						JOptionPane.showMessageDialog(null, "����ʧ�ܣ�", "������ʾ��",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
			}
		});

		btnQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int rv = JOptionPane.showConfirmDialog(
						PrintDataEditDialog.this, "δ�������ݽ���ʧ���Ƿ�ȷ���˳���", "������ʾ��",
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				// �û����ȡ����ť
				if (rv == 0)
					dispose();
			}
		});

		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		btnTest.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setPrintData();
			}
		});

//		pnlBottom.add(btnTest);

		if (opt == PrintDataEditDialog.VIEW_OPT) {
			pnlBottom.add(btnClose);
		} else {
			if (opt == PrintDataEditDialog.ADD_OPT)
				pnlBottom.add(ckbContinue);
			pnlBottom.add(btnOk);
			pnlBottom.add(btnQuit);
		}

	}

	/**
	 * ��������
	 */
	private void loadPrintData() {
		if (printData == null)
			printData = new PrintData();
		ttfArea.setText(printData.getArea());

		// Ϊ���ڴ�������ֵ
		for (int i = 0; i < cbbThorpId.getItemCount(); i++) {
			PrintThorp pt = (PrintThorp) cbbThorpId.getItemAt(cbbThorpId
					.getSelectedIndex());
			if (pt.getId() == printData.getThorpId()) {
				cbbThorpId.setSelectedIndex(cbbThorpId.getSelectedIndex());
				break;
			}
		}

		ttfThorpName.setText(printData.getThorpName());
		ttfSerialNum.setText(printData.getSerialNum());
		ttfName.setText(printData.getName());
		ttfICCode.setText(printData.getIcCode());
		ttfPhone.setText(printData.getPhone());
		ttfFamilyCode.setText(printData.getFamilyCode());
		ttfJ_Account.setText(printData.getJaccount());
		ttfJ_AccountName.setText(printData.getJaccountName());
		ttfZ_Account.setText(printData.getZaccount());
		ttfZ_AccountName.setText(printData.getZaccountName());
		ttfAge.setText(printData.getAge());
		ttfSex.setText(printData.getSex());
		ttfAchieveDate.setText(printData.getAchieveDate());
		ttfBirthDate.setText(printData.getBirthDate());
		ttfRelationship.setText(printData.getRelationship());
		ttfPayGrade.setText(printData.getPayGrade());
		ttfPersType.setText(printData.getPersType());
		ttfAddress.setText(printData.getAddress());
		ttfRemark.setText(printData.getRemark());
		ttfTotalAcct.setText(printData.getTotalAcct());
		ttfTotalPay.setText(printData.getTotalPay());
		ttfTotalSubs.setText(printData.getTotalSubs());
		ttfPrintFlag.setText(printData.getPrintFlag());
		ttfPrintDate.setText(printData.getPrintDate());
	}

	/**
	 * �������
	 */
	private void clearData() {
		ttfArea.setText("");
		// public int getThorpId()
		ttfThorpName.setText("");
		ttfSerialNum.setText("");
		ttfName.setText("");
		ttfICCode.setText("");
		ttfPhone.setText("");
		ttfFamilyCode.setText("");
		ttfJ_Account.setText("");
		ttfJ_AccountName.setText("");
		ttfZ_Account.setText("");
		ttfZ_AccountName.setText("");
		ttfAge.setText("");
		ttfSex.setText("");
		ttfAchieveDate.setText("");
		ttfBirthDate.setText("");
		ttfRelationship.setText("");
		ttfPayGrade.setText("");
		ttfPersType.setText("");
		ttfAddress.setText("");
		ttfRemark.setText("");
		ttfTotalAcct.setText("");
		ttfTotalPay.setText("");
		ttfTotalSubs.setText("");
		ttfPrintFlag.setText("");
		ttfPrintDate.setText("");
	}

	/**
	 * ΪPrintData����ֵ
	 */
	private void setPrintData() {

		printData.setArea(ttfArea.getText().trim());

		// ��ȡ���ڴ�������IDֵ
		PrintThorp pt = (PrintThorp) cbbThorpId.getItemAt(cbbThorpId
				.getSelectedIndex());
		printData.setThorpId(pt.getId());

		printData.setThorpName(ttfThorpName.getText().trim());
		printData.setSerialNum(ttfSerialNum.getText().trim());
		printData.setName(ttfName.getText().trim());
		printData.setIcCode(ttfICCode.getText().trim());
		printData.setPhone(ttfPhone.getText().trim());
		printData.setFamilyCode(ttfFamilyCode.getText().trim());
		printData.setJaccount(ttfJ_Account.getText().trim());
		printData.setJaccountName(ttfJ_AccountName.getText().trim());
		printData.setZaccount(ttfZ_Account.getText().trim());
		printData.setZaccountName(ttfZ_AccountName.getText().trim());
		printData.setAge(ttfAge.getText().trim());
		printData.setSex(ttfSex.getText().trim());
		printData.setAchieveDate(ttfAchieveDate.getText().trim());
		printData.setBirthDate(ttfBirthDate.getText().trim());
		printData.setRelationship(ttfRelationship.getText().trim());
		printData.setPayGrade(ttfPayGrade.getText().trim());
		printData.setPersType(ttfPersType.getText().trim());
		printData.setAddress(ttfAddress.getText().trim());
		printData.setRemark(ttfRemark.getText().trim());
		printData.setTotalAcct(ttfTotalAcct.getText().trim());
		printData.setTotalPay(ttfTotalPay.getText().trim());
		printData.setTotalSubs(ttfTotalSubs.getText().trim());
	}

	/**
	 * ��ʼ�����������б�
	 */
	private void initPtArray() {
		ptArray = new PrintThorpDAO().findObjArray();
	}

	/**
	 * ����У��
	 * 
	 * @return
	 */
	private boolean validata() {
		boolean result = false;
		result = true;
		return result;
	}
}
