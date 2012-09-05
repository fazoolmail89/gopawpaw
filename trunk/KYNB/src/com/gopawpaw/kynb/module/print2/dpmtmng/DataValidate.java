package com.gopawpaw.kynb.module.print2.dpmtmng;
/**	
 *  
 * @author 卢向琪 luxiangqi521@gmail.com
 * @version 1.0 2012-9-5
 */
public class DataValidate {
	public String addValidate(PrintThorp pt) {
		String error = null;
		String name = pt.getName();
		if(name == null || "".equals(name)) {
			error = "机构名称不能为空！";
		}else {
			PrintThorpDAO ptdao = new PrintThorpDAO();
			PrintThorp temp = ptdao.findByNameToValidate(name);
			if(temp != null) error = "机构名称不能重复！";
		}
		return error;
	}
	
	public String updValidate(PrintThorp pt) {
		String error = null;
		String name = pt.getName();
		if(name == null || "".equals(name)) {
			error = "机构名称不能为空！";
		}else {
			PrintThorpDAO ptdao = new PrintThorpDAO();
			PrintThorp temp = ptdao.findByNameToValidate(name);
			if(temp != null) {
				if(temp.getId() != pt.getId()) error = "机构名称不能重复！";
			}
		}		
		return error;		
	}
	
	public String delValidate(PrintThorp pt) {
		String error = null;
		int id = pt.getId();
		PrintThorpDAO ptdao = new PrintThorpDAO();
		if(ptdao.beUse(id)) error = "该机构存在关联，不能删除！";
		return error;
	}
}
