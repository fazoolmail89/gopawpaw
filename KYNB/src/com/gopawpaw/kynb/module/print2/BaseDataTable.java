package com.gopawpaw.kynb.module.print2;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.kynb.widget.GppStyleTable;

/**
 * 
 * @author 卢向琪 luxiangqi521@gmail.com
 * @version 1.0 2012-8-14
 */
public class BaseDataTable extends JScrollPane {
	private static final long serialVersionUID = -1138977648779912371L;
	
	/**
	 * 表头(0-27)
	 */
	public static final Object[] columnNames = { "ID", "所属地区", "村名", "所属机构编号", "个人编号", "姓名",
			"身份证号", "联系电话", "家庭编号", "缴费银行账号", "缴费银行户名", "支付银行账号", "支付银行户名",
			"年龄", "性别", "到龄时间", "出生日期", "与户主关系", "本年缴费档次", "本年人员类别", "家庭住址",
			"备注", "累计个人账户金额", "累计个人缴费金额", "累计财政补助", "打印标记", "打印日期","村ID" };
	
	/**
	 * 列表数据，只有执行查询的时候才会刷新
	 */
	private Object[][] data;
	
	private DefaultTableModel dataModel;
	
	private JTable dataTable;
	
	public JTable getDataTable() {
		return dataTable;
	}

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
		//设置只能禁止同时选中多行
		dataTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//隐藏列
/*		for(int i = 0; i < BaseDataTable.DEF_HIDDEN_COL_INDEX.length; i++) {
			dataTable.getTableHeader().getColumnModel().getColumn(DEF_HIDDEN_COL_INDEX[i]).setMinWidth(0);
			dataTable.getTableHeader().getColumnModel().getColumn(DEF_HIDDEN_COL_INDEX[i]).setWidth(0);			
		}*/
		
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
	
	/**
	 * 刷新表格当前数据
	 */
	private void refreshTable() {
		((GppStyleTable) dataTable).updateModel(dataModel);
		dataTable.repaint();
		dataTable.updateUI();
	}
	
	/**
	 * 移除已打印记录，获取下一行记录，到列表尽头自动回选
	 * @return
	 */
	public Object[] getSelectNextRow() {
		if(dataTable == null) return null;
		if(dataTable.getRowCount() == 0) return null;
		int selIndex = dataTable.getSelectedRow();
		if(selIndex > -1 && selIndex < dataTable.getRowCount()) {
			//删除选中行
			dataModel.removeRow(selIndex);
			//刷新表格
			refreshTable();
			//重新选中行，如果达到最后一行，自动回选
			if(selIndex >= dataTable.getRowCount())
				selIndex--;
			dataTable.changeSelection(selIndex, 0, false, false);
			return getRowData(selIndex);	
		} else {
			return null;
		}		
	}
	
	/**
	 * 获取选中行
	 * @return
	 */
	public Object[] getSelectRow() {
		if(dataTable == null) return null;
		if(dataTable.getRowCount() == 0) return null;
		int selIndex = dataTable.getSelectedRow();
		if(selIndex > -1 && selIndex < dataTable.getRowCount()) {
			return getRowData(selIndex);	
		} else {
			return null;
		}
	}
	
	public PrintData getSelectPrintData() {
		int selIndex = dataTable.getSelectedRow();
		return getSelectPrintData(selIndex);
	}
	
	/**
	 * 获取选中行
	 * @param selIndex
	 * @return
	 */	
	private Object[] getRowData(int selIndex) {
		Object[] rowData = new Object[columnNames.length];
		if(selIndex > -1 && selIndex < dataTable.getRowCount()) {
			for(int i = 0; i < columnNames.length; i++) {
				rowData[i] = dataTable.getValueAt(selIndex, i).toString().trim();
			}
		}
		return rowData;
	}
	
	/**
	 * 获取选中行
	 * @param selIndex
	 * @return
	 */
	private PrintData getSelectPrintData(int selIndex) {
		PrintData printData = null;
		if(selIndex > -1 && selIndex < dataTable.getRowCount()) {
			printData = new PrintData();
			printData.setId(dataTable.getValueAt(selIndex, 0).toString().trim());
			printData.setArea(dataTable.getValueAt(selIndex, 1).toString());
			printData.setThorp_N(dataTable.getValueAt(selIndex, 2).toString());
			printData.setThorpName(dataTable.getValueAt(selIndex, 3).toString());
			printData.setSerialNum(dataTable.getValueAt(selIndex, 4).toString());
			printData.setName(dataTable.getValueAt(selIndex, 5).toString());
			printData.setIcCode(dataTable.getValueAt(selIndex, 6).toString());
			printData.setPhone(dataTable.getValueAt(selIndex, 7).toString());
			printData.setFamilyCode(dataTable.getValueAt(selIndex, 8).toString());
			printData.setJaccount(dataTable.getValueAt(selIndex, 9).toString());
			printData.setJaccountName(dataTable.getValueAt(selIndex, 10).toString());
			printData.setZaccount(dataTable.getValueAt(selIndex, 11).toString());
			printData.setZaccountName(dataTable.getValueAt(selIndex, 12).toString());
			printData.setAge(dataTable.getValueAt(selIndex, 13).toString());
			printData.setSex(dataTable.getValueAt(selIndex, 14).toString());
			printData.setAchieveDate(dataTable.getValueAt(selIndex, 15).toString());
			printData.setBirthDate(dataTable.getValueAt(selIndex, 16).toString());
			printData.setRelationship(dataTable.getValueAt(selIndex, 17).toString());
			printData.setPayGrade(dataTable.getValueAt(selIndex, 18).toString());
			printData.setPersType(dataTable.getValueAt(selIndex, 19).toString());
			printData.setAddress(dataTable.getValueAt(selIndex, 20).toString());
			printData.setRemark(dataTable.getValueAt(selIndex, 21).toString());
			printData.setTotalAcct(dataTable.getValueAt(selIndex, 22).toString());
			printData.setTotalPay(dataTable.getValueAt(selIndex, 23).toString());
			printData.setTotalSubs(dataTable.getValueAt(selIndex, 24).toString());
			printData.setPrintFlag(dataTable.getValueAt(selIndex, 25).toString());
			printData.setPrintDate(dataTable.getValueAt(selIndex, 26).toString());
			
			String thorpId = dataTable.getValueAt(selIndex, 27).toString(); 
			if(thorpId != null && !"".equals(thorpId))
				printData.setThorpId(Integer.parseInt(thorpId));
	
		}
		return printData;
	}
}
