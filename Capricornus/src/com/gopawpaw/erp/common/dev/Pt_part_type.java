/**
 * 
 */
package com.gopawpaw.erp.common.dev;

import java.awt.Frame;
import java.util.List;
import java.util.Vector;


import com.gopawpaw.erp.common.DataSelectObject;
import com.gopawpaw.erp.dataEntity.mfg.GppCodeMstr;
import com.gopawpaw.erp.hibernate.c.CodeMstr;

/**
 * @version 2010-4-20
 * @author 李锦华
 *
 */
public class Pt_part_type extends AbstractDeveloper{

	
	/**
	 * 
	 */
	public Pt_part_type(Frame owner) {
		super(owner);
		initialize();
	}
	
	private void initialize() {

	}
	/**
	 * 刷新物料类数据
	 */
	public void refreshData(){
		Vector<String> cname = new Vector<String>(2);
		cname.add("类型");
		cname.add("描述");
		
		Vector<Vector<String>> vesource = new Vector<Vector<String>>();
		
		List<CodeMstr> l = GppCodeMstr.getPt_part_type();
		for(Object o:l){
			Vector<String> temve = new Vector<String>(2);
			temve.add(((CodeMstr)o).getId().getCodeValue());
			temve.add(((CodeMstr)o).getCodeDesc());
			vesource.add(temve);
			
		}
		
		dso = new DataSelectObject("物料类：",DataSelectObject.dataType_txt,cname,vesource,"类型",owner,"物料类型");
		dso2 = new DataSelectObject("物料类：",DataSelectObject.dataType_txt,cname,vesource,"类型",owner,"物料类型");

	}

}
