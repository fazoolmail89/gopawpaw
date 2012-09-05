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
 * @author ¬���� luxiangqi521@gmail.com
 * @version 1.0 2012-9-5
 */
public class TableScrollPane extends JScrollPane {
	private static final long serialVersionUID = 750160184568626498L;

	private ThorpMngDialog fdialog;
	
	/** ��֯�������ͷ*/
	public static Object[] columnNames = {"ID", "����"};
	
	/** ��֯���������� */
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
		
		//��ӱ��ѡ���м����¼�
		dataTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			/**
			 * ÿ��ѡ�����У��÷���ִ������
			 */
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int rowIndex = dataTable.getSelectedRow();
				if(rowIndex > -1) 
					fdialog.getPnlQuery().getTtfName().setText(
						dataTable.getModel().getValueAt(rowIndex, 1).toString());
			}
		});
		
		//�����и�	
		dataTable.setRowHeight(22);
		//������ͷ
		dataTable.getTableHeader().setReorderingAllowed(false);
		//����ֻ�ܽ�ֹͬʱѡ�ж���
		dataTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//������ˮƽ������
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
	
	/**
	 * ��ȡѡ����
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
