package com.gopawpaw.kynb.module.scandatamange;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.gopawpaw.kynb.module.datascan.PoiOperatXls;
import com.gopawpaw.kynb.module.datascan.ScanItemDialog;

public class OptBtnsPanel extends JPanel {

	private static final long serialVersionUID = 7010275930680636751L;
	private ScanDataMangeFrame mainFrame = null;
	private JButton btnImport = null;
	private JButton btnExport = null;
	private JButton btnCleare = null;
	private JButton btnAdd = null;
	private JButton btnUpate = null;
	private JButton btnDelete = null;

	public OptBtnsPanel() {
		btnImport = new JButton("导入");
		btnExport = new JButton("导出");
		btnCleare = new JButton("清空");
		btnAdd = new JButton("新增");
		btnUpate = new JButton("修改");
		btnDelete = new JButton("删除");

		btnImport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String error = "";
				//弹出选择提示框
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(mainFrame,
						"导入Excel操作将会清空系统中原有数据，是否确认操作？", "导入提示！",
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.WARNING_MESSAGE);
				//确认导入信息数据
				if (rv == 0) {
					// 创建文件选择窗口
					int returnVal = mainFrame.getFilechooser().showOpenDialog(
							mainFrame);
					if (returnVal == JFileChooser.APPROVE_OPTION) {
						// 接收选中文件
						File file = mainFrame.getFilechooser()
								.getSelectedFile();
						returnVal = PoiOperatXls.checkXls(file);
						if (returnVal == 0) {
							mainFrame.executImportExcel(file);
						} else {
							error = "不是有效excel文件，请将文件“另存为”或将数据复制到新的Excel文件中，再尝试重新导入";
							Toolkit.getDefaultToolkit().beep();
							JOptionPane.showMessageDialog(null, error, "错误提示！",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			}
		});
		
		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnCleare.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new DataEditDialog();
			}
		});
		
		btnUpate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		setLayout(new FlowLayout());
		add(btnImport);
		add(btnExport);
		add(btnCleare);
		add(btnAdd);
		add(btnUpate);
		add(btnDelete);
	}

	public void setMainFrame(ScanDataMangeFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
}
