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
	private JButton btnImportExcel = new JButton("导入Excel");
	private JButton btnExportExcel = new JButton("导出Excel");
	private JButton btnScanItem = new JButton("扫描项选择");
	private JButton btnScanning = new JButton("开始扫描");

	public OptBtnsPanel() {
		btnImportExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 创建文件选择窗口
				int returnVal = mainFrame.getFilechooser().showOpenDialog(mainFrame);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					// 接收选中文件
					File file = mainFrame.getFilechooser().getSelectedFile();
					
					Object[][] excelData = PoiOperatXls.readXlsRTA(file);
					mainFrame.getExcelDataTablePane().refreshTableByOriginalData(excelData);
					
					//将导入表格的第一列做为默认扫描项
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
				//打开文件保存视图
				int returnVal = mainFrame.getFilechooser().showSaveDialog(mainFrame);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					//获取要保存的文件
					File file = mainFrame.getFilechooser().getSelectedFile();
					//给文件名加上 ".xls" 后缀
					String fileName = mainFrame.getFilechooser().getName(file)
							+ ".xls";
					//拼接完整的文件保存路径
					String writePath = mainFrame.getFilechooser()
							.getCurrentDirectory().getAbsolutePath()
							+ "\\" + fileName;
					//获取文件保存的表格数据
					Object[][] excelData = mainFrame.getExcelDataTablePane().getHaveTitleData();
					//保存文件
					boolean rv = PoiOperatXls.writeXls(excelData, writePath);
					if(rv) {
						JDialog md = new JDialog(mainFrame);
						md.setTitle("文件保存结果");
						JLabel message = new JLabel("成功保存文件：" + writePath);
						message.setFont(new Font("宋体 ",java.awt.Font.BOLD,14));
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
				//获得表格原始数据，并扫描数据
				Object[][] sranResult = ds.scaning(mainFrame.getSiList(), mainFrame.getExcelDataTablePane().getOriginalData());
				//刷新表格
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
