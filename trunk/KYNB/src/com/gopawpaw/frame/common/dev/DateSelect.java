/**
 * 
 */
package com.gopawpaw.frame.common.dev;

import java.awt.Frame;

import com.gopawpaw.frame.common.DataSelectObject;

/**
 * @version 2010-4-21
 * @author 李锦华
 *
 */
public class DateSelect extends AbstractDeveloper{

	/**
	 * 生效日期
	 */
	public final static int EffDate = 1;
	
	/**
	 * 处理日期
	 */
	public final static int TrDate = 2;
	
	private int Date_Type = EffDate;
	
	private String DateLabel = "";
	
	/**
	 * 
	 * @param owner 父窗口
	 * @param Date_Type 日期类型（EffDate、TrDate）
	 */
	public DateSelect(Frame owner,int Date_Type) {
		super(owner);
		this.Date_Type = Date_Type;
		initialize();
	}
	
	private void initialize() {
		if(this.Date_Type == DateSelect.EffDate){
			DateLabel = "生效日期：";
		}else if(this.Date_Type == DateSelect.TrDate){
			DateLabel = "事务日期：";
		}
		
		refreshData();
	}

	@Override
	public void refreshData() {
		
		
		dso = new DataSelectObject(DateLabel,DataSelectObject.dataType_date);
		dso2 = new DataSelectObject(DateLabel,DataSelectObject.dataType_date);
	}

}
