package com.gopawpaw.kynb.module.scandatamange;

import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.widget.GppStyleTable;

public class TableScrollPane extends JScrollPane {
	private static final long serialVersionUID = -7738855786592193276L;

	private static final Object[] columnNames = { "序号", OtherData.ACOL,
			OtherData.BCOL, OtherData.CCOL, OtherData.DCOL,
			OtherData.ECOL, OtherData.FCOL, OtherData.GCOL,
			OtherData.HCOL, OtherData.ICOL, OtherData.JCOL };
	private Object[][] data = null;
	private JTable table = null;

	private static DefaultTableModel dtm = null;

	public TableScrollPane() {
		dtm = new DefaultTableModel(data, columnNames);
		table = new GppStyleTable(dtm) {
			private static final long serialVersionUID = 3798362980630566569L;

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		};
		table.setRowHeight(22);
		setViewportView(table);
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	}

	/**
	 * 刷新表格当前数据
	 * 
	 * @param haveTitleData
	 *            含有表头的二维数组
	 */
	public void refreshTable(Object[][] data) {
		this.data = data;
		dtm = new DefaultTableModel(data, columnNames);
		((GppStyleTable) table).updateModel(dtm);
		table.repaint();
		table.updateUI();
	}

	public void refreshTable(List<OtherData> list) {
		if (list != null && list.size() > 0) {
			data = new Object[list.size()][columnNames.length];
			int i = 0;
			for (OtherData odata : list) {
				data[i][0] = odata.getId();
				data[i][1] = odata.getAcol();
				data[i][2] = odata.getBcol();
				data[i][3] = odata.getCcol();
				data[i][4] = odata.getDcol();
				data[i][5] = odata.getEcol();
				data[i][6] = odata.getFcol();
				data[i][7] = odata.getGcol();
				data[i][8] = odata.getHcol();
				data[i][9] = odata.getIcol();
				data[i][10] = odata.getJcol();
				i++;
			}
			refreshTable(data);
		}
	}

	public static Object[] getColumnNames() {
		return columnNames;
	}
	
	public RowData getSelectData() {
		RowData rd = new RowData();
		int rowIndex = table.getSelectedRow();
		if(rowIndex > -1) {
			OtherData odata = new OtherData();
			for(int i = 0; i < columnNames.length; i++) {
				String colName = table.getColumnName(i);
				if(columnNames[0].equals(colName)) {
					odata.setId(dtm.getValueAt(rowIndex, i).toString());
				} else if(OtherData.ACOL.equals(colName)) {
					odata.setAcol(dtm.getValueAt(rowIndex, i).toString());
				} else if(OtherData.BCOL.equals(colName)) {
					odata.setBcol(dtm.getValueAt(rowIndex, i).toString());
				} else if(OtherData.CCOL.equals(colName)) {
					odata.setCcol(dtm.getValueAt(rowIndex, i).toString());
				} else if(OtherData.DCOL.equals(colName)) {
					odata.setDcol(dtm.getValueAt(rowIndex, i).toString());
				} else if(OtherData.ECOL.equals(colName)) {
					odata.setEcol(dtm.getValueAt(rowIndex, i).toString());
				} else if(OtherData.FCOL.equals(colName)) {
					odata.setFcol(dtm.getValueAt(rowIndex, i).toString());
				} else if(OtherData.GCOL.equals(colName)) {
					odata.setGcol(dtm.getValueAt(rowIndex, i).toString());
				} else if(OtherData.HCOL.equals(colName)) {
					odata.setHcol(dtm.getValueAt(rowIndex, i).toString());
				} else if(OtherData.ICOL.equals(colName)) {
					odata.setIcol(dtm.getValueAt(rowIndex, i).toString());
				} else if(OtherData.JCOL.equals(colName)) {
					odata.setJcol(dtm.getValueAt(rowIndex, i).toString());
				}
			}
			rd.setRowIndex(rowIndex);
			rd.setOdata(odata);
		}
		return rd;
	}
	
	/**
	 * 返回不含第一列的字段名数组
	 * @return
	 */
	public static Object[] getColumnNamesNoFirst() {
		Object[] result = new Object[columnNames.length - 1];
		for(int i = 0; i < result.length; i++)
			result[i] = columnNames[i + 1];
		return result;
	}
	
	public Object[][] getData() {
		return data;
	}
}

class RowData {
	int rowIndex = -1;
	OtherData odata;
	public int getRowIndex() {
		return rowIndex;
	}
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}
	public OtherData getOdata() {
		return odata;
	}
	public void setOdata(OtherData odata) {
		this.odata = odata;
	}
}
