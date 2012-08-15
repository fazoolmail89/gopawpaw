package com.gopawpaw.kynb.module.print2;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.kynb.widget.GppStyleTable;

/**
 * 
 * @author 卢向琪 luxiangqi521@gmail.com
 * @version 1.0 2012-8-14
 */
public class BaseDataTable extends JScrollPane {
	private static final long serialVersionUID = -1138977648779912371L;
	
	private static final int[] DEF_HIDDEN_COL_INDEX = {0,27};
	
	/**
	 * 表头(0-27)
	 */
	public static final Object[] columnNames = { "ID", "所属地区", "村名", "所属机构编号", "个人编号", "姓名",
			"身份证号", "联系电话", "家庭编号", "缴费银行账号", "缴费银行户名", "支付银行账号", "支付银行户名",
			"年龄", "性别", "到龄时间", "出生日期", "与户主关系", "本年缴费档次", "本年人员类别", "家庭住址",
			"备注", "累计个人账户金额", "累计个人缴费金额", "累计财政补助", "打印标记", "打印日期","村ID" };
	private Object[][] data;
	
	private DefaultTableModel dataModel;
	
	private JTable dataTable;
	
	public BaseDataTable() {
		dataModel = new DefaultTableModel(data, columnNames);
		dataTable = new GppStyleTable(dataModel) {
			private static final long serialVersionUID = 5639946875801531783L;

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		};
		
		//设置行高	
		dataTable.setRowHeight(22);
		//锁定表头
		dataTable.getTableHeader().setReorderingAllowed(false);
		
		//隐藏列
		for(int i = 0; i < BaseDataTable.DEF_HIDDEN_COL_INDEX.length; i++) {
			dataTable.getTableHeader().getColumnModel().getColumn(DEF_HIDDEN_COL_INDEX[i]).setMinWidth(0);
			dataTable.getTableHeader().getColumnModel().getColumn(DEF_HIDDEN_COL_INDEX[i]).setWidth(0);			
		}
		
		//给面板加水平滚动条
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
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
}
