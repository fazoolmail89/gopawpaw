package com.gopawpaw.kynb.module.print2;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
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
	private JButton btnExport = new JButton("����");
	private JButton btnClear = new JButton("���");
	private JButton btnAdd = new JButton("����");
	private JButton btnUpd = new JButton("�޸�");
	private JButton btnDel = new JButton("ɾ��");
	private JButton btnView = new JButton("�鿴");
	private JButton btnPrint = new JButton("��ӡ");
	private JButton btnPtSet = new JButton("����");
	private JButton btnThorpMng = new JButton("��������");
	
	public OptBtnsPanel(MainFrame mf) {
		this.mainFrame = mf;
		
		//javax.swing.plaf.ButtonUI bui = new ButtonUI() {};
		//btnAdd.setUI(bui);
		
		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//�������
				BasicDataImport thisClass = new BasicDataImport(BasicDataImport.TABLE_PRINTDATA);
				thisClass.setModal(true);
				thisClass.setVisible(true);
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(mainFrame,
						"����������ݿ������в������Ƿ�ȷ��ִ�д˲�����", "�������棡", 
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				if(rv == 0)
					rv = JOptionPane.showConfirmDialog(mainFrame,
							"����������ݿ������в��������ٴ�ȷ�ϣ�", "�������棡", 
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.OK_CANCEL_OPTION);
				if(rv == 0) {
					PrintDataDAO pddao = new PrintDataDAO();
					if (pddao.cleare()) {
						JOptionPane.showMessageDialog(null, "����ɹ���", "������ʾ��",
								JOptionPane.PLAIN_MESSAGE);
						//ɾ���ɹ���ˢ�½���
						mainFrame.getPnlQuery().executQuery();
					} else
						JOptionPane.showMessageDialog(null, "���ʧ�ܣ�", "�����ļ���ʾ��",
								JOptionPane.ERROR_MESSAGE);
				}
					
				
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new PrintDataEditDialog(mainFrame,
						"��������",
						null, 
						PrintDataEditDialog.ADD_OPT);				
			}
		});
		
		btnUpd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PrintData pd = mainFrame.getSpnBDT().getSelectPrintData();
				if(pd != null && pd.getId() != null && !"".equals(pd.getId())) {
					new PrintDataEditDialog(mainFrame, 
							"�޸�����",
							pd,
							PrintDataEditDialog.UPTD_OPT);				
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, 
							"�������б���ѡ���Ӧ�����ݣ�", 
							"�����ļ���ʾ��",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PrintData pd = mainFrame.getSpnBDT().getSelectPrintData();
				if(pd != null && pd.getId() != null && !"".equals(pd.getId())) {
					new PrintDataEditDialog(mainFrame, 
							"�鿴����",
							pd,
							PrintDataEditDialog.UPTD_OPT);				
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, 
							"�������б���ѡ���Ӧ�����ݣ�", 
							"�����ļ���ʾ��",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});		
		
		btnDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = mainFrame.getSpnBDT().getSelectPrintData().getId();
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(mainFrame,
						"ִ��ɾ���������ݽ��޷��ָ����Ƿ�ȷ��ִ�иò�����", "ɾ����ʾ��", 
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.OK_CANCEL_OPTION);
				if (rv == 0) {
					PrintDataDAO pdDao = new PrintDataDAO();
					if (pdDao.delete(id)) {
						JOptionPane.showMessageDialog(null, "ɾ���ɹ���", "������ʾ��",
								JOptionPane.PLAIN_MESSAGE);
						//ɾ���ɹ���ˢ�½���
						mainFrame.getPnlQuery().executQuery();
					} else
						JOptionPane.showMessageDialog(null, "ɾ��ʧ�ܣ�", "�����ļ���ʾ��",
								JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});

		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.getSpnBDT().getSelectNextRow();
			}
		});
		
		btnPrint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new PrintDialog(mainFrame, mainFrame.getSpnBDT().getSelectRow());
			}
		});
		
		btnPtSet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new PtSetDialog(mainFrame);
			}
		});
		
		btnThorpMng.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ThorpMngDialog(mainFrame);
			}
		});
		
		Box box = Box.createVerticalBox();
		box.add(btnExport);
		box.add(btnClear);
		box.add(btnView);
		box.add(btnAdd);
		box.add(btnUpd);
		box.add(btnDel);
		box.add(btnPrint);
		box.add(btnPtSet);
		box.add(btnThorpMng);
		add(box);
	}
}
