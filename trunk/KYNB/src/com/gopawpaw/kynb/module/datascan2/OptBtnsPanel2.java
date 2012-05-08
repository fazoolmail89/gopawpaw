package com.gopawpaw.kynb.module.datascan2;

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

public class OptBtnsPanel2 extends JPanel {

	private static final long serialVersionUID = 1110115750735407484L;
	private static DataScanFrame2 mainFrame;
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

	@SuppressWarnings("static-access")
	public OptBtnsPanel2(DataScanFrame2 mf) {
		this.mainFrame = mf;
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
						Toolkit.getDefaultToolkit().beep();
						JOptionPane.showMessageDialog(null, error,
								"������ʾ��", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		// -----------------------------------------------------------------------
		btnExportExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Object[][] excelData = mainFrame.getExcelDataTablePane()
						.getHaveTitleData();
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

		// -----------------------------------------------------------------------
		btnScanItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ScanItemDialog2(mainFrame);
			}
		});

		// -----------------------------------------------------------------------

		btnScanning.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String warning = "";
				Object[][] dbData = mainFrame.getDbDataPane().getData();
				if(dbData != null && dbData.length > 0) {
					Object[][] data = mainFrame.getExcelDataTablePane()
							.getOriginalData();
					if (data == null || data.length < 1) {
						warning = "���ȵ��������ٽ���ɨ�裡";
						JOptionPane.showMessageDialog(null, warning,
								"����ɨ����ʾ��", JOptionPane.WARNING_MESSAGE);
					} else {
						mainFrame.executlScanning();
					}					
				} else {
					warning = "���ݿ��������ݣ����ȵ�ɨ�����ݹ����е������ݣ��ڷ���ִ�д˲�����";
					JOptionPane.showMessageDialog(null, warning,
							"����ɨ����ʾ��", JOptionPane.WARNING_MESSAGE);					
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