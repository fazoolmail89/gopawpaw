package com.gopawpaw.kynb.common;

/**
 * д��excle������
 * @version 2012-4-15
 * @author LiJinHua
 */
public interface WriteXlsListener{
	
	void onWriteXlsProgress(int n);
	void onWriteXlsFinish(int count,String path);
}
