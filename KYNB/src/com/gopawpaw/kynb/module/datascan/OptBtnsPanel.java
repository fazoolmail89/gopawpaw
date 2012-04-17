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

	public void setMainFrame(DataScanFrame mainFrame) {
		OptBtnsPanel.mainFrame = mainFrame;
	}

	public OptBtnsPanel() {
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
						JDialog jd = new JDialog();
						jd.setTitle("错误提示！");
						JLabel message = new JLabel(error);
						message.setFont(new Font("宋体 ", java.awt.Font.BOLD, 14));
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

				// 打开文件保存视图
				int returnVal = mainFrame.getFilechooser().showSaveDialog(
						mainFrame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					// 获取要保存的文件
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
					md.setTitle("扫描数据异常");
					JLabel message = new JLabel("无导入数据，不需要进行扫描！");
					message.setFont(new Font("宋体 ", java.awt.Font.BOLD, 14));
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
