package com.gopawpaw.kynb.common;

 /**
 * ��ȡexcle������
 * @version 2012-4-15
 * @author LiJinHua
 */
public interface ReadXlsListener{
	
	void onReadXlsPre(int size,Object[] title);
	void onReadXlsProgress(int n);
}