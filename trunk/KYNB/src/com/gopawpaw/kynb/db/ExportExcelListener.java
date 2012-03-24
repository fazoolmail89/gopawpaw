package com.gopawpaw.kynb.db;

public interface ExportExcelListener {
	void onExportProgress(int total,int current,boolean isOk);
}
