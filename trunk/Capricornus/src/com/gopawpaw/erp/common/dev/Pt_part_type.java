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
 * @author �����
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
	 * ˢ������������
	 */
	public void refreshData(){
		Vector<String> cname = new Vector<String>(2);
		cname.add("����");
		cname.add("����");
		
		Vector<Vector<String>> vesource = new Vector<Vector<String>>();
		
		List<CodeMstr> l = GppCodeMstr.getPt_part_type();
		for(Object o:l){
			Vector<String> temve = new Vector<String>(2);
			temve.add(((CodeMstr)o).getId().getCodeValue());
			temve.add(((CodeMstr)o).getCodeDesc());
			vesource.add(temve);
			
		}
		
		dso = new DataSelectObject("�����ࣺ",DataSelectObject.dataType_txt,cname,vesource,"����",owner,"��������");
		dso2 = new DataSelectObject("�����ࣺ",DataSelectObject.dataType_txt,cname,vesource,"����",owner,"��������");

	}

}
