package com.gopawpaw.kynb.module.datascan;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OptBtnsPanel extends JPanel {

	private static final long serialVersionUID = 1110115750735407484L;
	private static DataScanFrame mainFrame = null;
	private JButton btnImportExcel = new JButton("����Excel");
	private JButton btnExportExcel = new JButton("����Excel");

	public OptBtnsPanel() {
		btnImportExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �����ļ�ѡ�񴰿�
				mainFrame.getFilechooser().showOpenDialog(mainFrame);
				// ����ѡ���ļ�
				File file = mainFrame.getFilechooser().getSelectedFile();
				
				System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));				
				
				Object[][] excelRow = PoiOperatXls.readXlsRTA(file);
				if (excelRow != null) {
					Object[] columnNames = excelRow[0];
					Object[][] data = new Object[excelRow.length - 1][];
					for (int i = 0; i < data.length; i++)
						data[i] = excelRow[i + 1];
					//ˢ�¶�Ӧ�ı������
					mainFrame.getExcelDataTablePane().refreshTable(data,
							columnNames);
				}
				
				System.out.println("����������" + excelRow.length);
				System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
			}
		});

		btnExportExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//���ļ�������ͼ
				mainFrame.getFilechooser().showSaveDialog(mainFrame);
				//��ȡҪ������ļ�
				File file = mainFrame.getFilechooser().getSelectedFile();
				//���ļ������� ".xls" ��׺
				String fileName = mainFrame.getFilechooser().getName(file)
						+ ".xls";
				//ƴ���������ļ�����·��
				String writePath = mainFrame.getFilechooser()
						.getCurrentDirectory().getAbsolutePath()
						+ "\\" + fileName;
				//��ȡ�ļ�����ı������
				Object[] columnNames = mainFrame.getExcelDataTablePane().getColumnNames();
				Object[][] data = mainFrame.getExcelDataTablePane().getData();
				Object[][] excelRow = new Object[data.length + 1][];
				for(int i = 0; i < excelRow.length; i++) {
					if(i == 0) excelRow[i] = columnNames;
					else excelRow[i] = data[i - 1];
				}
				//�����ļ�
				PoiOperatXls.writeXls(excelRow, writePath);
			}
		});
		
		setLayout(new FlowLayout());
		add(btnImportExcel);
		add(btnExportExcel);
		setSize(50, mainFrame.HEIGHT);
	}

	public JButton getBtnImportExcel() {
		return btnImportExcel;
	}

	public void setBtnImporttExcel(JButton btnImportExcel) {
		this.btnImportExcel = btnImportExcel;
	}

	public DataScanFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(DataScanFrame mainFrame) {
		OptBtnsPanel.mainFrame = mainFrame;
	}
}
