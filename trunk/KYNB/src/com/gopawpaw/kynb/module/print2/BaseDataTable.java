package com.gopawpaw.kynb.module.print2;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.kynb.widget.GppStyleTable;

/**
 * 
 * @author ¬���� luxiangqi521@gmail.com
 * @version 1.0 2012-8-14
 */
public class BaseDataTable extends JScrollPane {
	private static final long serialVersionUID = -1138977648779912371L;
	
	private static final int[] DEF_HIDDEN_COL_INDEX = {0,27};
	
	/**
	 * ��ͷ(0-27)
	 */
	public static final Object[] columnNames = { "ID", "��������", "����", "�����������", "���˱��", "����",
			"����֤��", "��ϵ�绰", "��ͥ���", "�ɷ������˺�", "�ɷ����л���", "֧�������˺�", "֧�����л���",
			"����", "�Ա�", "����ʱ��", "��������", "�뻧����ϵ", "����ɷѵ���", "������Ա���", "��ͥסַ",
			"��ע", "�ۼƸ����˻����", "�ۼƸ��˽ɷѽ��", "�ۼƲ�������", "��ӡ���", "��ӡ����","��ID" };
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
		
		//�����и�	
		dataTable.setRowHeight(22);
		//������ͷ
		dataTable.getTableHeader().setReorderingAllowed(false);
		
		//������
/*		for(int i = 0; i < BaseDataTable.DEF_HIDDEN_COL_INDEX.length; i++) {
			dataTable.getTableHeader().getColumnModel().getColumn(DEF_HIDDEN_COL_INDEX[i]).setMinWidth(0);
			dataTable.getTableHeader().getColumnModel().getColumn(DEF_HIDDEN_COL_INDEX[i]).setWidth(0);			
		}*/
		
		//������ˮƽ������
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		setViewportView(dataTable);
	}
	
	/**
	 * ˢ�±���ǰ����
	 */
	public void refreshTable(Object[][] data) {
		this.data = data;
		dataModel = new DefaultTableModel(data, columnNames);
		((GppStyleTable) dataTable).updateModel(dataModel);
		dataTable.repaint();
		dataTable.updateUI();
	}
	
	public PrintData getSelectRow() {
		PrintData printData = null;
		int selIndex = dataTable.getSelectedRow();
		if(selIndex > -1) {
			printData = new PrintData();
			printData.setId(dataTable.getValueAt(selIndex, 0).toString());
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