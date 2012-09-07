/**     
 * @{#} PrintDialog.java Create on 2012-8-16 ����1:23:22     
 *     
 * Copyright (c) 2012 by ¬����.     
 */

package com.gopawpaw.kynb.module.print2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import com.gopawpaw.kynb.common.DialogUtil;

/**
 * @author ¬���� luxiangqi521@gmail.com
 * @version 1.0
 */

public class PrintDialog extends JDialog {
	private static final long serialVersionUID = -2816372067073195315L;
	private Dimension dimLbl1 = new Dimension(30, 20);
	private Dimension dimLbl2 = new Dimension(100, 20);
	private Dimension dimSpace = new Dimension(30, 20);
	private Dimension dimTtf = new Dimension(200, 20);
	private MainFrame mainFrame;

	private List<PrintItem> piList;

	private JCheckBox ckbAutoNext = new JCheckBox("�Զ�������һ����¼");

	private JScrollPane spnBody;
	private ItemPanel[] itmePanels;

	private JPanel pnlBottom;

	private Object rowData[] = new Object[BaseDataTable.columnNames.length];

	public PrintDialog(MainFrame mf, Object rowData[]) {
		this.mainFrame = mf;
		this.rowData = rowData;
		// ��س�ʼ����˳�򲻿ɱ�
		initPiList();
		createSpnBody();
		createPnlBottom();
		refreshSpnBody();

		// ------------------------------------------------------------
		// �����Ű�
		setLayout(new BorderLayout());
		spnBody.setBorder(BorderFactory.createTitledBorder("��ӡ����"));

		// add(ckbAutoNext, BorderLayout.NORTH);
		add(spnBody, BorderLayout.CENTER);
		add(pnlBottom, BorderLayout.SOUTH);

		setTitle("��ӡ׼��");
		setSize(500, spnBody.getPreferredSize().height + 100);
		DialogUtil.setDialogLocaltion(this.mainFrame, this);
		setLocation(this.getLocation().x, 50);
		// �̶���С
		setResizable(false);
		setModal(true);
		setVisible(true);
	}

	/**
	 * �����в��������
	 */
	@SuppressWarnings("static-access")
	private void createSpnBody() {
		spnBody = new JScrollPane();
		spnBody.setPreferredSize(new Dimension(this.WIDTH,
				getSpnItemPnaelHeight()));
		itmePanels = new ItemPanel[piList.size()];

		Box box = Box.createVerticalBox();
		ItemPanel itemP = null;
		int i = 0;
		for (PrintItem pi : piList) {
			itemP = new ItemPanel();
			itemP.getLblMapIndex().setText(String.valueOf(pi.getMapIndex()));
			itemP.getLblCode().setText(pi.getCode());
			itemP.getLblName().setText(pi.getName());
			if(PrintItem.SYSDATE_FLAG.equals(pi.getDefValue())) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
				itemP.getTtfValue().setText(sdf.format(new Date()));
			} else
				itemP.getTtfValue().setText(pi.getDefValue());

			box.add(itemP);
			itmePanels[i] = itemP;
			i++;
		}
		spnBody.setViewportView(box);
	}

	/**
	 * ˢ�½�������
	 */
	private void refreshSpnBody() {
		if (rowData == null)
			return;
		if (rowData.length == 0)
			return;
		ItemPanel itemP = null;
		for (int i = 0; i < itmePanels.length; i++) {
			itemP = itmePanels[i];
			String temp = itemP.getLblMapIndex().getText().trim();
			if (!"".equals(temp)) {
				if (Integer.parseInt(temp) < 0
						|| Integer.parseInt(temp) > rowData.length)
					continue;
				if (rowData[Integer.parseInt(temp)] != null)
					itemP.getTtfValue().setText(
							rowData[Integer.parseInt(temp)].toString().trim());
			}
		}
	}

	/**
	 * �����ײ����
	 */
	private void createPnlBottom() {
		pnlBottom = new JPanel();
		JButton btnPrint = new JButton("��ӡ(En)");
		JButton btnPreview = new JButton("Ԥ��");
		JButton btnClose = new JButton("�ر�");

		//���ð�ť��ʽ
		//---------------------------------------
		btnPreview.setPreferredSize(MyStyle.BTN_DIM_1);
		btnPreview.setMaximumSize(MyStyle.BTN_DIM);
		btnPreview.setFont(MyStyle.BTN_FONT_PLAIN);		
		
		btnPrint.setPreferredSize(MyStyle.BTN_DIM_1);
		btnPrint.setMaximumSize(MyStyle.BTN_DIM);
		btnPrint.setFont(MyStyle.BTN_FONT_PLAIN);	
		
		btnClose.setPreferredSize(MyStyle.BTN_DIM_1);
		btnClose.setMaximumSize(MyStyle.BTN_DIM);
		btnClose.setFont(MyStyle.BTN_FONT_PLAIN);	
		//---------------------------------------
		
		btnPrint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ִ�д�ӡ
				doPrint();
			}
		});

		//��enter����Ϊ��ӡ��ť��ݼ�
		btnPrint.registerKeyboardAction(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ִ�д�ӡ
				doPrint();
			}
		}, KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);

		btnPreview.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (itmePanels.length == 0)
					return;
				new PreviewDialog(new MyPrintable(getPrintAtomList()));
			}
		});

		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(PrintDialog.this,
						"�Ƿ�ȷ�Ϲرգ���ӡ�Ի���", "������ʾ��", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				if (rv == 0)
					dispose();
			}
		});

		pnlBottom.add(ckbAutoNext);
		pnlBottom.add(btnPrint);
		pnlBottom.add(btnClose);
		// pnlBottom.add(btnPreview);
	}

	/**
	 * ��ʼ��PrintItem�б�(piList)
	 */
	private void initPiList() {
		piList = new ArrayList<PrintItem>();
		PrintItemDAO piDao = new PrintItemDAO();
		piList = piDao.findAvailables();
	}

	/**
	 * ��ȡ�������߶�
	 * 
	 * @return
	 */
	private int getSpnItemPnaelHeight() {
		if (piList.size() < 20)
			return piList.size() * 30;
		else
			return 600;
	}

	/**
	 * ��ȡ��ӡԭ���б�
	 * 
	 * @return
	 */
	private List<PrintAtom> getPrintAtomList() {
		List<PrintAtom> printAtoms = new ArrayList<PrintAtom>();
		ItemPanel itemP = null;
		for (int i = 0; i < itmePanels.length; i++) {
			itemP = itmePanels[i];
			PrintAtom printAtom = null;
			for (PrintItem printItem : piList) {
				if (itemP.getLblCode().getText().equals(printItem.getCode())) {
					printAtom = new PrintAtom();
					printAtom.setValue(itemP.getTtfValue().getText().trim());
					printAtom.setX(printItem.getX());
					printAtom.setY(printItem.getY());
					printAtoms.add(printAtom);
				}
			}
		}
		return printAtoms;
	}

	/**
	 * ִ�д�ӡ
	 */
	private void doPrint() {
		if (itmePanels.length == 0)
			return;
		Toolkit.getDefaultToolkit().beep();

		// ��������Ѵ�ӡ����ʾ�û��Ƿ����´�ӡ
		if (rowData != null && rowData.length > 0 && rowData[25] != null) {
			if ("�Ѵ�ӡ".equals(rowData[25])) {
				int rv = JOptionPane.showConfirmDialog(PrintDialog.this,
						"�ü�¼�Ѵ�ӡ���Ƿ����´�ӡ��", "������ʾ��",
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				// �û����ȡ����ť
				if (rv == 2)
					return;
			}
		}

		//��ȡ��ӡ��Ϣ
		MyPrintable myPrintable = new MyPrintable(getPrintAtomList());

		// ִ�д�ӡ
		boolean rs1 = mainFrame.getPrinter().print(myPrintable);
		boolean rs2 = false;
		if (rs1) {
			PrintDataDAO pdDao = new PrintDataDAO();
			// data[0]ΪIDֵ ,���IDֵΪ�գ���ִ�����ݿ���²�����ֱ����ʾ��ӡ�ɹ�
			if (!"".equals(rowData[0].toString().trim())) {
				// �������ݿ�
				rs2 = pdDao.updatePrintFlag(Integer.parseInt(rowData[0]
						.toString().trim()));
				if (rs2) {
					// ��ʾ�û���ӡ�ɹ�
					JOptionPane.showMessageDialog(null, "��ӡ�ɹ���", "������ʾ��",
							JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "�������ݿ�ʧ�ܣ�", "������ʾ��",
							JOptionPane.ERROR_MESSAGE);
				}
			} else {
				// ��ʾ�û���ӡ�ɹ�
				JOptionPane.showMessageDialog(null, "��ӡ�ɹ���", "������ʾ��",
						JOptionPane.PLAIN_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null, "���Ӵ�ӡ��ʧ�ܣ�", "������ʾ��",
					JOptionPane.ERROR_MESSAGE);
		}

		// ����޷����Ӵ�ӡ������������
		if (!rs1)
			return;

		// �ж��û��Ƿ�ѡ���Զ�����ѡ��
		if (ckbAutoNext.isSelected()) {
			// �Զ�������һ����¼
			rowData = mainFrame.getSpnBDT().getSelectNextRow();
			refreshSpnBody();
		} else {
			// �û�δѡ�и��°�ť�����������������б��رմ�ӡ�Ի���
			mainFrame.getPnlQuery().executQuery();
			dispose();
		}
	}

	class ItemPanel extends JPanel {
		private static final long serialVersionUID = 7812225315955879302L;
		private JLabel lblMapIndex;// ���ر�ǩ�����ڱ�����ֵ
		private JLabel lblCode;
		private JLabel lblName;
		private JLabel lblSpace;// ռλ
		private JTextField ttfValue;

		public ItemPanel() {

			lblMapIndex = new JLabel();
			lblMapIndex.setVisible(false);

			lblCode = new JLabel();
			lblCode.setPreferredSize(dimLbl1);

			lblName = new JLabel();
			lblName.setPreferredSize(dimLbl2);
			lblName.setHorizontalAlignment(SwingConstants.RIGHT);

			lblSpace = new JLabel();
			lblSpace.setPreferredSize(dimSpace);

			ttfValue = new JTextField();
			ttfValue.setPreferredSize(dimTtf);

			Box box = Box.createHorizontalBox();
			box.add(lblCode);
			box.add(lblName);
			box.add(lblSpace);
			box.add(ttfValue);
			add(box);
		}

		public JLabel getLblName() {
			return lblName;
		}

		public void setLblName(JLabel lblName) {
			this.lblName = lblName;
		}

		public JTextField getTtfValue() {
			return ttfValue;
		}

		public void setTtfValue(JTextField ttfValue) {
			this.ttfValue = ttfValue;
		}

		public JLabel getLblCode() {
			return lblCode;
		}

		public void setLblCode(JLabel lblCode) {
			this.lblCode = lblCode;
		}

		public void setLblMapIndex(JLabel lblMapIndex) {
			this.lblMapIndex = lblMapIndex;
		}

		public JLabel getLblMapIndex() {
			return lblMapIndex;
		}
	}
}
