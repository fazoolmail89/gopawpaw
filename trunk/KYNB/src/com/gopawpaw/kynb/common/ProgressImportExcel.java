package com.gopawpaw.kynb.common;

import java.io.File;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.frame.log.GLog;
import com.gopawpaw.kynb.bean.JComboBoxItem;
import com.gopawpaw.kynb.common.PoiOperatXls2.ReadXlsListener;
import com.gopawpaw.kynb.widget.GppStyleTable;

/**
 * excle���������
 * @version 2012-4-15
 * @author LiJinHua
 */
public class ProgressImportExcel extends Thread {// �Զ�����progress,����excel��

	private JProgressBar progressBar;
	private JButton button;
	private ExcelImportListener mImportListener;
	private Object[] mTitle;
	private Object[][] mData;
	private JComboBox jComboBox;
	private String excelPath;

	public ProgressImportExcel(JProgressBar progressBar,
			String excelPath) {
		this.progressBar = progressBar;
		this.excelPath = excelPath;
	}
	
	public ProgressImportExcel(JProgressBar progressBar, JButton button,
			String excelPath) {
		this.progressBar = progressBar;
		this.button = button;
		this.excelPath = excelPath;
	}

	public ProgressImportExcel(JProgressBar progressBar, JButton button,
			String excelPath, JComboBox jComboBox) {
		this.progressBar = progressBar;
		this.button = button;
		this.excelPath = excelPath;
		this.jComboBox = jComboBox;

	}

	/**
	 * ���ü�����
	 * 
	 * @version 2012-3-28
	 * @author Jason
	 * @param
	 * @return void
	 */
	public void setImportListener(ExcelImportListener listener) {
		mImportListener = listener;
	}

	public void run() {
		if(button != null){
			
			button.setEnabled(false);
		}

		mData = PoiOperatXls2.readXlsRTA(new File(excelPath),
				new ReadXlsListener() {
					int size = 0;

					@Override
					public void onReadXlsPre(int size, Object[] title) {
						// TODO Auto-generated method stub
						this.size = size - 1;
						progressBar.setMaximum(size - 1);
						mTitle = title;
					}

					@Override
					public void onReadXlsProgress(int n) {
						// TODO Auto-generated method stub
						progressBar.setString("���ȣ�" + (n) + "/" + size);
						progressBar.setValue(n); // ����ֵ
					}

				});

		progressBar.setIndeterminate(false);

		actionFinish();

		if(button != null){
			
			button.setEnabled(true); // ��ť����
		}

	}

	/**
	 * ��ɺ���ã��ڴ˽��лص�
	 * 
	 * @version 2012-3-28
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void actionFinish() {

		if (jComboBox != null && mTitle != null) {
			int size = mTitle.length;
			for (int i = 0; i < size; i++) {
				JComboBoxItem ji = new JComboBoxItem();
				ji.index = i;
				ji.name = (String) mTitle[i];
				jComboBox.addItem(ji);
			}
		}

		DefaultTableModel model = new DefaultTableModel(mData, mTitle);
		GppStyleTable jTable = new GppStyleTable(model);
		jTable.setRowHeight(22);
		if (mImportListener != null) {
			GLog.d("", "�������");
			mImportListener.onImprotFinish(mTitle, mData, jTable);
		}
	}
}
