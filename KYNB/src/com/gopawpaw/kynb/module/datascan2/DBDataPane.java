package com.gopawpaw.kynb.module.datascan2;

import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.kynb.bean.OtherData;
import com.gopawpaw.kynb.widget.GppStyleTable;

public class DBDataPane extends JScrollPane {
	
	private static final long serialVersionUID = 2768785784570049044L;
	private JTable table;
	private static final Object[] columnNames = {"ÐòºÅ", OtherData.ACOL,
		OtherData.BCOL, OtherData.CCOL, OtherData.DCOL,
		OtherData.ECOL, OtherData.FCOL, OtherData.GCOL,
		OtherData.HCOL, OtherData.ICOL, OtherData.JCOL };
	private Object[][] data = null;
	private static DefaultTableModel dtm = null;
	
	public DBDataPane() {
		initData();
		dtm = new DefaultTableModel(data, columnNames);
		table = new GppStyleTable(dtm) {
			private static final long serialVersionUID = 3798362980630566569L;

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		};
		table.setRowHeight(22);
		setViewportView(table);
		setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	}
	
	public Object[][] getData(){
		return data;
	}
	
	private void initData() {
		DataOpertor dot = new DataOpertor();
		List<OtherData> list = dot.findListFrontFive();
		if (list != null && list.size() > 0) {
			data = new Object[list.size()][columnNames.length];
			int i = 0;
			for (OtherData odata : list) {
				data[i][0] = odata.getId();
				data[i][1] = odata.getAcol();
				data[i][2] = odata.getBcol();
				data[i][3] = odata.getCcol();
				data[i][4] = odata.getDcol();
				data[i][5] = odata.getEcol();
				data[i][6] = odata.getFcol();
				data[i][7] = odata.getGcol();
				data[i][8] = odata.getHcol();
				data[i][9] = odata.getIcol();
				data[i][10] = odata.getJcol();
				i++;
			}
		}
	}
}
