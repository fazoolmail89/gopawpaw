/**
 * 
 */
package com.gopawpaw.erp.common.dev;

import java.awt.Frame;
import java.util.List;
import java.util.Vector;

import com.gopawpaw.erp.common.DataSelectObject;
import com.gopawpaw.erp.dataEntity.mfg.GppPlMstr;
import com.gopawpaw.erp.hibernate.p.PlMstr;

/**
 * @version 2010-4-20
 * @author �����
 *
 */
public class Pl_prod_line extends AbstractDeveloper{

	
	
	/**
	 * 
	 */
	public Pl_prod_line(Frame owner) {
		super(owner);
		initialize();
	}

	private void initialize() {

	}
	
	/**
	 * ˢ�� ��Ʒ������
	 */
	@Override
	public void refreshData(){
		Vector<String> cname = new Vector<String>(5);
		cname.add("��Ʒ��");
		cname.add("����");
		cname.add("Ӧ��˰");
		cname.add("��˰����");
		cname.add("��");
		
		Vector<Vector<String>> vesource = new Vector<Vector<String>>();
		
		List<PlMstr> l = GppPlMstr.getPlMstr();
		
		for(Object o:l){
			Vector<String> temve = new Vector<String>(5);
			temve.add(((PlMstr)o).getId().getPlProdLine());
			temve.add(((PlMstr)o).getPlDesc());
			temve.add(((PlMstr)o).getPlTaxable().toString());
			temve.add(((PlMstr)o).getPlTaxc());
			temve.add(((PlMstr)o).getPlTaxable().toString());
			
			vesource.add(temve);
		}
		
		dso = new DataSelectObject("��Ʒ�ߣ�",DataSelectObject.dataType_txt,cname,vesource,"��Ʒ��",owner,"��Ʒ��ѡ��");
		dso2 = new DataSelectObject("��Ʒ�ߣ�",DataSelectObject.dataType_txt,cname,vesource,"��Ʒ��",owner,"��Ʒ��ѡ��");
		
	}
	
}
