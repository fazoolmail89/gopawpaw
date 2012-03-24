/**
 * 
 */
package com.gopawpaw.kynb;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Enumeration;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.gopawpaw.javax.swing.GppJTable;

/**
 * ����ʵ���˶�JTable��ɫ�Ŀ��ƣ��ṩ�����׷����� 
 * 1.ʵ���˱����������ɫ�����Ч�� 
 * 2.ʵ������һ��������ɫ���ַ�����������������Ӧ�е���ɫ
 * ���ļ���PlanetTable.java�ļ������ʹ�� 
 * @author �����
 * @since: 2011-11-14
 */
public class GppStyleTable extends GppJTable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] color = null;

	// �����趨����ɫ������
	public GppStyleTable() {
		super();
	}

	public GppStyleTable(TableModel tm) {
		super(tm);
		
		paintRow(); // ����ż�зֱ�����Ϊ��ͬ��ɫ
		// setFixColumnWidth(this);
		// �̶������п�
		// ͨ�������ͷ��������������resort data by clicking table header
		RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(
				this.getModel());
		this.setRowSorter(sorter);
		this.setIntercellSpacing(new Dimension(5, 5));
		// ���������뵥Ԫ��߿��ü�߾�
		// ���ݵ�Ԫ�ڵ����������Զ������п�resize column width accordng to content of cell
		// automatically
		fitTableColumns(this);
	}
	
	public GppStyleTable(Object[][] rowData, Object[] columnNames) {
		super(rowData, columnNames);
		
		paintRow(); // ����ż�зֱ�����Ϊ��ͬ��ɫ
		// setFixColumnWidth(this);
		// �̶������п�
		// ͨ�������ͷ��������������resort data by clicking table header
		RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(
				this.getModel());
		this.setRowSorter(sorter);
		this.setIntercellSpacing(new Dimension(5, 5));
		// ���������뵥Ԫ��߿��ü�߾�
		// ���ݵ�Ԫ�ڵ����������Զ������п�resize column width accordng to content of cell
		// automatically
		fitTableColumns(this);
	}

	public void updateModel(TableModel arg0) {
		// TODO Auto-generated method stub
		super.setModel(arg0);
		paintRow(); // ����ż�зֱ�����Ϊ��ͬ��ɫ
		// setFixColumnWidth(this);
		// �̶������п�
		// ͨ�������ͷ��������������resort data by clicking table header
		RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(
				this.getModel());
		this.setRowSorter(sorter);
		this.setIntercellSpacing(new Dimension(5, 5));
		// ���������뵥Ԫ��߿��ü�߾�
		// ���ݵ�Ԫ�ڵ����������Զ������п�resize column width accordng to content of cell
		// automatically
		fitTableColumns(this);
	}
	
	public GppStyleTable(Object[][] rowData, Object[] columnNames,
			String[] color) {
		super(rowData, columnNames);
		this.color = color;
		paintColorRow();
		setFixColumnWidth(this);
		RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(
				this.getModel());
		this.setRowSorter(sorter);
		this.setIntercellSpacing(new Dimension(5, 5));
		fitTableColumns(this);
	}

	/**
	 * ����color��������Ӧ�ַ�������ʾ����ɫ������ĳ�е���ɫ��ע�⣬JTable�п��Զ��н����������
	 * ���޷����н����������������������ɫʵ���������е����ø������е�Ԫ�����ɫ��
	 */
	public void paintRow() {
		TableColumnModel tcm = this.getColumnModel();
		for (int i = 0, n = tcm.getColumnCount(); i < n; i++) {
			TableColumn tc = tcm.getColumn(i);
			tc.setCellRenderer(new RowRenderer());
		}
	}

	public void paintColorRow() {
		TableColumnModel tcm = this.getColumnModel();
		for (int i = 0, n = tcm.getColumnCount(); i < n; i++) {
			TableColumn tc = tcm.getColumn(i);
			tc.setCellRenderer(new RowColorRenderer());
		}
	}

	/** 
	 * ��������Ϊ�̶���ȡ�//fix table column width 
	 */
	public void setFixColumnWidth(JTable table) {
		// this.setRowHeight(30);
		this.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		/**/
		// The following code can be used to fix table column width
		TableColumnModel tcm = table.getTableHeader().getColumnModel();
		for (int i = 0; i < tcm.getColumnCount(); i++) {
			TableColumn tc = tcm.getColumn(i);
			tc.setPreferredWidth(50);
			// tc.setMinWidth(100);
			tc.setMaxWidth(50);
		}
	}
	
	
	@Override
	public boolean isCellEditable(int row, int column) {
		// TODO Auto-generated method stub
		boolean b = false;
		
		if(column==0){
			b= true;
		}
		return b;
		
	}
	
	@Override
	public TableCellEditor getCellEditor(int row, int column) {
		// TODO Auto-generated method stub
		 TableCellEditor editor = super.getCellEditor(row, column);   
		  // JCheckBox   
		if ("true".equals(getValueAt(row, column).toString()) ) {   
		// editor=super.getDefaultEditor(JCheckBox.class);
			JCheckBox jcb = new JCheckBox();
			jcb.setSelected(true);
			editor = new DefaultCellEditor(jcb);
		}else if ("false".equals(getValueAt(row, column).toString())) {   
			// editor=super.getDefaultEditor(JCheckBox.class);
				JCheckBox jcb = new JCheckBox();
				jcb.setSelected(false);
				editor = new DefaultCellEditor(jcb);
		}
		
		return editor;
	}
	
	// ��Ԫ����Ⱦ
	public TableCellRenderer getCellRenderer(int row, int col) {
		TableCellRenderer renderer = super.getCellRenderer(row, col);
		Object temp = getValueAt(row, col);
		if(temp != null){
			temp = temp.toString().trim();
		}
		if ("true".equals(temp)
				|| "false".equals(temp)) {
			renderer = super.getDefaultRenderer(Boolean.class);
		}
		return renderer;
	}
	
	/**
	 * �������������Զ������п�//resize column width automatically100 *101 
	 */
	public void fitTableColumns(JTable myTable) {
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JTableHeader header = myTable.getTableHeader();
		int rowCount = myTable.getRowCount();
		Enumeration<?> columns = myTable.getColumnModel().getColumns();
		while (columns.hasMoreElements()) {
			TableColumn column = (TableColumn) columns.nextElement();
			int col = header.getColumnModel().getColumnIndex(
					column.getIdentifier());
			int width = (int) header
					.getDefaultRenderer()
					.getTableCellRendererComponent(myTable,
							column.getIdentifier(), false, false, -1, col)
					.getPreferredSize().getWidth();
			for (int row = 0; row < rowCount; row++) {
				int preferedWidth = (int) myTable
						.getCellRenderer(row, col)
						.getTableCellRendererComponent(myTable,
								myTable.getValueAt(row, col), false, false,
								row, col).getPreferredSize().getWidth();
				width = Math.max(width, preferedWidth);
			}
			header.setResizingColumn(column); // ���к���Ҫ
			column.setWidth(width + myTable.getIntercellSpacing().width+30);
			
		}
	}

	/**
	 * �����ڲ��࣬���ڿ��Ƶ�Ԫ����ɫ��ÿ������ɫ��䣬�����ж���Ϊ��ɫ����ɫ��
	 * 
	 */
	private class RowRenderer extends DefaultTableCellRenderer {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Component getTableCellRendererComponent(JTable t, Object value,
                     boolean isSelected, boolean hasFocus, int row, int column) {
           //������ż�еı���ɫ�����ڴ˸�����Ҫ�����޸�
             if (row % 2 == 0)
                 setBackground(new Color(255,250,240));
             else
            	 setBackground(Color.LIGHT_GRAY);
             //4367 4550 3193 4628
             
             return super.getTableCellRendererComponent(t, value, isSelected,
                    hasFocus, row, column);
        }
		
		@Override
		public Font getFont() {
			// TODO Auto-generated method stub
			return new Font(Font.SERIF,0,15);
		}
	}

	/**
	 * �����ڲ��࣬�ɸ���һ��ָ���ַ������������ö�Ӧ�еı���ɫ
	 */
	private class RowColorRenderer extends DefaultTableCellRenderer {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Component getTableCellRendererComponent(JTable t, Object value,
				boolean isSelected, boolean hasFocus, int row, int column) {
			// ��֧�ж������ɸ�����Ҫ�����޸�
			if (color[row].trim().equals("E")) {
				setBackground(Color.RED);
			} else if (color[row].trim().equals("H")) {
				setBackground(Color.CYAN);
			} else if (color[row].trim().equals("A")) {
				setBackground(Color.BLUE);
			} else if (color[row].trim().equals("F")) {
				setBackground(Color.ORANGE);
			} else {
				setBackground(Color.WHITE);
			}
			
			
			return super.getTableCellRendererComponent(t, value, isSelected,
					hasFocus, row, column);
		}
	}
}