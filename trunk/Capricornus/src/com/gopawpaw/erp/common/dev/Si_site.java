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
 * @author �����
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
		cname.add("�ص�");
		cname.add("����");
		cname.add("��λ");
		cname.add("Ĭ�Ͽ��״̬");
		cname.add("�Զ���λ");
		cname.add("��");
		
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
		
		dso = new DataSelectObject("�ص㣺",DataSelectObject.dataType_txt,cname,vesource,"�ص�",owner,"�ص�ѡ��");
		dso2 = new DataSelectObject("�ص㣺",DataSelectObject.dataType_txt,cname,vesource,"�ص�",owner,"�ص�ѡ��");
		
		
	}

}
