/**
 * 
 */
package com.gopawpaw.javax.swing;

import java.util.Vector;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import com.gopawpaw.dev.GppKeyListener;

/**
 * @version 2009-10-31
 * @author 李锦华
 */
public class GppJTable extends JTable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3301122957966783069L;

	/**
	 * 
	 */
	public GppJTable() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJTable(int arg0, int arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJTable(Object[][] arg0, Object[] arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public GppJTable(TableModel arg0, TableColumnModel arg1,
			ListSelectionModel arg2) {
		super(arg0, arg1, arg2);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJTable(TableModel arg0, TableColumnModel arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * @param arg0
	 */
	public GppJTable(TableModel arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppJTable(Vector<?> arg0, Vector<?> arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * 初始化
	 */
	private void initialize() {
		this.addKeyListener(new GppKeyListener(this));
	}
}
