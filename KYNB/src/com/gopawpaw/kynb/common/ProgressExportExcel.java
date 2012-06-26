/**
 * 
 */
package com.gopawpaw.kynb.common;

import javax.swing.JButton;
import javax.swing.JProgressBar;


/**
 * excle����������
 * @version 2012-4-15
 * @author LiJinHua
 */
public class ProgressExportExcel extends Thread {// �Զ�����progress,����excel��

	
	private JProgressBar progressBar;
	private JButton button;
	private ExcelExportListener mExportListener;
	private Object[] mTitle;
	private Object[][] mData;
	private String excelPath;

	public ProgressExportExcel(	String excelPath) {
		this.excelPath = excelPath;
	}
	
	public ProgressExportExcel(JProgressBar progressBar,
			String excelPath) {
		this.progressBar = progressBar;
		this.excelPath = excelPath;
	}
	
	public ProgressExportExcel(JProgressBar progressBar, JButton button,
			String excelPath) {
		this.progressBar = progressBar;
		this.button = button;
		this.excelPath = excelPath;
	}
	
	public void setData(Object[][] mData) {
		this.mData = mData;
	}


	public void setTitle(Object[] mTitle) {
		this.mTitle = mTitle;
	}
	
	/**
	 * ���ü�����
	 * 
	 * @version 2012-3-28
	 * @author Jason
	 * @param
	 * @return void
	 */
	public void setExportListener(ExcelExportListener listener) {
		mExportListener = listener;
	}

	public void run() {
		if(button != null){
			
			button.setEnabled(false);
		}
		final int size = mData.length;
		
		if(progressBar != null){
			progressBar.setMaximum(size);
			progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
			progressBar.setIndeterminate(false); // ȷ�����ȵĽ�����
			
		}
		
		WriteXlsListener writeXlsListener = new WriteXlsListener(){

			@Override
			public void onWriteXlsProgress(int n) {
				// TODO Auto-generated method stub
				if(progressBar != null){
					
					progressBar.setString("���ȣ�" + (n) + "/" + size);
					progressBar.setValue(n); // ����ֵ
				}
			}

			@Override
			public void onWriteXlsFinish(int count, String path) {
				// TODO Auto-generated method stub
				if(mExportListener != null){
					mExportListener.onExprotFinish(path,count);
				}
			}
			
		};
		
		PoiOperatXls2.writeXls(mData, mTitle, excelPath, writeXlsListener);
		if(button != null){
			
			button.setEnabled(true); // ��ť����
		}

	}
}

