/**
 * 
 */
package com.gopawpaw.javax.swing.table;

import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;


/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppTableColumn extends TableColumn {

	/**
	 * 
	 */
	public GppTableColumn() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public GppTableColumn(int arg0, int arg1, TableCellRenderer arg2,
			TableCellEditor arg3) {
		super(arg0, arg1, arg2, arg3);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppTableColumn(int arg0, int arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppTableColumn(int arg0) {
		super(arg0);
		initialize();
	}
	
	/**
	 * 初始化
	 */
	private void initialize() {
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1423977527604061025L;

}
