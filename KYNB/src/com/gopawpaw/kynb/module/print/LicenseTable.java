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
	public static final Object[] columnNames = {
		"序号","姓名", "身份证号",
		"曾用名", "出生年月日", "性别",
		"社会保障号", "地址", "所在村", "打印标记"};
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
	
	/**
	 * 刷新表格当前数据
	 */
	public void refreshTable(Object[][] data) {
		this.data = data;
		dtm = new DefaultTableModel(data, columnNames);
		((GppStyleTable) table).updateModel(dtm);
		table.repaint();
		table.updateUI();
	}
	
	public LicenseDto getSelectLicenseDto() {
		LicenseDto licenseDto = null;
		int selIndex = table.getSelectedRow();
		if(selIndex > -1) {
			licenseDto = new LicenseDto();
			licenseDto.setId(table.getValueAt(selIndex, 0).toString());
			licenseDto.setName(table.getValueAt(selIndex, 1).toString());
			licenseDto.setIcCode(table.getValueAt(selIndex, 2).toString());
			licenseDto.setOldName(table.getValueAt(selIndex, 3).toString());
			licenseDto.setBirthday(table.getValueAt(selIndex, 4).toString());
			licenseDto.setSex(table.getValueAt(selIndex, 5).toString());
			licenseDto.setCode(table.getValueAt(selIndex, 6).toString());
			licenseDto.setAddress(table.getValueAt(selIndex, 7).toString());
			
			if("已打印".equals(table.getValueAt(selIndex, 8).toString()))
				licenseDto.setPrintFlag(1);
			else 
				licenseDto.setPrintFlag(0);
	
		}
		return licenseDto;
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
