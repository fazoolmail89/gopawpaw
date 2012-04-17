package com.gopawpaw.kynb.module.datascan;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OptBtnsPanel extends JPanel {

	private static final long serialVersionUID = 1110115750735407484L;
	private static DataScanFrame mainFrame = null;
	private JButton btnImportExcel = new JButton(" ����Excel ");
	private JButton btnExportExcel = new JButton(" ����Excel ");
	private JButton btnScanItem = new JButton("ɨ����ѡ��");
	private JButton btnScanning = new JButton(" ��ʼɨ��  ");

	public JButton getBtnExportExcel() {
		return btnExportExcel;
	}

	public JButton getBtnScanItem() {
		return btnScanItem;
	}

	public JButton getBtnScanning() {
		return btnScanning;
	}

	public void setBtnImportExcel(JButton btnImportExcel) {
		this.btnImportExcel = btnImportExcel;
	}

	public JButton getBtnImportExcel() {
		return btnImportExcel;
	}

	public void setMainFrame(DataScanFrame mainFrame) {
		OptBtnsPanel.mainFrame = mainFrame;
	}

	public OptBtnsPanel() {
		btnImportExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String error = "";
				// �����ļ�ѡ�񴰿�
				int returnVal = mainFrame.getFilechooser().showOpenDialog(
						mainFrame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					// ����ѡ���ļ�
					File file = mainFrame.getFilechooser().getSelectedFile();
					returnVal = PoiOperatXls.checkXls(file);
					if (returnVal == 0) {
						mainFrame.executImportExcel(file);
					} else {
						error = "������Чexcel�ļ����뽫�ļ������Ϊ�������ݸ��Ƶ��µ�Excel�ļ��У��ٳ������µ���";
						JDialog jd = new JDialog();
						jd.setTitle("������ʾ��");
						JLabel message = new JLabel(error);
						message.setFont(new Font("���� ", java.awt.Font.BOLD, 14));
						jd.add(message);
						DataScanFrame.setDialogLocaltion(jd);
						jd.setSize(600, 90);
						jd.setVisible(true);
						jd.setModal(true);
					}
				}
			}
		});

		// -----------------------------------------------------------------------
		btnExportExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// ���ļ�������ͼ
				int returnVal = mainFrame.getFilechooser().showSaveDialog(
						mainFrame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					// ��ȡҪ������ļ�
					File file = mainFrame.getFilechooser().getSelectedFile();

					mainFrame.executExportExcel(new File(file.getPath()));
				}
			}
		});

		// -----------------------------------------------------------------------
		btnScanItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ScanItemDialog(mainFrame);
			}
		});

		// -----------------------------------------------------------------------

		btnScanning.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object[][] data = mainFrame.getExcelDataTablePane()
						.getOriginalData();
				if (data == null || data.length < 1) {
					JDialog md = new JDialog(mainFrame);
					md.setTitle("ɨ�������쳣");
					JLabel message = new JLabel("�޵������ݣ�����Ҫ����ɨ�裡");
					message.setFont(new Font("���� ", java.awt.Font.BOLD, 14));
					md.add(message);
					DataScanFrame.setDialogLocaltion(md);
					md.setSize(500, 100);
					md.setVisible(true);
					md.setModal(true);
				} else {
					mainFrame.executlScanning();
				}
			}
		});

		setLayout(new FlowLayout());
		add(btnImportExcel);
		add(btnScanItem);
		add(btnScanning);
		add(btnExportExcel);
	}
}
