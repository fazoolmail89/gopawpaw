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
			"���֤��", "��ϵ�绰", "��ͥ���", "�ɷ������˺�", "�ɷ����л���", "֧�������˺�", "֧�����л���",
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
		for(int i = 0; i < BaseDataTable.DEF_HIDDEN_COL_INDEX.length; i++) {
			dataTable.getTableHeader().getColumnModel().getColumn(DEF_HIDDEN_COL_INDEX[i]).setMinWidth(0);
			dataTable.getTableHeader().getColumnModel().getColumn(DEF_HIDDEN_COL_INDEX[i]).setWidth(0);			
		}
		
		//������ˮƽ������
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		setViewportView(dataTable);
	}
	
	/**
	 * ˢ�±��ǰ����
	 */
	public void refreshTable(Object[][] data) {
		this.data = data;
		dataModel = new DefaultTableModel(data, columnNames);
		((GppStyleTable) dataTable).updateModel(dataModel);
		dataTable.repaint();
		dataTable.updateUI();
	}
}
