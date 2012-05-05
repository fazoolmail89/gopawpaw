package com.gopawpaw.kynb.module.scandatamange;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.gopawpaw.kynb.common.PoiOperatXls;

public class OptBtnsPanel extends JPanel {

	private static final long serialVersionUID = 7010275930680636751L;
	private ScanDataMangeFrame mainFrame;
	private JButton btnImport = null;
	private JButton btnExport = null;
	private JButton btnCleare = null;
	private JButton btnAdd = null;
	private JButton btnUpate = null;
	private JButton btnDelete = null;

	public OptBtnsPanel(ScanDataMangeFrame mf) {
		this.mainFrame = mf;
		btnImport = new JButton("����");
		btnExport = new JButton("����");
		btnCleare = new JButton("���");
		btnAdd = new JButton("����");
		btnUpate = new JButton("�޸�");
		btnDelete = new JButton("ɾ��");

		btnImport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String error = "";
				//����ѡ����ʾ��
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(mainFrame,
						"����Excel�����������ϵͳ��ԭ�����ݣ��Ƿ�ȷ�ϲ�����", "������ʾ��",
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.WARNING_MESSAGE);
				//ȷ�ϵ�����Ϣ����
				if (rv == 0) {
					// �����ļ�ѡ�񴰿�
					int returnVal = mainFrame.getFilechooser().showOpenDialog(
							mainFrame);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						// ����ѡ���ļ�
						File file = mainFrame.getFilechooser()
								.getSelectedFile();
						returnVal = PoiOperatXls.checkXls(file);
						if (returnVal == 0) {
							mainFrame.executImportExcel(file);
						} else {
							error = "������Чexcel�ļ����뽫�ļ������Ϊ�������ݸ��Ƶ��µ�Excel�ļ��У��ٳ������µ���";
							Toolkit.getDefaultToolkit().beep();
							JOptionPane.showMessageDialog(null, error, "������ʾ��",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			}
		});
		
		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnCleare.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new DataEditDialog(mainFrame);
			}
		});
		
		btnUpate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RowData rd = mainFrame.getSpnTable().getSelectData();
				if(rd.getOdata() != null ) {
					new DataEditDialog(mainFrame, rd);
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "����ѡ������", "������ʾ��",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RowData rd = mainFrame.getSpnTable().getSelectData();
				Toolkit.getDefaultToolkit().beep();
				if(rd.getOdata() != null ) {
					Toolkit.getDefaultToolkit().beep();
					int rv = JOptionPane.showConfirmDialog(mainFrame,
							"�Ƿ�Ҫɾ��ѡ�����ݣ�", "������ʾ��",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.WARNING_MESSAGE);
					if(rv == 0) {
						DataOpertor dot = new DataOpertor();
						if(dot.deleteOData(rd.getOdata())) {
							JOptionPane.showMessageDialog(null, "ɾ���ɹ�", "������ʾ��",
									JOptionPane.PLAIN_MESSAGE);		
							//ˢ�±��
							mainFrame.getPnlQuery().executQuery();
						} else {
							JOptionPane.showMessageDialog(null, "ɾ��ʧ��", "������ʾ��",
									JOptionPane.ERROR_MESSAGE);						
						}						
					}
				} else {
					JOptionPane.showMessageDialog(null, "����ѡ������", "������ʾ��",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		setLayout(new FlowLayout());
		add(btnImport);
		//add(btnExport);
		//add(btnCleare);
		add(btnAdd);
		add(btnUpate);
		add(btnDelete);
	}
}
