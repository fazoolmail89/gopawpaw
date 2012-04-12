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
	private JButton btnImportExcel = new JButton("导入Excel");
	private JButton btnExportExcel = new JButton("导出Excel");

	public OptBtnsPanel() {
		btnImportExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 创建文件选择窗口
				mainFrame.getFilechooser().showOpenDialog(mainFrame);
				// 接受选中文件
				File file = mainFrame.getFilechooser().getSelectedFile();
				
				System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));				
				
				Object[][] excelRow = PoiOperatXls.readXlsRTA(file);
				if (excelRow != null) {
					Object[] columnNames = excelRow[0];
					Object[][] data = new Object[excelRow.length - 1][];
					for (int i = 0; i < data.length; i++)
						data[i] = excelRow[i + 1];
					//刷新对应的表格数据
					mainFrame.getExcelDataTablePane().refreshTable(data,
							columnNames);
				}
				
				System.out.println("总数据量：" + excelRow.length);
				System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
			}
		});

		btnExportExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//打开文件保存视图
				mainFrame.getFilechooser().showSaveDialog(mainFrame);
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
				Object[] columnNames = mainFrame.getExcelDataTablePane().getColumnNames();
				Object[][] data = mainFrame.getExcelDataTablePane().getData();
				Object[][] excelRow = new Object[data.length + 1][];
				for(int i = 0; i < excelRow.length; i++) {
					if(i == 0) excelRow[i] = columnNames;
					else excelRow[i] = data[i - 1];
				}
				//保存文件
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
