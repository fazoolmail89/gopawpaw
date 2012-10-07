package com.gopawpaw.kynb.module.print2;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.gopawpaw.kynb.module.print2.dataimport.BasicDataImport;
import com.gopawpaw.kynb.module.print2.dpmtmng.ThorpMngDialog;

/**
 * @author luxiangqi luxiangqi521@gmail.com
 * @version 1.0
 */

public class OptBtnsPanel extends JPanel {
	private static final long serialVersionUID = -1375038623430954359L;
	private MainFrame mainFrame;
	private JButton btnImport = new JButton("����");
	private JButton btnExport = new JButton("����");
	private JButton btnClear = new JButton("����ɾ��");
	private JButton btnAdd = new JButton("����");
	private JButton btnUpd = new JButton("�޸�");
	private JButton btnDel = new JButton("ɾ��");
	private JButton btnView = new JButton("�鿴");
	private JButton btnPrint = new JButton("��ӡ");
	private JButton btnPtSet = new JButton("����");
	private JButton btnThorpMng = new JButton("��������");

	public OptBtnsPanel(MainFrame mf) {
		this.mainFrame = mf;
		setBorder(BorderFactory.createTitledBorder("���ò���"));	
			
		//���ð�ť��ʽ
		//------------------------------------
		btnImport.setMaximumSize(MyStyle.BTN_DIM);
		btnExport.setMaximumSize(MyStyle.BTN_DIM);
		btnClear.setMaximumSize(MyStyle.BTN_DIM);
		btnAdd.setMaximumSize(MyStyle.BTN_DIM);
		btnUpd.setMaximumSize(MyStyle.BTN_DIM);
		btnDel.setMaximumSize(MyStyle.BTN_DIM);
		btnView.setMaximumSize(MyStyle.BTN_DIM);
		btnPrint.setMaximumSize(MyStyle.BTN_DIM);
		btnPtSet.setMaximumSize(MyStyle.BTN_DIM);
		btnThorpMng.setMaximumSize(MyStyle.BTN_DIM);

		btnImport.setFont(MyStyle.BTN_FONT_PLAIN);
		btnExport.setFont(MyStyle.BTN_FONT_PLAIN);
		btnClear.setFont(MyStyle.BTN_FONT_PLAIN);
		btnAdd.setFont(MyStyle.BTN_FONT_PLAIN);
		btnUpd.setFont(MyStyle.BTN_FONT_PLAIN);
		btnDel.setFont(MyStyle.BTN_FONT_PLAIN);
		btnView.setFont(MyStyle.BTN_FONT_BOLD);
		btnPrint.setFont(MyStyle.BTN_FONT_BOLD);
		btnPtSet.setFont(MyStyle.BTN_FONT_PLAIN);
		btnThorpMng.setFont(MyStyle.BTN_FONT_PLAIN);
		//------------------------------------

		btnImport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����û��Ƿ����
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"���ȵ������ִ�в�����",
							"�ļ�������ʾ��", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				// �������
				BasicDataImport thisClass = new BasicDataImport(
						BasicDataImport.TABLE_PRINTDATA);
				thisClass.setModal(true);
				thisClass.setVisible(true);
			}
		});
		
		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//����û��Ƿ����
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"���ȵ������ִ�в�����",
							"�ļ�������ʾ��", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				Object[][] excelData = mainFrame.getSpnBDT().getData();
				if (excelData != null && excelData.length > 0) {
					// ���ļ�������ͼ
					int returnVal = mainFrame.getFilechooser().showSaveDialog(
							mainFrame);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						// ��ȡҪ������ļ�
						File file = mainFrame.getFilechooser()
								.getSelectedFile();
						mainFrame.executExportExcel(new File(file.getPath()));
					}
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "û�����ݣ�����Ҫ������",
							"�ļ�������ʾ��", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����û��Ƿ����
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"���ȵ������ִ�в�����",
							"�ļ�������ʾ��", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
					//�����������봰��
					new DataClearDialog(mainFrame); 
			}
		});

		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����û��Ƿ����
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"���ȵ������ִ�в�����",
							"�ļ�������ʾ��", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				new PrintDataEditDialog(
						mainFrame, 
						"��������", 
						null,
						PrintDataEditDialog.ADD_OPT);
			}
		});

		btnUpd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����û��Ƿ����
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"���ȵ������ִ�в�����",
							"�ļ�������ʾ��", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				PrintData pd = mainFrame.getSpnBDT().getSelectPrintData();
				if (pd != null && pd.getId() != null && !"".equals(pd.getId())) {
					new PrintDataEditDialog(mainFrame, "�޸�����", pd,
							PrintDataEditDialog.UPTD_OPT);
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "�������б���ѡ���Ӧ�����ݣ�",
							"������ʾ��", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����û��Ƿ����
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"���ȵ������ִ�в�����",
							"�ļ�������ʾ��", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				PrintData pd = mainFrame.getSpnBDT().getSelectPrintData();
				if (pd != null && pd.getId() != null && !"".equals(pd.getId())) {
					new PrintDataEditDialog(mainFrame, "�鿴����", pd,
							PrintDataEditDialog.VIEW_OPT);
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "�������б���ѡ���Ӧ�����ݣ�",
							"������ʾ��", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����û��Ƿ����
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"���ȵ������ִ�в�����",
							"�ļ�������ʾ��", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				PrintData pd = mainFrame.getSpnBDT().getSelectPrintData();
				if (pd != null && pd.getId() != null && !"".equals(pd.getId())) {
					Toolkit.getDefaultToolkit().beep();
					int rv = JOptionPane.showConfirmDialog(mainFrame,
							"ִ��ɾ���������ݽ��޷��ָ����Ƿ�ȷ��ִ�иò�����", "ɾ����ʾ��",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.OK_CANCEL_OPTION);
					if (rv == 0) {
						PrintDataDAO pdDao = new PrintDataDAO();
						if (pdDao.delete(pd.getId())) {
							JOptionPane.showMessageDialog(null, "ɾ���ɹ���",
									"������ʾ��", JOptionPane.PLAIN_MESSAGE);
							// ɾ���ɹ���ˢ�½���
							mainFrame.getPnlQuery().executQuery();
						} else
							JOptionPane.showMessageDialog(null, "ɾ��ʧ�ܣ�",
									"�����ļ���ʾ��", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "�������б���ѡ���Ӧ�����ݣ�",
							"������ʾ��", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����û��Ƿ����
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"���ȵ������ִ�в�����",
							"�ļ�������ʾ��", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				mainFrame.getSpnBDT().getSelectNextRow();
			}
		});

		btnPrint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����û��Ƿ����
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"���ȵ������ִ�в�����",
							"�ļ�������ʾ��", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				new PrintDialog(mainFrame, mainFrame.getSpnBDT().getSelectRow());
			}
		});

		btnPtSet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����û��Ƿ����
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"���ȵ������ִ�в�����",
							"�ļ�������ʾ��", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				new PtSetDialog(mainFrame);
			}
		});

		btnThorpMng.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����û��Ƿ����
				if(mainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(
							null, 
							"���ȵ������ִ�в�����",
							"�ļ�������ʾ��", 
							JOptionPane.INFORMATION_MESSAGE);	
					return;
				}
				
				new ThorpMngDialog(mainFrame);
				mainFrame.getPnlQuery().refreshCbbDpmt();
			}
		});
		
		Box box = Box.createVerticalBox();
		box.add(btnPrint);
		box.add(btnView);
		box.add(btnImport);
		box.add(btnExport);
		box.add(btnAdd);
		box.add(btnUpd);
		box.add(btnDel);
		box.add(btnClear);
		box.add(btnPtSet);
		box.add(btnThorpMng);
		add(box);
	}
}
