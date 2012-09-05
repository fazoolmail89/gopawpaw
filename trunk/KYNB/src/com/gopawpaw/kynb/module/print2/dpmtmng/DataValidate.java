package com.gopawpaw.kynb.module.print2.dpmtmng;
/**	
 *  
 * @author ¬���� luxiangqi521@gmail.com
 * @version 1.0 2012-9-5
 */
public class DataValidate {
	public String addValidate(PrintThorp pt) {
		String error = null;
		String name = pt.getName();
		if(name == null || "".equals(name)) {
			error = "�������Ʋ���Ϊ�գ�";
		}else {
			PrintThorpDAO ptdao = new PrintThorpDAO();
			PrintThorp temp = ptdao.findByNameToValidate(name);
			if(temp != null) error = "�������Ʋ����ظ���";
		}
		return error;
	}
	
	public String updValidate(PrintThorp pt) {
		String error = null;
		String name = pt.getName();
		if(name == null || "".equals(name)) {
			error = "�������Ʋ���Ϊ�գ�";
		}else {
			PrintThorpDAO ptdao = new PrintThorpDAO();
			PrintThorp temp = ptdao.findByNameToValidate(name);
			if(temp != null) {
				if(temp.getId() != pt.getId()) error = "�������Ʋ����ظ���";
			}
		}		
		return error;		
	}
	
	public String delValidate(PrintThorp pt) {
		String error = null;
		int id = pt.getId();
		PrintThorpDAO ptdao = new PrintThorpDAO();
		if(ptdao.beUse(id)) error = "�û������ڹ���������ɾ����";
		return error;
	}
}
