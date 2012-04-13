package com.gopawpaw.kynb.module.datascan;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OptBtnsPanel extends JPanel {

	private static final long serialVersionUID = 1110115750735407484L;
	private static DataScanFrame mainFrame = null;
	private JButton btnImportExcel = new JButton("����Excel");
	private JButton btnExportExcel = new JButton("����Excel");
	private JButton btnScanItem = new JButton("ɨ����ѡ��");
	private JButton btnScanning = new JButton("��ʼɨ��");

	public OptBtnsPanel() {
		btnImportExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �����ļ�ѡ�񴰿�
				mainFrame.getFilechooser().showOpenDialog(mainFrame);
				// ����ѡ���ļ�
				File file = mainFrame.getFilechooser().getSelectedFile();
				
				Object[][] excelData = PoiOperatXls.readXlsRTA(file);
				mainFrame.getExcelDataTablePane().refreshTableByOriginalData(excelData);
				
				//��������ĵ�һ����ΪĬ��ɨ����
				mainFrame.getSiList().clear();
				ScanItem si = new ScanItem();
				si.setDbtColumnName("v_ic");
				si.setExlColumnName(excelData[0][0].toString());
				mainFrame.getSiList().add(si);
			}
		});
		
		//-----------------------------------------------------------------------
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
				Object[][] excelData = mainFrame.getExcelDataTablePane().getHaveTitleData();
				//�����ļ�
				PoiOperatXls.writeXls(excelData, writePath);
			}
		});
		
		//-----------------------------------------------------------------------
		btnScanItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ScanItemDialog sid = new ScanItemDialog(mainFrame);
			}
		});
		
		//-----------------------------------------------------------------------
		
		btnScanning.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DataScanning ds = new DataScanning();
				//��ñ��ԭʼ���ݣ���ɨ������
				Object[][] sranResult = ds.scaning(mainFrame.getSiList(), mainFrame.getExcelDataTablePane().getOriginalData());
				//ˢ�±��
				mainFrame.getExcelDataTablePane().refreshTable(sranResult);
			}
		});
		
		setLayout(new FlowLayout());
		add(btnImportExcel);
		add(btnExportExcel);
		add(btnScanItem);
		add(btnScanning);
		setSize(50, mainFrame.HEIGHT);
	}

	public JButton getBtnImportExcel() {
		return btnImportExcel;
	}

	public void setMainFrame(DataScanFrame mainFrame) {
		OptBtnsPanel.mainFrame = mainFrame;
	}
}
