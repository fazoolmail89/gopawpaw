/**
 * 
 */
package com.gopawpaw.erp.common.dev;

import java.awt.Frame;
import java.util.List;
import java.util.Vector;

import com.gopawpaw.erp.common.DataSelectObject;
import com.gopawpaw.erp.dataEntity.mfg.GppWoMstr;
import com.gopawpaw.erp.hibernate.w.WoMstr;

/**
 * @version 2010-4-21
 * @author 李锦华
 *
 */
public class Wo_nbr extends AbstractDeveloper{


	/**
	 * 
	 */
	public Wo_nbr(Frame owner) {
		super(owner);
		initialize();
	}
	
	private void initialize() {

	}
	
	@Override
	public void refreshData() {
		Vector<String> cname = new Vector<String>(5);
		cname.add("加工单号");
		cname.add("物料号");
		cname.add("客户单/工作");
		cname.add("截至日期");
		cname.add("已订购量");
		
		Vector<Vector<String>> vesource = new Vector<Vector<String>>();
		
		List<WoMstr> l = GppWoMstr.getWoMstr();
		
		for(Object o:l){
			Vector<String> temve = new Vector<String>(5);
			temve.add(((WoMstr)o).getId().getWoNbr());
			temve.add(((WoMstr)o).getWoPart());
			temve.add(((WoMstr)o).getWoSoJob());
			temve.add(((WoMstr)o).getWoDueDate().toGMTString());
			temve.add(((WoMstr)o).getWoQtyOrd().toString());
			vesource.add(temve);
		}
		
		dso = new DataSelectObject("加工单号：",DataSelectObject.dataType_txt,cname,vesource,"加工单号",owner,"加工单号选择");
		dso2 = new DataSelectObject("加工单号：",DataSelectObject.dataType_txt,cname,vesource,"加工单号",owner,"加工单号选择");
		
		
	}


}
