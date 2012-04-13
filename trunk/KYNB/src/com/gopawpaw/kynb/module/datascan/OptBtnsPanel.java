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
	private JButton btnImportExcel = new JButton("����Excel");
	private JButton btnExportExcel = new JButton("����Excel");
	private JButton btnScanItem = new JButton("ɨ����ѡ��");
	private JButton btnScanning = new JButton("��ʼɨ��");

	public OptBtnsPanel() {
		btnImportExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �����ļ�ѡ�񴰿�
				int returnVal = mainFrame.getFilechooser().showOpenDialog(mainFrame);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
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
			}
		});
		
		//-----------------------------------------------------------------------
		btnExportExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//���ļ�������ͼ
				int returnVal = mainFrame.getFilechooser().showSaveDialog(mainFrame);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
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
					boolean rv = PoiOperatXls.writeXls(excelData, writePath);
					if(rv) {
						JDialog md = new JDialog(mainFrame);
						md.setTitle("�ļ�������");
						JLabel message = new JLabel("�ɹ������ļ���" + writePath);
						message.setFont(new Font("���� ",java.awt.Font.BOLD,14));
						md.add(message);
						md.setSize(500, 100);
						md.setVisible(true);
						md.setModal(true);
					}
				}
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
		add(btnScanItem);
		add(btnScanning);
		add(btnExportExcel);
		setSize(50, mainFrame.HEIGHT);
	}

	public JButton getBtnImportExcel() {
		return btnImportExcel;
	}

	public void setMainFrame(DataScanFrame mainFrame) {
		OptBtnsPanel.mainFrame = mainFrame;
	}
}
