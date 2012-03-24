/**
 * 
 */
package com.gopawpaw.frame.common.dev;

import java.awt.Frame;

import com.gopawpaw.frame.common.DataSelectObject;

/**
 * @version 2010-4-21
 * @author �����
 *
 */
public class DateSelect extends AbstractDeveloper{

	/**
	 * ��Ч����
	 */
	public final static int EffDate = 1;
	
	/**
	 * ��������
	 */
	public final static int TrDate = 2;
	
	private int Date_Type = EffDate;
	
	private String DateLabel = "";
	
	/**
	 * 
	 * @param owner ������
	 * @param Date_Type �������ͣ�EffDate��TrDate��
	 */
	public DateSelect(Frame owner,int Date_Type) {
		super(owner);
		this.Date_Type = Date_Type;
		initialize();
	}
	
	private void initialize() {
		if(this.Date_Type == DateSelect.EffDate){
			DateLabel = "��Ч���ڣ�";
		}else if(this.Date_Type == DateSelect.TrDate){
			DateLabel = "�������ڣ�";
		}
		
		refreshData();
	}

	@Override
	public void refreshData() {
		
		
		dso = new DataSelectObject(DateLabel,DataSelectObject.dataType_date);
		dso2 = new DataSelectObject(DateLabel,DataSelectObject.dataType_date);
	}

}
