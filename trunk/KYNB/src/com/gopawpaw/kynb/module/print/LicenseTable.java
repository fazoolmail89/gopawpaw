package com.gopawpaw.kynb.module.print;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.Date;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.kynb.widget.GppStyleTable;



public class LicenseTable extends JScrollPane implements Printable{
	private static final long serialVersionUID = -2609235147104011331L;
	public static final Object[] columnNames = { "姓名", "身份证号", "曾用名", "出生年月日", "性别",
									"社会保障号", "地址", "户口性质", "核发时间", "核发单位"};
	public Object[][] data;
	public JTable table;
	private static DefaultTableModel dtm;
	
	public LicenseTable() {
		dtm = new DefaultTableModel(data, columnNames);
		table = new GppStyleTable(dtm);
		table.setModel(new DefaultTableModel(data, columnNames));
		table.setRowHeight(22);
		setViewportView(table);
	}
	
	public License getSelectLicense() {
		License license = null;
		int selIndex = table.getSelectedRow();
		if(selIndex > -1) {
			license = new License();
			license.setName(table.getValueAt(selIndex, 1).toString());
			license.setCode(table.getValueAt(selIndex, 2).toString());
			license.setSex(table.getValueAt(selIndex, 3).toString());
			license.setBirthday(table.getValueAt(selIndex, 4).toString());
			license.setAddress(table.getValueAt(selIndex, 5).toString());
		}
		return license;
	}

	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
			throws PrinterException {
		if(pageIndex < 1000/30 + 1) {
			return Printable.PAGE_EXISTS;
		} else {
            return Printable.NO_SUCH_PAGE;
        }
	}
}
