/**     
* @{#} UserListPane.java Create on 2012-10-1 ����6:31:47     
*     
* Copyright (c) 2012 by ¬����.     
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
 * @author ¬���� luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class UserListScrollPane extends JScrollPane {
	private static final long serialVersionUID = -272163491806719538L;
	private UserMngDialog userMD;
	public static Object[] columnNames = {"���", "�˺�", "����","״̬"};
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
		
		//�����и�	
		dataTable.setRowHeight(22);
		//������ͷ
		dataTable.getTableHeader().setReorderingAllowed(false);
		//����ֻ�ܽ�ֹͬʱѡ�ж���
		dataTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//������ˮƽ������
		setViewportView(dataTable);
		setBorder(BorderFactory.createTitledBorder("�û��б�"));
		
		//��������
		refreshTable();
	}
	
	/**
	 * ˢ�±��ǰ����
	 */
	public void refreshTable() {
		UserDAO ud = new UserDAO();
		data = ud.findAll();
		dataModel = new DefaultTableModel(data, columnNames);
		((GppStyleTable) dataTable).updateModel(dataModel);
		//����������
		JTableCommUtil.hiddenColumn(dataTable, 2);
		//ˢ�½���
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
