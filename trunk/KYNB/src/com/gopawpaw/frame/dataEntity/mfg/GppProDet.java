/**
 * 
 */
package com.gopawpaw.frame.dataEntity.mfg;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.GppSQL;
import com.gopawpaw.frame.hibernate.p.ProDet;

/**
 * @version 2010-7-11
 * @author 李锦华
 * 
 */
public class GppProDet {
	private static final long serialVersionUID = 5274413356887481683L;
	private ProDet prodet = null;

	/**
	 * 
	 */
	public GppProDet() {

	}

	public GppProDet(ProDet prodet) {
		this.prodet = prodet;
	}

	public ProDet getProdet() {
		return prodet;
	}

	public void setProdet(ProDet prodet) {
		this.prodet = prodet;
	}

	/**
	 * 判断是否有该组件
	 */
	public boolean isHaveProDet() {
		boolean retboo = false;
		String gpp_sqlstr = "";

		if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Progress) {

		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Access) {

		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_SQLServer) {
			gpp_sqlstr = "select 1 from pro_det where pro_com_serial='"
					+ prodet.getProComSerial() + "'";
		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Hibernate) {

		} else {

		}
		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(gpp_sqlstr);

		try {
			while (rst != null && rst.next()) {
				retboo = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		gppsql.close();
		return retboo;
	}

	/**
	 * 更新数据库信息
	 */
	public boolean updateAction() {
		boolean retboo = false;
		if (this.prodet == null) {
			return false;
		}else if(this.prodet.getProComSerial() == null || this.prodet.getProComSerial() == ""){
			return false;
		}
		String gpp_sqlstr = "";
		String in_sql = "";
		String up_sql = "";

		if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Progress) {

		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Access) {

		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_SQLServer) {
			in_sql = "insert into pro_det (pro_com_serial,pro_com_name,pro_com_object,pro_com_par_serial,pro_serial) values ('"
					+ prodet.getProComSerial()
					+ "','"
					+ prodet.getProComName()
					+ "','"
					+ prodet.getProComObject()
					+ "','"
					+ prodet.getProComParSerial()
					+ "','"
					+ prodet.getProSerial() + "')";
			up_sql = "update pro_det set pro_com_name='"
					+ prodet.getProComName() + "',pro_com_object='"
					+ prodet.getProComObject() + "',pro_com_par_serial='"
					+ prodet.getProComParSerial() + "',pro_serial='"
					+ prodet.getProSerial() + "' where pro_com_serial='"
					+ prodet.getProComSerial() + "'";
		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Hibernate) {

		} else {

		}

		if (this.isHaveProDet()) {
			gpp_sqlstr = up_sql;
		} else {
			gpp_sqlstr = in_sql;
		}

		
		GppSQL gppsql = new GppSQL();
		retboo = gppsql.executesql(gpp_sqlstr);
		gppsql.close();

		return retboo;
	}

	public static void main(String[] args) {
		GlobalParameter.initialize();
		ProDet prodet = new ProDet();
		prodet.setProComSerial("33");
		prodet.setProComName("namee");
		prodet.setProComObject("jttxt");
		prodet.setProComParSerial("11");
		prodet.setProSerial("uuuu");
		

		GppProDet gpd = new GppProDet(prodet);

		// System.out.println(gpm.isHaveProMstr());
		// System.out.println(gpm.isNeedUpdate());
		System.out.println(gpd.updateAction());

	}
}
