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
	private JButton btnImportExcel = new JButton(" 导入Excel ");
	private JButton btnExportExcel = new JButton(" 导出Excel ");
	private JButton btnScanItem = new JButton("扫描项选择");
	private JButton btnScanning = new JButton(" 开始扫描  ");

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
				// 创建文件选择窗口
				int returnVal = mainFrame.getFilechooser().showOpenDialog(
						mainFrame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					// 接收选中文件
					File file = mainFrame.getFilechooser().getSelectedFile();
					returnVal = PoiOperatXls.checkXls(file);
					if (returnVal == 0) {
						mainFrame.executImportExcel(file);
					} else {
						error = "不是有效excel文件，请将文件“另存为”或将数据复制到新的Excel文件中，再尝试重新导入";
						Toolkit.getDefaultToolkit().beep();
						JOptionPane.showMessageDialog(null, error,
								"错误提示！", JOptionPane.ERROR_MESSAGE);
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
					// 打开文件保存视图
					int returnVal = mainFrame.getFilechooser().showSaveDialog(
							mainFrame);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						// 获取要保存的文件
						File file = mainFrame.getFilechooser()
								.getSelectedFile();
						mainFrame.executExportExcel(new File(file.getPath()));
					}
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "没有数据，不需要导出！",
							"文件保存提示！", JOptionPane.INFORMATION_MESSAGE);
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
						warning = "请先导入数据再进行扫描！";
						JOptionPane.showMessageDialog(null, warning,
								"数据扫描提示！", JOptionPane.WARNING_MESSAGE);
					} else {
						mainFrame.executlScanning();
					}					
				} else {
					warning = "数据库中无数据，请先到扫描数据管理中导入数据，在返回执行此操作！";
					JOptionPane.showMessageDialog(null, warning,
							"数据扫描提示！", JOptionPane.WARNING_MESSAGE);					
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