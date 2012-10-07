package com.gopawpaw.kynb.module.print2;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**	
 *  
 * @author ¬���� luxiangqi521@gmail.com
 * @version 1.0 2012-8-22
 */
public class JTableCommUtil {
    /**
     * ����ָ��JTable��ָ����
     * @param table    ָ��JTable
     * @param column   ָ����
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
     * ��ʾָ��JTable��ָ����
     * @param table    ָ��JTable
     * @param column   ָ����
     * @param width    ָ������ʾ���
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
