package com.gopawpaw.kynb.common;

import com.gopawpaw.javax.swing.GppJTable;

/**
 * ����excle������
 * @version 2012-4-15
 * @author LiJinHua
 */
public interface ExcelImportListener {
	void onImprotFinish(Object[] title, Object[][] data, GppJTable table);
}
