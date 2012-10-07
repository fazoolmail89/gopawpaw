/**     
* @{#} UserListPane.java Create on 2012-10-1 下午6:31:47     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2.usermng;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.kynb.module.print2.JTableCommUtil;
import com.gopawpaw.kynb.widget.GppStyleTable;

/**     
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class UserListScrollPane extends JScrollPane {
	private static final long serialVersionUID = -272163491806719538L;
	private UserMngDialog userMD;
	public static Object[] columnNames = {"序号", "账号", "密码","状态"};
	private Object[][] data;
	
	private DefaultTableModel dataModel;
	private JTable dataTable;	
	
	public UserListScrollPane(UserMngDialog umd) {
		this.userMD = umd;
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
		
		//给面板加水平滚动条
		setViewportView(dataTable);
		setBorder(BorderFactory.createTitledBorder("用户列表"));
		
		//加载数据
		refreshTable();
	}
	
	/**
	 * 刷新表格当前数据
	 */
	public void refreshTable() {
		UserDAO ud = new UserDAO();
		data = ud.findAll();
		dataModel = new DefaultTableModel(data, columnNames);
		((GppStyleTable) dataTable).updateModel(dataModel);
		//隐藏密码列
		JTableCommUtil.hiddenColumn(dataTable, 2);
		//刷新界面
		dataTable.repaint();
		dataTable.updateUI();
	}
	
	public User getSelUser() {
		User user = null;
		if (dataTable == null)
			return null;
		if (dataTable.getRowCount() == 0)
			return null;
		int selIndex = dataTable.getSelectedRow();
		if(selIndex > -1) {
			user = new User();
			user.setId(Integer.parseInt(
					dataTable.getModel().getValueAt(selIndex, 0).toString()));
			user.setUsername(dataTable.getModel().getValueAt(selIndex, 1).toString());
			user.setPassword(dataTable.getModel().getValueAt(selIndex, 2).toString());
			if(User.STR_STATUS_1.equals(
					dataTable.getModel().getValueAt(selIndex, 3).toString()))
				user.setStatus(1);
			else 
				user.setStatus(0);
		}
		return user;
	}
}
