package com.gopawpaw.kynb.module.scandatamange;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.kynb.widget.GppStyleTable;

public class TableScrollPane extends JScrollPane {
	private static final long serialVersionUID = -7738855786592193276L;

	private ScanDataMangeFrame mainFrame = null;
	
	private Object[] columnNames = null;
	private Object[][] data = null;
	private JTable table = null;
	
	private static DefaultTableModel dtm = null;
	
	public TableScrollPane() {
		dtm = new DefaultTableModel(data, columnNames);
		table = new GppStyleTable(dtm);
		table = new JTable(dtm);
		table.setRowHeight(22);
		setViewportView(table);
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);		
	}
}
