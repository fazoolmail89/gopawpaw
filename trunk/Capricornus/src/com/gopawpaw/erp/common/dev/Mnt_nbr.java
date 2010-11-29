/**
 * 
 */
package com.gopawpaw.erp.common.dev;

import java.awt.Frame;
import java.util.List;
import java.util.Vector;

import com.gopawpaw.erp.common.DataSelectObject;
import com.gopawpaw.erp.dataEntity.mfg.GppMntDet;
import com.gopawpaw.erp.hibernate.m.MntDet;
/**
 * @version 2010-7-24
 * @author Àî½õ»ª
 * @ ²Ëµ¥ºÅÑ¡Ôñ
 */
public class Mnt_nbr extends AbstractDeveloper{

	public Mnt_nbr(Frame owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void refreshData() {
		Vector<String> cname = new Vector<String>(2);
		cname.add("²Ëµ¥ºÅ");
		cname.add("ÃèÊö");
		
		Vector<Vector<String>> vesource = new Vector<Vector<String>>();
		
		List<MntDet> l = GppMntDet.getMntDet();
		
		for(Object o:l){
			Vector<String> temve = new Vector<String>(2);
			
			String tem = ((MntDet)o).getId().getMntNbr() + "." + ((MntDet)o).getId().getMntSelect();
			temve.add(tem);
			temve.add(((MntDet)o).getMntLabel());
			
			vesource.add(temve);
		}
		
		dso = new DataSelectObject("²Ëµ¥ºÅ£º",DataSelectObject.dataType_txt,cname,vesource,"²Ëµ¥ºÅ",owner,"²Ëµ¥ºÅÑ¡Ôñ");
		dso2 = new DataSelectObject("²Ëµ¥ºÅ£º",DataSelectObject.dataType_txt,cname,vesource,"²Ëµ¥ºÅ",owner,"²Ëµ¥ºÅÑ¡Ôñ");
	
	}

}
