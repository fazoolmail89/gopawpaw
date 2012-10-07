package com.gopawpaw.kynb.module.print2;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**	
 *  
 * @author 卢向琪 luxiangqi521@gmail.com
 * @version 1.0 2012-8-22
 */
public class JTableCommUtil {
    /**
     * 隐藏指定JTable的指定列
     * @param table    指定JTable
     * @param column   指定列
     */
    public static void hiddenColumn(JTable table, int column) {
        TableColumn tc = table.getTableHeader().getColumnModel().getColumn(column);
        tc.setMaxWidth(0);
        tc.setPreferredWidth(0);
        tc.setWidth(0);
        tc.setMinWidth(0);
        table.getTableHeader().getColumnModel().getColumn(column).setMaxWidth(0);
        table.getTableHeader().getColumnModel().getColumn(column).setMinWidth(0);
    }

    /**
     * 显示指定JTable的指定列
     * @param table    指定JTable
     * @param column   指定列
     * @param width    指定列显示宽度
     */
    public static void showColumn(JTable table, int column, int width) {
        TableColumn tc = table.getColumnModel().getColumn(column);
        tc.setMaxWidth(width);
        tc.setPreferredWidth(width);
        tc.setWidth(width);
        tc.setMinWidth(width);
        table.getTableHeader().getColumnModel().getColumn(column).setMaxWidth(width);
        table.getTableHeader().getColumnModel().getColumn(column).setMinWidth(width);
    }
}
