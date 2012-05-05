package com.gopawpaw.kynb.common;

import com.gopawpaw.frame.widget.GJTable;

/**
 * µ¼Èëexcle¼àÌýÆ÷
 * @version 2012-4-15
 * @author LiJinHua
 */
public interface ExcelImportListener {
	void onImprotFinish(Object[] title, Object[][] data, GJTable table);
}
