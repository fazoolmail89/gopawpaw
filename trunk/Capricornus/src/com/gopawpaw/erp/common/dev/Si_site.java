/**
 * 
 */
package com.gopawpaw.erp.common.dev;

import java.awt.Frame;
import java.util.List;
import java.util.Vector;

import com.gopawpaw.erp.common.DataSelectObject;
import com.gopawpaw.erp.dataEntity.mfg.GppSiMstr;
import com.gopawpaw.erp.hibernate.s.SiMstr;

/**
 * @version 2010-4-21
 * @author 李锦华
 *
 */
public class Si_site extends AbstractDeveloper{

	/**
	 * 
	 */
	public Si_site(Frame owner) {
		super(owner);
		initialize();
	}
	
	private void initialize() {

	}
	
	@Override
	public void refreshData() {
		Vector<String> cname = new Vector<String>(6);
		cname.add("地点");
		cname.add("描述");
		cname.add("单位");
		cname.add("默认库存状态");
		cname.add("自动库位");
		cname.add("域");
		
		Vector<Vector<String>> vesource = new Vector<Vector<String>>();
		
		List<SiMstr> l = GppSiMstr.getSiMstr();
		
		for(Object o:l){
			Vector<String> temve = new Vector<String>(6);
			temve.add(((SiMstr)o).getId().getSiSite());
			temve.add(((SiMstr)o).getSiDesc());
			temve.add(((SiMstr)o).getSiEntity());
			temve.add(((SiMstr)o).getSiStatus());
			temve.add(((SiMstr)o).getSiAutoLoc().toString());
			temve.add(((SiMstr)o).getId().getSiDomain());
			vesource.add(temve);
		}
		
		dso = new DataSelectObject("地点：",DataSelectObject.dataType_txt,cname,vesource,"地点",owner,"地点选择");
		dso2 = new DataSelectObject("地点：",DataSelectObject.dataType_txt,cname,vesource,"地点",owner,"地点选择");
		
		
	}

}
