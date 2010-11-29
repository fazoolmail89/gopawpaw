/**
 * 
 */
package com.gopawpaw.erp.common.dev;

import java.awt.Frame;
import java.util.List;
import java.util.Vector;

import com.gopawpaw.erp.common.DataSelectObject;
import com.gopawpaw.erp.dataEntity.mfg.GppPtMstr;
import com.gopawpaw.erp.hibernate.p.PtMstr;

/**
 * @version 2010-4-21
 * @author 李锦华
 *
 */
public class Pt_part extends AbstractDeveloper{

	/**
	 * 
	 */
	public Pt_part(Frame owner) {
		super(owner);
		initialize();
	}
	
	private void initialize() {

	}
	
	@Override
	public void refreshData() {
		Vector<String> cname = new Vector<String>(5);
		cname.add("物料号");
		cname.add("描述");
		cname.add("说明");
		cname.add("UM");
		cname.add("类");
		
		Vector<Vector<String>> vesource = new Vector<Vector<String>>();
		
		List<PtMstr> l = GppPtMstr.getPtMstr();
		
		for(Object o:l){
			Vector<String> temve = new Vector<String>(5);
			temve.add(((PtMstr)o).getId().getPtPart());
			temve.add(((PtMstr)o).getPtDesc1());
			temve.add(((PtMstr)o).getPtDesc2());
			temve.add(((PtMstr)o).getPtUm());
			temve.add(((PtMstr)o).getPtPartType());
			vesource.add(temve);
		}
		
		dso = new DataSelectObject("物料号：",DataSelectObject.dataType_txt,cname,vesource,"物料号",owner,"物料号选择");
		dso2 = new DataSelectObject("物料号：",DataSelectObject.dataType_txt,cname,vesource,"物料号",owner,"物料号选择");
		
		
	}

}
