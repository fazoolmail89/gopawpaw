package com.gopawpaw.kynb.module.datascan2;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.gopawpaw.kynb.common.PoiOperatXls;

public class OptBtnsPanel extends JPanel {

	private static final long serialVersionUID = 1110115750735407484L;
	private static DataScanFrame2 mainFrame = null;
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

	public OptBtnsPanel(DataScanFrame2 mf) {
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
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "���ȵ��������ٽ���ɨ�裡",
							"����ɨ����ʾ��", JOptionPane.WARNING_MESSAGE);
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