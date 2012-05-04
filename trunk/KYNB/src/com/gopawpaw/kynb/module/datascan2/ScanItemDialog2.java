package com.gopawpaw.kynb.module.datascan2;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class ScanItemDialog2 extends JDialog {
	private static final long serialVersionUID = 4415882543160849922L;
	private DataScanFrame2 mainFrame;
	private JScrollPane spnMain;
	private TableModel table;
	
	private Object[] columnNames = {"选择", "数据库字段", "数据示例", "Excel表格列名"};
	private Object[][] data;
	private DefaultTableModel dataModel;
	
	private static String[] values = new String[] { "1", "2", "3", "4" };
	
	private String[] cbbItem = null;
	private static JComboBox cbb = new JComboBox(values);
	
	private JPanel pnlButton ;
	private JButton btnOk;
	private JButton btnQuit;
	
	public ScanItemDialog2(DataScanFrame2 mainFrame) {
		this.mainFrame = mainFrame;
		initData(DataScanFrame2.getScanItemList());
		setTitle("扫描项选择对话框");

		// 初始化默认值

		setLayout(new BorderLayout());
		add(getSpnMain(), BorderLayout.CENTER);
		add(getPnlButton(), BorderLayout.SOUTH);
		
		setSize(600, 320);
		DataScanFrame2.setDialogLocaltion(this);
		setModal(true);
		setVisible(true);
	}
	
	private JScrollPane getSpnMain() {
		spnMain = new JScrollPane();
		spnMain.setViewportView(getTable());
		return spnMain;
	}
	
	private TableModel getTable() {
		table = new TableModel() {
			private static final long serialVersionUID = 3780320431022520472L;
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				//设置可编辑列
				boolean canEdit = false;
				if(columnIndex == 0 || columnIndex == 3) canEdit = true;
				return canEdit;
			}
		};
		
		dataModel = new DefaultTableModel(data, columnNames);
		table.setComboColume(3, new DefaultCellEditor(cbb));
		table.setModel(dataModel);
		table.setRowHeight(22);
		return table;
	}
	
	private JPanel getPnlButton() {
		pnlButton = new JPanel();
		btnOk = new JButton("确定");
		btnQuit = new JButton("取消");

		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 回写主界面的ScanMap
				//returnWriteScanMap();
				dispose();
			}
		});

		btnQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				int rv = JOptionPane.showConfirmDialog(ScanItemDialog2.this,
						"是否取消操作？", "退出提示！", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.WARNING_MESSAGE);
				if (rv == 0) {
					dispose();
				}
			}
		});
		pnlButton.add(btnOk);
		pnlButton.add(btnQuit);

		return pnlButton;
	}
	
	private void initData(List<ScanItem> lsi) {
		data = new Object[lsi.size()][4];
		int i = 0;
		for(ScanItem si : lsi) {
			data[i][0] = si.isCheck();
			data[i][1] = si.getDbtColumnName();
			data[i][2] = si.getDbtExample();
			data[i][3] = si.getExcelColumnName();
			i++;
		}
	}
}
