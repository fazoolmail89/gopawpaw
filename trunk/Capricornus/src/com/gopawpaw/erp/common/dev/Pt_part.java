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
 * @author �����
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
		cname.add("���Ϻ�");
		cname.add("����");
		cname.add("˵��");
		cname.add("UM");
		cname.add("��");
		
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
		
		dso = new DataSelectObject("���Ϻţ�",DataSelectObject.dataType_txt,cname,vesource,"���Ϻ�",owner,"���Ϻ�ѡ��");
		dso2 = new DataSelectObject("���Ϻţ�",DataSelectObject.dataType_txt,cname,vesource,"���Ϻ�",owner,"���Ϻ�ѡ��");
		
		
	}

}
