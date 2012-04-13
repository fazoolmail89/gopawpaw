package com.gopawpaw.kynb.module.datascan;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.kynb.GppStyleTable;

public class ExcelDataTablePane extends JScrollPane {

	private static final long serialVersionUID = -5122156432319858282L;
	private static DataScanFrame mainFrame = null;
	private JTable excelDataTable = null;
	private Object[] columnNames = null;
	private Object[][] data = null;
	private Object[][] haveTitleData = null;
	private Object[][] originalData = null;
	private static DefaultTableModel dtm = null;
	

	public ExcelDataTablePane() {
		dtm = new DefaultTableModel(data, columnNames);
		excelDataTable = new GppStyleTable(dtm);
		excelDataTable.setRowHeight(22);
		setViewportView(excelDataTable);
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	}
    
	public void refreshTableByOriginalData(Object[][] originalData) {
		this.originalData = originalData;
    	this.haveTitleData = originalData;
    	separateTitleAndData(originalData);
		dtm = new DefaultTableModel(data, columnNames);
		((GppStyleTable) excelDataTable).updateModel(dtm);
		excelDataTable.repaint();
		excelDataTable.updateUI();		
	}
	
    /**
     * 刷新表格
     * @param haveTitleData 含有表头的二维数组
     */
    public void refreshTable(Object[][] haveTitleData) {
    	this.haveTitleData = haveTitleData;
    	separateTitleAndData(haveTitleData);
		dtm = new DefaultTableModel(data, columnNames);
		((GppStyleTable) excelDataTable).updateModel(dtm);
		excelDataTable.repaint();
		excelDataTable.updateUI(); 
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
	
	/**
	 * 分离含有表头的数组
	 * @param haveTitleData
	 */
	private void separateTitleAndData(Object[][] haveTitleData) {
		if(haveTitleData == null) {
			columnNames = new Object[0];
			data = new Object[0][0];
		} else {
			columnNames = haveTitleData[0];
			data = new Object[haveTitleData.length - 1][haveTitleData[0].length];	
			for (int i = 0; i < data.length; i++)
				data[i] = haveTitleData[i + 1];
		}
	}

	public Object[][] getHaveTitleData() {
		return haveTitleData;
	}

	public void setHaveTitleData(Object[][] haveTitleData) {
		this.haveTitleData = haveTitleData;
	}
	
	/**
	 * 获取表头
	 * @return
	 */
	public Object[] getColumnNames() {
		return columnNames;
	}

	public Object[][] getOriginalData() {
		return originalData;
	}
}
