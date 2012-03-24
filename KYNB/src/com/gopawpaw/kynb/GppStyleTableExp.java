package com.gopawpaw.kynb;


import java.util.Vector;

import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JCheckBox;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import com.gopawpaw.javax.swing.GppJTable;


public class GppStyleTableExp extends GppJTable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public GppStyleTableExp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GppStyleTableExp(int arg0, int arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public GppStyleTableExp(Object[][] arg0, Object[] arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public GppStyleTableExp(TableModel arg0, TableColumnModel arg1,
			ListSelectionModel arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	public GppStyleTableExp(TableModel arg0, TableColumnModel arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public GppStyleTableExp(TableModel arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public GppStyleTableExp(Vector<?> arg0, Vector<?> arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	// 根据值来设置单元格类型
	public TableCellEditor getCellEditor(int row, int col) {
		TableCellEditor editor = super.getCellEditor(row, col);
		// JCheckBox
		if ("true".equals(getValueAt(row, col).toString())
				|| "false".equals(getValueAt(row, col).toString())) {
			// editor=super.getDefaultEditor(JCheckBox.class);
			editor = new DefaultCellEditor(new JCheckBox());
		}
		// JComboBox
//		if ("red".equals(getValueAt(row, col).toString())
//				|| "green".equals(getValueAt(row, col).toString())
//				|| "blue".equals(getValueAt(row, col).toString())) {
//			editor = new DefaultCellEditor(getJComboBox());
//		}
		// 字数大于10 使用JTextArea
//		if (getValueAt(row, col).toString().length() > 10) {
//			editor = new JTextAreaEditor();
//		}
		return editor;
	}

	// 单元格渲染
	public TableCellRenderer getCellRenderer(int row, int col) {
		TableCellRenderer renderer = super.getCellRenderer(row, col);
		if ("true".equals(getValueAt(row, col).toString())
				|| "false".equals(getValueAt(row, col).toString())) {
			renderer = super.getDefaultRenderer(Boolean.class);
		}
		return renderer;
	}

	// 第一行不可编辑
	public boolean isCellEditable(int row, int col) {
		return (col != 0);
	}

	/*
	 * 重写方法 单选模式 (non-Javadoc)
	 * 
	 * @see javax.swing.JTable#createDefaultSelectionModel()
	 */
	protected ListSelectionModel createDefaultSelectionModel() {
		DefaultListSelectionModel defaultListSelectionModel = new DefaultListSelectionModel();
		defaultListSelectionModel
				.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		return defaultListSelectionModel;
	}

}
