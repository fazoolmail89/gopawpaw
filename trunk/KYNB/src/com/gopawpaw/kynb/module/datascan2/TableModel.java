package com.gopawpaw.kynb.module.datascan2;

import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 * 带有下拉框的表格模板
 * @author lxq
 *
 */
public class TableModel extends JTable {
	private static final long serialVersionUID = -7437204828830249386L;
	int colIndex = -1;
	TableCellEditor cellEditor;

	public void setComboColume(int colIndex, TableCellEditor cellEditor) {
		this.colIndex = colIndex;
		this.cellEditor = cellEditor;
	}

	@Override
	public TableCellEditor getCellEditor(int row, int column) {
		if (column == colIndex && cellEditor != null) {
			return cellEditor;
		}
		return super.getCellEditor(row, column);
	}

	@SuppressWarnings("unchecked")
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
}
