package com.gopawpaw.kynb.module.datascan;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.kynb.GppStyleTable;

public class ExcelDataTablePane extends JScrollPane {

	private static final long serialVersionUID = -5122156432319858282L;
	private static DataScanFrame mainFrame = null;
	private JTable excelDataTable = null;
	private static Object[] columnNames = null;
	private static Object[][] data = null;
	private static DefaultTableModel dtm = null;
	

	public ExcelDataTablePane() {
		dtm = new DefaultTableModel(data, columnNames);
		excelDataTable = new GppStyleTable(dtm);
		excelDataTable.setRowHeight(22);
		setViewportView(excelDataTable);
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	}

    public void refreshTable(Object[][] data, Object[] columnNames) {
		this.data = data;
		this.columnNames = columnNames;
		refreshTable();
    }
    
    public void refreshTable(Object[][] data) {
    	this.data = data;
    	refreshTable();
    }

    public void refreshTable() {
		dtm = new DefaultTableModel(data, columnNames);
		((GppStyleTable) excelDataTable).updateModel(dtm);
		excelDataTable.repaint();
		excelDataTable.updateUI();    	
    }
    
	public static DataScanFrame getMainFrame() {
		return mainFrame;
	}

	public static void setMainFrame(DataScanFrame mainFrame) {
		ExcelDataTablePane.mainFrame = mainFrame;
	}

	public JTable getExcelDataTable() {
		return excelDataTable;
	}

	public void setExcelDataTable(JTable excelDataTable) {
		this.excelDataTable = excelDataTable;
	}

	public static Object[] getColumnNames() {
		return columnNames;
	}

	public static void setColumnNames(Object[] columnNames) {
		ExcelDataTablePane.columnNames = columnNames;
	}

	public static Object[][] getData() {
		return data;
	}

	public static void setData(Object[][] data) {
		ExcelDataTablePane.data = data;
	}
}
