package com.gopawpaw.kynb.module.datascan2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class TableDemo extends JFrame {
	private static final long serialVersionUID = -5769728389355971410L;
	private static String[] values = new String[] { "1", "2", "3", "4" };
	private static JComboBox cbb = new JComboBox(values);

	private static String[] columnNames = { "选择", "数据库字段", "Excel字段" };
	private static Object[][] data = { { new Boolean(false), "身份证号", "1" },
			{ new Boolean(false), "姓名", "2" } };

	private static TableModel table = null;
	private static DefaultTableModel dtm = null;

	public static void main(String[] argv) throws Exception {
		TableDemo myTableModel = new TableDemo();
		SwingConsole.run(myTableModel, 800, 600);
	}

	public TableDemo() {
		table = new TableModel() {
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				//禁止编辑数据库字段名对应列
				boolean f = (columnIndex == 1) ? false : true;
				return f;
			}
		};
		dtm = new DefaultTableModel(data, columnNames);
		table.setComboColume(2, new DefaultCellEditor(cbb));
		table.setModel(dtm);
		table.updateUI();
		
		JScrollPane jp = new JScrollPane(table);
		jp.setViewportView(table);
		jp.setSize(400, 300);

		JPanel panel = new JPanel();
		JButton button = new JButton("测试");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(dtm.getValueAt(1, 1));
				System.out.println(dtm.getValueAt(1, 2));
			}
		});

		panel.add(button);
		setLayout(new BorderLayout());
		add(jp, BorderLayout.CENTER);
		add(panel, BorderLayout.NORTH);

		getContentPane().add(jp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
	}
}
