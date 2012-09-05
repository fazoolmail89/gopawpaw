package com.gopawpaw.kynb.module.print2.dpmtmng;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.kynb.widget.GppStyleTable;

/**	
 *  
 * @author 卢向琪 luxiangqi521@gmail.com
 * @version 1.0 2012-9-5
 */
public class TableScrollPane extends JScrollPane {
	private static final long serialVersionUID = 750160184568626498L;

	private ThorpMngDialog fdialog;
	
	/** 组织机构表表头*/
	public static Object[] columnNames = {"ID", "名称"};
	
	/** 组织机构表数据 */
	private Object[][] data;
	
	private DefaultTableModel dataModel;
	private JTable dataTable;	
	
	public TableScrollPane(ThorpMngDialog f) {
		this.fdialog = f;
		dataModel = new DefaultTableModel(data, columnNames);
		dataTable = new GppStyleTable(dataModel) {
			private static final long serialVersionUID = 5639946875801531783L;

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		};
		
		//添加表格选中行监听事件
		dataTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			/**
			 * 每次选择新行，该方法执行两次
			 */
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int rowIndex = dataTable.getSelectedRow();
				if(rowIndex > -1) 
					fdialog.getPnlQuery().getTtfName().setText(
						dataTable.getModel().getValueAt(rowIndex, 1).toString());
			}
		});
		
		//设置行高	
		dataTable.setRowHeight(22);
		//锁定表头
		dataTable.getTableHeader().setReorderingAllowed(false);
		//设置只能禁止同时选中多行
		dataTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//给面板加水平滚动条
		setViewportView(dataTable);
	}
	
	/**
	 * 刷新表格当前数据
	 */
	public void refreshTable(Object[][] data) {
		this.data = data;
		dataModel = new DefaultTableModel(data, columnNames);
		((GppStyleTable) dataTable).updateModel(dataModel);
		dataTable.repaint();
		dataTable.updateUI();
	}
	
	/**
	 * 获取选中行
	 * @return
	 */
	public PrintThorp getSelectRow() {
		PrintThorp pt = null;
		int rowIndex = dataTable.getSelectedRow();
		if(rowIndex > -1) {	
			pt = new PrintThorp();
			pt.setId(Integer.parseInt(dataTable.getModel().getValueAt(rowIndex, 0).toString()));
			pt.setName(dataTable.getModel().getValueAt(rowIndex, 1).toString());
		}
		return pt;
	}
}
